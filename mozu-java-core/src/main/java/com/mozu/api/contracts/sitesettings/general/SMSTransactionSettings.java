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

@JsonIgnoreProperties(ignoreUnknown = true)
public class SMSTransactionSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean curbsideReady;

	public Boolean getCurbsideReady() {
		return this.curbsideReady;
	}

	public void setCurbsideReady(Boolean curbsideReady) {
		this.curbsideReady = curbsideReady;
	}

	protected  Boolean customerAtCurbside;

	public Boolean getCustomerAtCurbside() {
		return this.customerAtCurbside;
	}

	public void setCustomerAtCurbside(Boolean customerAtCurbside) {
		this.customerAtCurbside = customerAtCurbside;
	}

	protected  Boolean customerAtStore;

	public Boolean getCustomerAtStore() {
		return this.customerAtStore;
	}

	public void setCustomerAtStore(Boolean customerAtStore) {
		this.customerAtStore = customerAtStore;
	}

	protected  Boolean customerIntransit;

	public Boolean getCustomerIntransit() {
		return this.customerIntransit;
	}

	public void setCustomerIntransit(Boolean customerIntransit) {
		this.customerIntransit = customerIntransit;
	}

	protected  Boolean intransitConfirmation;

	public Boolean getIntransitConfirmation() {
		return this.intransitConfirmation;
	}

	public void setIntransitConfirmation(Boolean intransitConfirmation) {
		this.intransitConfirmation = intransitConfirmation;
	}

	protected  Boolean optOutAcknowledgement;

	public Boolean getOptOutAcknowledgement() {
		return this.optOutAcknowledgement;
	}

	public void setOptOutAcknowledgement(Boolean optOutAcknowledgement) {
		this.optOutAcknowledgement = optOutAcknowledgement;
	}

	protected  Boolean orderConfirmation;

	public Boolean getOrderConfirmation() {
		return this.orderConfirmation;
	}

	public void setOrderConfirmation(Boolean orderConfirmation) {
		this.orderConfirmation = orderConfirmation;
	}

	protected  Boolean orderPickupReady;

	public Boolean getOrderPickupReady() {
		return this.orderPickupReady;
	}

	public void setOrderPickupReady(Boolean orderPickupReady) {
		this.orderPickupReady = orderPickupReady;
	}

	protected  Boolean orderPickupReminder;

	public Boolean getOrderPickupReminder() {
		return this.orderPickupReminder;
	}

	public void setOrderPickupReminder(Boolean orderPickupReminder) {
		this.orderPickupReminder = orderPickupReminder;
	}

	protected  Boolean shipmentAssigned;

	public Boolean getShipmentAssigned() {
		return this.shipmentAssigned;
	}

	public void setShipmentAssigned(Boolean shipmentAssigned) {
		this.shipmentAssigned = shipmentAssigned;
	}

	protected  Boolean shipmentFulfilled;

	public Boolean getShipmentFulfilled() {
		return this.shipmentFulfilled;
	}

	public void setShipmentFulfilled(Boolean shipmentFulfilled) {
		this.shipmentFulfilled = shipmentFulfilled;
	}

	protected  Boolean shipmentItemCanceled;

	public Boolean getShipmentItemCanceled() {
		return this.shipmentItemCanceled;
	}

	public void setShipmentItemCanceled(Boolean shipmentItemCanceled) {
		this.shipmentItemCanceled = shipmentItemCanceled;
	}

	protected  Boolean storeItemsCanceled;

	public Boolean getStoreItemsCanceled() {
		return this.storeItemsCanceled;
	}

	public void setStoreItemsCanceled(Boolean storeItemsCanceled) {
		this.storeItemsCanceled = storeItemsCanceled;
	}


}
