/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.SiteSettings.General.Contracts.EmailTransactionSettings ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailTransactionSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean backInStock;

	public Boolean getBackInStock() {
		return this.backInStock;
	}

	public void setBackInStock(Boolean backInStock) {
		this.backInStock = backInStock;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean giftCardCreated;

	public Boolean getGiftCardCreated() {
		return this.giftCardCreated;
	}

	public void setGiftCardCreated(Boolean giftCardCreated) {
		this.giftCardCreated = giftCardCreated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean orderChanged;

	public Boolean getOrderChanged() {
		return this.orderChanged;
	}

	public void setOrderChanged(Boolean orderChanged) {
		this.orderChanged = orderChanged;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean orderFulfillmentDetailsChanged;

	public Boolean getOrderFulfillmentDetailsChanged() {
		return this.orderFulfillmentDetailsChanged;
	}

	public void setOrderFulfillmentDetailsChanged(Boolean orderFulfillmentDetailsChanged) {
		this.orderFulfillmentDetailsChanged = orderFulfillmentDetailsChanged;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean orderShipped;

	public Boolean getOrderShipped() {
		return this.orderShipped;
	}

	public void setOrderShipped(Boolean orderShipped) {
		this.orderShipped = orderShipped;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean refundCreated;

	public Boolean getRefundCreated() {
		return this.refundCreated;
	}

	public void setRefundCreated(Boolean refundCreated) {
		this.refundCreated = refundCreated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean returnAuthorized;

	public Boolean getReturnAuthorized() {
		return this.returnAuthorized;
	}

	public void setReturnAuthorized(Boolean returnAuthorized) {
		this.returnAuthorized = returnAuthorized;
	}

	/**
	 * There is no corresponding template for this in the Core theme.
	 */
	protected  Boolean returnCancelled;

	public Boolean getReturnCancelled() {
		return this.returnCancelled;
	}

	public void setReturnCancelled(Boolean returnCancelled) {
		this.returnCancelled = returnCancelled;
	}

	/**
	 * This controls "email/product-return-received" in the Core theme.
	 */
	protected  Boolean returnClosed;

	public Boolean getReturnClosed() {
		return this.returnClosed;
	}

	public void setReturnClosed(Boolean returnClosed) {
		this.returnClosed = returnClosed;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean returnCreated;

	public Boolean getReturnCreated() {
		return this.returnCreated;
	}

	public void setReturnCreated(Boolean returnCreated) {
		this.returnCreated = returnCreated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean returnRejected;

	public Boolean getReturnRejected() {
		return this.returnRejected;
	}

	public void setReturnRejected(Boolean returnRejected) {
		this.returnRejected = returnRejected;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean returnUpdated;

	public Boolean getReturnUpdated() {
		return this.returnUpdated;
	}

	public void setReturnUpdated(Boolean returnUpdated) {
		this.returnUpdated = returnUpdated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean shopperLoginCreated;

	public Boolean getShopperLoginCreated() {
		return this.shopperLoginCreated;
	}

	public void setShopperLoginCreated(Boolean shopperLoginCreated) {
		this.shopperLoginCreated = shopperLoginCreated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean shopperPasswordReset;

	public Boolean getShopperPasswordReset() {
		return this.shopperPasswordReset;
	}

	public void setShopperPasswordReset(Boolean shopperPasswordReset) {
		this.shopperPasswordReset = shopperPasswordReset;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean storeCreditCreated;

	public Boolean getStoreCreditCreated() {
		return this.storeCreditCreated;
	}

	public void setStoreCreditCreated(Boolean storeCreditCreated) {
		this.storeCreditCreated = storeCreditCreated;
	}

	/**
	 * A flag that determines if an email is sent to a shopper account when the described condition is met.
	 */
	protected  Boolean storeCreditUpdated;

	public Boolean getStoreCreditUpdated() {
		return this.storeCreditUpdated;
	}

	public void setStoreCreditUpdated(Boolean storeCreditUpdated) {
		this.storeCreditUpdated = storeCreditUpdated;
	}


}
