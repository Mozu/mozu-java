/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.storefront;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.ShippingResource;

/** <summary>
 * Use the Storefront Shipping resource to retrieve shipping rate information from the website.
 * </summary>
 */
public class ShippingFactory
{

	public static List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup> getMultiRates(ApiContext apiContext, List<com.mozu.api.contracts.shippingruntime.RateRequestGroup> rateRequestGroupList, int expectedCode) throws Exception
	{
		return getMultiRates(apiContext,  rateRequestGroupList,  null, expectedCode);
	}

	public static List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup> getMultiRates(ApiContext apiContext, List<com.mozu.api.contracts.shippingruntime.RateRequestGroup> rateRequestGroupList, Boolean includeRawResponse, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup> returnObj = new ArrayList<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>();
		ShippingResource resource = new ShippingResource(apiContext);
		try
		{
			returnObj = resource.getMultiRates( rateRequestGroupList,  includeRawResponse);
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

	public static com.mozu.api.contracts.shippingruntime.RatesResponse getRates(ApiContext apiContext, com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, int expectedCode) throws Exception
	{
		return getRates(apiContext,  rateRequest,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingruntime.RatesResponse getRates(ApiContext apiContext, com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, Boolean includeRawResponse, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingruntime.RatesResponse returnObj = new com.mozu.api.contracts.shippingruntime.RatesResponse();
		ShippingResource resource = new ShippingResource(apiContext);
		try
		{
			returnObj = resource.getRates( rateRequest,  includeRawResponse,  responseFields);
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



