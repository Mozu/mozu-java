package com.mozu.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.logger.MozuLogger;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

public class MozuApiContextTest {
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final Integer MASTER_CATALOG_ID = new Integer(33);
    private static final Integer CATALOG_ID = new Integer(44);
    private static final String TENANT_URL = "TenantUrl";
    private static final String SITE_URL = "SiteUrl";
    private static final String FULL_TENANT_URL = "http://TenantUrl";
    private static final String FULL_SITE_URL = "http://SiteUrl";
    private static final String CORRELATION_ID = "Correlation ID";
    private static final String HMAC_SHA256 = "hmac sha256";
    private static final String HEADER_DATE = "Tue, 31 Dec 2013 06:26:07 GMT";
    private static final String LOCALE = "en_US";
    private static final String CURRENCY = "USD";


    @Mocked Tenant mockTenant;
    @Mocked Site mockSite;
    @Mocked Map<String, String> mockHeaders;
    @Mocked HttpServletRequest mockServletRequest;
    @Mocked AppAuthenticator mockAppAuthenticator;
    
    @Before
	public void setUp() throws Exception {

		new MockUp<MozuLogger>() {

			@Mock
			public void info(String msg) {
				return;
			}
			
			@Mock
			public void warn(String msg) {
				return;
			}
			
			@Mock
			public void debug(String msg) {
				return;
			}
			
			@SuppressWarnings("rawtypes")
			@Mock
			private void initLogger(Class cls) {
				return;
			};
		};
	}

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMozuApiContextAllIds() {
        MozuApiContext context = new MozuApiContext(TENANT_ID, SITE_ID, MASTER_CATALOG_ID, CATALOG_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
    }

    @Test
    public void testMozuApiContextTenantId() {
        MozuApiContext context = new MozuApiContext(TENANT_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertNull(context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
    }

    @Test
    public void testMozuApiContextTenantSiteId() {
        MozuApiContext context = new MozuApiContext(TENANT_ID, SITE_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
    }

    @Test
    public void testMozuApiContextObjs() {
        new Expectations() {
            { mockTenant.getId(); result=TENANT_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockTenant.getId(); result=TENANT_ID; }
            { mockTenant.getDomain(); result=TENANT_URL; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getDomain(); result=SITE_URL; }
            };
        
        MozuApiContext context = new MozuApiContext(mockTenant, mockSite, MASTER_CATALOG_ID, CATALOG_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertEquals(FULL_TENANT_URL, context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextObjsNullSite() {
        new Expectations() {
            { mockTenant.getId(); result=TENANT_ID; }
            { mockTenant.getId(); result=TENANT_ID; }
            { mockTenant.getDomain(); result=TENANT_URL; }
            };
        
        MozuApiContext context = new MozuApiContext(mockTenant, null, MASTER_CATALOG_ID, CATALOG_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertNull(context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertEquals(FULL_TENANT_URL, context.getTenantUrl());
        assertNull(context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextNullUrls() {
        new Expectations() {
            { mockTenant.getId(); result=TENANT_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockTenant.getId(); result=TENANT_ID; }
            { mockTenant.getDomain(); result=null; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getDomain(); result=null; }
            };
        
        MozuApiContext context = new MozuApiContext(mockTenant, mockSite, MASTER_CATALOG_ID, CATALOG_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertNull(context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextNullTenant() {
        new Expectations() {
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getDomain(); result=SITE_URL; }
            };
        
        MozuApiContext context = new MozuApiContext(null, mockSite, MASTER_CATALOG_ID, CATALOG_ID);
        assertNull(context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextObjsNoTenant() {
        new Expectations() {
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getDomain(); result=SITE_URL; }
            { mockSite.getTenantId(); result=TENANT_ID; }
            };
        
        MozuApiContext context = new MozuApiContext(mockSite, MASTER_CATALOG_ID, CATALOG_ID);
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }
    
    @Test
    public void testMozuApiContextHeaders() {
        new Expectations() {
            { mockHeaders.get(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockHeaders.get(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockHeaders.get(Headers.X_VOL_TENANT); result=TENANT_ID.toString(); }
            { mockHeaders.get(Headers.X_VOL_SITE); result=SITE_ID.toString(); }
            { mockHeaders.get(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockHeaders.get(Headers.X_VOL_HMAC_SHA256); result=HMAC_SHA256; }
            { mockHeaders.get(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID.toString(); }
            { mockHeaders.get(Headers.X_VOL_CATALOG); result=CATALOG_ID.toString(); }
            { mockHeaders.get(Headers.DATE); result=HEADER_DATE.toString(); }
            { mockHeaders.get(Headers.X_VOL_LOCALE); result=LOCALE; }
            { mockHeaders.get(Headers.X_VOL_CURRENCY); result=CURRENCY; }
        };
        
        MozuApiContext context = new MozuApiContext(mockHeaders);
        
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertEquals(FULL_TENANT_URL, context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextHeadersContentNull() {
        new Expectations() {
            { mockHeaders.get(Headers.X_VOL_TENANT_DOMAIN); result=null; }
            { mockHeaders.get(Headers.X_VOL_SITE_DOMAIN); result=null; }
            { mockHeaders.get(Headers.X_VOL_TENANT); result=null; }
            { mockHeaders.get(Headers.X_VOL_SITE); result=null; }
            { mockHeaders.get(Headers.X_VOL_CORRELATION); result=null; }
            { mockHeaders.get(Headers.X_VOL_HMAC_SHA256); result=null; }
            { mockHeaders.get(Headers.X_VOL_MASTER_CATALOG); result=null; }
            { mockHeaders.get(Headers.X_VOL_CATALOG); result=null; }
            { mockHeaders.get(Headers.DATE); result=null; }
            { mockHeaders.get(Headers.DATE.toLowerCase()); result=null; }
            { mockHeaders.get(Headers.X_VOL_LOCALE); result=null; }
            { mockHeaders.get(Headers.X_VOL_CURRENCY); result=null; }
        };
        
        MozuApiContext context = new MozuApiContext(mockHeaders);
        
        assertNull(context.getTenantId());
        assertNull(context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertNull(context.getSiteUrl());
        assertNull(context.getLocale());
        assertNull(context.getCurrency());

    }

    @Test
    public void testMozuApiContextServletRequest() {
        new Expectations() {
            { mockServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=TENANT_ID; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_SITE); result=SITE_ID; }
            { mockServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result=HMAC_SHA256; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=CATALOG_ID; }
            { mockServletRequest.getHeader(Headers.DATE); result=HEADER_DATE; }
        };
        
        MozuApiContext context = new MozuApiContext(mockServletRequest);
        
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertEquals(FULL_TENANT_URL, context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextServletRequestNulls() {
        new Expectations() {
            { mockServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=null; }
            { mockServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=null; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=-1; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_SITE); result=-1; }
            { mockServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=null; }
            { mockServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result=null; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=-1; }
            { mockServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=-1; }
            { mockServletRequest.getHeader(Headers.DATE); result=null; }
            { mockServletRequest.getHeader(Headers.DATE.toLowerCase()); result=null; }
       };
        
        MozuApiContext context = new MozuApiContext(mockServletRequest);
        
        assertNull(context.getTenantId());
        assertNull(context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertNull(context.getSiteUrl());
    }
    
    @Test
    public void testCustomHeaders () {
        ApiContext apiContext = new MozuApiContext();
        assertNull (apiContext.getCustomHeaders());
        
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(Headers.X_VOL_NO_CACHE_UPDATE, "true");
        
        apiContext.setCustomHeaders(headers);
        
        String value = apiContext.getCustomHeaders().get(Headers.X_VOL_NO_CACHE_UPDATE);
        
        assertEquals ("true", value);
    }
}
