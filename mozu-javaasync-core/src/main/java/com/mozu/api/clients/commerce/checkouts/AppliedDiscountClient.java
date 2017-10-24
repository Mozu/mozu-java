/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.checkouts;

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
public class AppliedDiscountClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ApplyCouponClient( checkoutId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> applyCouponClient(String checkoutId, String couponCode) throws Exception
	{
		return applyCouponClient( checkoutId,  couponCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ApplyCouponClient( checkoutId,  couponCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> applyCouponClient(String checkoutId, String couponCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.AppliedDiscountUrl.applyCouponUrl(checkoutId, couponCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=RemoveCouponsClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> removeCouponsClient(String checkoutId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.AppliedDiscountUrl.removeCouponsUrl(checkoutId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=RemoveCouponClient( checkoutId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> removeCouponClient(String checkoutId, String couponCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.checkouts.AppliedDiscountUrl.removeCouponUrl(checkoutId, couponCode);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


