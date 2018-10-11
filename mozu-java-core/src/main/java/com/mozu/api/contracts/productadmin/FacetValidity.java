/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Describes whether a facet is currently valid and the reason. A facet may become invalid if the source data is changed in some ways (for example if the category tree structure is changed).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetValidity implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean isValid;

	public Boolean getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	protected  String reasonCode;

	public String getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}


}
