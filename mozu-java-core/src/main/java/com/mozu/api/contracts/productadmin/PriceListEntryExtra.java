/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListEntryExtra implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String attributeCode;

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	protected  String attributeName;

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	protected  String displayValue;

	public String getDisplayValue() {
		return this.displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	protected  Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	protected  Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}


}
