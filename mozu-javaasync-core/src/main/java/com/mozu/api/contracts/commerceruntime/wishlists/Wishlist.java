/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.wishlists;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.discounts.SuggestedDiscount;
import com.mozu.api.contracts.commerceruntime.commerce.ThresholdMessage;
import com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;

/**
 *	Properties of a shopper wish list defined for a site, associated with a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wishlist implements Serializable
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

	protected  Double discountedSubtotal;

	public Double getDiscountedSubtotal() {
		return this.discountedSubtotal;
	}

	public void setDiscountedSubtotal(Double discountedSubtotal) {
		this.discountedSubtotal = discountedSubtotal;
	}

	protected  Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	protected  Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	protected  DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * The identifier an external program uses to identify the Mozu wish list.
	 */
	protected  String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	protected  Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If this wish list was imported from an external program, the date and time the wish list was imported.
	 */
	protected  DateTime importDate;

	public DateTime getImportDate() {
		return this.importDate;
	}

	public void setImportDate(DateTime importDate) {
		this.importDate = importDate;
	}

	/**
	 * If true, this wish list was imported from an external program.
	 */
	protected  Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	protected  Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	protected  DateTime lastValidationDate;

	public DateTime getLastValidationDate() {
		return this.lastValidationDate;
	}

	public void setLastValidationDate(DateTime lastValidationDate) {
		this.lastValidationDate = lastValidationDate;
	}

	protected  Double lineItemSubtotalWithOrderAdjustments;

	public Double getLineItemSubtotalWithOrderAdjustments() {
		return this.lineItemSubtotalWithOrderAdjustments;
	}

	public void setLineItemSubtotalWithOrderAdjustments(Double lineItemSubtotalWithOrderAdjustments) {
		this.lineItemSubtotalWithOrderAdjustments = lineItemSubtotalWithOrderAdjustments;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String privacyType;

	public String getPrivacyType() {
		return this.privacyType;
	}

	public void setPrivacyType(String privacyType) {
		this.privacyType = privacyType;
	}

	protected  Double shippingAmountBeforeDiscountsAndAdjustments;

	public Double getShippingAmountBeforeDiscountsAndAdjustments() {
		return this.shippingAmountBeforeDiscountsAndAdjustments;
	}

	public void setShippingAmountBeforeDiscountsAndAdjustments(Double shippingAmountBeforeDiscountsAndAdjustments) {
		this.shippingAmountBeforeDiscountsAndAdjustments = shippingAmountBeforeDiscountsAndAdjustments;
	}

	protected  Double shippingSubTotal;

	public Double getShippingSubTotal() {
		return this.shippingSubTotal;
	}

	public void setShippingSubTotal(Double shippingSubTotal) {
		this.shippingSubTotal = shippingSubTotal;
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

	protected  Integer sortOrder;

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	protected  Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	protected  Double taxTotal;

	public Double getTaxTotal() {
		return this.taxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		this.taxTotal = taxTotal;
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

	protected  String typeTag;

	public String getTypeTag() {
		return this.typeTag;
	}

	public void setTypeTag(String typeTag) {
		this.typeTag = typeTag;
	}

	protected  String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
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

	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	protected List<SuggestedDiscount> suggestedDiscounts;
	public List<SuggestedDiscount> getSuggestedDiscounts() {
		return this.suggestedDiscounts;
	}
	public void setSuggestedDiscounts(List<SuggestedDiscount> suggestedDiscounts) {
		this.suggestedDiscounts = suggestedDiscounts;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected List<ThresholdMessage> discountThresholdMessages;
	public List<ThresholdMessage> getDiscountThresholdMessages() {
		return this.discountThresholdMessages;
	}
	public void setDiscountThresholdMessages(List<ThresholdMessage> discountThresholdMessages) {
		this.discountThresholdMessages = discountThresholdMessages;
	}

	protected List<ExtendedProperty> extendedProperties;
	public List<ExtendedProperty> getExtendedProperties() {
		return this.extendedProperties;
	}
	public void setExtendedProperties(List<ExtendedProperty> extendedProperties) {
		this.extendedProperties = extendedProperties;
	}

	protected  FulfillmentInfo fulfillmentInfo;

	public FulfillmentInfo getFulfillmentInfo() {
		return this.fulfillmentInfo;
	}

	public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}

	protected List<WishlistItem> items;
	public List<WishlistItem> getItems() {
		return this.items;
	}
	public void setItems(List<WishlistItem> items) {
		this.items = items;
	}

	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
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
