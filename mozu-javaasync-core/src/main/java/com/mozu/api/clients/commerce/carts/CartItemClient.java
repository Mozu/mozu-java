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
	 * Retrieves a particular cart item by providing the cart item ID.
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
	 * Retrieves a particular cart item by providing the cart item ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=GetCartItemClient( cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Retrieves a list of cart items including the total number of items in the cart.
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
	 * Retrieves a list of cart items including the total number of items in the cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItemCollection> mozuClient=GetCartItemsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItemCollection cartItemCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Adds a product to the current shopper's cart.
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
	 * Adds a product to the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=AddItemToCartClient( cartItem,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Update the quantity of an individual cart item in the cart of the current shopper.
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
	 * Update the quantity of an individual cart item in the cart of the current shopper.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemQuantityClient( cartItemId,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Update the product or product quantity of an item in the current shopper's cart.
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
	 * Update the product or product quantity of an item in the current shopper's cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartItem> mozuClient=UpdateCartItemClient( cartItem,  cartItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartItem cartItem = client.Result();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Removes all items in the current shopper's active cart.
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
	 * Deletes a specific cart item by providing the cart item ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCartItemClient( cartItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCartItemClient(String cartItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.CartItemUrl.deleteCartItemUrl(cartItemId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



