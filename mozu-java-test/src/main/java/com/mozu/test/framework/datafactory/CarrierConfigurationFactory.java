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
import com.mozu.api.resources.commerce.shipping.admin.CarrierConfigurationResource;

/** <summary>
 * Carrier Configuration for managing credentials and some settings for the various carriers installed with the default mozu application
 * </summary>
 */
public class CarrierConfigurationFactory
{

	public static com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection getConfigurations(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getConfigurations(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection getConfigurations(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection returnObj = new com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection();
		CarrierConfigurationResource resource = new CarrierConfigurationResource(apiContext);
		try
		{
			returnObj = resource.getConfigurations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration getConfiguration(ApiContext apiContext, String carrierId, int expectedCode) throws Exception
	{
		return getConfiguration(apiContext,  carrierId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration getConfiguration(ApiContext apiContext, String carrierId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.CarrierConfiguration returnObj = new com.mozu.api.contracts.shippingadmin.CarrierConfiguration();
		CarrierConfigurationResource resource = new CarrierConfigurationResource(apiContext);
		try
		{
			returnObj = resource.getConfiguration( carrierId,  responseFields);
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

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration createConfiguration(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, int expectedCode) throws Exception
	{
		return createConfiguration(apiContext,  carrierConfiguration,  carrierId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration createConfiguration(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.CarrierConfiguration returnObj = new com.mozu.api.contracts.shippingadmin.CarrierConfiguration();
		CarrierConfigurationResource resource = new CarrierConfigurationResource(apiContext);
		try
		{
			returnObj = resource.createConfiguration( carrierConfiguration,  carrierId,  responseFields);
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

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration updateConfiguration(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, int expectedCode) throws Exception
	{
		return updateConfiguration(apiContext,  carrierConfiguration,  carrierId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.CarrierConfiguration updateConfiguration(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.CarrierConfiguration returnObj = new com.mozu.api.contracts.shippingadmin.CarrierConfiguration();
		CarrierConfigurationResource resource = new CarrierConfigurationResource(apiContext);
		try
		{
			returnObj = resource.updateConfiguration( carrierConfiguration,  carrierId,  responseFields);
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

	public static void deleteConfiguration(ApiContext apiContext, String carrierId, int expectedCode) throws Exception
	{
		CarrierConfigurationResource resource = new CarrierConfigurationResource(apiContext);
		try
		{
			resource.deleteConfiguration( carrierId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



