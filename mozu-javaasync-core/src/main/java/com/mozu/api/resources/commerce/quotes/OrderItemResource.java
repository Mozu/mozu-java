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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Quote Items are the individual products that are added to a particular quote, which serves as the wishlists of the B2B feature.Like the quotes themselves, the quote items APIs are a work-in-progress that will be enhanced with future releases. Use caution when interacting with these APIs, as their current models may change and break backwards compatibility as functionality is added.
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
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
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
	 *	CountDownLatch latch = orderitem.getQuoteItem( quoteId,  quoteItemId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch getQuoteItemAsync(String quoteId, String quoteItemId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderItem> callback) throws Exception
	{
		return getQuoteItemAsync( quoteId,  quoteItemId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	OrderItem orderItem = orderitem.getQuoteItem( quoteId,  quoteItemId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
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
	 *	CountDownLatch latch = orderitem.getQuoteItem( quoteId,  quoteItemId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch getQuoteItemAsync(String quoteId, String quoteItemId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderItem> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemClient( quoteId,  quoteItemId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItems( quoteId);
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the items are included within.
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
	 *	CountDownLatch latch = orderitem.getQuoteItems( quoteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote that the items are included within.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public CountDownLatch getQuoteItemsAsync(String quoteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> callback) throws Exception
	{
		return getQuoteItemsAsync( quoteId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItems( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteId A unique identifier for the quote that the items are included within.
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
	 *	CountDownLatch latch = orderitem.getQuoteItems( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteId A unique identifier for the quote that the items are included within.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public CountDownLatch getQuoteItemsAsync(String quoteId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemsClient( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	QuoteItemCollection quoteItemCollection = orderitem.getQuoteItemsByQuoteName( customerAccountId,  quoteName);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
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
	 *	CountDownLatch latch = orderitem.getQuoteItemsByQuoteName( customerAccountId,  quoteName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public CountDownLatch getQuoteItemsByQuoteNameAsync(Integer customerAccountId, String quoteName, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> callback) throws Exception
	{
		return getQuoteItemsByQuoteNameAsync( customerAccountId,  quoteName,  null,  null,  null,  null,  null, callback);
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
	 * @param quoteName The unique name of the quote that items are being retrieved for.
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
	 *	CountDownLatch latch = orderitem.getQuoteItemsByQuoteName( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection
	 */
	public CountDownLatch getQuoteItemsByQuoteNameAsync(Integer customerAccountId, String quoteName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.getQuoteItemsByQuoteNameClient( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.addItemToQuote( quoteItem,  quoteId);
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param quoteItem A unique identifier for the item being added to a quote.
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
	 *	CountDownLatch latch = orderitem.addItemToQuote( quoteItem,  quoteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param  callback callback handler for asynchronous operations
	 * @param quoteItem A unique identifier for the item being added to a quote.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch addItemToQuoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.Quote> callback) throws Exception
	{
		return addItemToQuoteAsync( quoteItem,  quoteId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.addItemToQuote( quoteItem,  quoteId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem A unique identifier for the item being added to a quote.
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
	 *	CountDownLatch latch = orderitem.addItemToQuote( quoteItem,  quoteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param quoteItem A unique identifier for the item being added to a quote.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch addItemToQuoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.Quote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.addItemToQuoteClient( quoteItem,  quoteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId);
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param quoteItem The item within a quote that is being updated.
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
	 *	CountDownLatch latch = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param  callback callback handler for asynchronous operations
	 * @param quoteItem The item within a quote that is being updated.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch updateQuoteItemAsync(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.Quote> callback) throws Exception
	{
		return updateQuoteItemAsync( quoteItem,  quoteId,  quoteItemId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Quote quote = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId,  responseFields);
	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param quoteItem The item within a quote that is being updated.
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
	 *	CountDownLatch latch = orderitem.updateQuoteItem( quoteItem,  quoteId,  quoteItemId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId The unique identifier for the quote that the item being updated is listed within.
	 * @param quoteItemId The unique identifier for the quote item being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param quoteItem The item within a quote that is being updated.
	 * @return com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.quotes.Quote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public CountDownLatch updateQuoteItemAsync(com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.quotes.Quote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.quotes.Quote> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.updateQuoteItemClient( quoteItem,  quoteId,  quoteItemId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	Stream stream = orderitem.deleteQuoteItem( quoteId,  quoteItemId);
	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote tha the item being deleted belongs to.
	 * @param quoteItemId A unique identifier for an item included in the quote.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteQuoteItem(String quoteId, String quoteItemId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.deleteQuoteItemClient( quoteId,  quoteItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderItem orderitem = new OrderItem();
	 *	CountDownLatch latch = orderitem.deleteQuoteItem( quoteId,  quoteItemId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param quoteId A unique identifier for the quote tha the item being deleted belongs to.
	 * @param quoteItemId A unique identifier for an item included in the quote.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch deleteQuoteItemAsync(String quoteId, String quoteItemId, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.quotes.OrderItemClient.deleteQuoteItemClient( quoteId,  quoteItemId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



