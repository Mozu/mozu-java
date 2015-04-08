package com.mozu.test;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.utils.MozuHttpClientPool;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.EntityFactory;
import com.mozu.test.framework.datafactory.EntityListFactory;

public class EntityTests extends MozuApiTestBase {
	
	private static ApiContext apiContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		MozuHttpClientPool.getInstance().shutdown();
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private class MyClass
	{
		protected DateTime item1;
		public DateTime getItem1() {
			return this.item1;
		}

		public void setItem1(DateTime date) {
			this.item1 = date;
		}

		protected DateTime item2;
		public DateTime getItem2() {
			return this.item2;
		}

		public void setItem2(DateTime date) {
			this.item2 = date;
		}
	}
	
	@Test
	public void EntityTest1() throws Exception {
        String appId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();        
		String mozuNamespace = appId.substring(0, appId.indexOf('.'));
		EntityList list = com.mozu.test.framework.helper.EntityGenerator.generateEntityList(mozuNamespace, "item1", "item2");
        EntityList existing = null;        
        String entityListName = list.getName();
        try{
            existing = EntityListFactory.getEntityList(apiContext, entityListName, HttpStatus.SC_OK, HttpStatus.SC_OK);
        } 
        catch(Exception ae) {
        }
        if (existing==null)
        	EntityListFactory.createEntityList(apiContext, list, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        else
        	EntityListFactory.updateEntityList(apiContext, list, entityListName, HttpStatus.SC_OK, HttpStatus.SC_OK);
        
        com.fasterxml.jackson.databind.ObjectMapper  mapper =  new com.fasterxml.jackson.databind.ObjectMapper();
        MyClass sampleObject = new MyClass();
        sampleObject.setItem1(DateTime.now().minusDays(2));
        sampleObject.setItem2(DateTime.now());
        JsonNode json= mapper.valueToTree(sampleObject);
        String idMapName = entityListName + "@" + mozuNamespace;
        EntityFactory.insertEntity(apiContext, json, idMapName, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void EntityTest2() throws Exception {
        String appId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();        
		String mozuNamespace = appId.substring(0, appId.indexOf('.'));
		EntityList list = com.mozu.test.framework.helper.EntityGenerator.generateEntityList(mozuNamespace, "item1", "item2");
        EntityList existing = null;        
        String entityListName = list.getName();
        try{
            existing = EntityListFactory.getEntityList(apiContext, entityListName, HttpStatus.SC_OK, HttpStatus.SC_OK);
        } 
        catch(Exception ae) {
        }
        if (existing==null)
        	EntityListFactory.createEntityList(apiContext, list, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        else
        	EntityListFactory.updateEntityList(apiContext, list, entityListName, HttpStatus.SC_OK, HttpStatus.SC_OK);
        
        com.fasterxml.jackson.databind.ObjectMapper  mapper =  new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.registerModule(new JodaModule());
        mapper.configure(com.fasterxml.jackson.databind.SerializationFeature.
        		WRITE_DATES_AS_TIMESTAMPS , false);
        MyClass sampleObject = new MyClass();
        sampleObject.setItem1(DateTime.now().minusDays(2));
        sampleObject.setItem2(DateTime.now());
        JsonNode json= mapper.valueToTree(sampleObject);
        String idMapName = entityListName + "@" + mozuNamespace;
        EntityFactory.insertEntity(apiContext, json, idMapName, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

}