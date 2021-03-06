/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin.profiles;

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
 * Use the OrderHandlingFeeRules sub-resource to manage your order handling fee rules that are associated with a specific shipping profile.
 * </summary>
 */
public class OrderHandlingFeeRulesResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderHandlingFeeRulesResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.getOrderHandlingFeeRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getOrderHandlingFeeRule(String profilecode, String id) throws Exception
	{
		return getOrderHandlingFeeRule( profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.getOrderHandlingFeeRule( profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch getOrderHandlingFeeRuleAsync(String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return getOrderHandlingFeeRuleAsync( profilecode,  id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.getOrderHandlingFeeRule( profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getOrderHandlingFeeRule(String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.getOrderHandlingFeeRuleClient( profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.getOrderHandlingFeeRule( profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch getOrderHandlingFeeRuleAsync(String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.getOrderHandlingFeeRuleClient( profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRuleCollection handlingFeeRuleCollection = orderhandlingfeerules.getOrderHandlingFeeRules( profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getOrderHandlingFeeRules(String profilecode) throws Exception
	{
		return getOrderHandlingFeeRules( profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.getOrderHandlingFeeRules( profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public CountDownLatch getOrderHandlingFeeRulesAsync(String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> callback) throws Exception
	{
		return getOrderHandlingFeeRulesAsync( profilecode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRuleCollection handlingFeeRuleCollection = orderhandlingfeerules.getOrderHandlingFeeRules( profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getOrderHandlingFeeRules(String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.getOrderHandlingFeeRulesClient( profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.getOrderHandlingFeeRules( profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public CountDownLatch getOrderHandlingFeeRulesAsync(String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.getOrderHandlingFeeRulesClient( profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.createOrderHandlingFeeRule( rule,  profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule The details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createOrderHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode) throws Exception
	{
		return createOrderHandlingFeeRule( rule,  profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.createOrderHandlingFeeRule( rule,  profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule The details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch createOrderHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return createOrderHandlingFeeRuleAsync( rule,  profilecode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.createOrderHandlingFeeRule( rule,  profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule The details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createOrderHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.createOrderHandlingFeeRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.createOrderHandlingFeeRule( rule,  profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule The details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch createOrderHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.createOrderHandlingFeeRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.updateOrderHandlingFeeRule( rule,  profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule The updated details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateOrderHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id) throws Exception
	{
		return updateOrderHandlingFeeRule( rule,  profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.updateOrderHandlingFeeRule( rule,  profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule The updated details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch updateOrderHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return updateOrderHandlingFeeRuleAsync( rule,  profilecode,  id,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	HandlingFeeRule handlingFeeRule = orderhandlingfeerules.updateOrderHandlingFeeRule( rule,  profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule The updated details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateOrderHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.updateOrderHandlingFeeRuleClient( rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	CountDownLatch latch = orderhandlingfeerules.updateOrderHandlingFeeRule( rule,  profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule The updated details of the order handling fee rule.
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch updateOrderHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.updateOrderHandlingFeeRuleClient( rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderHandlingFeeRules orderhandlingfeerules = new OrderHandlingFeeRules();
	 *	orderhandlingfeerules.deleteOrderHandlingFeeRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the order handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteOrderHandlingFeeRule(String profilecode, String id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.shipping.admin.profiles.OrderHandlingFeeRulesClient.deleteOrderHandlingFeeRuleClient( profilecode,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



