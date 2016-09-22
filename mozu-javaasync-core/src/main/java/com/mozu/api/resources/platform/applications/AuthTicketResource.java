/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.applications;

import com.mozu.api.ApiContext;
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
 * Use the Authetickets for applications resource to manage authentication tickets for your apps.
 * </summary>
 */
public class AuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AuthTicketResource() 
		{
			_apiContext = null;
	}
public AuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.authenticateApp( appAuthInfo);
	 * </code></pre></p>
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public com.mozu.api.contracts.appdev.AuthTicket authenticateApp(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo) throws Exception
	{
		return authenticateApp( appAuthInfo,  null);
	}

	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	CountDownLatch latch = authticket.authenticateApp( appAuthInfo, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public CountDownLatch authenticateAppAsync(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, AsyncCallback<com.mozu.api.contracts.appdev.AuthTicket> callback) throws Exception
	{
		return authenticateAppAsync( appAuthInfo,  null, callback);
	}

	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.authenticateApp( appAuthInfo,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public com.mozu.api.contracts.appdev.AuthTicket authenticateApp(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.authenticateAppClient( appAuthInfo,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	CountDownLatch latch = authticket.authenticateApp( appAuthInfo,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param appAuthInfo The information required to authenticate third party applications against the Mozu API.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public CountDownLatch authenticateAppAsync(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, String responseFields, AsyncCallback<com.mozu.api.contracts.appdev.AuthTicket> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.authenticateAppClient( appAuthInfo,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.refreshAppAuthTicket( authTicketRequest);
	 * </code></pre></p>
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest) throws Exception
	{
		return refreshAppAuthTicket( authTicketRequest,  null);
	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	CountDownLatch latch = authticket.refreshAppAuthTicket( authTicketRequest, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public CountDownLatch refreshAppAuthTicketAsync(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, AsyncCallback<com.mozu.api.contracts.appdev.AuthTicket> callback) throws Exception
	{
		return refreshAppAuthTicketAsync( authTicketRequest,  null, callback);
	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.refreshAppAuthTicket( authTicketRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.refreshAppAuthTicketClient( authTicketRequest,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	CountDownLatch latch = authticket.refreshAppAuthTicket( authTicketRequest,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param authTicketRequest Properties of the authentication ticket refresh requests, which includes the refresh token string.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public CountDownLatch refreshAppAuthTicketAsync(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, String responseFields, AsyncCallback<com.mozu.api.contracts.appdev.AuthTicket> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.refreshAppAuthTicketClient( authTicketRequest,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes an authentication for an application based on the specified refresh token.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	authticket.deleteAppAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return 
	 */
	public void deleteAppAuthTicket(String refreshToken) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.applications.AuthTicketClient.deleteAppAuthTicketClient( refreshToken);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



