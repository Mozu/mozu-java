/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

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
public class CustomerAccountClient {
	
	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient() throws Exception
	{
		return getAccountsClient( null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of customer accounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient( startIndex,  pageSize,  sortBy,  filter,  fields,  q,  qLimit,  isAnonymous,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param fields The fields to include in the response.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param isAnonymous If true, retrieve anonymous shopper accounts in the response.
	 * @param pageSize 
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String fields, String q, Integer qLimit, Boolean isAnonymous, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountsUrl(fields, filter, isAnonymous, pageSize, q, qLimit, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the current login state of the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateClient(Integer accountId) throws Exception
	{
		return getLoginStateClient( accountId,  null);
	}

	/**
	 * Retrieves the current login state of the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = (MozuClient<com.mozu.api.contracts.customer.LoginState>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieve details of a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=GetAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> getAccountClient(Integer accountId) throws Exception
	{
		return getAccountClient( accountId,  null);
	}

	/**
	 * Retrieve details of a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=GetAccountClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> getAccountClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new customer account based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=AddAccountClient( account);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param account Properties of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> addAccountClient(com.mozu.api.contracts.customer.CustomerAccount account) throws Exception
	{
		return addAccountClient( account,  null);
	}

	/**
	 * Creates a new customer account based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=AddAccountClient( account,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param account Properties of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> addAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(account);
		return mozuClient;

	}

	/**
	 * Modify the password associated with a customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=ChangePasswordClient( passwordInfo,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param passwordInfo The information required to modify a shopper account password.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public static MozuClient changePasswordClient(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId) throws Exception
	{
		return changePasswordClient( passwordInfo,  accountId,  null);
	}

	/**
	 * Modify the password associated with a customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=ChangePasswordClient( passwordInfo,  accountId,  unlockAccount);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param unlockAccount 
	 * @param passwordInfo The information required to modify a shopper account password.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.customer.PasswordInfo
	 */
	public static MozuClient changePasswordClient(com.mozu.api.contracts.customer.PasswordInfo passwordInfo, Integer accountId, Boolean unlockAccount) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.changePasswordUrl(accountId, unlockAccount);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(passwordInfo);
		return mozuClient;

	}

	/**
	 * Adds a new user login to a defined customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddLoginToExistingCustomerClient( customerAuthInfo,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param customerAuthInfo The login information for a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addLoginToExistingCustomerClient(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId) throws Exception
	{
		return addLoginToExistingCustomerClient( customerAuthInfo,  accountId,  null);
	}

	/**
	 * Adds a new user login to a defined customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddLoginToExistingCustomerClient( customerAuthInfo,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param customerAuthInfo The login information for a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerLoginInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addLoginToExistingCustomerClient(com.mozu.api.contracts.customer.CustomerLoginInfo customerAuthInfo, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addLoginToExistingCustomerUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerAuthInfo);
		return mozuClient;

	}

	/**
	 * Updates the customer lifetime value of the specified customer account in the event of an order import or a lifetime value calculation error.
	 * <p><pre><code>
	 * MozuClient mozuClient=RecomputeCustomerLifetimeValueClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient recomputeCustomerLifetimeValueClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.recomputeCustomerLifetimeValueUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Lock or unlock a customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=SetLoginLockedClient( isLocked,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param isLocked If true, the customer account is locked from logging in.
	 * @return Mozu.Api.MozuClient 
	 * @see bool
	 */
	public static MozuClient setLoginLockedClient(Boolean isLocked, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.setLoginLockedUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(isLocked);
		return mozuClient;

	}

	/**
	 * Requires the password for the customer account to be changed.
	 * <p><pre><code>
	 * MozuClient mozuClient=SetPasswordChangeRequiredClient( isPasswordChangeRequired,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param isPasswordChangeRequired If true, the password for the customer account must be changed.
	 * @return Mozu.Api.MozuClient 
	 * @see bool
	 */
	public static MozuClient setPasswordChangeRequiredClient(Boolean isPasswordChangeRequired, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.setPasswordChangeRequiredUrl(accountId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(isPasswordChangeRequired);
		return mozuClient;

	}

	/**
	 * Creates a new customer account and logs the user associated with the customer account into the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddAccountAndLoginClient( accountAndAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param accountAndAuthInfo The authentication information associated with a customer account. The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addAccountAndLoginClient(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo) throws Exception
	{
		return addAccountAndLoginClient( accountAndAuthInfo,  null);
	}

	/**
	 * Creates a new customer account and logs the user associated with the customer account into the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient=AddAccountAndLoginClient( accountAndAuthInfo,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuthTicket customerAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param accountAndAuthInfo The authentication information associated with a customer account. The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuthTicket>
	 * @see com.mozu.api.contracts.customer.CustomerAuthTicket
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> addAccountAndLoginClient(com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo accountAndAuthInfo, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountAndLoginUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuthTicket.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountAndAuthInfo);
		return mozuClient;

	}

	/**
	 * Creates multiple customer accounts based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=AddAccountsClient( customers);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param customers The authentication information associated with a customer account. The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> addAccountsClient(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers) throws Exception
	{
		return addAccountsClient( customers,  null);
	}

	/**
	 * Creates multiple customer accounts based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=AddAccountsClient( customers,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccountCollection customerAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param customers The authentication information associated with a customer account. The data includes the account properties such as the name, username, authorization access, and email address, the required password to match, and indicates if the account was imported from a third party resource. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAccountCollection
	 * @see com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> addAccountsClient(List<com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo> customers, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customers);
		return mozuClient;

	}

	/**
	 * Changes a collection of shopper passwords
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> mozuClient=ChangePasswordsClient( accountPasswordInfos);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChangePasswordResultCollection changePasswordResultCollection = client.Result();
	 * </code></pre></p>
	 * @param accountPasswordInfos Mozu.Customer.Contracts.AccountPasswordInfoCollection ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.ChangePasswordResultCollection>
	 * @see com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.AccountPasswordInfoCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> changePasswordsClient(com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos) throws Exception
	{
		return changePasswordsClient( accountPasswordInfos,  null);
	}

	/**
	 * Changes a collection of shopper passwords
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> mozuClient=ChangePasswordsClient( accountPasswordInfos,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChangePasswordResultCollection changePasswordResultCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param accountPasswordInfos Mozu.Customer.Contracts.AccountPasswordInfoCollection ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.ChangePasswordResultCollection>
	 * @see com.mozu.api.contracts.customer.ChangePasswordResultCollection
	 * @see com.mozu.api.contracts.customer.AccountPasswordInfoCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> changePasswordsClient(com.mozu.api.contracts.customer.AccountPasswordInfoCollection accountPasswordInfos, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.changePasswordsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.ChangePasswordResultCollection.class;
		MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.ChangePasswordResultCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(accountPasswordInfos);
		return mozuClient;

	}

	/**
	 * Retrieves the current login state of a customer account by providing the customer's email address.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByEmailAddressClient( emailAddress);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param emailAddress The email address associated with the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByEmailAddressClient(String emailAddress) throws Exception
	{
		return getLoginStateByEmailAddressClient( emailAddress,  null,  null);
	}

	/**
	 * Retrieves the current login state of a customer account by providing the customer's email address.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByEmailAddressClient( emailAddress,  customerSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param customerSetCode 
	 * @param emailAddress The email address associated with the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByEmailAddressClient(String emailAddress, String customerSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateByEmailAddressUrl(customerSetCode, emailAddress, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = (MozuClient<com.mozu.api.contracts.customer.LoginState>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the current login state of a customer account by providing the user name associated with the customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByUserNameClient( userName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param userName The user name associated with the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByUserNameClient(String userName) throws Exception
	{
		return getLoginStateByUserNameClient( userName,  null,  null);
	}

	/**
	 * Retrieves the current login state of a customer account by providing the user name associated with the customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient=GetLoginStateByUserNameClient( userName,  customerSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LoginState loginState = client.Result();
	 * </code></pre></p>
	 * @param customerSetCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userName The user name associated with the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.LoginState>
	 * @see com.mozu.api.contracts.customer.LoginState
	 */
	public static MozuClient<com.mozu.api.contracts.customer.LoginState> getLoginStateByUserNameClient(String userName, String customerSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getLoginStateByUserNameUrl(customerSetCode, responseFields, userName);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.LoginState.class;
		MozuClient<com.mozu.api.contracts.customer.LoginState> mozuClient = (MozuClient<com.mozu.api.contracts.customer.LoginState>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * customer-accounts Post GetCustomersPurchaseOrderAccounts description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> mozuClient=GetCustomersPurchaseOrderAccountsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccountCollection customerPurchaseOrderAccountCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> getCustomersPurchaseOrderAccountsClient() throws Exception
	{
		return getCustomersPurchaseOrderAccountsClient( null,  null,  null,  null);
	}

	/**
	 * customer-accounts Post GetCustomersPurchaseOrderAccounts description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> mozuClient=GetCustomersPurchaseOrderAccountsClient( startIndex,  pageSize,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccountCollection customerPurchaseOrderAccountCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> getCustomersPurchaseOrderAccountsClient(Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getCustomersPurchaseOrderAccountsUrl(pageSize, responseFields, sortBy, startIndex);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccountCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Resets the password for a customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=ResetPasswordClient( resetPasswordInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param resetPasswordInfo Information required to reset the password for a customer account.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.customer.ResetPasswordInfo
	 */
	public static MozuClient resetPasswordClient(com.mozu.api.contracts.customer.ResetPasswordInfo resetPasswordInfo) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.resetPasswordUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(resetPasswordInfo);
		return mozuClient;

	}

	/**
	 * Updates a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=UpdateAccountClient( account,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param account Properties of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> updateAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId) throws Exception
	{
		return updateAccountClient( account,  accountId,  null);
	}

	/**
	 * Updates a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=UpdateAccountClient( account,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAccount customerAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param account Properties of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 * @see com.mozu.api.contracts.customer.CustomerAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> updateAccountClient(com.mozu.api.contracts.customer.CustomerAccount account, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.updateAccountUrl(accountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(account);
		return mozuClient;

	}

	/**
	 * Deletes a customer account. A customer account cannot be deleted if any orders exist, past or present.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.deleteAccountUrl(accountId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



