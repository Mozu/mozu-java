/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.entitylists;

import com.mozu.api.ApiContext;
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
 * Provides settings and options for displaying associated content within a context level of site, tenant, catalog, or master catalog. ListViews can be associated with entity lists and entities.
 * </summary>
 */
public class ListViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ListViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	JObject json = listview.getViewEntity( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB ( Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getViewEntity(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntity( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	JObject json = listview.getViewEntity( entityListFullName,  viewName,  entityId,  responseFields);
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB ( Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getViewEntity(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.getViewEntities( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntities( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.getViewEntities( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainer entityContainer = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB ( Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityContainer( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainer entityContainer = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId,  responseFields);
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB ( Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainerClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.getViewEntityContainers( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntityContainers( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.getViewEntityContainers( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.getEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView getEntityListView(String entityListFullName, String viewName) throws Exception
	{
		return getEntityListView( entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.getEntityListView( entityListFullName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView getEntityListView(String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewClient( entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListViewCollection listViewCollection = listview.getEntityListViews( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(String entityListFullName) throws Exception
	{
		return getEntityListViews( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListViewCollection listViewCollection = listview.getEntityListViews( entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewsClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.createEntityListView( listView,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView createEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName) throws Exception
	{
		return createEntityListView( listView,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.createEntityListView( listView,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView createEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.createEntityListViewClient( listView,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.updateEntityListView( listView,  entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView updateEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName) throws Exception
	{
		return updateEntityListView( listView,  entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.updateEntityListView( listView,  entityListFullName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView updateEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.updateEntityListViewClient( listView,  entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	listview.deleteEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return 
	 */
	public void deleteEntityListView(String entityListFullName, String viewName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.entitylists.ListViewClient.deleteEntityListViewClient( entityListFullName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



