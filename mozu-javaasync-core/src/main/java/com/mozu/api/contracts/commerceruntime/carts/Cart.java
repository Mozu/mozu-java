/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.carts;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.carts.CartMessage;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.commerce.ThresholdMessage;
import com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.discounts.InvalidCoupon;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;
import com.mozu.api.contracts.commerceruntime.discounts.SuggestedDiscount;

/**
 *	Properties of a shopping cart.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cart implements Serializable
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

	/**
	 * Array list of coupon codes associated with a shopping cart and the associated order. These codes are entered by a shopper when proceeding to checkout. 
	 */
	protected List<String> couponCodes;
	public List<String> getCouponCodes() {
		return this.couponCodes;
	}
	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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

	protected  Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	/**
	 * The combined price for all handling costs calculated together for shipped orders, not for digital or in-store pickup. This includes all handling costs per the product line items and options, excluding taxes and discounts.
	 */
	protected  Double handlingAmount;

	public Double getHandlingAmount() {
		return this.handlingAmount;
	}

	public void setHandlingAmount(Double handlingAmount) {
		this.handlingAmount = handlingAmount;
	}

	/**
	 * The handling fee subtotal included in the cart calculation.
	 */
	protected  Double handlingSubTotal;

	public Double getHandlingSubTotal() {
		return this.handlingSubTotal;
	}

	public void setHandlingSubTotal(Double handlingSubTotal) {
		this.handlingSubTotal = handlingSubTotal;
	}

	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	/**
	 * The handling fee total included in the cart calculation.
	 */
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

	/**
	 * The total charge for the line item with all weighted order level manual adjustments.
	 */
	protected  Double lineItemSubtotalWithOrderAdjustments;

	public Double getLineItemSubtotalWithOrderAdjustments() {
		return this.lineItemSubtotalWithOrderAdjustments;
	}

	public void setLineItemSubtotalWithOrderAdjustments(Double lineItemSubtotalWithOrderAdjustments) {
		this.lineItemSubtotalWithOrderAdjustments = lineItemSubtotalWithOrderAdjustments;
	}

	/**
	 * Pricelist code
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * The total shipping amount for the cart before discounts and adjustments.
	 */
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

	/**
	 * An array of message details associated with the cart.
	 */
	protected  CartMessage cartMessage;

	public CartMessage getCartMessage() {
		return this.cartMessage;
	}

	public void setCartMessage(CartMessage cartMessage) {
		this.cartMessage = cartMessage;
	}

	/**
	 * A list of cart messages associated with the cart.
	 */
	protected List<CartMessage> cartMessages;
	public List<CartMessage> getCartMessages() {
		return this.cartMessages;
	}
	public void setCartMessages(List<CartMessage> cartMessages) {
		this.cartMessages = cartMessages;
	}

	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * Custom data for a given vendor set within the commerce process.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * A list of threshold messages to display on Cart page.
	 */
	protected List<ThresholdMessage> discountThresholdMessages;
	public List<ThresholdMessage> getDiscountThresholdMessages() {
		return this.discountThresholdMessages;
	}
	public void setDiscountThresholdMessages(List<ThresholdMessage> discountThresholdMessages) {
		this.discountThresholdMessages = discountThresholdMessages;
	}

	/**
	 * Extra properties (key-value pairs) that extend the primary object. Think of this as a property bag of string keys and string values.
	 */
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

	/**
	 * The list of invalid coupons the shopper attempted to enter for the cart or order. These coupons may no longer be valid or incorrectly entered.
	 */
	protected List<InvalidCoupon> invalidCoupons;
	public List<InvalidCoupon> getInvalidCoupons() {
		return this.invalidCoupons;
	}
	public void setInvalidCoupons(List<InvalidCoupon> invalidCoupons) {
		this.invalidCoupons = invalidCoupons;
	}

	protected List<CartItem> items;
	public List<CartItem> getItems() {
		return this.items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}

	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
	}

	/**
	 * Refers to the BOGA discounts that are currently satisfied but whose free item has not yet been added.
	 */
	protected List<SuggestedDiscount> suggestedDiscounts;
	public List<SuggestedDiscount> getSuggestedDiscounts() {
		return this.suggestedDiscounts;
	}
	public void setSuggestedDiscounts(List<SuggestedDiscount> suggestedDiscounts) {
		this.suggestedDiscounts = suggestedDiscounts;
	}

	/**
	 * Leverage this property within a [tax Arc.js action](https://www.mozu.com/docs/arcjs/commerce-catalog-storefront-tax/commerce-catalog-storefront-tax.htm) to supplement the tax information for this item or object with custom JSON data.
	 */
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
