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
import com.mozu.api.contracts.core.User;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.commerce.customer.CustomerAccountFactory;
import com.mozu.test.framework.helper.CustomerGenerator;
import com.mozu.test.framework.helper.Generator;

public class CustomerTests extends MozuApiTestBase {

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
	public void CreateCustomerTest1() throws Exception {
		ApiContext apiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId); 
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo();
        CustomerAuthTicket ticket = CustomerAccountFactory.addAccountAndLogin(apiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED);
        CustomerAccount getAccount = CustomerAccountFactory.getAccount(apiContext, ticket.getCustomerAccount().getId(), HttpStatus.SC_OK);
        assertEquals(getAccount.getEmailAddress(), customerAccountAndAuthInfo.getAccount().getEmailAddress());
	}

	@Test
	public void UpdateCustomerTest1() throws Exception {
		ApiContext apiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId); 
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo();
        CustomerAuthTicket ticket = CustomerAccountFactory.addAccountAndLogin(apiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED);
        CustomerAccount getAccount = CustomerAccountFactory.getAccount(apiContext, ticket.getCustomerAccount().getId(), HttpStatus.SC_OK);
        getAccount.setEmailAddress(Generator.randomEmailAddress());
        CustomerAccount updateAccount = CustomerAccountFactory.updateAccount(apiContext, getAccount, ticket.getCustomerAccount().getId(), HttpStatus.SC_OK);
        assertEquals(updateAccount.getEmailAddress(), getAccount.getEmailAddress());
	}
	
	@Test
	public void UpdateCustomerTest2() throws Exception {
		ApiContext apiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);
		//CustomerAccountFactory.getAccounts(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerAccount getAccount = CustomerAccountFactory.getAccount(apiContext, 1004, HttpStatus.SC_OK);
        getAccount.setAcceptsMarketing(false);
        CustomerAccount updateAccount = CustomerAccountFactory.updateAccount(apiContext, getAccount, 1004, HttpStatus.SC_OK);
        assert(!updateAccount.getAcceptsMarketing());
	}
}