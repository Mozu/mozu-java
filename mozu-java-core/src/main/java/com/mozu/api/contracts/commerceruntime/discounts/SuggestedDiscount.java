/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuggestedDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates whether the free BOGA item should automatically be added to cart. If the free item has been added before and the shopper removed the free item (rejected it), the value will be false.
	 */
	protected  Boolean autoAdd;

	public Boolean getAutoAdd() {
		return this.autoAdd;
	}

	public void setAutoAdd(Boolean autoAdd) {
		this.autoAdd = autoAdd;
	}

	/**
	 * The unique identifier of the discount.
	 */
	protected  Integer discountId;

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	/**
	 * The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


}
