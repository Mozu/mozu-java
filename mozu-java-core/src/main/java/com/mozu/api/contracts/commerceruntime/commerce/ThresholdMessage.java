/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Information on where, when and what content to display in a threshold message to customers.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThresholdMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

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
	 * The text of the change message, such as "This product is no longer available." System-supplied and read-only.
	 */
	protected  String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Boolean field indicating whether or not threshold message requires the customer entering a coupon code to display.
	 */
	protected  Boolean requiresCouponCode;

	public Boolean getRequiresCouponCode() {
		return this.requiresCouponCode;
	}

	public void setRequiresCouponCode(Boolean requiresCouponCode) {
		this.requiresCouponCode = requiresCouponCode;
	}

	/**
	 * Boolean field indicating whether or not the threshold message should be displayed on the Cart page.
	 */
	protected  Boolean showInCart;

	public Boolean getShowInCart() {
		return this.showInCart;
	}

	public void setShowInCart(Boolean showInCart) {
		this.showInCart = showInCart;
	}

	/**
	 * Boolean field indicating whether or not the threshold message should display on the Checkout page
	 */
	protected  Boolean showOnCheckout;

	public Boolean getShowOnCheckout() {
		return this.showOnCheckout;
	}

	public void setShowOnCheckout(Boolean showOnCheckout) {
		this.showOnCheckout = showOnCheckout;
	}

	/**
	 * Numerical value representing the Cart minimum total to be satisfied in order to display the threshold message.
	 */
	protected  Double thresholdValue;

	public Double getThresholdValue() {
		return this.thresholdValue;
	}

	public void setThresholdValue(Double thresholdValue) {
		this.thresholdValue = thresholdValue;
	}


}
