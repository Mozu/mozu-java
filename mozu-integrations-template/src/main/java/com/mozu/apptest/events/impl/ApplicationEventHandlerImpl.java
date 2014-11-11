package com.mozu.apptest.events.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.EventManager;
import com.mozu.api.events.handlers.ApplicationEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.apptest.handlers.ConfigHandler;
import com.mozu.base.utils.ApplicationUtils;

@Component
public class ApplicationEventHandlerImpl implements ApplicationEventHandler {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationEventHandlerImpl.class);

    @Autowired
    ConfigHandler configHandler;
    
    @PostConstruct
    public void initialize() {
        EventManager.getInstance().registerHandler(this);
        logger.info("Application event handler initialized");
    }

    @Override
    public EventHandlerStatus disabled(ApiContext apiContext, Event event) {
        return new EventHandlerStatus(HttpStatus.SC_OK);
    }

    @Override
    public EventHandlerStatus enabled(ApiContext apiContext, Event event) {
        return new EventHandlerStatus(HttpStatus.SC_OK);
    }

    @Override
    public EventHandlerStatus installed(ApiContext apiContext, Event event) {
        logger.debug("Application installed event");
        return enableApplication(apiContext);
    }

    @Override
    public EventHandlerStatus uninstalled(ApiContext apiContext, Event event) {
        return new EventHandlerStatus(HttpStatus.SC_OK);
    }

    @Override
    public EventHandlerStatus upgraded(ApiContext apiContext, Event event) {
        logger.debug("Application upgraded event");
        return enableApplication(apiContext);
    }
    
    @PreDestroy
    public void cleanup() {
        EventManager.getInstance().unregisterHandler(this.getClass());
        logger.debug("Application event handler unregistered");
    }
   
    private EventHandlerStatus enableApplication(ApiContext apiContext) {
        EventHandlerStatus status = new EventHandlerStatus(HttpStatus.SC_OK);
        
        logger.debug("Enable application for tenant " + apiContext.getTenantId());
        
        // Only set initialized if there are valid values in the settings
        try {
            if (configHandler.getTenantSetting(apiContext.getTenantId())!=null) {
                logger.debug("tenant settings retrieved");
                try {
                    ApplicationUtils.setApplicationToInitialized(apiContext);
                    status = new EventHandlerStatus(HttpStatus.SC_OK);
                } catch (Exception e) {
                    logger.warn("Exception intializing application: " + e.getMessage());
                    status = new EventHandlerStatus(e.getMessage(), HttpStatus.SC_INTERNAL_SERVER_ERROR);
                }
            }
        } catch (Exception e) {
            status = new EventHandlerStatus(e.getMessage(), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return status;
    }
}
