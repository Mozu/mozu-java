package com.mozu.api.security;

import static org.junit.Assert.*;

import java.io.IOException;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.ApiException;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.contracts.appdev.AuthTicketRequest;
import com.mozu.api.resources.platform.applications.AuthTicketResource;
import com.mozu.api.security.AppAuthenticator;

/**
 *  This test aims to test the AppAuthenticator by mocking out the
 *  rest calls. 
 * 
 */
public class AppAuthenticatorUnitTest {

    private static final String GOOD_URL = "https://home.mozu.com/api/platform/applications/authtickets";
    private static final String REFRESH_URL = GOOD_URL + "/refresh-ticket";
    
    private static final String APP_ID = "12342341234132";
    private static final String SHARED_SECRET = "12342341234132";

    @Mocked MozuClient<?> mockHttpClient;
    @Mocked AuthTicket mockAuthTicket;
    @Mocked AuthTicketRequest mockAuthTicketRequest;
    
    @Before
    public void setUp() throws Exception {
        new MockUp<MozuClientFactory<?>>() {
            @Mock
            public MozuClient<?> getInstance(Class<?> clz) throws Exception {
                return mockHttpClient;
            }
        };

    }

    /**
     * The AppAuthenticator is static in the test class. This is run after
     * each test to clear out the instance.
     */
    @After
    public void tearDown() throws Exception {
        new MockUp<AuthTicketResource>() {
            @Mock public void deleteAppAuthTicket(String refreshToken) throws Exception {};
        };
        AppAuthenticator.invalidateAuth();
    }

    /**
     * Initialize passing explicit AppAuthInfo and default base url
     * 
     * @throws Exception
     */
    @Test
    public void initializeWithURLTest() throws Exception {
        
        final AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(APP_ID);
        appAuthInfo.setSharedSecret(SHARED_SECRET);
        
        new Expectations() {
            { mockHttpClient.executePostRequest(appAuthInfo, GOOD_URL, null); returns(mockAuthTicket); }
            { mockAuthTicket.getAccessTokenExpiration(); returns(new DateTime()); }
            { mockAuthTicket.getRefreshTokenExpiration(); returns(new DateTime()); }
        };

        AppAuthenticator.initialize(appAuthInfo);
    }
    /**
     * Test an error in I/O when making the request
     * 
     * @throws Exception
     */

    @Test
    public void initializeIOExceptionTest() throws Exception {
        
        final AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(APP_ID);
        appAuthInfo.setSharedSecret(SHARED_SECRET);

        new Expectations() {
            { mockHttpClient.executePostRequest(appAuthInfo, GOOD_URL, null); result=new IOException("Test IO Exception"); }
        };
        
        try {
            AppAuthenticator.initialize(appAuthInfo);
            fail("API exception expected");
        } catch (ApiException e) {
            //expected
            assertEquals("Exception getting Mozu client: Test IO Exception", e.getMessage());
        }
    }

    /**
     * Initialize, then refresh the app auth ticket.
     * 
     * @throws Exception
     */
    @Test
    public void refreshAppAuthTest() throws Exception {
        final AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(APP_ID);
        appAuthInfo.setSharedSecret(SHARED_SECRET);

        new MockUp<AuthTicketRequest>() {
            @Mock
            public void $init() {}

            @Mock
            public void setRefreshToken(String refreshToken) {}
        };

        new Expectations() {
            { mockHttpClient.executePostRequest(appAuthInfo, GOOD_URL, null); returns(mockAuthTicket); }
            { mockAuthTicket.getAccessTokenExpiration(); returns(new DateTime()); }
            { mockAuthTicket.getRefreshTokenExpiration(); returns(new DateTime()); }
            { mockAuthTicket.getRefreshToken(); returns("RefreshToken"); }
            { mockHttpClient.executePutRequest(any, REFRESH_URL, null); returns(mockAuthTicket); }
        };

        AppAuthenticator.initialize(appAuthInfo);
        AppAuthenticator auth = AppAuthenticator.getInstance();
        
        auth.refreshAppAuthTicket();
    }
}
