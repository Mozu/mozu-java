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
 * Define global site settings such as the site name, shipping and email addresses, and logo images. Block undesirable IP addresses using this resource.
 * </summary>
 */
public class GeneralSettingsClient {
	
	/**
	 * Retrieve a site's general global settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient=GetGeneralSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * GeneralSettings generalSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.GeneralSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> getGeneralSettingsClient() throws Exception
	{
		return getGeneralSettingsClient( null);
	}

	/**
	 * Retrieve a site's general global settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient=GetGeneralSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * GeneralSettings generalSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.GeneralSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> getGeneralSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.GeneralSettingsUrl.getGeneralSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.GeneralSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates a site's general global settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient=UpdateGeneralSettingsClient( generalSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * GeneralSettings generalSettings = client.Result();
	 * </code></pre></p>
	 * @param generalSettings General settings used on the storefront site.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.GeneralSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> updateGeneralSettingsClient(com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings) throws Exception
	{
		return updateGeneralSettingsClient( generalSettings,  null);
	}

	/**
	 * Updates a site's general global settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient=UpdateGeneralSettingsClient( generalSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * GeneralSettings generalSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param generalSettings General settings used on the storefront site.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.GeneralSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> updateGeneralSettingsClient(com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.GeneralSettingsUrl.updateGeneralSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.GeneralSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(generalSettings);
		return mozuClient;

	}

}



