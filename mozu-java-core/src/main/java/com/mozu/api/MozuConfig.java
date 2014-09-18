package com.mozu.api;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;

public class MozuConfig {

    private static String baseUrl = "https://home.mozu.com";
    private static String encodeAlgorithm = "SHA-256";
    private static String charSet = "UTF-8";
    private static int defaultEventRequestTimeout = 180;
    private static String proxyHost = null;
    private static Integer proxyPort = null;
    private static Integer defaultHttpClientMaxPerRoute = 20;
    private static Integer maxHttpClientConnections = 200;
    private static Integer httpClientTimeoutMillis = 60000;
    private static ClientConnectionManager clientConnectionManager = null;
    private static HttpParams httpParams = null;

    /**
     * Get the proxy port if one is set.
     * 
     * @return the proxy Port
     */
    public static Integer getProxyPort() {
        return proxyPort;
    }

    /**
     * Set the proxy port
     * 
     * @param proxyPort
     */
    public static void setProxyPort(Integer proxyPort) {
        MozuConfig.proxyPort = proxyPort;
    }

    public static String getProxyHost() {
        return proxyHost;
    }

    public static void setProxyHost(String proxyHost) {
        MozuConfig.proxyHost = proxyHost;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        MozuConfig.baseUrl = baseUrl;
    }

    public static String getEncodeAlgorithm() {
        return encodeAlgorithm;
    }

    public static void setEncodeAlgorithm(String encodeAlgorithm) {
        MozuConfig.encodeAlgorithm = encodeAlgorithm;
    }

    public static String getCharSet() {
        return charSet;
    }

    public static void setCharSet(String charSet) {
        MozuConfig.charSet = charSet;
    }

    public static int getDefaultEventRequestTimeout() {
        return defaultEventRequestTimeout;
    }

    public static void setDefaultEventRequestTimeout(int defaultEventRequestTimeout) {
        MozuConfig.defaultEventRequestTimeout = defaultEventRequestTimeout;
    }

    /**
     * Get the max number of clients that can re-use a HttpClient connection
     * route. The default is 20.
     * 
     * @return the number of clients that can use the HttpClient connection
     *         route.
     */
    public static Integer getDefaultHttpClientMaxPerRoute() {
        return defaultHttpClientMaxPerRoute;
    }

    /**
     * Set the max number of clients that can re-use a HttpClient connection
     * route. The default is 20.
     * 
     * @param defaultHttpClientMaxPerRoute
     */
    public static void setDefaultHttpClientMaxPerRoute(Integer defaultHttpClientMaxPerRoute) {
        MozuConfig.defaultHttpClientMaxPerRoute = defaultHttpClientMaxPerRoute;
    }

    /**
     * Get the maximum number of pooled HttpClient connections.
     * 
     * @return the max number of pooled HttpClient connections. Default is 200.
     */
    public static Integer getMaxHttpClientConnections() {
        return maxHttpClientConnections;
    }

    /**
     * Set the maximum number of pooled HttpClient connections.
     * 
     * @param setMaxHttpClientConnections
     */
    public static void setMaxHttpClientConnections(Integer setMaxHttpClientConnections) {
        MozuConfig.maxHttpClientConnections = setMaxHttpClientConnections;
    }

    /**
     * Return the Http timeout wait time in milli seconds. This is the amount of
     * time the Http client waits before timing out the connection and failing.
     * Default value is 60000 (one minute).
     * 
     * @return the client timeout duration for Http Client connections
     */
    public static Integer getHttpClientTimeoutMillis() {
        return httpClientTimeoutMillis;
    }

    /**
     * Set the Http timeout wait time in milli seconds. This is the amount of
     * time the Http client waits before timing out the connection and failing.
     *
     * @param httpClientTimeoutMillis the client timeout wait time for Http Client connections in milliseconds.
     */
    public static void setHttpClientTimeoutMillis(Integer httpClientTimeoutMillis) {
        MozuConfig.httpClientTimeoutMillis = httpClientTimeoutMillis;
    }

    /**
     * Get the client Connection Manager used by the HttpClient.  
     * If this has not been overridden, then a PoolingClientConnectionManager is used.
     * @return the client manager used by the HttpClient class
     */
    public static ClientConnectionManager getClientConnectionManager() {
        return clientConnectionManager;
    }

    /**
     * Set the HttpClient Connection Manager used by the HttpClient.  This overrides the PoolingClientConnectionManager that is used by default.  
     * @param clientConnectionManager the client manager used by the HttpClient class
     */
    public static void setClientConnectionManager(ClientConnectionManager clientConnectionManager) {
        MozuConfig.clientConnectionManager = clientConnectionManager;
    }

    /** 
     * Get the HttpParams needed by the HttpClient.
     * @return
     */
    public static HttpParams getHttpParams() {
        return httpParams;
    }

    /**
     * Override the HttpParams needed by the HttpClient.
     * @param httpParams
     */
    public static void setHttpParams(HttpParams httpParams) {
        MozuConfig.httpParams = httpParams;
    }

}
