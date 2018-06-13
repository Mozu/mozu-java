/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.payments.PaymentActionTarget;

/**
 *	Mozu.CommerceRuntime.Contracts.Payments.SubPayment ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubPayment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * amountCollected ApiType DOCUMENT_HERE 
	 */
	protected  Double amountCollected;

	public Double getAmountCollected() {
		return this.amountCollected;
	}

	public void setAmountCollected(Double amountCollected) {
		this.amountCollected = amountCollected;
	}

	/**
	 * amountCredited ApiType DOCUMENT_HERE 
	 */
	protected  Double amountCredited;

	public Double getAmountCredited() {
		return this.amountCredited;
	}

	public void setAmountCredited(Double amountCredited) {
		this.amountCredited = amountCredited;
	}

	/**
	 * amountRefunded ApiType DOCUMENT_HERE 
	 */
	protected  Double amountRefunded;

	public Double getAmountRefunded() {
		return this.amountRefunded;
	}

	public void setAmountRefunded(Double amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	/**
	 * amountRequested ApiType DOCUMENT_HERE 
	 */
	protected  Double amountRequested;

	public Double getAmountRequested() {
		return this.amountRequested;
	}

	public void setAmountRequested(Double amountRequested) {
		this.amountRequested = amountRequested;
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
	 * Targets represent the object, such as an item to apply discounts to(products or orders) or a view field for content. Targets are the dot notations that link to the source document property. For example, firstitem for the direct level or firstitem.seconditem.thirditem for a deeper property.
	 */
	protected  PaymentActionTarget target;

	public PaymentActionTarget getTarget() {
		return this.target;
	}

	public void setTarget(PaymentActionTarget target) {
		this.target = target;
	}


}
