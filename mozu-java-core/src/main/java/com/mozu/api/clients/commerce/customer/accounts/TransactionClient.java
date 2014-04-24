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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Account Transactions resource to manage the transactions associated with a customer account.
 * </summary>
 */
public class TransactionClient {
	
	/**
	 * Retrieves a list of transactions associated with the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.customer.Transaction>> mozuClient=GetTransactionsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Transaction transaction = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to retrieve transactions.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.customer.Transaction>>
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public static MozuClient<List<com.mozu.api.contracts.customer.Transaction>> getTransactionsClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.getTransactionsUrl(accountId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.customer.Transaction>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.customer.Transaction>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new transaction for the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Transaction> mozuClient=AddTransactionClient( transaction,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Transaction transaction = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param transaction Properties of the transaction to create for the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Transaction>
	 * @see com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Transaction> addTransactionClient(com.mozu.api.contracts.customer.Transaction transaction, Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.addTransactionUrl(accountId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.Transaction.class;
		MozuClient<com.mozu.api.contracts.customer.Transaction> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(transaction);
		return mozuClient;

	}

	/**
	 * Deletes a transaction from the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveTransactionClient( accountId,  transactionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account from which to delete the transaction.
	 * @param transactionId Unique identifier of the transaction to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeTransactionClient(Integer accountId, String transactionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.removeTransactionUrl(accountId, transactionId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



