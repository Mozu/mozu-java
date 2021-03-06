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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * These APIs are used to register, update, and remove customer credit cards. The Create operation is the most frequently used one - when paying for an order using a credit card, the storefront first takes the full credit card information and calls Create on the PaymentService to store the card. The PaymentService responds with a SyncResponse containing a card ID. Any further references to that credit card are done using the card ID so that eCommerce doesn't have the full credit card info in hand. With the card ID, the storefront can call CreatePaymentAction (either for [single-ship](../../orders/operations/createpaymentaction.htm) or [multi-ship](../../checkouts/operations/createpaymentaction.htm)) to add a payment for that credit card to the order/checkout. 
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
	 *	SyncResponse syncResponse = publiccard.create( request,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 *	SyncResponse syncResponse = publiccard.getGiftCardBalance( balanceRequest,  cardId);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
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
	 *	SyncResponse syncResponse = publiccard.getGiftCardBalance( balanceRequest,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 *	SyncResponse syncResponse = publiccard.getUnregisteredGiftCardBalance( balanceRequest);
	 * </code></pre></p>
	 * @param balanceRequest The current balance of the card.
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
	 *	SyncResponse syncResponse = publiccard.getUnregisteredGiftCardBalance( balanceRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param balanceRequest The current balance of the card.
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
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
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
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId,  responseFields);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 *	publiccard.delete( cardId);
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
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



