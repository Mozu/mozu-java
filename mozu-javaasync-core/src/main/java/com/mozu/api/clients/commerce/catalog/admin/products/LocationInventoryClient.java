/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Location Inventory resource to manage the levels of active product inventory to maintain across defined locations at the product level.
 * </summary>
 */
public class LocationInventoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getLocationInventoriesClient(dataViewMode,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param productCode 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.LocationInventoryUrl.getLocationInventoriesUrl(filter, pageSize, productCode, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  productCode,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode User-defined code that identifies the location.
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode) throws Exception
	{
		return getLocationInventoryClient(dataViewMode,  productCode,  locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  productCode,  locationCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode User-defined code that identifies the location.
	 * @param productCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.LocationInventoryUrl.getLocationInventoryUrl(locationCode, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.LocationInventory.class;
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.LocationInventory>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @param locationInventoryList Array list of the location inventory definitions associated with the product code specified in the request. For each location, you must define the locationCode value and the stockOnHand value. All other properties in the array are system-supplied and read only.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode) throws Exception
	{
		return addLocationInventoryClient(dataViewMode,  locationInventoryList,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  productCode,  performUpserts);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param performUpserts The performUpserts query string parameter lets the service perform an update if the record already exists instead of throwing an already exists conflict exception. PerformUpserts=true means it updates if the record already exists. By default, no value specified means that the service assumes PerformUpserts=false.
	 * @param productCode 
	 * @param locationInventoryList Array list of the location inventory definitions associated with the product code specified in the request. For each location, you must define the locationCode value and the stockOnHand value. All other properties in the array are system-supplied and read only.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, Boolean performUpserts) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.LocationInventoryUrl.addLocationInventoryUrl(performUpserts, productCode);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationInventoryList);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=UpdateLocationInventoryClient(dataViewMode,  locationInventoryAdjustments,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param productCode The product code of the product for which to update active stock on hand inventory at a specified location.
	 * @param locationInventoryAdjustments Properties of the inventory adjustments to perform for the specified location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> updateLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.LocationInventoryUrl.updateLocationInventoryUrl(productCode);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationInventoryAdjustments);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteLocationInventoryClient(dataViewMode,  productCode,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param locationCode The code that identifies the location for which to delete product inventory.
	 * @param productCode The product code for which to delete a location's inventory.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.LocationInventoryUrl.deleteLocationInventoryUrl(locationCode, productCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



