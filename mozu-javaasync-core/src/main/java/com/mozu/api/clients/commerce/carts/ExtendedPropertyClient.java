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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Cart Extended Properties subresource to store an arbitrary number of cart extended properties such as tracking strings, marketing sources, affiliates, sales personnel/data, and so on, on a per cart basis. Each cart may have none, one, or more than one entry in the extended properties collection, and all values in the extended properties collection are represented as strings. When you create an order from a cart, all extended properties are retained from the cart and copied to the order. Refer to the subresource for more information about order extended properties.
 * </summary>
 */
public class ExtendedPropertyClient {
	
	/**
	 * Retrieves a list of cart extended properties specified in the request.
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
	 * Adds one or more specified extended properties to the carts extended properties collection.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=AddExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Updates one or more details of the extended property specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedPropertyClient(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key) throws Exception
	{
		return updateExtendedPropertyClient( extendedProperty,  key,  null,  null);
	}

	/**
	 * Updates one or more details of the extended property specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> mozuClient=UpdateExtendedPropertyClient( extendedProperty,  key,  upsert,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Updates one or more details of the extended properties specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> updateExtendedPropertiesClient(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		return updateExtendedPropertiesClient( extendedProperties,  null);
	}

	/**
	 * Updates one or more details of the extended properties specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> mozuClient=UpdateExtendedPropertiesClient( extendedProperties,  upsert);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ExtendedProperty extendedProperty = client.Result();
	 * </code></pre></p>
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
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
	 * Deletes the extended properties cart extended properties collection.
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
	 * Deletes a specific extended property from the cart extended property collection.
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



