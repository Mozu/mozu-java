package com.mozu.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.AttributeResource;
import com.mozu.api.resources.commerce.customer.AddressValidationRequestResource;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.AttributeFactory;
import com.mozu.test.framework.datafactory.AttributedefinitionAttributeFactory;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductAttributeGenerator;

public class ProductAttributeTests extends MozuApiTestBase {
	
	private static List<String> attrs = new ArrayList<String>(); 
	private static ApiContext apiContext;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		for (int i = 0; i < attrs.size(); i++)
		{
		    AttributedefinitionAttributeFactory.deleteAttribute(apiContext, attrs.get(i), HttpStatus.SC_NO_CONTENT);			
		}
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addAttributeTest1() throws Exception {
        Attribute attr1 = ProductAttributeGenerator.generate(Generator.randomString(6, Generator.AlphaChars), "List", "Predefined", "String", false,  true, true);
        Attribute createdAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, attr1, HttpStatus.SC_CREATED);
        attrs.add(createdAttr.getAttributeFQN());
        Attribute getAttr = AttributedefinitionAttributeFactory.getAttribute(apiContext, createdAttr.getAttributeFQN(), HttpStatus.SC_OK);
        assertEquals(attr1.getAttributeCode(), getAttr.getAttributeCode());
	}

	@Test
	//negative test
	public void getAttributeTest1() throws Exception {
		Attribute attr1 = ProductAttributeGenerator.generate(Generator.randomString(6, Generator.AlphaChars), "List", "Predefined", "String", false,  true, true);
		AttributedefinitionAttributeFactory.getAttribute(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

}
