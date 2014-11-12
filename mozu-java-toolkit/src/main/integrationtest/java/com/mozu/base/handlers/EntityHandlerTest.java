package com.mozu.base.handlers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.base.models.AppInfo;
import com.mozu.base.models.EntityCollection;
import com.mozu.base.models.EntityDataTypes;
import com.mozu.base.models.EntityScope;
import com.mozu.base.models.ExtensionParent;
import com.mozu.base.models.Contact;
import com.mozu.base.utils.ApplicationUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/servlet-context.xml" })
public class EntityHandlerTest {

	@Autowired
	EntitySchemaHandler entitySchemaHandler;
	
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
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void installSchemaTest() {
		
		EntityList entityList = new EntityList();
		entityList.setName(LISTNAME);
		entityList.setIsVisibleInStorefront(Boolean.FALSE);
		entityList.setIsLocaleSpecific(false);
		entityList.setIsSandboxDataCloningSupported(Boolean.TRUE);
		entityList.setIsShopperSpecific(false);

		IndexedProperty idProperty = entitySchemaHandler.getIndexedProperty("id", EntityDataTypes.Integer);
		List<IndexedProperty> indexedProperties = new ArrayList<IndexedProperty>();
		indexedProperties.add(entitySchemaHandler.getIndexedProperty("firstName", EntityDataTypes.String));
		indexedProperties.add(entitySchemaHandler.getIndexedProperty("lastName", EntityDataTypes.String));
		ApiContext apiContext = new MozuApiContext(tenantId);
		try {
			EntityList retrunValue = entitySchemaHandler.installSchema(apiContext, entityList, EntityScope.Tenant, idProperty, indexedProperties);
			assertEquals(retrunValue.getName(), entityList.getName());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void upsertEntityTest() {
		try {
			
			EntityHandler<Contact> entityHandler = new EntityHandler<Contact>(Contact.class);
			
			Contact contact = new Contact();
			
			contact.setId(1);
			contact.setFirstName("Foo");
			contact.setLastName("Bar");
			Contact c = entityHandler.upsertEntity(tenantId, LISTNAME, contact.getId().toString(), contact);
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getFirstName(), contact.getFirstName());
			assertEquals(c.getId(), contact.getId());
			
			
			contact.setLastName("Bar1");
			c = entityHandler.upsertEntity(tenantId, LISTNAME, contact.getId().toString(), contact);
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
			EntityHandler<Contact> entityHandler = new EntityHandler<Contact>(Contact.class);
			Contact contact = entityHandler.getEntity(tenantId, LISTNAME, "1");
			
			assertEquals(contact.getFirstName(), "Foo");
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}
	
	
	@Test
	public void getEntityCollectionTest() {
		try {
			EntityHandler<Contact> entityHandler = new EntityHandler<Contact>(Contact.class);
			EntityCollection<Contact> contactCollection = entityHandler.getEntityCollection(tenantId, LISTNAME);
			
			Contact contact = contactCollection.getItems().get(0);
			assertEquals(contact.getFirstName(), "Foo");
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}
	

	
	
}
