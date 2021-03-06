/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.checkouts;

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
 * Use this resource to manage payments while the Checkouts resource is active (the Checkouts resource only applies to sites that enable shipping to multiple destinations within the same order). The Checkouts resource remains active until the shopper submits their order.
 * </summary>
 */
public class PaymentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PaymentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.performPaymentAction( action,  checkoutId,  paymentId);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param action The name of the action to perform.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId) throws Exception
	{
		return performPaymentAction( action,  checkoutId,  paymentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	CountDownLatch latch = payment.performPaymentAction( action,  checkoutId,  paymentId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param  callback callback handler for asynchronous operations
	 * @param action The name of the action to perform.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public CountDownLatch performPaymentActionAsync(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return performPaymentActionAsync( action,  checkoutId,  paymentId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.performPaymentAction( action,  checkoutId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action The name of the action to perform.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.performPaymentActionClient( action,  checkoutId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	CountDownLatch latch = payment.performPaymentAction( action,  checkoutId,  paymentId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param action The name of the action to perform.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public CountDownLatch performPaymentActionAsync(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String paymentId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.performPaymentActionClient( action,  checkoutId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.createPaymentAction( action,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param action The name of the action to create.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId) throws Exception
	{
		return createPaymentAction( action,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	CountDownLatch latch = payment.createPaymentAction( action,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param  callback callback handler for asynchronous operations
	 * @param action The name of the action to create.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public CountDownLatch createPaymentActionAsync(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return createPaymentActionAsync( action,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	Checkout checkout = payment.createPaymentAction( action,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action The name of the action to create.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createPaymentAction(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.createPaymentActionClient( action,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Payment payment = new Payment();
	 *	CountDownLatch latch = payment.createPaymentAction( action,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param action The name of the action to create.
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public CountDownLatch createPaymentActionAsync(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.PaymentClient.createPaymentActionClient( action,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



