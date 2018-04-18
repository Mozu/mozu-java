/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
 * 
 * </summary>
 */
public class CheckoutResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CheckoutResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CheckoutCollection checkoutCollection = checkout.getCheckouts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection getCheckouts() throws Exception
	{
		return getCheckouts( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getCheckouts( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public CountDownLatch getCheckoutsAsync( AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> callback) throws Exception
	{
		return getCheckoutsAsync( null,  null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CheckoutCollection checkoutCollection = checkout.getCheckouts( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection getCheckouts(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> client = com.mozu.api.clients.commerce.CheckoutClient.getCheckoutsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getCheckouts( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public CountDownLatch getCheckoutsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> client = com.mozu.api.clients.commerce.CheckoutClient.getCheckoutsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	string string = checkout.getAvailableActions( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableActions(String checkoutId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.CheckoutClient.getAvailableActionsClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getAvailableActions( checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @return List<string>
	 * @see string
	 */
	public CountDownLatch getAvailableActionsAsync(String checkoutId, AsyncCallback<List<String>> callback) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.CheckoutClient.getAvailableActionsClient( checkoutId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CheckoutGroupRates checkoutGroupRates = checkout.getAvailableShippingMethods( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates
	 */
	public List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates> getAvailableShippingMethods(String checkoutId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> client = com.mozu.api.clients.commerce.CheckoutClient.getAvailableShippingMethodsClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getAvailableShippingMethods( checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates
	 */
	public CountDownLatch getAvailableShippingMethodsAsync(String checkoutId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> client = com.mozu.api.clients.commerce.CheckoutClient.getAvailableShippingMethodsClient( checkoutId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.getCheckout( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout getCheckout(String checkoutId) throws Exception
	{
		return getCheckout( checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getCheckout( checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch getCheckoutAsync(String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return getCheckoutAsync( checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.getCheckout( checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout getCheckout(String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.getCheckoutClient( checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.getCheckout( checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch getCheckoutAsync(String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.getCheckoutClient( checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.createCheckoutFromCart( cartId);
	 * </code></pre></p>
	 * @param cartId 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createCheckoutFromCart(String cartId) throws Exception
	{
		return createCheckoutFromCart( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.createCheckoutFromCart( cartId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cartId 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch createCheckoutFromCartAsync(String cartId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return createCheckoutFromCartAsync( cartId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.createCheckoutFromCart( cartId,  responseFields);
	 * </code></pre></p>
	 * @param cartId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout createCheckoutFromCart(String cartId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.createCheckoutFromCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.createCheckoutFromCart( cartId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cartId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch createCheckoutFromCartAsync(String cartId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.createCheckoutFromCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.performCheckoutAction( action,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performCheckoutAction(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId) throws Exception
	{
		return performCheckoutAction( action,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.performCheckoutAction( action,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public CountDownLatch performCheckoutActionAsync(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return performCheckoutActionAsync( action,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.performCheckoutAction( action,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout performCheckoutAction(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.performCheckoutActionClient( action,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.performCheckoutAction( action,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public CountDownLatch performCheckoutActionAsync(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.performCheckoutActionClient( action,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	checkout.resendCheckoutConfirmationEmail( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return 
	 */
	public void resendCheckoutConfirmationEmail(String checkoutId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.CheckoutClient.resendCheckoutConfirmationEmailClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.setShippingMethods( groupShippingMethods,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param groupShippingMethods 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout setShippingMethods(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId) throws Exception
	{
		return setShippingMethods( groupShippingMethods,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.setShippingMethods( groupShippingMethods,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @param groupShippingMethods 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public CountDownLatch setShippingMethodsAsync(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return setShippingMethodsAsync( groupShippingMethods,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.setShippingMethods( groupShippingMethods,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param groupShippingMethods 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout setShippingMethods(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.setShippingMethodsClient( groupShippingMethods,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.setShippingMethods( groupShippingMethods,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param groupShippingMethods 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public CountDownLatch setShippingMethodsAsync(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.setShippingMethodsClient( groupShippingMethods,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.updateCheckout( checkout,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param checkout 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateCheckout(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId) throws Exception
	{
		return updateCheckout( checkout,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.updateCheckout( checkout,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @param checkout 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch updateCheckoutAsync(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return updateCheckoutAsync( checkout,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.updateCheckout( checkout,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param checkout 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout updateCheckout(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.updateCheckoutClient( checkout,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.updateCheckout( checkout,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param checkout 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public CountDownLatch updateCheckoutAsync(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.updateCheckoutClient( checkout,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param digitalWalletType 
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType) throws Exception
	{
		return processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param digitalWalletType 
	 * @param  callback callback handler for asynchronous operations
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public CountDownLatch processDigitalWalletAsync(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return processDigitalWalletAsync( digitalWallet,  checkoutId,  digitalWalletType,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param digitalWalletType 
	 * @param responseFields 
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.processDigitalWalletClient( digitalWallet,  checkoutId,  digitalWalletType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.processDigitalWallet( digitalWallet,  checkoutId,  digitalWalletType,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param digitalWalletType 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public CountDownLatch processDigitalWalletAsync(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.processDigitalWalletClient( digitalWallet,  checkoutId,  digitalWalletType,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.changeCheckoutPriceList( priceListCode,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout changeCheckoutPriceList(String priceListCode, String checkoutId) throws Exception
	{
		return changeCheckoutPriceList( priceListCode,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.changeCheckoutPriceList( priceListCode,  checkoutId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public CountDownLatch changeCheckoutPriceListAsync(String priceListCode, String checkoutId, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		return changeCheckoutPriceListAsync( priceListCode,  checkoutId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	Checkout checkout = checkout.changeCheckoutPriceList( priceListCode,  checkoutId,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout changeCheckoutPriceList(String priceListCode, String checkoutId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.changeCheckoutPriceListClient( priceListCode,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Checkout checkout = new Checkout();
	 *	CountDownLatch latch = checkout.changeCheckoutPriceList( priceListCode,  checkoutId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param checkoutId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public CountDownLatch changeCheckoutPriceListAsync(String priceListCode, String checkoutId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.CheckoutClient.changeCheckoutPriceListClient( priceListCode,  checkoutId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



