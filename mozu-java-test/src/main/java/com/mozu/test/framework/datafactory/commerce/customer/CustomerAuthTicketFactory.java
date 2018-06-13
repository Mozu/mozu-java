/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.customer;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.CustomerAuthTicketResource;

/** <summary>
 * Use the Customer Authentication Tickets resource to generate and refresh authentication tickets for customer accounts.
 * </summary>
 */
public class CustomerAuthTicketFactory
{

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createAnonymousShopperAuthTicket(ApiContext apiContext, int expectedCode) throws Exception
	{
		return createAnonymousShopperAuthTicket(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createAnonymousShopperAuthTicket(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAuthTicket returnObj = new com.mozu.api.contracts.customer.CustomerAuthTicket();
		CustomerAuthTicketResource resource = new CustomerAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.createAnonymousShopperAuthTicket( responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, int expectedCode) throws Exception
	{
		return createUserAuthTicket(apiContext,  userAuthInfo,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAuthTicket returnObj = new com.mozu.api.contracts.customer.CustomerAuthTicket();
		CustomerAuthTicketResource resource = new CustomerAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.createUserAuthTicket( userAuthInfo,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode) throws Exception
	{
		return refreshUserAuthTicket(apiContext,  refreshToken,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(ApiContext apiContext, String refreshToken, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerAuthTicket returnObj = new com.mozu.api.contracts.customer.CustomerAuthTicket();
		CustomerAuthTicketResource resource = new CustomerAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.refreshUserAuthTicket( refreshToken,  responseFields);
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


