package com.mozu.base.handlers;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.JsonNode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityCollection;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.api.resources.platform.entitylists.EntityResource;
import com.mozu.base.models.ExtensionParent;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/servlet-context.xml" })
public class ExtensionHandlerTest {

	
	@Autowired
	ExtensionHandler extensionHandler;
	
	Integer tenantId = 0;
	
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
	public void addOrdersLinkTest() {
		try {
			
			if (extensionHandler == null) fail("extension handler is not initialized");
			
			String[] path = new String[] {"App","Orders"};
			extensionHandler.upsertSubNavLink(tenantId, ExtensionParent.orders, "https://f6b273a766009bfb.a.passageway.io/app/orders", "My Extension App Orders", path);
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}
	
	@Test
	public void addCatalogLinkTest() {
		try {
			
			if (extensionHandler == null) fail("extension handler is not initialized");
			
			String[] path = new String[] {"App","Products"};
			extensionHandler.upsertSubNavLink(tenantId, ExtensionParent.catalog, "https://f6b273a766009bfb.a.passageway.io/app/products", "My Extension App Products", path);
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}
	

	@Test
	public void addCustomersLinkTest() {
		try {
			
			if (extensionHandler == null) fail("extension handler is not initialized");
			
			String[] path = new String[] {"App","Customers"};
			extensionHandler.upsertSubNavLink(tenantId, ExtensionParent.customers, "https://f6b273a766009bfb.a.passageway.io/app/customers", "My Extension App Customers", path);
			
		} catch(Exception exc) {
			fail(exc.getMessage());
		}
	}

}
