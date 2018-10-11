/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

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
 * The Entity Lists resource manages all dynamic entities in your  document store of the  cloud. The content is JSON and can have up to five indexed properties (integer, decimal, string, date, and boolean) with support for additional customized elements as needed. Every document in the entity list has a validated unique ID.
 * </summary>
 */
public class EntityListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EntityListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityListCollection entityListCollection = entitylist.getEntityLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists() throws Exception
	{
		return getEntityLists( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.getEntityLists( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public CountDownLatch getEntityListsAsync( AsyncCallback<com.mozu.api.contracts.mzdb.EntityListCollection> callback) throws Exception
	{
		return getEntityListsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityListCollection entityListCollection = entitylist.getEntityLists( pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityListCollection getEntityLists(Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> client = com.mozu.api.clients.platform.EntityListClient.getEntityListsClient( pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.getEntityLists( pageSize,  startIndex,  filter,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityListCollection
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public CountDownLatch getEntityListsAsync(Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityListCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> client = com.mozu.api.clients.platform.EntityListClient.getEntityListsClient( pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.getEntityList( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList getEntityList(String entityListFullName) throws Exception
	{
		return getEntityList( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.getEntityList( entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch getEntityListAsync(String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		return getEntityListAsync( entityListFullName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.getEntityList( entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList getEntityList(String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.getEntityListClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.getEntityList( entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch getEntityListAsync(String entityListFullName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.getEntityListClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.createEntityList( entityList);
	 * </code></pre></p>
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList createEntityList(com.mozu.api.contracts.mzdb.EntityList entityList) throws Exception
	{
		return createEntityList( entityList,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.createEntityList( entityList, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch createEntityListAsync(com.mozu.api.contracts.mzdb.EntityList entityList, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		return createEntityListAsync( entityList,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.createEntityList( entityList,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList createEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.createEntityListClient( entityList,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.createEntityList( entityList,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch createEntityListAsync(com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.createEntityListClient( entityList,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.updateEntityList( entityList,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList updateEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName) throws Exception
	{
		return updateEntityList( entityList,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.updateEntityList( entityList,  entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param  callback callback handler for asynchronous operations
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch updateEntityListAsync(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		return updateEntityListAsync( entityList,  entityListFullName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.updateEntityList( entityList,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public com.mozu.api.contracts.mzdb.EntityList updateEntityList(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.updateEntityListClient( entityList,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	CountDownLatch latch = entitylist.updateEntityList( entityList,  entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public CountDownLatch updateEntityListAsync(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> client = com.mozu.api.clients.platform.EntityListClient.updateEntityListClient( entityList,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	entitylist.deleteEntityList( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return 
	 */
	public void deleteEntityList(String entityListFullName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.EntityListClient.deleteEntityListClient( entityListFullName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



