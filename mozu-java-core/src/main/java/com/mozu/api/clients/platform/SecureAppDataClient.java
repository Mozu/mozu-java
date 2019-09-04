/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
public class SecureAppDataClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetDBValueClient( appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getDBValueClient(String appKeyId, String dbEntryQuery) throws Exception
	{
		return getDBValueClient( appKeyId,  dbEntryQuery,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetDBValueClient( appKeyId,  dbEntryQuery,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getDBValueClient(String appKeyId, String dbEntryQuery, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.getDBValueUrl(appKeyId, dbEntryQuery, responseFields);
		String verb = "GET";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=CreateDBValueClient( value,  appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param value 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see JObject
	 */
	public static MozuClient<java.io.InputStream> createDBValueClient(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.createDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=UpdateDBValueClient( value,  appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @param value 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see JObject
	 */
	public static MozuClient<java.io.InputStream> updateDBValueClient(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.updateDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "PUT";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteDBValueClient( appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteDBValueClient(String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.deleteDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



