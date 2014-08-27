package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ReturnEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ReturnEventHandlerImpl implements ReturnEventHandler {

	@Override
	public EventHandlerStatus cancelled(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus closed(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus opened(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus rejected(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus updated(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
