/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.PricingRuntime.Contracts.TaxAttribute ApiType DOCUMENT_HERE
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxAttribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the attribute definition.
	 */
	protected  Integer attributeDefinitionId;

	public Integer getAttributeDefinitionId() {
		return this.attributeDefinitionId;
	}

	public void setAttributeDefinitionId(Integer attributeDefinitionId) {
		this.attributeDefinitionId = attributeDefinitionId;
	}

	/**
	 * Fully qualified name of the attribute for the order or customer.
	 */
	protected  String fullyQualifiedName;

	public String getFullyQualifiedName() {
		return this.fullyQualifiedName;
	}

	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
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
