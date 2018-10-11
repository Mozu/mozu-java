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
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedLineItemProductDiscount;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedLineItemShippingDiscount;
import com.mozu.api.contracts.commerceruntime.commerce.CommerceUnitPrice;

/**
 *	Properties of an item in a shopper wish list.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WishlistItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The adjusted subtotal of the line item, including all manual adjustments, discounts, shipping charges and discounts, and duty or any other additional line item fees.
	 */
	protected  Double adjustedLineItemSubtotal;

	public Double getAdjustedLineItemSubtotal() {
		return this.adjustedLineItemSubtotal;
	}

	public void setAdjustedLineItemSubtotal(Double adjustedLineItemSubtotal) {
		this.adjustedLineItemSubtotal = adjustedLineItemSubtotal;
	}

	protected  Integer autoAddDiscountId;

	public Integer getAutoAddDiscountId() {
		return this.autoAddDiscountId;
	}

	public void setAutoAddDiscountId(Integer autoAddDiscountId) {
		this.autoAddDiscountId = autoAddDiscountId;
	}

	protected  String comments;

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	protected  Double extendedTotal;

	public Double getExtendedTotal() {
		return this.extendedTotal;
	}

	public void setExtendedTotal(Double extendedTotal) {
		this.extendedTotal = extendedTotal;
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

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	protected  Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	protected  Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	/**
	 * The line id assigned to the order item. Visible only in the Admin, this is set from the Admin or in CommerceRuntime when a cart is converted to an order.
	 */
	protected  Integer lineId;

	public Integer getLineId() {
		return this.lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	protected  String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	protected  String priorityType;

	public String getPriorityType() {
		return this.priorityType;
	}

	public void setPriorityType(String priorityType) {
		this.priorityType = priorityType;
	}

	protected  String purchasableStatusType;

	public String getPurchasableStatusType() {
		return this.purchasableStatusType;
	}

	public void setPurchasableStatusType(String purchasableStatusType) {
		this.purchasableStatusType = purchasableStatusType;
	}

	/**
	 * The location where the order item(s) was purchased.
	 */
	protected  String purchaseLocation;

	public String getPurchaseLocation() {
		return this.purchaseLocation;
	}

	public void setPurchaseLocation(String purchaseLocation) {
		this.purchaseLocation = purchaseLocation;
	}

	protected  Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * The total shipping amount for the line item before discounts and adjustments.
	 */
	protected  Double shippingAmountBeforeDiscountsAndAdjustments;

	public Double getShippingAmountBeforeDiscountsAndAdjustments() {
		return this.shippingAmountBeforeDiscountsAndAdjustments;
	}

	public void setShippingAmountBeforeDiscountsAndAdjustments(Double shippingAmountBeforeDiscountsAndAdjustments) {
		this.shippingAmountBeforeDiscountsAndAdjustments = shippingAmountBeforeDiscountsAndAdjustments;
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

	protected  Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	protected  Double taxableTotal;

	public Double getTaxableTotal() {
		return this.taxableTotal;
	}

	public void setTaxableTotal(Double taxableTotal) {
		this.taxableTotal = taxableTotal;
	}

	protected  Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * The total charge for the line item without any weighted order level shipping and handling charges.
	 */
	protected  Double totalWithoutWeightedShippingAndHandling;

	public Double getTotalWithoutWeightedShippingAndHandling() {
		return this.totalWithoutWeightedShippingAndHandling;
	}

	public void setTotalWithoutWeightedShippingAndHandling(Double totalWithoutWeightedShippingAndHandling) {
		this.totalWithoutWeightedShippingAndHandling = totalWithoutWeightedShippingAndHandling;
	}

	/**
	 * The total charge for the line item with all weighted order level shipping and handling charges.
	 */
	protected  Double totalWithWeightedShippingAndHandling;

	public Double getTotalWithWeightedShippingAndHandling() {
		return this.totalWithWeightedShippingAndHandling;
	}

	public void setTotalWithWeightedShippingAndHandling(Double totalWithWeightedShippingAndHandling) {
		this.totalWithWeightedShippingAndHandling = totalWithWeightedShippingAndHandling;
	}

	/**
	 * The total weighted order level manual adjustment amount.
	 */
	protected  Double weightedOrderAdjustment;

	public Double getWeightedOrderAdjustment() {
		return this.weightedOrderAdjustment;
	}

	public void setWeightedOrderAdjustment(Double weightedOrderAdjustment) {
		this.weightedOrderAdjustment = weightedOrderAdjustment;
	}

	/**
	 * The total weighted order level discount amount.
	 */
	protected  Double weightedOrderDiscount;

	public Double getWeightedOrderDiscount() {
		return this.weightedOrderDiscount;
	}

	public void setWeightedOrderDiscount(Double weightedOrderDiscount) {
		this.weightedOrderDiscount = weightedOrderDiscount;
	}

	/**
	 * The total weighted order level duty charges.
	 */
	protected  Double weightedOrderDuty;

	public Double getWeightedOrderDuty() {
		return this.weightedOrderDuty;
	}

	public void setWeightedOrderDuty(Double weightedOrderDuty) {
		this.weightedOrderDuty = weightedOrderDuty;
	}

	/**
	 * The adjustment to apply to the order handling fee.
	 */
	protected  Double weightedOrderHandlingAdjustment;

	public Double getWeightedOrderHandlingAdjustment() {
		return this.weightedOrderHandlingAdjustment;
	}

	public void setWeightedOrderHandlingAdjustment(Double weightedOrderHandlingAdjustment) {
		this.weightedOrderHandlingAdjustment = weightedOrderHandlingAdjustment;
	}

	/**
	 * The total weighted order level handling fee amount.
	 */
	protected  Double weightedOrderHandlingFee;

	public Double getWeightedOrderHandlingFee() {
		return this.weightedOrderHandlingFee;
	}

	public void setWeightedOrderHandlingFee(Double weightedOrderHandlingFee) {
		this.weightedOrderHandlingFee = weightedOrderHandlingFee;
	}

	/**
	 * The total weighted order handling fee discount amount.
	 */
	protected  Double weightedOrderHandlingFeeDiscount;

	public Double getWeightedOrderHandlingFeeDiscount() {
		return this.weightedOrderHandlingFeeDiscount;
	}

	public void setWeightedOrderHandlingFeeDiscount(Double weightedOrderHandlingFeeDiscount) {
		this.weightedOrderHandlingFeeDiscount = weightedOrderHandlingFeeDiscount;
	}

	/**
	 * The total weighted order level handling fee tax amount.
	 */
	protected  Double weightedOrderHandlingFeeTax;

	public Double getWeightedOrderHandlingFeeTax() {
		return this.weightedOrderHandlingFeeTax;
	}

	public void setWeightedOrderHandlingFeeTax(Double weightedOrderHandlingFeeTax) {
		this.weightedOrderHandlingFeeTax = weightedOrderHandlingFeeTax;
	}

	/**
	 * The total weighted order level shipping charge.
	 */
	protected  Double weightedOrderShipping;

	public Double getWeightedOrderShipping() {
		return this.weightedOrderShipping;
	}

	public void setWeightedOrderShipping(Double weightedOrderShipping) {
		this.weightedOrderShipping = weightedOrderShipping;
	}

	/**
	 * The total weighted order level shipping discount amount.
	 */
	protected  Double weightedOrderShippingDiscount;

	public Double getWeightedOrderShippingDiscount() {
		return this.weightedOrderShippingDiscount;
	}

	public void setWeightedOrderShippingDiscount(Double weightedOrderShippingDiscount) {
		this.weightedOrderShippingDiscount = weightedOrderShippingDiscount;
	}

	/**
	 * The total weighted order level shipping manual adjustment amount.
	 */
	protected  Double weightedOrderShippingManualAdjustment;

	public Double getWeightedOrderShippingManualAdjustment() {
		return this.weightedOrderShippingManualAdjustment;
	}

	public void setWeightedOrderShippingManualAdjustment(Double weightedOrderShippingManualAdjustment) {
		this.weightedOrderShippingManualAdjustment = weightedOrderShippingManualAdjustment;
	}

	/**
	 * The total weighted order level shipping tax amount.
	 */
	protected  Double weightedOrderShippingTax;

	public Double getWeightedOrderShippingTax() {
		return this.weightedOrderShippingTax;
	}

	public void setWeightedOrderShippingTax(Double weightedOrderShippingTax) {
		this.weightedOrderShippingTax = weightedOrderShippingTax;
	}

	/**
	 * The total weighted order level tax amount.
	 */
	protected  Double weightedOrderTax;

	public Double getWeightedOrderTax() {
		return this.weightedOrderTax;
	}

	public void setWeightedOrderTax(Double weightedOrderTax) {
		this.weightedOrderTax = weightedOrderTax;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
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

	protected  Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * The applicable product discount for an associated cart, order, or wish list. 
	 */
	protected  AppliedLineItemProductDiscount productDiscount;

	public AppliedLineItemProductDiscount getProductDiscount() {
		return this.productDiscount;
	}

	public void setProductDiscount(AppliedLineItemProductDiscount productDiscount) {
		this.productDiscount = productDiscount;
	}

	protected List<AppliedLineItemProductDiscount> productDiscounts;
	public List<AppliedLineItemProductDiscount> getProductDiscounts() {
		return this.productDiscounts;
	}
	public void setProductDiscounts(List<AppliedLineItemProductDiscount> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}

	protected List<AppliedLineItemShippingDiscount> shippingDiscounts;
	public List<AppliedLineItemShippingDiscount> getShippingDiscounts() {
		return this.shippingDiscounts;
	}
	public void setShippingDiscounts(List<AppliedLineItemShippingDiscount> shippingDiscounts) {
		this.shippingDiscounts = shippingDiscounts;
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

	protected  CommerceUnitPrice unitPrice;

	public CommerceUnitPrice getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(CommerceUnitPrice unitPrice) {
		this.unitPrice = unitPrice;
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
