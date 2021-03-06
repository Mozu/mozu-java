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
 * Use the Customer Accounts resource to manage the components of shopper accounts, including attributes, contact information, company notes, and groups associated with the customer account.
 * </summary>
 */
public class CustomerAccountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerAccountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.getAccounts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts() throws Exception
	{
		return getAccounts( null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.getAccounts( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous,  responseFields);
	 * </code></pre></p>
	 * @param fields The fields to include in the response.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param isAnonymous If true, retrieve anonymous shopper accounts in the response.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection getAccounts(Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, Boolean isAnonymous, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getAccountsClient( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginState( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginState(Integer accountId) throws Exception
	{
		return getLoginState( accountId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginState( accountId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginState(Integer accountId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateClient( accountId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.getAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount getAccount(Integer accountId) throws Exception
	{
		return getAccount( accountId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.getAccount( accountId,  userId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount getAccount(Integer accountId, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getAccountClient( accountId,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.addAccount( account);
	 * </code></pre></p>
	 * @param account Properties of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount addAccount(com.mozu.api.contracts.customer.CustomerAccount account) throws Exception
	{
		return addAccount( account,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.addAccount( account,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param account Properties of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount addAccount(com.mozu.api.contracts.customer.CustomerAccount account, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountClient( account,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.changePassword( passwordInfo,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param passwordInfo The information required to modify a shopper account password.
	 * @return 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public void changePassword(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId) throws Exception
	{
		changePassword( passwordInfo,  accountId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.changePassword( passwordInfo,  accountId,  unlockAccount,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param unlockAccount Specifies whether to unlock the specified customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param passwordInfo The information required to modify a shopper account password.
	 * @return 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public void changePassword(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId, Boolean unlockAccount, String userId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.changePasswordClient( passwordInfo,  accountId,  unlockAccount,  userId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.addLoginToExistingCustomer( customerAuthInfo,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param customerAuthInfo The login information for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addLoginToExistingCustomer(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId) throws Exception
	{
		return addLoginToExistingCustomer( customerAuthInfo,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.addLoginToExistingCustomer( customerAuthInfo,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customerAuthInfo The login information for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addLoginToExistingCustomer(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addLoginToExistingCustomerClient( customerAuthInfo,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.recomputeCustomerLifetimeValue( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return 
	 */
	public void recomputeCustomerLifetimeValue(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.recomputeCustomerLifetimeValueClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.setLoginLocked( isLocked,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param isLocked If true, the customer account is locked from logging in.
	 * @return 
	 * @see bool
	 */
	public void setLoginLocked(Boolean isLocked, Integer accountId) throws Exception
	{
		setLoginLocked( isLocked,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.setLoginLocked( isLocked,  accountId,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param isLocked If true, the customer account is locked from logging in.
	 * @return 
	 * @see bool
	 */
	public void setLoginLocked(Boolean isLocked, Integer accountId, String userId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.setLoginLockedClient( isLocked,  accountId,  userId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.setPasswordChangeRequired( isPasswordChangeRequired,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param isPasswordChangeRequired If true, the password for the customer account must be changed.
	 * @return 
	 * @see bool
	 */
	public void setPasswordChangeRequired(Boolean isPasswordChangeRequired, Integer accountId) throws Exception
	{
		setPasswordChangeRequired( isPasswordChangeRequired,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.setPasswordChangeRequired( isPasswordChangeRequired,  accountId,  userId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param isPasswordChangeRequired If true, the password for the customer account must be changed.
	 * @return 
	 * @see bool
	 */
	public void setPasswordChangeRequired(Boolean isPasswordChangeRequired, Integer accountId, String userId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.setPasswordChangeRequiredClient( isPasswordChangeRequired,  accountId,  userId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.addAccountAndLogin( accountAndAuthInfo);
	 * </code></pre></p>
	 * @param accountAndAuthInfo The authentication information associated with a customer account.Â The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addAccountAndLogin(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo) throws Exception
	{
		return addAccountAndLogin( accountAndAuthInfo,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAuthTicket customerAuthTicket = customeraccount.addAccountAndLogin( accountAndAuthInfo,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param accountAndAuthInfo The authentication information associated with a customer account.Â The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAuthTicket addAccountAndLogin(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountAndLoginClient( accountAndAuthInfo,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.addAccounts( customers);
	 * </code></pre></p>
	 * @param customers The authentication information associated with a customer account.Â The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection addAccounts(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers) throws Exception
	{
		return addAccounts( customers,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccountCollection customerAccountCollection = customeraccount.addAccounts( customers,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customers The authentication information associated with a customer account.Â The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public com.mozu.api.contracts.customer.CustomerAccountCollection addAccounts(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.addAccountsClient( customers,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	ChangePasswordResultCollection changePasswordResultCollection = customeraccount.changePasswords( accountPasswordInfos);
	 * </code></pre></p>
	 * @param accountPasswordInfos The details of the changed customer account passwords.
	 * @return com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.AccountPasswordInfoCollection
	 */
	public com.mozu.api.contracts.customer.ChangePasswordResultCollection changePasswords(com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos) throws Exception
	{
		return changePasswords( accountPasswordInfos,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	ChangePasswordResultCollection changePasswordResultCollection = customeraccount.changePasswords( accountPasswordInfos,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param accountPasswordInfos The details of the changed customer account passwords.
	 * @return com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.AccountPasswordInfoCollection
	 */
	public com.mozu.api.contracts.customer.ChangePasswordResultCollection changePasswords(com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.changePasswordsClient( accountPasswordInfos,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginStateByEmailAddress( emailAddress);
	 * </code></pre></p>
	 * @param emailAddress The email address associated with the customer account.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByEmailAddress(String emailAddress) throws Exception
	{
		return getLoginStateByEmailAddress( emailAddress,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginStateByEmailAddress( emailAddress,  customerSetCode,  responseFields);
	 * </code></pre></p>
	 * @param customerSetCode The unique idenfitier of the customer set.
	 * @param emailAddress The email address associated with the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByEmailAddress(String emailAddress, String customerSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateByEmailAddressClient( emailAddress,  customerSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginStateByUserName( userName);
	 * </code></pre></p>
	 * @param userName The user name associated with the customer account.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByUserName(String userName) throws Exception
	{
		return getLoginStateByUserName( userName,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	LoginState loginState = customeraccount.getLoginStateByUserName( userName,  customerSetCode,  responseFields);
	 * </code></pre></p>
	 * @param customerSetCode The unique idenfitier of the customer set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userName The user name associated with the customer account.
	 * @return com.mozu.api.contracts.customer.LoginState
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public com.mozu.api.contracts.customer.LoginState getLoginStateByUserName(String userName, String customerSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.LoginState> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getLoginStateByUserNameClient( userName,  customerSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerPurchaseOrderAccountCollection customerPurchaseOrderAccountCollection = customeraccount.getCustomersPurchaseOrderAccounts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection getCustomersPurchaseOrderAccounts() throws Exception
	{
		return getCustomersPurchaseOrderAccounts( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerPurchaseOrderAccountCollection customerPurchaseOrderAccountCollection = customeraccount.getCustomersPurchaseOrderAccounts( startIndex,  pageSize,  sortBy,  accountType,  responseFields);
	 * </code></pre></p>
	 * @param accountType The type of customer account utilizing purchase orders.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection getCustomersPurchaseOrderAccounts(Integer startIndex, Integer pageSize, String sortBy, String accountType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.getCustomersPurchaseOrderAccountsClient( startIndex,  pageSize,  sortBy,  accountType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.resetPassword( resetPasswordInfo);
	 * </code></pre></p>
	 * @param resetPasswordInfo Information required to reset the password for a customer account.
	 * @return 
	 * @see com.mozu.api.contracts.customer.ResetPasswordInfo
	 */
	public void resetPassword(com.mozu.api.contracts.customer.ResetPasswordInfo resetPasswordInfo) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.resetPasswordClient( resetPasswordInfo);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.updateAccount( account,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param account Properties of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount updateAccount(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId) throws Exception
	{
		return updateAccount( account,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	CustomerAccount customerAccount = customeraccount.updateAccount( account,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param account Properties of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public com.mozu.api.contracts.customer.CustomerAccount updateAccount(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.updateAccountClient( account,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAccount customeraccount = new CustomerAccount();
	 *	customeraccount.deleteAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return 
	 */
	public void deleteAccount(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerAccountClient.deleteAccountClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



