package com.mozu.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.InputStream;

import mockit.Expectations;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.HttpHelper;

public final class MozuClientUnitTest {
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final Integer MASTER_CATALOG_ID = new Integer(33);
    private static final Integer CATALOG_ID = new Integer(44);
    private static final String TENANT_URL = "http://TenantUrl";
    private static final String BASE_URL = "http://BaseUrl";
    protected static final String AUTH_ACCESS_TOKEN = "AuthAccessToken";
    private static final String BODY_STRING = "{\"body\": [{\"key1\":\"value1\"}, {\"key2\":\"value2\"}]}";
    private static final String TENANT_DOMAIN = "TenantDomain";
    
    @Mocked ApiContext mockApiContext;
    @Mocked MozuUrl mockResourceUrl;
    @Mocked AppAuthenticator mockAppAuthenticator;
    @Mocked AuthTicket mockAuthTicket;
    @Mocked AuthenticationProfile mockAuthenticationProfile;
    @Mocked InputStream mockInStream;
    @Mocked HttpResponse mockHttpResponse;
    @Mocked TenantResource mockTenantResource;
    @Mocked Tenant mockTenant;
    @Mocked BasicHttpEntityEnclosingRequest mockHttpRequest;
    @Mocked DefaultHttpClient mockHttpClient;
    @Mocked HttpHelper mockHttpelper;
    @Mocked UserAuthenticator mockUserAuthenticator;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setContextTest() throws Exception {

        new NonStrictExpectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            
            // validateContext
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }
        };

        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.validateContext();
    }

    @Test
    public void setContextEmptyUrlTest() throws Exception {

        new NonStrictExpectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            
            // validateContext
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=""; }
            { mockTenantResource.getTenant(TENANT_ID); returns(mockTenant); }
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
        };

        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.validateContext();
    }

    @Test
    public void setContextBadTenantIdTest() {

        new Expectations() {
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=new Integer(0); }
        };

        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
            fail("ApiException expected");
        } catch (ApiException apiException) {
            // expected
            assertEquals("TenantId is missing", apiException.getMessage());
        } catch (Exception e) {
            fail("Context failed validation: " + e.getMessage());
        }
    }

    @Test
    public void setContextBadResourceUrlTest() {

        new Expectations() {
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
        };

        MozuConfig.setBaseUrl(BASE_URL);
        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
        } catch (Exception e) {
            fail("Context failed validation " + e.getMessage());
        }
    }

    @Test
    public void setContextBlankAuthBaseUrlTest() {

        new Expectations() {
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { MozuConfig.getBaseUrl(); result=""; }
        };

        MozuConfig.setBaseUrl("");
        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
            fail("ApiException expected");
        } catch (ApiException apiException) {
            // expected
            assertEquals("Authentication.Instance.BaseUrl is missing", apiException.getMessage());
        } catch (Exception e) {
            fail("Context failed validation " + e.getMessage());
        }
    }

