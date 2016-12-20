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

/**
 *	Mozu.ProductRuntime.Contracts.SolrDebugInfo ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SolrDebugInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.ProductRuntime.Contracts.SolrDebugInfo blockedProductCodes ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> blockedProductCodes;
	public List<String> getBlockedProductCodes() {
		return this.blockedProductCodes;
	}
	public void setBlockedProductCodes(List<String> blockedProductCodes) {
		this.blockedProductCodes = blockedProductCodes;
	}

	/**
	 * Mozu.ProductRuntime.Contracts.SolrDebugInfo boostedProductCodes ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> boostedProductCodes;
	public List<String> getBoostedProductCodes() {
		return this.boostedProductCodes;
	}
	public void setBoostedProductCodes(List<String> boostedProductCodes) {
		this.boostedProductCodes = boostedProductCodes;
	}

	/**
	 * Mozu.ProductRuntime.Contracts.SolrDebugInfo boostFunctions ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> boostFunctions;
	public List<String> getBoostFunctions() {
		return this.boostFunctions;
	}
	public void setBoostFunctions(List<String> boostFunctions) {
		this.boostFunctions = boostFunctions;
	}

	/**
	 * Mozu.ProductRuntime.Contracts.SolrDebugInfo boostQueries ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> boostQueries;
	public List<String> getBoostQueries() {
		return this.boostQueries;
	}
	public void setBoostQueries(List<String> boostQueries) {
		this.boostQueries = boostQueries;
	}

	/**
	 * Mozu.ProductRuntime.Contracts.SolrDebugInfo searchTuningRuleCode ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String searchTuningRuleCode;

	public String getSearchTuningRuleCode() {
		return this.searchTuningRuleCode;
	}

	public void setSearchTuningRuleCode(String searchTuningRuleCode) {
		this.searchTuningRuleCode = searchTuningRuleCode;
	}


}
