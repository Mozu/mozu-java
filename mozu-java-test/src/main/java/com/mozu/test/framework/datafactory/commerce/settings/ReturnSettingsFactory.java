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
import com.mozu.api.resources.commerce.settings.ReturnSettingsResource;

/** <summary>
 * 
 * </summary>
 */
public class ReturnSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings getReturnSettings(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getReturnSettings(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings getReturnSettings(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnObj = new com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings();
		ReturnSettingsResource resource = new ReturnSettingsResource(apiContext);
		try
		{
			returnObj = resource.getReturnSettings( responseFields);
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

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings createReturnSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, int expectedCode) throws Exception
	{
		return createReturnSettings(apiContext,  returnSettings,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings createReturnSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnObj = new com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings();
		ReturnSettingsResource resource = new ReturnSettingsResource(apiContext);
		try
		{
			returnObj = resource.createReturnSettings( returnSettings,  responseFields);
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

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings updateReturnSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, int expectedCode) throws Exception
	{
		return updateReturnSettings(apiContext,  returnSettings,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings updateReturnSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnObj = new com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings();
		ReturnSettingsResource resource = new ReturnSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateReturnSettings( returnSettings,  responseFields);
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



