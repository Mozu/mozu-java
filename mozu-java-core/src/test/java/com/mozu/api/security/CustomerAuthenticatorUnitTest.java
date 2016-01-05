package com.mozu.api.security;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Map;

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
import com.mozu.api.MozuUrl;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;

public class CustomerAuthenticatorUnitTest {

    private static final String TENANT_DOMAIN = "TenantDomain";
    private static final String REFRESH_TOKEN = "RefreshToken";
    private static final String ACCESS_TOKEN = "AccessToken";
    private static final String MOZU_URL = "FakeMozuUrl";
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final String USER_NAME = "user_name";
    private static final String USER_PASSWORD = "user_password";
    private static final String MOZU_ERROR_MSG = "Mozu error";

    @Mocked Tenant mockTenant;
    @Mocked MozuUrl mockMozuUrl;
    @Mocked TenantResource mockTenantResource;
    @Mocked MozuClient<?> mockMozuClient;
    @Mocked AppAuthenticator mockAppAuthenticator;
    @Mocked HttpHelper mockHttpHelper;
    @Mocked CustomerAuthTicket mockCustomerAuthTicket;
    @Mocked CustomerAccount mockCustomerAccount;

    @Before
    public void setUp() throws Exception {
        
        new MockUp<MozuClientFactory<?>>() {
            @Mock
            public MozuClient<?> getInstance(Class<?> clz) throws Exception {
                return mockMozuClient;
            }
        };
        
        new MockUp<TenantResource>() {
            @Mock void $init() {}
            @Mock Tenant getTenant(Integer tenantId) {
                return mockTenant;
            }
        };
        
        new MockUp<AppAuthenticator>() {
            @Mock String addAuthHeader() {
                return "authHeader";
            }
        };

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void customerAuthenticatorNoRefreshTest() {
        AuthTicket ticket = createAuthTicket();
        ticket.setAccessTokenExpiration(new DateTime().plus(190000));
        
        AuthTicket cap = CustomerAuthenticator.ensureAuthTicket(ticket, TENANT_ID, SITE_ID);
        assertNull(cap);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void customerAuthenticatorRefreshTest() throws Exception {
        final AuthTicket ticket = createAuthTicket();

        new Expectations() {
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
            { HttpHelper.getUrl(TENANT_DOMAIN); result=""; }
            { CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN, null); result=mockMozuUrl; }
            { mockMozuUrl.getUrl(); result=MOZU_URL; }
            { mockMozuClient.executePutRequest(ticket, MOZU_URL, (Map<String, String>)any ); returns(mockCustomerAuthTicket); }
            { mockCustomerAuthTicket.getAccessToken(); returns("AccessToken"); }
            { mockCustomerAuthTicket.getAccessTokenExpiration(); returns(new DateTime()); }
            { mockCustomerAuthTicket.getRefreshToken(); returns("RefreshToken"); }
            { mockCustomerAuthTicket.getRefreshTokenExpiration(); returns(new DateTime()); }
            { mockCustomerAuthTicket.getCustomerAccount(); returns(mockCustomerAccount); }
        };
        
        CustomerAuthenticationProfile cap = CustomerAuthenticator.refreshUserAuthTicket(ticket, TENANT_ID, SITE_ID);
        
        assertTrue(cap.getAuthTicket().getAccessToken().equals(ACCESS_TOKEN));
        assertTrue(cap.getAuthTicket().getRefreshToken().equals(REFRESH_TOKEN));
        assertTrue(cap.getAuthTicket().getScope()==AuthenticationScope.Customer);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void apiErrorTest() throws Exception {
        final AuthTicket ticket = createAuthTicket();

        new Expectations() {
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
            { HttpHelper.getUrl(TENANT_DOMAIN); result=""; }
            { CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN, null); result=mockMozuUrl; }
            { mockMozuUrl.getUrl(); result=MOZU_URL; }
            { mockMozuClient.executePutRequest(ticket, MOZU_URL, (Map<String, String>)any ); result=new ApiException("Test IO Exception"); }
        };
        
        try {
            CustomerAuthenticator.ensureAuthTicket(ticket, TENANT_ID, SITE_ID);
            fail("Api Exception expected");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("Test IO Exception"));
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void authenticateTest() throws Exception {

        final CustomerUserAuthInfo userAuthInfo = new CustomerUserAuthInfo();
        userAuthInfo.setUsername(USER_NAME);
        userAuthInfo.setPassword(USER_PASSWORD);

        new Expectations() {
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
            { HttpHelper.getUrl(TENANT_DOMAIN); result=""; }
            { CustomerAuthTicketUrl.createUserAuthTicketUrl(null); result=mockMozuUrl; }
            { mockMozuUrl.getUrl(); result=MOZU_URL; }
            { mockMozuClient.executePostRequest(userAuthInfo, MOZU_URL, (Map<String, String>)any); returns(mockCustomerAuthTicket); }
            { mockCustomerAuthTicket.getAccessToken(); returns("AccessToken"); }
            { mockCustomerAuthTicket.getAccessTokenExpiration(); returns(new DateTime()); }
            { mockCustomerAuthTicket.getRefreshToken(); returns("RefreshToken"); }
            { mockCustomerAuthTicket.getRefreshTokenExpiration(); returns(new DateTime()); }
            { mockCustomerAuthTicket.getCustomerAccount(); returns(mockCustomerAccount); }
        };
        
        CustomerAuthenticationProfile cap = CustomerAuthenticator.authenticate(userAuthInfo, TENANT_ID, SITE_ID);
        
        assertTrue(cap.getAuthTicket().getAccessToken().equals(ACCESS_TOKEN));
        assertTrue(cap.getAuthTicket().getRefreshToken().equals(REFRESH_TOKEN));
        assertTrue(cap.getAuthTicket().getScope()==AuthenticationScope.Customer);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void authenticateFailTest() throws Exception {

        final CustomerUserAuthInfo userAuthInfo = new CustomerUserAuthInfo();
        userAuthInfo.setUsername(USER_NAME);
        userAuthInfo.setPassword(USER_PASSWORD);

        new Expectations() {
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
            { HttpHelper.getUrl(TENANT_DOMAIN); result=""; }
            { CustomerAuthTicketUrl.createUserAuthTicketUrl(null); result=mockMozuUrl; }
            { mockMozuUrl.getUrl(); result=MOZU_URL; }
            { mockMozuClient.executePostRequest(userAuthInfo, MOZU_URL, (Map<String, String>)any); result=new ApiException(MOZU_ERROR_MSG); }
        };
        
        try {
            CustomerAuthenticator.authenticate(userAuthInfo, TENANT_ID, SITE_ID);
            fail("API Exception expected");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains(MOZU_ERROR_MSG));
        }
    }

    private AuthTicket createAuthTicket() {
        AuthTicket ticket = new AuthTicket();
        ticket.setAccessToken(ACCESS_TOKEN);
        ticket.setAccessTokenExpiration(new DateTime());
        ticket.setRefreshToken(REFRESH_TOKEN);
        ticket.setRefreshTokenExpiration(new DateTime());
        ticket.setSiteId(SITE_ID);
        ticket.setScope(AuthenticationScope.Tenant);
        return ticket;
    }
}
