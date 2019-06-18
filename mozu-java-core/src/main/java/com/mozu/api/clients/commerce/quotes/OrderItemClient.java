/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.quotes;

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
 * Quote Items are the individual products that are added to a particular quote, which serves as the wishlists of the B2B feature.Like the quotes themselves, the quote items APIs are a work-in-progress that will be enhanced with future releases. Use caution when interacting with these APIs, as their current models may change and break backwards compatibility as functionality is added.
 * </summary>
 */
public class OrderItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetQuoteItemClient( quoteId,  quoteItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getQuoteItemClient(String quoteId, String quoteItemId) throws Exception
	{
		return getQuoteItemClient( quoteId,  quoteItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetQuoteItemClient( quoteId,  quoteItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getQuoteItemClient(String quoteId, String quoteItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.getQuoteItemUrl(quoteId, quoteItemId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient=GetQuoteItemsClient( quoteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * QuoteItemCollection quoteItemCollection = client.Result();
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the items are included within.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> getQuoteItemsClient(String quoteId) throws Exception
	{
		return getQuoteItemsClient( quoteId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient=GetQuoteItemsClient( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * QuoteItemCollection quoteItemCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteId A unique identifier for the quote that the items are included within.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> getQuoteItemsClient(String quoteId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.getQuoteItemsUrl(filter, pageSize, quoteId, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient=GetQuoteItemsByQuoteNameClient( customerAccountId,  quoteName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * QuoteItemCollection quoteItemCollection = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> getQuoteItemsByQuoteNameClient(Integer customerAccountId, String quoteName) throws Exception
	{
		return getQuoteItemsByQuoteNameClient( customerAccountId,  quoteName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient=GetQuoteItemsByQuoteNameClient( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * QuoteItemCollection quoteItemCollection = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> getQuoteItemsByQuoteNameClient(Integer customerAccountId, String quoteName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.getQuoteItemsByQuoteNameUrl(customerAccountId, filter, pageSize, quoteName, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient=AddItemToQuoteClient( quoteItem,  quoteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Quote quote = client.Result();
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param quoteItem A unique identifier for the item being added to a quote.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.Quote>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> addItemToQuoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId) throws Exception
	{
		return addItemToQuoteClient( quoteItem,  quoteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient=AddItemToQuoteClient( quoteItem,  quoteId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Quote quote = client.Result();
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem A unique identifier for the item being added to a quote.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.Quote>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> addItemToQuoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.addItemToQuoteUrl(quoteId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.quotes.Quote.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(quoteItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient=UpdateQuoteItemClient( quoteItem,  quoteId,  quoteItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Quote quote = client.Result();
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param quoteItem The item within a quote that is being updated.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.Quote>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> updateQuoteItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId) throws Exception
	{
		return updateQuoteItemClient( quoteItem,  quoteId,  quoteItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient=UpdateQuoteItemClient( quoteItem,  quoteId,  quoteItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Quote quote = client.Result();
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem The item within a quote that is being updated.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.quotes.Quote>
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> updateQuoteItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.updateQuoteItemUrl(quoteId, quoteItemId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.quotes.Quote.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(quoteItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteQuoteItemClient( quoteId,  quoteItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote tha the item being deleted belongs to.
	 * @param quoteItemId A unique identifier for an item included in the quote.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteQuoteItemClient(String quoteId, String quoteItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.quotes.OrderItemUrl.deleteQuoteItemUrl(quoteId, quoteItemId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



