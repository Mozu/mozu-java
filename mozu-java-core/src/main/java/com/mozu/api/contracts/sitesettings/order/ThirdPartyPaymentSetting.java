/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThirdPartyPaymentSetting implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String paymentProcessingFlowType;

	public String getPaymentProcessingFlowType() {
		return this.paymentProcessingFlowType;
	}

	public void setPaymentProcessingFlowType(String paymentProcessingFlowType) {
		this.paymentProcessingFlowType = paymentProcessingFlowType;
	}

	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}