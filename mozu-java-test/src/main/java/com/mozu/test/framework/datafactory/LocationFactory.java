/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.admin.LocationResource;

/** <summary>
 * Use the Locations resource to manage each physical location associated with a tenant. Locations enable tenants to associate a physical address with product inventory, provide a store finder for in-store pickup, or both. Locations that support inventory can use both direct ship and in-store pickup fulfillment types.
 * </summary>
 */
public class LocationFactory
{

	public static com.mozu.api.contracts.location.LocationCollection getLocations(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getLocations(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationCollection getLocations(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationCollection returnObj = new com.mozu.api.contracts.location.LocationCollection();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.location.Location getLocation(ApiContext apiContext, String locationCode, int expectedCode) throws Exception
	{
		return getLocation(apiContext,  locationCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location getLocation(ApiContext apiContext, String locationCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.getLocation( locationCode,  responseFields);
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

	public static com.mozu.api.contracts.location.Location addLocation(ApiContext apiContext, com.mozu.api.contracts.location.Location location, int expectedCode) throws Exception
	{
		return addLocation(apiContext,  location,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location addLocation(ApiContext apiContext, com.mozu.api.contracts.location.Location location, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.addLocation( location,  responseFields);
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

	public static com.mozu.api.contracts.location.Location updateLocation(ApiContext apiContext, com.mozu.api.contracts.location.Location location, String locationCode, int expectedCode) throws Exception
	{
		return updateLocation(apiContext,  location,  locationCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.Location updateLocation(ApiContext apiContext, com.mozu.api.contracts.location.Location location, String locationCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.Location returnObj = new com.mozu.api.contracts.location.Location();
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			returnObj = resource.updateLocation( location,  locationCode,  responseFields);
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

	public static void deleteLocation(ApiContext apiContext, String locationCode, int expectedCode) throws Exception
	{
		LocationResource resource = new LocationResource(apiContext);
		try
		{
			resource.deleteLocation( locationCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



