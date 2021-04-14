/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

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
 * The B2B feature includes the primary shared B2B account and a set of user account logins that have access to that primary account. This primary account has its own identifying data and customer attributes, as well as the list of users associated with it. These attributes and users can be managed through other operations of the B2B APIs.
 * </summary>
 */
public class B2BAccountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public B2BAccountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccountCollection b2BAccountCollection = b2baccount.getB2BAccounts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.B2BAccountCollection
	 * @see com.mozu.api.contracts.customer.B2BAccountCollection
	 */
	public com.mozu.api.contracts.customer.B2BAccountCollection getB2BAccounts() throws Exception
	{
		return getB2BAccounts( null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccountCollection b2BAccountCollection = b2baccount.getB2BAccounts( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param fields 
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.B2BAccountCollection
	 * @see com.mozu.api.contracts.customer.B2BAccountCollection
	 */
	public com.mozu.api.contracts.customer.B2BAccountCollection getB2BAccounts(Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccountCollection> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getB2BAccountsClient( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.getB2BAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getB2BAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		return getB2BAccountAttribute( accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.getB2BAccountAttribute( accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getB2BAccountAttribute(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getB2BAccountAttributeClient( accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttributeCollection customerAttributeCollection = b2baccount.getB2BAccountAttributes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getB2BAccountAttributes(Integer accountId) throws Exception
	{
		return getB2BAccountAttributes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttributeCollection customerAttributeCollection = b2baccount.getB2BAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getB2BAccountAttributes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getB2BAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccountHierarchyResult b2BAccountHierarchyResult = b2baccount.getB2BAccountHierarchy( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.B2BAccountHierarchyResult
	 * @see com.mozu.api.contracts.customer.B2BAccountHierarchyResult
	 */
	public com.mozu.api.contracts.customer.B2BAccountHierarchyResult getB2BAccountHierarchy(Integer accountId) throws Exception
	{
		return getB2BAccountHierarchy( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccountHierarchyResult b2BAccountHierarchyResult = b2baccount.getB2BAccountHierarchy( accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.B2BAccountHierarchyResult
	 * @see com.mozu.api.contracts.customer.B2BAccountHierarchyResult
	 */
	public com.mozu.api.contracts.customer.B2BAccountHierarchyResult getB2BAccountHierarchy(Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccountHierarchyResult> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getB2BAccountHierarchyClient( accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	UserRoleCollection userRoleCollection = b2baccount.getUserRolesAsync( accountId,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.customer.UserRoleCollection
	 * @see com.mozu.api.contracts.customer.UserRoleCollection
	 */
	public com.mozu.api.contracts.customer.UserRoleCollection getUserRolesAsync(Integer accountId, String userId) throws Exception
	{
		return getUserRolesAsync( accountId,  userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	UserRoleCollection userRoleCollection = b2baccount.getUserRolesAsync( accountId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.customer.UserRoleCollection
	 * @see com.mozu.api.contracts.customer.UserRoleCollection
	 */
	public com.mozu.api.contracts.customer.UserRoleCollection getUserRolesAsync(Integer accountId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.UserRoleCollection> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getUserRolesAsyncClient( accountId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUserCollection b2BUserCollection = b2baccount.getUsersAsync( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.B2BUserCollection
	 * @see com.mozu.api.contracts.customer.B2BUserCollection
	 */
	public com.mozu.api.contracts.customer.B2BUserCollection getUsersAsync(Integer accountId) throws Exception
	{
		return getUsersAsync( accountId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUserCollection b2BUserCollection = b2baccount.getUsersAsync( accountId,  startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.B2BUserCollection
	 * @see com.mozu.api.contracts.customer.B2BUserCollection
	 */
	public com.mozu.api.contracts.customer.B2BUserCollection getUsersAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BUserCollection> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getUsersAsyncClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.getB2BAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount getB2BAccount(Integer accountId) throws Exception
	{
		return getB2BAccount( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.getB2BAccount( accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount getB2BAccount(Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getB2BAccountClient( accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	int int = b2baccount.getAccountsForSalesRep( userId);
	 * </code></pre></p>
	 * @param userId 
	 * @return List<int>
	 * @see int
	 */
	public List<Integer> getAccountsForSalesRep(String userId) throws Exception
	{
		MozuClient<List<Integer>> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.getAccountsForSalesRepClient( userId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addAccount( account);
	 * </code></pre></p>
	 * @param account 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount addAccount(com.mozu.api.contracts.customer.B2BAccount account) throws Exception
	{
		return addAccount( account,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addAccount( account,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param account 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount addAccount(com.mozu.api.contracts.customer.B2BAccount account, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addAccountClient( account,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addSalesRepsToB2BAccount( userIds,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param userIds 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see string
	 */
	public com.mozu.api.contracts.customer.B2BAccount addSalesRepsToB2BAccount(List<String> userIds, Integer accountId) throws Exception
	{
		return addSalesRepsToB2BAccount( userIds,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addSalesRepsToB2BAccount( userIds,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param userIds 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see string
	 */
	public com.mozu.api.contracts.customer.B2BAccount addSalesRepsToB2BAccount(List<String> userIds, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addSalesRepsToB2BAccountClient( userIds,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.addB2BAccountAttribute( attribute,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute The attribute details being applied to the B2B account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addB2BAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addB2BAccountAttribute( attribute,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.addB2BAccountAttribute( attribute,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute The attribute details being applied to the B2B account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addB2BAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addB2BAccountAttributeClient( attribute,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.changeParentAccount( accountId,  parentAccountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param parentAccountId 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount changeParentAccount(Integer accountId, Integer parentAccountId) throws Exception
	{
		return changeParentAccount( accountId,  parentAccountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.changeParentAccount( accountId,  parentAccountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param parentAccountId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount changeParentAccount(Integer accountId, Integer parentAccountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.changeParentAccountClient( accountId,  parentAccountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addSalesRepToB2BAccount( accountId,  userId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param userId 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount addSalesRepToB2BAccount(Integer accountId, String userId) throws Exception
	{
		return addSalesRepToB2BAccount( accountId,  userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.addSalesRepToB2BAccount( accountId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param userId 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount addSalesRepToB2BAccount(Integer accountId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addSalesRepToB2BAccountClient( accountId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	Stream stream = b2baccount.addUserRoleAsync( accountId,  userId,  roleId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param roleId Identifier for the role that the user account should belong to. For B2B, these roles include Admin, Purchaser, and Non-Purchaser.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream addUserRoleAsync(Integer accountId, String userId, Integer roleId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addUserRoleAsyncClient( accountId,  userId,  roleId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUser b2BUser = b2baccount.addUser( user,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param user 
	 * @return com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUserAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.B2BUser addUser(com.mozu.api.contracts.customer.B2BUserAndAuthInfo user, Integer accountId) throws Exception
	{
		return addUser( user,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUser b2BUser = b2baccount.addUser( user,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param user 
	 * @return com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUserAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.B2BUser addUser(com.mozu.api.contracts.customer.B2BUserAndAuthInfo user, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BUser> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.addUserClient( user,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.updateB2BAccountAttribute( attribute,  accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param attribute 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateB2BAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateB2BAccountAttribute( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	CustomerAttribute customerAttribute = b2baccount.updateB2BAccountAttribute( attribute,  accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateB2BAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.updateB2BAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateSalesRepsOnB2BAccount( userIds,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param userIds 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see string
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateSalesRepsOnB2BAccount(List<String> userIds, Integer accountId) throws Exception
	{
		return updateSalesRepsOnB2BAccount( userIds,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateSalesRepsOnB2BAccount( userIds,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param userIds 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see string
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateSalesRepsOnB2BAccount(List<String> userIds, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.updateSalesRepsOnB2BAccountClient( userIds,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateB2BAccountStatus( accountId,  actionName);
	 * </code></pre></p>
	 * @param accountId 
	 * @param actionName 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateB2BAccountStatus(Integer accountId, String actionName) throws Exception
	{
		return updateB2BAccountStatus( accountId,  actionName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateB2BAccountStatus( accountId,  actionName,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param actionName 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateB2BAccountStatus(Integer accountId, String actionName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.updateB2BAccountStatusClient( accountId,  actionName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	Stream stream = b2baccount.removeUser( accountId,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream removeUser(Integer accountId, String userId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.removeUserClient( accountId,  userId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUser b2BUser = b2baccount.updateUser( user,  accountId,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param user 
	 * @return com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 */
	public com.mozu.api.contracts.customer.B2BUser updateUser(com.mozu.api.contracts.customer.B2BUser user, Integer accountId, String userId) throws Exception
	{
		return updateUser( user,  accountId,  userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BUser b2BUser = b2baccount.updateUser( user,  accountId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param user 
	 * @return com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 * @see com.mozu.api.contracts.customer.B2BUser
	 */
	public com.mozu.api.contracts.customer.B2BUser updateUser(com.mozu.api.contracts.customer.B2BUser user, Integer accountId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BUser> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.updateUserClient( user,  accountId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateAccount( account,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param account 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateAccount(com.mozu.api.contracts.customer.B2BAccount account, Integer accountId) throws Exception
	{
		return updateAccount( account,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.updateAccount( account,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param account 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount updateAccount(com.mozu.api.contracts.customer.B2BAccount account, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.updateAccountClient( account,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	Stream stream = b2baccount.deleteB2BAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteB2BAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.deleteB2BAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	B2BAccount b2BAccount = b2baccount.removeSalesRepFromB2BAccount( accountId,  userId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param userId 
	 * @return com.mozu.api.contracts.customer.B2BAccount
	 * @see com.mozu.api.contracts.customer.B2BAccount
	 */
	public com.mozu.api.contracts.customer.B2BAccount removeSalesRepFromB2BAccount(Integer accountId, String userId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.B2BAccount> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.removeSalesRepFromB2BAccountClient( accountId,  userId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	B2BAccount b2baccount = new B2BAccount();
	 *	Stream stream = b2baccount.removeUserRoleAsync( accountId,  userId,  roleId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param roleId The ID corresponding to the type of permissions being removed, e.g. 1 for Admin.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream removeUserRoleAsync(Integer accountId, String userId, Integer roleId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.customer.B2BAccountClient.removeUserRoleAsyncClient( accountId,  userId,  roleId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



