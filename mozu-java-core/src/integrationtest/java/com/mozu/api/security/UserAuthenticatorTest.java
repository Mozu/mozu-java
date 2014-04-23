package com.mozu.api.security;

import static org.junit.Assert.*;

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
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET), URL);
        
        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(USER_DEVELOPER);
        userAuth.setPassword(PASSWORD);
        // Authorize user
        AuthenticationProfile authProfile = UserAuthenticator.authenticate(userAuth, AuthenticationScope.Developer);
        
        assertNotNull(authProfile);
        this.authTicket = authProfile.getAuthTicket();
        assertNotNull(authProfile.getUserProfile());
        assertEquals(authProfile.getUserProfile().getUserName(), USER_DEVELOPER);
        UserAuthenticator.logout(authTicket);
    }
   
    @Test
    public void testAuthenticateTenantUser() throws Exception {
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET), URL);
        
        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(USER_TENANT);
        userAuth.setPassword(PASSWORD);
        // Authorize user
        AuthenticationProfile authProfile = UserAuthenticator.authenticate(userAuth, AuthenticationScope.Tenant);
        
        assertNotNull(authProfile);
        this.authTicket = authProfile.getAuthTicket();
        assertNotNull(authProfile.getUserProfile());
        assertEquals(authProfile.getUserProfile().getUserName(), USER_TENANT);
        UserAuthenticator.logout(authTicket);
    }

}
