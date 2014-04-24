package com.mozu.api;

import static org.junit.Assert.*;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mockit.*;

import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;

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

    @Mocked Tenant mockTenant;
    @Mocked Site mockSite;
    @Mocked Map<String, String> mockHeaders;
    @Mocked HttpRequest mockRequest;
    @Mocked Header mockHeader;
    @Mocked HttpServletRequest mockServletRequest;
    
    @Before
    public void setUp() throws Exception {
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
            { mockSite.getTenantId(); result=TENANT_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getId(); result=SITE_ID; }
            { mockSite.getDomain(); result=SITE_URL; }
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
        };
        
        MozuApiContext context = new MozuApiContext(mockHeaders);
        
        assertNull(context.getTenantId());
        assertNull(context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertNull(context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextHeadersHttpRequest() {
        new Expectations() {
            { mockRequest.containsHeader(Headers.X_VOL_TENANT_DOMAIN); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_TENANT_DOMAIN); result=mockHeader; }
            { mockHeader.getValue(); result=TENANT_URL; }
            
            { mockRequest.containsHeader(Headers.X_VOL_SITE_DOMAIN); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_SITE_DOMAIN); result=mockHeader; }
            { mockHeader.getValue(); result=SITE_URL; }

            { mockRequest.containsHeader(Headers.X_VOL_TENANT); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_TENANT); result=mockHeader; }
            { mockHeader.getValue(); result=TENANT_ID.toString(); }

            { mockRequest.containsHeader(Headers.X_VOL_SITE); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_SITE); result=mockHeader; }
            { mockHeader.getValue(); result=SITE_ID.toString(); }

            { mockRequest.containsHeader(Headers.X_VOL_CORRELATION); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_CORRELATION); result=mockHeader; }
            { mockHeader.getValue(); result=CORRELATION_ID; }

            { mockRequest.containsHeader(Headers.X_VOL_HMAC_SHA256); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_HMAC_SHA256); result=mockHeader; }
            { mockHeader.getValue(); result=HMAC_SHA256; }

            { mockRequest.containsHeader(Headers.X_VOL_MASTER_CATALOG); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_MASTER_CATALOG); result=mockHeader; }
            { mockHeader.getValue(); result=MASTER_CATALOG_ID.toString(); }

            { mockRequest.containsHeader(Headers.X_VOL_CATALOG); result=true; }
            { mockRequest.getFirstHeader(Headers.X_VOL_CATALOG); result=mockHeader; }
            { mockHeader.getValue(); result=CATALOG_ID.toString(); }
            
            { mockRequest.containsHeader(Headers.DATE); result=true; }
            { mockRequest.getFirstHeader(Headers.DATE); result=mockHeader; }
            { mockHeader.getValue(); result=HEADER_DATE.toString(); }

        };
        
        MozuApiContext context = new MozuApiContext(mockRequest);
        
        assertEquals(TENANT_ID, context.getTenantId());
        assertEquals(SITE_ID, context.getSiteId());
        assertEquals(MASTER_CATALOG_ID, context.getMasterCatalogId());
        assertEquals(CATALOG_ID, context.getCatalogId());
        assertEquals(FULL_TENANT_URL, context.getTenantUrl());
        assertEquals(FULL_SITE_URL, context.getSiteUrl());
    }

    @Test
    public void testMozuApiContextHeadersHttpRequestNull() {
        new Expectations() {
            { mockRequest.containsHeader(Headers.X_VOL_TENANT_DOMAIN); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_SITE_DOMAIN); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_TENANT); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_SITE); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_CORRELATION); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_HMAC_SHA256); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_MASTER_CATALOG); result=false; }
            { mockRequest.containsHeader(Headers.X_VOL_CATALOG); result=false; }
            { mockRequest.containsHeader(Headers.DATE); result=false; }
            { mockRequest.containsHeader(Headers.DATE.toLowerCase()); result=false; }
        };
        
        MozuApiContext context = new MozuApiContext(mockRequest);
        
        assertNull(context.getTenantId());
        assertNull(context.getSiteId());
        assertNull(context.getMasterCatalogId());
        assertNull(context.getCatalogId());
        assertNull(context.getTenantUrl());
        assertNull(context.getSiteUrl());
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
}
