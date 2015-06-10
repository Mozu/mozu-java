package com.mozu.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.AsyncCallback;
import com.mozu.api.MozuConfig;
import com.mozu.api.MozuUrl;
import com.mozu.api.cache.CacheManager;
import com.mozu.api.cache.CacheManagerFactory;
import com.mozu.api.cache.impl.CacheItem;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.MozuHttpClientPool;

public final class MozuClientUnitTest {
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final Integer MASTER_CATALOG_ID = new Integer(33);
    private static final Integer CATALOG_ID = new Integer(44);
    private static final String TENANT_URL = "http://TenantUrl";
    private static final String BASE_URL = "http://BaseUrl";
    private static final String BASE_PCI_URL = "http://BasePciUrl";
    protected static final String AUTH_ACCESS_TOKEN = "AuthAccessToken";
    private static final String BODY_STRING = "{\"body\": [{\"key1\":\"value1\"}, {\"key2\":\"value2\"}]}";
    private static final String TENANT_DOMAIN = "TenantDomain";
    private static final String LOCALE = "en_US";
    private static final String CURRENCY = "USD";
    
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
    @Mocked CloseableHttpAsyncClient mockHttpClient;
    @Mocked UserAuthenticator mockUserAuthenticator;
    @Mocked StatusLine mockStatusLine;
    @Mocked HttpEntity mockHttpEntity;
    @Mocked InputStream mockInputStream;
    @Mocked RequestLine mockRequestLine;
    @Mocked CacheManager<CacheItem> mockCacheManager;
    @Mocked MozuHttpClientPool mockClientPool;
    @Mocked CountDownLatch mockLatch;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setContextTest() throws Exception {

        new Expectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2; }
            { mockApiContext.getCurrency(); result=CURRENCY; times=2; }
            
