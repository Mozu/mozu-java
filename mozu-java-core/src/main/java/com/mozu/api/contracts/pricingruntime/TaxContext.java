/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.Address;

/**
 *	The tax properties associated with the order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer in Mozu, used to associate customers with data, orders, returns, and in-store credit.
	 */
	protected  String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Unique identifier of the tax context.
	 */
	protected  String taxContextId;

	public String getTaxContextId() {
		return this.taxContextId;
	}

	public void setTaxContextId(String taxContextId) {
		this.taxContextId = taxContextId;
	}

	/**
	 * If the order is exempt from sales tax, the unique identifier of the tax exempt entity.
	 */
	protected  String taxExemptId;

	public String getTaxExemptId() {
		return this.taxExemptId;
	}

	public void setTaxExemptId(String taxExemptId) {
		this.taxExemptId = taxExemptId;
	}

	/**
	 * The physical address orders are sent to as a shipping destination. This address may contain multiple lines, city, state/province, country, and zip/postal code. The destination is used to calculate shipping costs.
	 */
	protected  Address destinationAddress;

	public Address getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * The physical address from which the order or shipment will ship.
	 */
	protected  Address originAddress;

	public Address getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Address originAddress) {
		this.originAddress = originAddress;
	}


}
