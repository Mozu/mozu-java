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

/**
 *	Properties of an interaction with the payment gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentGatewayInteraction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String gatewayAuthCode;

	public String getGatewayAuthCode() {
		return this.gatewayAuthCode;
	}

	public void setGatewayAuthCode(String gatewayAuthCode) {
		this.gatewayAuthCode = gatewayAuthCode;
	}

	protected  String gatewayAVSCodes;

	public String getGatewayAVSCodes() {
		return this.gatewayAVSCodes;
	}

	public void setGatewayAVSCodes(String gatewayAVSCodes) {
		this.gatewayAVSCodes = gatewayAVSCodes;
	}

	protected  String gatewayCVV2Codes;

	public String getGatewayCVV2Codes() {
		return this.gatewayCVV2Codes;
	}

	public void setGatewayCVV2Codes(String gatewayCVV2Codes) {
		this.gatewayCVV2Codes = gatewayCVV2Codes;
	}

	protected  Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	protected  String gatewayResponseCode;

	public String getGatewayResponseCode() {
		return this.gatewayResponseCode;
	}

	public void setGatewayResponseCode(String gatewayResponseCode) {
		this.gatewayResponseCode = gatewayResponseCode;
	}

	/**
	 * Textual message returned by the payment gateway for the associated .Refer to [Gateway Response Code and Text](https://www.mozu.com/docs/developer/api-guides/payment-gateways.htm#gateway_response_code_and_text) in the API Guides for more information.
	 */
	protected  String gatewayResponseText;

	public String getGatewayResponseText() {
		return this.gatewayResponseText;
	}

	public void setGatewayResponseText(String gatewayResponseText) {
		this.gatewayResponseText = gatewayResponseText;
	}

	protected  String gatewayTransactionId;

	public String getGatewayTransactionId() {
		return this.gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}


}
