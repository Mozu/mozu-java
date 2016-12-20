/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/targetrules related resources. DOCUMENT_HERE 
 * </summary>
 */
public class TargetRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TargetRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of TargetRules according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRuleCollection targetRuleCollection = targetrule.getTargetRules();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules() throws Exception
	{
		return getTargetRules( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of TargetRules according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRuleCollection targetRuleCollection = targetrule.getTargetRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Get Target Rule
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.getTargetRule( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(String code) throws Exception
	{
		return getTargetRule( code,  null);
	}

	/**
	 * Get Target Rule
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.getTargetRule( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRuleClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * commerce-targetrules Post CreateTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule Mozu.ShippingAdmin.Contracts.TargetRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		return createTargetRule( targetRule,  null);
	}

	/**
	 * commerce-targetrules Post CreateTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule Mozu.ShippingAdmin.Contracts.TargetRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.createTargetRuleClient( targetRule,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * commerce-targetrules Post ValidateTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	targetrule.validateTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule Mozu.ShippingAdmin.Contracts.TargetRule ApiType DOCUMENT_HERE 
	 * @return 
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public void validateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.TargetRuleClient.validateTargetRuleClient( targetRule);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * commerce-targetrules Put UpdateTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @param targetRule Mozu.ShippingAdmin.Contracts.TargetRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code) throws Exception
	{
		return updateTargetRule( targetRule,  code,  null);
	}

	/**
	 * commerce-targetrules Put UpdateTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule Mozu.ShippingAdmin.Contracts.TargetRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.updateTargetRuleClient( targetRule,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * commerce-targetrules Delete DeleteTargetRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	targetrule.deleteTargetRule( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteTargetRule(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.TargetRuleClient.deleteTargetRuleClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



