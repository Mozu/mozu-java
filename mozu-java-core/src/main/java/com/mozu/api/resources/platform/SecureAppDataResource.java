/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

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
public class SecureAppDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SecureAppDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	JObject json = secureappdata.getDBValue( appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getDBValue(String appKeyId, String dbEntryQuery) throws Exception
	{
		return getDBValue( appKeyId,  dbEntryQuery,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	JObject json = secureappdata.getDBValue( appKeyId,  dbEntryQuery,  responseFields);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param responseFields 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getDBValue(String appKeyId, String dbEntryQuery, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.SecureAppDataClient.getDBValueClient( appKeyId,  dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	Stream stream = secureappdata.createDBValue( value,  appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param value 
	 * @return Stream
	 * @see Stream
	 * @see JObject
	 */
	public java.io.InputStream createDBValue(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SecureAppDataClient.createDBValueClient( value,  appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	Stream stream = secureappdata.updateDBValue( value,  appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param value 
	 * @return Stream
	 * @see Stream
	 * @see JObject
	 */
	public java.io.InputStream updateDBValue(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SecureAppDataClient.updateDBValueClient( value,  appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SecureAppData secureappdata = new SecureAppData();
	 *	Stream stream = secureappdata.deleteDBValue( appKeyId,  dbEntryQuery);
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteDBValue(String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SecureAppDataClient.deleteDBValueClient( appKeyId,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



