package com.mozu.api.security;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.resources.platform.applications.AuthTicketResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.utils.ConfigProperties;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

/**
 *  This test aims to test the AppAuthenticator by mocking out the
 *  rest calls. 
 * 
 */
public class AppAuthenticatorUnitTest {

    private static final String BAD_URL = "BadUrl/";

    @Mocked HttpPost mockHttpPost;
    @Mocked DefaultHttpClient mockHttpClient;
    @Mocked HttpResponse mockHttpResponse;
    @Mocked HttpEntity mockHttpEntity;
    
    @Before
    public void setUp() throws Exception {
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
     * Basic initialize with no parameters.
     * 
     * @throws Exception
     */
    @Test
    public void baseInitializeTest() throws Exception {
        
        final String jsonString = createAuthTicketJson();
        
        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); }
            { mockHttpResponse.getEntity(); result=mockHttpEntity; }
            { mockHttpEntity.getContent(); result= IOUtils.toInputStream(jsonString); }
        };
        
        AppAuthenticator.initialize();
    }

    /**
     * Initialize passing explicit AppAuthInfo and default base url
     * 
     * @throws Exception
     */
    @Test
    public void initializeWithURLTest() throws Exception {
        
        final String jsonString = createAuthTicketJson();

        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); }
            { mockHttpResponse.getEntity(); result=mockHttpEntity; }
            { mockHttpEntity.getContent(); result= IOUtils.toInputStream(jsonString); }
        };

        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(ConfigProperties.getStringProperty(ConfigProperties.APP_ID));
        appAuthInfo.setSharedSecret(ConfigProperties.getStringProperty(ConfigProperties.SHARED_SECRET));
        AppAuthenticator.initialize(appAuthInfo, ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL));
    }
    /**
     * Test an error in I/O when making the request
     * 
     * @throws Exception
     */

    @Test
    public void initializeIOExceptionTest() throws Exception {
        
        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); result=new IOException("Test IO Exception"); }
        };
        
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(ConfigProperties.getStringProperty(ConfigProperties.APP_ID));
        appAuthInfo.setSharedSecret(ConfigProperties.getStringProperty(ConfigProperties.SHARED_SECRET));
        try {
            AppAuthenticator.initialize(appAuthInfo, ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL));
            fail("API exception expected");
        } catch (ApiException e) {
            //expected
            assertEquals("IO Exception occurred while authenticating application: Test IO Exception", e.getMessage());
        }
    }

    /**
     * Test an error response sent from the server
     * 
     * @throws Exception
     */
    @Test
    public void initializeErrorResponseTest() throws Exception {
        
        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); result=new ApiException("Mozu Error: "); }
        };
        
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        try {
            AppAuthenticator.initialize(appAuthInfo, BAD_URL);
            fail("404 Not found excpected");
        } catch (ApiException e) {
            //expected
            assertEquals("Mozu Error: ", e.getMessage());
        }
    }
    
    /**
     * Test a response with bad JSON data
     * 
     * @throws Exception
     */
    @Test
    public void InitializeBadResponseError() throws Exception {
        
        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); }
            { mockHttpResponse.getEntity(); result=mockHttpEntity; }
            { mockHttpEntity.getContent(); result= IOUtils.toInputStream("Bad Data"); }
        };
        
        try {
            AppAuthenticator.initialize();
            fail("JSON Parse error expected");
        } catch (ApiException e) {
            assertTrue( e.getMessage().startsWith("JSON"));
        }
    }
    
    /**
     * Initialize, then refresh the app auth ticket.
     * 
     * @throws Exception
     */
    @Test
    public void refreshAppAuthTest() throws Exception {
        
        final String jsonString = createAuthTicketJson();
        final InputStream iStream = IOUtils.toInputStream(jsonString);;

        new NonStrictExpectations() {
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); }
            { mockHttpResponse.getEntity(); result=mockHttpEntity; }
            { mockHttpEntity.getContent(); result=iStream; }
            { mockHttpPost.setHeader("Accept", "application/json"); }
            { mockHttpPost.setHeader("Content-type", "application/json"); }
            { mockHttpClient.execute((HttpEntityEnclosingRequestBase)any); returns(mockHttpResponse); }
            @SuppressWarnings("unused")
            HttpHelper hh2;
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper) any ); }
            { mockHttpResponse.getEntity(); result=mockHttpEntity; }
            { mockHttpEntity.getContent(); result=iStream; }
        };

        AppAuthenticator.initialize();
        AppAuthenticator auth = AppAuthenticator.getInstance();
        
        // must reset the stream for the jmockit to re-read
        iStream.reset();
        
        auth.refreshAppAuthTicket();
    }
    
    private String createAuthTicketJson() throws JsonProcessingException {
        ObjectMapper mapper = JsonUtils.initObjectMapper();
        return mapper.writeValueAsString(createAuthTicket());
    }

    private AuthTicket createAuthTicket() {
        AuthTicket ticket = new AuthTicket();
        ticket.setAccessToken("AccessToken");
        ticket.setAccessTokenExpiration(new DateTime());
        ticket.setRefreshToken("RefreshToken");
        ticket.setRefreshTokenExpiration(new DateTime());
        return ticket;
    }
}
