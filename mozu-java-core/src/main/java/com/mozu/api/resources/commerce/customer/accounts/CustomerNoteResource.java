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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * This resources manages notes for a customer account. For example, a client can track a shopper's interests or complaints. Only clients can add and view notes. Shoppers cannot view these notes from the My Account page.
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
	 * @param accountId Unique identifier of the customer account.
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
	 *	CustomerNote customerNote = customernote.getAccountNote( accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 *	CustomerNoteCollection customerNoteCollection = customernote.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param note Properties of a note configured for a customer account.
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
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param note Properties of a note configured for a customer account.
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
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param note Properties of a note configured for a customer account.
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
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param note Properties of a note configured for a customer account.
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
	 *	Stream stream = customernote.deleteAccountNote( accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
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

}



