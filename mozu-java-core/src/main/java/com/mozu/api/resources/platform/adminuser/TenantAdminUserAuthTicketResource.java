/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.adminuser;

import com.mozu.api.ApiContext;
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
 * Use the Admin User authentication tickets resource to generate and refresh authentication tickets that enable  administrator or developer account users to access development or production tenants.
 * </summary>
 */
public class TenantAdminUserAuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TenantAdminUserAuthTicketResource() 
		{
			_apiContext = null;
	}
public TenantAdminUserAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.createUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicket( userAuthInfo,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.createUserAuthTicket( userAuthInfo,  tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.createUserAuthTicketClient( userAuthInfo,  tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.refreshAuthTicket( existingAuthTicket);
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the  API.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshAuthTicket( existingAuthTicket,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.refreshAuthTicket( existingAuthTicket,  tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the  API.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.refreshAuthTicketClient( existingAuthTicket,  tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	Stream stream = tenantadminuserauthticket.deleteUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.deleteUserAuthTicketClient( refreshToken);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



