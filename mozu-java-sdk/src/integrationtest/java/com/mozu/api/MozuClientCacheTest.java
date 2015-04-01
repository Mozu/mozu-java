package com.mozu.api;

import static org.junit.Assert.*;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;
import com.mozu.api.resources.commerce.catalog.admin.products.ProductPropertyResource;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.SecurityTestBase;

public class MozuClientCacheTest extends SecurityTestBase {
	 private static final Logger logger = LoggerFactory.getLogger(MozuClientTest.class);
	 com.mozu.api.cache.impl.CacheManagerImpl cacheManager;
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		configProps = new PropertiesConfiguration(CONFIG_PROPERTIES_FILENAME);
		String appId = configProps.getString(APP_ID);
	    String sharedSecret = configProps.getString(SHARED_SECRET);
	    MozuConfig.setBaseUrl(configProps.getString(MOZU_BASE_URL));
		AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret));
		 //Initalize cache
		 cacheManager = new com.mozu.api.cache.impl.CacheManagerImpl();
		 cacheManager.startCache();
		 com.mozu.api.cache.CacheManagerFactory.setCacheManager(cacheManager);
	}

	@After
	public void tearDown() throws Exception {
		cacheManager.stopCache();
	}

	@Test
	public void getTenant() {
		TenantResource tenantResource = new TenantResource();
		
		try {
			Integer tenantId = configProps.getInt(TENANT_ID);
			Tenant tenant = tenantResource.getTenant(configProps.getInt(TENANT_ID));
			assertEquals(tenantId, tenant.getId());
			//Get again..should read from cache
			tenant = tenantResource.getTenant(configProps.getInt(TENANT_ID));
			assertEquals(tenantId, tenant.getId());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			fail(e.getMessage());
		}
	}
	
	@Test
	public void ObjectNotExistsTest() {
		try {
			Integer tenantId = configProps.getInt(TENANT_ID);
			ApiContext apiContext = new MozuApiContext(tenantId);
			apiContext.setMasterCatalogId(1);
			ProductResource productResource = new ProductResource(apiContext);
			Product product = productResource.getProduct("fjksdhdkajfhsd");
			assertNull(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			fail(e.getMessage());
		}
	}

	@Test
	public void UriNotExsitsTest() {
		try {
			Integer tenantId = configProps.getInt(TENANT_ID);
			ApiContext apiContext = new MozuApiContext(tenantId);
			apiContext.setTenantUrl("http://runscope.com/");
			ProductPropertyResource productResource = new ProductPropertyResource(apiContext);
			ProductPropertyValueLocalizedContent content = productResource.getPropertyValueLocalizedContent("", "", "", "");
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage().contains("runscope.com") && e.getMessage().contains("not found"));
		}
	}
}
