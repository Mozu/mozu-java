/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.FacetValue;

/**
 *	The value selected for a facet when indexing a product search.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer count;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	protected  String filterValue;

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	protected  Boolean isApplied;

	public Boolean getIsApplied() {
		return this.isApplied;
	}

	public void setIsApplied(Boolean isApplied) {
		this.isApplied = isApplied;
	}

	protected  Boolean isDisplayed;

	public Boolean getIsDisplayed() {
		return this.isDisplayed;
	}

	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	protected  String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	protected  String parentFacetValue;

	public String getParentFacetValue() {
		return this.parentFacetValue;
	}

	public void setParentFacetValue(String parentFacetValue) {
		this.parentFacetValue = parentFacetValue;
	}

	protected  String rangeQueryValueEnd;

	public String getRangeQueryValueEnd() {
		return this.rangeQueryValueEnd;
	}

	public void setRangeQueryValueEnd(String rangeQueryValueEnd) {
		this.rangeQueryValueEnd = rangeQueryValueEnd;
	}

	protected  String rangeQueryValueStart;

	public String getRangeQueryValueStart() {
		return this.rangeQueryValueStart;
	}

	public void setRangeQueryValueStart(String rangeQueryValueStart) {
		this.rangeQueryValueStart = rangeQueryValueStart;
	}

	protected  String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	protected List<FacetValue> childrenFacetValues;
	public List<FacetValue> getChildrenFacetValues() {
		return this.childrenFacetValues;
	}
	public void setChildrenFacetValues(List<FacetValue> childrenFacetValues) {
		this.childrenFacetValues = childrenFacetValues;
	}


}
