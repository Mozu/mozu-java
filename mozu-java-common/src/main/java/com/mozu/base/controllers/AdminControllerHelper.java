package com.mozu.base.controllers;

import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.Crypto;

public class AdminControllerHelper {
    private static final Logger logger = LoggerFactory.getLogger(AdminControllerHelper.class);
    
    protected static final String SECURITY_COOKIE = "MozuToken";
    
    private String body = null;
    
    public boolean securityCheck(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        boolean isAuthorized = false;
        try {
            body = IOUtils.toString(httpRequest.getInputStream());
            String msgHash = httpRequest.getParameter("messageHash");
            String dateKey = httpRequest.getParameter("dt");
            String tenantId = httpRequest.getParameter("tenantId");
            
            ApiContext apiContext = new MozuApiContext(new Integer(tenantId));
            apiContext.setHeaderDate(dateKey);
            apiContext.setHmacSha256(msgHash);
            
            String decodedBody = URLDecoder.decode(body, "ISO-8859-1");
        
        // validate request
            if (!Crypto.isRequestValid(apiContext, decodedBody)) {
                logger.warn("Unauthorized request");
                isAuthorized = false;
            } else {
                isAuthorized = true;
            }
            httpResponse.addCookie(new Cookie(SECURITY_COOKIE, 
                    ConfigurationSecurityInterceptor.encrypt(DateTime.now().toString(), 
                            AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret())));
        } catch (Exception e) {
            logger.warn("Validation exception: " + e.getMessage());
            isAuthorized = false;
        }
        return isAuthorized;
    }

    public String getBody() {
        return body;
    }
}
