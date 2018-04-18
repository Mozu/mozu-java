/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.extensibility.v1;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.paymentservice.extensibility.v1.Address;
import com.mozu.api.contracts.paymentservice.extensibility.v1.Contact;
import com.mozu.api.contracts.paymentservice.extensibility.v1.KeyValueTuple;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerInformation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected  String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	protected  String phoneNumber;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected  String requestorIp;

	public String getRequestorIp() {
		return this.requestorIp;
	}

	public void setRequestorIp(String requestorIp) {
		this.requestorIp = requestorIp;
	}

	protected  String requestorUrl;

	public String getRequestorUrl() {
		return this.requestorUrl;
	}

	public void setRequestorUrl(String requestorUrl) {
		this.requestorUrl = requestorUrl;
	}

	protected  String requestorUserAgent;

	public String getRequestorUserAgent() {
		return this.requestorUserAgent;
	}

	public void setRequestorUserAgent(String requestorUserAgent) {
		this.requestorUserAgent = requestorUserAgent;
	}

	protected  Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected  Contact contact;

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	protected List<KeyValueTuple> extendedInfo;
	public List<KeyValueTuple> getExtendedInfo() {
		return this.extendedInfo;
	}
	public void setExtendedInfo(List<KeyValueTuple> extendedInfo) {
		this.extendedInfo = extendedInfo;
	}


}
