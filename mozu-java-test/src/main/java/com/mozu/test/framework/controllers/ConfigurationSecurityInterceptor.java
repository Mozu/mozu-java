package com.mozu.test.framework.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ConfigurationSecurityInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationSecurityInterceptor.class);
    private static final String MOZU_TOKEN = "HMAC_SHA256";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		logger.debug("Security interceptor for URI: " + request.getRequestURI());
		
		boolean isValid = false;

    	ServletRequestAttributes attr = (ServletRequestAttributes) 
    		    RequestContextHolder.currentRequestAttributes();
    	HttpSession session= attr.getRequest().getSession(false); // true == allow create
    	if (session!=null) {
    		isValid = (session.getAttribute(MOZU_TOKEN)!=null);
    	}
    	
    	if (!isValid) {
    		logger.warn("Security exception, unauthorized request");
    	}

    	return isValid;
	}
}
