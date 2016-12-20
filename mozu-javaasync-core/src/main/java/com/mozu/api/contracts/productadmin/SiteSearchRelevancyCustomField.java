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
 *	Properties for setting custom field site search keyword relevancy settings. Relevancy determines the calculated matched of entered search strings against keywords. The relevancy weight can determine the order of importance for matching a search term such as categories before or after product names.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchRelevancyCustomField implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Name of the field.
	 */
	protected  String fieldName;

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * Relative weight of the field for relevancy purposes.
	 */
	protected  Integer fieldWeight;

	public Integer getFieldWeight() {
		return this.fieldWeight;
	}

	public void setFieldWeight(Integer fieldWeight) {
		this.fieldWeight = fieldWeight;
	}


}
