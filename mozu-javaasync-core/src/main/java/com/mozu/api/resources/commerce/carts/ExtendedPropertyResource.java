/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
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
public class ExtendedPropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ExtendedPropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.getExtendedPropertiesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.getExtendedProperties( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch getExtendedPropertiesAsync( AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.getExtendedPropertiesClient();
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties);
	 * </code></pre></p>
	 * @param extendedProperties The details of the new extended property.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.addExtendedProperties( extendedProperties, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties The details of the new extended property.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch addExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  key);
	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key) throws Exception
	{
		return updateExtendedProperty( extendedProperty,  key,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperty( extendedProperty,  key, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertyAsync(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key, AsyncCallback<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> callback) throws Exception
	{
		return updateExtendedPropertyAsync( extendedProperty,  key,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  key,  upsert,  responseFields);
	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key, Boolean upsert, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  key,  upsert,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperty( extendedProperty,  key,  upsert,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param key Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperty The details of the updated extended property.
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertyAsync(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String key, Boolean upsert, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  key,  upsert,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties);
	 * </code></pre></p>
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties) throws Exception
	{
		return updateExtendedProperties( extendedProperties,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperties( extendedProperties, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		return updateExtendedPropertiesAsync( extendedProperties,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  upsert);
	 * </code></pre></p>
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, Boolean upsert) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  upsert);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperties( extendedProperties,  upsert, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param upsert Any set of key value pairs to be stored in the extended properties of a cart.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties The details of the updated extended properties.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, Boolean upsert, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  upsert);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	Stream stream = extendedproperty.deleteExtendedProperties( keys);
	 * </code></pre></p>
	 * @param keys 
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream deleteExtendedProperties(List<String> keys) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.deleteExtendedPropertiesClient( keys);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.deleteExtendedProperties( keys, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param keys 
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public CountDownLatch deleteExtendedPropertiesAsync(List<String> keys, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.deleteExtendedPropertiesClient( keys);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	Stream stream = extendedproperty.deleteExtendedProperty( key);
	 * </code></pre></p>
	 * @param key 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteExtendedProperty(String key) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.deleteExtendedPropertyClient( key);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.deleteExtendedProperty( key, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param key 
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch deleteExtendedPropertyAsync(String key, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.carts.ExtendedPropertyClient.deleteExtendedPropertyClient( key);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



