/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

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
public class ListViewClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetViewEntityClient( entityListFullName,  viewName,  entityId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getViewEntityClient(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityClient( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetViewEntityClient( entityListFullName,  viewName,  entityId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getViewEntityClient(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityUrl(entityId, entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetViewEntitiesClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getViewEntitiesClient(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntitiesClient( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getViewEntitiesClient(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntitiesUrl(entityListFullName, filter, pageSize, responseFields, startIndex, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetViewEntityContainerClient( entityListFullName,  viewName,  entityId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getViewEntityContainerClient(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityContainerClient( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetViewEntityContainerClient( entityListFullName,  viewName,  entityId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getViewEntityContainerClient(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityContainerUrl(entityId, entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainer.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainer>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetViewEntityContainersClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getViewEntityContainersClient(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntityContainersClient( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getViewEntityContainersClient(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, startIndex, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=GetEntityListViewClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> getEntityListViewClient(String entityListFullName, String viewName) throws Exception
	{
		return getEntityListViewClient( entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=GetEntityListViewClient( entityListFullName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> getEntityListViewClient(String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getEntityListViewUrl(entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient=GetEntityListViewsClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListViewCollection listViewCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListViewCollection>
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> getEntityListViewsClient(String entityListFullName) throws Exception
	{
		return getEntityListViewsClient( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient=GetEntityListViewsClient( entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListViewCollection listViewCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListViewCollection>
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> getEntityListViewsClient(String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getEntityListViewsUrl(entityListFullName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListViewCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=CreateEntityListViewClient( listView,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param listView 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> createEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName) throws Exception
	{
		return createEntityListViewClient( listView,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=CreateEntityListViewClient( listView,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param listView 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> createEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.createEntityListViewUrl(entityListFullName, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(listView);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=UpdateEntityListViewClient( listView,  entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param listView 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> updateEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName) throws Exception
	{
		return updateEntityListViewClient( listView,  entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=UpdateEntityListViewClient( listView,  entityListFullName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields 
	 * @param viewName 
	 * @param listView 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> updateEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.updateEntityListViewUrl(entityListFullName, responseFields, viewName);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(listView);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityListViewClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityListViewClient(String entityListFullName, String viewName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.deleteEntityListViewUrl(entityListFullName, viewName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



