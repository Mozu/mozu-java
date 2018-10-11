/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
public class OrderReturnableItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> mozuClient=GetOrderReturnableItemsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderReturnableItemCollection orderReturnableItemCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> getOrderReturnableItemsClient(String orderId) throws Exception
	{
		return getOrderReturnableItemsClient( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> mozuClient=GetOrderReturnableItemsClient( orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderReturnableItemCollection orderReturnableItemCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> getOrderReturnableItemsClient(String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderReturnableItemUrl.getOrderReturnableItemsUrl(orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderReturnableItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



