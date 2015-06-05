package com.mozu.api.security;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.mozu.api.ApiException;
import com.mozu.api.MozuConfig;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;

public class AppAuthenticatorTest extends SecurityTestBase {
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testBadLoginApi() throws Exception {
		String url = MozuConfig.getBaseUrl();
		String appId = "NON_EXISTANT";
		String sharedSecret = "BAD_SHARED_SECRET";
		
		try {
		    MozuConfig.setBaseUrl(url);
			AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), null);

			fail("Should have failed login");
		} catch (ApiException ae) {
		    String message = ae.getMessage();
			assertTrue("Error Message Wrong in API", message.contains("Invalid Credentials: Invalid credentials."));
			assertNotNull(ae.getApiError());
            assertEquals("INVALID_CREDENTIALS", ae.getApiError().getErrorCode());
		} catch (Exception e) {
			fail ("wrong exception");
		}
	}

	@Test
	public void testLoginApi() throws Exception {
		String url = MozuConfig.getBaseUrl();
		String appId = configProps.getString(APP_ID);
		String sharedSecret = configProps.getString(SHARED_SECRET);

        MozuConfig.setBaseUrl(url);
		AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), null);
		
		TenantResource tenantsApi = new TenantResource();
		Tenant tenant = tenantsApi.getTenant(configProps.getInt(TENANT_ID));
		assertNotNull(tenant);

	}

	
    @Test
    public void testRefreshInterval() throws Exception {
        String url = MozuConfig.getBaseUrl();
        String appId = configProps.getString(APP_ID);
        String sharedSecret = configProps.getString(SHARED_SECRET);

        RefreshInterval refreshInterval = new RefreshInterval(1000, 200000);
        MozuConfig.setBaseUrl(url);

        AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), refreshInterval);
        // wait so we have to refresh
        Thread.sleep(2000);
        TenantResource tenantsApi = new TenantResource();
        Tenant tenant = tenantsApi.getTenant(configProps.getInt(TENANT_ID));
        assertNotNull(tenant);

    }

}
