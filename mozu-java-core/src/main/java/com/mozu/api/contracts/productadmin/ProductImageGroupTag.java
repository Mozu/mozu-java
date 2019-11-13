/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Tags are further details about the group, the FQN and specific option values, to identify the variants and cases that these images will be displayed for.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductImageGroupTag implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The FQN of the option to which this image group belongs.  Should match the fqn of the option that has a true value for isProductImageGroupSelector.
	 */
	protected  String fqn;

	public String getFqn() {
		return this.fqn;
	}

	public void setFqn(String fqn) {
		this.fqn = fqn;
	}

	/**
	 * List of value data for objects.
	 */
	protected List<String> values;
	public List<String> getValues() {
		return this.values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}


}
