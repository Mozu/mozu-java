package com.mozu.api;

public class MozuConfig {

    private static String baseUrl = "https://home.mozu.com";
    private static String encodeAlgorithm = "SHA-256";
    private static String charSet = "UTF-8";
    private static int defaultEventRequestTimeout = 180;
    private static String proxyHost = null;
    private static Integer proxyPort = null;

    
    /**
     * Get the proxy port if one is set.   
     * @return the proxy Port
     */
    public static Integer getProxyPort() {
        return proxyPort;
    }

    /**
     * Set the proxy port 
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

}
