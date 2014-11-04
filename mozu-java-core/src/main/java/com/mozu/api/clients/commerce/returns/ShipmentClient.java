/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.returns;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Return Shipments subresource to manage shipments for a return replacement.
 * </summary>
 */
public class ShipmentClient {
	
	/**
	 * Retrieves the details of the specified return replacement shipment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient=GetShipmentClient( returnId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Shipment shipment = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return associated with the replacement shipment to retrieve.
	 * @param shipmentId Unique identifier of the return replacement shipment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> getShipmentClient(String returnId, String shipmentId) throws Exception
	{
		return getShipmentClient( returnId,  shipmentId,  null);
	}

	/**
	 * Retrieves the details of the specified return replacement shipment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient=GetShipmentClient( returnId,  shipmentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Shipment shipment = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the replacement shipment to retrieve.
	 * @param shipmentId Unique identifier of the return replacement shipment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> getShipmentClient(String returnId, String shipmentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.getShipmentUrl(responseFields, returnId, shipmentId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Shipment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a shipment from one or more packages associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient=CreatePackageShipmentsClient( packageIds,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to create replacement package shipments.
	 * @param packageIds List of packages in the return replacement shipment.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> createPackageShipmentsClient(List<String> packageIds, String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.createPackageShipmentsUrl(returnId);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Package>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(packageIds);
		return mozuClient;

	}

	/**
	 * Deletes a shipment for a return replacement.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteShipmentClient( returnId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return associated with the replacement shipment to delete.
	 * @param shipmentId Unique identifier of the return replacement shipment to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteShipmentClient(String returnId, String shipmentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.deleteShipmentUrl(returnId, shipmentId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



