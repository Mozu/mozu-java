package com.mozu.api.security;

import static org.junit.Assert.*;

import java.io.IOException;

import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.MozuUrl;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class CustomerAuthenticatorUnitTest {

    private static final String TENANT_DOMAIN = "TenantDomain";
    private static final String REFRESH_TOKEN = "RefreshToken";
    private static final String ACCESS_TOKEN = "AccessToken";
    private static final String MOZU_URL = "FakeMozuUrl";
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final String USER_ID = "UserId";
    private static final String USER_NAME = "user_name";
    private static final String USER_PASSWORD = "user_password";
    private static final String MOZU_ERROR_MSG = "Mozu error";

    @Mocked Tenant mockTenant;
    @Mocked MozuUrl mockMozuUrl;
    @Mocked TenantResource mockTenantResource;
    @Mocked DefaultHttpClient mockDefaultHttpClient;
    @Mocked HttpPut mockHttpPut;
    @Mocked HttpPost mockHttpPost;
    @Mocked HttpResponse mockHttpResponse;
    @Mocked HttpEntity mockHttpEntity;
    @Mocked AppAuthenticator mockAppAuthenticator;
    @Mocked HttpHelper mockHttpHelper;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void customerAuthenticatorNoRefreshTest() {
        AuthTicket ticket = createAuthTicket();
        ticket.setAccessTokenExpiration(new DateTime().plus(190000));
        
        AuthTicket cap = CustomerAuthenticator.ensureAuthTicket(ticket);
        assertNull(cap);
    }

    @Test
    public void customerAuthenticatorRefreshTest() throws Exception {
        
        final String custAuthJsonString = createCustomerAuthTicketJson();

        new NonStrictExpectations() {
            {
            mockTenantResource.getTenant(null); 
            result = mockTenant;
            }
            {
                mockTenant.getDomain(); 
                result=TENANT_DOMAIN; 
            }
            {
                CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN); 
                result=mockMozuUrl;
            }
            {
                mockMozuUrl.getUrl(); 
                result=MOZU_URL;
            }
            {
                AppAuthenticator.addAuthHeader(mockHttpPut);
            }
            {
                mockDefaultHttpClient.execute((HttpPut)any); returns(mockHttpResponse);
            }
            {
                HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any );
            }
            {
                mockHttpResponse.getEntity(); 
                result = mockHttpEntity;
            }
            {
                mockHttpEntity.getContent(); 
                result= IOUtils.toInputStream(custAuthJsonString);
        }};
        
        AuthTicket ticket = createAuthTicket();
        CustomerAuthenticationProfile cap = CustomerAuthenticator.refreshUserAuthTicket(ticket, null);
        
        assertTrue(cap.getAuthTicket().getAccessToken().equals(ACCESS_TOKEN));
        assertTrue(cap.getAuthTicket().getRefreshToken().equals(REFRESH_TOKEN));
        assertTrue(cap.getAuthTicket().getScope()==AuthenticationScope.Customer);
    }

    @Test
    public void ioErrorTest() throws Exception {

        new NonStrictExpectations() {
            {
            mockTenantResource.getTenant(null); 
            result = mockTenant;
            }
            {
                mockTenant.getDomain(); 
                result=TENANT_DOMAIN; 
            }
            {
                CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN); 
                result=mockMozuUrl;
            }
            {
                mockMozuUrl.getUrl(); 
                result=MOZU_URL;
            }
            {
                AppAuthenticator.addAuthHeader(mockHttpPut);
            }
            {
                mockDefaultHttpClient.execute((HttpPut)any); returns(mockHttpResponse);
            }
            {
                HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any );
            }
            {
                mockHttpResponse.getEntity(); 
                result = mockHttpEntity;
            }
            {
                mockHttpEntity.getContent(); 
                result = new IOException("Test message");
        }};
        
        AuthTicket ticket = createAuthTicket();
        try {
            CustomerAuthenticator.ensureAuthTicket(ticket);
            fail("I/O Exception expected");
        } catch (ApiException e) {
            assertTrue(e.getMessage().startsWith("IO Exception"));
        }
    }

    @Test
    public void badResponseTest() throws Exception {
        new NonStrictExpectations() {
            {
            mockTenantResource.getTenant(null); 
            result = mockTenant;
            }
            {
                mockTenant.getDomain(); 
                result=TENANT_DOMAIN; 
            }
            {
                CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN); 
                result=mockMozuUrl;
            }
            {
                mockMozuUrl.getUrl(); 
                result=MOZU_URL;
            }
            {
                AppAuthenticator.addAuthHeader(mockHttpPut);
            }
            {
                mockDefaultHttpClient.execute((HttpPut)any); returns(mockHttpResponse);
            }
            {
                HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any );
            }
            {
                mockHttpResponse.getEntity(); 
                result = mockHttpEntity;
            }
            {
                mockHttpEntity.getContent(); 
                result= IOUtils.toInputStream("Bad data");
        }};
        
        AuthTicket ticket = createAuthTicket();
        try {
            CustomerAuthenticator.ensureAuthTicket(ticket);
            fail("JSON Parse error expected");
        } catch (ApiException e) {
            assertTrue( e.getMessage().startsWith("JSON"));
        }
    }

    @Test
    public void authenticateTest() throws Exception {
        final String jsonString = createCustomerAuthTicketJson();

        new NonStrictExpectations() {
            {
            mockTenantResource.getTenant(TENANT_ID); 
            result = mockTenant;
            }
            {
                mockTenant.getDomain(); 
                result=TENANT_DOMAIN; 
            }
            {
                CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN); 
                result=mockMozuUrl;
            }
            {
                mockMozuUrl.getUrl(); 
                result=MOZU_URL;
            }
            {
                AppAuthenticator.addAuthHeader(mockHttpPut);
            }
            {
                mockDefaultHttpClient.execute((HttpPost)any); returns(mockHttpResponse);
            }
            {
                HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any );
            }
            {
                mockHttpResponse.getEntity(); 
                result = mockHttpEntity;
            }
            {
                mockHttpEntity.getContent(); 
                result= IOUtils.toInputStream(jsonString);
        }};
        
        CustomerUserAuthInfo userAuthInfo = new CustomerUserAuthInfo();
        userAuthInfo.setUsername(USER_NAME);
        userAuthInfo.setPassword(USER_PASSWORD);
        CustomerAuthenticationProfile cap = CustomerAuthenticator.authenticate(userAuthInfo, TENANT_ID, SITE_ID);
        
        assertTrue(cap.getAuthTicket().getAccessToken().equals(ACCESS_TOKEN));
        assertTrue(cap.getAuthTicket().getRefreshToken().equals(REFRESH_TOKEN));
        assertTrue(cap.getAuthTicket().getScope()==AuthenticationScope.Customer);
    }

    @Test
    public void authenticateFailTest() throws Exception {

        new NonStrictExpectations() {
            {
            mockTenantResource.getTenant(TENANT_ID); 
            result = mockTenant;
            }
            {
                mockTenant.getDomain(); 
                result=TENANT_DOMAIN; 
            }
            {
                CustomerAuthTicketUrl.refreshUserAuthTicketUrl(REFRESH_TOKEN); 
                result=mockMozuUrl;
            }
            {
                mockMozuUrl.getUrl(); 
                result=MOZU_URL;
            }
            {
                AppAuthenticator.addAuthHeader(mockHttpPut);
            }
            {
                mockDefaultHttpClient.execute((HttpPost)any); returns(mockHttpResponse);
            }
            {
                HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); result=new ApiException(MOZU_ERROR_MSG);
            }
        };
        
        CustomerUserAuthInfo userAuthInfo = new CustomerUserAuthInfo();
        userAuthInfo.setUsername(USER_NAME);
        userAuthInfo.setPassword(USER_PASSWORD);
        try {
            CustomerAuthenticator.authenticate(userAuthInfo, TENANT_ID, SITE_ID);
            fail("API Exception expected");
        } catch (ApiException e) {
            assertEquals(MOZU_ERROR_MSG, e.getMessage());
        }
    }

    private String createCustomerAuthTicketJson() throws JsonProcessingException {
        ObjectMapper mapper = JsonUtils.initObjectMapper();
        return mapper.writeValueAsString(createCustomerAuthTicket());
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
    
    private CustomerAuthTicket createCustomerAuthTicket() {
        CustomerAuthTicket caTicket = new CustomerAuthTicket();
        caTicket.setAccessToken(ACCESS_TOKEN);
        caTicket.setAccessTokenExpiration(new DateTime());
        caTicket.setCustomerAccount(null);
        caTicket.setRefreshToken(REFRESH_TOKEN);
        caTicket.setRefreshTokenExpiration(new DateTime());
        caTicket.setUserId(USER_ID);
        return caTicket;
    }
}
