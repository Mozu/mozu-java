package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ProductInventoryEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ProductInventoryEventHandlerImpl implements
		ProductInventoryEventHandler {

	@Override
	public EventHandlerStatus instock(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus outofstock(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus updated(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
