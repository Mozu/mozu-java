/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.platform.adminuser;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.adminuser.AdminUserResource;

/** <summary>
 * Displays the user accounts and account details associated with a developer or Mozu tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserFactory
{

	public static java.io.InputStream getUsers(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getUsers(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static java.io.InputStream getUsers(ApiContext apiContext, String emailAddress, Integer startIndex, Integer pageSize, String sortBy, String filter, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getUsers( emailAddress,  startIndex,  pageSize,  sortBy,  filter);
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

	public static com.mozu.api.contracts.adminuser.UserRoleCollection getUserRoles(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getUserRoles(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.UserRoleCollection getUserRoles(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.UserRoleCollection returnObj = new com.mozu.api.contracts.adminuser.UserRoleCollection();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getUserRoles( userId,  responseFields);
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

	public static com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getTenantScopesForUser(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.tenant.TenantCollection returnObj = new com.mozu.api.contracts.tenant.TenantCollection();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getTenantScopesForUser( userId,  responseFields);
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

	public static com.mozu.api.contracts.core.User getUserById(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getUserById(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.User getUserById(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.User returnObj = new com.mozu.api.contracts.core.User();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getUserById( userId,  responseFields);
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

	public static com.mozu.api.contracts.core.User getUser(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		return getUser(apiContext,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.User getUser(ApiContext apiContext, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.User returnObj = new com.mozu.api.contracts.core.User();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.getUser( userId,  responseFields);
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

	public static com.mozu.api.contracts.core.User createUser(ApiContext apiContext, com.mozu.api.contracts.core.User user, int expectedCode) throws Exception
	{
		return createUser(apiContext,  user,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.User createUser(ApiContext apiContext, com.mozu.api.contracts.core.User user, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.User returnObj = new com.mozu.api.contracts.core.User();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.createUser( user,  responseFields);
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

	public static java.io.InputStream changePassword(ApiContext apiContext, com.mozu.api.contracts.adminuser.PasswordInfo passwordInfo, String userId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.changePassword( passwordInfo,  userId);
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

	public static java.io.InputStream changeUserPassword(ApiContext apiContext, com.mozu.api.contracts.adminuser.ChangeUserPasswordInfo changeUserPasswordInfo, String userId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.changeUserPassword( changeUserPasswordInfo,  userId);
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

	public static java.io.InputStream addUserRole(ApiContext apiContext, String userId, Integer roleId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.addUserRole( userId,  roleId);
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

	public static com.mozu.api.contracts.core.User updateUser(ApiContext apiContext, com.mozu.api.contracts.core.User user, String userId, int expectedCode) throws Exception
	{
		return updateUser(apiContext,  user,  userId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.User updateUser(ApiContext apiContext, com.mozu.api.contracts.core.User user, String userId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.User returnObj = new com.mozu.api.contracts.core.User();
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.updateUser( user,  userId,  responseFields);
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

	public static java.io.InputStream deleteUser(ApiContext apiContext, String userId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.deleteUser( userId);
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

	public static java.io.InputStream removeUserRole(ApiContext apiContext, String userId, Integer roleId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminUserResource resource = new AdminUserResource(apiContext);
		try
		{
			returnObj = resource.removeUserRole( userId,  roleId);
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



