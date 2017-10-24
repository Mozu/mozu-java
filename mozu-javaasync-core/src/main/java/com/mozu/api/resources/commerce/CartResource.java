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
 * Use the Carts resource to manage storefront shopping carts as items are added and removed. Each time a shopper's cart is modified, the Carts resource updates the estimated total with any applicable discounts.
 * </summary>
 */
public class CartResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CartResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getCart( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getCart(String cartId) throws Exception
	{
		return getCart( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getCart( cartId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cartId Identifier of the cart to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getCartAsync(String cartId, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		return getCartAsync( cartId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getCart( cartId,  responseFields);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to retrieve.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getCart(String cartId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getCart( cartId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param cartId Identifier of the cart to retrieve.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getCartAsync(String cartId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getOrCreateCart();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getOrCreateCart() throws Exception
	{
		return getOrCreateCart( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getOrCreateCart( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getOrCreateCartAsync( AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		return getOrCreateCartAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getOrCreateCart( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getOrCreateCart(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getOrCreateCartClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getOrCreateCart( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getOrCreateCartAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getOrCreateCartClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.getCartSummary();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getCartSummary() throws Exception
	{
		return getCartSummary( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getCartSummary( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public CountDownLatch getCartSummaryAsync( AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartSummary> callback) throws Exception
	{
		return getCartSummaryAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.getCartSummary( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getCartSummary(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getCartSummaryClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getCartSummary( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public CountDownLatch getCartSummaryAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartSummary> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getCartSummaryClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.getUserCartSummary( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getUserCartSummary(String userId) throws Exception
	{
		return getUserCartSummary( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getUserCartSummary( userId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public CountDownLatch getUserCartSummaryAsync(String userId, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartSummary> callback) throws Exception
	{
		return getUserCartSummaryAsync( userId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.getUserCartSummary( userId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getUserCartSummary(String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getUserCartSummaryClient( userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getUserCartSummary( userId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public CountDownLatch getUserCartSummaryAsync(String userId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.CartSummary> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getUserCartSummaryClient( userId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getUserCart( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getUserCart(String userId) throws Exception
	{
		return getUserCart( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getUserCart( userId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getUserCartAsync(String userId, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		return getUserCartAsync( userId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.getUserCart( userId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getUserCart(String userId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getUserCartClient( userId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.getUserCart( userId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch getUserCartAsync(String userId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getUserCartClient( userId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.updateCart( cart);
	 * </code></pre></p>
	 * @param cart All of the properties of the cart to update. The product code is required.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart updateCart(com.mozu.api.contracts.commerceruntime.carts.Cart cart) throws Exception
	{
		return updateCart( cart,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.updateCart( cart, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param cart All of the properties of the cart to update. The product code is required.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch updateCartAsync(com.mozu.api.contracts.commerceruntime.carts.Cart cart, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		return updateCartAsync( cart,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.updateCart( cart,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param cart All of the properties of the cart to update. The product code is required.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart updateCart(com.mozu.api.contracts.commerceruntime.carts.Cart cart, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.updateCartClient( cart,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CountDownLatch latch = cart.updateCart( cart,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param cart All of the properties of the cart to update. The product code is required.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public CountDownLatch updateCartAsync(com.mozu.api.contracts.commerceruntime.carts.Cart cart, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.carts.Cart> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.updateCartClient( cart,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	cart.deleteCart( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return 
	 */
	public void deleteCart(String cartId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.CartClient.deleteCartClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	cart.deleteCurrentCart();
	 * </code></pre></p>
	 * @return 
	 */
	public void deleteCurrentCart() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.CartClient.deleteCurrentCartClient();
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



