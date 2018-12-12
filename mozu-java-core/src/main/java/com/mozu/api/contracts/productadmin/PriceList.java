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

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer priceListSequence;

	public Integer getPriceListSequence() {
		return this.priceListSequence;
	}

	public void setPriceListSequence(Integer priceListSequence) {
		this.priceListSequence = priceListSequence;
	}

	protected List<Integer> defaultForSites;
	public List<Integer> getDefaultForSites() {
		return this.defaultForSites;
	}
	public void setDefaultForSites(List<Integer> defaultForSites) {
		this.defaultForSites = defaultForSites;
	}

	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected  Boolean filteredInStorefront;

	public Boolean getFilteredInStorefront() {
		return this.filteredInStorefront;
	}

	public void setFilteredInStorefront(Boolean filteredInStorefront) {
		this.filteredInStorefront = filteredInStorefront;
	}

	protected List<Integer> indexedSites;
	public List<Integer> getIndexedSites() {
		return this.indexedSites;
	}
	public void setIndexedSites(List<Integer> indexedSites) {
		this.indexedSites = indexedSites;
	}

	protected List<String> mappedCustomerSegments;
	public List<String> getMappedCustomerSegments() {
		return this.mappedCustomerSegments;
	}
	public void setMappedCustomerSegments(List<String> mappedCustomerSegments) {
		this.mappedCustomerSegments = mappedCustomerSegments;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String parentPriceListCode;

	public String getParentPriceListCode() {
		return this.parentPriceListCode;
	}

	public void setParentPriceListCode(String parentPriceListCode) {
		this.parentPriceListCode = parentPriceListCode;
	}

	protected  String parentPriceListName;

	public String getParentPriceListName() {
		return this.parentPriceListName;
	}

	public void setParentPriceListName(String parentPriceListName) {
		this.parentPriceListName = parentPriceListName;
	}

	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	protected  Integer rank;

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	protected  Boolean resolvable;

	public Boolean getResolvable() {
		return this.resolvable;
	}

	public void setResolvable(Boolean resolvable) {
		this.resolvable = resolvable;
	}

	protected  Boolean validForAllSites;

	public Boolean getValidForAllSites() {
		return this.validForAllSites;
	}

	public void setValidForAllSites(Boolean validForAllSites) {
		this.validForAllSites = validForAllSites;
	}

	protected List<Integer> validSites;
	public List<Integer> getValidSites() {
		return this.validSites;
	}
	public void setValidSites(List<Integer> validSites) {
		this.validSites = validSites;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
