/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.payments;

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
public class PublicCardResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublicCardResource() 
		{
			_apiContext = null;
	}
public PublicCardResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.create( request);
	 * </code></pre></p>
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse create(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		return create( request,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.create( request, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch createAsync(com.mozu.api.contracts.paymentservice.PublicCard request, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return createAsync( request,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.create( request,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse create(com.mozu.api.contracts.paymentservice.PublicCard request, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.createClient( request,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.create( request,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch createAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.createClient( request,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.getGiftCardBalance( balanceRequest,  cardId);
	 * </code></pre></p>
	 * @param cardId 
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse getGiftCardBalance(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String cardId) throws Exception
	{
		return getGiftCardBalance( balanceRequest,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.getGiftCardBalance( balanceRequest,  cardId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId 
	 * @param  callback callback handler for asynchronous operations
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public CountDownLatch getGiftCardBalanceAsync(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String cardId, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return getGiftCardBalanceAsync( balanceRequest,  cardId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.getGiftCardBalance( balanceRequest,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param cardId 
	 * @param responseFields 
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse getGiftCardBalance(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String cardId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.getGiftCardBalanceClient( balanceRequest,  cardId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.getGiftCardBalance( balanceRequest,  cardId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public CountDownLatch getGiftCardBalanceAsync(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String cardId, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.getGiftCardBalanceClient( balanceRequest,  cardId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.getUnregisteredGiftCardBalance( balanceRequest);
	 * </code></pre></p>
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse getUnregisteredGiftCardBalance(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest) throws Exception
	{
		return getUnregisteredGiftCardBalance( balanceRequest,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.getUnregisteredGiftCardBalance( balanceRequest, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public CountDownLatch getUnregisteredGiftCardBalanceAsync(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return getUnregisteredGiftCardBalanceAsync( balanceRequest,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.getUnregisteredGiftCardBalance( balanceRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse getUnregisteredGiftCardBalance(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.getUnregisteredGiftCardBalanceClient( balanceRequest,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.getUnregisteredGiftCardBalance( balanceRequest,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param balanceRequest 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest
	 */
	public CountDownLatch getUnregisteredGiftCardBalanceAsync(com.mozu.api.contracts.paymentservice.request.GetGiftCardBalanceRequest balanceRequest, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.getUnregisteredGiftCardBalanceClient( balanceRequest,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId);
	 * </code></pre></p>
	 * @param cardId 
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse update(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		return update( request,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.update( request,  cardId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId 
	 * @param  callback callback handler for asynchronous operations
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch updateAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		return updateAsync( request,  cardId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param cardId 
	 * @param responseFields 
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse update(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.updateClient( request,  cardId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	CountDownLatch latch = publiccard.update( request,  cardId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cardId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public CountDownLatch updateAsync(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId, String responseFields, AsyncCallback<com.mozu.api.contracts.paymentservice.response.SyncResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.updateClient( request,  cardId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	publiccard.delete( cardId);
	 * </code></pre></p>
	 * @param cardId 
	 * @return 
	 */
	public void delete(String cardId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.payments.PublicCardClient.deleteClient( cardId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



