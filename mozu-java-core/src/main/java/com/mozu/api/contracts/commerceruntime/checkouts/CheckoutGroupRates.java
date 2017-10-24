/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.checkouts;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckoutGroupRates implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String groupingId;

	public String getGroupingId() {
		return this.groupingId;
	}

	public void setGroupingId(String groupingId) {
		this.groupingId = groupingId;
	}

	protected List<ShippingRate> shippingRates;
	public List<ShippingRate> getShippingRates() {
		return this.shippingRates;
	}
	public void setShippingRates(List<ShippingRate> shippingRates) {
		this.shippingRates = shippingRates;
	}


}