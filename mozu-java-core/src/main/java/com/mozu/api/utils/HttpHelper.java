package com.mozu.api.utils;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiError;
import com.mozu.api.ApiError.Item;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.MozuConfig;
import com.mozu.api.security.AppAuthenticator;

public class HttpHelper {
    static public void ensureSuccess(HttpResponse response, ObjectMapper mapper) throws ApiException {
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode < 200 || statusCode > 300) {
            try {
                ApiError apiError = mapper.readValue(response.getEntity().getContent(), ApiError.class);
                apiError.setCorrelationId(getHeaderValue(Headers.X_VOL_CORRELATION, response));
                throw new ApiException(getMozuErrorMessage(apiError), apiError);
            } catch (JsonProcessingException jpe) {
                throw new ApiException("An error has occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase());
            } catch (IOException ioe) {
                throw new ApiException("An error occurred. Status Code: " + statusCode   
                        + " Status Message: " + response.getStatusLine().getReasonPhrase());
            }
        }
    }
    
    private static String getMozuErrorMessage(ApiError apiError) {
        StringBuilder errorMessage = new StringBuilder("Error returned from Mozu. Correlation ID: ");
        
        errorMessage.append(apiError.getCorrelationId());
        errorMessage.append(".  Message: ");
        
        if (StringUtils.isNotBlank(apiError.getMessage())) {
            errorMessage.append(apiError.getMessage());
        } else if (apiError.getExceptionDetail() != null && StringUtils.isNotBlank(apiError.getExceptionDetail().getMessage())) {
            errorMessage.append(apiError.getExceptionDetail().getMessage());
        } else if (apiError.getItems().size() > 0) {
            for (Item item : apiError.getItems()) {
                errorMessage.append(item.getMessage());
                errorMessage.append(". Error Code: ").append(item.getErrorCode());
            }
        } else {
            errorMessage.append("No error message returned from Mozu.");
        }
        
        return errorMessage.toString();
    }

    static public HttpHost getProxyHost () {;
        HttpHost proxyHttpHost = null;
       String proxyHost = MozuConfig.getProxyHost();
       if (StringUtils.isNotBlank(proxyHost)) {
           int proxyPort = MozuConfig.getProxyPort();
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
