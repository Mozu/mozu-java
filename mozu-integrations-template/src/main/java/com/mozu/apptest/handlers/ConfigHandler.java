package com.mozu.apptest.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.apptest.model.Constants;
import com.mozu.apptest.model.Setting;
import com.mozu.base.handlers.EntityHandler;
import com.mozu.base.handlers.EntitySchemaHandler;
import com.mozu.base.models.EntityDataTypes;
import com.mozu.base.models.EntityScope;

/**
 * Manage the configuration setting in the Entity API
 * 
 * @author john_gatti
 *
 */
@Component
public class ConfigHandler {
    private static final Logger logger = LoggerFactory.getLogger(ConfigHandler.class);

    @Autowired
    EntitySchemaHandler entitySchemaHandler;
    
    EntityHandler<Setting> entityHandler;
    
    public ConfigHandler() { 
    	entityHandler = new EntityHandler<Setting>(Setting.class);
    }

    /**
     * Get App Settings for the tenant
     * 
     * @param tenantId
     * @return Setting
     * @throws Exception
     */
    public Setting getSettings(Integer tenantId) throws Exception {
        Setting setting = null;
        try {
            setting = entityHandler.getEntity(tenantId, Constants.SETTINGS, tenantId.toString());
        } catch(Exception exc) {
            logger.error(exc.getMessage(), exc);
            throw exc;
        }
        
        return setting;
    }

    /**
     * Save settings for the tenant
     * 
     * @param tenantId tenant id
     * @param setting the populated settings data
     * @throws Exception
     */
    public void saveSettings(Integer tenantId, Setting setting) throws Exception {
        
        logger.debug("Saving settings into MZDB for "+tenantId);
        MozuApiContext apiContext = new MozuApiContext(tenantId);
       
        setting.setId(tenantId);
        
        try {
        	entityHandler.upsertEntity(tenantId, Constants.SETTINGS, tenantId.toString(), setting);
        } catch (Exception e) {
        	 logger.error(e.getMessage(), e);
             throw e;
        }

    }


    /**
     * Install Schema with indexed properties for storing the app settings
     * @param tenantId
     * @throws Exception
     */
    public void installSchema(Integer tenantId) throws Exception {
    	EntityList entityList = new EntityList();
    	entityList.setName(Constants.SETTINGS);
    	entityList.setIsLocaleSpecific(false);
    	entityList.setIsSandboxDataCloningSupported(false);
    	entityList.setIsShopperSpecific(false);
    	entityList.setIsVisibleInStorefront(false);
    	
    	ApiContext apiContext = new MozuApiContext(tenantId);
    	IndexedProperty idProperty = entitySchemaHandler.getIndexedProperty("id", EntityDataTypes.Integer);
    	
    	entitySchemaHandler.installSchema(apiContext, entityList, EntityScope.Tenant, idProperty, null);
    	
    }
}
