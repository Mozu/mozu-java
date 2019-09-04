/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class OrderAttributeUrl
{

	/**
	 * Get Resource Url for GetOrderAttributes
	 * @param orderId Unique identifier of the order for which to retrieve a list of defined attributes.
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderAttributesUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/attributes");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrderAttributes
	 * @param orderId Unique identifier of the order for which to assign the attributes.
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderAttributesUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/attributes");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderAttributes
	 * @param orderId Identifier of the order for which to update attributes.
	 * @param removeMissing If true, the operation removes missing properties so that the updated order attributes will not show properties with a null value.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderAttributesUrl(String orderId, Boolean removeMissing)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/attributes?removeMissing={removeMissing}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("removeMissing", removeMissing);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

