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
import com.mozu.api.contracts.sitesettings.order.PurchaseOrderCustomField;
import com.mozu.api.contracts.sitesettings.order.PurchaseOrderPaymentTerm;

/**
 *	The details of the purchase order payment.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderPaymentDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies whether another payment can be used with the purchase order.
	 */
	protected  Boolean allowSplitPayment;

	public Boolean getAllowSplitPayment() {
		return this.allowSplitPayment;
	}

	public void setAllowSplitPayment(Boolean allowSplitPayment) {
		this.allowSplitPayment = allowSplitPayment;
	}

	/**
	 * Indicates if the object or process is enabled. This indicator is used on external payment workflows and product option values. For product options, if true, the product option value is available for a shopper to choose. During configuration, this property will be false if the option value is invalid with other selected options. For external payment workflows, if true, the workflow is enabled and available for routing payments for the submitted order.
	 */
	protected  Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * The details of the custom fields associated with the purchase order payment type for the specific site.You can create custom text fields that customers or CSRs can fill out when they use the purchase order payment method before submitting the order.Refer to [Custom Text Fields](https://www.mozu.com/docs/guides/orders/purchase-order.htm#custom_text_fields) in the Purchase Orders guides topic for more information.
	 */
	protected List<PurchaseOrderCustomField> customFields;
	public List<PurchaseOrderCustomField> getCustomFields() {
		return this.customFields;
	}
	public void setCustomFields(List<PurchaseOrderCustomField> customFields) {
		this.customFields = customFields;
	}

	/**
	 * The complete set of payment terms details for which all your customers are possibly applicable on that specific site.Refer to [Payment Terms](https://www.mozu.com/docs/guides/orders/purchase-order.htm#payment_terms) in the Purchase Orders guides topic for more information.
	 */
	protected List<PurchaseOrderPaymentTerm> paymentTerms;
	public List<PurchaseOrderPaymentTerm> getPaymentTerms() {
		return this.paymentTerms;
	}
	public void setPaymentTerms(List<PurchaseOrderPaymentTerm> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}


}
