/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin.search;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTuningRuleSortFields implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String inclusionExclusionType;

	public String getInclusionExclusionType() {
		return this.inclusionExclusionType;
	}

	public void setInclusionExclusionType(String inclusionExclusionType) {
		this.inclusionExclusionType = inclusionExclusionType;
	}

	protected List<String> sortFields;
	public List<String> getSortFields() {
		return this.sortFields;
	}
	public void setSortFields(List<String> sortFields) {
		this.sortFields = sortFields;
	}


}
