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

/**
 *	A quote acting as a wishlist for a B2B account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Code that identifies the channel associated with the site for the shopper's created shopping cart, order, and return.
	 */
	protected  String channelCode;

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * Notes entered and saved with an order. These notes may be entered by a shopper on a wishlist or for an order. Comments may also be entered by  Admins on an order that may be visible only to authorized shoppers and users.
	 */
	protected List<String> comments;
	public List<String> getComments() {
		return this.comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	/**
	 * The localized currency code for the monetary amount.
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Unique identifer of the customer account. This ID is used to associate numerous types of data and object with the customer account, including orders, returns, wish lists, and in-store credit.
	 */
	protected  Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	/**
	 * The type of customer interaction used to create this shopping cart. Possible values are Website, Call, Store, or Unknown.
	 */
	protected  String customerInteractionType;

	public String getCustomerInteractionType() {
		return this.customerInteractionType;
	}

	public void setCustomerInteractionType(String customerInteractionType) {
		this.customerInteractionType = customerInteractionType;
	}

	/**
	 * The tax identification number (TIN) of the customer who submitted the order. If the customer who submitted the order has a customer account defined for the tenant, the system sets this value when the order is submitted.
	 */
	protected  String customerTaxId;

	public String getCustomerTaxId() {
		return this.customerTaxId;
	}

	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	/**
	 * The amount added to the order item for duty fees.
	 */
	protected  Double dutyAmount;

	public Double getDutyAmount() {
		return this.dutyAmount;
	}

	public void setDutyAmount(Double dutyAmount) {
		this.dutyAmount = dutyAmount;
	}

	/**
	 * Duties or tariffs for the Order as well as OrderItems (e.g. if the Order has a $5 duty or tariff for any reason and an OrderItem has a $2 duty or tariff then the value in this property would be $7)
	 */
	protected  Double dutyTotal;

	public Double getDutyTotal() {
		return this.dutyTotal;
	}

	public void setDutyTotal(Double dutyTotal) {
		this.dutyTotal = dutyTotal;
	}

	/**
	 * The email address for the customer account and contact. This email may be used for login to the storefront, receiving in-stock product notifications, and subscription mailing lists.
	 */
	protected  String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Date and time in UTC format when a discount, credit, wish list, or cart expires. An expired discount no longer can be redeemed. An expired wish list is no longer available. An expired credit can no longer be redeemed for a purchase. Acart becomes inactive and expired based on a system-calculated interval. For example, if an anonymous shopper has 14 days of inactivity, the cart is considered abandoned after that period of inactivity. System-supplied and read-only.
	 */
	protected  DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * The monetary sum of all fees incurred in the cart, order, line item in a cart, or line item in an order. This value is not calculated for wish lists at this time.
	 */
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
	 * Handling fees for the Order as well as OrderItems (e.g. if the Order has a $5 handling fee and an OrderItem has a $2 handling fee per item quantity then the value in this property would be $9)
	 */
	protected  Double handlingSubTotal;

	public Double getHandlingSubTotal() {
		return this.handlingSubTotal;
	}

	public void setHandlingSubTotal(Double handlingSubTotal) {
		this.handlingSubTotal = handlingSubTotal;
	}

	/**
	 * Calculated total tax amount for handling costs if the cart/order is subject to sales tax.
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
	 * The total fee for shipment handling.
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
	 * A captured and stored IP address. IP addresses are stored for the origin location of submitted orders and the tenant domain.
	 */
	protected  String ipAddress;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * If true, the order is exempt from applied sales tax.
	 */
	protected  Boolean isTaxExempt;

	public Boolean getIsTaxExempt() {
		return this.isTaxExempt;
	}

	public void setIsTaxExempt(Boolean isTaxExempt) {
		this.isTaxExempt = isTaxExempt;
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
	 * The applicable product discount for the order item.
	 */
	protected  Double itemLevelProductDiscountTotal;

	public Double getItemLevelProductDiscountTotal() {
		return this.itemLevelProductDiscountTotal;
	}

	public void setItemLevelProductDiscountTotal(Double itemLevelProductDiscountTotal) {
		this.itemLevelProductDiscountTotal = itemLevelProductDiscountTotal;
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
	 * The total amount of calculated tax for items, used by carts, orders, and wish lists.
	 */
	protected  Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	/**
	 * The total cost for the item.
	 */
	protected  Double itemTotal;

	public Double getItemTotal() {
		return this.itemTotal;
	}

	public void setItemTotal(Double itemTotal) {
		this.itemTotal = itemTotal;
	}

	/**
	 * The unique, user-defined code that identifies a location. This location can be the location where the order was entered, location for newly in-stock products, and where products are returned.
	 */
	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The order item number.
	 */
	protected  Integer number;

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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
	 * The applicable product discount for the order.
	 */
	protected  Double orderLevelProductDiscountTotal;

	public Double getOrderLevelProductDiscountTotal() {
		return this.orderLevelProductDiscountTotal;
	}

	public void setOrderLevelProductDiscountTotal(Double orderLevelProductDiscountTotal) {
		this.orderLevelProductDiscountTotal = orderLevelProductDiscountTotal;
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
	 * If the order is associated with a price list, this is the unique code of the price list.
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
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
	 * Unique identifier for the site. This IDÂ is used at all levels of a store, catalog, and tenant to associate objects to a site.
	 */
	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * The device from which the order originated in the case of offline orders.
	 */
	protected  String sourceDevice;

	public String getSourceDevice() {
		return this.sourceDevice;
	}

	public void setSourceDevice(String sourceDevice) {
		this.sourceDevice = sourceDevice;
	}

	/**
	 * The date and time the order was submitted. System-supplied and read-only.
	 */
	protected  DateTime submittedDate;

	public DateTime getSubmittedDate() {
		return this.submittedDate;
	}

	public void setSubmittedDate(DateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	/**
	 * Estimated amount of the cart or order without sales tax, shipping costs, and other fees. This amount is not calculated for wish lists at this time.
	 */
	protected  Double subTotal;

	public Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	/**
	 * Unique identifier for the tenant.
	 */
	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Total is used to indicate the monetary, estimated total amount of the cart or order, including items, sales tax, shipping costs, and other fees. Totals are not estimated for wish lists at this time.
	 */
	protected  Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected  String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Unique identifier of the customer visit in which the cart was created or last modified.
	 */
	protected  String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	/**
	 * Unique identifier of the web session in which the cart, order, return, or wish list was created or last modified.
	 */
	protected  String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Additional data provided with the other properties.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * The addresses that the purchaser intends to send these quote items to.
	 */
	protected List<Destination> destinations;
	public List<Destination> getDestinations() {
		return this.destinations;
	}
	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	/**
	 * The handling discounts applied to the order's handling fee.
	 */
	protected List<AppliedDiscount> handlingDiscounts;
	public List<AppliedDiscount> getHandlingDiscounts() {
		return this.handlingDiscounts;
	}
	public void setHandlingDiscounts(List<AppliedDiscount> handlingDiscounts) {
		this.handlingDiscounts = handlingDiscounts;
	}

	/**
	 * A list of requested items. All returned data is provided in an items array.For a failed request, the returned response may be success with an empty item array.
	 */
	protected List<OrderItem> items;
	public List<OrderItem> getItems() {
		return this.items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	/**
	 * List of order-level discounts projected to apply to the cart at checkout or order.
	 */
	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
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
