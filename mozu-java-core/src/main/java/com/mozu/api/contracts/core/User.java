/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.UserRole;
import com.mozu.api.contracts.core.UserSystemData;

/**
 *	Properties of the user. Users include customers and  users.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	protected  String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	protected  String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	protected  String lastName;

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected  String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	protected  Boolean optInToEmail;

	public Boolean getOptInToEmail() {
		return this.optInToEmail;
	}

	public void setOptInToEmail(Boolean optInToEmail) {
		this.optInToEmail = optInToEmail;
	}

	protected  Boolean optInToTextMessage;

	public Boolean getOptInToTextMessage() {
		return this.optInToTextMessage;
	}

	public void setOptInToTextMessage(Boolean optInToTextMessage) {
		this.optInToTextMessage = optInToTextMessage;
	}

	protected  String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	protected  String phoneNumber;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected  String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	protected List<UserRole> roles;
	public List<UserRole> getRoles() {
		return this.roles;
	}
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	protected  UserSystemData systemData;

	public UserSystemData getSystemData() {
		return this.systemData;
	}

	public void setSystemData(UserSystemData systemData) {
		this.systemData = systemData;
	}


}
