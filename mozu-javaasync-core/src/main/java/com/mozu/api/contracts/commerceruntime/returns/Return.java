/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.payments.Payment;

/**
 *	Properties of a return of one or more previously fulfilled items.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Return implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean actionRequired;

	public Boolean getActionRequired() {
		return this.actionRequired;
	}

	public void setActionRequired(Boolean actionRequired) {
		this.actionRequired = actionRequired;
	}

	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

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

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	protected  Double lossTotal;

	public Double getLossTotal() {
		return this.lossTotal;
	}

	public void setLossTotal(Double lossTotal) {
		this.lossTotal = lossTotal;
	}

	protected  String originalOrderId;

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}

	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	/**
	 * The order number of the original order where the return was created.
	 */
	protected  Integer originalOrderNumber;

	public Integer getOriginalOrderNumber() {
		return this.originalOrderNumber;
	}

	public void setOriginalOrderNumber(Integer originalOrderNumber) {
		this.originalOrderNumber = originalOrderNumber;
	}

	protected  Double productLossTaxTotal;

	public Double getProductLossTaxTotal() {
		return this.productLossTaxTotal;
	}

	public void setProductLossTaxTotal(Double productLossTaxTotal) {
		this.productLossTaxTotal = productLossTaxTotal;
	}

	protected  Double productLossTotal;

	public Double getProductLossTotal() {
		return this.productLossTotal;
	}

	public void setProductLossTotal(Double productLossTotal) {
		this.productLossTotal = productLossTotal;
	}

	/**
	 * The status that indicates whether you have received the return item from the shopper. The accepted values are , , or .
	 */
	protected  String receiveStatus;

	public String getReceiveStatus() {
		return this.receiveStatus;
	}

	public void setReceiveStatus(String receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	protected  Double refundAmount;

	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * The status of the refund. The accepted values are  if the shopper only wants a replacement or  if either a partial or full refund is applied to the return.
	 */
	protected  String refundStatus;

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	/**
	 * The status of the replacement order. The accepted values are  if there is no replacement order or  if a replacement order exits.
	 */
	protected  String replaceStatus;

	public String getReplaceStatus() {
		return this.replaceStatus;
	}

	public void setReplaceStatus(String replaceStatus) {
		this.replaceStatus = replaceStatus;
	}

	protected  Integer returnNumber;

	public Integer getReturnNumber() {
		return this.returnNumber;
	}

	public void setReturnNumber(Integer returnNumber) {
		this.returnNumber = returnNumber;
	}

	protected  String returnOrderId;

	public String getReturnOrderId() {
		return this.returnOrderId;
	}

	public void setReturnOrderId(String returnOrderId) {
		this.returnOrderId = returnOrderId;
	}

	protected  String returnType;

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	protected  DateTime rmaDeadline;

	public DateTime getRmaDeadline() {
		return this.rmaDeadline;
	}

	public void setRmaDeadline(DateTime rmaDeadline) {
		this.rmaDeadline = rmaDeadline;
	}

	protected  Double shippingLossTaxTotal;

	public Double getShippingLossTaxTotal() {
		return this.shippingLossTaxTotal;
	}

	public void setShippingLossTaxTotal(Double shippingLossTaxTotal) {
		this.shippingLossTaxTotal = shippingLossTaxTotal;
	}

	protected  Double shippingLossTotal;

	public Double getShippingLossTotal() {
		return this.shippingLossTotal;
	}

	public void setShippingLossTotal(Double shippingLossTotal) {
		this.shippingLossTotal = shippingLossTotal;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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
	 * contact ApiType DOCUMENT_HERE 
	 */
	protected  Contact contact;

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	protected List<ReturnItem> items;
	public List<ReturnItem> getItems() {
		return this.items;
	}
	public void setItems(List<ReturnItem> items) {
		this.items = items;
	}

	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
	}

	protected List<Package> packages;
	public List<Package> getPackages() {
		return this.packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	protected List<Payment> payments;
	public List<Payment> getPayments() {
		return this.payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}


}
