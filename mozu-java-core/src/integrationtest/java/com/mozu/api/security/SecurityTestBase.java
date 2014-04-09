package com.mozu.api.security;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.utils.ConfigProperties;

public class SecurityTestBase {
    static public final String URL = ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL);
    static public final String APP_ID = ConfigProperties.getStringProperty(ConfigProperties.APP_ID);
    static public final String SHARED_SECRET = ConfigProperties.getStringProperty(ConfigProperties.SHARED_SECRET);
    
    static public final int TENANT_ID = ConfigProperties.getIntProperty("tenant.id");
    
    static public final String USER_DEVELOPER = ConfigProperties.getStringProperty("username.developer");
    static public final String USER_SHOPPER = ConfigProperties.getStringProperty("username.shopper");
    static public final String USER_TENANT = ConfigProperties.getStringProperty("username.tenant");
    static public final String PASSWORD = ConfigProperties.getStringProperty("password");

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
        AppAuthenticator.invalidateAuth();
    }
    
    
    protected AppAuthInfo createAppAuthInfo(String appId, String sharedSecret) {
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(appId);
        appAuthInfo.setSharedSecret(sharedSecret);
        
        return appAuthInfo;
    }
    
    protected AuthenticationProfile authenticateUser (AuthenticationScope scope, String userName) {
        AppAuthenticator.initialize(createAppAuthInfo(APP_ID, SHARED_SECRET), URL);
        
        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(userName);
        userAuth.setPassword(PASSWORD);

        // Authorize user
        return  UserAuthenticator.authenticate(userAuth, scope);
    }
    
    


}
