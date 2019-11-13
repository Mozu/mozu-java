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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Return Shipments subresource to manage shipments for a return replacement.
 * </summary>
 */
public class ShipmentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient=GetShipmentClient( returnId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Shipment shipment = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> getShipmentClient(String returnId, String shipmentId) throws Exception
	{
		return getShipmentClient( returnId,  shipmentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient=GetShipmentClient( returnId,  shipmentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Shipment shipment = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> getShipmentClient(String returnId, String shipmentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.getShipmentUrl(responseFields, returnId, shipmentId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Shipment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient=CreatePackageShipmentsClient( packageIds,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param packageIds List of unique identifiers for each package associated with this shipment. Not all packages must belong to the same shipment.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> createPackageShipmentsClient(List<String> packageIds, String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.createPackageShipmentsUrl(returnId);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.fulfillment.Package>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(packageIds);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteShipmentClient( returnId,  shipmentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteShipmentClient(String returnId, String shipmentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.ShipmentUrl.deleteShipmentUrl(returnId, shipmentId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



