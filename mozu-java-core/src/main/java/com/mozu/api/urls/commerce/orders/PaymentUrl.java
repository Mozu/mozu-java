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

public class PaymentUrl
{

	/**
	 * Get Resource Url for GetPayments
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentsUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePaymentActions
	 * @param orderId Unique identifier of the order associated with the payment.
	 * @param paymentId Unique identifer of the payment for which to retrieve available actions.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePaymentActionsUrl(String orderId, String paymentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayment
	 * @param orderId Unique identifier of the order associated with the payment transaction.
	 * @param paymentId Unique identifier of the payment transaction submitted for the order.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentUrl(String orderId, String paymentId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformPaymentAction
	 * @param orderId Unique identifier of the order associated with the payment.
	 * @param paymentId Unique identifer of the payment for which to perform the action.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl performPaymentActionUrl(String orderId, String paymentId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePaymentAction
	 * @param orderId Unique identifier of the order for which to apply the payment.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createPaymentActionUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/actions?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AutoCapturePayments
	 * @param forceCapture 
	 * @param orderId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl autoCapturePaymentsUrl(Boolean forceCapture, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/autocapture?forcecapture={forceCapture}&responseFields={responseFields}");
		formatter.formatUrl("forceCapture", forceCapture);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

