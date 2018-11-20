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
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.FacetRangeQuery;
import com.mozu.api.contracts.productadmin.FacetSource;
import com.mozu.api.contracts.productadmin.FacetValidity;

/**
 *	Properties of the category, price, or attribute facet shoppers use to filter product display results on a storefront.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	protected  Integer facetId;

	public Integer getFacetId() {
		return this.facetId;
	}

	public void setFacetId(Integer facetId) {
		this.facetId = facetId;
	}

	protected  String facetType;

	public String getFacetType() {
		return this.facetType;
	}

	public void setFacetType(String facetType) {
		this.facetType = facetType;
	}

	protected  Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	protected  Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	protected  Integer overrideFacetId;

	public Integer getOverrideFacetId() {
		return this.overrideFacetId;
	}

	public void setOverrideFacetId(Integer overrideFacetId) {
		this.overrideFacetId = overrideFacetId;
	}

	protected  String valueSortType;

	public String getValueSortType() {
		return this.valueSortType;
	}

	public void setValueSortType(String valueSortType) {
		this.valueSortType = valueSortType;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<FacetRangeQuery> rangeQueries;
	public List<FacetRangeQuery> getRangeQueries() {
		return this.rangeQueries;
	}
	public void setRangeQueries(List<FacetRangeQuery> rangeQueries) {
		this.rangeQueries = rangeQueries;
	}

	protected  FacetSource source;

	public FacetSource getSource() {
		return this.source;
	}

	public void setSource(FacetSource source) {
		this.source = source;
	}

	protected  FacetValidity validity;

	public FacetValidity getValidity() {
		return this.validity;
	}

	public void setValidity(FacetValidity validity) {
		this.validity = validity;
	}


}
