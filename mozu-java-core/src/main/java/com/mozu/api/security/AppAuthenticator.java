package com.mozu.api.security;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.contracts.appdev.AuthTicketRequest;
import com.mozu.api.resources.platform.applications.AuthTicketResource;
import com.mozu.api.urls.platform.applications.AuthTicketUrl;
import com.mozu.api.utils.ConfigProperties;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class AppAuthenticator {
    private static final Logger logger = LoggerFactory.getLogger(AppAuthenticator.class);

    private static volatile AppAuthenticator auth;
    private static ObjectMapper mapper = JsonUtils.initObjectMapper();

    protected static Object lockObj = new Object();

    static private boolean useSSL = false;

    private AppAuthInfo appAuthInfo = null;

    private HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    private AuthTicket appAuthTicket = null;

    private RefreshInterval refreshInterval = null;

    private String baseUrl;
    

    private AppAuthenticator(AppAuthInfo appAuthInfo, String baseUrl) {
        this(appAuthInfo, baseUrl, null);
    }

    private AppAuthenticator(AppAuthInfo appAuthInfo, String baseUrl,
            RefreshInterval refreshInterval) {
        this.appAuthInfo = appAuthInfo;
        this.baseUrl = baseUrl;
        this.refreshInterval = refreshInterval;
    }

    public static AppAuthenticator getInstance() {
        return auth;
    }

    /**
     * Initialize from mozu_config.properties file
     * 
     * @throws ApiException
     */
    public static void initialize() {
        AppAuthInfo appAuthInfo = new AppAuthInfo();
        appAuthInfo.setApplicationId(ConfigProperties.getStringProperty(ConfigProperties.APP_ID));
        appAuthInfo.setSharedSecret(ConfigProperties
                .getStringProperty(ConfigProperties.SHARED_SECRET));

        initialize(appAuthInfo, ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL),
                null);
    }

    public static void initialize(AppAuthInfo appAuthInfo, String baseAppAuthUrl) {
        initialize(appAuthInfo, baseAppAuthUrl, null);
    }

    public static void initialize(AppAuthInfo appAuthInfo, String baseAppAuthUrl,
            RefreshInterval refreshInterval) {
        if (auth == null) {
            synchronized (lockObj) {
                if (auth == null) {
                    try {
                        auth = new AppAuthenticator(appAuthInfo, baseAppAuthUrl, refreshInterval);
                        auth.authenticateApp();
                        if (StringUtils.isNotBlank(baseAppAuthUrl)) {
                            try {
                                URL url = new URL(baseAppAuthUrl);
                                AppAuthenticator.useSSL = url.getProtocol().toLowerCase().equals("https");
                            } catch (MalformedURLException mue){
                                StringBuilder msgBuilder = new StringBuilder("Base URL is malformed. ");
                                msgBuilder.append(mue.getMessage());
                                logger.error(msgBuilder.toString());
                            }
                        }
                    } catch (ApiException ae) {
                        auth = null;
                        throw ae;
                    }

                }
            }
        }
    }

    public static void invalidateAuth() {
        AuthTicketResource authTicketResource = new AuthTicketResource();
        try {
            authTicketResource.deleteAppAuthTicket(auth.appAuthTicket.getRefreshToken());
        } catch (Exception e) {
            logger.info ("Unable to delete the AppAuthTicket while invalidating the application authentication: " + e.getMessage());
        }
        auth = null;
    }

    public void authenticateApp() {
        String resourceUrl = getBaseUrl() + AuthTicketUrl.authenticateAppUrl().getUrl();
        
        executeRequest( this.appAuthInfo, new HttpPost(resourceUrl) );

        setRefreshIntervals(true);
    }

    /**
     * jh the application auth ticket using the refresh token
     */
    public void refreshAppAuthTicket() {

        String resourceUrl = getBaseUrl() + AuthTicketUrl.refreshAppAuthTicketUrl().getUrl();

        AuthTicketRequest authTicketRequest = new AuthTicketRequest();
        authTicketRequest.setRefreshToken(appAuthTicket.getRefreshToken());
        
        executeRequest(authTicketRequest, new HttpPut(resourceUrl));

        logger.info("Setting app token refresh intervals");
        setRefreshIntervals(false);
        logger.info("App Authentication Done");
    }

    private void executeRequest(Object bodyObject, HttpEntityEnclosingRequestBase request) {
        HttpResponse response = null;
        HttpClient client = new DefaultHttpClient();

        try {
            String body = mapper.writeValueAsString(bodyObject);
            StringEntity se = new StringEntity(body);
            request.setEntity(se);
            request.setHeader("Accept", "application/json");
            request.setHeader("Content-type", "application/json");
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
        }

        addProxyHttpHost(client);
            
        try {
            response = client.execute(request);
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating application: "
                    + ioe.getMessage());
        }

        HttpHelper.ensureSuccess(response, mapper);

        try {
            appAuthTicket = mapper.readValue(response.getEntity().getContent(), AuthTicket.class);
        } catch (UnsupportedEncodingException e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("Unsupported encoding while authenticating application: "
                    + e.getMessage());
        } catch (JsonProcessingException e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("JSON error proccessing authentication: " + e.getMessage());
        } catch (ClientProtocolException e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("Http protocol error while authenticating application: "
                    + e.getMessage());
        } catch (IOException e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("IO Exception occurred while authenticating application: "
                    + e.getMessage());
        }
    }

    private void setRefreshIntervals(boolean updateRefreshTokenInterval) {
        if (refreshInterval == null) {
            refreshInterval = new RefreshInterval(getExpirationInterval(appAuthTicket.getAccessTokenExpiration()),
                    getExpirationInterval(appAuthTicket.getRefreshTokenExpiration()));
        }

        refreshInterval.setAccessTokenExpiration(new DateTime().plus(refreshInterval
                .getAccessTokenExpirationInterval()));

        if (updateRefreshTokenInterval) {
            refreshInterval.setRefreshTokenExpiration(new DateTime().plus(refreshInterval
                    .getRefreshTokenExpirationInterval()));
        }
    }

    /**
     * Ensure that the auth ticket is valid. If not, then make it so. Will be
     * used when not using timers to keep the auth ticket alive (i.e.
     * "on demand" mode).
     * 
     * @throws ApiException
     */
    public void ensureAuthTicket() {
        synchronized (lockObj) {
            if (appAuthTicket == null || refreshInterval.getRefreshTokenExpiration().isBeforeNow())
                authenticateApp();
            else if (refreshInterval.getAccessTokenExpiration().isBeforeNow())
                refreshAppAuthTicket();
        }
    }

    public static void addAuthHeader(HttpRequest requestMsg) {
        if (auth == null)
            throw new ApiException("AppAuthTicketKeepAlive Not Initialized");

        auth.ensureAuthTicket();
        requestMsg.addHeader(Headers.X_VOL_APP_CLAIMS, auth.getAppAuthTicket().getAccessToken());
    }

    public AuthTicket getAppAuthTicket() {
        return this.appAuthTicket;
    }

    public AppAuthInfo getAppAuthInfo() {
        return appAuthInfo;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void addProxyHttpHost(HttpClient client) {
        if (proxyHttpHost != null) {
            client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);
        }
    }

    public void setProxyHttpHost(HttpHost proxyHttpHost) {
        this.proxyHttpHost = proxyHttpHost;
    }
    
    public static boolean isUseSSL() {
        return useSSL;
    }

    private long getExpirationInterval (DateTime expirationDateTime) {
        long interval = 0;
                
        DateTime nowDate = new DateTime();
        
        interval = expirationDateTime.getMillis() - nowDate.getMillis() - 180000;
                
        return interval;
    }

}
