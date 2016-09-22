/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingruntime.CustomAttribute;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.shippingruntime.RateRequestItem;

/**
 *	Properties required to request a shipping rate calculation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of shipping carriers for which to retrieve shipping rate information.
	 */
	protected List<String> carrierIds;
	public List<String> getCarrierIds() {
		return this.carrierIds;
	}
	public void setCarrierIds(List<String> carrierIds) {
		this.carrierIds = carrierIds;
	}

	/**
	 * The estimated date and time the shipment will be shipped to the shopper. This calculation is based on product stock, availability, date of order entry, and location.
	 */
	protected  DateTime estimatedShipmentDate;

	public DateTime getEstimatedShipmentDate() {
		return this.estimatedShipmentDate;
	}

	public void setEstimatedShipmentDate(DateTime estimatedShipmentDate) {
		this.estimatedShipmentDate = estimatedShipmentDate;
	}

	/**
	 * If true, the destination address associated with the shipping rate request is a commercial address.
	 */
	protected  Boolean isDestinationAddressCommercial;

	public Boolean getIsDestinationAddressCommercial() {
		return this.isDestinationAddressCommercial;
	}

	public void setIsDestinationAddressCommercial(Boolean isDestinationAddressCommercial) {
		this.isDestinationAddressCommercial = isDestinationAddressCommercial;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String isoCurrencyCode;

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	/**
	 * The Order SubTotal After Discounts to be used in rate calculation
	 */
	protected  Double orderDiscountedSubTotal;

	public Double getOrderDiscountedSubTotal() {
		return this.orderDiscountedSubTotal;
	}

	public void setOrderDiscountedSubTotal(Double orderDiscountedSubTotal) {
		this.orderDiscountedSubTotal = orderDiscountedSubTotal;
	}

	/**
	 * The total monetary amount of the order. This amount is used to calculate the shipping rate estimate.
	 */
	protected  Double orderTotal;

	public Double getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	 * The Order ID to be used in rate calculation Information al only
	 */
	protected  String relatedOrderId;

	public String getRelatedOrderId() {
		return this.relatedOrderId;
	}

	public void setRelatedOrderId(String relatedOrderId) {
		this.relatedOrderId = relatedOrderId;
	}

	/**
	 * The shipping methods associated with this request.
	 */
	protected List<String> shippingServiceTypes;
	public List<String> getShippingServiceTypes() {
		return this.shippingServiceTypes;
	}
	public void setShippingServiceTypes(List<String> shippingServiceTypes) {
		this.shippingServiceTypes = shippingServiceTypes;
	}

	/**
	 * Collection of carrier-specific key-value attribute pairs associated with a shipping carrier. These are required to retrieve a shipping rate request and are returned for the generated shipping label.
	 */
	protected List<CustomAttribute> customAttributes;
	public List<CustomAttribute> getCustomAttributes() {
		return this.customAttributes;
	}
	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	/**
	 * Mozu.ShippingRuntime.Contracts.RateRequest data ApiTypeMember DOCUMENT_HERE 
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
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
	 * Collection list of items. All returned data is provided in an items array. For a failed request, the returned response may be success with an empty item collection. Items are used throughout APIs for carts, wish lists, documents, payments, returns, properties, and more.
	 */
	protected List<RateRequestItem> items;
	public List<RateRequestItem> getItems() {
		return this.items;
	}
	public void setItems(List<RateRequestItem> items) {
		this.items = items;
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

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
