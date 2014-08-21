package com.mozu.apptest.controllers;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.security.Crypto;

@Controller
@RequestMapping({"/","/index"})
@Scope("session")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    protected static final String SECURITY_COOKIE = "MozuToken";

    @Value("${SharedSecret}")
    String sharedSecret;

    @RequestMapping(method = RequestMethod.POST)
    public String index(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
        throws IOException {

        String body = IOUtils.toString(httpRequest.getInputStream());
        String msgHash = httpRequest.getParameter("messageHash");
        String dateKey = httpRequest.getParameter("dt");
        String tenantId = httpRequest.getParameter("tenantId");
        
        ApiContext apiContext = new MozuApiContext(new Integer(tenantId));
        apiContext.setHeaderDate(dateKey);
        apiContext.setHmacSha256(msgHash);
        
        String decodedBody = URLDecoder.decode(body, "ISO-8859-1");
        
        // validate request
        try {
            if (!Crypto.isRequestValid(apiContext, decodedBody)) {
                logger.warn("Unauthorized request");
                return "unauthorized";
            }
            httpResponse.addCookie(new Cookie(SECURITY_COOKIE, 
                    ConfigurationSecurityInterceptor.encrypt(DateTime.now().toString(), sharedSecret)));
        } catch (Exception e) {
            logger.warn("Validation exception: " + e.getMessage());
            return "unauthorized";
        }
        
        return "index";
    }
}
