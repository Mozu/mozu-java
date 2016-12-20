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

public class ShipmentUrl
{

	/**
	 * Get Resource Url for GetShipment
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getShipmentUrl(String orderId, String responseFields, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableShipmentMethods
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableShipmentMethodsUrl(Boolean draft, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/methods?draft={draft}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePackageShipments
	 * @param orderId Unique identifier of the order.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPackageShipmentsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteShipment
	 * @param orderId Unique identifier of the order.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteShipmentUrl(String orderId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

