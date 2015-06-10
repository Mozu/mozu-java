package com.mozu.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.cache.impl.CacheManagerImpl;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountCollection;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.commerce.catalog.admin.ProductResource;
import com.mozu.api.resources.commerce.customer.CustomerAccountResource;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.urls.commerce.customer.CustomerAccountUrl;
import com.mozu.api.urls.platform.TenantUrl;
import com.mozu.client.MozuClientImpl;

public class AsyncClientTest {

    private static final Integer TENANT_ID = 3293;
    private static final String APP_ID = "a0842dd.lightspeed.1.0.0.johng";
    private static final String SHARED_SECRET = "b2dc973d5dec4bd6aa325fa906a64aee";
    private static final String MOZU_BASE_URL = "https://home.mozu-qa.com";
    
    protected Tenant tenant;
    protected CustomerAccountCollection accounts;
    protected Product addedProduct;
    
    CacheManagerImpl<?> cacheManager;
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void clientTest() throws Exception {
        ApiContext apiContext = new MozuApiContext(TENANT_ID);
        
        MozuConfig.setBaseUrl(MOZU_BASE_URL);
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET));

        //Initalize cache
        cacheManager = new CacheManagerImpl();
        cacheManager.startCache();
        com.mozu.api.cache.CacheManagerFactory.setCacheManager(cacheManager);

        MozuUrl url = TenantUrl.getTenantUrl(null, TENANT_ID);
        String verb = "GET";
        Class<?> clz = Tenant.class;
        MozuClientImpl<Tenant> mozuTenantClient = (MozuClientImpl<Tenant>) MozuClientFactory.getInstance(clz);
        mozuTenantClient.setVerb(verb);
        mozuTenantClient.setResourceUrl(url);
        
        mozuTenantClient.setContext(apiContext);
        TenantCallbackClass cc = new TenantCallbackClass();
        
        CountDownLatch latch1 = mozuTenantClient.executeRequest(cc);
 
        MozuUrl acctUrl = CustomerAccountUrl.getAccountsUrl(null,  null,  null,  null,  null,  null,  null,  null,  null);
        Class<?> acctClz = CustomerAccountCollection.class;
        MozuClientImpl<CustomerAccountCollection> mozuAcctClient = (MozuClientImpl<CustomerAccountCollection>) MozuClientFactory.getInstance(acctClz);
        mozuAcctClient.setVerb(verb);
        mozuAcctClient.setResourceUrl(acctUrl);
        
        mozuAcctClient.setContext(apiContext);
        AccountCallbackClass ac = new AccountCallbackClass();
        
        CountDownLatch latch2 = mozuAcctClient.executeRequest(ac);

        TenantResource resource = new TenantResource(apiContext);
        tenant = null;
        tenant = resource.getTenant(TENANT_ID);
        assertEquals(TENANT_ID, tenant.getId());

        System.out.println("Sync Operation finished");
        
        if (!latch1.await(30, TimeUnit.SECONDS)) {
            fail("Timeout");
        } else {
            assertEquals(TENANT_ID, tenant.getId());
        }

        System.out.println("Tenant Async Operation finished");

        if (!latch2.await(30, TimeUnit.SECONDS)) {
            fail("Timeout");
        } else {
            assertNotNull(accounts);
        }

        System.out.println("Account Async Operation finished");
    }
    
    @Test
    public void fullAsyncTest() throws Exception {
        ApiContext apiContext = new MozuApiContext(TENANT_ID);
        
        MozuConfig.setBaseUrl(MOZU_BASE_URL);
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET));

        //Initalize cache
        cacheManager = new CacheManagerImpl();
        cacheManager.startCache();
        com.mozu.api.cache.CacheManagerFactory.setCacheManager(cacheManager);

        TenantCallbackClass tenantCallback = new TenantCallbackClass();
        
        TenantResource tenantResource = new TenantResource(apiContext);
        CountDownLatch latch1 = tenantResource.getTenantAsync(TENANT_ID, tenantCallback);
        
        AccountCallbackClass accountCallback = new AccountCallbackClass();

        CustomerAccountResource car = new CustomerAccountResource(apiContext);
        CountDownLatch latch2 = car.getAccountsAsync(0, 100, null, null, null, null, null, null, null, accountCallback);
        
        if (!latch1.await(30, TimeUnit.SECONDS)) {
            fail("Timeout");
        } else {
            assertEquals(TENANT_ID, tenant.getId());
        }
        
        if (!latch2.await(30, TimeUnit.SECONDS)) {
            fail("Timeout");
        } else {
            assertNotNull(accounts);
        }

        List<CountDownLatch> latches = new ArrayList<CountDownLatch>();
        AccountReadCallbackClass arc = new AccountReadCallbackClass();
        for (CustomerAccount acct: accounts.getItems()) {
        	CountDownLatch latch = car.getAccountAsync(acct.getId(), arc);
        	latches.add(latch);
        }
        
        for (CountDownLatch l: latches) {
        	l.await(30, TimeUnit.SECONDS);
        }
    }
    
    @Test
    public void addDeleteProductTest() throws Exception {
        ApiContext apiContext = new MozuApiContext(TENANT_ID);
        apiContext.setCatalogId(1);
        apiContext.setMasterCatalogId(1);
        
        MozuConfig.setBaseUrl(MOZU_BASE_URL);
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET));

        //Initalize cache
        cacheManager = new CacheManagerImpl();
        cacheManager.startCache();
        com.mozu.api.cache.CacheManagerFactory.setCacheManager(cacheManager);
        
        Product product = createProduct();
        ProductCallback prodCallback = new ProductCallback();
        
        ProductResource prodResource = new ProductResource(apiContext);
        CountDownLatch addLatch = prodResource.addProductAsync(product, prodCallback);
        
        if (!addLatch.await(30, TimeUnit.SECONDS)) {
            fail("Timeout");
        } else {
        	assertNotNull(addedProduct);
        }

        prodResource.deleteProduct("TestProductCode");
        
        Product p = prodResource.getProduct("TestProductCode");
        assertNull(p);
    }

    private Product createProduct() {
		Product prod = new Product();
		prod.setBaseProductCode("BaseProdCode");
		prod.setMasterCatalogId(1);
		prod.setProductCode("TestProductCode");
		prod.setProductUsage("Standard");
		prod.setProductTypeId(4);
		ProductPrice price = new ProductPrice();
		price.setIsoCurrencyCode("USD");
		price.setPrice(1.0);
		prod.setPrice(price);
		ProductLocalizedContent content = new ProductLocalizedContent();
		content.setLocaleCode("en-US");
		content.setProductName("Test Product");
		prod.setContent(content);
		Measurement linearMeas = new Measurement();
		linearMeas.setUnit("ft");
		linearMeas.setValue(2.0);
		prod.setPackageHeight(linearMeas);
		prod.setPackageLength(linearMeas);
		prod.setPackageWidth(linearMeas);
		Measurement weightMeas = new Measurement();
		weightMeas.setUnit("lbs");
		weightMeas.setValue(4.0);
		prod.setPackageWeight(weightMeas);
		
		return prod;
	}

	protected AppAuthInfo createAppAuthInfo(String appId, String sharedSecret) {
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(appId);
        appAuthInfo.setSharedSecret(sharedSecret);

        return appAuthInfo;
    }

    public class TenantCallbackClass implements AsyncCallback<Tenant> {

        @Override
        public void success(Tenant result) {
            tenant = result;
            System.out.println("Resultant tenant id: " + result.getId());
        }

        @Override
        public void failure(Exception exception) {
            fail("Tenant Failure callback called");
        }

        @Override
        public void cancelled() {
            System.out.println("Tenant Cancelled callback called");
        }
        
    }

    public class AccountCallbackClass implements AsyncCallback<CustomerAccountCollection> {

        @Override
        public void success(CustomerAccountCollection result) {
            accounts = result;
            if (result==null) { 
                fail("No account collection object");
            } else if (result.getItems()==null) {
                fail("Null items in account collection");
            }
            System.out.println("Number of CustomerAccounts " + result.getItems().size());
        }

        @Override
        public void failure(Exception exception) {
            exception.printStackTrace();
            fail("Account Failure callback called");
        }

        @Override
        public void cancelled() {
            System.out.println("Account Cancelled callback called");
        }
        
    }

    public class AccountReadCallbackClass implements AsyncCallback<CustomerAccount> {

        @Override
        public void success(CustomerAccount result) {
        	System.out.println("Account " + result.getFirstName() + " " + result.getLastName() + " (id: " + result.getId() + ")");
        }

        @Override
        public void failure(Exception exception) {
            exception.printStackTrace();
            fail("Account Read Failure callback called");
        }

        @Override
        public void cancelled() {
            System.out.println("Account Read Cancelled callback called");
        }
        
    }

    public class ProductCallback implements AsyncCallback<Product> {

        @Override
        public void success(Product result) {
        	addedProduct = result;
        	System.out.println("Product received " + addedProduct.getProductCode());
        }

        @Override
        public void failure(Exception exception) {
            exception.printStackTrace();
            fail("Account Read Failure callback called");
        }

        @Override
        public void cancelled() {
            System.out.println("Account Read Cancelled callback called");
        }
    }
}
