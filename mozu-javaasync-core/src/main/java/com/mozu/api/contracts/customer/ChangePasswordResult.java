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

/**
 *	Mozu.Customer.Contracts.ChangePasswordResult ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangePasswordResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer account generated by the system. Account IDs are generated at account creation.
	 */
	protected  Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * A message describing why the operation failed.
	 */
	protected  String errorMessage;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * TRUE if the operation completes without error.
	 */
	protected  Boolean succeeded;

	public Boolean getSucceeded() {
		return this.succeeded;
	}

	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}


}
