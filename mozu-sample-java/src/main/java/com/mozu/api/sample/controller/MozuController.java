package com.mozu.api.sample.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.MozuConfig;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.commerceruntime.orders.OrderCollection;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.productadmin.ProductCollection;
import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.OrderResource;
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.sample.model.MozuAuthorization;
import com.mozu.api.sample.model.SiteSelector;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.Scope;
import com.mozu.api.security.UserAuthenticator;
/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes ("tenantAuthorization")
/**
 * Spring MVC Controller for the Mozu Sample Web Application for Java API
 * @author bob_hewett
 *
 */
public class MozuController {
    
	private static final Logger logger = LoggerFactory.getLogger(MozuController.class);
	

	@Resource (name="environments")
	protected Map<String, String> environments;
	
	public MozuController () {
	    
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		this.setupHomePage(locale, model);
		return "home";
	}
	
    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    /**
     * Authorizes the application with the AppID and Shared Secret.  Authenticates the tenant user supplied.  
     * @param authorization login auth form data
     * @param locale 
     * @param model
     * @return
     */
    public String authorize (@ModelAttribute MozuAuthorization authorization, Locale locale, Model model) {
        
        // Authorize Application
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(authorization.getAppId());
        appAuthInfo.setSharedSecret(authorization.getSharedSecret());
        String baseUrl = environments.get(authorization.getEnvironment());
        try {
            MozuConfig.setBaseUrl(baseUrl);
            AppAuthenticator.initialize(appAuthInfo, null);
        } catch (ApiException ae){
            model.addAttribute("errorString", "Error Validating Application: " + ae.getMessage());
            setupHomePage (locale, model);
            logger.error("Unable to authenticate application");
            return "home";
        }
        
        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(authorization.getEmail());
        userAuth.setPassword(authorization.getPassword());
        try {
            // Authorize user
            AuthenticationProfile authProfile = UserAuthenticator.authenticate(userAuth, AuthenticationScope.Tenant);
            // get list of tenants a user has access to 
            List<Scope> tenants = authProfile.getAuthorizedScopes();
            List<Site> sites = null;
           // if there is only only one tenant, the user is assigned to that tenant...no need to have them select on.
            if (tenants != null && tenants.size() > 0) {
                // find first tenant that we have access to.
                for (Scope tenant : tenants) {
                    Integer tenantId = tenant.getId();
                    try {
                        sites = getAvailableTenantSites(tenantId);
                        // you must refresh the auth ticket with a valid tenant id...for this sample, we pick the first one and refresh the auth.
                        // if there is only one tenant, it doesn't need to be refreshed as the active scope will be set with the tenant ID.
                        if (authProfile.getActiveScope() == null) {
                            authProfile = UserAuthenticator.refreshUserAuthTicket(authProfile.getAuthTicket(), tenantId);
                        }
                        break;
                    } catch (ApiException ae) {
                        logger.info ("Application ID cannot access tenant" + tenantId + ": " + ae.getMessage());
                    }   
                }
            } else {
                sites = new ArrayList<Site>();
            }
            model.addAttribute("tenantAuthorization", authProfile);
            model.addAttribute("user", authProfile.getUserProfile());
            model.addAttribute("availableTenants", tenants);
            model.addAttribute("sites", sites);

        } catch (ApiException ae) {
            setupHomePage (locale, model);
            model.addAttribute("errorString", "Error Validating User: " + ae.getMessage());
            return "home";
        }
                
        return "tenants";
    }
    
