/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CapturableShipmentSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer shipmentNumber;

	public Integer getShipmentNumber() {
		return this.shipmentNumber;
	}

	public void setShipmentNumber(Integer shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	protected  Double shipmentTotal;

	public Double getShipmentTotal() {
		return this.shipmentTotal;
	}

	public void setShipmentTotal(Double shipmentTotal) {
		this.shipmentTotal = shipmentTotal;
	}


}
