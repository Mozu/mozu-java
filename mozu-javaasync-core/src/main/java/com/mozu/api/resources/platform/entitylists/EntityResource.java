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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Entities are JSON entries within the MZDB (Mozu Mongo DB) for handling large data sets to heavily filter (&gt;2,000 items). Each entity is associated to an EntityList with schema, rules, and formatting for storing the content. This content can be accessed via the Mozu API and Mozu Hypr tags.
 * </summary>
 */
public class EntityResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EntityResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.getEntity( entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getEntity(String entityListFullName, String id) throws Exception
	{
		return getEntity( entityListFullName,  id,  null);
	}

	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntity( entityListFullName,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getEntityAsync(String entityListFullName, String id, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return getEntityAsync( entityListFullName,  id,  null, callback);
	}

	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.getEntity( entityListFullName,  id,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getEntity(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntityClient( entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves an entity with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntity( entityListFullName,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getEntityAsync(String entityListFullName, String id, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntityClient( entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	EntityCollection entityCollection = entity.getEntities( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName) throws Exception
	{
		return getEntities( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntities( entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getEntitiesAsync(String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		return getEntitiesAsync( entityListFullName,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	EntityCollection entityCollection = entity.getEntities( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a collection of entities with an associated entity list and context level at tenant, master catalog, catalog, or site. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.getEntities( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getEntitiesAsync(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.EntityClient.getEntitiesClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.insertEntity( item,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode insertEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName) throws Exception
	{
		return insertEntity( item,  entityListFullName,  null);
	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.insertEntity( item,  entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param  callback callback handler for asynchronous operations
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch insertEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return insertEntityAsync( item,  entityListFullName,  null, callback);
	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.insertEntity( item,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode insertEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.insertEntityClient( item,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Inserts a new entity per the entered item, the entity list full name, and associated response fields. 
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.insertEntity( item,  entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch insertEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.insertEntityClient( item,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.updateEntity( item,  entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode updateEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id) throws Exception
	{
		return updateEntity( item,  entityListFullName,  id,  null);
	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.updateEntity( item,  entityListFullName,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch updateEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return updateEntityAsync( item,  entityListFullName,  id,  null, callback);
	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	JObject json = entity.updateEntity( item,  entityListFullName,  id,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode updateEntity(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.updateEntityClient( item,  entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the content and associations for an existing entity.
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	CountDownLatch latch = entity.updateEntity( item,  entityListFullName,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param item JSON code for objects.
	 * @return JObject
	 * @see JObject
	 * @see JObject
	 */
	public CountDownLatch updateEntityAsync(com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.EntityClient.updateEntityClient( item,  entityListFullName,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes an entity depending on the context of tenant, master catalog, catalog, or site level. Entities are associated to an entity list (schema and formatting) for displaying within a namespace and context level.
	 * <p><pre><code>
	 *	Entity entity = new Entity();
	 *	entity.deleteEntity( entityListFullName,  id);
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return 
	 */
	public void deleteEntity(String entityListFullName, String id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.entitylists.EntityClient.deleteEntityClient( entityListFullName,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



