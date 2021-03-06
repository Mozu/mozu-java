/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.developer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Authtickets resource to manage authentication tickets for your developer account.
 * </summary>
 */
public class DeveloperAdminUserAuthTicketClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient=CreateDeveloperUserAuthTicketClient( userAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> createDeveloperUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createDeveloperUserAuthTicketClient( userAuthInfo,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient=CreateDeveloperUserAuthTicketClient( userAuthInfo,  developerAccountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> createDeveloperUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer developerAccountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl.createDeveloperUserAuthTicketUrl(developerAccountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(userAuthInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient=RefreshDeveloperAuthTicketClient( existingAuthTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to be used in developer account claims with the  API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> refreshDeveloperAuthTicketClient(com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshDeveloperAuthTicketClient( existingAuthTicket,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient=RefreshDeveloperAuthTicketClient( existingAuthTicket,  developerAccountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param developerAccountId Unique identifier of the developer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param existingAuthTicket Properties of the authentication ticket to be used in developer account claims with the  API.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> refreshDeveloperAuthTicketClient(com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket, Integer developerAccountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl.refreshDeveloperAuthTicketUrl(developerAccountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket> mozuClient = (MozuClient<com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(existingAuthTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteUserAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteUserAuthTicketClient(String refreshToken) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(refreshToken);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



