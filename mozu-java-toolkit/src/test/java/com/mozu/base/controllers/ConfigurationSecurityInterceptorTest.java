package com.mozu.base.controllers;

import static org.junit.Assert.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConfigurationSecurityInterceptorTest {
    protected static final String RESULT_URI = "/result/uri";
    protected static final String SHARED_SECRET = "ThisIsTheSharedSecret";
    
    @Mocked HttpServletRequest mockHttpServletRequest;
    @Mocked HttpServletResponse mockHttpServletResponse;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void noCookieTest() {
        final Cookie[] cookies = {};
        
        new Expectations() {
            {mockHttpServletRequest.getRequestURI(); result=RESULT_URI;}
            {mockHttpServletRequest.getCookies(); result=cookies;}
            {mockHttpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);}
        };
        
        ConfigurationSecurityInterceptor interceptor = new ConfigurationSecurityInterceptor();
        boolean isValid = interceptor.preHandle(mockHttpServletRequest, mockHttpServletResponse, null);
        assertFalse(isValid);
    }

    @Test
    public void invalidCookieValueTest() throws Exception {
        String encryptedValue = ConfigurationSecurityInterceptor.encrypt("Test", SHARED_SECRET); 
        final Cookie[] cookies = {new Cookie(AdminControllerHelper.SECURITY_COOKIE, encryptedValue)};
        
        new Expectations() {
            {mockHttpServletRequest.getRequestURI(); result=RESULT_URI;}
            {mockHttpServletRequest.getCookies(); result=cookies;}
            {mockHttpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);}
        };
        
        ConfigurationSecurityInterceptor interceptor = new ConfigurationSecurityInterceptor();
        Deencapsulation.setField(interceptor, "sharedSecret", SHARED_SECRET);
        boolean isValid = interceptor.preHandle(mockHttpServletRequest, mockHttpServletResponse, null);
        assertFalse(isValid);
    }

    @Test
    public void expiredDateTest() throws Exception {
        String oldDateString = new DateTime().minusDays(2).toString();
        String encryptedValue = ConfigurationSecurityInterceptor.encrypt(oldDateString, SHARED_SECRET); 
        final Cookie[] cookies = {new Cookie(AdminControllerHelper.SECURITY_COOKIE, encryptedValue)};
        
        new Expectations() {
            {mockHttpServletRequest.getRequestURI(); result=RESULT_URI;}
            {mockHttpServletRequest.getCookies(); result=cookies;}
            {mockHttpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);}
        };
        
        ConfigurationSecurityInterceptor interceptor = new ConfigurationSecurityInterceptor();
        Deencapsulation.setField(interceptor, "sharedSecret", SHARED_SECRET);
        boolean isValid = interceptor.preHandle(mockHttpServletRequest, mockHttpServletResponse, null);
        assertFalse(isValid);
    }

    @Test
    public void validTest() throws Exception {
        String oldDateString = new DateTime().toString();
        String encryptedValue = ConfigurationSecurityInterceptor.encrypt(oldDateString, SHARED_SECRET); 
        final Cookie[] cookies = {new Cookie(AdminControllerHelper.SECURITY_COOKIE, encryptedValue)};
        
        new Expectations() {
            {mockHttpServletRequest.getRequestURI(); result=RESULT_URI;}
            {mockHttpServletRequest.getCookies(); result=cookies;}
        };
        
        ConfigurationSecurityInterceptor interceptor = new ConfigurationSecurityInterceptor();
        Deencapsulation.setField(interceptor, "sharedSecret", SHARED_SECRET);
        boolean isValid = interceptor.preHandle(mockHttpServletRequest, mockHttpServletResponse, null);
        assertTrue(isValid);
    }
}
