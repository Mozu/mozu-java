package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ProductInventoryInStockEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ProductInventoryInStockEventHandlerImpl implements
		ProductInventoryInStockEventHandler {

	@Override
	public EventHandlerStatus instock(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
