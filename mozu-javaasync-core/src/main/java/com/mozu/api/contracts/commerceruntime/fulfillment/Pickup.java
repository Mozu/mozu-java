/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.fulfillment.PickupItem;

/**
 *	Properties of an in-store pickup defined to fulfill items in an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pickup implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

	/**
	 * The specific code that represents pickup.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	protected  DateTime fulfillmentDate;

	public DateTime getFulfillmentDate() {
		return this.fulfillmentDate;
	}

	public void setFulfillmentDate(DateTime fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

	/**
	 * The location code that represents the location where the shopper will fulfill this pickup.
	 */
	protected  String fulfillmentLocationCode;

	public String getFulfillmentLocationCode() {
		return this.fulfillmentLocationCode;
	}

	public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
		this.fulfillmentLocationCode = fulfillmentLocationCode;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * List of change messages associated with the pickup.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	protected List<PickupItem> items;
	public List<PickupItem> getItems() {
		return this.items;
	}
	public void setItems(List<PickupItem> items) {
		this.items = items;
	}


}
