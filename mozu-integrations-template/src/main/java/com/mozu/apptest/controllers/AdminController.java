package com.mozu.apptest.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mozu.base.controllers.AdminControllerHelper;

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

        // validate request
        try {
            AdminControllerHelper adh = new AdminControllerHelper();
            if (!adh.securityCheck(httpRequest, httpResponse)) {
                logger.warn("Not authorized");
                return "unauthorized";
            }
        } catch (Exception e) {
            logger.warn("Validation exception: " + e.getMessage());
            return "unauthorized";
        }
        
        return "index";
    }

}
