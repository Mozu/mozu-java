package com.mozu.api.events.service;

import static org.junit.Assert.assertEquals;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mockit.Expectations;
import mockit.Mocked;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.Headers;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.EventManager;
import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.resources.commerce.CartResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.Crypto;
import com.mozu.api.utils.JsonUtils;

public class EventServiceTest {
    private static final String TENANT_URL = "/tenant_url";
    private static final String SITE_URL = "/site_url";
    private static final Integer TENANT_ID = new Integer(11);
    private static final Integer SITE_ID = new Integer(22);
    private static final String CORRELATION_ID = "correlation_id";
    private static final String HMAC_SHA_256 = "hmac_sha_256";
    private static final Integer MASTER_CATALOG_ID = new Integer(33);
    private static final Integer CATALOG_ID = new Integer(44);
    private static final String HEADER_DATE = "Tue, 31 Dec 2013 06:26:07 GMT";
    
    private static final String ENTITY_ID = "EntityId";
    private static final String EVENT_ID = "123";
    private static final boolean IS_TEST = false;
    private static final String CREATED_TOPIC = "cart.created";
    private static final String UPDATED_TOPIC = "cart.updated";
    private static final String DELETED_TOPIC = "cart.deleted";
    
    @Mocked HttpServletRequest mockHttpServletRequest;
    @Mocked ServletInputStream mockServletInputStream;
    @Mocked AppAuthenticator mockAppAuthenticator;
    @Mocked AppAuthInfo mockAppAuthInfo;
    @Mocked AuthTicket mockAuthTicket;
    @Mocked CartResource mockCartResource;
    @Mocked Cart mockCart;
    @Mocked CartItem mockCartItem;
    @Mocked Product mockProduct;
    @Mocked ApiContext mockApiContext;
    @Mocked IOUtils mockIOUtils;
    @Mocked Crypto mockCrypto;
    
    @BeforeClass
    public static void registerHandler() {
        EventManager.getInstance().registerHandler(new CartEventHandlerTestImpl());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void invokeMethodTest() throws Exception {
        Event event = new Event();
        event.setTopic("cart.created");
        
        EventService eventService = new EventService();
        eventService.invokeHandler(event, mockApiContext);
    }
    
    @Test
    public void createEventTest() throws Exception {
        final String jsonString = createdEventJson();

        new Expectations() {
            { mockHttpServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=TENANT_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_SITE); result=SITE_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result = HMAC_SHA_256; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=CATALOG_ID; }
            { AppAuthenticator.isUseSSL(); result=false; times=2; } 
            { mockHttpServletRequest.getHeader(Headers.DATE); result=HEADER_DATE; }
            { mockHttpServletRequest.getInputStream(); result=mockServletInputStream; }
            { IOUtils.toString(mockServletInputStream); result=jsonString; }
            { Crypto.isRequestValid((ApiContext)any, (String)any); result=true; }
        };

        EventService eventService = new EventService();
        EventHandlerStatus status = eventService.dispatchEvent(mockHttpServletRequest);
        
        assertEquals(HttpServletResponse.SC_OK, status.getStatus());
    }
    
    @Test
    public void updateEventTest() throws Exception {
        final String jsonString = updatedEventJson();

        new Expectations() {
            { mockHttpServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=TENANT_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_SITE); result=SITE_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result = HMAC_SHA_256; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=CATALOG_ID; }
            { AppAuthenticator.isUseSSL(); result=false; times=2; } 
            { mockHttpServletRequest.getHeader(Headers.DATE); result=HEADER_DATE; }
            { mockHttpServletRequest.getInputStream(); result=mockServletInputStream; }
            { IOUtils.toString(mockServletInputStream); result=jsonString; }
            { Crypto.isRequestValid((ApiContext)any, (String)any); result=true; }
        };

        EventService eventService = new EventService();
        EventHandlerStatus status = eventService.dispatchEvent(mockHttpServletRequest);
        
        assertEquals(HttpServletResponse.SC_OK, status.getStatus());
    }
    
    @Test
    public void deleteEventTest() throws Exception {
        final String jsonString = deletedEventJson();

        new Expectations() {
            { mockHttpServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=TENANT_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_SITE); result=SITE_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result = HMAC_SHA_256; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=CATALOG_ID; }

            { AppAuthenticator.isUseSSL(); result=false; times=2; } 
            { mockHttpServletRequest.getHeader(Headers.DATE); result=HEADER_DATE; }
            { mockHttpServletRequest.getInputStream(); result=mockServletInputStream; }
            { IOUtils.toString(mockServletInputStream); result=jsonString; }
            { Crypto.isRequestValid((ApiContext)any, (String)any); result=true; }
        };

        EventService eventService = new EventService();
        EventHandlerStatus status = eventService.dispatchEvent(mockHttpServletRequest);
        
        assertEquals(HttpServletResponse.SC_OK, status.getStatus());
    }
    
    public void unauthorizedEventTest() throws Exception {
        final String jsonString = deletedEventJson();

        new Expectations() {
            { mockHttpServletRequest.getHeader(Headers.X_VOL_TENANT_DOMAIN); result=TENANT_URL; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_SITE_DOMAIN); result=SITE_URL; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_TENANT); result=TENANT_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_SITE); result=SITE_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_CORRELATION); result=CORRELATION_ID; }
            { mockHttpServletRequest.getHeader(Headers.X_VOL_HMAC_SHA256); result = HMAC_SHA_256; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_MASTER_CATALOG); result=MASTER_CATALOG_ID; }
            { mockHttpServletRequest.getIntHeader(Headers.X_VOL_CATALOG); result=CATALOG_ID; }
            { AppAuthenticator.isUseSSL(); result=false; times=2; } 
            { mockHttpServletRequest.getHeader(Headers.DATE); result=HEADER_DATE; }
            { mockHttpServletRequest.getInputStream(); result=mockServletInputStream; }
            { IOUtils.toString(mockServletInputStream); result=jsonString; }
            { AppAuthenticator.getInstance(); returns(mockAppAuthenticator); }
            { mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo; }
            { mockAppAuthInfo.getSharedSecret(); result=HMAC_SHA_256; }
            { Crypto.isRequestValid((ApiContext)any, (String)any); result=false; }
        };

        EventService eventService = new EventService();
        EventHandlerStatus status = eventService.dispatchEvent(mockHttpServletRequest);
        
        assertEquals(HttpServletResponse.SC_UNAUTHORIZED, status.getStatus());
    }
    
    private String createdEventJson() throws JsonProcessingException {
        ObjectMapper mapper = JsonUtils.initObjectMapper();
        return mapper.writeValueAsString(createEvent(CREATED_TOPIC));
    }
    
    private String updatedEventJson() throws JsonProcessingException {
        ObjectMapper mapper = JsonUtils.initObjectMapper();
        return mapper.writeValueAsString(createEvent(UPDATED_TOPIC));
    }
    
    private String deletedEventJson() throws JsonProcessingException {
        ObjectMapper mapper = JsonUtils.initObjectMapper();
        return mapper.writeValueAsString(createEvent(DELETED_TOPIC));
    }
    
    private Event createEvent(String topic) {
        Event event = new Event();
        event.setAuditInfo(null);
        event.setCatalogId(CATALOG_ID);
        event.setCorrelationId(CORRELATION_ID);
        event.setEntityId(ENTITY_ID);
        event.setId(EVENT_ID);
        event.setIsTest(IS_TEST);
        event.setMasterCatalogId(MASTER_CATALOG_ID);
        event.setSiteId(SITE_ID);
        event.setTenantId(TENANT_ID);
        event.setTopic(topic);
        return event;
    }
}
