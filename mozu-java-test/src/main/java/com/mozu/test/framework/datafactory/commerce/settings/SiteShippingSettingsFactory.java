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
import com.mozu.api.resources.commerce.settings.SiteShippingSettingsResource;

/** <summary>
 * Use the shipping subresource to manage settings for the site shipping information, such as origin address information, carrier shipping methods, shipping rate providers, and regions available for shipping.
 * </summary>
 */
public class SiteShippingSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSiteShippingSettings(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings returnObj = new com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings();
		SiteShippingSettingsResource resource = new SiteShippingSettingsResource(apiContext);
		try
		{
			returnObj = resource.getSiteShippingSettings( responseFields);
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



