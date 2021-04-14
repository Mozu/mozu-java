/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.carts;

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
 * Use the Cart Items subresource to manage a collection of items in an active shopping cart.
 * </summary>
 */
public class CartItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=GetCartItemByCartIdClient( cartId,  cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> getCartItemByCartIdClient(String cartId, String cartItemId) throws Exception
	{
		return getCartItemByCartIdClient( cartId,  cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=GetCartItemByCartIdClient( cartId,  cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> getCartItemByCartIdClient(String cartId, String cartItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.getCartItemByCartIdUrl(cartId, cartItemId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient=GetCartItemsByCartIdClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItemCollection cartItemCollection = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> getCartItemsByCartIdClient(String cartId) throws Exception
	{
		return getCartItemsByCartIdClient( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient=GetCartItemsByCartIdClient( cartId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItemCollection cartItemCollection = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> getCartItemsByCartIdClient(String cartId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.getCartItemsByCartIdUrl(cartId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=GetCartItemClient( cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> getCartItemClient(String cartItemId) throws Exception
	{
		return getCartItemClient( cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=GetCartItemClient( cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> getCartItemClient(String cartItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.getCartItemUrl(cartItemId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient=GetCartItemsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItemCollection cartItemCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> getCartItemsClient() throws Exception
	{
		return getCartItemsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient=GetCartItemsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItemCollection cartItemCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> getCartItemsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.getCartItemsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddItemsToCartByCartIdClient( cartItems,  cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItems 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<java.io.InputStream> addItemsToCartByCartIdClient(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems, String cartId) throws Exception
	{
		return addItemsToCartByCartIdClient( cartItems,  cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddItemsToCartByCartIdClient( cartItems,  cartId,  throwErrorOnInvalidItems);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param throwErrorOnInvalidItems 
	 * @param cartItems 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<java.io.InputStream> addItemsToCartByCartIdClient(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems, String cartId, Boolean throwErrorOnInvalidItems) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.addItemsToCartByCartIdUrl(cartId, throwErrorOnInvalidItems);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItems);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=AddItemToCartByCartIdClient( cartItem,  cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> addItemToCartByCartIdClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartId) throws Exception
	{
		return addItemToCartByCartIdClient( cartItem,  cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=AddItemToCartByCartIdClient( cartItem,  cartId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param responseFields 
	 * @param cartItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> addItemToCartByCartIdClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.addItemToCartByCartIdUrl(cartId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddItemsToCartClient( cartItems);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param cartItems 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<java.io.InputStream> addItemsToCartClient(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems) throws Exception
	{
		return addItemsToCartClient( cartItems,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddItemsToCartClient( cartItems,  throwErrorOnInvalidItems);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param throwErrorOnInvalidItems 
	 * @param cartItems 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<java.io.InputStream> addItemsToCartClient(List<com.mozu.api.contracts.commerceruntime.carts.CartItem> cartItems, Boolean throwErrorOnInvalidItems) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.addItemsToCartUrl(throwErrorOnInvalidItems);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItems);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=AddItemToCartClient( cartItem);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> addItemToCartClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem) throws Exception
	{
		return addItemToCartClient( cartItem,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=AddItemToCartClient( cartItem,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> addItemToCartClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.addItemToCartUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemQuantityByCartIdClient( cartId,  cartItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @param quantity 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemQuantityByCartIdClient(String cartId, String cartItemId, Integer quantity) throws Exception
	{
		return updateCartItemQuantityByCartIdClient( cartId,  cartItemId,  quantity,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemQuantityByCartIdClient( cartId,  cartItemId,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @param quantity 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemQuantityByCartIdClient(String cartId, String cartItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.updateCartItemQuantityByCartIdUrl(cartId, cartItemId, quantity, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemByCartIdClient( cartItem,  cartId,  cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @param cartItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemByCartIdClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartId, String cartItemId) throws Exception
	{
		return updateCartItemByCartIdClient( cartItem,  cartId,  cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemByCartIdClient( cartItem,  cartId,  cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @param responseFields 
	 * @param cartItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemByCartIdClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartId, String cartItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.updateCartItemByCartIdUrl(cartId, cartItemId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemQuantityClient( cartItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemQuantityClient(String cartItemId, Integer quantity) throws Exception
	{
		return updateCartItemQuantityClient( cartItemId,  quantity,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemQuantityClient( cartItemId,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemQuantityClient(String cartItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.updateCartItemQuantityUrl(cartItemId, quantity, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemClient( cartItem,  cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId) throws Exception
	{
		return updateCartItemClient( cartItem,  cartItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemClient( cartItem,  cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartItem Properties of an item added to an active shopping cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.CartItem>
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> updateCartItemClient(com.mozu.api.contracts.commerceruntime.carts.CartItem cartItem, String cartItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.updateCartItemUrl(cartItemId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.CartItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveAllCartItemsByCartIdClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeAllCartItemsByCartIdClient(String cartId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.removeAllCartItemsByCartIdUrl(cartId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCartItemByCartIdClient( cartId,  cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param cartId 
	 * @param cartItemId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCartItemByCartIdClient(String cartId, String cartItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.deleteCartItemByCartIdUrl(cartId, cartItemId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveAllCartItemsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeAllCartItemsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.removeAllCartItemsUrl();
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCartItemClient( cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCartItemClient(String cartItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.deleteCartItemUrl(cartItemId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



