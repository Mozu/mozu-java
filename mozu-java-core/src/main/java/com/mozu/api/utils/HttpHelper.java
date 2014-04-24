package com.mozu.api.utils;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.security.AppAuthenticator;

public class HttpHelper {
    static public void ensureSuccess(HttpResponse response, ObjectMapper mapper) throws ApiException {
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode < 200 || statusCode > 300) {
            try {
                ApiError apiError = mapper.readValue(response.getEntity().getContent(), ApiError.class);
                apiError.setCorrelationId(getHeaderValue(Headers.X_VOL_CORRELATION, response));
                throw new ApiException("Mozu Error: "
                        + apiError.getMessage(), apiError);
            } catch (JsonProcessingException jpe) {
                throw new ApiException("An error has occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase());
            } catch (IOException ioe) {
                throw new ApiException("An error occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase());
            }
        }
    }
    
    static public HttpHost getProxyHost () {;
        HttpHost proxyHttpHost = null;
       String proxyHost = ConfigProperties.getStringProperty(ConfigProperties.PROXY_HOST);
       if (StringUtils.isNotBlank(proxyHost)) {
           int proxyPort = ConfigProperties.getIntProperty(ConfigProperties.PROXY_PORT);
            proxyHttpHost = new HttpHost(proxyHost, proxyPort);
       }
         return proxyHttpHost;
     }

    static public String getUrl(String domain) {
        String url = null;
        String protocol = AppAuthenticator.isUseSSL() ? "https" : "http";
        if (StringUtils.isNotBlank(domain)) {
            url = String.format("%s://%s", protocol, domain);
        }
        return url;
    }
    
    static public String getHeaderValue(String header, HttpMessage httpMessage) {
        if (httpMessage.containsHeader(header))
            return (httpMessage.getFirstHeader(header)).getValue();
        else
            return null;
    }

    static public Integer getHeaderValueInt(String header, HttpMessage httpMessage) {
        if (httpMessage.containsHeader(header))
            return new Integer((httpMessage.getFirstHeader(header)).getValue());
        else
            return null;
    }


    

}
