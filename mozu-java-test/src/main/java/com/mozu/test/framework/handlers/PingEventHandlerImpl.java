package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.PingEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class PingEventHandlerImpl implements PingEventHandler {

	@Override
	public EventHandlerStatus created(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
