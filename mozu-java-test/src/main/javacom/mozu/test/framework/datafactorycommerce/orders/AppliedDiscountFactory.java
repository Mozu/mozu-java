/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactorycommerce.orders;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.orders.AppliedDiscountResource;

/** <summary>
 * Use this subresource to apply coupons to or remove coupons from an order based on a supplied coupon code.
 * </summary>
 */
public class AppliedDiscountFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(ApiContext apiContext, String orderId, String couponCode, int expectedCode) throws Exception
	{
		return applyCoupon(apiContext,  orderId,  couponCode,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(ApiContext apiContext, String orderId, String couponCode, String updateMode, String version, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.applyCoupon( orderId,  couponCode,  updateMode,  version,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(ApiContext apiContext, String orderId, String couponCode, int expectedCode) throws Exception
	{
		return removeCoupon(apiContext,  orderId,  couponCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(ApiContext apiContext, String orderId, String couponCode, String updateMode, String version, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupon( orderId,  couponCode,  updateMode,  version);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return removeCoupons(apiContext,  orderId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(ApiContext apiContext, String orderId, String updateMode, String version, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupons( orderId,  updateMode,  version);
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



