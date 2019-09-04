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
 * Use this resource to manage authentication tickets for your developer account.
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
	 * @param userAuthInfo The user authentication information required to generate the developer account user authentication ticket, which consists of a user name and password.
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
	 * @param responseFields 
	 * @param userAuthInfo The user authentication information required to generate the developer account user authentication ticket, which consists of a user name and password.
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
	 * @param existingAuthTicket Properties of the authentication ticket to refresh. The refresh token is required to complete this request.
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
	 * @param responseFields 
	 * @param existingAuthTicket Properties of the authentication ticket to refresh. The refresh token is required to complete this request.
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
	 * MozuClient<java.io.InputStream> mozuClient=DeleteUserAuthTicketClient( refreshToken);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param refreshToken Refresh token string associated with the developer account authentication ticket.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteUserAuthTicketClient(String refreshToken) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(refreshToken);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



