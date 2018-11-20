/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.LocationResource;

/** <summary>
 * Use the Location resource to retrieve details about a location from a Mozu hosted storefront.
 * </summary>
 */
public class LocationFactory
{

	public static com.mozu.api.contracts.location.Location getLocation(ApiContext apiContext, String locationCode, int expectedCode) throws Exception
	{
		return getLocation(apiContext,  locationCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location getLocation(ApiContext apiContext, String locationCode, Boolean includeAttributeDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocation( locationCode,  includeAttributeDefinition,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(ApiContext apiContext, String locationUsageType, int expectedCode) throws Exception
	{
		return getLocationsInUsageType(apiContext,  locationUsageType,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationCollection getLocationsInUsageType(ApiContext apiContext, String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributeDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationCollection returnObj = new com.mozu.api.contracts.location.LocationCollection();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocationsInUsageType( locationUsageType,  startIndex,  pageSize,  sortBy,  filter,  includeAttributeDefinition,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.location.Location getDirectShipLocation(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getDirectShipLocation(apiContext,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location getDirectShipLocation(ApiContext apiContext, Boolean includeAttributeDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getDirectShipLocation( includeAttributeDefinition,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.location.Location getInStorePickupLocation(ApiContext apiContext, String locationCode, int expectedCode) throws Exception
	{
		return getInStorePickupLocation(apiContext,  locationCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location getInStorePickupLocation(ApiContext apiContext, String locationCode, Boolean includeAttributeDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getInStorePickupLocation( locationCode,  includeAttributeDefinition,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getInStorePickupLocations(apiContext,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationCollection getInStorePickupLocations(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeAttributeDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationCollection returnObj = new com.mozu.api.contracts.location.LocationCollection();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getInStorePickupLocations( startIndex,  pageSize,  sortBy,  filter,  includeAttributeDefinition,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



