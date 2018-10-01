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
import com.mozu.api.contracts.productruntime.PriceListNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

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

	protected  Boolean filteredInStoreFront;

	public Boolean getFilteredInStoreFront() {
		return this.filteredInStoreFront;
	}

	public void setFilteredInStoreFront(Boolean filteredInStoreFront) {
		this.filteredInStoreFront = filteredInStoreFront;
	}

	protected  Boolean isIndexed;

	public Boolean getIsIndexed() {
		return this.isIndexed;
	}

	public void setIsIndexed(Boolean isIndexed) {
		this.isIndexed = isIndexed;
	}

	protected  Boolean isSiteDefault;

	public Boolean getIsSiteDefault() {
		return this.isSiteDefault;
	}

	public void setIsSiteDefault(Boolean isSiteDefault) {
		this.isSiteDefault = isSiteDefault;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	protected  Integer priceListId;

	public Integer getPriceListId() {
		return this.priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	protected  Boolean resolvable;

	public Boolean getResolvable() {
		return this.resolvable;
	}

	public void setResolvable(Boolean resolvable) {
		this.resolvable = resolvable;
	}

	protected List<Integer> validSites;
	public List<Integer> getValidSites() {
		return this.validSites;
	}
	public void setValidSites(List<Integer> validSites) {
		this.validSites = validSites;
	}

	protected List<PriceListNode> ancestors;
	public List<PriceListNode> getAncestors() {
		return this.ancestors;
	}
	public void setAncestors(List<PriceListNode> ancestors) {
		this.ancestors = ancestors;
	}

	protected List<PriceListNode> descendants;
	public List<PriceListNode> getDescendants() {
		return this.descendants;
	}
	public void setDescendants(List<PriceListNode> descendants) {
		this.descendants = descendants;
	}


}
