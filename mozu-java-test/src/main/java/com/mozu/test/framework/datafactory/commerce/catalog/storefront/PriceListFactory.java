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
import com.mozu.api.resources.commerce.catalog.storefront.PriceListResource;

/** <summary>
 * Retrieves the details of a price list. The details may contain a hierarchy of ancestor and/or descendant price lists dependening on your configuration.
 * </summary>
 */
public class PriceListFactory
{

	public static com.mozu.api.contracts.productruntime.PriceList getPriceList(ApiContext apiContext, String priceListCode, int expectedCode) throws Exception
	{
		return getPriceList(apiContext,  priceListCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.PriceList getPriceList(ApiContext apiContext, String priceListCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.PriceList returnObj = new com.mozu.api.contracts.productruntime.PriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.getPriceList( priceListCode,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getResolvedPriceList(apiContext,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList(ApiContext apiContext, Integer customerAccountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ResolvedPriceList returnObj = new com.mozu.api.contracts.productruntime.ResolvedPriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.getResolvedPriceList( customerAccountId,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList2(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode customerAccountObject, int expectedCode) throws Exception
	{
		return getResolvedPriceList2(apiContext,  customerAccountObject,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList2(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode customerAccountObject, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ResolvedPriceList returnObj = new com.mozu.api.contracts.productruntime.ResolvedPriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.getResolvedPriceList2( customerAccountObject,  responseFields);
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



