package com.mozu.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.sitesettings.application.Application;
import com.mozu.api.contracts.sitesettings.application.Capability;
import com.mozu.api.resources.commerce.settings.ApplicationResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.base.models.AppInfo;

public class ApplicationUtils {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationUtils.class);
    
    public static AppInfo getAppInfo() {
    	String applicationId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();
    	 String[] parts = applicationId.split( "\\." );

         if (parts.length < 4) return null;

         AppInfo appInfo = new AppInfo();
         
         appInfo.setNameSpace(parts[0]);
         appInfo.setPackage(parts[parts.length - 1]);
         
         return appInfo;
    }
    
    public static boolean isAppEnabled(int tenantId) {
        boolean isEnabled = false;
        
        ApiContext apiContext = new MozuApiContext(tenantId);

        logger.debug("Check if app is enabled for tenant ID " + apiContext.getTenantId());

        ApplicationResource appResource = new ApplicationResource(apiContext);
        try {
            Application app = appResource.thirdPartyGetApplication();
            isEnabled = app.getEnabled();

            logger.debug("App is " + (isEnabled?"Enabled":"Disabled") + " App ID: " + app.getAppId());
        } catch (Exception e) {
            logger.warn("Unable to get application information: " + e.getMessage());
        }
        
        return isEnabled;
    }
    
    public static final Application setApplicationToInitialized(ApiContext apiContext) throws Exception {
        ApplicationResource appResource = new ApplicationResource(apiContext);
        Application application = getApplication(appResource);

        // Set the app to initialized
        application.setInitialized(true);
        
        try {
            appResource.thirdPartyUpdateApplication(application);
            logger.debug("Application updated");
        } catch (Exception e) {
            logger.warn("Exception updating application: " + e.getMessage());
            throw new Exception("Exception updating application: " + e.getMessage());
        }
        return application;
    }
    
    public static final void setCapabilityToInitialized(ApiContext apiContext, String capabilityName) throws Exception {
        
        ApplicationResource appResource = new ApplicationResource(apiContext);
        Application application = getApplication(appResource);

        // Set the app to initialized
        application.setInitialized(true);
        
        // Set the ValidateOrder capability to initialized
        for (Capability capability: application.getCapabilities()) {
            if (capability.getCapabilityType().equals(capabilityName)) {
                capability.setInitialized(true);
            }
        }
        
        try {
            appResource.thirdPartyUpdateApplication(application);
            logger.debug("Application updated");
        } catch (Exception e) {
            logger.warn("Exception updating application: " + e.getMessage());
            throw new Exception("Exception updating application: " + e.getMessage());
        }
    }
    
    public static final Application getApplication(ApplicationResource appResource) throws Exception {
        String errorMsg = null;
        
        // get the application information
        Application application = null;
        try {
            application = appResource.thirdPartyGetApplication();
            logger.debug("Application retrieved");
        } catch (Exception e) {
            errorMsg = "Exception getting application information: ";
            if (e instanceof ApiException) {
                ApiError apiError = ((ApiException)e).getApiError();
                if (apiError!=null) {
                    errorMsg = errorMsg +
                          " App name: " + apiError.getApplicationName() +
                          " Correlation ID: " + apiError.getCorrelationId() + 
                          " Error Code " + apiError.getErrorCode() + 
                          " Message: " + apiError.getMessage();
                } else {
                    errorMsg = errorMsg.concat(" ").concat(e.getMessage());
                }
            } else {
                errorMsg = errorMsg.concat(" ").concat(e.getMessage());
            }
            logger.debug(errorMsg);
            throw new Exception(errorMsg);
        }
        return application;
    }
}
