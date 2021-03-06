/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	A card supported by the payment gateway enabled for the site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteGatewaySupportedCard implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * An identifier for the type of payment card being used in the gateway.
	 */
	protected  String cardTypeId;

	public String getCardTypeId() {
		return this.cardTypeId;
	}

	public void setCardTypeId(String cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	/**
	 * The identifier of the account for the gateway.
	 */
	protected  String gatewayAccountId;

	public String getGatewayAccountId() {
		return this.gatewayAccountId;
	}

	public void setGatewayAccountId(String gatewayAccountId) {
		this.gatewayAccountId = gatewayAccountId;
	}

	/**
	 * The type of payment, such as credit card, check, or PayPal Express. Additional payment types will be supported in future releases.
	 */
	protected  String paymentType;

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * The identifier of the account for the processing gateway.
	 */
	protected  String processingGatewayAccountId;

	public String getProcessingGatewayAccountId() {
		return this.processingGatewayAccountId;
	}

	public void setProcessingGatewayAccountId(String processingGatewayAccountId) {
		this.processingGatewayAccountId = processingGatewayAccountId;
	}


}
