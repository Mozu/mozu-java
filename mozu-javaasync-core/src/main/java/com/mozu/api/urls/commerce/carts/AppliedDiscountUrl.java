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

public class AppliedDiscountUrl
{

	/**
	 * Get Resource Url for ApplyCoupon
	 * @param cartId Identifier of the cart to delete.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl applyCouponUrl(String cartId, String couponCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}/coupons/{couponCode}?responseFields={responseFields}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("couponCode", couponCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveCoupons
	 * @param cartId Identifier of the cart to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeCouponsUrl(String cartId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}/coupons");
		formatter.formatUrl("cartId", cartId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveCoupon
	 * @param cartId Identifier of the cart to delete.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeCouponUrl(String cartId, String couponCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}/coupons/{couponcode}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("couponCode", couponCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

