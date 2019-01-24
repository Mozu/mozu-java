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
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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
	 * @param code User-defined code that uniqely identifies the channel group.
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
	 * @param code User-defined code that uniqely identifies the channel group.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit) throws Exception
	{
		return addCredit( credit,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.addCredit( credit, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch addCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		return addCreditAsync( credit,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.addCredit( credit,  userId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public com.mozu.api.contracts.customer.credit.Credit addCredit(com.mozu.api.contracts.customer.credit.Credit credit, String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.addCreditClient( credit,  userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	CountDownLatch latch = credit.addCredit( credit,  userId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public CountDownLatch addCreditAsync(com.mozu.api.contracts.customer.credit.Credit credit, String userId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.Credit> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> client = com.mozu.api.clients.commerce.customer.CreditClient.addCreditClient( credit,  userId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	Credit credit = credit.associateCreditToShopper( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
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
	 * @param code User-defined code that uniqely identifies the channel group.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return 
	 */
	public void resendCreditCreatedEmail(String code) throws Exception
	{
		resendCreditCreatedEmail( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Credit credit = new Credit();
	 *	credit.resendCreditCreatedEmail( code,  userId);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return 
	 */
	public void resendCreditCreatedEmail(String code, String userId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CreditClient.resendCreditCreatedEmailClient( code,  userId);
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
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
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
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
	 * @param code User-defined code that uniqely identifies the channel group.
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



