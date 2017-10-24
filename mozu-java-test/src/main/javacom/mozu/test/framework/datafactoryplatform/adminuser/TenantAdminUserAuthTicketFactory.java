/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactoryplatform.adminuser;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.adminuser.TenantAdminUserAuthTicketResource;

/** <summary>
 * Use the Admin User authentication tickets resource to generate and refresh authentication tickets that enable  administrator or developer account users to access development or production tenants.
 * </summary>
 */
public class TenantAdminUserAuthTicketFactory
{

	public static com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, int expectedCode) throws Exception
	{
		return createUserAuthTicket(apiContext,  userAuthInfo,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket returnObj = new com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket();
		TenantAdminUserAuthTicketResource resource = new TenantAdminUserAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.createUserAuthTicket( userAuthInfo,  tenantId,  responseFields);
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

	public static com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(ApiContext apiContext, com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, int expectedCode) throws Exception
	{
		return refreshAuthTicket(apiContext,  existingAuthTicket,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(ApiContext apiContext, com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket returnObj = new com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket();
		TenantAdminUserAuthTicketResource resource = new TenantAdminUserAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.refreshAuthTicket( existingAuthTicket,  tenantId,  responseFields);
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

	public static void deleteUserAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode) throws Exception
	{
		TenantAdminUserAuthTicketResource resource = new TenantAdminUserAuthTicketResource(apiContext);
		try
		{
			resource.deleteUserAuthTicket( refreshToken);
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


