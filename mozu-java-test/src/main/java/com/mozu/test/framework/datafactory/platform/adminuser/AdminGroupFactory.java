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
import com.mozu.api.resources.platform.adminuser.AdminGroupResource;

/** <summary>
 * 
 * </summary>
 */
public class AdminGroupFactory
{

	public static com.mozu.api.contracts.adminuser.AdminGroupCollection getAdminGroups(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAdminGroups(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.AdminGroupCollection getAdminGroups(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.AdminGroupCollection returnObj = new com.mozu.api.contracts.adminuser.AdminGroupCollection();
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.getAdminGroups( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.adminuser.AdminGroup getAdminGroup(ApiContext apiContext, String groupCode, int expectedCode) throws Exception
	{
		return getAdminGroup(apiContext,  groupCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.AdminGroup getAdminGroup(ApiContext apiContext, String groupCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.AdminGroup returnObj = new com.mozu.api.contracts.adminuser.AdminGroup();
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.getAdminGroup( groupCode,  responseFields);
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

	public static com.mozu.api.contracts.adminuser.AdminGroup addAdminGroup(ApiContext apiContext, com.mozu.api.contracts.adminuser.AdminGroup adminGroup, int expectedCode) throws Exception
	{
		return addAdminGroup(apiContext,  adminGroup,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.AdminGroup addAdminGroup(ApiContext apiContext, com.mozu.api.contracts.adminuser.AdminGroup adminGroup, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.AdminGroup returnObj = new com.mozu.api.contracts.adminuser.AdminGroup();
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.addAdminGroup( adminGroup,  responseFields);
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

	public static com.mozu.api.contracts.adminuser.AdminGroup addUsers(ApiContext apiContext, List<String> userIds, String groupCode, int expectedCode) throws Exception
	{
		return addUsers(apiContext,  userIds,  groupCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.AdminGroup addUsers(ApiContext apiContext, List<String> userIds, String groupCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.AdminGroup returnObj = new com.mozu.api.contracts.adminuser.AdminGroup();
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.addUsers( userIds,  groupCode,  responseFields);
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

	public static java.io.InputStream removeUsers(ApiContext apiContext, List<String> userIds, String groupCode, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.removeUsers( userIds,  groupCode);
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

	public static com.mozu.api.contracts.adminuser.AdminGroup updateAdminGroup(ApiContext apiContext, com.mozu.api.contracts.adminuser.AdminGroup adminGroup, String groupCode, int expectedCode) throws Exception
	{
		return updateAdminGroup(apiContext,  adminGroup,  groupCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.adminuser.AdminGroup updateAdminGroup(ApiContext apiContext, com.mozu.api.contracts.adminuser.AdminGroup adminGroup, String groupCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.AdminGroup returnObj = new com.mozu.api.contracts.adminuser.AdminGroup();
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.updateAdminGroup( adminGroup,  groupCode,  responseFields);
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

	public static java.io.InputStream deleteAdminGroup(ApiContext apiContext, String groupCode, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AdminGroupResource resource = new AdminGroupResource(apiContext);
		try
		{
			returnObj = resource.deleteAdminGroup( groupCode);
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



