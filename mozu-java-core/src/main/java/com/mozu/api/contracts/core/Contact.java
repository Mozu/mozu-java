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

	/**
	 * The legal or doing business as (DBA) or tradestyle name of the business or organization. The maximum character length is 200.
	 */
	protected  String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	/**
	 * The email address of the specified user or the email address associated with the specified entity.
	 */
	protected  String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * The first name of the contact. The maximum character length is 200.
	 */
	protected  String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The last name or surname of the contact. The maximum character length is 200.
	 */
	protected  String lastNameOrSurname;

	public String getLastNameOrSurname() {
		return this.lastNameOrSurname;
	}

	public void setLastNameOrSurname(String lastNameOrSurname) {
		this.lastNameOrSurname = lastNameOrSurname;
	}

	/**
	 * The middle name or the first initial of the middle name of the contact. The maximum character length is 100.
	 */
	protected  String middleNameOrInitial;

	public String getMiddleNameOrInitial() {
		return this.middleNameOrInitial;
	}

	public void setMiddleNameOrInitial(String middleNameOrInitial) {
		this.middleNameOrInitial = middleNameOrInitial;
	}

	/**
	 * All address information for the contact. This data is used to validate the address for the customer account and includes the full address.
	 */
	protected  Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * List of phone numbers associated with the customer account contact. The phone numbers include area codes.
	 */
	protected  Phone phoneNumbers;

	public Phone getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(Phone phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


}
