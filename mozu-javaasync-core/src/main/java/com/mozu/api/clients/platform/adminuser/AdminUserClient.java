/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.adminuser;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Accounts resource displays the user accounts and account details associated with a developer or  tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetUsersClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getUsersClient() throws Exception
	{
		return getUsersClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetUsersClient( emailAddress,  startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param emailAddress 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getUsersClient(String emailAddress, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUsersUrl(emailAddress, filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection> mozuClient=GetUserRolesClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UserRoleCollection userRoleCollection = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.UserRoleCollection>
	 * @see com.mozu.api.contracts.adminuser.UserRoleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection> getUserRolesClient(String userId) throws Exception
	{
		return getUserRolesClient( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection> mozuClient=GetUserRolesClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UserRoleCollection userRoleCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.UserRoleCollection>
	 * @see com.mozu.api.contracts.adminuser.UserRoleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection> getUserRolesClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUserRolesUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.adminuser.UserRoleCollection.class;
		MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.adminuser.UserRoleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient=GetTenantScopesForUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantCollection tenantCollection = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.TenantCollection>
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.TenantCollection> getTenantScopesForUserClient(String userId) throws Exception
	{
		return getTenantScopesForUserClient( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient=GetTenantScopesForUserClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantCollection tenantCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.TenantCollection>
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.TenantCollection> getTenantScopesForUserClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getTenantScopesForUserUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.tenant.TenantCollection.class;
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient = (MozuClient<com.mozu.api.contracts.tenant.TenantCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserByIdClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserByIdClient(String userId) throws Exception
	{
		return getUserByIdClient( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserByIdClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserByIdClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUserByIdUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = (MozuClient<com.mozu.api.contracts.core.User>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId) throws Exception
	{
		return getUserClient( userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUserUrl(responseFields, userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = (MozuClient<com.mozu.api.contracts.core.User>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=CreateUserClient( user);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param user 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> createUserClient(com.mozu.api.contracts.core.User user) throws Exception
	{
		return createUserClient( user,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=CreateUserClient( user,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param user 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> createUserClient(com.mozu.api.contracts.core.User user, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.createUserUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = (MozuClient<com.mozu.api.contracts.core.User>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(user);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ChangePasswordClient( passwordInfo,  userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @param passwordInfo 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.adminuser.PasswordInfo
	 */
	public static MozuClient<java.io.InputStream> changePasswordClient(com.mozu.api.contracts.adminuser.PasswordInfo passwordInfo, String userId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.changePasswordUrl(userId);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(passwordInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ChangeUserPasswordClient( changeUserPasswordInfo,  userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @param changeUserPasswordInfo 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.adminuser.ChangeUserPasswordInfo
	 */
	public static MozuClient<java.io.InputStream> changeUserPasswordClient(com.mozu.api.contracts.adminuser.ChangeUserPasswordInfo changeUserPasswordInfo, String userId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.changeUserPasswordUrl(userId);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(changeUserPasswordInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddUserRoleClient( userId,  roleId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param roleId 
	 * @param userId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> addUserRoleClient(String userId, Integer roleId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.addUserRoleUrl(roleId, userId);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ResetPasswordClient( resetPasswordInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param resetPasswordInfo 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.adminuser.ResetPasswordInfo
	 */
	public static MozuClient<java.io.InputStream> resetPasswordClient(com.mozu.api.contracts.adminuser.ResetPasswordInfo resetPasswordInfo) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.resetPasswordUrl();
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(resetPasswordInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=UpdateUserClient( user,  userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @param user 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> updateUserClient(com.mozu.api.contracts.core.User user, String userId) throws Exception
	{
		return updateUserClient( user,  userId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=UpdateUserClient( user,  userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId 
	 * @param user 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> updateUserClient(com.mozu.api.contracts.core.User user, String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.updateUserUrl(responseFields, userId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = (MozuClient<com.mozu.api.contracts.core.User>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(user);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteUserClient(String userId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.deleteUserUrl(userId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=RemoveUserRoleClient( userId,  roleId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param roleId 
	 * @param userId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> removeUserRoleClient(String userId, Integer roleId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.removeUserRoleUrl(roleId, userId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



