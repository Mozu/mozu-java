package com.mozu.base.controllers;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.events.service.EventService;

public class EventControllerTest {
    protected static final String TEST_MESSAGE = "Test Event Message";
    @Mocked HttpServletRequest mockHttpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void processEventRequestNoMessageTest() {
        
        new MockUp<EventService>() {
            @Mock void $init() {}
            @Mock EventHandlerStatus dispatchEvent(HttpServletRequest httpRequest) {
                EventHandlerStatus status = new EventHandlerStatus(null, HttpStatus.SC_OK);
                return status;
            }
        };
        EventController controller = new EventController();
        ResponseEntity<String> entity = controller.processEventRequest(mockHttpServletRequest);
        assertEquals(org.springframework.http.HttpStatus.valueOf(HttpStatus.SC_OK), entity.getStatusCode());
        assertNull(entity.getBody());
    }

    @Test
    public void processEventRequestMessageTest() {
        new MockUp<EventService>() {
            @Mock void $init() {}
            @Mock EventHandlerStatus dispatchEvent(HttpServletRequest httpRequest) {
                EventHandlerStatus status = new EventHandlerStatus(TEST_MESSAGE, HttpStatus.SC_OK);
                return status;
            }
        };
        EventController controller = new EventController();
        ResponseEntity<String> entity = controller.processEventRequest(mockHttpServletRequest);
        assertEquals(org.springframework.http.HttpStatus.valueOf(HttpStatus.SC_OK), entity.getStatusCode());
        assertEquals(TEST_MESSAGE, entity.getBody());
    }
}
