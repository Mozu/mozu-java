package com.mozu.api;

import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.security.AuthTicket;

public interface ApiContext {
    /**
     * Get the current tenantID 
     * @return
     */
    Integer getTenantId ();
    
    /**
     * get the current Site ID
     * @return current site ID
     */
    Integer getSiteId();
    
    /**
     * Get the tenant URL
     * @return tenant URL
     */
    String getTenantUrl ();
    
    /**
     * get the URL for the Site
     * @return Site URL
     */
    String getSiteUrl ();
    
    /**
     * 
     * @return
     */
    String getCorrelationId ();
    
    /**
     * 
     * @return the current HMAC SHA 256 
     */
    String getHMACSha256 ();
    
    /**
     * The application authorization ticket
     * @return application authorization ticket
     */
    String getAppAuthTicket ();
    
    /**
     * 
     * @return
     */
    Integer getMasterCatalogId();
    
    /**
     * 
     * @return
     */
    Integer getCatalogId();
    
   
    /**
     * Get the current tenant
     * @return null if there is not a current tenant, otherwise return a tenant.
     */
    Tenant getTenant ();

    /**
     * Date header 
     * @return
     */
    String getHeaderDate();
    
    /**
     * 
     * @return
     */
    String getHmacSha256();

    /**
     * 
     * @param hmacSha256
     */
    void setHmacSha256(String hmacSha256);

    /**
     * 
     * @param tenantId
     */
    void setTenantId(Integer tenantId);

    /**
     * 
     * @param siteId
     */
    void setSiteId(Integer siteId);

    /**
     * 
     * @param tenantUrl
     */
    void setTenantUrl(String tenantUrl);

    /**
     * 
     * @param siteUrl
     */
    void setSiteUrl(String siteUrl);

    /**
     * 
     * @param correlationId
     */
    void setCorrelationId(String correlationId);

    /**
     * 
     * @param appAuthTicket
     */
    void setAppAuthTicket(String appAuthTicket);

    /**
     * 
     * @param masterCatalogId
     */
    void setMasterCatalogId(Integer masterCatalogId);

    /**
     * 
     * @param catalogId
     */
    void setCatalogId(Integer catalogId);
    
    /**
     * 
     * @param tenant
     */
    void setTenant(Tenant tenant);

    /**
     * 
     * @param headerDate
     */
    void setHeaderDate(String headerDate);
    
    /** 
     * Get the user authorization ticket
     * @return the user authorization ticket
     */
    AuthTicket getUserAuthTicket ();
 
    /**
     * Set the user auth ticket to be used for user authorization.
     * @param authTicket
     */
    void setUserAuthTicket (AuthTicket authTicket);
}
