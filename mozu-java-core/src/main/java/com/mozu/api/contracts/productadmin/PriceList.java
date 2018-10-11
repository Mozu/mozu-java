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

/**
 *	The details of the price list.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * A list of sites for which you want the price list the default. The default price list will be in effect on a site if the resolution logic does not return any applicable price lists for the shopper, for example, if the shopper does not belong to any applicable customer segments. Refer to [Default](https://www.mozu.com/docs/guides/catalog/price-lists.htm#default) in the Price Lists guides topic for more information.
	 */
	protected List<Integer> defaultForSites;
	public List<Integer> getDefaultForSites() {
		return this.defaultForSites;
	}
	public void setDefaultForSites(List<Integer> defaultForSites) {
		this.defaultForSites = defaultForSites;
	}

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Indicates if a capability, function tied to an Arc.js action, application, or price list is enabled for the tenant/site. If true, the capability/application/function/price list is enabled for the tenant. System-supplied and read-only with the exception of functions tied to an Arc.js action and price lists.
	 */
	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Indicates whether the price list is exclusive. When a price list is exclusive, shoppers that resolve to the exclusive price list can only view and purchase products that have price entries in the price list and any of its parents. The default is . Refer to [Exclusivity](https://www.mozu.com/docs/guides/catalog/price-lists.htm#exclusivity) for more information.
	 */
	protected  Boolean filteredInStorefront;

	public Boolean getFilteredInStorefront() {
		return this.filteredInStorefront;
	}

	public void setFilteredInStorefront(Boolean filteredInStorefront) {
		this.filteredInStorefront = filteredInStorefront;
	}

	/**
	 * A list of site identifiers for which the price list pricing is indexed. Refer to [Indexing](https://www.mozu.com/docs/guides/catalog/price-lists.htm#indexing) in the Price Lists guides topic for more information.
	 */
	protected List<Integer> indexedSites;
	public List<Integer> getIndexedSites() {
		return this.indexedSites;
	}
	public void setIndexedSites(List<Integer> indexedSites) {
		this.indexedSites = indexedSites;
	}

	/**
	 * A list of customer segment codes that  uses to determine the shoppers to whom the price list applies. Refer to [Resolution](https://www.mozu.com/docs/guides/catalog/price-lists.htm#resolution) in the Price Lists guides topic for more information.
	 */
	protected List<String> mappedCustomerSegments;
	public List<String> getMappedCustomerSegments() {
		return this.mappedCustomerSegments;
	}
	public void setMappedCustomerSegments(List<String> mappedCustomerSegments) {
		this.mappedCustomerSegments = mappedCustomerSegments;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The code of the price list's parent price list. You can assign each price list a parent price list, which allows each child price list to inherit the parent price list's overridden product pricing. Refer to [Inheritance](https://www.mozu.com/docs/guides/catalog/price-lists.htm#inheritance) in the Price Lists guides topic for more information.
	 */
	protected  String parentPriceListCode;

	public String getParentPriceListCode() {
		return this.parentPriceListCode;
	}

	public void setParentPriceListCode(String parentPriceListCode) {
		this.parentPriceListCode = parentPriceListCode;
	}

	/**
	 * The user-defined name of the parent price list, if applicable. This value is read-only.
	 */
	protected  String parentPriceListName;

	public String getParentPriceListName() {
		return this.parentPriceListName;
	}

	public void setParentPriceListName(String parentPriceListName) {
		this.parentPriceListName = parentPriceListName;
	}

	/**
	 * The unique, user-defined code of the price list.
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * A unique, internal ID of the price list. This property is read-only.
	 */
	protected  Integer priceListSequence;

	public Integer getPriceListSequence() {
		return this.priceListSequence;
	}

	public void setPriceListSequence(Integer priceListSequence) {
		this.priceListSequence = priceListSequence;
	}

	/**
	 * The resolution rank of the price list that is used to break ties when a customer is applicable for multiple price lists. A lower number represents a higher priority. In order avoid conflicts,  recommends setting this property to a unique value. Refer to [Resolution Rank](https://www.mozu.com/docs/guides/catalog/price-lists.htm#resolution_rank) in the Price List guides topic for more information.
	 */
	protected  Integer rank;

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * Specifies whether the price list is resolvable. When ,  is able to apply the price list and its product pricing directly to a shopper. When ,  is unable to apply the price list and its product pricing directly to a shopper; however  can still apply the price list to a shopper if it is a parent of a resolvable price list. Refer to [Resolution](https://www.mozu.com/docs/guides/catalog/price-lists.htm#resolution) in the Price List guides topic for more information.
	 */
	protected  Boolean resolvable;

	public Boolean getResolvable() {
		return this.resolvable;
	}

	public void setResolvable(Boolean resolvable) {
		this.resolvable = resolvable;
	}

	/**
	 * Specifies whether the price list is valid for all sites associated with the master catalog to which the price list belongs. If this property is , the  property is empty.
	 */
	protected  Boolean validForAllSites;

	public Boolean getValidForAllSites() {
		return this.validForAllSites;
	}

	public void setValidForAllSites(Boolean validForAllSites) {
		this.validForAllSites = validForAllSites;
	}

	/**
	 * A list of sites for which the price list is valid. If this property contains any entries, the  property is .
	 */
	protected List<Integer> validSites;
	public List<Integer> getValidSites() {
		return this.validSites;
	}
	public void setValidSites(List<Integer> validSites) {
		this.validSites = validSites;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
