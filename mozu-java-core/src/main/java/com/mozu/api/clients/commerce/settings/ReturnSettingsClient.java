/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings;

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
public class ReturnSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=GetReturnSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> getReturnSettingsClient() throws Exception
	{
		return getReturnSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=GetReturnSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> getReturnSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ReturnSettingsUrl.getReturnSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.return.ReturnSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=CreateReturnSettingsClient( returnSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @param returnSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> createReturnSettingsClient(com.mozu.api.contracts.sitesettings.order.return.ReturnSettings returnSettings) throws Exception
	{
		return createReturnSettingsClient( returnSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=CreateReturnSettingsClient( returnSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> createReturnSettingsClient(com.mozu.api.contracts.sitesettings.order.return.ReturnSettings returnSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ReturnSettingsUrl.createReturnSettingsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.return.ReturnSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(returnSettings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=UpdateReturnSettingsClient( returnSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @param returnSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> updateReturnSettingsClient(com.mozu.api.contracts.sitesettings.order.return.ReturnSettings returnSettings) throws Exception
	{
		return updateReturnSettingsClient( returnSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient=UpdateReturnSettingsClient( returnSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnSettings returnSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.return.ReturnSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> updateReturnSettingsClient(com.mozu.api.contracts.sitesettings.order.return.ReturnSettings returnSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ReturnSettingsUrl.updateReturnSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.return.ReturnSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.return.ReturnSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(returnSettings);
		return mozuClient;

	}

}



