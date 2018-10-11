/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use the Billing Info subresource to manage the billing information stored for an order.
 * </summary>
 */
public class BillingInfoResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public BillingInfoResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	BillingInfo billingInfo = billinginfo.getBillingInfo( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(String orderId) throws Exception
	{
		return getBillingInfo( orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	CountDownLatch latch = billinginfo.getBillingInfo( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public CountDownLatch getBillingInfoAsync(String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> callback) throws Exception
	{
		return getBillingInfoAsync( orderId,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	BillingInfo billingInfo = billinginfo.getBillingInfo( orderId,  draft,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.getBillingInfoClient( orderId,  draft,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	CountDownLatch latch = billinginfo.getBillingInfo( orderId,  draft,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public CountDownLatch getBillingInfoAsync(String orderId, Boolean draft, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.getBillingInfoClient( orderId,  draft,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	BillingInfo billingInfo = billinginfo.setBillingInfo( billingInfo,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId) throws Exception
	{
		return setBillingInfo( billingInfo,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	CountDownLatch latch = billinginfo.setBillingInfo( billingInfo,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public CountDownLatch setBillingInfoAsync(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> callback) throws Exception
	{
		return setBillingInfoAsync( billingInfo,  orderId,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	BillingInfo billingInfo = billinginfo.setBillingInfo( billingInfo,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.setBillingInfoClient( billingInfo,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	BillingInfo billinginfo = new BillingInfo();
	 *	CountDownLatch latch = billinginfo.setBillingInfo( billingInfo,  orderId,  updateMode,  version,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param  callback callback handler for asynchronous operations
	 * @param billingInfo Properties of the billing information entered for an order during checkout.
	 * @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 * @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	 */
	public CountDownLatch setBillingInfoAsync(com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, String updateMode, String version, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.setBillingInfoClient( billingInfo,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



