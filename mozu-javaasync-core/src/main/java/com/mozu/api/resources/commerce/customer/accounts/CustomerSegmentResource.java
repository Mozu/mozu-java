/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

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
 * Use the Customer Account Segments subresource to view the customer segments associated with a customer account.
 * </summary>
 */
public class CustomerSegmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerSegmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.getAccountSegments( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(Integer accountId) throws Exception
	{
		return getAccountSegments( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getAccountSegments( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public CountDownLatch getAccountSegmentsAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegmentCollection> callback) throws Exception
	{
		return getAccountSegmentsAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.getAccountSegments( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerSegmentClient.getAccountSegmentsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CountDownLatch latch = customersegment.getAccountSegments( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public CountDownLatch getAccountSegmentsAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerSegmentCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerSegmentClient.getAccountSegmentsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



