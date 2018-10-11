/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.Phone;

/**
 *	Contact information for an account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	protected  String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected  String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected  String lastNameOrSurname;

	public String getLastNameOrSurname() {
		return this.lastNameOrSurname;
	}

	public void setLastNameOrSurname(String lastNameOrSurname) {
		this.lastNameOrSurname = lastNameOrSurname;
	}

	protected  String middleNameOrInitial;

	public String getMiddleNameOrInitial() {
		return this.middleNameOrInitial;
	}

	public void setMiddleNameOrInitial(String middleNameOrInitial) {
		this.middleNameOrInitial = middleNameOrInitial;
	}

	protected  Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected  Phone phoneNumbers;

	public Phone getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(Phone phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


}
