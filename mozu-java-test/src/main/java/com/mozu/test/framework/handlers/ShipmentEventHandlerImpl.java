package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ShipmentEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ShipmentEventHandlerImpl implements ShipmentEventHandler {

	@Override
	public EventHandlerStatus fulfilled(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
