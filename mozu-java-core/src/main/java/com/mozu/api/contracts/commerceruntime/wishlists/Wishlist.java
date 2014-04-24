/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.wishlists;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
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

	/**
	 * Unique identifier of the channel associated with the wish list.
	 */
	protected String channelCode;

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Unique identifier of the customer account associated with the wish list.
	 */
	protected Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	/**
	 * The interaction type the shopper uses to create the wish list, wich is Website, Store, Call, or Unknown. This property is not used at this time and is reserved for future functionality.
	 */
	protected String customerInteractionType;

	public String getCustomerInteractionType() {
		return this.customerInteractionType;
	}

	public void setCustomerInteractionType(String customerInteractionType) {
		this.customerInteractionType = customerInteractionType;
	}

	/**
	 * The discounted subtotal of items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double discountedSubtotal;

	public Double getDiscountedSubtotal() {
		return this.discountedSubtotal;
	}

	public void setDiscountedSubtotal(Double discountedSubtotal) {
		this.discountedSubtotal = discountedSubtotal;
	}

	/**
	 * The subtotal of the cart including any applied discount calculations. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	/**
	 * Estimated amount of discounts applied to all items in the wish list, which is system-supplied and read-only.                                This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * The date and time this wish list expires. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	protected String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * The fee total of items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	/**
	 * The tax amount levied against the handling fee for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	/**
	 * Unique identifier of this shopper wish list. System-supplied and read only.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected DateTime importDate;

	public DateTime getImportDate() {
		return this.importDate;
	}

	public void setImportDate(DateTime importDate) {
		this.importDate = importDate;
	}

	protected Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * The total amount of tax for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	/**
	 * The date and time the wish list was last validated against the product catalog.
	 */
	protected DateTime lastValidationDate;

	public DateTime getLastValidationDate() {
		return this.lastValidationDate;
	}

	public void setLastValidationDate(DateTime lastValidationDate) {
		this.lastValidationDate = lastValidationDate;
	}

	/**
	 * The user-defined name of the shopper wish list. The name defined for a wish list does not have to be unique.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The type of privacy to apply to this wish list. Possible values are "Private" which makes the wish list viewable only to the shopper, "DirectShare" which makes the wish list viewable only to people with whom the shopper shares the wish list link, or "Public" which makes the wish list available to everyone. At this time, the system treats all shopper wish lists as "Public" regardless of the defined privacy type.
	 */
	protected String privacyType;

	public String getPrivacyType() {
		return this.privacyType;
	}

	public void setPrivacyType(String privacyType) {
		this.privacyType = privacyType;
	}

	/**
	 * The subtotaled shipping amount for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double shippingSubTotal;

	public Double getShippingSubTotal() {
		return this.shippingSubTotal;
	}

	public void setShippingSubTotal(Double shippingSubTotal) {
		this.shippingSubTotal = shippingSubTotal;
	}

	/**
	 * The total amount of tax levied against shipping charges for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	/**
	 * The total shipping costs for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * Unique identifier of the site.
	 */
	protected Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * The integer that represents the sequential order of this wish list in the customer's collection of wish lists.
	 */
	protected Integer sortOrder;

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * The subtotal of items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * The total tax amount for items in the wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double taxTotal;

	public Double getTaxTotal() {
		return this.taxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * The total amount of items in the wish list. This property value is not calculated at this time and is reserved for future functionality. If a site's structure distinguishes between wish list types, the site uses the value in this property to categorize the wish lists.
	 */
	protected Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * User-defined string that defines the type of wish list to define, such as wish list, baby registry, or Christmas list.
	 */
	protected String typeTag;

	public String getTypeTag() {
		return this.typeTag;
	}

	public void setTypeTag(String typeTag) {
		this.typeTag = typeTag;
	}

	/**
	 * System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 */
	protected String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Unique identifier of the customer visit in which the wish list was created or last modified. System-supplied and read only.
	 */
	protected String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	/**
	 * Unique identifier of the web session in which the wish list was created or last modified. System-supplied and read only.
	 */
	protected String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Collection of change messages logged for each modification to a shopper wish list. System-supplied and read only.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * Properties that determine how items in the wish list are fulfilled.
	 */
	protected FulfillmentInfo fulfillmentInfo;

	public FulfillmentInfo getFulfillmentInfo() {
		return this.fulfillmentInfo;
	}

	public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<WishlistItem> items;
	public List<WishlistItem> getItems() {
		return this.items;
	}
	public void setItems(List<WishlistItem> items) {
		this.items = items;
	}

	/**
	 * Any order discounts that apply to items in the wish list. This property is not used at this time and is reserved for future functionality.
	 */
	protected List<AppliedDiscount> orderDiscounts;
	public List<AppliedDiscount> getOrderDiscounts() {
		return this.orderDiscounts;
	}
	public void setOrderDiscounts(List<AppliedDiscount> orderDiscounts) {
		this.orderDiscounts = orderDiscounts;
	}

}
