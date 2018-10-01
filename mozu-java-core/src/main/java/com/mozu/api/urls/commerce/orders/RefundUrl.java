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

public class RefundUrl
{

	/**
	 * Get Resource Url for CreateRefund
	 * @param orderId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createRefundUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/refunds?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResendRefundEmail
	 * @param orderId 
	 * @param refundId 
	 * @return   String Resource Url
	 */
	public static MozuUrl resendRefundEmailUrl(String orderId, String refundId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/refunds/{refundId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("refundId", refundId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

