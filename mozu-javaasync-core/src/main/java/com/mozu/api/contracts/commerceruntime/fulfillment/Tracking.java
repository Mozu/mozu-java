/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tracking implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	public HashMap<String,Object> attributes;
	public HashMap<String,Object> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(HashMap<String,Object> attributes) {
		this.attributes = attributes;
	}

	protected  String number;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	protected  String url;

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
