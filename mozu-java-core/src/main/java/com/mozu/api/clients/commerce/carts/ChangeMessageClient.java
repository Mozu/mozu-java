/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.carts;

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
 * Use the Cart Messages resource to retrieve messages for live carts that the system logs when a product's price or inventory level changes.
 * </summary>
 */
public class ChangeMessageClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient=GetMessagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartChangeMessageCollection cartChangeMessageCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> getMessagesClient() throws Exception
	{
		return getMessagesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient=GetMessagesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartChangeMessageCollection cartChangeMessageCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> getMessagesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.getMessagesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveAllMessagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeAllMessagesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.removeAllMessagesUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveMessageClient( messageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param messageId Identifier of the message to remove from the cart.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeMessageClient(String messageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ChangeMessageUrl.removeMessageUrl(messageId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



