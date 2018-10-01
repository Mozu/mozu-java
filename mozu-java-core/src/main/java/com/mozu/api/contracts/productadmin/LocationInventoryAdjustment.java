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

/**
 *	Properties of an adjustment to the active product inventory of a specific location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInventoryAdjustment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * User-defined code that identifies the location.
	 */
	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The type of inventory adjustment to perform, which is "Absolute" or "Delta". If adjusting by an absolute value, enter the integer in the Value parameter. If adjusting by a delta value, enter the delta in the Value parameter.
	 */
	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Value of the location inventory adjustment, which is an absolute integer or delta. For example, to decrease the current inventory level by 2, set the Type parameter to "Delta" and the Value parameter to "-2". To adjust the inventory to a current level of 12, set the Type parameter to "Absolute" and the Value parameter to "12".
	 */
	protected  Integer value;

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}


}
