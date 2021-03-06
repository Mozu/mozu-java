/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Customer In-Stock Notification Subscription resource to manage the subscriptions customer accounts use to send product notifications. This resource can send a notification when a product in a catalog returns to a site's active inventory after it is out of stock, or when a new product becomes available for the first time.
 * </summary>
 */
public class InStockNotificationSubscriptionClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient=GetInStockNotificationSubscriptionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> getInStockNotificationSubscriptionsClient() throws Exception
	{
		return getInStockNotificationSubscriptionsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient=GetInStockNotificationSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscriptionCollection inStockNotificationSubscriptionCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> getInStockNotificationSubscriptionsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.getInStockNotificationSubscriptionsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscriptionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=GetInStockNotificationSubscriptionClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> getInStockNotificationSubscriptionClient(Integer id) throws Exception
	{
		return getInStockNotificationSubscriptionClient( id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=GetInStockNotificationSubscriptionClient( id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> getInStockNotificationSubscriptionClient(Integer id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.getInStockNotificationSubscriptionUrl(id, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscription.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=AddInStockNotificationSubscriptionClient( inStockNotificationSubscription);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param inStockNotificationSubscription Properties of a push notification to which the shopper subscribes. This notification sends the shopper an alert when a new product or a product previously out of stock becomes available in the specified location's active product inventory.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> addInStockNotificationSubscriptionClient(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription) throws Exception
	{
		return addInStockNotificationSubscriptionClient( inStockNotificationSubscription,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient=AddInStockNotificationSubscriptionClient( inStockNotificationSubscription,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * InStockNotificationSubscription inStockNotificationSubscription = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param inStockNotificationSubscription Properties of a push notification to which the shopper subscribes. This notification sends the shopper an alert when a new product or a product previously out of stock becomes available in the specified location's active product inventory.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.InStockNotificationSubscription>
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 * @see com.mozu.api.contracts.customer.InStockNotificationSubscription
	 */
	public static MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> addInStockNotificationSubscriptionClient(com.mozu.api.contracts.customer.InStockNotificationSubscription inStockNotificationSubscription, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.addInStockNotificationSubscriptionUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.InStockNotificationSubscription.class;
		MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription> mozuClient = (MozuClient<com.mozu.api.contracts.customer.InStockNotificationSubscription>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(inStockNotificationSubscription);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteInStockNotificationSubscriptionClient( id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteInStockNotificationSubscriptionClient(Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.InStockNotificationSubscriptionUrl.deleteInStockNotificationSubscriptionUrl(id);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



