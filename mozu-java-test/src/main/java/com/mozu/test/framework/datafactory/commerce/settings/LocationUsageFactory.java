/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.settings;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.settings.LocationUsageResource;

/** <summary>
 * Use the Location Usages resource to define the locations and location types that interact with the specified site. The system creates three default location usage types for each site after provisioning a new tenant - one for direct ship (DS), one for in-store pickup (SP), and one for store finder (storeFinder). Each site can only use a single location for the direct ship location usage type, and the location must support the direct ship fulfillment type (DS). For the in-store pickup location usage type, each site can use one or more location types. The location service identifies all locations of the specified type that support the in-store pickup fulfillment type (SP). For the store finder location usage type, each site can use one or more location types. The location service identifies all locations of the type. Locations configured for the store finder type do not typically maintain inventory. You cannot create additional location usage types at this time.
 * </summary>
 */
public class LocationUsageFactory
{

	public static com.mozu.api.contracts.location.LocationUsageCollection getLocationUsages(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getLocationUsages(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationUsageCollection getLocationUsages(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationUsageCollection returnObj = new com.mozu.api.contracts.location.LocationUsageCollection();
		LocationUsageResource resource = new LocationUsageResource(apiContext);
		try
		{
			returnObj = resource.getLocationUsages( responseFields);
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

	public static com.mozu.api.contracts.location.LocationUsage getLocationUsage(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getLocationUsage(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationUsage getLocationUsage(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationUsage returnObj = new com.mozu.api.contracts.location.LocationUsage();
		LocationUsageResource resource = new LocationUsageResource(apiContext);
		try
		{
			returnObj = resource.getLocationUsage( code,  responseFields);
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

	public static com.mozu.api.contracts.location.LocationUsage updateLocationUsage(ApiContext apiContext, com.mozu.api.contracts.location.LocationUsage usage, String code, int expectedCode) throws Exception
	{
		return updateLocationUsage(apiContext,  usage,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.location.LocationUsage updateLocationUsage(ApiContext apiContext, com.mozu.api.contracts.location.LocationUsage usage, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.location.LocationUsage returnObj = new com.mozu.api.contracts.location.LocationUsage();
		LocationUsageResource resource = new LocationUsageResource(apiContext);
		try
		{
			returnObj = resource.updateLocationUsage( usage,  code,  responseFields);
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



