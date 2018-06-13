/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.checkouts;

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
 * Use this resource to manage the items a shopper adds to their cart while the Checkouts resource is active (the Checkouts resource only applies to sites that enable shipping to multiple destinations within the same order). The Checkouts resource remains active until the shopper submits their order.
 * </summary>
 */
public class OrderItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=SplitItemClient( checkoutId,  itemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> splitItemClient(String checkoutId, String itemId) throws Exception
	{
		return splitItemClient( checkoutId,  itemId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=SplitItemClient( checkoutId,  itemId,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> splitItemClient(String checkoutId, String itemId, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.OrderItemUrl.splitItemUrl(checkoutId, itemId, quantity, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=BulkUpdateItemDestinationsClient( itemsForDestination,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemsForDestination A collection of items to be associated with a destination.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> bulkUpdateItemDestinationsClient(List<com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination> itemsForDestination, String checkoutId) throws Exception
	{
		return bulkUpdateItemDestinationsClient( itemsForDestination,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=BulkUpdateItemDestinationsClient( itemsForDestination,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param itemsForDestination A collection of items to be associated with a destination.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> bulkUpdateItemDestinationsClient(List<com.mozu.api.contracts.commerceruntime.checkouts.ItemsForDestination> itemsForDestination, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.OrderItemUrl.bulkUpdateItemDestinationsUrl(checkoutId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(itemsForDestination);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=UpdateItemDestinationClient( checkoutId,  itemId,  destinationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param itemId The unique identifier of the item.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> updateItemDestinationClient(String checkoutId, String itemId, String destinationId) throws Exception
	{
		return updateItemDestinationClient( checkoutId,  itemId,  destinationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=UpdateItemDestinationClient( checkoutId,  itemId,  destinationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param itemId The unique identifier of the item.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> updateItemDestinationClient(String checkoutId, String itemId, String destinationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.OrderItemUrl.updateItemDestinationUrl(checkoutId, destinationId, itemId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


