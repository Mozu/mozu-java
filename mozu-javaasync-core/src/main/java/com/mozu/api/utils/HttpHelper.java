package com.mozu.api.utils;


import org.apache.commons.lang.StringUtils;

import com.mozu.api.security.AppAuthenticator;

public class HttpHelper {
    static public String getUrl(String domain) {
        String url = null;
        String protocol = AppAuthenticator.isUseSSL() ? "https" : "http";
        if (StringUtils.isNotBlank(domain)) {
            url = String.format("%s://%s", protocol, domain);
        }
        return url;
    }
}
