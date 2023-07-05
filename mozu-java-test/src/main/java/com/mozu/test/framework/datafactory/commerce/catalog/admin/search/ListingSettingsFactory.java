/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin.search;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.search.ListingSettingsResource;

/** <summary>
 * 
 * </summary>
 */
public class ListingSettingsFactory
{

	public static com.mozu.api.contracts.productadmin.ListingSettings getListingSettings(ApiContext apiContext, String name, int expectedCode) throws Exception
	{
		return getListingSettings(apiContext,  name,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ListingSettings getListingSettings(ApiContext apiContext, String name, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ListingSettings returnObj = new com.mozu.api.contracts.productadmin.ListingSettings();
		ListingSettingsResource resource = new ListingSettingsResource(apiContext);
		try
		{
			returnObj = resource.getListingSettings( name,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ListingSettings updateListingSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.ListingSettings settings, String name, int expectedCode) throws Exception
	{
		return updateListingSettings(apiContext,  settings,  name,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ListingSettings updateListingSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.ListingSettings settings, String name, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ListingSettings returnObj = new com.mozu.api.contracts.productadmin.ListingSettings();
		ListingSettingsResource resource = new ListingSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateListingSettings( settings,  name,  responseFields);
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

	public static java.io.InputStream deleteListingSettings(ApiContext apiContext, String name, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		ListingSettingsResource resource = new ListingSettingsResource(apiContext);
		try
		{
			returnObj = resource.deleteListingSettings( name);
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


