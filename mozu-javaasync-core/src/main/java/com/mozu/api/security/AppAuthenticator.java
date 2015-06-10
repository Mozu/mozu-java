package com.mozu.api.security;


import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiException;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuConfig;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.contracts.appdev.AuthTicketRequest;
import com.mozu.api.resources.platform.applications.AuthTicketResource;
import com.mozu.api.urls.platform.applications.AuthTicketUrl;

public class AppAuthenticator {
    private static final Logger logger = LoggerFactory.getLogger(AppAuthenticator.class);

    private static volatile AppAuthenticator auth;

    protected static Object lockObj = new Object();

    static private boolean useSSL = false;

    private AppAuthInfo appAuthInfo = null;

    private AuthTicket appAuthTicket = null;

    private RefreshInterval refreshInterval = null;

    private AppAuthenticator(AppAuthInfo appAuthInfo) {
        this(appAuthInfo, null);
    }

    private AppAuthenticator(AppAuthInfo appAuthInfo, RefreshInterval refreshInterval) {
        this.appAuthInfo = appAuthInfo;
        this.refreshInterval = refreshInterval;
    }

    public static AppAuthenticator getInstance() {
        return auth;
    }

    public static void initialize(AppAuthInfo appAuthInfo) {
        initialize(appAuthInfo, null);
    }

    public static void initialize(AppAuthInfo appAuthInfo, RefreshInterval refreshInterval) {
        if (auth == null) {
            synchronized (lockObj) {
                if (auth == null) {
                    try {
                        auth = new AppAuthenticator(appAuthInfo, refreshInterval);
                        auth.authenticateApp();
                        if (StringUtils.isNotBlank(MozuConfig.getBaseUrl())) {
                            try {
                                URL url = new URL(MozuConfig.getBaseUrl());
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

    @SuppressWarnings("unchecked")
    public void authenticateApp() {
        StringBuilder resourceUrl = new StringBuilder(MozuConfig.getBaseUrl()).append(AuthTicketUrl.authenticateAppUrl(null).getUrl());
        
        MozuClient<AuthTicket> client;
        try {
            client = (MozuClient<AuthTicket>) MozuClientFactory.getInstance(AuthTicket.class);
            appAuthTicket = client.executePostRequest( this.appAuthInfo, resourceUrl.toString(), null );
        } catch (ApiException e) {
            logger.warn(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("Exception getting Mozu client: " + e.getMessage());
        }

        setRefreshIntervals(true);
    }

    /**
     * jh the application auth ticket using the refresh token
     */
    public void refreshAppAuthTicket() {

        StringBuilder resourceUrl = new StringBuilder(MozuConfig.getBaseUrl()).append(AuthTicketUrl.refreshAppAuthTicketUrl(null).getUrl());

        try {
            @SuppressWarnings("unchecked")
            MozuClient<AuthTicket> client = (MozuClient<AuthTicket>) MozuClientFactory.getInstance(AuthTicket.class);
    
            AuthTicketRequest authTicketRequest = new AuthTicketRequest();
            authTicketRequest.setRefreshToken(appAuthTicket.getRefreshToken());
            
            appAuthTicket = client.executePutRequest(authTicketRequest, resourceUrl.toString(), null);
        } catch (ApiException e) {
            logger.warn(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            logger.warn(e.getMessage(), e);
            throw new ApiException("Exception getting Mozu client: " + e.getMessage());
        }

        logger.info("Setting app token refresh intervals");
        setRefreshIntervals(false);
        logger.info("App Authentication Done");
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

    public static String addAuthHeader() {
        if (auth == null)
            throw new ApiException("AppAuthTicketKeepAlive Not Initialized");

        auth.ensureAuthTicket();
        return auth.getAppAuthTicket().getAccessToken();
    }

    public AuthTicket getAppAuthTicket() {
        return this.appAuthTicket;
    }

    public AppAuthInfo getAppAuthInfo() {
        return appAuthInfo;
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
