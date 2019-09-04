/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

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
 * 
 * </summary>
 */
public class LocationGroupResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationGroupResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroupCollection locationGroupCollection = locationgroup.getLocationGroups();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationGroupCollection
	 * @see com.mozu.api.contracts.location.LocationGroupCollection
	 */
	public com.mozu.api.contracts.location.LocationGroupCollection getLocationGroups() throws Exception
	{
		return getLocationGroups( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroupCollection locationGroupCollection = locationgroup.getLocationGroups( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.location.LocationGroupCollection
	 * @see com.mozu.api.contracts.location.LocationGroupCollection
	 */
	public com.mozu.api.contracts.location.LocationGroupCollection getLocationGroups(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroupCollection> client = com.mozu.api.clients.commerce.admin.LocationGroupClient.getLocationGroupsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.getLocationGroup( groupId);
	 * </code></pre></p>
	 * @param groupId 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup getLocationGroup(Integer groupId) throws Exception
	{
		return getLocationGroup( groupId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.getLocationGroup( groupId,  responseFields);
	 * </code></pre></p>
	 * @param groupId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup getLocationGroup(Integer groupId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroup> client = com.mozu.api.clients.commerce.admin.LocationGroupClient.getLocationGroupClient( groupId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.addLocationGroup( group);
	 * </code></pre></p>
	 * @param group 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup addLocationGroup(com.mozu.api.contracts.location.LocationGroup group) throws Exception
	{
		return addLocationGroup( group,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.addLocationGroup( group,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param group 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup addLocationGroup(com.mozu.api.contracts.location.LocationGroup group, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroup> client = com.mozu.api.clients.commerce.admin.LocationGroupClient.addLocationGroupClient( group,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.updateLocationGroup( group,  groupId);
	 * </code></pre></p>
	 * @param groupId 
	 * @param group 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup updateLocationGroup(com.mozu.api.contracts.location.LocationGroup group, Integer groupId) throws Exception
	{
		return updateLocationGroup( group,  groupId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	LocationGroup locationGroup = locationgroup.updateLocationGroup( group,  groupId,  responseFields);
	 * </code></pre></p>
	 * @param groupId 
	 * @param responseFields 
	 * @param group 
	 * @return com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 * @see com.mozu.api.contracts.location.LocationGroup
	 */
	public com.mozu.api.contracts.location.LocationGroup updateLocationGroup(com.mozu.api.contracts.location.LocationGroup group, Integer groupId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroup> client = com.mozu.api.clients.commerce.admin.LocationGroupClient.updateLocationGroupClient( group,  groupId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroup locationgroup = new LocationGroup();
	 *	Stream stream = locationgroup.deleteLocationGroup( groupId);
	 * </code></pre></p>
	 * @param groupId 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteLocationGroup(Integer groupId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.admin.LocationGroupClient.deleteLocationGroupClient( groupId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



