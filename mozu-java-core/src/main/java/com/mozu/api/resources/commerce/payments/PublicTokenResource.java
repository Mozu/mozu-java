/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.payments;

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
 * 
 * </summary>
 */
public class PublicTokenResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublicTokenResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PublicToken publictoken = new PublicToken();
	 *	TokenResponse tokenResponse = publictoken.create( request);
	 * </code></pre></p>
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.TokenResponse
	 * @see com.mozu.api.contracts.paymentservice.response.TokenResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicToken
	 */
	public com.mozu.api.contracts.paymentservice.response.TokenResponse create(com.mozu.api.contracts.paymentservice.PublicToken request) throws Exception
	{
		return create( request,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicToken publictoken = new PublicToken();
	 *	TokenResponse tokenResponse = publictoken.create( request,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.TokenResponse
	 * @see com.mozu.api.contracts.paymentservice.response.TokenResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicToken
	 */
	public com.mozu.api.contracts.paymentservice.response.TokenResponse create(com.mozu.api.contracts.paymentservice.PublicToken request, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.TokenResponse> client = com.mozu.api.clients.commerce.payments.PublicTokenClient.createClient( request,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicToken publictoken = new PublicToken();
	 *	JObject json = publictoken.execute( request,  cardType);
	 * </code></pre></p>
	 * @param cardType 
	 * @param request 
	 * @return JObject
	 * @see JObject
	 * @see com.mozu.api.contracts.paymentservice.request.ExecuteRequest
	 */
	public com.fasterxml.jackson.databind.JsonNode execute(com.mozu.api.contracts.paymentservice.request.ExecuteRequest request, String cardType) throws Exception
	{
		return execute( request,  cardType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicToken publictoken = new PublicToken();
	 *	JObject json = publictoken.execute( request,  cardType,  responseFields);
	 * </code></pre></p>
	 * @param cardType 
	 * @param responseFields 
	 * @param request 
	 * @return JObject
	 * @see JObject
	 * @see com.mozu.api.contracts.paymentservice.request.ExecuteRequest
	 */
	public com.fasterxml.jackson.databind.JsonNode execute(com.mozu.api.contracts.paymentservice.request.ExecuteRequest request, String cardType, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.commerce.payments.PublicTokenClient.executeClient( request,  cardType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