            // validateContext
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.validateContext();
    }

    @Test
    public void setContextEmptyUrlTest() throws Exception {

        new MockUp<TenantResource>() {
            @Mock void $init() {}
            @Mock Tenant getTenant(Integer tenantId) throws Exception {
                        return mockTenant;
            }
        };

        new Expectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2; }
            { mockApiContext.getCurrency(); result=CURRENCY; times=2; }

            // validateContext
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=""; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockTenant.getDomain(); result=TENANT_DOMAIN; }
            { AppAuthenticator.isUseSSL(); result=anyBoolean; }
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
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
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=new Integer(0); }
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
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
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
            
        };

        MozuConfig.setBaseUrl(BASE_URL);
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
        } catch (Exception e) {
            fail("Context failed validation " + e.getMessage());
        }
    }
    
    @Test
    public void setBlankAppAuthenticatorTest() {

        new Expectations() {
        	{ mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=null; }
           
        };
   
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
              
        try {
            mozuClient.validateContext();
            fail("ApiException expected");
        } catch (ApiException apiException) {
            // expected
            assertEquals("Application has not been authorized to access Mozu.", apiException.getMessage());
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
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.HOME_POD; }
           
            { MozuConfig.getBaseUrl(); result=""; }
        };

        MozuConfig.setBaseUrl("");
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
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
    
    @Test
    public void setContextBlankBasePciUrlTest() {

        new Expectations() {
        	{ mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
           
        };

        MozuConfig.setBasePciUrl("");
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        //mozuClient.set
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
            fail("ApiException expected");
        } catch (ApiException apiException) {
            // expected
            assertEquals("Authentication.Instance.BasePciUrl is missing", apiException.getMessage());
        } catch (Exception e) {
            fail("Context failed validation " + e.getMessage());
        }
    }
    
    @Test
    public void setContextBasePciUrlTest() {

    	new Expectations() {
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.PCI_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            
        };

        MozuConfig.setBasePciUrl(BASE_PCI_URL);
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        
        try {
            mozuClient.validateContext();
        } catch (Exception e) {
            fail("Context failed validation " + e.getMessage());
        }
    }


    @Test
    public void executeRequestGetTest() throws Exception {
        
        new MockUp<BasicHttpEntityEnclosingRequest>() {
            @Mock void $init(String method, String uri) {}
            @Mock void setEntity(HttpEntity entity) {}
            @Mock void setHeader(String name, String value) {}
            @Mock void addHeader(String name, String value) {}
            
        };
        
        new MockUp<org.apache.commons.io.IOUtils>() {
            @Mock String toString(InputStream inStream, String type) {
                return "{}";
            }
        };
        
        new Expectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            
            // validateContext
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

            {MozuHttpClientPool.getInstance(); result=mockClientPool;}
            {mockClientPool.getHttpClient(); result=mockHttpClient;}

            // buildRequest
            { mockResourceUrl.getUrl(); result=TENANT_URL; }
            { mockApiContext.getUserAuthTicket(); result=null; }
            
            { AppAuthenticator.addAuthHeader(); result=anyString; }
            {mockHttpRequest.getRequestLine(); result=mockRequestLine;}
            {mockRequestLine.getUri(); result="SomeString";}

            { mockApiContext.getSiteId(); result=SITE_ID; times=2; }
            {mockApiContext.getCurrency(); result=null;}
            {mockApiContext.getLocale(); result=null;}
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=2; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=2; }
            {mockHttpRequest.containsHeader(anyString); result=false;}

            // Execute request
            {CacheManagerFactory.getCacheManager(); result=null;}
            {new CountDownLatch(1); result=mockLatch;}
            {mockHttpClient.execute((HttpHost)any, (HttpRequest)any, (FutureCallback<HttpResponse>)any);}
            {mockLatch.await();}
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setVerb("GET");
        mozuClient.setBody(BODY_STRING);
        mozuClient.executeRequest();
        mozuClient.getResult();
    }

    @Test
    public void executeRequestGetExceptionTest() throws Exception {
        
        new MockUp<BasicHttpEntityEnclosingRequest>() {
            @Mock void $init(String method, String uri) {}
            @Mock void setEntity(HttpEntity entity) {}
            @Mock void setHeader(String name, String value) {}
            @Mock void addHeader(String name, String value) {}
            
        };
        
        new MockUp<org.apache.commons.io.IOUtils>() {
            @Mock String toString(InputStream inStream, String type) {
                return "{}";
            }
        };
        
        new Expectations() {
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            
            // validateContext
            { AppAuthenticator.getInstance(); result=mockAppAuthenticator; }
            { mockResourceUrl.getLocation(); result=MozuUrl.UrlLocation.TENANT_POD; }
            { mockApiContext.getTenantId(); result=TENANT_ID; }
            { mockApiContext.getTenantUrl(); result=TENANT_URL; times=2; }

            {MozuHttpClientPool.getInstance(); result=mockClientPool;}
            {mockClientPool.getHttpClient(); result=mockHttpClient;}

            // buildRequest
            { mockResourceUrl.getUrl(); result=TENANT_URL; }
            { mockApiContext.getUserAuthTicket(); result=null; }
            
            { AppAuthenticator.addAuthHeader(); result=anyString; }
            {mockHttpRequest.getRequestLine(); result=mockRequestLine;}
            {mockRequestLine.getUri(); result="SomeString";}

            { mockApiContext.getSiteId(); result=SITE_ID; times=2; }
            {mockApiContext.getCurrency(); result=null;}
            {mockApiContext.getLocale(); result=null;}
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=2; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=2; }
            {mockHttpRequest.containsHeader(anyString); result=false;}
            
            // Execute request
            {CacheManagerFactory.getCacheManager(); result=null;}
            {new CountDownLatch(1); result=mockLatch;}
            {mockHttpClient.execute((HttpHost)any, (HttpRequest)any, (FutureCallback<HttpResponse>)any); 
                result=new ApiException("Error returned from Mozu");}
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setVerb("GET");
        mozuClient.setBody(BODY_STRING);
        try {
            mozuClient.executeRequest();
            fail("404 Test Exception expected");
        } catch (ApiException ae) {
            // expected
            assertTrue(ae.getMessage().contains("Error returned from Mozu"));
        }
    }

    @Test
    public void executeRequestPostTest() throws Exception {
        
        new MockUp<HttpPost>() {
            @Mock void $init(String method) {}
            @Mock void setEntity(HttpEntity entity) {}
            @Mock void setHeader(String name, String value) {}
            @Mock void addHeader(String name, String value) {}
            
        };
        new Expectations() {
            
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            
            {new CountDownLatch(1); result=mockLatch;}
            {MozuHttpClientPool.getInstance(); result=mockClientPool;}
            {mockClientPool.getHttpClient(); result=mockHttpClient;}

            // Execute request
            {mockHttpClient.execute((HttpEntityEnclosingRequestBase)any, (FutureCallback<HttpResponse>)any);}
            {mockLatch.await();}
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.executePostRequest(BODY_STRING, BASE_URL, new HashMap<String, String>());
    }
    
   @Test
    public void executeRequestPutTest() throws Exception {
       
       new MockUp<HttpPut>() {
           @Mock void $init(String method) {}
           @Mock void setEntity(HttpEntity entity) {}
           @Mock void setHeader(String name, String value) {}
           @Mock void addHeader(String name, String value) {}
           
       };
       new Expectations() {
           
           // setContext
           { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
           { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
           { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
           { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
           { mockApiContext.getLocale(); result=LOCALE; times=2;}
           { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
           
           {new CountDownLatch(1); result=mockLatch;}
           {MozuHttpClientPool.getInstance(); result=mockClientPool;}
           {mockClientPool.getHttpClient(); result=mockHttpClient;}

           // Execute request
           {mockHttpClient.execute((HttpEntityEnclosingRequestBase)any, (FutureCallback<HttpResponse>)any);}
           {mockLatch.await();}
       };

       MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
       mozuClient.setContext(mockApiContext);
       mozuClient.setResourceUrl(mockResourceUrl);
       mozuClient.executePutRequest(BODY_STRING, BASE_URL, new HashMap<String, String>());
    }
 
    @Test
    public void executeRequestDeleteTest() throws Exception {
        new MockUp<HttpDelete>() {
            @Mock void $init(String method) {}
            @Mock void setHeader(String name, String value) {}
            @Mock void addHeader(String name, String value) {}
            
        };
        new Expectations() {
            
            // setContext
            { mockApiContext.getTenantId(); result=TENANT_ID; times=2; }
            { mockApiContext.getSiteId(); result=SITE_ID; times=3; }
            { mockApiContext.getMasterCatalogId(); result=MASTER_CATALOG_ID; times=3; }
            { mockApiContext.getCatalogId(); result=CATALOG_ID; times=3; }
            { mockApiContext.getLocale(); result=LOCALE; times=2;}
            { mockApiContext.getCurrency(); result=CURRENCY; times=2;}
            
            {new CountDownLatch(1); result=mockLatch;}
            {MozuHttpClientPool.getInstance(); result=mockClientPool;}
            {mockClientPool.getHttpClient(); result=mockHttpClient;}

            // Execute request
            {mockHttpClient.execute((HttpRequestBase)any, (FutureCallback<HttpResponse>)any);}
            {mockLatch.await();}
        };

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.executeDeleteRequest(BASE_URL, new HashMap<String, String>());
    }
    
    @Mocked 
    AsyncCallback<InputStream> mockCallback;
    
    @Test
    public void callbackTest() throws Exception {
        new MockUp<EntityUtils>() {
            @Mock void consume(HttpEntity entity) {}
        };

        new Expectations() {
            // EnsureSuccess
            {mockHttpRequest.getRequestLine(); result=mockRequestLine;}
            { mockHttpResponse.getStatusLine(); result=mockStatusLine; }
            { mockStatusLine.getStatusCode(); result=200; }
            {mockHttpResponse.containsHeader(anyString); result=false;}
            
            // SetCache
            {mockHttpResponse.containsHeader(anyString); result=false;}
            
            // GetResult
            {mockHttpResponse.getStatusLine();result=mockStatusLine;}
            {mockStatusLine.getStatusCode();result=200;}
            {mockHttpResponse.getEntity(); result=mockHttpEntity;}
            {mockHttpEntity.getContent(); result=mockInputStream;}
            {mockHttpResponse.getEntity(); result=mockHttpEntity;}
            
            {mockCallback.success((InputStream)any);}
        };
        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>(InputStream.class);
        MozuClientImpl<InputStream>.BaseCallbackHandler callbackHandler = 
                mozuClient.new BaseCallbackHandler(mockCallback, mockLatch, mockHttpRequest);
        callbackHandler.completed(mockHttpResponse);
    }
}
