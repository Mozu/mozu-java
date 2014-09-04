package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.LocationEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class LocationEventHandlerImpl implements LocationEventHandler {

	@Override
	public EventHandlerStatus created(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus deleted(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
