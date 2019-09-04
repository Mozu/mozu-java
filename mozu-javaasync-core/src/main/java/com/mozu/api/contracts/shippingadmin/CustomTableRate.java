/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingadmin.CustomTableRateContent;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomTableRate implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String deliveryDuration;

	public String getDeliveryDuration() {
		return this.deliveryDuration;
	}

	public void setDeliveryDuration(String deliveryDuration) {
		this.deliveryDuration = deliveryDuration;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String rateType;

	public String getRateType() {
		return this.rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	protected  Double value;

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	protected  CustomTableRateContent content;

	public CustomTableRateContent getContent() {
		return this.content;
	}

	public void setContent(CustomTableRateContent content) {
		this.content = content;
	}


}
