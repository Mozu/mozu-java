/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.request;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	The request to be executed.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecuteRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The title of a method in the request.
	 */
	protected  String methodName;

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * The identifier of the token being used in the request.
	 */
	protected  String tokenId;

	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * The content body of the request.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode body;

	public com.fasterxml.jackson.databind.JsonNode getBody() {
		return this.body;
	}

	public void setBody(com.fasterxml.jackson.databind.JsonNode body) {
		this.body = body;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(body == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, body);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.body = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
