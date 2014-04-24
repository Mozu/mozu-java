package com.mozu.api.events;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;

public interface ApplicationEvents {

    /**
     * Application was installed
     * @param apiContext
     * @param eventPayLoad
     */
    void installed(ApiContext apiContext, Event eventPayLoad);

    /**
     * Application Uninstalled event
     * @param apiContext
     * @param eventPayLoad
     */
    void uninstalled(ApiContext apiContext, Event eventPayLoad);

    /**
     * Application was enabled in Mozu
     * @param apiContext
     * @param eventPayLoad
     */
    void enabled(ApiContext apiContext, Event eventPayLoad);

    /**
     * Application was uninstalled in Mozu
     * @param apiContext
     * @param eventPayLoad
     */
    void disabled(ApiContext apiContext, Event eventPayLoad);

    /**
     * Application was upgraded in Mozu.
     * @param apiContext
     * @param eventPayLoad
     */
    void upgraded(ApiContext apiContext, Event eventPayLoad);

    /**
     * 
     */
    void all();
}
