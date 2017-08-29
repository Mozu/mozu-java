package com.mozu.client;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
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
import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({AppAuthenticator.class, MozuHttpClientPool.class})
public final class MozuClientUnitTest {
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final Integer MASTER_CATALOG_ID = new Integer(33);
    private static final Integer CATALOG_ID = new Integer(44);
    private static final String TENANT_URL = "http://TenantUrl";
    private static final String BASE_URL = "http://BaseUrl";
    private static final String BASE_PCI_URL = "http://BasePciUrl";
    private static final String BASE_DEV_PCI_URL = "http://BaseDevPciUrl";
    protected static final String AUTH_ACCESS_TOKEN = "AuthAccessToken";
    private static final String BODY_STRING = "{\"body\": [{\"key1\":\"value1\"}, {\"key2\":\"value2\"}]}";
    private static final String TENANT_DOMAIN = "TenantDomain";
    private static final String LOCALE = "en_US";
    private static final String CURRENCY = "USD";
    
    @Mock ApiContext mockApiContext;
    @Mock MozuUrl mockResourceUrl;
    @Mock AppAuthenticator mockAppAuthenticator;
    @Mock AuthTicket mockAuthTicket;
    @Mock AuthenticationProfile mockAuthenticationProfile;
    @Mock InputStream mockInStream;
    @Mock CloseableHttpResponse mockHttpResponse;
    @Mock TenantResource mockTenantResource;
    @Mock Tenant mockTenant;
    @Mock BasicHttpEntityEnclosingRequest mockHttpRequest;
    @Mock CloseableHttpClient mockHttpClient;
    @Mock UserAuthenticator mockUserAuthenticator;
    @Mock StatusLine mockStatusLine;
    @Mock HttpEntity mockHttpEntity;
    @Mock InputStream mockInputStream;
    @Mock RequestLine mockRequestLine;
    @Mock CacheManager<CacheItem> mockCacheManager;
    @Mock Map<String, String> mockCustomHeader;
    @Mock MozuHttpClientPool mockClientPool;

    static {
        try {
            Class clss = Class.forName("javax.crypto.JceSecurity");
            Field field = clss.getDeclaredField("isRestricted");
            field.setAccessible(true);
            field.set(null, java.lang.Boolean.FALSE);
        } catch (Exception ex) {
            System.out.println("javax.crypto.JceSecurity policy issue: " + ex.getMessage());
        }
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setContextTest() throws Exception {


        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
           
        // validateContext
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);


        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.validateContext();
    }

    @Test
    public void setContextEmptyUrlTest() throws Exception {

        TenantResource mockTenantResource =  Mockito.mock(TenantResource.class);
        when(mockTenantResource.getTenant(TENANT_ID)).thenReturn(mockTenant);


        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);

