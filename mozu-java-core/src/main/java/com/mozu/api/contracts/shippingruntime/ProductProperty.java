/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Details of a property defined for a product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProperty implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute. The attributeDefiniteId may be used to generate this name.
	 */
	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * List of value data for objects.
	 */
	protected List<Object> values;
	public List<Object> getValues() {
		return this.values;
	}
	public void setValues(List<Object> values) {
		this.values = values;
	}


}
