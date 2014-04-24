

package com.mozu.api.events.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.model.EventHandlerStatus;

public interface CustomerGroupEventHandler {

		public EventHandlerStatus created(ApiContext apiContext, Event event);
		public EventHandlerStatus deleted(ApiContext apiContext, Event event);
		public EventHandlerStatus updated(ApiContext apiContext, Event event);

}
