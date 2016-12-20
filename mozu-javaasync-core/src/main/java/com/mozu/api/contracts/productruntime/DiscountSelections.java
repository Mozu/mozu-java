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

/**
 *	The discounts to evaluate for a specified product code at the time of purchase.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountSelections implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of discount IDs to evaluate for a product code.
	 */
	protected List<Integer> discountIds;
	public List<Integer> getDiscountIds() {
		return this.discountIds;
	}
	public void setDiscountIds(List<Integer> discountIds) {
		this.discountIds = discountIds;
	}


}
