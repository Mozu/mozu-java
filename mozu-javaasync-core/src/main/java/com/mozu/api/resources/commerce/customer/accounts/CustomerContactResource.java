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
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerContactResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.getAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContact( accountId,  contactId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContact( accountId,  contactId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch getAccountContactAsync(Integer accountId, Integer contactId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return getAccountContactAsync( accountId,  contactId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.getAccountContact( accountId,  contactId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContact( accountId,  contactId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch getAccountContactAsync(Integer accountId, Integer contactId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId) throws Exception
	{
		return getAccountContacts( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContacts( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public CountDownLatch getAccountContactsAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		return getAccountContactsAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public CountDownLatch getAccountContactsAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact addAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		return addAccountContact( contact,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContact( contact,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return addAccountContactAsync( contact,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact addAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactClient( contact,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContact( contact,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactClient( contact,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContact( contact,  accountId,  contactId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.updateAccountContact( contact,  accountId,  contactId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch updateAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return updateAccountContactAsync( contact,  accountId,  contactId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.updateAccountContact( contact,  accountId,  contactId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch updateAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.addAccountContactList( contactList,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactList The list of contacts.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection addAccountContactList(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId) throws Exception
	{
		return addAccountContactList( contactList,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContactList( contactList,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @param contactList The list of contacts.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactListAsync(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		return addAccountContactListAsync( contactList,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.addAccountContactList( contactList,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param contactList The list of contacts.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection addAccountContactList(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactListClient( contactList,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContactList( contactList,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param contactList The list of contacts.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactListAsync(List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactListClient( contactList,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	customercontact.deleteAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return 
	 */
	public void deleteAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.deleteAccountContactClient( accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



