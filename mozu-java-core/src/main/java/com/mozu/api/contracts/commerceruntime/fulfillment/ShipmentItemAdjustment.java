/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentItemAdjustment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Double overridePrice;

	public Double getOverridePrice() {
		return this.overridePrice;
	}

	public void setOverridePrice(Double overridePrice) {
		this.overridePrice = overridePrice;
	}


}