//    @Test
//    public void setUserAuthTest() {
//        final DateTime curDate = new DateTime();
//        
//        new Expectations() {
//            { UserAuthenticator.ensureAuthTicket(mockAuthTicket); result=mockAuthTicket; }
//            { mockAuthenticationProfile.getAuthTicket(); result=mockAuthTicket; }
//            { mockAuthTicket.getAccessToken(); result=AUTH_ACCESS_TOKEN; }
//            { mockAuthTicket.setAccessToken(AUTH_ACCESS_TOKEN); }
//            { mockAuthenticationProfile.getAuthTicket(); result=mockAuthTicket; }
//            { mockAuthTicket.getAccessTokenExpiration(); result=curDate; }
//            { mockAuthTicket.setAccessTokenExpiration(curDate); }
//            { mockAuthTicket.getAccessToken(); result=AUTH_ACCESS_TOKEN; }
//        }; 
//        
//        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
//        
//        Map<String, String> headers = mozuClient.getHeaders();
//        assertNotNull(headers.get(Headers.X_VOL_USER_CLAIMS));
//        assertEquals(AUTH_ACCESS_TOKEN, headers.get(Headers.X_VOL_USER_CLAIMS));
//    }
//
//    @Test
//    public void setUserAuthNullAuthTest() {
//        new Expectations() {
//            { UserAuthenticator.ensureAuthTicket(mockAuthTicket); result=null; }
//            { mockAuthTicket.getAccessToken(); result=AUTH_ACCESS_TOKEN; }
//        }; 
//        
//        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
//        
//        Map<String, String> headers = mozuClient.getHeaders();
//        assertNotNull(headers.get(Headers.X_VOL_USER_CLAIMS));
//        assertEquals(AUTH_ACCESS_TOKEN, headers.get(Headers.X_VOL_USER_CLAIMS));
//    }
    
    @Test
    public void executeRequestGetTest() throws Exception {
        
        new NonStrictExpectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            
            // validateContext
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

            // buildRequest
            { mockResourceUrl.getUrl(); result=TENANT_URL; }
            { mockHttpRequest.setEntity((StringEntity)any); }
            { mockHttpRequest.setHeader(anyString, anyString); times=2; }
            { AppAuthenticator.addAuthHeader(mockHttpRequest); }
            { mockHttpRequest.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION); }
            
            { mockHttpClient.execute((HttpHost)any, mockHttpRequest); result=mockHttpResponse; }
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper)any); }
        };

        MozuClient<InputStream> mozuClient = new MozuClient<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setVerb("GET");
        mozuClient.setBody(BODY_STRING);
        mozuClient.executeRequest();
    }

    @Test
    public void executeRequestPostTest() throws Exception {
        new NonStrictExpectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            
            // validateContext
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

            // buildRequest
            { mockResourceUrl.getUrl(); result=TENANT_URL; }
            { mockHttpRequest.setEntity((StringEntity)any); }
            { mockHttpRequest.setHeader(anyString, anyString); times=2; }

            { AppAuthenticator.addAuthHeader(mockHttpRequest); }
            { mockHttpRequest.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION); }
            
            { mockHttpClient.execute((HttpHost)any, mockHttpRequest); result=mockHttpResponse; }
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper)any); }
        };

        MozuClient<java.io.InputStream> mozuClient = new MozuClient<java.io.InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setBody(BODY_STRING);
        mozuClient.setVerb("POST");
        mozuClient.executeRequest();
    }
    
   @Test
    public void executeRequestPutTest() throws Exception {
       new NonStrictExpectations() {
           // setContext
           { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
           { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
           { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
           { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
           
           // validateContext
           { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
           { mockApiContext.getTenantId(); result=TENANT_ID; }
           { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

           // buildRequest
           { mockResourceUrl.getUrl(); result=TENANT_URL; }
           { mockHttpRequest.setEntity((StringEntity)any); }
           { mockHttpRequest.setHeader(anyString, anyString); times=2; }
           { AppAuthenticator.addAuthHeader(mockHttpRequest); }
           { mockHttpRequest.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION); }
           
           { mockHttpClient.execute((HttpHost)any, mockHttpRequest); result=mockHttpResponse; }
           { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper)any); }
       };

        MozuClient<java.io.InputStream> mozuClient = new MozuClient<java.io.InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setBody(BODY_STRING);
        mozuClient.setVerb("PUT");
        mozuClient.executeRequest();
    }
 
    @Test
    public void executeRequestDeleteTest() throws Exception {
        new NonStrictExpectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            
            // validateContext
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

            // buildRequest
            { mockResourceUrl.getUrl(); result=TENANT_URL; }
            { mockHttpRequest.setEntity((StringEntity)any); }
            { mockHttpRequest.setHeader(anyString, anyString); times=2; }

            { AppAuthenticator.addAuthHeader(mockHttpRequest); }
            { mockHttpRequest.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION); }
            
            { mockHttpClient.execute((HttpHost)any, mockHttpRequest); result=mockHttpResponse; }
            
            { HttpHelper.ensureSuccess(mockHttpResponse, (ObjectMapper)any); }
        };

        MozuClient<java.io.InputStream> mozuClient = new MozuClient<java.io.InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setVerb("DELETE");
        mozuClient.executeRequest();
    }
}
