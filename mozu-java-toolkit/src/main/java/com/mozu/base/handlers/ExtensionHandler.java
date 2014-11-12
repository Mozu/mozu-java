package com.mozu.base.handlers;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.cache.CacheManager;
import com.mozu.api.cache.CacheManagerFactory;
import com.mozu.api.contracts.mzdb.EntityContainer;
import com.mozu.api.contracts.mzdb.EntityContainerCollection;
import com.mozu.api.contracts.sitesettings.application.Application;
import com.mozu.api.resources.commerce.settings.ApplicationResource;
import com.mozu.api.resources.platform.entitylists.EntityContainerResource;
import com.mozu.api.resources.platform.entitylists.EntityResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.utils.JsonUtils;
import com.mozu.base.models.ExtensionParent;
import com.mozu.base.models.SubnavLink;

@Component
public class ExtensionHandler {

	private static ObjectMapper mapper = JsonUtils.initObjectMapper();
	private String ENTITYNAME = "subnavlinks@mozu";

	
	public void upsertSubNavLink(Integer tenantId, ExtensionParent parent, String href, String windowTitle, String[] path ) throws Exception {
		SubnavLink subNavLink = new SubnavLink();
		subNavLink.setHref(href);
		subNavLink.setPath(path);
		subNavLink.setWindowTitle(windowTitle);
		subNavLink.setParentId(parent);
		upsertSubNavLink(tenantId, subNavLink);
	}
	
	public void upsertSubNavLink(Integer tenantId, SubnavLink subNavLink) throws Exception {
		boolean updated = false;
		
		ApiContext apiContext = new MozuApiContext(tenantId);
		
		Application application = null;
		String cacheKey = "application"+AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();
		CacheManager<Application> cache = (CacheManager<Application>) CacheManagerFactory.getCacheManager();
		if (cache != null) {
			application = cache.get(cacheKey);
			
		}
		if (application == null ) {
			ApplicationResource applicationResource = new ApplicationResource(apiContext);
			application = applicationResource.thirdPartyGetApplication();
			if (cache!=null)
				cache.put(cacheKey, application);
		}
		
		subNavLink.setAppId(application.getAppId());
		EntityContainerResource entityContainerResource = new EntityContainerResource(apiContext);
		EntityResource entityResource = new EntityResource(apiContext);
		
		EntityContainerCollection collection = entityContainerResource.getEntityContainers(ENTITYNAME,200,null,null,null,null);
	
		if (subNavLink.getParentId() == null || StringUtils.isEmpty(subNavLink.getHref()))
			throw new Exception("ParentId or Href is required to create Extension Link");
		
		
		for(EntityContainer container: collection.getItems()) {
			String id = container.getId();
			SubnavLink link = mapper.readValue(container.getItem().toString(), SubnavLink.class);
			if (Arrays.equals(link.getPath(), subNavLink.getPath())) {
				JsonNode node = mapper.valueToTree(subNavLink);
				entityResource.updateEntity(node, ENTITYNAME, id);	
				updated = true;
			} 
		}
		
		if (!updated) {
			JsonNode node = mapper.valueToTree(subNavLink);
			entityResource.insertEntity(node, ENTITYNAME);
		}
	}
}
