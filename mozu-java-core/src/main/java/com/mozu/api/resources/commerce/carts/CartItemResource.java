/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Cart Items subresource to manage a collection of items in an active shopping cart.
 * </summary>
 */
public class CartItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CartItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.getCartItem( cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(String cartItemId) throws Exception
	{
		return getCartItem( cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.getCartItem( cartItemId,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem getCartItem(String cartItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.getCartItemClient( cartItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItemCollection cartItemCollection = cartitem.getCartItems();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems() throws Exception
	{
		return getCartItems( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItemCollection cartItemCollection = cartitem.getCartItems( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItemCollection getCartItems(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> client = com.mozu.api.clients.commerce.carts.CartItemClient.getCartItemsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	cartitem.addItemsToCart( cartItems);
	 * </code></pre></p>
	 * @param cartItems 
	 * @return 
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public void addItemsToCart(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems) throws Exception
	{
		addItemsToCart( cartItems,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	cartitem.addItemsToCart( cartItems,  throwErrorOnInvalidItems);
	 * </code></pre></p>
	 * @param throwErrorOnInvalidItems 
	 * @param cartItems 
	 * @return 
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public void addItemsToCart(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems, Boolean throwErrorOnInvalidItems) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.CartItemClient.addItemsToCartClient( cartItems,  throwErrorOnInvalidItems);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.addItemToCart( cartItem);
	 * </code></pre></p>
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem) throws Exception
	{
		return addItemToCart( cartItem,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.addItemToCart( cartItem,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem addItemToCart(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.addItemToCartClient( cartItem,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItemQuantity( cartItemId,  quantity);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(String cartItemId, Integer quantity) throws Exception
	{
		return updateCartItemQuantity( cartItemId,  quantity,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItemQuantity( cartItemId,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItemQuantity(String cartItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.updateCartItemQuantityClient( cartItemId,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItem( cartItem,  cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId) throws Exception
	{
		return updateCartItem( cartItem,  cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	CartItem cartItem = cartitem.updateCartItem( cartItem,  cartItemId,  responseFields);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartItem updateCartItem(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> client = com.mozu.api.clients.commerce.carts.CartItemClient.updateCartItemClient( cartItem,  cartItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	Cart cart = cartitem.removeAllCartItems();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeAllCartItems() throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.CartItemClient.removeAllCartItemsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartItem cartitem = new CartItem();
	 *	cartitem.deleteCartItem( cartItemId);
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return 
	 */
	public void deleteCartItem(String cartItemId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.CartItemClient.deleteCartItemClient( cartItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



