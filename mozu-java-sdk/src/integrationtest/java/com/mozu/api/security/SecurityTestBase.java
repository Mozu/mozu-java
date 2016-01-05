package com.mozu.api.security;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.mozu.api.MozuConfig;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.core.UserAuthInfo;

public class SecurityTestBase {
    protected final static String CONFIG_PROPERTIES_FILENAME = "mozu_config.properties";
    // the following are defined properties for the SDK
    public final static String MOZU_BASE_URL = "base.url";
    public final static String SHARED_SECRET = "shared.secret";
    public final static String APP_ID = "app.id";
    public final static String PROXY_HOST = "proxy.host";
    public final static String PROXY_PORT = "proxy.port";
    public final static String DEV_USERNAME = "username.developer";
    public final static String TENANT_USERNAME = "username.tenant";
    public final static String TENANT_ID = "tenant.id";
    public final static String SITE_ID = "site.id";
    public final static String PASSWORD = "password"; 
    public final static String CUSTOMER_USERNAME = "username.customer";
    public final static String CUSTOMER_PASSWORD = "customer.password"; 

    protected static PropertiesConfiguration configProps = null;

    @BeforeClass
    static public void setUpBeforeClass() throws Exception {
        configProps = new PropertiesConfiguration(CONFIG_PROPERTIES_FILENAME);
        MozuConfig.setBaseUrl(configProps.getString(MOZU_BASE_URL));
        MozuConfig.setProxyHost(configProps.getString(PROXY_HOST));
        String proxyPortString = configProps.getString(PROXY_PORT); 
        if (StringUtils.isNotBlank(proxyPortString)) {
            MozuConfig.setProxyPort (Integer.valueOf(proxyPortString));
        }
    }

    @AfterClass
    static public void tearDownAfterClass() throws Exception {
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

    protected AuthenticationProfile authenticateUser(AuthenticationScope scope, String userName) {
        String appId = configProps.getString(APP_ID);
        String sharedSecret = configProps.getString(SHARED_SECRET);

        AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret));

        // Authorize user and get tenants
        UserAuthInfo userAuth = new UserAuthInfo();
        userAuth.setEmailAddress(userName);
        userAuth.setPassword(configProps.getString(PASSWORD));

        // Authorize user
        return UserAuthenticator.authenticate(userAuth, scope);
    }

}
