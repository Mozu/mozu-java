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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Customer Account Transactions resource to manage the transactions associated with a customer account.
 * </summary>
 */
public class TransactionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TransactionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of transactions associated with the customer account specified in the request.
	 * <p><pre><code>
	 *	Transaction transaction = new Transaction();
	 *	Transaction transaction = transaction.getTransactions( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to retrieve transactions.
	 * @return List<com.mozu.api.contracts.customer.Transaction>
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public List<com.mozu.api.contracts.customer.Transaction> getTransactions(Integer accountId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.customer.Transaction>> client = com.mozu.api.clients.commerce.customer.accounts.TransactionClient.getTransactionsClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new transaction for the customer account specified in the request.
	 * <p><pre><code>
	 *	Transaction transaction = new Transaction();
	 *	Transaction transaction = transaction.addTransaction( transaction,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param transaction Properties of the transaction to create for the customer account.
	 * @return com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public com.mozu.api.contracts.customer.Transaction addTransaction(com.mozu.api.contracts.customer.Transaction transaction, Integer accountId) throws Exception
	{
		return addTransaction( transaction,  accountId,  null);
	}

	/**
	 * Creates a new transaction for the customer account specified in the request.
	 * <p><pre><code>
	 *	Transaction transaction = new Transaction();
	 *	Transaction transaction = transaction.addTransaction( transaction,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param transaction Properties of the transaction to create for the customer account.
	 * @return com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public com.mozu.api.contracts.customer.Transaction addTransaction(com.mozu.api.contracts.customer.Transaction transaction, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Transaction> client = com.mozu.api.clients.commerce.customer.accounts.TransactionClient.addTransactionClient( transaction,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a transaction from the customer account specified in the request.
	 * <p><pre><code>
	 *	Transaction transaction = new Transaction();
	 *	transaction.removeTransaction( accountId,  transactionId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account from which to delete the transaction.
	 * @param transactionId Unique identifier of the transaction to delete.
	 * @return 
	 */
	public void removeTransaction(Integer accountId, String transactionId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.TransactionClient.removeTransactionClient( accountId,  transactionId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



