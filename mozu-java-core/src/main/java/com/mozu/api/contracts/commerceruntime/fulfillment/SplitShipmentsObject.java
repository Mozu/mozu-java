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
import com.mozu.api.contracts.commerceruntime.fulfillment.Shipment;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SplitShipmentsObject implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<Shipment> newShipments;
	public List<Shipment> getNewShipments() {
		return this.newShipments;
	}
	public void setNewShipments(List<Shipment> newShipments) {
		this.newShipments = newShipments;
	}

	protected  Shipment originalShipment;

	public Shipment getOriginalShipment() {
		return this.originalShipment;
	}

	public void setOriginalShipment(Shipment originalShipment) {
		this.originalShipment = originalShipment;
	}


}
