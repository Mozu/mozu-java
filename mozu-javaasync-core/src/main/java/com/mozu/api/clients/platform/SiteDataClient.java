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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the site data resource to store site-level information required for a third-party application in the Mozu database.
 * </summary>
 */
public class SiteDataClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetDBValueClient( dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getDBValueClient(String dbEntryQuery) throws Exception
	{
		return getDBValueClient( dbEntryQuery,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetDBValueClient( dbEntryQuery,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getDBValueClient(String dbEntryQuery, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.getDBValueUrl(dbEntryQuery, responseFields);
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = (MozuClient<String>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=CreateDBValueClient( value,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient createDBValueClient(String value, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.createDBValueUrl(dbEntryQuery);
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
	 * MozuClient mozuClient=UpdateDBValueClient( value,  dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param value The database value to update.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient updateDBValueClient(String value, String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.updateDBValueUrl(dbEntryQuery);
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
	 * MozuClient mozuClient=DeleteDBValueClient( dbEntryQuery);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDBValueClient(String dbEntryQuery) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.SiteDataUrl.deleteDBValueUrl(dbEntryQuery);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



