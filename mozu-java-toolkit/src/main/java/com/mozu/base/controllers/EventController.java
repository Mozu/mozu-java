package com.mozu.base.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.events.service.EventService;

@Controller
public class EventController {

    /**
     * Event handler top level controller. This sample controller uses 
     * Spring annotation to inject the controller into the servlet container. 
     * 
     * This sample event controller receives all events for which the 
     * application has registered. The controller only serves as the 
     * top level entry point in the servlet container and passes the
     * event handling off to the SDK via the EventService.
     *
     * @param httpRequest Event notification request
     * @return a ResponseEntity containing the event processing status 
     * as an HTTP code and optionally an error message
     */
    @RequestMapping(value = "/events", method = RequestMethod.POST, consumes="application/json" )
    public ResponseEntity<String> processEventRequest (HttpServletRequest httpRequest) {
        
        EventService eventService = new EventService();
        EventHandlerStatus handlerStatus = eventService.dispatchEvent(httpRequest);
        if (handlerStatus.getMessage()==null) {
            return new ResponseEntity<String>(HttpStatus.valueOf(handlerStatus.getStatus()));
        } else {
            return new ResponseEntity<String>(handlerStatus.getMessage(), HttpStatus.valueOf(handlerStatus.getStatus()));
        }
    }
}
