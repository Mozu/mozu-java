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
import com.mozu.api.contracts.productadmin.ProductPropertyValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariationProperty implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	protected List<ProductPropertyValue> values;
	public List<ProductPropertyValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductPropertyValue> values) {
		this.values = values;
	}


}