        // validateContext
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        BDDMockito.given(AppAuthenticator.isUseSSL()).willReturn(true);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);
        when(mockTenant.getDomain()).thenReturn(TENANT_DOMAIN);


        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.validateContext();
    }

    @Test
    public void setContextBadTenantIdTest() {

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);

        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockApiContext.getTenantId()).thenReturn(0);

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);

        try {
            mozuClient.validateContext();
        } catch (ApiException apiException) {
            assertEquals("TenantId is missing", apiException.getMessage());
        } catch (Exception e) {
            fail("Context failed validation: " + e.getMessage());
        }
    }

    @Test
    public void setContextBadResourceUrlTest() {

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.HOME_POD);

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

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(null);



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

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.HOME_POD);


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

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);

        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.PCI_POD);



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
    public void setContextBasePciUrlTest() throws Exception {
        TenantResource mockTenantResource =  Mockito.mock(TenantResource.class);
        when(mockTenantResource.getTenant(TENANT_ID)).thenReturn(mockTenant);


        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);



        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        BDDMockito.given(AppAuthenticator.isUseSSL()).willReturn(false);

        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockTenant.getDomain()).thenReturn(TENANT_DOMAIN);
        when(mockTenant.getIsDevTenant()).thenReturn(false);

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
    public void setContextBaseDevPciUrl() throws Exception {
        TenantResource mockTenantResource =  Mockito.mock(TenantResource.class);
        when(mockTenantResource.getTenant(TENANT_ID)).thenReturn(mockTenant);

        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);



        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        BDDMockito.given(AppAuthenticator.isUseSSL()).willReturn(false);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);
        when(mockTenant.getDomain()).thenReturn(TENANT_DOMAIN);
        when(mockTenant.getIsDevTenant()).thenReturn(true);

        MozuConfig.setBaseDevPciUrl(BASE_DEV_PCI_URL);
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
        //Mock stubs
        PowerMockito.mockStatic(MozuHttpClientPool.class);
        PowerMockito.mockStatic(AppAuthenticator.class);


        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(null);

        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        BDDMockito.given(AppAuthenticator.isUseSSL()).willReturn(true);

        //Setup Request
        when(mockHttpClient.execute(any(HttpHost.class), any(HttpRequest.class))).thenReturn(mockHttpResponse);
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
        when(mockStatusLine.getStatusCode()).thenReturn(200);
        when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);
        when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);
        when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
        when(mockHttpResponse.getEntity()).thenReturn(mockHttpEntity);

        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);
        when(mockTenant.getDomain()).thenReturn(TENANT_DOMAIN);
        when(mockTenant.getIsDevTenant()).thenReturn(true);
        when(mockClientPool.getHttpClient()).thenReturn(mockHttpClient);


        BDDMockito.given(MozuHttpClientPool.getInstance()).willReturn(mockClientPool);

        // buildRequest
        when(mockResourceUrl.getUrl()).thenReturn(TENANT_URL);
        when(mockApiContext.getUserAuthTicket()).thenReturn(null);


        BDDMockito.given(AppAuthenticator.addAuthHeader()).willReturn("");
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockRequestLine.getUri()).thenReturn("SomeString");
        when(mockHttpRequest.containsHeader(anyString())).thenReturn(false);

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
        PowerMockito.mockStatic(MozuHttpClientPool.class);


        //Stub client pool methods
        BDDMockito.given(MozuHttpClientPool.getInstance()).willReturn(mockClientPool);
        when(mockClientPool.getHttpClient()).thenReturn(mockHttpClient);

        // setContext
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);

        //Validate Context
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);

        //buildRequest
        when(mockResourceUrl.getUrl()).thenReturn(TENANT_URL);
        when(mockApiContext.getUserAuthTicket()).thenReturn(null);

        BDDMockito.given(AppAuthenticator.addAuthHeader()).willReturn("");
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockRequestLine.getUri()).thenReturn("SomeString");
        when(mockApiContext.getCurrency()).thenReturn(null);
        when(mockApiContext.getLocale()).thenReturn(null);
        when(mockHttpRequest.containsHeader(anyString())).thenReturn(false);

        when(mockHttpClient.execute(any(HttpHost.class),any(HttpRequest.class))).thenReturn(mockHttpResponse);
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
        when(mockStatusLine.getStatusCode()).thenReturn(404);
        when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);
        when(mockRequestLine.getUri()).thenReturn("SomeString");
        when(mockHttpResponse.getEntity()).thenReturn(mockHttpEntity);


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
        PowerMockito.mockStatic(MozuHttpClientPool.class);

        //Stub client pool methods
        BDDMockito.given(MozuHttpClientPool.getInstance()).willReturn(mockClientPool);
        when(mockClientPool.getHttpClient()).thenReturn(mockHttpClient);

        //setContext
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);

        //validateContext
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);

        // buildRequest
        when(mockResourceUrl.getUrl()).thenReturn(TENANT_URL);
        when(mockApiContext.getUserAuthTicket()).thenReturn(null);

        BDDMockito.given(AppAuthenticator.addAuthHeader()).willReturn("");
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockRequestLine.getUri()).thenReturn("SomeString");

        when(mockApiContext.getCurrency()).thenReturn(null);
        when(mockApiContext.getLocale()).thenReturn(null);
        when(mockHttpRequest.containsHeader(anyString())).thenReturn(false);
        when(mockHttpClient.execute(any(HttpHost.class),any(HttpRequest.class))).thenReturn(mockHttpResponse);
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
        when(mockStatusLine.getStatusCode()).thenReturn(200);
        when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setBody(BODY_STRING);
        mozuClient.setVerb("POST");
        mozuClient.executeRequest();
    }

   @Test
    public void executeRequestPutTest() throws Exception {
       PowerMockito.mockStatic(MozuHttpClientPool.class);

       //Stub client pool methods
       BDDMockito.given(MozuHttpClientPool.getInstance()).willReturn(mockClientPool);
       when(mockClientPool.getHttpClient()).thenReturn(mockHttpClient);

       //setContext
       when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
       when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
       when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
       when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
       when(mockApiContext.getLocale()).thenReturn(LOCALE);
       when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
       when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
       when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);

       //validateContext
       PowerMockito.mockStatic(AppAuthenticator.class);
       BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
       when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);

       // buildRequest
       when(mockResourceUrl.getUrl()).thenReturn(TENANT_URL);
       when(mockApiContext.getUserAuthTicket()).thenReturn(null);
       BDDMockito.given(AppAuthenticator.addAuthHeader()).willReturn("");
       when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
       when(mockRequestLine.getUri()).thenReturn("SomeString");

       when(mockApiContext.getCurrency()).thenReturn(null);
       when(mockApiContext.getLocale()).thenReturn(null);
       when(mockHttpRequest.containsHeader(anyString())).thenReturn(false);

       when(mockHttpClient.execute(any(HttpHost.class),any(HttpRequest.class))).thenReturn(mockHttpResponse);
       when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
       when(mockStatusLine.getStatusCode()).thenReturn(200);
       when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);
       when(mockHttpResponse.getEntity()).thenReturn(mockHttpEntity);

       CacheManagerFactory.setCacheManager(mockCacheManager);;

       MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();

       mozuClient.setContext(mockApiContext);
       mozuClient.setResourceUrl(mockResourceUrl);
       mozuClient.setBaseAddress(BASE_URL);
       mozuClient.setBody(BODY_STRING);
       mozuClient.setVerb("PUT");
       mozuClient.executeRequest();
       mozuClient.getResult();
    }

    @Test
    public void executeRequestDeleteTest() throws Exception {
        PowerMockito.mockStatic(MozuHttpClientPool.class);

        //Stub client pool methods
        BDDMockito.given(MozuHttpClientPool.getInstance()).willReturn(mockClientPool);
        when(mockClientPool.getHttpClient()).thenReturn(mockHttpClient);

        //setContext
        when(mockApiContext.getTenantId()).thenReturn(TENANT_ID);
        when(mockApiContext.getSiteId()).thenReturn(SITE_ID);
        when(mockApiContext.getMasterCatalogId()).thenReturn(MASTER_CATALOG_ID);
        when(mockApiContext.getCatalogId()).thenReturn(CATALOG_ID);
        when(mockApiContext.getLocale()).thenReturn(LOCALE);
        when(mockApiContext.getCurrency()).thenReturn(CURRENCY);
        when(mockApiContext.getCustomHeaders()).thenReturn(mockCustomHeader);
        when(mockApiContext.getTenantUrl()).thenReturn(TENANT_URL);

        //validateContext
        PowerMockito.mockStatic(AppAuthenticator.class);
        BDDMockito.given(AppAuthenticator.getInstance()).willReturn(mockAppAuthenticator);
        when(mockResourceUrl.getLocation()).thenReturn(MozuUrl.UrlLocation.TENANT_POD);
        when(mockResourceUrl.getUrl()).thenReturn(TENANT_URL);

        //Build Request
        when(mockApiContext.getUserAuthTicket()).thenReturn(null);
        BDDMockito.given(AppAuthenticator.addAuthHeader()).willReturn("");
        when(mockHttpRequest.getRequestLine()).thenReturn(mockRequestLine);
        when(mockRequestLine.getUri()).thenReturn("SomeString");

        when(mockApiContext.getCurrency()).thenReturn(null);
        when(mockApiContext.getLocale()).thenReturn(null);
        when(mockHttpRequest.containsHeader(anyString())).thenReturn(false);


        when(mockHttpClient.execute(any(HttpHost.class),any(HttpRequest.class))).thenReturn(mockHttpResponse);
        when(mockHttpResponse.getStatusLine()).thenReturn(mockStatusLine);
        when(mockStatusLine.getStatusCode()).thenReturn(200);
        when(mockHttpResponse.containsHeader(anyString())).thenReturn(false);
        when(mockHttpResponse.getEntity()).thenReturn(mockHttpEntity);

        MozuClientImpl<InputStream> mozuClient = new MozuClientImpl<InputStream>();
        mozuClient.setContext(mockApiContext);
        mozuClient.setResourceUrl(mockResourceUrl);
        mozuClient.setBaseAddress(BASE_URL);
        mozuClient.setVerb("DELETE");
        mozuClient.executeRequest();
    }
}
