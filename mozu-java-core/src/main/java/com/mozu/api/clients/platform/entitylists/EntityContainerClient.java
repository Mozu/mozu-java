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
 * Entity containers provide all properties and data for entities within a site/tenant. This data encapsulates all associated IDs including entity lists, entity views, site, tenant, entities, and more.
 * </summary>
 */
public class EntityContainerClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id) throws Exception
	{
		return getEntityContainerClient( entityListFullName,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetEntityContainerClient( entityListFullName,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getEntityContainerClient(String entityListFullName, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainerUrl(entityListFullName, id, responseFields);
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
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName) throws Exception
	{
		return getEntityContainersClient( entityListFullName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetEntityContainersClient( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getEntityContainersClient(String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.EntityContainerUrl.getEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



