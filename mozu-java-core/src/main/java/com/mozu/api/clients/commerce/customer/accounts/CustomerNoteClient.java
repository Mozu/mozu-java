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
 * Tenant administrators can add and view internal notes for a customer account. For example, a client can track a shopper's interests or complaints. Only clients can add and view notes. Shoppers cannot view these notes from the My Account page.
 * </summary>
 */
public class CustomerNoteClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=GetAccountNoteClient( accountId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> getAccountNoteClient(Integer accountId, Integer noteId) throws Exception
	{
		return getAccountNoteClient( accountId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=GetAccountNoteClient( accountId,  noteId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> getAccountNoteClient(Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.getAccountNoteUrl(accountId, noteId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerNote>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient=GetAccountNotesClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNoteCollection customerNoteCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNoteCollection>
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> getAccountNotesClient(Integer accountId) throws Exception
	{
		return getAccountNotesClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient=GetAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNoteCollection customerNoteCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNoteCollection>
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> getAccountNotesClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.getAccountNotesUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNoteCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=AddAccountNoteClient( note,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param note Properties of the customer account note to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> addAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId) throws Exception
	{
		return addAccountNoteClient( note,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=AddAccountNoteClient( note,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param responseFields 
	 * @param note Properties of the customer account note to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> addAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.addAccountNoteUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerNote>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(note);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=UpdateAccountNoteClient( note,  accountId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param note The new content to replace the existing note.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> updateAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId) throws Exception
	{
		return updateAccountNoteClient( note,  accountId,  noteId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=UpdateAccountNoteClient( note,  accountId,  noteId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param responseFields 
	 * @param note The new content to replace the existing note.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> updateAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.updateAccountNoteUrl(accountId, noteId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerNote>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(note);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountNoteClient( accountId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being deleted.
	 * @param noteId Unique identifier of the customer account note being deleted.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountNoteClient(Integer accountId, Integer noteId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.deleteAccountNoteUrl(accountId, noteId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



