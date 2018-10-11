/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.LocationInventory;

/**
 *	Array list of inventory definitions that manage the stock level of products at a given location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInventoryCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	protected List<LocationInventory> items;
	public List<LocationInventory> getItems() {
		return this.items;
	}
	public void setItems(List<LocationInventory> items) {
		this.items = items;
	}


}
