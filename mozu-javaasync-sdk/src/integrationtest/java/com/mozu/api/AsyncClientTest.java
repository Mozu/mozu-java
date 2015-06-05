package com.mozu.api;

import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.cache.impl.CacheManagerImpl;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.customer.CustomerAccountCollection;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.urls.commerce.customer.CustomerAccountUrl;
import com.mozu.api.urls.platform.TenantUrl;
import com.mozu.client.AsyncCallback;
import com.mozu.client.MozuClientImpl;

public class AsyncClientTest {

    private static final Integer TENANT_ID = 3293;
    private static final String APP_ID = "a0842dd.lightspeed.1.0.0.johng";
    private static final String SHARED_SECRET = "b2dc973d5dec4bd6aa325fa906a64aee";
    private static final String MOZU_BASE_URL = "https://home.mozu-qa.com";
    
    protected Tenant tenant;
    protected CustomerAccountCollection accounts;
    
    CacheManagerImpl<?> cacheManager;
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
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
}
