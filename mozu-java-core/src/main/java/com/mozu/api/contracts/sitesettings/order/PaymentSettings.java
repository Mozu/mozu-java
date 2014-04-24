/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition;
import com.mozu.api.contracts.sitesettings.order.Gateway;

/**
 *	Properties of the payment settings used at order checkout time for the site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Settings that provide for the ability to pay for an order by mail.
	 */
	protected Boolean payByMail;

	public Boolean getPayByMail() {
		return this.payByMail;
	}

	public void setPayByMail(Boolean payByMail) {
		this.payByMail = payByMail;
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
	 * The external payment workflwo definitions configured for the site's payment settings. At this time, only PayPal Express is supported.
	 */
	protected List<ExternalPaymentWorkflowDefinition> externalPaymentWorkflowDefinitions;
	public List<ExternalPaymentWorkflowDefinition> getExternalPaymentWorkflowDefinitions() {
		return this.externalPaymentWorkflowDefinitions;
	}
	public void setExternalPaymentWorkflowDefinitions(List<ExternalPaymentWorkflowDefinition> externalPaymentWorkflowDefinitions) {
		this.externalPaymentWorkflowDefinitions = externalPaymentWorkflowDefinitions;
	}

	/**
	 * List of name and account information for a payment gateway. Additional payment gateway providers will be supported in future releases.
	 */
	protected List<Gateway> gateways;
	public List<Gateway> getGateways() {
		return this.gateways;
	}
	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

}
