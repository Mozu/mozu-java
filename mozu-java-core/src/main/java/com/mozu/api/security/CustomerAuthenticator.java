package com.mozu.api.security;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;

public class CustomerAuthenticator {
    
    public static AuthTicket ensureAuthTicket(AuthTicket authTicket, Integer tenantId, Integer siteId) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()).minus(180000);
        if (accessTokenDateTime.isBeforeNow())
            return refreshUserAuthTicket(authTicket, tenantId, siteId).getAuthTicket();

        return null;
    }

    public static CustomerAuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket, Integer tenantId, Integer siteId)
            throws ApiException {

        String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.refreshUserAuthTicketUrl(authTicket.getRefreshToken(), null).getUrl();

        CustomerAuthTicket customerAuthTicket;
        
        if (tenantId == null || siteId == null) {
            throw new ApiException("A tenant ID and site ID must be supplied to refresh a Customer Authentication Token");
        }
        try {
            @SuppressWarnings("unchecked")
            MozuClient<CustomerAuthTicket> client = (MozuClient<CustomerAuthTicket>) MozuClientFactory.getInstance(CustomerAuthTicket.class);
            Map<String, String> headers = new HashMap<String, String>();
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            headers.put(Headers.X_VOL_SITE, siteId.toString());
            customerAuthTicket = client.executePutRequest(authTicket, resourceUrl.toString(), headers);
        } catch (Exception ioe) {
            throw new ApiException("Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }

        CustomerAuthenticationProfile userInfo = setUserAuth(customerAuthTicket, null);

        return userInfo;
    }
    
    public static CustomerAuthenticationProfile authenticate(CustomerUserAuthInfo userAuthInfo,  Integer tenantId, Integer siteId) {

        String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.createUserAuthTicketUrl(null).getUrl(); // AuthTicketUrl.AuthenticateAppUrl();

        CustomerAuthTicket customerAuthTicket;
        try {
            @SuppressWarnings("unchecked")
            MozuClient<CustomerAuthTicket> client = (MozuClient<CustomerAuthTicket>) MozuClientFactory.getInstance(CustomerAuthTicket.class);
            Map<String, String> headers = new HashMap<String, String>();
            headers.put(Headers.X_VOL_APP_CLAIMS, AppAuthenticator.addAuthHeader());
            headers.put(Headers.X_VOL_SITE, siteId.toString());
            customerAuthTicket = client.executePostRequest(userAuthInfo, resourceUrl.toString(), headers);
        } catch (Exception ioe) {
            throw new ApiException("Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }

        return setUserAuth(customerAuthTicket, siteId);
    }
    
    private static CustomerAuthenticationProfile setUserAuth(CustomerAuthTicket customerAuthTicket, Integer siteId) {
         AuthTicket authTicket = new AuthTicket(
                customerAuthTicket.getAccessToken(), customerAuthTicket.getAccessTokenExpiration(),
                customerAuthTicket.getRefreshToken(), 
                        customerAuthTicket.getRefreshTokenExpiration(),
                AuthenticationScope.Customer);
        CustomerAuthenticationProfile authenticationProfile = new CustomerAuthenticationProfile();
        authenticationProfile.setAuthTicket(authTicket);
        authenticationProfile.setCustomerAccount(customerAuthTicket.getCustomerAccount());
        
        authenticationProfile.getAuthTicket().setSiteId(siteId);
        
        return authenticationProfile;
    }

    private static String getTenantDomain (Integer tenantId) {
        TenantResource tenantResource = new TenantResource();
        Tenant tenant = null;
        try {
            tenant = tenantResource.getTenant(tenantId);
        } catch (Exception exception ) {
            throw new ApiException("Exception occurred getting tenant: " + exception.getMessage());
        }

        if (tenant == null)
            throw new ApiException("Tenant " + tenantId + " Not found");

        return HttpHelper.getUrl(tenant.getDomain());
    }

}
