/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.carts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CartItemUrl
{

	/**
	 * Get Resource Url for GetCartItem
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartItemUrl(String cartItemId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items/{cartItemId}?responseFields={responseFields}");
		formatter.formatUrl("cartItemId", cartItemId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCartItems
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartItemsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddItemToCart
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addItemToCartUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCartItemQuantity
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCartItemQuantityUrl(String cartItemId, Integer quantity, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items/{cartItemId}/{quantity}?responseFields={responseFields}");
		formatter.formatUrl("cartItemId", cartItemId);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCartItem
	 * @param cartItemId Identifier of the cart item to delete.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCartItemUrl(String cartItemId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items/{cartItemId}?responseFields={responseFields}");
		formatter.formatUrl("cartItemId", cartItemId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveAllCartItems
	 * @return   String Resource Url
	 */
	public static MozuUrl removeAllCartItemsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCartItem
	 * @param cartItemId Identifier of the cart item to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCartItemUrl(String cartItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current/items/{cartItemId}");
		formatter.formatUrl("cartItemId", cartItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

