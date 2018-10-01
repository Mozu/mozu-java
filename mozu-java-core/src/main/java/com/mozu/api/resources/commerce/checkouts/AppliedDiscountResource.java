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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class AppliedDiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AppliedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Checkout checkout = applieddiscount.applyCoupon( checkoutId,  couponCode);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout applyCoupon(String checkoutId, String couponCode) throws Exception
	{
		return applyCoupon( checkoutId,  couponCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Checkout checkout = applieddiscount.applyCoupon( checkoutId,  couponCode,  responseFields);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout applyCoupon(String checkoutId, String couponCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.AppliedDiscountClient.applyCouponClient( checkoutId,  couponCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Checkout checkout = applieddiscount.removeCoupons( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout removeCoupons(String checkoutId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.AppliedDiscountClient.removeCouponsClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Checkout checkout = applieddiscount.removeCoupon( checkoutId,  couponCode);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param couponCode 
	 * @return com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public com.mozu.api.contracts.commerceruntime.checkouts.Checkout removeCoupon(String checkoutId, String couponCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> client = com.mozu.api.clients.commerce.checkouts.AppliedDiscountClient.removeCouponClient( checkoutId,  couponCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



