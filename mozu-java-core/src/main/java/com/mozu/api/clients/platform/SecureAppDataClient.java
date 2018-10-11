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
 * Manage Secure App Settings. Expose via arc.js so that arc apps can securely access secrets. Third-party extensions can also access their data. Secured via AppKey.AppId
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
	 * @param dbEntryQuery The database entry string to create.
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
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * MozuClient mozuClient=CreateDBValueClient( value,  appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient 
	 * @see JObject
	 */
	public static MozuClient createDBValueClient(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.createDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateDBValueClient( value,  appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient 
	 * @see JObject
	 */
	public static MozuClient updateDBValueClient(com.fasterxml.jackson.databind.JsonNode value, String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.updateDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(value);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDBValueClient( appKeyId,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param appKeyId 
	 * @param dbEntryQuery The database entry string to create.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDBValueClient(String appKeyId, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SecureAppDataUrl.deleteDBValueUrl(appKeyId, dbEntryQuery);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



