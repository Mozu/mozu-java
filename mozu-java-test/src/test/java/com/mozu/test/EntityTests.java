package com.mozu.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.api.resources.platform.entitylists.EntityResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.helper.EntityGenerator;
import com.mozu.test.framework.helper.Generator;

public class EntityTests extends MozuApiTestBase {
	
	private static ApiContext apiContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void EntityTest1() throws Exception {
        String appId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();        
		String mozuNamespace = appId.substring(0, appId.indexOf('.'));
		EntityList list = com.mozu.test.framework.helper.EntityGenerator.generateEntityList(mozuNamespace);
        EntityListResource entityListResource = new EntityListResource(new MozuApiContext(tenantId));
        EntityList existing = null;        
        String entityListName = list.getName();
        try{
            existing = entityListResource.getEntityList(entityListName);
        } catch(ApiException ae) {
            if (!StringUtils.equals(ae.getApiError().getErrorCode(),"ITEM_NOT_FOUND"))
                throw ae;
        }
        EntityList createdList;
        if (existing==null)
        	createdList = entityListResource.createEntityList(list);
        else
        	createdList = entityListResource.updateEntityList(list, entityListName);
        
        EntityResource entityResource = new EntityResource(apiContext);
        JsonNodeFactory nodeFactory = new JsonNodeFactory(false);        
        ObjectNode idMap = nodeFactory.objectNode();
        String typeIdProperty = list.getIdProperty().getPropertyName();
        String typeIndexA = list.getIndexA().getPropertyName();
//        idMap.put(typeIdProperty, new Date().getTime());
//        idMap.put(typeIndexA, new Date().getTime());
        idMap.put(typeIdProperty, new Date().toString());
        idMap.put(typeIndexA, new Date().toString());

        String idMapName = entityListName + "@" + mozuNamespace;

        entityResource.insertEntity(idMap, idMapName);


	}
}