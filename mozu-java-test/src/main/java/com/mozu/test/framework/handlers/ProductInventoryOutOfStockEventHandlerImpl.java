package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ProductInventoryOutOfStockEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ProductInventoryOutOfStockEventHandlerImpl implements
		ProductInventoryOutOfStockEventHandler {

	@Override
	public EventHandlerStatus outofstock(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
