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
 * Use this resource to manage the addresses a shopper intends to ship items to. This resource remains active while the Checkouts resource is active (the Checkouts resource only applies to sites that enable shipping to multiple destinations within the same order). The Checkouts resource remains active until the shopper submits their order.
 * </summary>
 */
public class DestinationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>> mozuClient=GetDestinationsClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>> getDestinationsClient(String checkoutId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.DestinationUrl.getDestinationsUrl(checkoutId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=GetDestinationClient( checkoutId,  destinationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> getDestinationClient(String checkoutId, String destinationId) throws Exception
	{
		return getDestinationClient( checkoutId,  destinationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=GetDestinationClient( checkoutId,  destinationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> getDestinationClient(String checkoutId, String destinationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.DestinationUrl.getDestinationUrl(checkoutId, destinationId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Destination.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=AddDestinationClient( destination,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destination The destination object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> addDestinationClient(com.mozu.api.contracts.commerceruntime.fulfillment.Destination destination, String checkoutId) throws Exception
	{
		return addDestinationClient( destination,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=AddDestinationClient( destination,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param destination The destination object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> addDestinationClient(com.mozu.api.contracts.commerceruntime.fulfillment.Destination destination, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.DestinationUrl.addDestinationUrl(checkoutId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Destination.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(destination);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=UpdateDestinationClient( destination,  checkoutId,  destinationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param destination The destination object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> updateDestinationClient(com.mozu.api.contracts.commerceruntime.fulfillment.Destination destination, String checkoutId, String destinationId) throws Exception
	{
		return updateDestinationClient( destination,  checkoutId,  destinationId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient=UpdateDestinationClient( destination,  checkoutId,  destinationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Destination destination = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param destination The destination object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Destination>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Destination
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> updateDestinationClient(com.mozu.api.contracts.commerceruntime.fulfillment.Destination destination, String checkoutId, String destinationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.DestinationUrl.updateDestinationUrl(checkoutId, destinationId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Destination.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Destination>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(destination);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveDestinationClient( checkoutId,  destinationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeDestinationClient(String checkoutId, String destinationId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.DestinationUrl.removeDestinationUrl(checkoutId, destinationId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



