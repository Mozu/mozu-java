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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.customer.B2BUser;

/**
 *	Mozu.Customer.Contracts.B2BUserAndAuthInfo ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class B2BUserAndAuthInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * externalPassword ApiType DOCUMENT_HERE 
	 */
	protected  String externalPassword;

	public String getExternalPassword() {
		return this.externalPassword;
	}

	public void setExternalPassword(String externalPassword) {
		this.externalPassword = externalPassword;
	}

	/**
	 * Indicates if this object/data was imported from an outside source such as a data import or synchronization via an app or service. If true, this data was originally imported into  and accessible through your store database. Examples of imported objects/data include orders and customer accounts.
	 */
	protected  Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * b2bUser ApiType DOCUMENT_HERE 
	 */
	protected  B2BUser b2bUser;

	public B2BUser getB2bUser() {
		return this.b2bUser;
	}

	public void setB2bUser(B2BUser b2bUser) {
		this.b2bUser = b2bUser;
	}


}
