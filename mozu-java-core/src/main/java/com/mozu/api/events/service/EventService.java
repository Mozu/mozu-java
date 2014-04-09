package com.mozu.api.events.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.security.Crypto;
import com.mozu.api.events.EventManager;
import com.mozu.api.events.model.EventHandlerStatus;

public class EventService {

    private static final Logger logger = LoggerFactory.getLogger(EventService.class);
    private static ObjectMapper mapper = new ObjectMapper();
    
    /**
     * Takes the event notification message, parses it and dispatches the event
     * to the registered handler for the event category and type.
     * 
     * @param httpRequest The http request containing the event notification message
     * @return A response with a status code and optionally an error message
     */
    public EventHandlerStatus dispatchEvent(HttpServletRequest httpRequest) {
        ApiContext apiContext = new MozuApiContext(httpRequest);
        Event event = null;

        // get the event from the request and validate
        try {
            String body = IOUtils.toString(httpRequest.getInputStream());
            logger.debug("Event body: " + body);
            event = mapper.readValue(body, Event.class);
            logger.info("Dispatching Event.  Correlation ID: " + event.getCorrelationId());
            if (!Crypto.isRequestValid(apiContext, body)) {
                StringBuilder msg = new StringBuilder ("Event is not authorized.");
                logger.warn(msg.toString());
                return( new EventHandlerStatus(msg.toString(), HttpStatus.SC_UNAUTHORIZED));
            }
        } catch (IOException exception) {
            StringBuilder msg = new StringBuilder ("Unable to read product update event: ").append(exception.getMessage());
            logger.error(msg.toString());
            return( new EventHandlerStatus(msg.toString(), HttpStatus.SC_INTERNAL_SERVER_ERROR));
        }

        try {
            invokeHandler(event, apiContext);
        } catch (Exception exception) {
            StringBuilder msg = new StringBuilder ("Unable to process product update event: ").append(exception.getMessage());
            logger.error(msg.toString());
            return( new EventHandlerStatus(msg.toString(), HttpStatus.SC_INTERNAL_SERVER_ERROR));
        }
        return( new EventHandlerStatus(null, HttpStatus.SC_OK));
    }

    /**
     * Dispatch the event to the handler registered for the category. The method
     * corresponding to the event type is invoked.
     * 
     * @param event The event object
     * @param apiContext The application context 
     * @throws ClassNotFoundException 
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InstantiationException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     */
    protected void invokeHandler(Event event, ApiContext apiContext) 
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
                   IllegalArgumentException, InvocationTargetException, InstantiationException 
        {
        String topic[] = event.getTopic().split("\\.");
        String eventCategory = topic[0].substring(0, 1).toUpperCase() + topic[0].substring(1);
        String eventAction = topic[1];
        
        // get list of registered handlers
        Object handler = EventManager.getInstance().getRegisteredClassHandlers(eventCategory);
        if (handler !=null) {
            String methodName = eventAction;
            String className = handler.getClass().getName();
            try {
                Method m;
                m = handler.getClass().getMethod(methodName, ApiContext.class, Event.class);
                m.invoke(handler, apiContext, event);
            } catch (NoSuchMethodException e) {
                logger.warn("No " + eventAction + " method on class " + className);
                throw e;
            } catch (SecurityException e) {
                logger.warn("Security exception: " + e.getMessage());
                throw e;
            } catch (IllegalAccessException e) {
                logger.warn("Illegal access for method " + eventAction + " on class " + className);
                throw e;
            } catch (IllegalArgumentException e) {
                logger.warn("Illegal argument exception for method " + eventAction + " on class " + className);
                throw e;
            } catch (InvocationTargetException e) {
                logger.warn("Invocation target exception for method " + eventAction + " on class " + className);
                throw e;
            }
        }
    }
}
