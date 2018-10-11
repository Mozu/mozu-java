/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.wishlists;

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
 * Use the Wish List Items subresource to manage items in a shopper wish list. The same product can be defined as an item in any number of wish lists for the customer account. Use the Wish Lists resource to manage shopper wish lists.
 * </summary>
 */
public class WishlistItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=GetWishlistItemClient( wishlistId,  wishlistItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> getWishlistItemClient(String wishlistId, String wishlistItemId) throws Exception
	{
		return getWishlistItemClient( wishlistId,  wishlistItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=GetWishlistItemClient( wishlistId,  wishlistItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> getWishlistItemClient(String wishlistId, String wishlistItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.getWishlistItemUrl(responseFields, wishlistId, wishlistItemId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsClient( wishlistId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsClient(String wishlistId) throws Exception
	{
		return getWishlistItemsClient( wishlistId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsClient( wishlistId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsClient(String wishlistId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.getWishlistItemsUrl(filter, pageSize, responseFields, sortBy, startIndex, wishlistId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsByWishlistNameClient( customerAccountId,  wishlistName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsByWishlistNameClient(Integer customerAccountId, String wishlistName) throws Exception
	{
		return getWishlistItemsByWishlistNameClient( customerAccountId,  wishlistName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsByWishlistNameClient( customerAccountId,  wishlistName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsByWishlistNameClient(Integer customerAccountId, String wishlistName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.getWishlistItemsByWishlistNameUrl(customerAccountId, filter, pageSize, responseFields, sortBy, startIndex, wishlistName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=AddItemToWishlistClient( wishlistItem,  wishlistId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> addItemToWishlistClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId) throws Exception
	{
		return addItemToWishlistClient( wishlistItem,  wishlistId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=AddItemToWishlistClient( wishlistItem,  wishlistId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> addItemToWishlistClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.addItemToWishlistUrl(responseFields, wishlistId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlistItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemQuantityClient( wishlistId,  wishlistItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemQuantityClient(String wishlistId, String wishlistItemId, Integer quantity) throws Exception
	{
		return updateWishlistItemQuantityClient( wishlistId,  wishlistItemId,  quantity,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemQuantityClient( wishlistId,  wishlistItemId,  quantity,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemQuantityClient(String wishlistId, String wishlistItemId, Integer quantity, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.updateWishlistItemQuantityUrl(quantity, responseFields, wishlistId, wishlistItemId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId) throws Exception
	{
		return updateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @param wishlistItem Properties of an item in a shopper wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.updateWishlistItemUrl(responseFields, wishlistId, wishlistItemId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlistItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=RemoveAllWishlistItemsClient( wishlistId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> removeAllWishlistItemsClient(String wishlistId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.removeAllWishlistItemsUrl(wishlistId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.Wishlist.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteWishlistItemClient( wishlistId,  wishlistItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteWishlistItemClient(String wishlistId, String wishlistItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.deleteWishlistItemUrl(wishlistId, wishlistItemId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



