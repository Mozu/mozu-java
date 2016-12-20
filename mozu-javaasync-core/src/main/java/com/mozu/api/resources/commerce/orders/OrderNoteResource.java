/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use the Order Notes subresource to manage merchant-level notes associated with an active order.
 * </summary>
 */
public class OrderNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of all notes for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getOrderNotes( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getOrderNotes(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNotesClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all notes for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getOrderNotes( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getOrderNotesAsync(String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNotesClient( orderId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getOrderNote( orderId,  noteId);
	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote getOrderNote(String orderId, String noteId) throws Exception
	{
		return getOrderNote( orderId,  noteId,  null);
	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getOrderNote( orderId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getOrderNoteAsync(String orderId, String noteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return getOrderNoteAsync( orderId,  noteId,  null, callback);
	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.getOrderNote( orderId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote getOrderNote(String orderId, String noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNoteClient( orderId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.getOrderNote( orderId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch getOrderNoteAsync(String orderId, String noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNoteClient( orderId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.createOrderNote( orderNote,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote createOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId) throws Exception
	{
		return createOrderNote( orderNote,  orderId,  null);
	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.createOrderNote( orderNote,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch createOrderNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return createOrderNoteAsync( orderNote,  orderId,  null, callback);
	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.createOrderNote( orderNote,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote createOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.createOrderNoteClient( orderNote,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.createOrderNote( orderNote,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch createOrderNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.createOrderNoteClient( orderNote,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.updateOrderNote( orderNote,  orderId,  noteId);
	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote updateOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId) throws Exception
	{
		return updateOrderNote( orderNote,  orderId,  noteId,  null);
	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.updateOrderNote( orderNote,  orderId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch updateOrderNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		return updateOrderNoteAsync( orderNote,  orderId,  noteId,  null, callback);
	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.updateOrderNote( orderNote,  orderId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote updateOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.updateOrderNoteClient( orderNote,  orderId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	CountDownLatch latch = ordernote.updateOrderNote( orderNote,  orderId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param orderNote Properties of an order note for a merchant, which is internal only for administrative purposes and not available to the shopper.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public CountDownLatch updateOrderNoteAsync(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.OrderNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.updateOrderNoteClient( orderNote,  orderId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the specified order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	ordernote.deleteOrderNote( orderId,  noteId);
	 * </code></pre></p>
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param orderId Unique identifier of the order.
	 * @return 
	 */
	public void deleteOrderNote(String orderId, String noteId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.OrderNoteClient.deleteOrderNoteClient( orderId,  noteId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



