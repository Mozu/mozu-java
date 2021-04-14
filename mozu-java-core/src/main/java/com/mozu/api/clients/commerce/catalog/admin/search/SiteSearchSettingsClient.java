/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.search;

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
public class SiteSearchSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient=GetSiteSearchSettingsClient( name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteSearchSettings siteSearchSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SiteSearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> getSiteSearchSettingsClient(String name) throws Exception
	{
		return getSiteSearchSettingsClient( name,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient=GetSiteSearchSettingsClient( name,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteSearchSettings siteSearchSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SiteSearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> getSiteSearchSettingsClient(String name, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SiteSearchSettingsUrl.getSiteSearchSettingsUrl(name, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SiteSearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient=UpdateSiteSearchSettingsClient( settings,  name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteSearchSettings siteSearchSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SiteSearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> updateSiteSearchSettingsClient(com.mozu.api.contracts.productadmin.SiteSearchSettings settings, String name) throws Exception
	{
		return updateSiteSearchSettingsClient( settings,  name,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient=UpdateSiteSearchSettingsClient( settings,  name,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteSearchSettings siteSearchSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param responseFields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SiteSearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 * @see com.mozu.api.contracts.productadmin.SiteSearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> updateSiteSearchSettingsClient(com.mozu.api.contracts.productadmin.SiteSearchSettings settings, String name, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SiteSearchSettingsUrl.updateSiteSearchSettingsUrl(name, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.SiteSearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SiteSearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteSiteSearchSettingsClient( name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteSiteSearchSettingsClient(String name) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SiteSearchSettingsUrl.deleteSiteSearchSettingsUrl(name);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



