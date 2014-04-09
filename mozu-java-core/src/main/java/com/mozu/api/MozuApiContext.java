package com.mozu.api;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;

import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.utils.HttpHelper;

public class MozuApiContext implements ApiContext {

    private Integer tenantId = 0;
    private Integer siteId = 0;
    private String tenantUrl = null;
    private String siteUrl = null;
    private String correlationId = null;
    private String hmacSha256 = null;
    private String appAuthTicket = null;
    private Integer masterCatalogId = null;
    private Integer catalogId = null; 
    private Tenant tenant = null;
    private String headerDate = null;
    private AuthTicket userAuthTicket = null;

    public MozuApiContext() {
    }

    public MozuApiContext(Integer tenantId, Integer siteId, Integer masterCatalogId, Integer catalogId)
            throws ApiException {
        this.tenantId = tenantId;
        this.siteId = siteId;
        this.masterCatalogId = masterCatalogId;
        this.catalogId = catalogId;
    }

    public MozuApiContext(Integer tenantId, Integer siteId)
            throws ApiException {
        this(tenantId, siteId, null, null);
    }

    public MozuApiContext(Integer tenantId)
            throws ApiException {
        this(tenantId, null, null, null);
    }

    public MozuApiContext(Tenant tenant)
            throws ApiException {
        this(tenant, null, null, null);
    }

    public MozuApiContext(Tenant tenant, Site site, Integer masterCatalogId, Integer catalogId)
            throws ApiException {
        this(tenant == null ? null : tenant.getId(), site == null ? null : site.getId(), masterCatalogId, catalogId);
        
        if (tenant != null && tenant.getId() >=0) {
            this.tenantUrl = HttpHelper.getUrl(tenant.getDomain());
        }

        if (site != null && site.getId() >= 0) {
            this.siteUrl = HttpHelper.getUrl(site.getDomain());
        }
    }

    public MozuApiContext(Site site, Integer masterCatalogId, Integer catalogId) throws ApiException {
        this.tenantId = site.getTenantId();

        if (site != null && site.getId() >= 0) {
            this.siteId = site.getId();
            this.siteUrl = HttpHelper.getUrl(site.getDomain());
        }
        this.masterCatalogId = masterCatalogId;
        this.catalogId = catalogId;
    }

    public MozuApiContext(Map<String, String> headers)
            throws ApiException {
        this.tenantUrl = headers.get(Headers.X_VOL_TENANT_DOMAIN);
        this.siteUrl = headers.get(Headers.X_VOL_SITE_DOMAIN);
        
        String tenantIdStr = headers.get(Headers.X_VOL_TENANT);
        this.tenantId = tenantIdStr==null ? null : new Integer(tenantIdStr);
        
        String siteIdStr = headers.get(Headers.X_VOL_SITE);
        this.siteId = siteIdStr == null ? null : new Integer(siteIdStr);
        
        this.correlationId = headers.get(Headers.X_VOL_CORRELATION);
        this.hmacSha256 = headers.get(Headers.X_VOL_HMAC_SHA256);

        String masterCatalogStr = headers.get(Headers.X_VOL_MASTER_CATALOG);
        if (masterCatalogStr != null)
        {
            this.masterCatalogId = new Integer(masterCatalogStr);
        }

        String catalogStr = headers.get(Headers.X_VOL_CATALOG);
        if (catalogStr != null) {
            this.catalogId = new Integer(catalogStr);
        }

        this.tenantUrl = HttpHelper.getUrl(tenantUrl);

        this.siteUrl = HttpHelper.getUrl(siteUrl);
        
        headerDate = headers.get(Headers.DATE);
        // The date could be translated to lower case
        if (headerDate==null) {
            headerDate = headers.get(Headers.DATE.toLowerCase());
        }
    }

