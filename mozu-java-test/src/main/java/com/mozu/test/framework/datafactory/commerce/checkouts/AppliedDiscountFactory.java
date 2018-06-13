/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.checkouts;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.checkouts.AppliedDiscountResource;

/** <summary>
 * Use this resource to manage discounts on the Checkouts resource.
 * </summary>
 */
public class AppliedDiscountFactory
{

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout applyCoupon(ApiContext apiContext, String checkoutId, String couponCode, int expectedCode) throws Exception
	{
		return applyCoupon(apiContext,  checkoutId,  couponCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout applyCoupon(ApiContext apiContext, String checkoutId, String couponCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.applyCoupon( checkoutId,  couponCode,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout removeCoupons(ApiContext apiContext, String checkoutId, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupons( checkoutId);
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

	public static com.mozu.api.contracts.commerceruntime.checkouts.Checkout removeCoupon(ApiContext apiContext, String checkoutId, String couponCode, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.checkouts.Checkout returnObj = new com.mozu.api.contracts.commerceruntime.checkouts.Checkout();
		AppliedDiscountResource resource = new AppliedDiscountResource(apiContext);
		try
		{
			returnObj = resource.removeCoupon( checkoutId,  couponCode);
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


