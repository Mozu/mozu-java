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
import com.mozu.api.resources.commerce.orders.FulfillmentActionResource;

/** <summary>
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, int expectedCode) throws Exception
	{
		return performFulfillmentAction(apiContext,  action,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		FulfillmentActionResource resource = new FulfillmentActionResource(apiContext);
		try
		{
			returnObj = resource.performFulfillmentAction( action,  orderId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, int expectedCode) throws Exception
	{
		return resendPackageFulfillmentEmail(apiContext,  action,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.Order returnObj = new com.mozu.api.contracts.commerceruntime.orders.Order();
		FulfillmentActionResource resource = new FulfillmentActionResource(apiContext);
		try
		{
			returnObj = resource.resendPackageFulfillmentEmail( action,  orderId,  responseFields);
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


