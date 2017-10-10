package com.mozu.test;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.utils.JsonUtils;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.platform.TenantDataFactory;

public class HttpClientConnectionTests extends MozuApiTestBase {

	private static ApiContext apiContext;
	private final String TENANT_DB_ENTRY = "http-client-connection-test1";
	private final Integer CONNECT_TIMES = 40;
	private ObjectMapper mapper = JsonUtils.initObjectMapper();
	
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

	private String generateValue() throws Exception
	{
        MyClass sampleObject = new MyClass();
        sampleObject.setItem1(DateTime.now().minusDays(2));
        sampleObject.setItem2(DateTime.now());
		return "'"+mapper.writeValueAsString(sampleObject)+"'";		
	}
	
	@Test
	public void HttpClientConnectionTest1() throws Exception {
		try
		{
			TenantDataFactory.getDBValue(apiContext, TENANT_DB_ENTRY, null, HttpStatus.SC_CREATED);			
		}
		catch(Exception e)
		{
			TenantDataFactory.createDBValue(apiContext, generateValue(), TENANT_DB_ENTRY, HttpStatus.SC_CREATED);			
			
		}
		for (int i = 0; i < CONNECT_TIMES; i++)
		{
			TenantDataFactory.updateDBValue(apiContext, generateValue(), TENANT_DB_ENTRY, HttpStatus.SC_OK);
		}
	}

}
