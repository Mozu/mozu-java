package com.mozu.apptest.handlers;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.resources.platform.TenantDataResource;
import com.mozu.api.utils.JsonUtils;
import com.mozu.apptest.model.Setting;
import com.mozu.base.utils.ApplicationUtils;

/**
 * Manage the Kount configuration setting in the database
 * 
 * @author john_gatti
 *
 */
@Component
public class ConfigHandler {
    private static final Logger logger = LoggerFactory.getLogger(ConfigHandler.class);
    private ObjectMapper mapper = JsonUtils.initObjectMapper();
    private final String TENANT_DB_ENTRY = "mozu-kount-settings";

    public ConfigHandler() { 
    }

    /**
     * Get the Kount settings for the tenant
     * @param tenantId id of the tenant
     * @param contextPath context path of the request
     * @param serverPort port of the server
     * @param serverName server name
     * @return settings data
     * @throws Exception
     */
    public Setting getSettings(int tenantId, String serverName, int serverPort, String contextPath) throws Exception {
        Setting settings = getTenantSetting(tenantId);
        if (settings==null) {
            settings = new Setting();
        }
        return settings;
    }

    /**
     * Get the Kount settings for the tenant
     * @param tenantId id of the tenant
     * @param contextPath context path of the request
     * @param serverPort port of the server
     * @param serverName server name
     * @return settings data
     * @throws Exception
     */
    public Setting getSettings(int tenantId) throws Exception {
        return getTenantSetting(tenantId);
    }

    /**
     * Get the Kount setting for the tenant
     * 
     * @param tenantId tenant id
     * @return settings data
     * @throws Exception
     */
    public Setting getTenantSetting(Integer tenantId) throws Exception {
        MozuApiContext apiContext = new MozuApiContext(tenantId);
        TenantDataResource tenantData = new TenantDataResource(apiContext);
        
        return getSettings(tenantId, tenantData);
    }

    private Setting getSettings(Integer tenantId, TenantDataResource tenantData) throws Exception {
        Setting setting = null;
        String settingStr = "";
        try {
            settingStr = tenantData.getDBValue(TENANT_DB_ENTRY);
        } catch(ApiException exc) {
            logger.info("Tenant DB Settings not found for "+tenantId.toString());
        }
        
        logger.debug("Settings: " + settingStr);
        
        if (!StringUtils.isBlank(settingStr)) {
            setting = mapper.readValue(settingStr, Setting.class);
        }
        
        return setting;
    }

    /**
     * Save Kount configuration settings for the tenant
     * 
     * @param tenantId tenant id
     * @param setting the populated settings data
     * @throws Exception
     */
    public void saveSettings(Integer tenantId, Setting setting) throws Exception {
        
        logger.debug("Saving settings into MZDB for "+tenantId);
        MozuApiContext apiContext = new MozuApiContext(tenantId);
        TenantDataResource tenantData = new TenantDataResource(apiContext);

        Setting currentSetting = getSettings(tenantId, tenantData);
        
        // Save merchant id
        String value = "'"+mapper.writeValueAsString(setting)+"'";
        logger.debug(value);
        if (currentSetting != null) {
            try {
                tenantData.updateDBValue(value, TENANT_DB_ENTRY);
            } catch (Exception e) {
                if (e instanceof ApiException) {
                    ApiError apiError = ((ApiException)e).getApiError();
                    logger.warn("Exception updating application settings:" + 
                            " App name: " + ((apiError.getApplicationName()!=null)?apiError.getApplicationName():"") +
                            " Correlation ID: " + ((apiError.getCorrelationId()!=null)?apiError.getCorrelationId():"") + 
                            " Error Code " + apiError.getErrorCode() + 
                            " Message: " + ((apiError.getExceptionDetail().getMessage()!=null)?
                            		apiError.getExceptionDetail().getMessage():"")
                            );
                }
                throw e;
            }
        } else {
            try {
                tenantData.createDBValue(value, TENANT_DB_ENTRY);
            } catch (Exception e) {
                if (e instanceof ApiException) {
                    ApiError apiError = ((ApiException)e).getApiError();
                    logger.warn("Exception creating application settings:" + 
                            " App name: " + ((apiError.getApplicationName()!=null)?apiError.getApplicationName():"") +
                            " Correlation ID: " + ((apiError.getCorrelationId()!=null)?apiError.getCorrelationId():"") + 
                            " Error Code " + apiError.getErrorCode() + 
                            " Message: " + ((apiError.getExceptionDetail().getMessage()!=null)?
                            		apiError.getExceptionDetail().getMessage():"")
                            );
                }
                throw e;
            }
        }
       
        try {
            ApplicationUtils.setApplicationToInitialized(apiContext);
        } catch (Exception e) {
            logger.warn(e.getMessage());
            throw e;
        }
    }
}
