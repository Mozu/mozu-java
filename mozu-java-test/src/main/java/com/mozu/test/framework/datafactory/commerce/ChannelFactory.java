/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.ChannelResource;

/** <summary>
 * Use the Channels resource to manage the channels a company uses to create logical commercial business divisions based on region or types of sales, such as "US Online," "Amazon," or "EMEA Retail." All orders include a channel association that enables the company to perform financial reporting for each defined channel. Because channels are managed at the tenant level, you must associate all the tenant's sites with a channel. Sites that do not have a defined channel association cannot successfully submit orders.
 * </summary>
 */
public class ChannelFactory
{

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getChannels(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.ChannelCollection returnObj = new com.mozu.api.contracts.commerceruntime.channels.ChannelCollection();
		ChannelResource resource = new ChannelResource(apiContext);
		try
		{
			returnObj = resource.getChannels( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.Channel getChannel(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getChannel(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.Channel getChannel(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.Channel returnObj = new com.mozu.api.contracts.commerceruntime.channels.Channel();
		ChannelResource resource = new ChannelResource(apiContext);
		try
		{
			returnObj = resource.getChannel( code,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.Channel createChannel(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.Channel channel, int expectedCode) throws Exception
	{
		return createChannel(apiContext,  channel,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.Channel createChannel(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.Channel channel, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.Channel returnObj = new com.mozu.api.contracts.commerceruntime.channels.Channel();
		ChannelResource resource = new ChannelResource(apiContext);
		try
		{
			returnObj = resource.createChannel( channel,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.channels.Channel updateChannel(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, int expectedCode) throws Exception
	{
		return updateChannel(apiContext,  channel,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.channels.Channel updateChannel(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.channels.Channel returnObj = new com.mozu.api.contracts.commerceruntime.channels.Channel();
		ChannelResource resource = new ChannelResource(apiContext);
		try
		{
			returnObj = resource.updateChannel( channel,  code,  responseFields);
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

	public static void deleteChannel(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		ChannelResource resource = new ChannelResource(apiContext);
		try
		{
			resource.deleteChannel( code);
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



