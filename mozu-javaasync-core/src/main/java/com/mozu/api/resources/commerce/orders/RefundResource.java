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
 * Use the refunds resource to create a refund.
 * </summary>
 */
public class RefundResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public RefundResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	Refund refund = refund.createRefund( refund,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refund The details of the refund.
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public com.mozu.api.contracts.commerceruntime.refunds.Refund createRefund(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId) throws Exception
	{
		return createRefund( refund,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	CountDownLatch latch = refund.createRefund( refund,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param refund The details of the refund.
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public CountDownLatch createRefundAsync(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.refunds.Refund> callback) throws Exception
	{
		return createRefundAsync( refund,  orderId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	Refund refund = refund.createRefund( refund,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param refund The details of the refund.
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public com.mozu.api.contracts.commerceruntime.refunds.Refund createRefund(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> client = com.mozu.api.clients.commerce.orders.RefundClient.createRefundClient( refund,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	CountDownLatch latch = refund.createRefund( refund,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param refund The details of the refund.
	 * @return com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public CountDownLatch createRefundAsync(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.refunds.Refund> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> client = com.mozu.api.clients.commerce.orders.RefundClient.createRefundClient( refund,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	Stream stream = refund.resendRefundEmail( orderId,  refundId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refundId Unique ID of the refund.
        
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream resendRefundEmail(String orderId, String refundId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.orders.RefundClient.resendRefundEmailClient( orderId,  refundId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Refund refund = new Refund();
	 *	CountDownLatch latch = refund.resendRefundEmail( orderId,  refundId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refundId Unique ID of the refund.
        
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch resendRefundEmailAsync(String orderId, String refundId, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.orders.RefundClient.resendRefundEmailClient( orderId,  refundId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



