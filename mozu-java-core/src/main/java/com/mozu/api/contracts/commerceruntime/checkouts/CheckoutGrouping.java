/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.checkouts;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;
import com.mozu.api.contracts.commerceruntime.discounts.ShippingDiscount;

/**
 *	Mozu.CommerceRuntime.Contracts.Checkouts.CheckoutGrouping ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckoutGrouping implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The unique identifier of the destination.
	 */
	protected  String destinationId;

	public String getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	/**
	 * Grouping-level duty or tariff amount.
	 */
	protected  Double dutyAmount;

	public Double getDutyAmount() {
		return this.dutyAmount;
	}

	public void setDutyAmount(Double dutyAmount) {
		this.dutyAmount = dutyAmount;
	}

	/**
	 * Duties or tariff totals for the grouping.
	 */
	protected  Double dutyTotal;

	public Double getDutyTotal() {
		return this.dutyTotal;
	}

	public void setDutyTotal(Double dutyTotal) {
		this.dutyTotal = dutyTotal;
	}

	/**
	 * The method used to fulfill this cart or order item. The method includes direct ship or in-store pickup. The available methods depend on the supported fulfillment types for the product.
	 */
	protected  String fulfillmentMethod;

	public String getFulfillmentMethod() {
		return this.fulfillmentMethod;
	}

	public void setFulfillmentMethod(String fulfillmentMethod) {
		this.fulfillmentMethod = fulfillmentMethod;
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
	 * Handling fees for the grouping.
	 */
	protected  Double handlingSubTotal;

	public Double getHandlingSubTotal() {
		return this.handlingSubTotal;
	}

	public void setHandlingSubTotal(Double handlingSubTotal) {
		this.handlingSubTotal = handlingSubTotal;
	}

	/**
	 * Calculated total tax amount for handling costs of the grouping if the cart/order is subject to sales tax.
	 */
	protected  Double handlingTax;

	public Double getHandlingTax() {
		return this.handlingTax;
	}

	public void setHandlingTax(Double handlingTax) {
		this.handlingTax = handlingTax;
	}

	/**
	 * Calculated total tax amount for handling costs if the cart/order is subject to sales tax.
	 */
	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	/**
	 * The total handling cost for the grouping.
	 */
	protected  Double handlingTotal;

	public Double getHandlingTotal() {
		return this.handlingTotal;
	}

	public void setHandlingTotal(Double handlingTotal) {
		this.handlingTotal = handlingTotal;
	}

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The handling discount total for the grouping item.
	 */
	protected  Double itemLevelHandlingDiscountTotal;

	public Double getItemLevelHandlingDiscountTotal() {
		return this.itemLevelHandlingDiscountTotal;
	}

	public void setItemLevelHandlingDiscountTotal(Double itemLevelHandlingDiscountTotal) {
		this.itemLevelHandlingDiscountTotal = itemLevelHandlingDiscountTotal;
	}

	/**
	 * The applicable shipping discount for the grouping item.
	 */
	protected  Double itemLevelShippingDiscountTotal;

	public Double getItemLevelShippingDiscountTotal() {
		return this.itemLevelShippingDiscountTotal;
	}

	public void setItemLevelShippingDiscountTotal(Double itemLevelShippingDiscountTotal) {
		this.itemLevelShippingDiscountTotal = itemLevelShippingDiscountTotal;
	}

	/**
	 * The list of order item IDs that belong to the grouping.
	 */
	protected List<String> orderItemIds;
	public List<String> getOrderItemIds() {
		return this.orderItemIds;
	}
	public void setOrderItemIds(List<String> orderItemIds) {
		this.orderItemIds = orderItemIds;
	}

	/**
	 * The handling discount total at the order level.
	 */
	protected  Double orderLevelHandlingDiscountTotal;

	public Double getOrderLevelHandlingDiscountTotal() {
		return this.orderLevelHandlingDiscountTotal;
	}

	public void setOrderLevelHandlingDiscountTotal(Double orderLevelHandlingDiscountTotal) {
		this.orderLevelHandlingDiscountTotal = orderLevelHandlingDiscountTotal;
	}

	/**
	 * The shipping level discount at the order level.
	 */
	protected  Double orderLevelShippingDiscountTotal;

	public Double getOrderLevelShippingDiscountTotal() {
		return this.orderLevelShippingDiscountTotal;
	}

	public void setOrderLevelShippingDiscountTotal(Double orderLevelShippingDiscountTotal) {
		this.orderLevelShippingDiscountTotal = orderLevelShippingDiscountTotal;
	}

	/**
	 * The calculated monetary amount of shipping for a line items within and an entire order.
	 */
	protected  Double shippingAmount;

	public Double getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * The code associated with a carrier's shipping method service type, used during fulfillment of packages and shipments. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD and UPS_GROUND.If using a custom rate, this property corresponds to the  field in  when you navigate to  &gt;  &gt; , and then click on an existing rate or on .
	 */
	protected  String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * The carrier-supplied name for the shipping service type, such as "UPS Ground" or "2nd Day Air".If using a custom rate, this property corresponds to the  field in  when you navigate to  &gt;  &gt; , and then click on an existing rate or on .
	 */
	protected  String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	/**
	 * The shipping subtotal amount calculated without any applied discounts for line item and entire amounts of carts and orders. This property is not calculated for wish lists at this time.
	 */
	protected  Double shippingSubTotal;

	public Double getShippingSubTotal() {
		return this.shippingSubTotal;
	}

	public void setShippingSubTotal(Double shippingSubTotal) {
		this.shippingSubTotal = shippingSubTotal;
	}

	/**
	 * Amount of tax applied to shipping costs for line items in and entire orders.
	 */
	protected  Double shippingTax;

	public Double getShippingTax() {
		return this.shippingTax;
	}

	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	/**
	 * The total amount of tax incurred on the shipping charges in the cart and order. This property is not calculated at this time for wish lists.
	 */
	protected  Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	/**
	 * The calculated total shipping amount estimated for carts or orders, including tax. This amount is not calculated for wish lists at this time.
	 */
	protected  Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * standaloneGroup ApiType DOCUMENT_HERE 
	 */
	protected  Boolean standaloneGroup;

	public Boolean getStandaloneGroup() {
		return this.standaloneGroup;
	}

	public void setStandaloneGroup(Boolean standaloneGroup) {
		this.standaloneGroup = standaloneGroup;
	}

	/**
	 * The list of historically-applied handling discounts for the grouping. The active one will have IsExcluded == false.
	 */
	protected List<AppliedDiscount> handlingDiscounts;
	public List<AppliedDiscount> getHandlingDiscounts() {
		return this.handlingDiscounts;
	}
	public void setHandlingDiscounts(List<AppliedDiscount> handlingDiscounts) {
		this.handlingDiscounts = handlingDiscounts;
	}

	/**
	 * List of shipping discounts projected to apply to carts, orders, and wish lists and items at checkout.
	 */
	protected List<ShippingDiscount> shippingDiscounts;
	public List<ShippingDiscount> getShippingDiscounts() {
		return this.shippingDiscounts;
	}
	public void setShippingDiscounts(List<ShippingDiscount> shippingDiscounts) {
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

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(taxData == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, taxData);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.taxData = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
