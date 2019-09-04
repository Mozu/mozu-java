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

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThresholdMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer discountId;

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	protected  String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	protected  Boolean requiresCouponCode;

	public Boolean getRequiresCouponCode() {
		return this.requiresCouponCode;
	}

	public void setRequiresCouponCode(Boolean requiresCouponCode) {
		this.requiresCouponCode = requiresCouponCode;
	}

	protected  Boolean showInCart;

	public Boolean getShowInCart() {
		return this.showInCart;
	}

	public void setShowInCart(Boolean showInCart) {
		this.showInCart = showInCart;
	}

	protected  Boolean showOnCheckout;

	public Boolean getShowOnCheckout() {
		return this.showOnCheckout;
	}

	public void setShowOnCheckout(Boolean showOnCheckout) {
		this.showOnCheckout = showOnCheckout;
	}

	protected  Double thresholdValue;

	public Double getThresholdValue() {
		return this.thresholdValue;
	}

	public void setThresholdValue(Double thresholdValue) {
		this.thresholdValue = thresholdValue;
	}


}
