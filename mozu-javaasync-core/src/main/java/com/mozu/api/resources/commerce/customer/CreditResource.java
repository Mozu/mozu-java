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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Credits resource to manage the store credit associated with a customer account. Store credit can represent a static amount the customer can redeem at any of the tenant's sites, or a gift card registered for a customer account. At this time, gift card functionality is reserved for future use.
 * </summary>
 */
public class CreditResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CreditResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CreditCollection creditCollection = credit.getCredits();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditCollection getCredits() throws Exception
	{
		return getCredits( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.getCredits( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public CountDownLatch getCreditsAsync( AsyncCallback<com.mozu.api.contracts.customer.credit.CreditCollection> callback) throws Exception
	{
		return getCreditsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CreditCollection creditCollection = credit.getCredits( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditCollection getCredits(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.getCredits( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public CountDownLatch getCreditsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.getCredit( code);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit getCredit(String code) throws Exception
	{
		return getCredit( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.getCredit( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch getCreditAsync(String code, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		return getCreditAsync( code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.getCredit( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit getCredit(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.getCredit( code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch getCreditAsync(String code, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.getCreditClient( code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.addCredit( credit);
	 * </code></pre></p>
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit) throws Exception
	{
		return addCredit( credit,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.addCredit( credit, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch addCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		return addCreditAsync( credit,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.addCredit( credit,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.addCreditClient( credit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.addCredit( credit,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit to create.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch addCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.addCreditClient( credit,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.associateCreditToShopper( code);
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(String code) throws Exception
	{
		return associateCreditToShopper( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.associateCreditToShopper( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch associateCreditToShopperAsync(String code, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		return associateCreditToShopperAsync( code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.associateCreditToShopper( code,  responseFields);
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.associateCreditToShopperClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.associateCreditToShopper( code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch associateCreditToShopperAsync(String code, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.associateCreditToShopperClient( code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	credit.resendCreditCreatedEmail( code);
	 * </code></pre></p>
	 * @param code 
	 * @return 
	 */
	public void resendCreditCreatedEmail(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CreditClient.resendCreditCreatedEmailClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.updateCredit( credit,  code);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit updateCredit(com.mozu.api.contracts.customer.credit.Credit credit, String code) throws Exception
	{
		return updateCredit( credit,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.updateCredit( credit,  code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch updateCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, String code, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		return updateCreditAsync( credit,  code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.updateCredit( credit,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param responseFields 
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit updateCredit(com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.updateCreditClient( credit,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.updateCredit( credit,  code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit to update.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch updateCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.updateCreditClient( credit,  code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	credit.deleteCredit( code);
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to delete.
	 * @return 
	 */
	public void deleteCredit(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CreditClient.deleteCreditClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



