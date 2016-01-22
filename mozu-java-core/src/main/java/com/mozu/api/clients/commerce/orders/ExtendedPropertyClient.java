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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Extended Properties resource to store tracking strings for your orders. Extended properties can help you track affiliate sources.
 * </summary>
 */
public class ExtendedPropertyClient {
	
	/**
	 * Retrieves the extended property string associated with the order. 
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
	 * Retrieves the extended property string associated with the order. 
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
	 * Create an extended property for the order.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> addExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return addExtendedPropertiesClient( extendedProperties,  orderId,  null,  null);
	}

	/**
	 * Create an extended property for the order.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  orderId,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key) throws Exception
	{
		return updateExtendedPropertyClient( extendedProperty,  orderId,  key,  null,  null,  null,  null);
	}

	/**
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key The extended property key.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates an extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Updates one or more extended properties.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return updateExtendedPropertiesClient( extendedProperties,  orderId,  null,  null,  null);
	}

	/**
	 * Updates one or more extended properties.
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
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Deletes one or more extended properties.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertyClient( orderId,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtendedPropertyClient(String orderId, String key) throws Exception
	{
		return deleteExtendedPropertyClient( orderId,  key,  null,  null);
	}

	/**
	 * Deletes one or more extended properties.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertyClient( orderId,  key,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtendedPropertyClient(String orderId, String key, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.deleteExtendedPropertyUrl(key, orderId, updateMode, version);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the extended property associated with the order. 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertiesClient( keys,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param keys 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteExtendedPropertiesClient(List<String> keys, String orderId) throws Exception
	{
		return deleteExtendedPropertiesClient( keys,  orderId,  null,  null);
	}

	/**
	 * Deletes the extended property associated with the order. 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtendedPropertiesClient( keys,  orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param keys 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteExtendedPropertiesClient(List<String> keys, String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.ExtendedPropertyUrl.deleteExtendedPropertiesUrl(orderId, updateMode, version);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(keys);
		return mozuClient;

	}

}



