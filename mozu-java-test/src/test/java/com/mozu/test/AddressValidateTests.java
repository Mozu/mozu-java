package com.mozu.test;

import static org.junit.Assert.*;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.customer.AddressValidationRequest;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.AddressValidationRequestFactory;
import com.mozu.test.framework.helper.CustomerGenerator;

public class AddressValidateTests extends MozuApiTestBase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AddressValidationRequestsTests() throws Exception {
		ApiContext apiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId); 
        AddressValidationRequest request = new AddressValidationRequest();
        request.setAddress(CustomerGenerator.generateAddress("ca"));
		AddressValidationRequestFactory.validateAddress(apiContext, request, HttpStatus.SC_OK, HttpStatus.SC_OK);
        request.setAddress(CustomerGenerator.generateInvalidAddress());
		AddressValidationRequestFactory.validateAddress(apiContext, request, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);		
	}
}
