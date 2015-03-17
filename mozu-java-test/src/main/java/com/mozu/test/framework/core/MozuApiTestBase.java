package com.mozu.test.framework.core;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.http.HttpStatus;

//import org.junit.Assert.*;










import com.mozu.test.framework.core.*;
import com.mozu.test.framework.datafactory.TenantFactory;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.MozuConfig;
import com.mozu.api.cache.impl.CacheManagerImpl;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.tenant.*;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.RefreshInterval;

public class MozuApiTestBase {
	
    //public static ServiceClientMessageHandler apiMsgHandler;
    public static Tenant testBaseTenant;
    public static Integer tenantId;
    public static Integer masterCatalogId;
    public static Integer catalogId;
    public static Integer siteId;
    public static String email;
    public static String password;
    public static Integer devOwnerId;

    public MozuApiTestBase()
    {
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(Environment.getConfigValue("AppId"));
        appAuthInfo.setSharedSecret(Environment.getConfigValue("SharedSecret"));
        String baseUrl = Environment.getConfigValue("BaseAuthAppUrl");
    	MozuConfig.setBaseUrl(baseUrl);
        try {
            AppAuthenticator.initialize(appAuthInfo, null);
//        	RefreshInterval ri = new RefreshInterval(800, 400);
//            AppAuthenticator.initialize(appAuthInfo, ri);
        } catch (ApiException ae){
        	throw new ApiException("Unable to authenticate application.\n" + ae.getMessage());
        }

    	new CacheManagerImpl<>().startCache();
    	String configStr = Environment.getConfigValue("TenantId");
    	tenantId = Integer.parseInt(configStr);
    	ApiContext apiContext = new MozuApiContext();
    	AppAuthenticator.initialize(appAuthInfo, null);
        try {
			testBaseTenant = TenantFactory.getTenant(apiContext, tenantId, HttpStatus.SC_OK, HttpStatus.SC_OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	configStr = Environment.getConfigValue("MasterCatalogId");
    	if (StringUtils.isNotBlank(configStr))
    		masterCatalogId = Integer.parseInt(configStr);
    	else
    		masterCatalogId = testBaseTenant.getMasterCatalogs().get(0).getId();
    	configStr = Environment.getConfigValue("CatalogId");
    	if (StringUtils.isNotBlank(configStr))
    		catalogId = Integer.parseInt(configStr);
    	else
    		catalogId = testBaseTenant.getMasterCatalogs().get(0).getCatalogs().get(0).getId();
    	configStr = Environment.getConfigValue("SiteId");
    	if (StringUtils.isNotBlank(configStr))
    		siteId = Integer.parseInt(configStr);
    	else
    		siteId = testBaseTenant.getSites().get(0).getId();
    	email = Environment.getConfigValue("devOwnerEmail");
    	password = Environment.getConfigValue("devOwnerPassword");
    	configStr = Environment.getConfigValue("devOwnerId");
    	devOwnerId = Integer.parseInt(configStr);
    }
    
}
