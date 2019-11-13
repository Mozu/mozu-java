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
import com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackageItem;

/**
 *	Lets you manage an order's digital packages, by applying a digital package to the order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DigitalPackage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Available actions you can complete for an order. These actions may differ depending on the status of the order, such as actions required to enter a payment, return of a package, and fulfillment of a shipment.
	 */
	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

	/**
	 * The digital package code is a human-readable identifier for this digital fulfillment unit. If not set on create, it is autogenerated as a string in the form {fulfillmentUnitType} #{next available int}.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Date and time when a shipment completes fulfillment by delivery to a customer's physical address, picked up by a customer at a store, or delivered digitally for downloadable products.
	 */
	protected  DateTime fulfillmentDate;

	public DateTime getFulfillmentDate() {
		return this.fulfillmentDate;
	}

	public void setFulfillmentDate(DateTime fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

	/**
	 * The code that identifies the location used to fulfill the cart/cart item or order/order item. This code can include physical store locations for in-store pickup, warehouse locations providing the products for shipment, or the location for the digital file(s).
	 */
	protected  String fulfillmentLocationCode;

	public String getFulfillmentLocationCode() {
		return this.fulfillmentLocationCode;
	}

	public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
		this.fulfillmentLocationCode = fulfillmentLocationCode;
	}

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The current status of the object.This value is read only. Valid values for this field are: "Active", "Expired", and "Inactive".
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Collection (list or paged) of change messages logged for each modification made by a shopper to their carts, wishlists, orders, package, payment, pickup, and returns. Change log messages are system-supplied based on shopper actions and read only.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * A list of requested items. All returned data is provided in an items array.For a failed request, the returned response may be success with an empty item array.
	 */
	protected List<DigitalPackageItem> items;
	public List<DigitalPackageItem> getItems() {
		return this.items;
	}
	public void setItems(List<DigitalPackageItem> items) {
		this.items = items;
	}


}
