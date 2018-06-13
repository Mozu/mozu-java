/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.checkouts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AppliedDiscountUrl
{

	/**
	 * Get Resource Url for ApplyCoupon
	 * @param checkoutId The unique identifier of the checkout.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl applyCouponUrl(String checkoutId, String couponCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/coupons/{couponCode}?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("couponCode", couponCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveCoupons
	 * @param checkoutId The unique identifier of the checkout.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeCouponsUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/coupons");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RemoveCoupon
	 * @param checkoutId The unique identifier of the checkout.
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @return   String Resource Url
	 */
	public static MozuUrl removeCouponUrl(String checkoutId, String couponCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/coupons/{couponcode}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("couponCode", couponCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
