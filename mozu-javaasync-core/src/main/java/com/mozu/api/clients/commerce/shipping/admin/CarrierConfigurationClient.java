/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.shipping.admin;

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
 * Use the Carriers resource to configure and manage your supported shipping carrier configurations.
 * </summary>
 */
public class CarrierConfigurationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> mozuClient=GetConfigurationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfigurationCollection carrierConfigurationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> getConfigurationsClient() throws Exception
	{
		return getConfigurationsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> mozuClient=GetConfigurationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfigurationCollection carrierConfigurationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> getConfigurationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.CarrierConfigurationUrl.getConfigurationsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=GetConfigurationClient( carrierId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> getConfigurationClient(String carrierId) throws Exception
	{
		return getConfigurationClient( carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=GetConfigurationClient( carrierId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> getConfigurationClient(String carrierId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.CarrierConfigurationUrl.getConfigurationUrl(carrierId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.CarrierConfiguration.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=CreateConfigurationClient( carrierConfiguration,  carrierId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @param carrierConfiguration Properties of a carrier configured in the shipping admin.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> createConfigurationClient(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId) throws Exception
	{
		return createConfigurationClient( carrierConfiguration,  carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=CreateConfigurationClient( carrierConfiguration,  carrierId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param carrierConfiguration Properties of a carrier configured in the shipping admin.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> createConfigurationClient(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.CarrierConfigurationUrl.createConfigurationUrl(carrierId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.CarrierConfiguration.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(carrierConfiguration);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=UpdateConfigurationClient( carrierConfiguration,  carrierId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @param carrierConfiguration Properties of a carrier configured in the shipping admin.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> updateConfigurationClient(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId) throws Exception
	{
		return updateConfigurationClient( carrierConfiguration,  carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient=UpdateConfigurationClient( carrierConfiguration,  carrierId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CarrierConfiguration carrierConfiguration = client.Result();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param carrierConfiguration Properties of a carrier configured in the shipping admin.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.CarrierConfiguration>
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> updateConfigurationClient(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.CarrierConfigurationUrl.updateConfigurationUrl(carrierId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.CarrierConfiguration.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(carrierConfiguration);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteConfigurationClient( carrierId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param carrierId The unique identifier of the carrier configuration.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteConfigurationClient(String carrierId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.CarrierConfigurationUrl.deleteConfigurationUrl(carrierId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



