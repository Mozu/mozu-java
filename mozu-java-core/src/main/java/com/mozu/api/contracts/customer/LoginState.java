/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginState implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected DateTime updatedOn;

	public DateTime getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(DateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	protected DateTime createdOn;

	public DateTime getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	protected Byte failedLoginAttemptCount;

	public Byte getFailedLoginAttemptCount() {
		return this.failedLoginAttemptCount;
	}

	public void setFailedLoginAttemptCount(Byte failedLoginAttemptCount) {
		this.failedLoginAttemptCount = failedLoginAttemptCount;
	}

	protected DateTime firstFailedLoginAttemptOn;

	public DateTime getFirstFailedLoginAttemptOn() {
		return this.firstFailedLoginAttemptOn;
	}

	public void setFirstFailedLoginAttemptOn(DateTime firstFailedLoginAttemptOn) {
		this.firstFailedLoginAttemptOn = firstFailedLoginAttemptOn;
	}

	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	protected Boolean isPasswordChangeRequired;

	public Boolean getIsPasswordChangeRequired() {
		return this.isPasswordChangeRequired;
	}

	public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
		this.isPasswordChangeRequired = isPasswordChangeRequired;
	}

	protected DateTime lastLockedOn;

	public DateTime getLastLockedOn() {
		return this.lastLockedOn;
	}

	public void setLastLockedOn(DateTime lastLockedOn) {
		this.lastLockedOn = lastLockedOn;
	}

	protected DateTime lastLoginOn;

	public DateTime getLastLoginOn() {
		return this.lastLoginOn;
	}

	public void setLastLoginOn(DateTime lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	protected DateTime lastPasswordChangeOn;

	public DateTime getLastPasswordChangeOn() {
		return this.lastPasswordChangeOn;
	}

	public void setLastPasswordChangeOn(DateTime lastPasswordChangeOn) {
		this.lastPasswordChangeOn = lastPasswordChangeOn;
	}

	protected Integer remainingLoginAttempts;

	public Integer getRemainingLoginAttempts() {
		return this.remainingLoginAttempts;
	}

	public void setRemainingLoginAttempts(Integer remainingLoginAttempts) {
		this.remainingLoginAttempts = remainingLoginAttempts;
	}

}
