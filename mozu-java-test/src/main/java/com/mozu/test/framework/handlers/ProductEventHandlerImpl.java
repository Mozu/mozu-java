package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ProductEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ProductEventHandlerImpl implements ProductEventHandler {

	@Override
	public EventHandlerStatus created(ApiContext apiContext, Event event) {
		System.out.println("Product Create event");
		return null;
	}

	@Override
	public EventHandlerStatus deleted(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus updated(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
