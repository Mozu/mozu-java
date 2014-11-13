package com.mozu.apptest.events.impl;

import java.util.List;

import javax.annotation.PreDestroy;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.EventManager;
import com.mozu.api.events.handlers.CartEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;
import com.mozu.api.resources.commerce.CartResource;

/**
 * A sample event handler. This handler is only responsible for performing
 * the integration specific actions of the event. This handler registers with
 * the SDK event service and is triggered by it when the appropriate event
 * type is received.
 *  
 * @author john_gatti
 *
 */
@Component
public class CartEventHandlerImpl implements CartEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(CartEventHandlerImpl.class);
    
    public CartEventHandlerImpl() {
    }

    /**
     * Attach this method to the dependency injection framework. This method
     * must be invoked before any events of the type supported by the class
     * can be processed.
     * 
     */
    public static final void initialize() {
        EventManager.getInstance().registerHandler(new CartEventHandlerImpl());
        logger.info("Cart event handler initialized");
    }
    
    @Override
    public EventHandlerStatus created(ApiContext apiContext, Event event) {
        logger.info("Got a create cart event");

        return getCartItems( apiContext, event);
    }

    @Override
    public EventHandlerStatus updated(ApiContext apiContext, Event event) {
        logger.info("Got an update cart event");

        return getCartItems( apiContext, event);
    }

    @Override
    public EventHandlerStatus deleted(ApiContext apiContext, Event event) {
        logger.info("Got a delete cart event");
        return getCartItems( apiContext, event);
    }
    
    @PreDestroy
    public void cleanup() {
        EventManager.getInstance().unregisterHandler(this.getClass());
        logger.debug("Cart event handler unregistered");
    }

    /**
     * Example of retrieving data from Mozu
     * 
     * @param apiContext
     * @param event
     */
    private EventHandlerStatus getCartItems(ApiContext apiContext, Event event) {
        CartResource cartResource = new CartResource(apiContext);
        try {
            Cart cart = cartResource.getCart(event.getEntityId());
            List<CartItem> items =  cart.getItems();
            if (items.size()==0) {
                logger.info("Empty cart");
            } else {
                for (CartItem item: items) {
                    // Do something
                }
            }
        } catch (Exception e) {
            StringBuilder msg = new StringBuilder ("Unable to process create event: ").append(e.getMessage());
            logger.error(msg.toString());
            return new EventHandlerStatus(msg.toString(), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        return new EventHandlerStatus(HttpStatus.SC_OK);
    }
}
