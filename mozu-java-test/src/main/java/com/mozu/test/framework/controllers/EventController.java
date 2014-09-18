package com.mozu.test.framework.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.events.service.EventService;

@Controller
public class EventController {
    private static final Logger logger = LoggerFactory.getLogger(EventController.class);

    @RequestMapping(value = "/events", method = RequestMethod.POST, consumes="application/json" )
    public ResponseEntity<String> processEventRequest (HttpServletRequest httpRequest) {
        logger.debug("Event received");
        
        try {
            EventService eventService = new EventService();
            EventHandlerStatus handlerStatus = eventService.dispatchEvent(httpRequest);
            if (handlerStatus.getMessage()==null) {
                return new ResponseEntity<String>(HttpStatus.valueOf(handlerStatus.getStatus()));
            } else {
                return new ResponseEntity<String>(handlerStatus.getMessage(), HttpStatus.valueOf(handlerStatus.getStatus()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
