/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of a success/failure message notification associated with validating a shipping rate.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingRateValidationMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String helpLink;

	public String getHelpLink() {
		return this.helpLink;
	}

	public void setHelpLink(String helpLink) {
		this.helpLink = helpLink;
	}

	protected  String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	protected  String severity;

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}


}
