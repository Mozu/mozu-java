/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.general;

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
 * Use the Custom Routes resource to manage your custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to conventional  resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.To learn more about custom routing, refer to the [Custom Route Settings](../../../gui
 * </summary>
 */
public class CustomRouteSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=GetCustomRouteSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> getCustomRouteSettingsClient() throws Exception
	{
		return getCustomRouteSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=GetCustomRouteSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> getCustomRouteSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.getCustomRouteSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=CreateCustomRouteSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param settings The details of the new custom route setting.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> createCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return createCustomRouteSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=CreateCustomRouteSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param settings The details of the new custom route setting.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> createCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.createCustomRouteSettingsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=UpdateCustomRouteSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param settings The updated details of the custom route settings.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> updateCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return updateCustomRouteSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=UpdateCustomRouteSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param settings The updated details of the custom route settings.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> updateCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.updateCustomRouteSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCustomRouteSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCustomRouteSettingsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.deleteCustomRouteSettingsUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



