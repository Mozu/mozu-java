/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the active inventory managed for the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInventoryInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean manageStock;

	public Boolean getManageStock() {
		return this.manageStock;
	}

	public void setManageStock(Boolean manageStock) {
		this.manageStock = manageStock;
	}

	/**
	 * The location code for the direct ship location associated with the available online stock.
	 */
	protected  String onlineLocationCode;

	public String getOnlineLocationCode() {
		return this.onlineLocationCode;
	}

	public void setOnlineLocationCode(String onlineLocationCode) {
		this.onlineLocationCode = onlineLocationCode;
	}

	protected  Integer onlineSoftStockAvailable;

	public Integer getOnlineSoftStockAvailable() {
		return this.onlineSoftStockAvailable;
	}

	public void setOnlineSoftStockAvailable(Integer onlineSoftStockAvailable) {
		this.onlineSoftStockAvailable = onlineSoftStockAvailable;
	}

	protected  Integer onlineStockAvailable;

	public Integer getOnlineStockAvailable() {
		return this.onlineStockAvailable;
	}

	public void setOnlineStockAvailable(Integer onlineStockAvailable) {
		this.onlineStockAvailable = onlineStockAvailable;
	}

	protected  String outOfStockBehavior;

	public String getOutOfStockBehavior() {
		return this.outOfStockBehavior;
	}

	public void setOutOfStockBehavior(String outOfStockBehavior) {
		this.outOfStockBehavior = outOfStockBehavior;
	}


}
