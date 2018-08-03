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
import com.mozu.api.contracts.customer.CustomerAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.customer.CommerceSummary;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CustomerNote;
import com.mozu.api.contracts.customer.CustomerSegment;

/**
 *	Properties of the customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAccount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean acceptsMarketing;

	public Boolean getAcceptsMarketing() {
		return this.acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	protected  String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	/**
	 * customerSet ApiType DOCUMENT_HERE
	 */
	protected  String customerSet;

	public String getCustomerSet() {
		return this.customerSet;
	}

	public void setCustomerSet(String customerSet) {
		this.customerSet = customerSet;
	}

	/**
	 * This property tracks the customer account creation date. This date can be set manually via the APIÂ for customer accounts that are imported into .
	 */
	protected  DateTime customerSinceDate;

	public DateTime getCustomerSinceDate() {
		return this.customerSinceDate;
	}

	public void setCustomerSinceDate(DateTime customerSinceDate) {
		this.customerSinceDate = customerSinceDate;
	}

	/**
	 * The email address for the customer account and contact. This email may be used for login to the storefront and for subscription mailing lists.
	 */
	protected  String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Unique identifier used by an external program to identify a  order, customer account, or wish list.
	 */
	protected  String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * The full first name of a customer or contact name.
	 */
	protected  String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Indicates if an external password is set on this account.
	 */
	protected  Boolean hasExternalPassword;

	public Boolean getHasExternalPassword() {
		return this.hasExternalPassword;
	}

	public void setHasExternalPassword(Boolean hasExternalPassword) {
		this.hasExternalPassword = hasExternalPassword;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object or feature is active.
	 */
	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, this customer account represents an anonymous shopper.
	 */
	protected  Boolean isAnonymous;

	public Boolean getIsAnonymous() {
		return this.isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	/**
	 * Indicates if a customer account and associated data is locked. If true, the user account is locked due to multiple failed authentication attempts. The user cannot login until the account is unlocked.
	 */
	protected  Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * The full last name of a customer or contact name.
	 */
	protected  String lastName;

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected  String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	protected  Boolean taxExempt;

	public Boolean getTaxExempt() {
		return this.taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	protected  String taxId;

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	protected  String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * The user name associated with the user profile. The customer uses the user name to access the account.
	 */
	protected  String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	protected List<CustomerAttribute> attributes;
	public List<CustomerAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<CustomerAttribute> attributes) {
		this.attributes = attributes;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  CommerceSummary commerceSummary;

	public CommerceSummary getCommerceSummary() {
		return this.commerceSummary;
	}

	public void setCommerceSummary(CommerceSummary commerceSummary) {
		this.commerceSummary = commerceSummary;
	}

	protected List<CustomerContact> contacts;
	public List<CustomerContact> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<CustomerContact> contacts) {
		this.contacts = contacts;
	}

	protected List<CustomerNote> notes;
	public List<CustomerNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<CustomerNote> notes) {
		this.notes = notes;
	}

	/**
	 * List of customer segments associated with the customer account. Customer accounts can be members of any number of segments.
	 */
	protected List<CustomerSegment> segments;
	public List<CustomerSegment> getSegments() {
		return this.segments;
	}
	public void setSegments(List<CustomerSegment> segments) {
		this.segments = segments;
	}


}
