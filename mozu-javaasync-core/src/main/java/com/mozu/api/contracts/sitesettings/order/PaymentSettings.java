/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition;
import com.mozu.api.contracts.sitesettings.order.Gateway;
import com.mozu.api.contracts.sitesettings.order.PurchaseOrderPaymentDefinition;

/**
 *	Properties of the payment settings used at order checkout time for the site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean payByMail;

	public Boolean getPayByMail() {
		return this.payByMail;
	}

	public void setPayByMail(Boolean payByMail) {
		this.payByMail = payByMail;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<ExternalPaymentWorkflowDefinition> externalPaymentWorkflowDefinitions;
	public List<ExternalPaymentWorkflowDefinition> getExternalPaymentWorkflowDefinitions() {
		return this.externalPaymentWorkflowDefinitions;
	}
	public void setExternalPaymentWorkflowDefinitions(List<ExternalPaymentWorkflowDefinition> externalPaymentWorkflowDefinitions) {
		this.externalPaymentWorkflowDefinitions = externalPaymentWorkflowDefinitions;
	}

	protected List<Gateway> gateways;
	public List<Gateway> getGateways() {
		return this.gateways;
	}
	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

	protected  PurchaseOrderPaymentDefinition purchaseOrder;

	public PurchaseOrderPaymentDefinition getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrderPaymentDefinition purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}


}
