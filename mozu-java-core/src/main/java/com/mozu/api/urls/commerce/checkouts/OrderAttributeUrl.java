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

public class OrderAttributeUrl
{

	/**
	 * Get Resource Url for GetCheckoutAttributes
	 * @param checkoutId The unique identifier of the checkout.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCheckoutAttributesUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/attributes");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateCheckoutAttributes
	 * @param checkoutId The unique identifier of the checkout.
	 * @return   String Resource Url
	 */
	public static MozuUrl createCheckoutAttributesUrl(String checkoutId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/attributes");
		formatter.formatUrl("checkoutId", checkoutId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCheckoutAttribute
	 * @param checkoutId The unique identifier of the checkout.
	 * @param removeMissing If true, the operation removes missing properties so that the updated checkout attributes will not show properties with a null value.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCheckoutAttributeUrl(String checkoutId, Boolean removeMissing)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/attributes?removeMissing={removeMissing}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("removeMissing", removeMissing);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

