/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.profile;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingadmin.profile.State;

/**
 *	Mozu.ShippingAdmin.Contracts.Profile.ShippingStates ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingStates implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 */
	protected  String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * The states of the shipping profile.
	 */
	protected List<State> states;
	public List<State> getStates() {
		return this.states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}


}
