/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	An option attribute configured for a product on a storefront.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOption implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  Object shopperEnteredValue;

	public Object getShopperEnteredValue() {
		return this.shopperEnteredValue;
	}

	public void setShopperEnteredValue(Object shopperEnteredValue) {
		this.shopperEnteredValue = shopperEnteredValue;
	}

	protected  String stringValue;

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	protected  Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}


}
