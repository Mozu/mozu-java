/**
 *     This code was manually created by Travis Patrick
 */
package com.mozu.api.contracts.sitesettings.order.fulfillment;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.sitesettings.order.fulfillment.Cancellation;
import com.mozu.api.contracts.sitesettings.order.fulfillment.ShippingMethod;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigurableShipmentRelease implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled){
		this.isEnabled = isEnabled;
	}

	protected Integer shipmentCreationOffset;

	public Integer getShipmentCreationOffset() {
		return this.shipmentCreationOffset;
	}

	public void setShipmentCreationOffset(Integer shipmentCreationOffset) {
		this.shipmentCreationOffset = shipmentCreationOffset;
	}

	protected Boolean reserveInventoryOnOrderPendingShipment;

	public Boolean getReserveInventoryOnOrderPendingShipment() {
		return this.reserveInventoryOnOrderPendingShipment;
	}

	public void setReserveInventoryOnOrderPendingShipment(Boolean reserveInventoryOnOrderPendingShipment) {
		this.reserveInventoryOnOrderPendingShipment = reserveInventoryOnOrderPendingShipment;
	}


}