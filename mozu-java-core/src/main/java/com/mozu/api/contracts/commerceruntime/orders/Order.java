/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.commerce.Adjustment;
import com.mozu.api.contracts.commerceruntime.orders.OrderAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage;
import com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;
import com.mozu.api.contracts.commerceruntime.discounts.InvalidCoupon;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.payments.Payment;
import com.mozu.api.contracts.commerceruntime.fulfillment.Pickup;
import com.mozu.api.contracts.commerceruntime.refunds.Refund;
import com.mozu.api.contracts.commerceruntime.fulfillment.Shipment;
import com.mozu.api.contracts.commerceruntime.discounts.ShippingDiscount;
import com.mozu.api.contracts.commerceruntime.orders.ShopperNotes;
import com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult;

/**
 *	Properties of an order, including its components.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The date and time the order was accepted by the tenant.
	 */
	protected  DateTime acceptedDate;

	public DateTime getAcceptedDate() {
		return this.acceptedDate;
	}

	public void setAcceptedDate(DateTime acceptedDate) {
		this.acceptedDate = acceptedDate;
	}

	/**
	 * Indicates if the customer account is opted to receive marketing materials. If true, the customer account is opted in for receiving the content. 
	 */
	protected  Boolean acceptsMarketing;

	public Boolean getAcceptsMarketing() {
		return this.acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	/**
	 * The amount of the order the shopper can receive in the event of a return. This amount represents the amount captured at the time the order was submitted, not when the order was returned.
	 */
	protected  Double amountAvailableForRefund;

	public Double getAmountAvailableForRefund() {
		return this.amountAvailableForRefund;
	}

	public void setAmountAvailableForRefund(Double amountAvailableForRefund) {
		this.amountAvailableForRefund = amountAvailableForRefund;
	}

	/**
	 * A counter for how much money has been issued in refunds. This calculated field does NOT include refunds issued in returns.
	 */
	protected  Double amountRefunded;

	public Double getAmountRefunded() {
		return this.amountRefunded;
	}

	public void setAmountRefunded(Double amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	/**
	 * The total amount of the order not currently associated with a payment. The shopper must create one or more payments to satisfy this amount before the order can be fully paid.
	 */
	protected  Double amountRemainingForPayment;

	public Double getAmountRemainingForPayment() {
		return this.amountRemainingForPayment;
	}

	public void setAmountRemainingForPayment(Double amountRemainingForPayment) {
		this.amountRemainingForPayment = amountRemainingForPayment;
	}

	/**
	 * Available actions you can complete for an order. These actions may differ depending on the status of the order, such as actions required to enter a payment, return of a package, and fulfillment of a shipment.
	 */
	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

	/**
	 * Date when the order was cancelled. System-supplied and read-only.
	 */
	protected  DateTime cancelledDate;

	public DateTime getCancelledDate() {
		return this.cancelledDate;
	}

	public void setCancelledDate(DateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

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
	 * Date when the order was closed. Closed order is an order that has been processed and the items shipped. System-supplied and read-only.
	 */
	protected  DateTime closedDate;

	public DateTime getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(DateTime closedDate) {
		this.closedDate = closedDate;
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
	 * The aggregate total for all items in the cart, including costs associated with shopper-defined options or extras and any applied discounts.
	 */
	protected  Double discountedSubtotal;

	public Double getDiscountedSubtotal() {
		return this.discountedSubtotal;
	}

	public void setDiscountedSubtotal(Double discountedSubtotal) {
		this.discountedSubtotal = discountedSubtotal;
	}

	/**
	 * The subtotal of the cart, order, and wishlist items, including any applied discount calculations. Wishlist subtotals may change depending on the length of time, available discounts, and stock amounts of products at the time of review by shoppers.
	 */
	protected  Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	/**
	 * Estimated amount of discounts applied to all items in the carts and orders. System-supplied and read-only. This value will be available at the wish list, cart item, order item, and wish list item level at a later time.
	 */
	protected  Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * Order level duty or tariff amount. Does not take into account duties or tariffs specifically on items on the order
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
	 * The email address of the specified user or the email address associated with the specified entity.
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
	 * Unique identifier used by an external program to identify a Mozu order, customer account, or wish list.
	 */
	protected  String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
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
	 * The current fulfillment status of the order, which is "Fulfilled," "NotFulfilled," or "PartiallyFulfilled." The order is considered fulfilled when all packages are shipped or all pickups are picked up.
	 */
	protected  String fulfillmentStatus;

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
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
	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	/**
	 * This total represents the handling amount value with any applied discounts.
	 */
	protected  Double handlingTotal;

	public Double getHandlingTotal() {
		return this.handlingTotal;
	}

	public void setHandlingTotal(Double handlingTotal) {
		this.handlingTotal = handlingTotal;
	}

	/**
	 * If true, the order has a draft that may include one or more uncommitted changes to the order or its components.
	 */
	protected  Boolean hasDraft;

	public Boolean getHasDraft() {
		return this.hasDraft;
	}

	public void setHasDraft(Boolean hasDraft) {
		this.hasDraft = hasDraft;
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
	 * The date and time an order or wish list is imported into Mozu. This is not the date and time it was created in the external application. 
	 */
	protected  DateTime importDate;

	public DateTime getImportDate() {
		return this.importDate;
	}

	public void setImportDate(DateTime importDate) {
		this.importDate = importDate;
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
	 * If true, this version of the order is a draft that might contain uncommitted changes.
	 */
	protected  Boolean isDraft;

	public Boolean getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	/**
	 * If true, the shopper can return any of the items in this order to the tenant.
	 */
	protected  Boolean isEligibleForReturns;

	public Boolean getIsEligibleForReturns() {
		return this.isEligibleForReturns;
	}

	public void setIsEligibleForReturns(Boolean isEligibleForReturns) {
		this.isEligibleForReturns = isEligibleForReturns;
	}

	/**
	 * Indicates if this object/data was imported from an outside source such as a data import or synchronization via an app or service. If true, this data was originally imported into Mozu and accessible through your store database. Examples of imported objects/data include orders and customer accounts.
	 */
	protected  Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
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
	 * The date in UTC Date/Time when the items in the cart were last validated against the site's product catalog. System-supplied and read-only.
	 */
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
	 * The order number that displays on the storefront which differs from the order ID.
	 */
	protected  Integer orderNumber;

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Identifier of the cart prior to the customer proceeding to checkout.
	 */
	protected  String originalCartId;

	public String getOriginalCartId() {
		return this.originalCartId;
	}

	public void setOriginalCartId(String originalCartId) {
		this.originalCartId = originalCartId;
	}

	/**
	 * If this Order has a parent Order, the parent Order ID is recorded here.
	 */
	protected  String parentOrderId;

	public String getParentOrderId() {
		return this.parentOrderId;
	}

	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	/**
	 * The current version number of the order, wish list, document list, or document type list.
	 */
	protected  String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	protected  Integer parentOrderNumber;

	public Integer getParentOrderNumber() {
		return this.parentOrderNumber;
	}

	public void setParentOrderNumber(Integer parentOrderNumber) {
		this.parentOrderNumber = parentOrderNumber;
	}

	/**
	 * If this order was created to fulfill an item replacement as part of a return merchandise authorization (RMA), the unique identifier of the return.
	 */
	protected  String parentReturnId;

	public String getParentReturnId() {
		return this.parentReturnId;
	}

	public void setParentReturnId(String parentReturnId) {
		this.parentReturnId = parentReturnId;
	}

	protected  Integer parentReturnNumber;

	public Integer getParentReturnNumber() {
		return this.parentReturnNumber;
	}

	public void setParentReturnNumber(Integer parentReturnNumber) {
		this.parentReturnNumber = parentReturnNumber;
	}

	/**
	 * Status of the payment for the specified order.
	 */
	protected  String paymentStatus;

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * Pricelist code for the order
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * Status of any returns associated with this order after it was completed.
	 */
	protected  String returnStatus;

	public String getReturnStatus() {
		return this.returnStatus;
	}

	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

	protected  Double shippingAmountBeforeDiscountsAndAdjustments;

	public Double getShippingAmountBeforeDiscountsAndAdjustments() {
		return this.shippingAmountBeforeDiscountsAndAdjustments;
	}

	public void setShippingAmountBeforeDiscountsAndAdjustments(Double shippingAmountBeforeDiscountsAndAdjustments) {
		this.shippingAmountBeforeDiscountsAndAdjustments = shippingAmountBeforeDiscountsAndAdjustments;
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
	 * Unique identifier of the site.
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
	 * The current status of an object. This status is specific to the object including payment (New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack), discount (Active, Scheduled, or Expired), returns (ReturnAuthorized), tenant, package (Fulfilled or NotFulfilled), application, master and product catalogs, orders (Pending, Submitted, Processing, Pending Review, Closed, or Canceled), and order validation results (Pass, Fail, Error, or Review).
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	protected  Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * The total monetary sum of sales tax estimated for a cart or order.
	 */
	protected  Double taxTotal;

	public Double getTaxTotal() {
		return this.taxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * Unique identifier of the Mozu tenant.
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
	 * The total amount collected to date for the order.
	 */
	protected  Double totalCollected;

	public Double getTotalCollected() {
		return this.totalCollected;
	}

	public void setTotalCollected(Double totalCollected) {
		this.totalCollected = totalCollected;
	}

	/**
	 * This specifies the order type. This means, was this order placed online or offline? Online means shopper created the order at checkout, offline means the order was a phone order.
	 */
	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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
	 * Properties of an ad-hoc price adjustment for an order.
	 */
	protected  Adjustment adjustment;

	public Adjustment getAdjustment() {
		return this.adjustment;
	}

	public void setAdjustment(Adjustment adjustment) {
		this.adjustment = adjustment;
	}

	/**
	 * Collection of attributes that may be paged list or a list, depending on the usage per object and API type. 
	 */
	protected List<OrderAttribute> attributes;
	public List<OrderAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<OrderAttribute> attributes) {
		this.attributes = attributes;
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
	 * Properties for the customer's billing information associated with an order or specific payment.
	 */
	protected  BillingInfo billingInfo;

	public BillingInfo getBillingInfo() {
		return this.billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}

	/**
	 * Collection (list or paged) of change messages logged for each modification made by a shopper to their carts, wishlists, orders, package, payment, pickup, and returns. Change log messages are system-supplied based on shopper actions and read only.
	 */
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
	 * Specifies the fulfillment of digital packages associated with this order.
	 */
	protected List<DigitalPackage> digitalPackages;
	public List<DigitalPackage> getDigitalPackages() {
		return this.digitalPackages;
	}
	public void setDigitalPackages(List<DigitalPackage> digitalPackages) {
		this.digitalPackages = digitalPackages;
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

	/**
	 * Properties of the information required to fulfill the cart, order, or wish list. Shoppers can fulfill ordered items by using in-store pickup or direct shipping.
	 */
	protected  FulfillmentInfo fulfillmentInfo;

	public FulfillmentInfo getFulfillmentInfo() {
		return this.fulfillmentInfo;
	}

	public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}

	protected  Adjustment handlingAdjustment;

	public Adjustment getHandlingAdjustment() {
		return this.handlingAdjustment;
	}

	public void setHandlingAdjustment(Adjustment handlingAdjustment) {
		this.handlingAdjustment = handlingAdjustment;
	}

	/**
	 * The list of historically-applied handling discounts.  The active one will have IsExcluded == false
	 */
	protected List<AppliedDiscount> handlingDiscounts;
	public List<AppliedDiscount> getHandlingDiscounts() {
		return this.handlingDiscounts;
	}
	public void setHandlingDiscounts(List<AppliedDiscount> handlingDiscounts) {
		this.handlingDiscounts = handlingDiscounts;
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

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<OrderItem> items;
	public List<OrderItem> getItems() {
		return this.items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	/**
	 * Paged list collection of note content for objects including customers, orders, and returns. 
	 */
	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
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
	 * Array list of physical packages shipped for a specified order.
	 */
	protected List<Package> packages;
	public List<Package> getPackages() {
		return this.packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	/**
	 * Wrapper for a collection of payments associated with an order or return. An order can include a number of payments until the full total is covered. 
	 */
	protected List<Payment> payments;
	public List<Payment> getPayments() {
		return this.payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	/**
	 * Array list of the in-store pickups defined for the order.
	 */
	protected List<Pickup> pickups;
	public List<Pickup> getPickups() {
		return this.pickups;
	}
	public void setPickups(List<Pickup> pickups) {
		this.pickups = pickups;
	}

	/**
	 * Refunds associated with this order. A refund is a single exchange of money from merchant to customer that either encapsulates a refund to a credit card or an issuance of a store credit. Refunds does not reduce the 'amount collected' on an order and it is possible for refunds to exceed the total order amount.
	 */
	protected List<Refund> refunds;
	public List<Refund> getRefunds() {
		return this.refunds;
	}
	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}

	/**
	 * Array list of the shipments defined to fulfill items in this order using the direct ship fulfillment method.
	 */
	protected List<Shipment> shipments;
	public List<Shipment> getShipments() {
		return this.shipments;
	}
	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	/**
	 * Properties of an ad-hoc price adjustment made for an order.
	 */
	protected  Adjustment shippingAdjustment;

	public Adjustment getShippingAdjustment() {
		return this.shippingAdjustment;
	}

	public void setShippingAdjustment(Adjustment shippingAdjustment) {
		this.shippingAdjustment = shippingAdjustment;
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
	 * A paged list collection of shopper notes for the order.
	 */
	protected  ShopperNotes shopperNotes;

	public ShopperNotes getShopperNotes() {
		return this.shopperNotes;
	}

	public void setShopperNotes(ShopperNotes shopperNotes) {
		this.shopperNotes = shopperNotes;
	}

	/**
	 * Response returned by an order validation capability application.
	 */
	protected List<OrderValidationResult> validationResults;
	public List<OrderValidationResult> getValidationResults() {
		return this.validationResults;
	}
	public void setValidationResults(List<OrderValidationResult> validationResults) {
		this.validationResults = validationResults;
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
