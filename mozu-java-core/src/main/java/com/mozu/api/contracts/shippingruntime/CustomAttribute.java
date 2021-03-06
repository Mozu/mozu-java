/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingruntime.CustomAttribute;

/**
 *	Properties of a custom attribute used to integrate with a shipping provider, which consists of an array of necessary key-value pairs.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomAttribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String key;

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	protected  String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	protected List<CustomAttribute> childAttributes;
	public List<CustomAttribute> getChildAttributes() {
		return this.childAttributes;
	}
	public void setChildAttributes(List<CustomAttribute> childAttributes) {
		this.childAttributes = childAttributes;
	}


}
