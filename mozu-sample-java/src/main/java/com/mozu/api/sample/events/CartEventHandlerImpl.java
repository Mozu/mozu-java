package com.mozu.api.sample.events;

import javax.annotation.PostConstruct;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.EventManager;
import com.mozu.api.events.handlers.CartEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.resources.commerce.CartResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;

public class CartEventHandlerImpl implements CartEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(CartEventHandlerImpl.class);
    
    public CartEventHandlerImpl() {
    }

    @PostConstruct
    public static final void initialize() {
        EventManager.getInstance().registerHandler(new CartEventHandlerImpl());
        logger.info("Cart event handler initialized");
    }
    
    @Override
    public EventHandlerStatus created(ApiContext apiContext, Event event) {
        logger.info("Got a created cart event");
        
        return processCartEvent(apiContext, event);
    }

    @Override
    public EventHandlerStatus updated(ApiContext apiContext, Event event) {
        logger.info("Got an updated cart event");

        return processCartEvent(apiContext, event);
    }

    @Override
    public EventHandlerStatus deleted(ApiContext apiContext, Event event) {
        logger.info("Got a deleted cart event");

        return processCartEvent(apiContext, event);
    }

    private EventHandlerStatus processCartEvent(ApiContext apiContext,
            Event event) {
        AuthTicket authTicket = (AuthTicket) AppAuthenticator.getInstance().getAppAuthTicket();
        apiContext.setUserAuthTicket(authTicket);
        CartResource cartResource = new CartResource(apiContext);
        
        try {
            Cart cart = cartResource.getCart(event.getEntityId());
            
            // Do something with cart info
            
        } catch (Exception e) {
            StringBuilder msg = new StringBuilder ("Unable to process created event: ").append(e.getMessage());
            logger.error(msg.toString());
            return new EventHandlerStatus(msg.toString(), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        apiContext.setUserAuthTicket(null);
        return new EventHandlerStatus(HttpStatus.SC_OK);
    }
}
