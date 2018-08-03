/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class LocationInventoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  locationCode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		return getLocationInventoryClient(dataViewMode,  locationCode,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> mozuClient=GetLocationInventoryClient(dataViewMode,  locationCode,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> getLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.getLocationInventoryUrl(locationCode, productCode, responseFields);
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
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param locationCode 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String locationCode) throws Exception
	{
		return getLocationInventoriesClient(dataViewMode,  locationCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> mozuClient=GetLocationInventoriesClient(dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter,  filterFunctions,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param filterFunctions Functions that optimize commonly used filters for efficiency.For the  operation, you have access to the  filter function. For example, use  to filter only for product inventory that is currently active.
	 * @param locationCode 
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> getLocationInventoriesClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String filterFunctions, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.getLocationInventoriesUrl(filter, filterFunctions, locationCode, pageSize, responseFields, sortBy, startIndex);
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
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode) throws Exception
	{
		return addLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=AddLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param performUpserts Query string parameter lets the service perform an update for a new or existing record. When run, the update occurs without throwing a conflict exception that the record exists. If true, the updates completes regardless of the record currently existing. By default, if no value is specified, the service assumes this value is false.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> addLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.addLocationInventoryUrl(locationCode, performUpserts);
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
	 * MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> mozuClient=UpdateLocationInventoryClient(dataViewMode,  locationInventoryAdjustments,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventory locationInventory = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments Properties of an adjustment to the active product inventory of a specific location.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.LocationInventory>>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> updateLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.updateLocationInventoryUrl(locationCode);
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
	 * MozuClient mozuClient=DeleteLocationInventoryClient(dataViewMode,  locationCode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationInventoryClient(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.LocationInventoryUrl.deleteLocationInventoryUrl(locationCode, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



