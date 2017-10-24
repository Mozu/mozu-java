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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
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
	 * @param checkoutId 
	 * @param itemId 
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
	 * @param checkoutId 
	 * @param itemId 
	 * @param quantity 
	 * @param responseFields 
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
	 * @param checkoutId 
	 * @param itemsForDestination 
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
	 * @param checkoutId 
	 * @param responseFields 
	 * @param itemsForDestination 
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
	 * @param checkoutId 
	 * @param destinationId 
	 * @param itemId 
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
	 * @param checkoutId 
	 * @param destinationId 
	 * @param itemId 
	 * @param responseFields 
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


