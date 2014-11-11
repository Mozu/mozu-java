package com.mozu.base.handlers;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.base.models.AppInfo;
import com.mozu.base.models.ExtensionParent;
import com.mozu.base.models.Contact;
import com.mozu.base.utils.ApplicationUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/servlet-context.xml" })
public class EntityHandlerTest {

	Integer tenantId = 0;
	
	private String LISTNAME = "contacts";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tenantId = 10236;
		installSchema();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void upsertEntityTest() {
		try {
			
			EntityHandler<Contact> entityHandler = new EntityHandler<Contact>();
			
			Contact contact = new Contact();
			
			contact.setId(1);
			contact.setFirstName("Foo");
			contact.setLastName("Bar");
			Contact c = entityHandler.upsertEntity(tenantId, LISTNAME, contact.getId().toString(), contact, Contact.class);
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getId(), contact.getId());
			
			
			contact.setLastName("Bar1");
			c = entityHandler.upsertEntity(tenantId, LISTNAME, contact.getId().toString(), contact, Contact.class);
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getId(), contact.getId());
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}

	@Test
	public void getEntityTest() {
		try {
			EntityHandler<Contact> entityHandler = new EntityHandler<Contact>();
			Contact contact = entityHandler.getEntity(tenantId, LISTNAME, "1", Contact.class);
			
			assertEquals(contact.getFirstName(), "Foo");
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}

	private void installSchema() throws Exception {
		AppInfo appInfo = ApplicationUtils.getAppInfo();
		EntityList entityList = new EntityList();
		entityList.setNameSpace(appInfo.getNameSpace());
		entityList.setContextLevel("tenant");
		entityList.setName(LISTNAME);
		entityList.setIdProperty(getIndexedProperty("id", "integer"));
		entityList.setIndexA(getIndexedProperty("firstName", "string")); 
		entityList.setIndexA(getIndexedProperty("lastName", "string"));
		entityList.setIsVisibleInStorefront(Boolean.FALSE);
		entityList.setIsLocaleSpecific(false);
		entityList.setIsSandboxDataCloningSupported(Boolean.TRUE);
		entityList.setIsShopperSpecific(false);

		String mapName = LISTNAME+"@"+appInfo.getNameSpace();
		createOrUpdateEntityList(tenantId, entityList, mapName);
	}
	
	
	
	private IndexedProperty getIndexedProperty(String name, String type) {
		IndexedProperty property = new IndexedProperty();
		property.setPropertyName(name);
		property.setDataType(type);

		return property;
	}
	/*
	 * Create or update entity list
	 */
	private void createOrUpdateEntityList(Integer tenantId,
			EntityList entityList, String mapName) throws Exception {
		EntityList existing = null;
		EntityListResource entityListResource = new EntityListResource(
				new MozuApiContext(tenantId));
		try {
			existing = entityListResource.getEntityList(mapName);
		} catch (ApiException ae) {
			if (ae.getApiError() == null || !StringUtils.equals(ae.getApiError().getErrorCode(),
					"ITEM_NOT_FOUND"))
				throw ae;
		}
		try {
			if (existing == null) {
				entityListResource.createEntityList(entityList);
			} else {
				entityListResource.updateEntityList(entityList, mapName);
			}
		} catch (ApiException ae) {
			// TODO: log error and throw
			ae.printStackTrace();
		}
	}
}
