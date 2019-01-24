/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.quotes;

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
 * commerce/quotes/quoteitems related resources. DOCUMENT_HERE 
 * </summary>
 */
public class OrderItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getQuoteItem( quoteId,  quoteItemId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItemId 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getQuoteItem(String quoteId, String quoteItemId) throws Exception
	{
		return getQuoteItem( quoteId,  quoteItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getQuoteItem( quoteId,  quoteItemId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderItem getQuoteItem(String quoteId, String quoteItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemClient( quoteId,  quoteItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItems( quoteId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItems(String quoteId) throws Exception
	{
		return getQuoteItems( quoteId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItems( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItems(String quoteId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemsClient( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItemsByQuoteName( customerAccountId,  quoteName);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param quoteName 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItemsByQuoteName(Integer customerAccountId, String quoteName) throws Exception
	{
		return getQuoteItemsByQuoteName( customerAccountId,  quoteName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItemsByQuoteName( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteName 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItemsByQuoteName(Integer customerAccountId, String quoteName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemsByQuoteNameClient( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.addItemToQuote( quoteItem,  quoteId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItem 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.Quote addItemToQuote(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId) throws Exception
	{
		return addItemToQuote( quoteItem,  quoteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.addItemToQuote( quoteItem,  quoteId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.Quote addItemToQuote(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.addItemToQuoteClient( quoteItem,  quoteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param quoteItem 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuoteItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId) throws Exception
	{
		return updateQuoteItem( quoteItem,  quoteId,  quoteItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem 
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuoteItem(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.updateQuoteItemClient( quoteItem,  quoteId,  quoteItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	orderitem.deleteQuoteItem( quoteId,  quoteItemId);
	 * </code></pre></p>
	 * @param quoteId 
	 * @param quoteItemId 
	 * @return 
	 */
	public void deleteQuoteItem(String quoteId, String quoteItemId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.quotes.OrderItemClient.deleteQuoteItemClient( quoteId,  quoteItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



