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
import com.mozu.api.resources.commerce.orders.PickupResource;

/** <summary>
 * Use the Pickups resource to organize items submitted in an order into pickups that enable the shopper to fulfill the order items using the in-store pickup method.
 * </summary>
 */
public class PickupFactory
{

	public static List<String> getAvailablePickupFulfillmentActions(ApiContext apiContext, String orderId, String pickupId, int expectedCode) throws Exception
	{
		List<String> returnObj = new ArrayList<String>();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.getAvailablePickupFulfillmentActions( orderId,  pickupId);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(ApiContext apiContext, String orderId, String pickupId, int expectedCode) throws Exception
	{
		return getPickup(apiContext,  orderId,  pickupId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup getPickup(ApiContext apiContext, String orderId, String pickupId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.getPickup( orderId,  pickupId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, int expectedCode) throws Exception
	{
		return createPickup(apiContext,  pickup,  orderId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup createPickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.createPickup( pickup,  orderId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, int expectedCode) throws Exception
	{
		return updatePickup(apiContext,  pickup,  orderId,  pickupId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.Pickup updatePickup(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.Pickup returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.Pickup();
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.updatePickup( pickup,  orderId,  pickupId,  responseFields);
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

	public static java.io.InputStream deletePickup(ApiContext apiContext, String orderId, String pickupId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		PickupResource resource = new PickupResource(apiContext);
		try
		{
			returnObj = resource.deletePickup( orderId,  pickupId);
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



