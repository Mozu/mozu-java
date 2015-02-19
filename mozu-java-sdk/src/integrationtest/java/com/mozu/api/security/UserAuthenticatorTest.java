package com.mozu.api.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;

import com.mozu.api.contracts.core.UserAuthInfo;

public class UserAuthenticatorTest extends SecurityTestBase {
    private AuthTicket authTicket = null;
    
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testAuthenticateDeveloperUser() throws Exception {
        String appId = configProps.getString(APP_ID);
        String sharedSecret = configProps.getString(SHARED_SECRET);

        AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret));
        
        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        String userName = configProps.getString(DEV_USERNAME);
        userAuth.setEmailAddress(userName);
        userAuth.setPassword(configProps.getString(PASSWORD));
        // Authorize user
        AuthenticationProfile authProfile = UserAuthenticator.authenticate(userAuth, AuthenticationScope.Developer);
        
        assertNotNull(authProfile);
        this.authTicket = authProfile.getAuthTicket();
        assertNotNull(authProfile.getUserProfile());
        assertEquals(authProfile.getUserProfile().getUserName(), userName);
        UserAuthenticator.logout(authTicket);
    }
   
    @Test
    public void testAuthenticateTenantUser() throws Exception {
        String appId = configProps.getString(APP_ID);
        String sharedSecret = configProps.getString(SHARED_SECRET);

        AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret));
        
        // Authorize user and get tenants
        String userName = configProps.getString(TENANT_USERNAME);
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(userName);
        userAuth.setPassword(PASSWORD);
        // Authorize user
        AuthenticationProfile authProfile = authenticateUser(AuthenticationScope.Tenant, configProps.getString(TENANT_USERNAME));

        assertNotNull(authProfile);
        this.authTicket = authProfile.getAuthTicket();
        assertNotNull(authProfile.getUserProfile());
        assertEquals(authProfile.getUserProfile().getUserName(), userName);
        UserAuthenticator.logout(authTicket);
    }

}
