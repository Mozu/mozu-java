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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Entity Lists resource manages all dynamic entities in your Mozu document store of the Mozu cloud. The content is JSON and can have up to five indexed properties (integer, decimal, string, date, and boolean) with support for additional customized elements as needed. Every document in the entity list has a validated unique ID. 
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
	 * Get a filtered list of EntityLists for a specific tenant.
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
	 * Get a filtered list of EntityLists for a specific tenant.
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityListCollection entityListCollection = entitylist.getEntityLists( pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
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
	 * Get an existing EntityList definition for a specific tenant
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
	 * Get an existing EntityList definition for a specific tenant
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.getEntityList( entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Create a new EntityList for a specific tenant.
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
	 * Create a new EntityList for a specific tenant.
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.createEntityList( entityList,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Update an existing Entitylist for a specific tenant.
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
	 * Update an existing Entitylist for a specific tenant.
	 * <p><pre><code>
	 *	EntityList entitylist = new EntityList();
	 *	EntityList entityList = entitylist.updateEntityList( entityList,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Delete an existing EntityList for a specific tenant. This will also delete all Entities in all instances of this EntityList for the tenant.
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



