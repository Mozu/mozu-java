package com.mozu.base.handlers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.base.models.AppInfo;
import com.mozu.base.models.EntityDataTypes;
import com.mozu.base.models.EntityScope;
import com.mozu.base.utils.ApplicationUtils;

@Component
public class EntitySchemaHandler {
	
	
	public EntityList getEntityList(ApiContext apiContext, String entityName) throws Exception {
		return getEntityList(apiContext, entityName, null);
	}
	
	public EntityList getEntityList(ApiContext apiContext, String entityName, String namespace) throws Exception {
		 EntityListResource entityListResource = new EntityListResource(apiContext);
		 EntityList entityList = null;
        try {
            entityList = entityListResource.getEntityList(getEntityListNameFQN(entityName, namespace));
        } catch (ApiException ae) {
            if (!StringUtils.equals(ae.getApiError().getErrorCode(), "ITEM_NOT_FOUND"))
                throw ae;
        }
        return entityList;
	}
	
	
	public EntityList installSchema(ApiContext apiContext, EntityList entityList, EntityScope scope, 
			List<IndexedProperty> indexedProperties) throws Exception {
		return installSchema(apiContext, entityList, scope, null, indexedProperties);
	}
	
	public EntityList installSchema(ApiContext apiContext, EntityList entityList, EntityScope scope,IndexedProperty idProperty, 
			List<IndexedProperty> indexedProperties) throws Exception {
		
		if (indexedProperties != null && indexedProperties.size() > 4) throw new Exception("Only 4 indexed properties are supported");
		if (StringUtils.isEmpty(entityList.getName())) throw new Exception("Entity Name cannot be null or empty");
		
		AppInfo appInfo = ApplicationUtils.getAppInfo();
		entityList.setContextLevel(scope.toString());
		if (StringUtils.isEmpty(entityList.getNameSpace())) entityList.setNameSpace(appInfo.getNameSpace());
		
		String entityFqn = getEntityListNameFQN(entityList.getName(), entityList.getNameSpace());
		if (idProperty == null) entityList.setUseSystemAssignedId(true);
		else entityList.setIdProperty(idProperty);
		
		if (indexedProperties != null) { 
			entityList.setIndexA(indexedProperties.size() >=1 ? indexedProperties.get(0) : null);
			entityList.setIndexB(indexedProperties.size() >=2 ? indexedProperties.get(1) : null);
			entityList.setIndexC(indexedProperties.size() >=3 ? indexedProperties.get(2) : null);
			entityList.setIndexB(indexedProperties.size() >=4 ? indexedProperties.get(3) : null);
		}
		
		EntityList existing = getEntityList(apiContext, entityList.getName());
		EntityListResource entityListResource = new EntityListResource(apiContext);
		
		entityList = existing == null ?
			entityListResource.createEntityList(entityList) :
				entityListResource.updateEntityList(entityList, entityFqn);
		return entityList;
	}
	
	public IndexedProperty getIndexedProperty(String name, EntityDataTypes type) {
        IndexedProperty property = new IndexedProperty();
        property.setPropertyName(name);
        property.setDataType(type.toString());

        return property;
    }
	
	private String getEntityListNameFQN(String listName, String namespace) {
		if (StringUtils.isEmpty(namespace)) {
			AppInfo appInfo = ApplicationUtils.getAppInfo();
			namespace = appInfo.getNameSpace();
		}
		return listName+"@"+namespace;
	}
}
