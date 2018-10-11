/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.event;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.event.EventDeliveryAttempt;
import com.mozu.api.contracts.event.EventSummary;

/**
 *	Data for event deliveries. Returned content details a summary of actions, events, and results for a delivery event.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDeliverySummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The date and time in UTCÂ format set when the object was created.
	 */
	protected  DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * Status of the delivery process `EventDeliveryStatusType`. System-supplied and read-only.
	 */
	protected  String deliveryStatus;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates whether delivery of the event is currently being attempted at this moment in time
	 */
	protected  Boolean isRunning;

	public Boolean getIsRunning() {
		return this.isRunning;
	}

	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}

	/**
	 * The date that the delivery was last attempted (either successfully or not)
	 */
	protected  DateTime lastExecutionDate;

	public DateTime getLastExecutionDate() {
		return this.lastExecutionDate;
	}

	public void setLastExecutionDate(DateTime lastExecutionDate) {
		this.lastExecutionDate = lastExecutionDate;
	}

	/**
	 * The date that the delivery will next be attempted, if the event has not been successfully delivered yet and there are still retries remaining
	 */
	protected  DateTime nextExecutionDate;

	public DateTime getNextExecutionDate() {
		return this.nextExecutionDate;
	}

	public void setNextExecutionDate(DateTime nextExecutionDate) {
		this.nextExecutionDate = nextExecutionDate;
	}

	/**
	 * Number of delivery attempts remaining
	 */
	protected  Integer retriesRemaining;

	public Integer getRetriesRemaining() {
		return this.retriesRemaining;
	}

	public void setRetriesRemaining(Integer retriesRemaining) {
		this.retriesRemaining = retriesRemaining;
	}

	/**
	 * The date and time in UTC format the object was updated most recently.
	 */
	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Details about each attempted delivery of the event to the endpoint
	 */
	protected List<EventDeliveryAttempt> deliveryAttempts;
	public List<EventDeliveryAttempt> getDeliveryAttempts() {
		return this.deliveryAttempts;
	}
	public void setDeliveryAttempts(List<EventDeliveryAttempt> deliveryAttempts) {
		this.deliveryAttempts = deliveryAttempts;
	}

	/**
	 * Event Summary
	 */
	protected  EventSummary eventSummary;

	public EventSummary getEventSummary() {
		return this.eventSummary;
	}

	public void setEventSummary(EventSummary eventSummary) {
		this.eventSummary = eventSummary;
	}


}
