package com.mozu.base.handlers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.SiteDataResource;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.utils.JsonUtils;


public class TenantHandler {
	private static final Logger logger = LoggerFactory.getLogger(TenantHandler.class);
	private static ObjectMapper mapper = JsonUtils.initObjectMapper();

	public static Tenant getTenant(int tenantId) throws Exception {
		TenantResource tenantResource = new TenantResource();
		Tenant tenant = tenantResource.getTenant(tenantId);
		return tenant;
	}
	
	public static <T> List<T> getSiteSettings(Tenant tenant, String siteDbEntry, Class<T> clazz) throws Exception {
		List<T> siteSettings = new ArrayList<T>();
		
		for(Site site : tenant.getSites() ) {
			T setting = getSiteSetting(tenant, site.getId(), siteDbEntry, clazz);
			siteSettings.add(setting);
		}
		return siteSettings;
	}
	
    public static <T> T getSiteSetting(Tenant tenant, Integer siteId, String siteDbEntry, Class<T> clazz) throws Exception {
        return getSiteSetting(tenant.getId(), siteId, siteDbEntry, clazz);
    }
    
	public static <T> T getSiteSetting(Integer tenant, Integer siteId, String siteDbEntry, Class<T> clazz) throws Exception {
		MozuApiContext apiContext = new MozuApiContext(tenant, siteId);
		SiteDataResource siteData = new SiteDataResource(apiContext);
		String settingStr = "";
		T setting = clazz.newInstance();
		try {
			settingStr = siteData.getDBValue(siteDbEntry);
		} catch(ApiException exc) {
			if (!StringUtils.equals(exc.getApiError().getErrorCode(),"ITEM_NOT_FOUND"))
					throw exc;
		}
		
		if (!StringUtils.isBlank(settingStr)) {
            setting = mapper.readValue(settingStr, clazz);
		} else {
			setting = clazz.newInstance();
		}
		
		return setting;
	}
	
	public static <T> void saveSiteSettings(int tenantId, int siteId, String siteDbEntry, List<T> settings) throws Exception {
	    MozuApiContext apiContext = null;
		for(T setting : settings) {
			apiContext = new MozuApiContext(tenantId, siteId);
			SiteDataResource siteData = new SiteDataResource(apiContext);
			
			String value = "'"+new ObjectMapper().writeValueAsString(setting)+"'";
			boolean update = true;
			
			logger.info(value);
			if (update)
				siteData.updateDBValue(value, siteDbEntry);
			else
				siteData.createDBValue(value, siteDbEntry);
		}
	}
}
