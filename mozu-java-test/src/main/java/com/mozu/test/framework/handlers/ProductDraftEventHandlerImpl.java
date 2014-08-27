package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.ProductDraftEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class ProductDraftEventHandlerImpl implements ProductDraftEventHandler {

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

	@Override
	public EventHandlerStatus discarded(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus published(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventHandlerStatus updated(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
