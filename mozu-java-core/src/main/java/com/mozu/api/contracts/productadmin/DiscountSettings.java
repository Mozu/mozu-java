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
import com.mozu.api.contracts.productadmin.StackingConfiguration;

/**
 *	Indicates if the stacking is enabled for a specific catalog, here you can set the stacking configuration.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Where we can enable stacking and indicate how many layers we want to use for line item/order discounts.
	 */
	protected  StackingConfiguration stackingConfiguration;

	public StackingConfiguration getStackingConfiguration() {
		return this.stackingConfiguration;
	}

	public void setStackingConfiguration(StackingConfiguration stackingConfiguration) {
		this.stackingConfiguration = stackingConfiguration;
	}


}
