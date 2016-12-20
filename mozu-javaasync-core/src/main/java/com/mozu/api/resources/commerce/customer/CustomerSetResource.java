/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

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
 * 
 * </summary>
 */
public class CustomerSetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerSetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSetCollection customerSetCollection = customerset.getCustomerSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSetCollection getCustomerSets() throws Exception
	{
		return getCustomerSets( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CountDownLatch latch = customerset.getCustomerSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public CountDownLatch getCustomerSetsAsync( AsyncCallback<com.mozu.api.contracts.customer.CustomerSetCollection> callback) throws Exception
	{
		return getCustomerSetsAsync( null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSetCollection customerSetCollection = customerset.getCustomerSets( startIndex,  pageSize,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSetCollection getCustomerSets(Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetsClient( startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CountDownLatch latch = customerset.getCustomerSets( startIndex,  pageSize,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public CountDownLatch getCustomerSetsAsync(Integer startIndex, Integer pageSize, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSetCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetsClient( startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSet customerSet = customerset.getCustomerSet( code);
	 * </code></pre></p>
	 * @param code 
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public com.mozu.api.contracts.customer.CustomerSet getCustomerSet(String code) throws Exception
	{
		return getCustomerSet( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CountDownLatch latch = customerset.getCustomerSet( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public CountDownLatch getCustomerSetAsync(String code, AsyncCallback<com.mozu.api.contracts.customer.CustomerSet> callback) throws Exception
	{
		return getCustomerSetAsync( code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSet customerSet = customerset.getCustomerSet( code,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public com.mozu.api.contracts.customer.CustomerSet getCustomerSet(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSet> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CountDownLatch latch = customerset.getCustomerSet( code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public CountDownLatch getCustomerSetAsync(String code, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSet> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetClient( code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



