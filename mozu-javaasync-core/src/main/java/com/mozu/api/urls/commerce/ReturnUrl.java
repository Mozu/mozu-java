/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ReturnUrl
{

	/**
	 * Get Resource Url for GetReturns
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnsUrl(String filter, Integer pageSize, String q, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableReturnActions
	 * @param returnId Unique identifier of the return for which to retrieve available actions.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableReturnActionsUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/actions");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturnItem
	 * @param responseFields 
	 * @param returnId 
	 * @param returnItemId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnItemUrl(String responseFields, String returnId, String returnItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items/{returnItemId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("returnItemId", returnItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturnItems
	 * @param responseFields 
	 * @param returnId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnItemsUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePaymentActionsForReturn
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePaymentActionsForReturnUrl(String paymentId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayment
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentUrl(String paymentId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}?responseFields={responseFields}");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayments
	 * @param responseFields 
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentsUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturn
	 * @param responseFields 
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReasons
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getReasonsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/reasons?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturn
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturnItem
	 * @param responseFields 
	 * @param returnId 
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnItemUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/items?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformPaymentActionForReturn
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl performPaymentActionForReturnUrl(String paymentId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions?responseFields={responseFields}");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePaymentActionForReturn
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPaymentActionForReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/actions?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RestockReturnItems
	 * @param responseFields 
	 * @param returnId 
	 * @return   String Resource Url
	 */
	public static MozuUrl restockReturnItemsUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/restock?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturnShippingOrder
	 * @param responseFields 
	 * @param returnId 
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnShippingOrderUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/ship?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformReturnActions
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl performReturnActionsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/actions?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateReturn
	 * @param responseFields 
	 * @param returnId Unique identifier of the return.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateReturnUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResendReturnEmail
	 * @return   String Resource Url
	 */
	public static MozuUrl resendReturnEmailUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/email/resend");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteOrderItem
	 * @param returnId 
	 * @param returnItemId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteOrderItemUrl(String returnId, String returnItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{orderId}/items/{orderItemId}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("returnId", returnId);
		formatter.formatUrl("returnItemId", returnItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteReturn
	 * @param returnId Unique identifier of the return to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

