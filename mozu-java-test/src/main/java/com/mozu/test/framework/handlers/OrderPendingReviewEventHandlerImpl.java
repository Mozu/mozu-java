package com.mozu.test.framework.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.handlers.OrderPendingReviewEventHandler;
import com.mozu.api.events.model.EventHandlerStatus;

public class OrderPendingReviewEventHandlerImpl implements
		OrderPendingReviewEventHandler {

	@Override
	public EventHandlerStatus pendingreview(ApiContext apiContext, Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}
