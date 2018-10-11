/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Phone;
import com.mozu.api.contracts.customer.ContactType;

/**
 *	Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerContact implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

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

	/**
	 * The fax number associated with the customer account.
	 */
	protected  String faxNumber;

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
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

	/**
	 * Descriptive text used as a label for objects, such as field names, facets, date ranges, contact information, and package information.
	 */
	protected  String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  Phone phoneNumbers;

	public Phone getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(Phone phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	/**
	 * List of the types associated with a customer contact, such as Billing or Fulfillment.
	 */
	protected List<ContactType> types;
	public List<ContactType> getTypes() {
		return this.types;
	}
	public void setTypes(List<ContactType> types) {
		this.types = types;
	}


}
