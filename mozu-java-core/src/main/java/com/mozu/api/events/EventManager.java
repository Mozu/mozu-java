package com.mozu.api.events;

import java.util.HashMap;
import java.util.Map;

import com.mozu.api.ApiException;

/**
 * Manage handlers registered to process events. Handlers implement
 * one or several event interfaces. When the handler registers, an
 * entry is created that associates the handler with an event category
 * of the type specified by the interface(s) implemented.
 * 
 * @author john_gatti
 *
 */
public class EventManager {

    private static final String EVENT_INTERFACE_SUFFIX = "EventHandler";

    // A map of registered handlers by handler interface type (category) with 
    // full name of the handler 
    // Event interfaces are named in the form [Category]EventHandler (e.g. ProductEventHandler)
    private Map<String, Object> eventHandlers = null;
    
    private static EventManager eventManager = null;
    
    protected EventManager() 
    {
        eventHandlers = new HashMap<String, Object>();
    };
    
    protected void clearEventHandlers() {
        eventHandlers.clear();
    }
    
    public static final EventManager getInstance() {
        if (eventManager==null) {
            eventManager = new EventManager();
        }
        return eventManager;
    }
    
    /**
     * Register an event handler. The registration looks at the interfaces
     * that the handler implements. An entry is created in the event handler
     * map for each event interface that is implemented. 
     * 
     * Event interfaces are named in the form [Category]Event (e.g. ProductEvent)
     * 
     * @param handler handler class
     */
    public synchronized void registerHandler(Object handler) {
        boolean validClass = false;
        
        if (handler==null) {
            throw new IllegalArgumentException("Null handler class");
        }
        
        // Get the implemented interfaces. This gets only the
        // directly implemented interfaces
        Class<?> clazz = handler.getClass();
        Class<?> interfaces[] = clazz.getInterfaces();
        
        for (int i=0; i<interfaces.length; i++) {
            String iName = interfaces[i].getSimpleName();
            
            // verify the interface is for an event interface
            if (iName.contains(EVENT_INTERFACE_SUFFIX)) {
                validClass = true;
                String eventCategory = iName.substring(0, iName.indexOf(EVENT_INTERFACE_SUFFIX)).toLowerCase();
                
                // see if a handler has been registered for the interface type
                if (eventHandlers.get(eventCategory)==null) {
                    eventHandlers.put(eventCategory, handler);
                } else {
                    throw new ApiException("Handler already registered for event type " + iName);
                }
            }
        }
        
        if (!validClass) {
            throw new ApiException("Class is invalid, it does not implement any event interfaces: " + clazz.getName());
        }
    }

    /**
     * Get a list of all registered handlers for a given category
     * 
     * @param topic
     * @return
     */
    public Object getRegisteredClassHandlers( String eventCategory ) {
        return eventHandlers.get(eventCategory.toLowerCase());
    }
    
    public synchronized void unregisterHandler(Class<?> handler) {
        // Get the implemented interfaces. This gets only the
        // directly implemented interfaces
        Class<?> interfaces[] = handler.getInterfaces();
        
        for (int i=0; i<interfaces.length; i++) {
            String iName = interfaces[i].getSimpleName();
            
            // verify the interface is for an event interface
            if (iName.contains(EVENT_INTERFACE_SUFFIX)) {
                String eventCategory = iName.substring(0, iName.indexOf(EVENT_INTERFACE_SUFFIX)).toLowerCase();
                eventHandlers.remove(eventCategory);
            }
        }
    }
}
