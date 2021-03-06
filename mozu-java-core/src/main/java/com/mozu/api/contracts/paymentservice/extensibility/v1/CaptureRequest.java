/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.extensibility.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.paymentservice.extensibility.v1.CardInformation;
import com.mozu.api.contracts.paymentservice.extensibility.v1.AdapterContext;
import com.mozu.api.contracts.paymentservice.extensibility.v1.CustomerInformation;
import com.mozu.api.contracts.paymentservice.extensibility.v1.PaymentToken;

/**
 *	Contains a capture request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptureRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The amount to capture.
	 */
	protected  Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * The api version of the call.
	 */
	protected  String apiVersion;

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/**
	 * The method name being called on the connector.
	 */
	protected  String methodName;

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * CardInformation object containing the card information.
	 */
	protected  CardInformation card;

	public CardInformation getCard() {
		return this.card;
	}

	public void setCard(CardInformation card) {
		this.card = card;
	}

	/**
	 * The AdapterContext information.
	 */
	protected  AdapterContext context;

	public AdapterContext getContext() {
		return this.context;
	}

	public void setContext(AdapterContext context) {
		this.context = context;
	}

	/**
	 * The data provided for the capture.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * The customer information for the shopper.
	 */
	protected  CustomerInformation shopper;

	public CustomerInformation getShopper() {
		return this.shopper;
	}

	public void setShopper(CustomerInformation shopper) {
		this.shopper = shopper;
	}

	/**
	 * The token being used for the capture.
	 */
	protected  PaymentToken token;

	public PaymentToken getToken() {
		return this.token;
	}

	public void setToken(PaymentToken token) {
		this.token = token;
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
