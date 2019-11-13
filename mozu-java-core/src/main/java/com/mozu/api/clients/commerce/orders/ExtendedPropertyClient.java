/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Use the Extended Properties resource to store tracking strings for your orders. Extended properties can help you track affiliate sources.
 * </summary>
 */
public class ExtendedPropertyClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=GetExtendedPropertiesClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> getExtendedPropertiesClient(String orderId) throws Exception
	{
		return getExtendedPropertiesClient( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=GetExtendedPropertiesClient( orderId,  draft);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> getExtendedPropertiesClient(String orderId, Boolean draft) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.getExtendedPropertiesUrl(draft, orderId);
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
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties The details of the extended property.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> addExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return addExtendedPropertiesClient( extendedProperties,  orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties The details of the extended property.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> addExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.addExtendedPropertiesUrl(orderId, updateMode, version);
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
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  orderId,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperty The details of the updated extended property.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key) throws Exception
	{
		return updateExtendedPropertyClient( extendedProperty,  orderId,  key,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates an extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperty The details of the updated extended property.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, String updateMode, String version, Boolean upsert, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.updateExtendedPropertyUrl(key, orderId, responseFields, updateMode, upsert, version);
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
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties The details of the updated extended properties.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return updateExtendedPropertiesClient( extendedProperties,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version,  upsert);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates the extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties The details of the updated extended properties.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, Boolean upsert) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.updateExtendedPropertiesUrl(orderId, updateMode, upsert, version);
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
	 * MozuClient<java.io.InputStream> mozuClient=DeleteExtendedPropertyClient( orderId,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteExtendedPropertyClient(String orderId, String key) throws Exception
	{
		return deleteExtendedPropertyClient( orderId,  key,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteExtendedPropertyClient( orderId,  key,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteExtendedPropertyClient(String orderId, String key, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.deleteExtendedPropertyUrl(key, orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteExtendedPropertiesClient( keys,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param keys The extended property keys.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see string
	 */
	public static MozuClient<java.io.InputStream> deleteExtendedPropertiesClient(List<String> keys, String orderId) throws Exception
	{
		return deleteExtendedPropertiesClient( keys,  orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteExtendedPropertiesClient( keys,  orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param keys The extended property keys.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see string
	 */
	public static MozuClient<java.io.InputStream> deleteExtendedPropertiesClient(List<String> keys, String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.deleteExtendedPropertiesUrl(orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(keys);
		return mozuClient;

	}

}



