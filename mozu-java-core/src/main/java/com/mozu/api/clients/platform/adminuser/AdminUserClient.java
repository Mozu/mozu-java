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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Displays the user accounts and account details associated with a developer or Mozu tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserClient {
	
	/**
	 * Retrieves the details of the specified administrator user account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId Unique identifier of the administrator account to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getUserUrl(userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the Mozu tenants or development stores for which the specified user has an assigned role.
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
		MozuUrl url = com.mozu.api.urls.platform.adminuser.AdminUserUrl.getTenantScopesForUserUrl(userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.tenant.TenantCollection.class;
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



