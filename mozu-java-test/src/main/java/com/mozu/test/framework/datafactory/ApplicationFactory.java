/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.settings.ApplicationResource;

/** <summary>
 * Use the Applications resource to update site-specific settings for installed applications.
 * </summary>
 */
public class ApplicationFactory
{

	public static com.mozu.api.contracts.sitesettings.application.Application thirdPartyGetApplication(ApiContext apiContext, int expectedCode) throws Exception
	{
		return thirdPartyGetApplication(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.application.Application thirdPartyGetApplication(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.application.Application returnObj = new com.mozu.api.contracts.sitesettings.application.Application();
		ApplicationResource resource = new ApplicationResource(apiContext);
		try
		{
			returnObj = resource.thirdPartyGetApplication( responseFields);
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

	public static com.mozu.api.contracts.sitesettings.application.Application thirdPartyUpdateApplication(ApiContext apiContext, com.mozu.api.contracts.sitesettings.application.Application application, int expectedCode) throws Exception
	{
		return thirdPartyUpdateApplication(apiContext,  application,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.application.Application thirdPartyUpdateApplication(ApiContext apiContext, com.mozu.api.contracts.sitesettings.application.Application application, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.application.Application returnObj = new com.mozu.api.contracts.sitesettings.application.Application();
		ApplicationResource resource = new ApplicationResource(apiContext);
		try
		{
			returnObj = resource.thirdPartyUpdateApplication( application,  responseFields);
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



