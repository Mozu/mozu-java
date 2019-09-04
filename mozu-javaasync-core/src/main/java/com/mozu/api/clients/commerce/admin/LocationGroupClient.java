/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.admin;

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
 * 
 * </summary>
 */
public class LocationGroupClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> mozuClient=GetLocationGroupsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroupCollection locationGroupCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroupCollection>
	 * @see com.mozu.api.contracts.location.LocationGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> getLocationGroupsClient() throws Exception
	{
		return getLocationGroupsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> mozuClient=GetLocationGroupsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroupCollection locationGroupCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroupCollection>
	 * @see com.mozu.api.contracts.location.LocationGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> getLocationGroupsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationGroupUrl.getLocationGroupsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationGroupCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationGroupCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=GetLocationGroupClient( groupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param groupId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> getLocationGroupClient(Integer groupId) throws Exception
	{
		return getLocationGroupClient( groupId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=GetLocationGroupClient( groupId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param groupId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> getLocationGroupClient(Integer groupId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationGroupUrl.getLocationGroupUrl(groupId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationGroup.class;
		MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=AddLocationGroupClient( group);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param group 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> addLocationGroupClient(com.mozu.api.contracts.location.LocationGroup group) throws Exception
	{
		return addLocationGroupClient( group,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=AddLocationGroupClient( group,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param group 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> addLocationGroupClient(com.mozu.api.contracts.location.LocationGroup group, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationGroupUrl.addLocationGroupUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.location.LocationGroup.class;
		MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(group);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=UpdateLocationGroupClient( group,  groupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param groupId 
	 * @param group 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> updateLocationGroupClient(com.mozu.api.contracts.location.LocationGroup group, Integer groupId) throws Exception
	{
		return updateLocationGroupClient( group,  groupId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient=UpdateLocationGroupClient( group,  groupId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationGroup locationGroup = client.Result();
	 * </code></pre></p>
	 * @param groupId 
	 * @param responseFields 
	 * @param group 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationGroup>
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationGroup> updateLocationGroupClient(com.mozu.api.contracts.location.LocationGroup group, Integer groupId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationGroupUrl.updateLocationGroupUrl(groupId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.LocationGroup.class;
		MozuClient<com.mozu.api.contracts.location.LocationGroup> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(group);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteLocationGroupClient( groupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param groupId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteLocationGroupClient(Integer groupId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationGroupUrl.deleteLocationGroupUrl(groupId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



