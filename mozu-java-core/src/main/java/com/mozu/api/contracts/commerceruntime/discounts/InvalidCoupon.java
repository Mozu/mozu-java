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

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvalidCoupon implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	protected DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	protected String reason;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	protected Integer reasonCode;

	public Integer getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(Integer reasonCode) {
		this.reasonCode = reasonCode;
	}

}
