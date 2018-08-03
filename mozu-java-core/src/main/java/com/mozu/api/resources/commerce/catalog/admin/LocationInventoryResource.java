/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class LocationInventoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public LocationInventoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public LocationInventoryResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String locationCode, String productCode) throws Exception
	{
		return getLocationInventory( locationCode,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( locationCode,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String locationCode, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoryClient(_dataViewMode,  locationCode,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( locationCode);
	 * </code></pre></p>
	 * @param locationCode 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String locationCode) throws Exception
	{
		return getLocationInventories( locationCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( locationCode,  startIndex,  pageSize,  sortBy,  filter,  filterFunctions,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param filterFunctions Functions that optimize commonly used filters for efficiency.For the  operation, you have access to the  filter function. For example, use  to filter only for product inventory that is currently active.
	 * @param locationCode 
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String filterFunctions, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoriesClient(_dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter,  filterFunctions,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode) throws Exception
	{
		return addLocationInventory( locationInventoryList,  locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  locationCode,  performUpserts);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param performUpserts Query string parameter lets the service perform an update for a new or existing record. When run, the update occurs without throwing a conflict exception that the record exists. If true, the updates completes regardless of the record currently existing. By default, if no value is specified, the service assumes this value is false.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.addLocationInventoryClient(_dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.updateLocationInventory( locationInventoryAdjustments,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments Properties of an adjustment to the active product inventory of a specific location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.updateLocationInventoryClient(_dataViewMode,  locationInventoryAdjustments,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	locationinventory.deleteLocationInventory( locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteLocationInventory(String locationCode, String productCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.deleteLocationInventoryClient(_dataViewMode,  locationCode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



