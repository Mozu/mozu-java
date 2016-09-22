/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the property types subresource to manage content properties.
 * </summary>
 */
public class PropertyTypeClient {
	
	/**
	 * Retrieves a list of the content property types.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient=GetPropertyTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyTypeCollection propertyTypeCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyTypeCollection>
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> getPropertyTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getPropertyTypesClient(dataViewMode,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the content property types.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient=GetPropertyTypesClient(dataViewMode,  pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyTypeCollection propertyTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyTypeCollection>
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> getPropertyTypesClient(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.getPropertyTypesUrl(pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PropertyTypeCollection.class;
		MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of the content property type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=GetPropertyTypeClient(dataViewMode,  propertyTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyTypeName The name of the property type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> getPropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, String propertyTypeName) throws Exception
	{
		return getPropertyTypeClient(dataViewMode,  propertyTypeName,  null);
	}

	/**
	 * Retrieves the details of the content property type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=GetPropertyTypeClient(dataViewMode,  propertyTypeName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyTypeName The name of the property type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> getPropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, String propertyTypeName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.getPropertyTypeUrl(propertyTypeName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PropertyType.class;
		MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient = (MozuClient<com.mozu.api.contracts.content.PropertyType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=CreatePropertyTypeClient( propertyType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyType Property type available for content. Property types are like templates that can be reused.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> createPropertyTypeClient(com.mozu.api.contracts.content.PropertyType propertyType) throws Exception
	{
		return createPropertyTypeClient( propertyType,  null);
	}

	/**
	 * Creates a new
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=CreatePropertyTypeClient( propertyType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param propertyType Property type available for content. Property types are like templates that can be reused.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> createPropertyTypeClient(com.mozu.api.contracts.content.PropertyType propertyType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.createPropertyTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.PropertyType.class;
		MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient = (MozuClient<com.mozu.api.contracts.content.PropertyType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(propertyType);
		return mozuClient;

	}

	/**
	 * Updates a
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=UpdatePropertyTypeClient(dataViewMode,  propertyType,  propertyTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyTypeName The name of the property type.
	 * @param propertyType Property type available for content. Property types are like templates that can be reused.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> updatePropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.PropertyType propertyType, String propertyTypeName) throws Exception
	{
		return updatePropertyTypeClient(dataViewMode,  propertyType,  propertyTypeName,  null);
	}

	/**
	 * Updates a
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=UpdatePropertyTypeClient(dataViewMode,  propertyType,  propertyTypeName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyTypeName The name of the property type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param propertyType Property type available for content. Property types are like templates that can be reused.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> updatePropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.PropertyType propertyType, String propertyTypeName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.updatePropertyTypeUrl(propertyTypeName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.PropertyType.class;
		MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient = (MozuClient<com.mozu.api.contracts.content.PropertyType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(propertyType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Delete a specific
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePropertyTypeClient(dataViewMode,  propertyTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param propertyTypeName The name of the property type.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, String propertyTypeName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.deletePropertyTypeUrl(propertyTypeName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



