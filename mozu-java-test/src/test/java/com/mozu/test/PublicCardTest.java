package com.mozu.test;

import static org.junit.Assert.*;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.paymentservice.PublicCard;
import com.mozu.api.contracts.paymentservice.response.SyncResponse;
import com.mozu.api.resources.commerce.payments.PublicCardResource;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.AdminProductFactory;
import com.mozu.test.framework.datafactory.AttributedefinitionAttributeFactory;
import com.mozu.test.framework.datafactory.ProductTypeFactory;
import com.mozu.test.framework.datafactory.PublicCardFactory;

public class PublicCardTest extends MozuApiTestBase {
	private String cardId = StringUtils.EMPTY;
	private static ApiContext apiContext;
	
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createCardTest1() throws Exception  {
		PublicCard card = new PublicCard();
		card.setCardHolderName("crr wrr");
		card.setCardNumber("4111111111111111");
		card.setExpireMonth(1);
		card.setExpireYear(2020);
		card.setCardType("visa");
		card.setCvv("123");
		
		SyncResponse response = PublicCardFactory.create(apiContext, card, HttpStatus.SC_OK);
		assertTrue(response.getIsSuccessful());
		assertTrue(!response.getId().isEmpty());
	}
}
