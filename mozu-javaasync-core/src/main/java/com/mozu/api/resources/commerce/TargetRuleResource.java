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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the TargetRules resource to manage your target rules for products and zones. For example, you can set specific rules that dictate shipping options for specific products.
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
	 * 
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.getTargetRules( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public CountDownLatch getTargetRulesAsync( AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> callback) throws Exception
	{
		return getTargetRulesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRuleCollection targetRuleCollection = targetrule.getTargetRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.getTargetRules( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public CountDownLatch getTargetRulesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.getTargetRule( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch getTargetRuleAsync(String code, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		return getTargetRuleAsync( code,  null, callback);
	}

	/**
	 * 
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.getTargetRule( code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch getTargetRuleAsync(String code, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRuleClient( code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		return createTargetRule( targetRule,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.createTargetRule( targetRule, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch createTargetRuleAsync(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		return createTargetRuleAsync( targetRule,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.createTargetRule( targetRule,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the new target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch createTargetRuleAsync(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.createTargetRuleClient( targetRule,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	targetrule.validateTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the target rule you want to validate.
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code) throws Exception
	{
		return updateTargetRule( targetRule,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.updateTargetRule( targetRule,  code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch updateTargetRuleAsync(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		return updateTargetRuleAsync( targetRule,  code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
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
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	CountDownLatch latch = targetrule.updateTargetRule( targetRule,  code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param targetRule The details of the updated target rule.
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public CountDownLatch updateTargetRuleAsync(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.TargetRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.updateTargetRuleClient( targetRule,  code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
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



