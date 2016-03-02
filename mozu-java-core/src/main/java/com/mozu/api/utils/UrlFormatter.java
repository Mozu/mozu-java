package com.mozu.api.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import com.mozu.api.ApiException;

public class UrlFormatter {
    public String resourceUrl;

    public UrlFormatter(String resourceUrl) {
        this.resourceUrl = resourceUrl.toLowerCase();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void formatUrl() {
        String removeString = "/?";
        if (resourceUrl.endsWith(removeString))
            resourceUrl = resourceUrl.replace(removeString, "");

        if (resourceUrl.endsWith("/"))
            resourceUrl = resourceUrl.substring(0, resourceUrl.length() - 1);

        if (resourceUrl.endsWith("?"))
            resourceUrl = resourceUrl.substring(0, resourceUrl.length() - 1);

        if (resourceUrl.endsWith(removeString + "&"))
            resourceUrl = resourceUrl.replace(removeString + "&", "");
        
        if (resourceUrl.contains("?&"))
            resourceUrl = resourceUrl.replace("?&", "?");

    }

    public void formatUrl(String paramName, Object value) {

        String paramLowerCase = paramName.toLowerCase();
        String encodedValue = null;
        if (value == null) {
            String removeString = new StringBuilder("&").append(paramLowerCase).append("=").toString();
            resourceUrl = resourceUrl.replace(removeString, "");

            removeString = new StringBuilder("?").append(paramLowerCase).append("=").toString();
            if (value == null && resourceUrl.contains(removeString)) {
                resourceUrl = resourceUrl.replace(removeString, "?");
            }
            encodedValue = "";
        } else {
            String tempStr = null;
            if (value instanceof DateTime) {
                tempStr = ((DateTime) value).toString(ISODateTimeFormat.dateTime());
            } else {
                tempStr = value.toString();
            }
            try {
                encodedValue = URLEncoder.encode(String.valueOf(tempStr), "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException uee) {
                throw new ApiException("Bad encoding of URL" + uee.getMessage());
            }
        }
        resourceUrl = resourceUrl.replace("{" + paramLowerCase + "}", encodedValue);
        resourceUrl = resourceUrl.replace("{*" + paramLowerCase + "}", encodedValue);

        formatUrl();
    }
}
