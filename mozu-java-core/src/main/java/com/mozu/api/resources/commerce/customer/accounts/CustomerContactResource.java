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
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContact( accountId,  contactId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.getAccountContact( accountId,  contactId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
	 * @param contactId Unique identifier of the customer account contact to retrieve.
	 * @param responseFields 
	 * @param userId 
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId) throws Exception
	{
		return getAccountContacts( accountId,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param userId 
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
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
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account containing the new contact.
	 * @param responseFields 
	 * @param contact Properties of the new contact. Required properties: Contact.Email, ContactType.
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
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContact( contact,  accountId,  contactId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account whose contact information is being updated.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields 
	 * @param userId 
	 * @param contact All properties the updated contact will have. Required properties: Name and email address.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.addAccountContactList( contactList,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param contactList 
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
	 *	CustomerContactCollection customerContactCollection = customercontact.addAccountContactList( contactList,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param contactList 
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
	 *	Stream stream = customercontact.deleteAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifier of the customer account contact to delete.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.deleteAccountContactClient( accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



