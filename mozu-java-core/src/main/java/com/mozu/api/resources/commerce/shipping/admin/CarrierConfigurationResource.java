/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin;

import com.mozu.api.ApiContext;
import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CarrierConfigurationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CarrierConfigurationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfigurationCollection carrierConfigurationCollection = carrierconfiguration.getConfigurations();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection getConfigurations() throws Exception
	{
		return getConfigurations( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfigurationCollection carrierConfigurationCollection = carrierconfiguration.getConfigurations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection getConfigurations(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection> client = com.mozu.api.clients.commerce.shipping.admin.CarrierConfigurationClient.getConfigurationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.getConfiguration( carrierId);
	 * </code></pre></p>
	 * @param carrierId 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration getConfiguration(String carrierId) throws Exception
	{
		return getConfiguration( carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.getConfiguration( carrierId,  responseFields);
	 * </code></pre></p>
	 * @param carrierId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration getConfiguration(String carrierId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> client = com.mozu.api.clients.commerce.shipping.admin.CarrierConfigurationClient.getConfigurationClient( carrierId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.createConfiguration( carrierConfiguration,  carrierId);
	 * </code></pre></p>
	 * @param carrierId 
	 * @param carrierConfiguration 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration createConfiguration(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId) throws Exception
	{
		return createConfiguration( carrierConfiguration,  carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.createConfiguration( carrierConfiguration,  carrierId,  responseFields);
	 * </code></pre></p>
	 * @param carrierId 
	 * @param responseFields 
	 * @param carrierConfiguration 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration createConfiguration(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> client = com.mozu.api.clients.commerce.shipping.admin.CarrierConfigurationClient.createConfigurationClient( carrierConfiguration,  carrierId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.updateConfiguration( carrierConfiguration,  carrierId);
	 * </code></pre></p>
	 * @param carrierId 
	 * @param carrierConfiguration 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration updateConfiguration(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId) throws Exception
	{
		return updateConfiguration( carrierConfiguration,  carrierId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	CarrierConfiguration carrierConfiguration = carrierconfiguration.updateConfiguration( carrierConfiguration,  carrierId,  responseFields);
	 * </code></pre></p>
	 * @param carrierId 
	 * @param responseFields 
	 * @param carrierConfiguration 
	 * @return com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 * @see com.mozu.api.contracts.shippingadmin.CarrierConfiguration
	 */
	public com.mozu.api.contracts.shippingadmin.CarrierConfiguration updateConfiguration(com.mozu.api.contracts.shippingadmin.CarrierConfiguration carrierConfiguration, String carrierId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.CarrierConfiguration> client = com.mozu.api.clients.commerce.shipping.admin.CarrierConfigurationClient.updateConfigurationClient( carrierConfiguration,  carrierId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CarrierConfiguration carrierconfiguration = new CarrierConfiguration();
	 *	carrierconfiguration.deleteConfiguration( carrierId);
	 * </code></pre></p>
	 * @param carrierId 
	 * @return 
	 */
	public void deleteConfiguration(String carrierId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.shipping.admin.CarrierConfigurationClient.deleteConfigurationClient( carrierId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



