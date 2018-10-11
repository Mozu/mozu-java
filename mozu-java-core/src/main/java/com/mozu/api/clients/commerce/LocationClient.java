/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Location resource to retrieve details about a location from a  hosted storefront.
 * </summary>
 */
public class LocationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String locationCode) throws Exception
	{
		return getLocationClient( locationCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( locationCode,  includeAttributeDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param includeAttributeDefinition True if you want to include the custom attribute defintion for the location.
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String locationCode, Boolean includeAttributeDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationUrl(includeAttributeDefinition, locationCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType) throws Exception
	{
		return getLocationsInUsageTypeClient( locationUsageType,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType,  startIndex,  pageSize,  sortBy,  filter,  includeAttributeDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeAttributeDefinition True if you want to include the custom attribute defintion for the location.
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributeDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationsInUsageTypeUrl(filter, includeAttributeDefinition, locationUsageType, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetDirectShipLocationClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getDirectShipLocationClient() throws Exception
	{
		return getDirectShipLocationClient( null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetDirectShipLocationClient( includeAttributeDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param includeAttributeDefinition 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getDirectShipLocationClient(Boolean includeAttributeDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getDirectShipLocationUrl(includeAttributeDefinition, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetInStorePickupLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getInStorePickupLocationClient(String locationCode) throws Exception
	{
		return getInStorePickupLocationClient( locationCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetInStorePickupLocationClient( locationCode,  includeAttributeDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param includeAttributeDefinition True if you want to include the custom attribute definition for the location.
	 * @param locationCode The unique, user-defined code that identifies a location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getInStorePickupLocationClient(String locationCode, Boolean includeAttributeDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationUrl(includeAttributeDefinition, locationCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient() throws Exception
	{
		return getInStorePickupLocationsClient( null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient( startIndex,  pageSize,  sortBy,  filter,  includeAttributeDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeAttributeDefinition True if you want to include the custom attribute definition for the location.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributeDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationsUrl(filter, includeAttributeDefinition, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