    /**
     * This method is used when the application and user have been authorized  
     * @param tenantId
     * @param locale
     * @param modelMap
     * @param model
     * @return
     */
    @RequestMapping(value = "/tenants", method = RequestMethod.GET)
    public String getTenants(@RequestParam ("tenantId") Integer tenantId, Locale locale, ModelMap modelMap, Model model) {
        
        AuthenticationProfile authenticationProfile = (AuthenticationProfile)modelMap.get("tenantAuthorization");
        //if there is no active user, go to the auth page.
        if (authenticationProfile == null) {
            setupHomePage (locale, model);
            return "home";

        }

        // if no tenant id was supplied just use the active tenantID in the user auth.
        if (tenantId == null) {
            tenantId = authenticationProfile.getActiveScope().getId();
        }
        
        // we need to get a new auth ticket for the tenant and update the authenticationProfile in session.
        if (tenantId != null && !tenantId.equals(authenticationProfile.getActiveScope().getId())) {
            authenticationProfile = UserAuthenticator.refreshUserAuthTicket(authenticationProfile.getAuthTicket(), tenantId);
            model.addAttribute("tenantAuthorization", authenticationProfile);
        }
        
        // Authorize user and get tenants
        List<Scope> tenants = authenticationProfile.getAuthorizedScopes();
        if (tenants == null) {
            tenants = new ArrayList<Scope>();
            tenants.add(authenticationProfile.getActiveScope());    
        }
        
        
        model.addAttribute("user", authenticationProfile.getUserProfile());
        model.addAttribute("availableTenants", tenants);
        model.addAttribute("tenantId", tenantId);
        List<Site> sites = null;
        if (tenants != null && tenants.size() > 0) {
            sites = getAvailableTenantSites(tenantId);
        } else {
            sites = new ArrayList<Site>();
        }
        model.addAttribute("sites", sites);
                
        return "tenants";
    }
 
    
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String getProducts (@ModelAttribute SiteSelector siteSelector, Locale locale, ModelMap modelMap, Model model) 
        throws Exception {
        
        AuthenticationProfile userAuthentication = (AuthenticationProfile)modelMap.get("tenantAuthorization");
        //if there is no active user, go to the auth page.
        if (userAuthentication == null) {
            setupHomePage (locale, model);
            return "home";
        }
        Integer tenantId = Integer.valueOf(siteSelector.getTenant());
        
        ApiContext apiContext = new MozuApiContext(tenantId, Integer.valueOf(siteSelector.getSite())); 
        apiContext.setUserAuthTicket(userAuthentication.getAuthTicket());    
        ProductResource prodResource = new ProductResource (apiContext);

        try {
            ProductCollection prodCollection = prodResource.getProducts(0, 100, null, null, null, null, false, null);
            modelMap.addAttribute("products", prodCollection.getItems());
            
            return "products";
        } catch (Exception ae) {
            model.addAttribute("errorString", "Unable to get products: " + ae.getMessage());
            return getTenants(tenantId, locale, modelMap, model);
        }

    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String getOrders (@ModelAttribute SiteSelector siteSelector, Locale locale, ModelMap modelMap, Model model) 
        throws Exception {
        
        AuthenticationProfile userAuthentication = (AuthenticationProfile)modelMap.get("tenantAuthorization");
        //if there is no active user, go to the auth page.
        if (userAuthentication == null) {
            setupHomePage (locale, model);
            return "home";
        }
        
        Integer tenantId = Integer.valueOf(siteSelector.getTenant());

        ApiContext apiContext = new MozuApiContext(tenantId, Integer.valueOf(siteSelector.getSite())); 
        apiContext.setUserAuthTicket(userAuthentication.getAuthTicket());
        
        OrderResource orderResourceResource = new OrderResource(apiContext);
        try {
            OrderCollection orderCollection = orderResourceResource.getOrders(0, 100, null, null, null, null, null);
    
            model.addAttribute("orders", orderCollection.getItems());
        
            return "orders";
        } catch (Exception ae) {
            model.addAttribute("errorString", "Unable to get products: " + ae.getMessage());
            return getTenants(tenantId, locale, modelMap, model);
        }

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout (Locale locale, ModelMap modelMap, Model model) { 
        AuthenticationProfile userAuthentication = (AuthenticationProfile)modelMap.get("tenantAuthorization");
        UserAuthenticator.logout(userAuthentication.getAuthTicket());
        AppAuthenticator.invalidateAuth();
        modelMap.remove("tenantAuthorization");
        return home(locale, model);
    }

    
    private void setupHomePage (Locale locale,Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);
        
        model.addAttribute("serverTime", formattedDate );
        model.addAttribute("environments", environments.keySet());

    }
    
    private List<Site> getAvailableTenantSites(Integer tenantId) {
        TenantResource  tenantResource = new TenantResource();
       
        try {
            Tenant tenant = tenantResource.getTenant(tenantId);
            return tenant.getSites();
        } catch (Exception e) {
            throw new ApiException("Unable to get tenant: " + e.getMessage());
        }
    }
}
