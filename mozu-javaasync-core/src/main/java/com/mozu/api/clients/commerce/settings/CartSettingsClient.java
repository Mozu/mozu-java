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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CartSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=GetCartSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> getCartSettingsClient() throws Exception
	{
		return getCartSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=GetCartSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> getCartSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.CartSettingsUrl.getCartSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CartSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=CreateCartSettingsClient( cartSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @param cartSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> createCartSettingsClient(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings) throws Exception
	{
		return createCartSettingsClient( cartSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=CreateCartSettingsClient( cartSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param cartSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> createCartSettingsClient(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.CartSettingsUrl.createCartSettingsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CartSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartSettings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=UpdateCartSettingsClient( cartSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @param cartSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> updateCartSettingsClient(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings) throws Exception
	{
		return updateCartSettingsClient( cartSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient=UpdateCartSettingsClient( cartSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CartSettings cartSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param cartSettings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CartSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> updateCartSettingsClient(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.CartSettingsUrl.updateCartSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CartSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(cartSettings);
		return mozuClient;

	}

}



