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

public class DigitalPackageUrl
{

	/**
	 * Get Resource Url for GetAvailableDigitalPackageFulfillmentActions
	 * @param digitalPackageId This parameter supplies package ID to get fulfillment actions for the digital package.
	 * @param orderId This parameter provides the unique identifier of the order on which to get a list of available actions.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableDigitalPackageFulfillmentActionsUrl(String digitalPackageId, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalpackages/{digitalPackageId}/actions");
		formatter.formatUrl("digitalPackageId", digitalPackageId);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDigitalPackage
	 * @param digitalPackageId This parameter provides the digital package Id.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDigitalPackageUrl(String digitalPackageId, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalpackages/{digitalPackageId}?responseFields={responseFields}");
		formatter.formatUrl("digitalPackageId", digitalPackageId);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDigitalPackage
	 * @param orderId The orderID is a required paramter for the digitalpackages operation. The orderId is a unique identifier of the order with which to associate the digital package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createDigitalPackageUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalpackages?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDigitalPackage
	 * @param digitalPackageId This parameter specifies the digital package to update in the order.
	 * @param orderId This parameter provides the unique identifier of the order with which to associate the digital package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDigitalPackageUrl(String digitalPackageId, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalpackages/{digitalPackageId}?responseFields={responseFields}");
		formatter.formatUrl("digitalPackageId", digitalPackageId);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDigitalPackage
	 * @param digitalPackageId The digitalPackage ID is unique package ID to update on the order.
	 * @param orderId The orderId is unique identifier of the order with which to associate the package.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDigitalPackageUrl(String digitalPackageId, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalpackages/{digitalPackageId}");
		formatter.formatUrl("digitalPackageId", digitalPackageId);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

