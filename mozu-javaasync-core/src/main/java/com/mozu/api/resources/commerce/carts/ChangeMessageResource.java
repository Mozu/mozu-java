/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

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
 * Use the Cart Messages resource to retrieve messages for live carts that the system logs when a product's price or inventory level changes.
 * </summary>
 */
public class ChangeMessageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ChangeMessageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	CartChangeMessageCollection cartChangeMessageCollection = changemessage.getMessages();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection getMessages() throws Exception
	{
		return getMessages( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	CountDownLatch latch = changemessage.getMessages( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public CountDownLatch getMessagesAsync( AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> callback) throws Exception
	{
		return getMessagesAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	CartChangeMessageCollection cartChangeMessageCollection = changemessage.getMessages( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection getMessages(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.getMessagesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	CountDownLatch latch = changemessage.getMessages( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	 */
	public CountDownLatch getMessagesAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.getMessagesClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	changemessage.removeAllMessages();
	 * </code></pre></p>
	 * @return 
	 */
	public void removeAllMessages() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.removeAllMessagesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChangeMessage changemessage = new ChangeMessage();
	 *	changemessage.removeMessage( messageId);
	 * </code></pre></p>
	 * @param messageId Identifier of the message to remove from the cart.
	 * @return 
	 */
	public void removeMessage(String messageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.removeMessageClient( messageId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



