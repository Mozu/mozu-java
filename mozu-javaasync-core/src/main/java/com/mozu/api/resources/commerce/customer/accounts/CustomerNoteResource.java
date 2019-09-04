/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

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
 * Tenant administrators can add and view internal notes for a customer account. For example, a client can track a shopper's interests or complaints. Only clients can add and view notes. Shoppers cannot view these notes from the My Account page.
 * </summary>
 */
public class CustomerNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.getAccountNote( accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote getAccountNote(Integer accountId, Integer noteId) throws Exception
	{
		return getAccountNote( accountId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNote( accountId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch getAccountNoteAsync(Integer accountId, Integer noteId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return getAccountNoteAsync( accountId,  noteId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.getAccountNote( accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote getAccountNote(Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNoteClient( accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNote( accountId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch getAccountNoteAsync(Integer accountId, Integer noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNoteClient( accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.getAccountNotes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId) throws Exception
	{
		return getAccountNotes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNotes( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public CountDownLatch getAccountNotesAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNoteCollection> callback) throws Exception
	{
		return getAccountNotesAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public CountDownLatch getAccountNotesAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNoteCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param note Properties of the customer account note to create.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote addAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId) throws Exception
	{
		return addAccountNote( note,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.addAccountNote( note,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of the customer account note to create.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch addAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return addAccountNoteAsync( note,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param responseFields 
	 * @param note Properties of the customer account note to create.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote addAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.addAccountNoteClient( note,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.addAccountNote( note,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of the customer account note to create.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch addAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.addAccountNoteClient( note,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param note The new content to replace the existing note.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote updateAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId) throws Exception
	{
		return updateAccountNote( note,  accountId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.updateAccountNote( note,  accountId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param  callback callback handler for asynchronous operations
	 * @param note The new content to replace the existing note.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch updateAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return updateAccountNoteAsync( note,  accountId,  noteId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param responseFields 
	 * @param note The new content to replace the existing note.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote updateAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.updateAccountNoteClient( note,  accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.updateAccountNote( note,  accountId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param note The new content to replace the existing note.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch updateAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.updateAccountNoteClient( note,  accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	Stream stream = customernote.deleteAccountNote( accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being deleted.
	 * @param noteId Unique identifier of the customer account note being deleted.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteAccountNote(Integer accountId, Integer noteId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.deleteAccountNoteClient( accountId,  noteId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.deleteAccountNote( accountId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being deleted.
	 * @param noteId Unique identifier of the customer account note being deleted.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch deleteAccountNoteAsync(Integer accountId, Integer noteId, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.deleteAccountNoteClient( accountId,  noteId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



