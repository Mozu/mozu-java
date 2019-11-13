/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.adminuser;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AdminUserUrl
{

	/**
	 * Get Resource Url for GetUsers
	 * @param emailAddress 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getUsersUrl(String emailAddress, String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/?emailAddress={emailAddress}&startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("emailAddress", emailAddress);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUserRoles
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserRolesUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/roles?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetTenantScopesForUser
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTenantScopesForUserUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/tenants?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUserById
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserByIdUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/userbyid?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUser
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for CreateUser
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createUserUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for ChangePassword
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl changePasswordUrl(String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/Change-Password");
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for ChangeUserPassword
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl changeUserPasswordUrl(String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/Change-User-Password");
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for AddUserRole
	 * @param roleId 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl addUserRoleUrl(Integer roleId, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/roles/{roleId}");
		formatter.formatUrl("roleId", roleId);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for ResetPassword
	 * @return   String Resource Url
	 */
	public static MozuUrl resetPasswordUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/Reset-Password");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for UpdateUser
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateUserUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeleteUser
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteUserUrl(String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}");
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for RemoveUserRole
	 * @param roleId 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl removeUserRoleUrl(Integer roleId, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/adminuser/accounts/{userId}/roles/{roleId}");
		formatter.formatUrl("roleId", roleId);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

