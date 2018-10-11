/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

import com.mozu.api.ApiContext;
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
 * Use the Locations resource to manage each physical location associated with a tenant. Locations enable tenants to associate a physical address with product inventory, provide a store finder for in-store pickup, or both. Locations that support inventory can use both direct ship and in-store pickup fulfillment types.
 * </summary>
 */
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.getLocations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations() throws Exception
	{
		return getLocations( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocations( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public CountDownLatch getLocationsAsync( AsyncCallback<com.mozu.api.contracts.location.LocationCollection> callback) throws Exception
	{
		return getLocationsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.getLocations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocations( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public CountDownLatch getLocationsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.location.LocationCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.getLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode) throws Exception
	{
		return getLocation( locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocation( locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch getLocationAsync(String locationCode, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return getLocationAsync( locationCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.getLocation( locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.getLocation( locationCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch getLocationAsync(String locationCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.addLocation( location);
	 * </code></pre></p>
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location) throws Exception
	{
		return addLocation( location,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.addLocation( location, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch addLocationAsync(com.mozu.api.contracts.location.Location location, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return addLocationAsync( location,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.addLocation( location,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.addLocation( location,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch addLocationAsync(com.mozu.api.contracts.location.Location location, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.updateLocation( location,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode) throws Exception
	{
		return updateLocation( location,  locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.updateLocation( location,  locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch updateLocationAsync(com.mozu.api.contracts.location.Location location, String locationCode, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		return updateLocationAsync( location,  locationCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.updateLocation( location,  locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	CountDownLatch latch = location.updateLocation( location,  locationCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param location Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public CountDownLatch updateLocationAsync(com.mozu.api.contracts.location.Location location, String locationCode, String responseFields, AsyncCallback<com.mozu.api.contracts.location.Location> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	location.deleteLocation( locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @return 
	 */
	public void deleteLocation(String locationCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationClient.deleteLocationClient( locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



