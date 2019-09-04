/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.quotes;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.fulfillment.Destination;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.commerceruntime.discounts.ShippingDiscount;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String channelCode;

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	protected List<String> comments;
	public List<String> getComments() {
		return this.comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected  Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	protected  String customerInteractionType;

	public String getCustomerInteractionType() {
		return this.customerInteractionType;
	}

	public void setCustomerInteractionType(String customerInteractionType) {
		this.customerInteractionType = customerInteractionType;
	}

	protected  String customerTaxId;

	public String getCustomerTaxId() {
		return this.customerTaxId;
	}

	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	protected  Double dutyAmount;

	public Double getDutyAmount() {
		return this.dutyAmount;
	}

	public void setDutyAmount(Double dutyAmount) {
		this.dutyAmount = dutyAmount;
	}

	protected  Double dutyTotal;

	public Double getDutyTotal() {
		return this.dutyTotal;
	}

	public void setDutyTotal(Double dutyTotal) {
		this.dutyTotal = dutyTotal;
	}

	protected  String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected  DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	protected  Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	protected  Double handlingAmount;

	public Double getHandlingAmount() {
		return this.handlingAmount;
	}

	public void setHandlingAmount(Double handlingAmount) {
		this.handlingAmount = handlingAmount;
	}

	protected  Double handlingSubTotal;

	public Double getHandlingSubTotal() {
		return this.handlingSubTotal;
	}

	public void setHandlingSubTotal(Double handlingSubTotal) {
		this.handlingSubTotal = handlingSubTotal;
	}

	protected  Double handlingTax;

	public Double getHandlingTax() {
		return this.handlingTax;
	}

	public void setHandlingTax(Double handlingTax) {
		this.handlingTax = handlingTax;
	}

	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	protected  Double handlingTotal;

	public Double getHandlingTotal() {
		return this.handlingTotal;
	}

	public void setHandlingTotal(Double handlingTotal) {
		this.handlingTotal = handlingTotal;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String ipAddress;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	protected  Boolean isTaxExempt;

	public Boolean getIsTaxExempt() {
		return this.isTaxExempt;
	}

	public void setIsTaxExempt(Boolean isTaxExempt) {
		this.isTaxExempt = isTaxExempt;
	}

	protected  Double itemLevelHandlingDiscountTotal;

	public Double getItemLevelHandlingDiscountTotal() {
		return this.itemLevelHandlingDiscountTotal;
	}

	public void setItemLevelHandlingDiscountTotal(Double itemLevelHandlingDiscountTotal) {
		this.itemLevelHandlingDiscountTotal = itemLevelHandlingDiscountTotal;
	}

	protected  Double itemLevelProductDiscountTotal;

	public Double getItemLevelProductDiscountTotal() {
		return this.itemLevelProductDiscountTotal;
	}

	public void setItemLevelProductDiscountTotal(Double itemLevelProductDiscountTotal) {
		this.itemLevelProductDiscountTotal = itemLevelProductDiscountTotal;
	}

	protected  Double itemLevelShippingDiscountTotal;

	public Double getItemLevelShippingDiscountTotal() {
		return this.itemLevelShippingDiscountTotal;
	}

	public void setItemLevelShippingDiscountTotal(Double itemLevelShippingDiscountTotal) {
		this.itemLevelShippingDiscountTotal = itemLevelShippingDiscountTotal;
	}

	protected  Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	protected  Double itemTotal;

	public Double getItemTotal() {
		return this.itemTotal;
	}

	public void setItemTotal(Double itemTotal) {
		this.itemTotal = itemTotal;
	}

	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  Integer number;

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	protected  Double orderLevelHandlingDiscountTotal;

	public Double getOrderLevelHandlingDiscountTotal() {
		return this.orderLevelHandlingDiscountTotal;
	}

	public void setOrderLevelHandlingDiscountTotal(Double orderLevelHandlingDiscountTotal) {
		this.orderLevelHandlingDiscountTotal = orderLevelHandlingDiscountTotal;
	}

	protected  Double orderLevelProductDiscountTotal;

	public Double getOrderLevelProductDiscountTotal() {
		return this.orderLevelProductDiscountTotal;
	}

	public void setOrderLevelProductDiscountTotal(Double orderLevelProductDiscountTotal) {
		this.orderLevelProductDiscountTotal = orderLevelProductDiscountTotal;
	}

	protected  Double orderLevelShippingDiscountTotal;

	public Double getOrderLevelShippingDiscountTotal() {
		return this.orderLevelShippingDiscountTotal;
	}

	public void setOrderLevelShippingDiscountTotal(Double orderLevelShippingDiscountTotal) {
		this.orderLevelShippingDiscountTotal = orderLevelShippingDiscountTotal;
	}

	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	protected  Double shippingAmount;

	public Double getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	protected  String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	protected  String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	protected  Double shippingSubTotal;

	public Double getShippingSubTotal() {
		return this.shippingSubTotal;
	}

	public void setShippingSubTotal(Double shippingSubTotal) {
		this.shippingSubTotal = shippingSubTotal;
	}

	protected  Double shippingTax;

	public Double getShippingTax() {
		return this.shippingTax;
	}

	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	protected  Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	protected  Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  String sourceDevice;

	public String getSourceDevice() {
		return this.sourceDevice;
	}

	public void setSourceDevice(String sourceDevice) {
		this.sourceDevice = sourceDevice;
	}

	protected  DateTime submittedDate;

	public DateTime getSubmittedDate() {
		return this.submittedDate;
	}

	public void setSubmittedDate(DateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	protected  Double subTotal;

	public Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected  Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	protected  String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	protected  String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	protected  String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected List<Destination> destinations;
	public List<Destination> getDestinations() {
		return this.destinations;
	}
	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	protected List<AppliedDiscount> handlingDiscounts;
	public List<AppliedDiscount> getHandlingDiscounts() {
		return this.handlingDiscounts;
	}
	public void setHandlingDiscounts(List<AppliedDiscount> handlingDiscounts) {
		this.handlingDiscounts = handlingDiscounts;
	}

	protected List<OrderItem> items;
	public List<OrderItem> getItems() {
		return this.items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
	}

	protected List<ShippingDiscount> shippingDiscounts;
	public List<ShippingDiscount> getShippingDiscounts() {
		return this.shippingDiscounts;
	}
	public void setShippingDiscounts(List<ShippingDiscount> shippingDiscounts) {
		this.shippingDiscounts = shippingDiscounts;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode taxData;

	public com.fasterxml.jackson.databind.JsonNode getTaxData() {
		return this.taxData;
	}

	public void setTaxData(com.fasterxml.jackson.databind.JsonNode taxData) {
		this.taxData = taxData;
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
