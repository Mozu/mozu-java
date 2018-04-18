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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContactClient( accountId,  contactId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactUrl(accountId, contactId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId) throws Exception
	{
		return getAccountContactsClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactsUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContactCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=AddAccountContactClient( contact,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> addAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		return addAccountContactClient( contact,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=AddAccountContactClient( contact,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param responseFields 
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> addAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.addAccountContactUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContactClient( contact,  accountId,  contactId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields 
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.updateAccountContactUrl(accountId, contactId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=AddAccountContactListClient( contactList,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param contactList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> addAccountContactListClient(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId) throws Exception
	{
		return addAccountContactListClient( contactList,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=AddAccountContactListClient( contactList,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param contactList 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> addAccountContactListClient(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.addAccountContactListUrl(accountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContactCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contactList);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifier of the customer account contact to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.deleteAccountContactUrl(accountId, contactId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



