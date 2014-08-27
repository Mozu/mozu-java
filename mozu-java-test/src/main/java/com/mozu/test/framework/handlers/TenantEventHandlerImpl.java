package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.TenantEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class TenantEventHandlerImpl implements TenantEventHandler {

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
