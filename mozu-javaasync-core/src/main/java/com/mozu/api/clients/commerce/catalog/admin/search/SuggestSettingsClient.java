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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * 
 * </summary>
 */
public class SuggestSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings> mozuClient=GetProductSuggestSettingsClient(dataViewMode,  name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SuggestSettings suggestSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SuggestSettings>
	 * @see com.mozu.api.contracts.productadmin.SuggestSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings> getProductSuggestSettingsClient(com.mozu.api.DataViewMode dataViewMode, String name) throws Exception
	{
		return getProductSuggestSettingsClient(dataViewMode,  name,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings> mozuClient=GetProductSuggestSettingsClient(dataViewMode,  name,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SuggestSettings suggestSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SuggestSettings>
	 * @see com.mozu.api.contracts.productadmin.SuggestSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings> getProductSuggestSettingsClient(com.mozu.api.DataViewMode dataViewMode, String name, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SuggestSettingsUrl.getProductSuggestSettingsUrl(name, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SuggestSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SuggestSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings> mozuClient=UpdateProductSuggestSettingsClient(dataViewMode,  settings,  name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSuggestSettings productSuggestSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSuggestSettings>
	 * @see com.mozu.api.contracts.productadmin.ProductSuggestSettings
	 * @see com.mozu.api.contracts.productadmin.ProductSuggestSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings> updateProductSuggestSettingsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSuggestSettings settings, String name) throws Exception
	{
		return updateProductSuggestSettingsClient(dataViewMode,  settings,  name,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings> mozuClient=UpdateProductSuggestSettingsClient(dataViewMode,  settings,  name,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSuggestSettings productSuggestSettings = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @param responseFields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSuggestSettings>
	 * @see com.mozu.api.contracts.productadmin.ProductSuggestSettings
	 * @see com.mozu.api.contracts.productadmin.ProductSuggestSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings> updateProductSuggestSettingsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSuggestSettings settings, String name, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SuggestSettingsUrl.updateProductSuggestSettingsUrl(name, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductSuggestSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductSuggestSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteProductSuggestSettingsClient(dataViewMode,  name);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param name 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteProductSuggestSettingsClient(com.mozu.api.DataViewMode dataViewMode, String name) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.search.SuggestSettingsUrl.deleteProductSuggestSettingsUrl(name);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



