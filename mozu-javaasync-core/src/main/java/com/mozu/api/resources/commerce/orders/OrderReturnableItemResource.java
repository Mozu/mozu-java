/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use this subresource to view which order items are eligible for return.
 * </summary>
 */
public class OrderReturnableItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderReturnableItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderReturnableItem orderreturnableitem = new OrderReturnableItem();
	 *	OrderReturnableItemCollection orderReturnableItemCollection = orderreturnableitem.getOrderReturnableItems( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection getOrderReturnableItems(String orderId) throws Exception
	{
		return getOrderReturnableItems( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderReturnableItem orderreturnableitem = new OrderReturnableItem();
	 *	CountDownLatch latch = orderreturnableitem.getOrderReturnableItems( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public CountDownLatch getOrderReturnableItemsAsync(String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> callback) throws Exception
	{
		return getOrderReturnableItemsAsync( orderId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderReturnableItem orderreturnableitem = new OrderReturnableItem();
	 *	OrderReturnableItemCollection orderReturnableItemCollection = orderreturnableitem.getOrderReturnableItems( orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection getOrderReturnableItems(String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> client = com.mozu.api.clients.commerce.orders.OrderReturnableItemClient.getOrderReturnableItemsClient( orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderReturnableItem orderreturnableitem = new OrderReturnableItem();
	 *	CountDownLatch latch = orderreturnableitem.getOrderReturnableItems( orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public CountDownLatch getOrderReturnableItemsAsync(String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> client = com.mozu.api.clients.commerce.orders.OrderReturnableItemClient.getOrderReturnableItemsClient( orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



