/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.extensibility.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.PaymentService.Extensibility.Contracts.V1.Address ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * city ApiType DOCUMENT_HERE 
	 */
	protected  String city;

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * companyName ApiType DOCUMENT_HERE 
	 */
	protected  String companyName;

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * country ApiType DOCUMENT_HERE 
	 */
	protected  String country;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * line1 ApiType DOCUMENT_HERE 
	 */
	protected  String line1;

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * line2 ApiType DOCUMENT_HERE 
	 */
	protected  String line2;

	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * line3 ApiType DOCUMENT_HERE 
	 */
	protected  String line3;

	public String getLine3() {
		return this.line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	/**
	 * postalCode ApiType DOCUMENT_HERE 
	 */
	protected  String postalCode;

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * state ApiType DOCUMENT_HERE 
	 */
	protected  String state;

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
