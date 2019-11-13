/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Channel Groups resource to manage groups of channels with common information.
 * </summary>
 */
public class ChannelGroupClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient=GetChannelGroupsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroupCollection channelGroupCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> getChannelGroupsClient() throws Exception
	{
		return getChannelGroupsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient=GetChannelGroupsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroupCollection channelGroupCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> getChannelGroupsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.getChannelGroupsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=GetChannelGroupClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> getChannelGroupClient(String code) throws Exception
	{
		return getChannelGroupClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=GetChannelGroupClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> getChannelGroupClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.getChannelGroupUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=CreateChannelGroupClient( channelGroup);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> createChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup) throws Exception
	{
		return createChannelGroupClient( channelGroup,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=CreateChannelGroupClient( channelGroup,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> createChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.createChannelGroupUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channelGroup);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=UpdateChannelGroupClient( channelGroup,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> updateChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code) throws Exception
	{
		return updateChannelGroupClient( channelGroup,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient=UpdateChannelGroupClient( channelGroup,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ChannelGroup channelGroup = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> updateChannelGroupClient(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.updateChannelGroupUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.channels.ChannelGroup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(channelGroup);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteChannelGroupClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteChannelGroupClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ChannelGroupUrl.deleteChannelGroupUrl(code);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



