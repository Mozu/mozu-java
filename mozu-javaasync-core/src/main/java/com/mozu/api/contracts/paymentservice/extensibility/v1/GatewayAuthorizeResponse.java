/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.extensibility.v1;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.paymentservice.extensibility.v1.ConnectionStatuses;
import com.mozu.api.contracts.paymentservice.extensibility.v1.KeyValueTuple;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GatewayAuthorizeResponse implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String authCode;

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	protected  String avsCodes;

	public String getAvsCodes() {
		return this.avsCodes;
	}

	public void setAvsCodes(String avsCodes) {
		this.avsCodes = avsCodes;
	}

	protected  String cvV2Codes;

	public String getCvV2Codes() {
		return this.cvV2Codes;
	}

	public void setCvV2Codes(String cvV2Codes) {
		this.cvV2Codes = cvV2Codes;
	}

	protected  Boolean isDeclined;

	public Boolean getIsDeclined() {
		return this.isDeclined;
	}

	public void setIsDeclined(Boolean isDeclined) {
		this.isDeclined = isDeclined;
	}

	protected  String responseCode;

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	protected  String responseText;

	public String getResponseText() {
		return this.responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	protected  String transactionId;

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	protected  ConnectionStatuses remoteConnectionStatus;

	public ConnectionStatuses getRemoteConnectionStatus() {
		return this.remoteConnectionStatus;
	}

	public void setRemoteConnectionStatus(ConnectionStatuses remoteConnectionStatus) {
		this.remoteConnectionStatus = remoteConnectionStatus;
	}

	protected List<KeyValueTuple> responseData;
	public List<KeyValueTuple> getResponseData() {
		return this.responseData;
	}
	public void setResponseData(List<KeyValueTuple> responseData) {
		this.responseData = responseData;
	}


}
