package com.mozu.api.events.service;

import javax.servlet.http.HttpServletResponse;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.CartEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class CartEventHandlerTestImpl implements CartEventHandler {
    public CartEventHandlerTestImpl() {
    }

    @Override
    public EventHandlerStatus created(ApiContext apiContext, Event eventPayLoad) {
        System.out.println("Create Event!");
        return new EventHandlerStatus(HttpServletResponse.SC_OK);
    }

    @Override
    public EventHandlerStatus updated(ApiContext apiContext, Event eventPayLoad) {
        System.out.println("Update Event!");
        return new EventHandlerStatus(HttpServletResponse.SC_OK);
    }

    @Override
    public EventHandlerStatus deleted(ApiContext apiContext, Event eventPayLoad) {
        System.out.println("Delete Event!");
        return new EventHandlerStatus(HttpServletResponse.SC_OK);
    }
}