    public MozuApiContext (HttpRequest request) throws ApiException {
        tenantUrl = HttpHelper.getHeaderValue(Headers.X_VOL_TENANT_DOMAIN, request);
        siteUrl = HttpHelper.getHeaderValue(Headers.X_VOL_SITE_DOMAIN, request);
        tenantId = HttpHelper.getHeaderValueInt(Headers.X_VOL_TENANT, request);
        siteId = HttpHelper.getHeaderValueInt(Headers.X_VOL_SITE, request);
        correlationId = HttpHelper.getHeaderValue(Headers.X_VOL_CORRELATION, request);
        hmacSha256 = HttpHelper.getHeaderValue(Headers.X_VOL_HMAC_SHA256, request);
        masterCatalogId = HttpHelper.getHeaderValueInt(Headers.X_VOL_MASTER_CATALOG, request);
        catalogId = HttpHelper.getHeaderValueInt(Headers.X_VOL_CATALOG, request);

        this.tenantUrl = HttpHelper.getUrl(tenantUrl);

        siteUrl = HttpHelper.getUrl(siteUrl);
        
        headerDate = HttpHelper.getHeaderValue(Headers.DATE, request);
        // The date could be translated to lower case
        if (headerDate==null) {
            headerDate = HttpHelper.getHeaderValue(Headers.DATE.toLowerCase(), request);
        }

    }

    public MozuApiContext (HttpServletRequest request) throws ApiException {
        tenantUrl = request.getHeader(Headers.X_VOL_TENANT_DOMAIN);
        siteUrl = request.getHeader(Headers.X_VOL_SITE_DOMAIN);
        
        int tenantIdInt = request.getIntHeader(Headers.X_VOL_TENANT);
        tenantId = tenantIdInt < 0 ? null : new Integer(tenantIdInt);
        
        int siteIdInt = request.getIntHeader(Headers.X_VOL_SITE); 
        siteId = siteIdInt < 0 ? null : siteIdInt;
        
        correlationId = request.getHeader(Headers.X_VOL_CORRELATION);
        hmacSha256 = request.getHeader(Headers.X_VOL_HMAC_SHA256);
        
        int masterCatalogIdInt = request.getIntHeader(Headers.X_VOL_MASTER_CATALOG);
        masterCatalogId = masterCatalogIdInt < 0 ? null : masterCatalogIdInt;
        
        int catalogIdInt = request.getIntHeader(Headers.X_VOL_CATALOG);
        catalogId = catalogIdInt < 0 ? null : catalogIdInt;

         tenantUrl = HttpHelper.getUrl(tenantUrl);

         siteUrl = HttpHelper.getUrl(siteUrl);

         headerDate = request.getHeader(Headers.DATE);
         // The date could be translated to lower case
         if (headerDate==null) {
             headerDate = request.getHeader(Headers.DATE.toLowerCase());
         }
    }
    
    
    public Integer getTenantId() {
        return tenantId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public String getTenantUrl() {
        return tenantUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public String getHMACSha256() {
        return hmacSha256;
    }

    public String getAppAuthTicket() {
        return this.appAuthTicket;
    }

    public Integer getMasterCatalogId() {
        return masterCatalogId;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public String getHeaderDate() {
        return headerDate;
    }

    public String getHmacSha256() {
        return hmacSha256;
    }

    public void setHmacSha256(String hmacSha256) {
        this.hmacSha256 = hmacSha256;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
        if (siteId != null && siteId >= 0) {
            this.siteUrl = null;
        }

    }

    public void setTenantUrl(String tenantUrl) {
        this.tenantUrl = tenantUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public void setAppAuthTicket(String appAuthTicket) {
        this.appAuthTicket = appAuthTicket;
    }

    public void setMasterCatalogId(Integer masterCatalogId) {
        this.masterCatalogId = masterCatalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
        if (tenant != null) { 
            this.tenantId = tenant.getId();
            this.tenantUrl = HttpHelper.getUrl(tenant.getDomain());
            if (tenant.getSites() != null && tenant.getSites().size() == 1) {
                Site site = tenant.getSites().get(0);
                this.siteId = site.getId();
                this.siteUrl = HttpHelper.getUrl(site.getDomain());
            } else {
                this.siteId = null;
                this.siteUrl = null;
                
            }
        }
    }

    public void setSite(Site site) {
        if (site != null) {
            this.siteId = site.getId();
            this.siteUrl = HttpHelper.getUrl(site.getDomain());
        }
    }

    public void setHeaderDate(String headerDate) {
        this.headerDate = headerDate;
    }

    public AuthTicket getUserAuthTicket() {
        return userAuthTicket;
    }

    public void setUserAuthTicket(AuthTicket userAuthTicket) {
        this.userAuthTicket = userAuthTicket;
    }
    
    
 }
