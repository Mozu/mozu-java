/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.orders;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.AdjustmentResource;

/** <summary>
 * Use this subresource to manage ad-hoc order level price adjustments.
 * </summary>
 */
public class AdjustmentFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyHandlingAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, int expectedCode) throws Exception
	{
		return applyHandlingAdjustment(apiContext,  adjustment,  orderId,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyHandlingAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.applyHandlingAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, int expectedCode) throws Exception
	{
		return applyShippingAdjustment(apiContext,  adjustment,  orderId,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.applyShippingAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, int expectedCode) throws Exception
	{
		return applyAdjustment(apiContext,  adjustment,  orderId,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.applyAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeHandlingAdjustment(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return removeHandlingAdjustment(apiContext,  orderId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeHandlingAdjustment(ApiContext apiContext, String orderId, String updateMode, String version, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.removeHandlingAdjustment( orderId,  updateMode,  version);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return removeShippingAdjustment(apiContext,  orderId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(ApiContext apiContext, String orderId, String updateMode, String version, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.removeShippingAdjustment( orderId,  updateMode,  version);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return removeAdjustment(apiContext,  orderId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(ApiContext apiContext, String orderId, String updateMode, String version, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AdjustmentResource resource = new AdjustmentResource(apiContext);
		try
		{
			returnObj = resource.removeAdjustment( orderId,  updateMode,  version);
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


