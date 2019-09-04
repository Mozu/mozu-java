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
 * 
 * </summary>
 */
public class CustomerPurchaseOrderAccountClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=GetCustomerPurchaseOrderAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> getCustomerPurchaseOrderAccountClient(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderAccountClient( accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=GetCustomerPurchaseOrderAccountClient( accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> getCustomerPurchaseOrderAccountClient(Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.getCustomerPurchaseOrderAccountUrl(accountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> mozuClient=GetCustomerPurchaseOrderTransactionsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection>
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> getCustomerPurchaseOrderTransactionsClient(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderTransactionsClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> mozuClient=GetCustomerPurchaseOrderTransactionsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection>
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> getCustomerPurchaseOrderTransactionsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.getCustomerPurchaseOrderTransactionsUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection.class;
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=CreateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerPurchaseOrderAccount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> createCustomerPurchaseOrderAccountClient(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return createCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=CreateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param customerPurchaseOrderAccount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> createCustomerPurchaseOrderAccountClient(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.createCustomerPurchaseOrderAccountUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerPurchaseOrderAccount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> mozuClient=CreatePurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PurchaseOrderTransaction purchaseOrderTransaction = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param purchaseOrderTransaction 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.PurchaseOrderTransaction>
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> createPurchaseOrderTransactionClient(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId) throws Exception
	{
		return createPurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> mozuClient=CreatePurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PurchaseOrderTransaction purchaseOrderTransaction = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param purchaseOrderTransaction 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.PurchaseOrderTransaction>
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> createPurchaseOrderTransactionClient(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.createPurchaseOrderTransactionUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.PurchaseOrderTransaction.class;
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> mozuClient = (MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(purchaseOrderTransaction);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=UpdateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param customerPurchaseOrderAccount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> updateCustomerPurchaseOrderAccountClient(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return updateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient=UpdateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerPurchaseOrderAccount customerPurchaseOrderAccount = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param responseFields 
	 * @param customerPurchaseOrderAccount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> updateCustomerPurchaseOrderAccountClient(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.updateCustomerPurchaseOrderAccountUrl(accountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerPurchaseOrderAccount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCustomerPurchaseOrderAccountClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCustomerPurchaseOrderAccountClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerPurchaseOrderAccountUrl.deleteCustomerPurchaseOrderAccountUrl(accountId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



