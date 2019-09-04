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
import com.mozu.api.contracts.core.AuditInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CouponSet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer assignedDiscountCount;

	public Integer getAssignedDiscountCount() {
		return this.assignedDiscountCount;
	}

	public void setAssignedDiscountCount(Integer assignedDiscountCount) {
		this.assignedDiscountCount = assignedDiscountCount;
	}

	protected  Boolean canBeDeleted;

	public Boolean getCanBeDeleted() {
		return this.canBeDeleted;
	}

	public void setCanBeDeleted(Boolean canBeDeleted) {
		this.canBeDeleted = canBeDeleted;
	}

	protected  Integer couponCodeCount;

	public Integer getCouponCodeCount() {
		return this.couponCodeCount;
	}

	public void setCouponCodeCount(Integer couponCodeCount) {
		this.couponCodeCount = couponCodeCount;
	}

	protected  String couponCodeType;

	public String getCouponCodeType() {
		return this.couponCodeType;
	}

	public void setCouponCodeType(String couponCodeType) {
		this.couponCodeType = couponCodeType;
	}

	protected  String couponSetCode;

	public String getCouponSetCode() {
		return this.couponSetCode;
	}

	public void setCouponSetCode(String couponSetCode) {
		this.couponSetCode = couponSetCode;
	}

	protected  DateTime endDate;

	public DateTime getEndDate() {
		return this.endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected  Integer maxRedemptionsPerCouponCode;

	public Integer getMaxRedemptionsPerCouponCode() {
		return this.maxRedemptionsPerCouponCode;
	}

	public void setMaxRedemptionsPerCouponCode(Integer maxRedemptionsPerCouponCode) {
		this.maxRedemptionsPerCouponCode = maxRedemptionsPerCouponCode;
	}

	protected  Integer maxRedemptionsPerUser;

	public Integer getMaxRedemptionsPerUser() {
		return this.maxRedemptionsPerUser;
	}

	public void setMaxRedemptionsPerUser(Integer maxRedemptionsPerUser) {
		this.maxRedemptionsPerUser = maxRedemptionsPerUser;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  Integer redemptionCount;

	public Integer getRedemptionCount() {
		return this.redemptionCount;
	}

	public void setRedemptionCount(Integer redemptionCount) {
		this.redemptionCount = redemptionCount;
	}

	protected  Integer setSize;

	public Integer getSetSize() {
		return this.setSize;
	}

	public void setSetSize(Integer setSize) {
		this.setSize = setSize;
	}

	protected  DateTime startDate;

	public DateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
