package com.mozu.api.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.joda.time.DateTime;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class CustomerAuthenticator {
    private static ObjectMapper mapper = JsonUtils.initObjectMapper();
    
    private static HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    public static AuthTicket ensureAuthTicket(AuthTicket authTicket) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()).minus(180000);
        if (accessTokenDateTime.isBeforeNow())
            return refreshUserAuthTicket(authTicket).getAuthTicket();

        return null;
    }

    public static CustomerAuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket) {
        return refreshUserAuthTicket(authTicket, null);
    }

    public static CustomerAuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket, Integer tenantId)
            throws ApiException {

        String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.refreshUserAuthTicketUrl(authTicket.getRefreshToken()).getUrl();

        HttpClient client = new DefaultHttpClient();
        HttpPut put = new HttpPut(resourceUrl);
        try {
            String body = mapper.writeValueAsString(authTicket);

            StringEntity se = new StringEntity(body);
            put.setEntity(se);
            put.setHeader("Accept", "application/json");
            put.setHeader("Content-type", "application/json");
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
        }

        if (proxyHttpHost != null) {
            client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);
        }

        AppAuthenticator.addAuthHeader(put);
        HttpResponse response = null;
        try {
            response = client.execute(put);
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }

        HttpHelper.ensureSuccess(response, mapper);

        CustomerAuthenticationProfile userInfo = setUserAuth(response, null);

        return userInfo;
    }
    
    public static CustomerAuthenticationProfile authenticate(CustomerUserAuthInfo userAuthInfo,  Integer tenantId, Integer siteId) {

        String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.createUserAuthTicketUrl().getUrl(); // AuthTicketUrl.AuthenticateAppUrl();

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(resourceUrl);
        
        try {
            String body = mapper.writeValueAsString(userAuthInfo);

            StringEntity se = new StringEntity(body);
            post.setEntity(se);
            post.setHeader("Accept", "application/json");
            post.setHeader("Content-type", "application/json");
            if (siteId != null) {
                post.setHeader(Headers.X_VOL_SITE, siteId.toString());
            }
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
        }

        if (proxyHttpHost != null) {
            client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);
        }
        
        AppAuthenticator.addAuthHeader(post);

        HttpResponse response = null;
        try {
            response = client.execute(post);
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating user: "
                    + ioe.getMessage());
        }

        HttpHelper.ensureSuccess(response, mapper);

        return setUserAuth(response, siteId);
    }
    
    private static CustomerAuthenticationProfile setUserAuth(HttpResponse response, Integer siteId) {
        CustomerAuthTicket customerAuthTicket = null;
        try {
            customerAuthTicket = mapper.readValue(response.getEntity()
                    .getContent(), CustomerAuthTicket.class);
        } catch (JsonParseException jpe) {
            throw new ApiException("JSON error while deserializing customer user auth ticket : "
                    + jpe.getMessage());
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating customer: "
                    + ioe.getMessage());
        }

        AuthTicket authTicket = new AuthTicket(
                customerAuthTicket.getAccessToken(), customerAuthTicket.getAccessTokenExpiration(),
                customerAuthTicket.getRefreshToken(), 
                        customerAuthTicket.getRefreshTokenExpiration(),
                AuthenticationScope.Customer);
        CustomerAuthenticationProfile authenticationProfile = new CustomerAuthenticationProfile();
        authenticationProfile.setAuthTicket(authTicket);
        authenticationProfile.setCustomerAccount(customerAuthTicket.getCustomerAccount());
        
        authenticationProfile.getAuthTicket().setSiteId(siteId);
        
        return authenticationProfile;
    }

    private static String getTenantDomain (Integer tenantId) {
        TenantResource tenantResource = new TenantResource();
        Tenant tenant = null;
        try {
            tenant = tenantResource.getTenant(tenantId);
        } catch (Exception exception ) {
            throw new ApiException("Exception occurred getting tenant: " + exception.getMessage());
        }

        if (tenant == null)
            throw new ApiException("Tenant " + tenantId + " Not found");

        return HttpHelper.getUrl(tenant.getDomain());
    }

}
