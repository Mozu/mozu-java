package com.mozu.api.events.model;

import java.util.Date;

public class EventNotification {
    /**
     * The unique identifier for an event
     */
    public String eventId;

    /**
     * The topic of the event (i.e. product.created)
     */
    public String topic;

    /**
     * The ID of the entity that changed (i.e. product code)
     */
    public String entityId;

    /**
     * The date the event occurred
     */
    public Date timestamp;

    /**
     * The Correlation Id of the original API request that caused the event to
     * occur
     */
    public String correlationId;

    /**
     * Indicates whether this is a test request
     */
    public boolean isTest;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean isTest) {
        this.isTest = isTest;
    }
}
