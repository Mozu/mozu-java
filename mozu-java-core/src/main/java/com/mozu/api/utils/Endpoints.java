package com.mozu.api.utils;

public class Endpoints {
	public static final String AUTH_URL = "api/platform/applications/authtickets";
    public static final String AUTH_REFRESH_URL = "api/platform/applications/authtickets/refresh-ticket/%s";

    public static final String TENANT_END_POINT = "api/platform/tenants";
    public static final String SITES_END_POINT = "api/platform/tenants/%s/sites";

    public static final String ATTRIBUTE_END_POINT = "api/commerce/catalog/admin/attributedefinition/attributes";
    public static final String VOCABULARY_END_POINT = "api/commerce/catalog/admin/attributedefinition/attributes/%s/VocabularyValues";
    public static final String PRODUCTTYPE_END_POINT = "api/commerce/catalog/admin/attributedefinition/producttypes";

    public static final String ORDER_END_POINT = "api/commerce/orders";
    public static final String APPLICATIONSTATUS_END_POINT = "api/commerce/settings/applicationstatus";
    
    public static final String MZDB_APP_DATA_ENDPOINT = "api/platform/appdata";
    public static final String MZDB_SITE_DATA_ENDPOINT = "api/platform/sitedata";
    public static final String MZDB_TENANT_DATA_ENDPOINT = "api/platform/tenantdata";
}
