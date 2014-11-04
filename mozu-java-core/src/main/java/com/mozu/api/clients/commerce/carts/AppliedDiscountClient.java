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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Cart Coupons resource to apply a coupon to a defined cart or remove a coupon from a cart. When the shopper proceeds to checkout, the coupons applied to the cart apply to the order.
 * </summary>
 */
public class AppliedDiscountClient {
	
	/**
	 * Applies a defined coupon to the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=ApplyCouponClient( cartId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart to which to apply the coupon.
	 * @param couponCode Code associated with the coupon to apply to the cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> applyCouponClient(String cartId, String couponCode) throws Exception
	{
		return applyCouponClient( cartId,  couponCode,  null);
	}

	/**
	 * Applies a defined coupon to the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=ApplyCouponClient( cartId,  couponCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart to which to apply the coupon.
	 * @param couponCode Code associated with the coupon to apply to the cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> applyCouponClient(String cartId, String couponCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.applyCouponUrl(cartId, couponCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes one or more applied coupons from the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveCouponsClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeCouponsClient(String cartId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.removeCouponsUrl(cartId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes an applied coupon from the cart specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient=RemoveCouponClient( cartId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Cart cart = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.carts.Cart>
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> removeCouponClient(String cartId, String couponCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.AppliedDiscountUrl.removeCouponUrl(cartId, couponCode);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.carts.Cart.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



