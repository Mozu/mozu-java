package com.mozu.api.events;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.CartEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class EventManagerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        EventManager.getInstance().clearEventHandlers();
    }

    @Test
    public void RegisterTest() {
        EventManager eventManager = EventManager.getInstance();
        eventManager.registerHandler(new CartEventHandlerImpl());
        
        Object handler = eventManager.getRegisteredClassHandlers("Cart");
        assertEquals(CartEventHandlerImpl.class.getName(), handler.getClass().getName());
    }

    @Test
    public void RegisterDuplicateTest() {
        EventManager eventManager = EventManager.getInstance();
        eventManager.registerHandler(new CartEventHandlerImpl());
        
        try {
            eventManager.registerHandler(new CartEventHandlerImpl());
            fail("Duplicate exception expected");
        } catch (ApiException e) {
            assertTrue( e.getMessage().contains("Handler"));
        }
    }

    @Test
    public void RegisterInvalidClassTest() {
        EventManager eventManager = EventManager.getInstance();
        try {
            eventManager.registerHandler(new InvalidCartHandlerImpl());
            fail("Invalid class exception expected");
        } catch (ApiException e) {
            assertTrue( e.getMessage().contains("Class is invalid"));
        }

    }

    @Test
    public void RegisterNullClassTest() {
        EventManager eventManager = EventManager.getInstance();
        try {
            eventManager.registerHandler(null);
            fail("IllegalArgument exception expected");
        } catch (IllegalArgumentException e) {
        }

        Object handler = eventManager.getRegisteredClassHandlers("Cart");
        assertNull(handler);
    }

    public class CartEventHandlerImpl implements CartEventHandler {

        @Override
        public EventHandlerStatus created(ApiContext apiContext, Event eventPayLoad) {
            return new EventHandlerStatus(null, HttpServletResponse.SC_OK);
        }

        @Override
        public EventHandlerStatus updated(ApiContext apiContext, Event eventPayLoad) {
            return new EventHandlerStatus(null, HttpServletResponse.SC_OK);
        }

        @Override
        public EventHandlerStatus deleted(ApiContext apiContext, Event eventPayLoad) {
            return new EventHandlerStatus(null, HttpServletResponse.SC_OK);
        }
    }
    
    public class InvalidCartHandlerImpl {
    }
}
