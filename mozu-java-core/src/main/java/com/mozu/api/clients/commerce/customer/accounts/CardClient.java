/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
 * Use the Cards subresource to manage stored credit cards for customer accounts. Mozu stores limited card data in the Customer service for expedited ordering purposes; however, the complete card data is stored in the Payment service.
 * </summary>
 */
public class CardClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=GetAccountCardClient( accountId,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> getAccountCardClient(Integer accountId, String cardId) throws Exception
	{
		return getAccountCardClient( accountId,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=GetAccountCardClient( accountId,  cardId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> getAccountCardClient(Integer accountId, String cardId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CardUrl.getAccountCardUrl(accountId, cardId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.Card.class;
		MozuClient<com.mozu.api.contracts.customer.Card> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Card>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CardCollection> mozuClient=GetAccountCardsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CardCollection cardCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CardCollection>
	 * @see com.mozu.api.contracts.customer.CardCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CardCollection> getAccountCardsClient(Integer accountId) throws Exception
	{
		return getAccountCardsClient( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CardCollection> mozuClient=GetAccountCardsClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CardCollection cardCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CardCollection>
	 * @see com.mozu.api.contracts.customer.CardCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CardCollection> getAccountCardsClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CardUrl.getAccountCardsUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CardCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CardCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CardCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=AddAccountCardClient( card,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param card Properties of the customer credit card to add to the account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> addAccountCardClient(com.mozu.api.contracts.customer.Card card, Integer accountId) throws Exception
	{
		return addAccountCardClient( card,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=AddAccountCardClient( card,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param card Properties of the customer credit card to add to the account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> addAccountCardClient(com.mozu.api.contracts.customer.Card card, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CardUrl.addAccountCardUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.Card.class;
		MozuClient<com.mozu.api.contracts.customer.Card> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Card>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(card);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=UpdateAccountCardClient( card,  accountId,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card.
	 * @param card Properties of the customer account credit card to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> updateAccountCardClient(com.mozu.api.contracts.customer.Card card, Integer accountId, String cardId) throws Exception
	{
		return updateAccountCardClient( card,  accountId,  cardId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Card> mozuClient=UpdateAccountCardClient( card,  accountId,  cardId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Card card = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card.
	 * @param responseFields 
	 * @param card Properties of the customer account credit card to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Card>
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Card> updateAccountCardClient(com.mozu.api.contracts.customer.Card card, Integer accountId, String cardId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CardUrl.updateAccountCardUrl(accountId, cardId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.Card.class;
		MozuClient<com.mozu.api.contracts.customer.Card> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Card>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(card);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteAccountCardClient( accountId,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param cardId Unique identifier of the credit card to delete.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteAccountCardClient(Integer accountId, String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CardUrl.deleteAccountCardUrl(accountId, cardId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



