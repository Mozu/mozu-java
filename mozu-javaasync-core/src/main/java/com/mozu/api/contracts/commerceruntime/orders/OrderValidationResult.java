/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.orders.OrderValidationMessage;

/**
 *	Properties of the resulting order validation performed by an order validation capability.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderValidationResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Date and time when the entity was created, represented in UTC Date/Time.
	 */
	protected  DateTime createdDate;

	public DateTime getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
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
	 * Read-only identifier defined by the order validation capability that uniquely identifies this validation operation.
	 */
	protected  String validationId;

	public String getValidationId() {
		return this.validationId;
	}

	public void setValidationId(String validationId) {
		this.validationId = validationId;
	}

	/**
	 * Read-only name of this order validator supplied by the capability.
	 */
	protected  String validatorName;

	public String getValidatorName() {
		return this.validatorName;
	}

	public void setValidatorName(String validatorName) {
		this.validatorName = validatorName;
	}

	/**
	 * The type of order validator supplied by the capability. At this time, the only supported validator type is Fraud.
	 */
	protected  String validatorType;

	public String getValidatorType() {
		return this.validatorType;
	}

	public void setValidatorType(String validatorType) {
		this.validatorType = validatorType;
	}

	/**
	 * Array list of validation and status messages associated with shipping rates, orders, and product purchasable state.
	 */
	protected List<OrderValidationMessage> messages;
	public List<OrderValidationMessage> getMessages() {
		return this.messages;
	}
	public void setMessages(List<OrderValidationMessage> messages) {
		this.messages = messages;
	}


}
