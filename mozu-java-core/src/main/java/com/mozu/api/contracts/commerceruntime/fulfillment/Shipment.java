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
import com.mozu.api.contracts.core.Contact;

/**
 *	Properties of a shipment used to ship order items to a shopper. A shipment can include any number of packages.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Total cost of shipping the shipment to the shopper.
	 */
	protected  Double cost;

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Array list of unique IDs of packages in a shipment planned for or finished a shipping fulfillment action. 
	 */
	protected List<String> packageIds;
	public List<String> getPackageIds() {
		return this.packageIds;
	}
	public void setPackageIds(List<String> packageIds) {
		this.packageIds = packageIds;
	}

	/**
	 * The code associated with a carrier's shipping method service type, used during fulfillment of packages and shipments. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD and UPS_GROUND.
	 */
	protected  String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * If true, a shopper signature is required to deliver this shipment.
	 */
	protected  Boolean signatureRequired;

	public Boolean getSignatureRequired() {
		return this.signatureRequired;
	}

	public void setSignatureRequired(Boolean signatureRequired) {
		this.signatureRequired = signatureRequired;
	}

	/**
	 * Tracking number for the package or shipment, supplied by the shipping carrier to track the shipment until fulfillment completes. The tracking number format may differ between carriers.
	 */
	protected  String trackingNumber;

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * The physical address orders are sent to as a shipping destination. This address may contain multiple lines, city, state/province, country, and zip/postal code. The destination is used to calculate shipping costs.
	 */
	protected  Contact destinationAddress;

	public Contact getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Contact destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * The physical address from which the order or shipment will ship.
	 */
	protected  Contact originAddress;

	public Contact getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Contact originAddress) {
		this.originAddress = originAddress;
	}


}
