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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CustomerPurchaseOrderAccountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerPurchaseOrderAccountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderAccount( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch getCustomerPurchaseOrderAccountAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		return getCustomerPurchaseOrderAccountAsync( accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderAccountClient( accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch getCustomerPurchaseOrderAccountAsync(Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderAccountClient( accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderTransactions( accountId,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public CountDownLatch getCustomerPurchaseOrderTransactionsAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> callback) throws Exception
	{
		return getCustomerPurchaseOrderTransactionsAsync( accountId,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId,  startIndex,  pageSize,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderTransactionsClient( accountId,  startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId,  startIndex,  pageSize,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public CountDownLatch getCustomerPurchaseOrderTransactionsAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderTransactionsClient( accountId,  startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param  callback callback handler for asynchronous operations
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch createCustomerPurchaseOrderAccountAsync(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		return createCustomerPurchaseOrderAccountAsync( customerPurchaseOrderAccount,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch createCustomerPurchaseOrderAccountAsync(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransaction purchaseOrderTransaction = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param purchaseOrderTransaction 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId) throws Exception
	{
		return createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param  callback callback handler for asynchronous operations
	 * @param purchaseOrderTransaction 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public CountDownLatch createPurchaseOrderTransactionAsync(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.PurchaseOrderTransaction> callback) throws Exception
	{
		return createPurchaseOrderTransactionAsync( purchaseOrderTransaction,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransaction purchaseOrderTransaction = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param purchaseOrderTransaction 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createPurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param purchaseOrderTransaction 
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public CountDownLatch createPurchaseOrderTransactionAsync(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.PurchaseOrderTransaction> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createPurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param  callback callback handler for asynchronous operations
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch updateCustomerPurchaseOrderAccountAsync(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		return updateCustomerPurchaseOrderAccountAsync( customerPurchaseOrderAccount,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.updateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CountDownLatch latch = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param customerPurchaseOrderAccount 
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public CountDownLatch updateCustomerPurchaseOrderAccountAsync(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.updateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	customerpurchaseorderaccount.deleteCustomerPurchaseOrderAccount( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return 
	 */
	public void deleteCustomerPurchaseOrderAccount(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.deleteCustomerPurchaseOrderAccountClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}


