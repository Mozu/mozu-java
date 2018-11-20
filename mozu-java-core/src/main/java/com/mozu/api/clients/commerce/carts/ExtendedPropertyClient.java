/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.carts;

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
public class ExtendedPropertyClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=GetExtendedPropertiesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> getExtendedPropertiesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.getExtendedPropertiesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> addExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.addExtendedPropertiesUrl();
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperties);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key 
	 * @param extendedProperty 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key) throws Exception
	{
		return updateExtendedPropertyClient( extendedProperty,  key,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key,  upsert,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key 
	 * @param responseFields 
	 * @param upsert 
	 * @param extendedProperty 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key, Boolean upsert, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.updateExtendedPropertyUrl(key, responseFields, upsert);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperty);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		return updateExtendedPropertiesClient( extendedProperties,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  upsert);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param upsert 
	 * @param extendedProperties 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, Boolean upsert) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.updateExtendedPropertiesUrl(upsert);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extendedProperties);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertiesClient( keys);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param keys 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteExtendedPropertiesClient(List<String> keys) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.deleteExtendedPropertiesUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(keys);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertyClient( key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param key 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtendedPropertyClient(String key) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.carts.ExtendedPropertyUrl.deleteExtendedPropertyUrl(key);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



