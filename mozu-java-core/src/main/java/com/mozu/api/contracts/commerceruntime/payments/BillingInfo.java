/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.commerceruntime.payments.PaymentCard;
import com.mozu.api.contracts.commerceruntime.payments.CheckPayment;
import com.mozu.api.contracts.commerceruntime.payments.PurchaseOrderPayment;

/**
 *	Properties of the billing information entered for an order during checkout.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * customCreditType ApiType DOCUMENT_HERE
	 */
	protected  String customCreditType;

	public String getCustomCreditType() {
		return this.customCreditType;
	}

	public void setCustomCreditType(String customCreditType) {
		this.customCreditType = customCreditType;
	}

	/**
	 * Holds the transaction IDÂ for an external payment type service.
	 */
	protected  String externalTransactionId;

	public String getExternalTransactionId() {
		return this.externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	protected  Boolean isSameBillingShippingAddress;

	public Boolean getIsSameBillingShippingAddress() {
		return this.isSameBillingShippingAddress;
	}

	public void setIsSameBillingShippingAddress(Boolean isSameBillingShippingAddress) {
		this.isSameBillingShippingAddress = isSameBillingShippingAddress;
	}

	protected  String paymentType;

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * Identifies a specific workflow the payment goes through. This is used to define a workflow for external payment services.
	 */
	protected  String paymentWorkflow;

	public String getPaymentWorkflow() {
		return this.paymentWorkflow;
	}

	public void setPaymentWorkflow(String paymentWorkflow) {
		this.paymentWorkflow = paymentWorkflow;
	}

	/**
	 * The code that identifies the store credit to apply to the order.
	 */
	protected  String storeCreditCode;

	public String getStoreCreditCode() {
		return this.storeCreditCode;
	}

	public void setStoreCreditCode(String storeCreditCode) {
		this.storeCreditCode = storeCreditCode;
	}

	/**
	 * storeCreditType ApiType DOCUMENT_HERE
	 */
	protected  String storeCreditType;

	public String getStoreCreditType() {
		return this.storeCreditType;
	}

	public void setStoreCreditType(String storeCreditType) {
		this.storeCreditType = storeCreditType;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  Contact billingContact;

	public Contact getBillingContact() {
		return this.billingContact;
	}

	public void setBillingContact(Contact billingContact) {
		this.billingContact = billingContact;
	}

	protected  PaymentCard card;

	public PaymentCard getCard() {
		return this.card;
	}

	public void setCard(PaymentCard card) {
		this.card = card;
	}

	/**
	 * Information about the check used in the billing information, if it exists.
	 */
	protected  CheckPayment check;

	public CheckPayment getCheck() {
		return this.check;
	}

	public void setCheck(CheckPayment check) {
		this.check = check;
	}

	/**
	 * Custom data originated by the billing service.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * The purchase order payment details.
	 */
	protected  PurchaseOrderPayment purchaseOrder;

	public PurchaseOrderPayment getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrderPayment purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
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
