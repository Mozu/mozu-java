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
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContactClient( accountId,  contactId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId,  userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId, String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactUrl(accountId, contactId, responseFields, userId);
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
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId) throws Exception
	{
		return getAccountContactsClient( accountId,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactsUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex, userId);
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
	 * @param accountId Unique identifier of the customer account.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
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
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
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
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContactClient( contact,  accountId,  contactId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId,  userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.updateAccountContactUrl(accountId, contactId, responseFields, userId);
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
	 * @param accountId Unique identifier of the customer account.
	 * @param contactList The list of contacts.
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
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param contactList The list of contacts.
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
	 * @param contactId Unique identifer of the customer account contact being updated.
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



