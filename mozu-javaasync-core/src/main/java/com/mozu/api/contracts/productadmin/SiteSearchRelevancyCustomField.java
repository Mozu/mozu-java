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

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSearchRelevancyCustomField implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String fieldName;

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	protected  Integer fieldWeight;

	public Integer getFieldWeight() {
		return this.fieldWeight;
	}

	public void setFieldWeight(Integer fieldWeight) {
		this.fieldWeight = fieldWeight;
	}


}
