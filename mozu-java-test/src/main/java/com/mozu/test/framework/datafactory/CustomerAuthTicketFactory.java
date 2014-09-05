/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
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

	public static java.io.InputStream createAnonymousShopperAuthTicket(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		java.io.InputStream returnObj;
		CustomerAuthTicketResource resource = new CustomerAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.createAnonymousShopperAuthTicket();
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, int expectedCode, int successCode) throws Exception
	{
		return createUserAuthTicket(apiContext,  userAuthInfo,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerUserAuthInfo userAuthInfo, String responseFields, int expectedCode, int successCode) throws Exception
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
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode, int successCode) throws Exception
	{
		return refreshUserAuthTicket(apiContext,  refreshToken,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.CustomerAuthTicket refreshUserAuthTicket(ApiContext apiContext, String refreshToken, String responseFields, int expectedCode, int successCode) throws Exception
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
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



