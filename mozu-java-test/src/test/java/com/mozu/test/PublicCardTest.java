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
	public void createProductTest1() throws Exception  {
		PublicCard card = new PublicCard();
		card.setCardHolderName("test");
		card.setCardIssueMonth(01);
		card.setCardIssueYear(2011);
		card.setCardNumber("4111111111111111");
		card.setExpireMonth(01);
		card.setExpireYear(2020);
		card.setCardType("VISA");
		
		PublicCardResource resource = new PublicCardResource(apiContext);
		SyncResponse response = resource.create(card);
		assertTrue(response.getId() != StringUtils.EMPTY);
	}
}
