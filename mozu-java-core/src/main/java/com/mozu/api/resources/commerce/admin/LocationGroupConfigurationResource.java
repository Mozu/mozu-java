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
public class LocationGroupConfigurationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public LocationGroupConfigurationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.getLocationGroupConfiguration( locationGroupCode);
	 * </code></pre></p>
	 * @param locationGroupCode 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration getLocationGroupConfiguration(String locationGroupCode) throws Exception
	{
		return getLocationGroupConfiguration( locationGroupCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.getLocationGroupConfiguration( locationGroupCode,  responseFields);
	 * </code></pre></p>
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration getLocationGroupConfiguration(String locationGroupCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroupConfiguration> client = com.mozu.api.clients.commerce.admin.LocationGroupConfigurationClient.getLocationGroupConfigurationClient( locationGroupCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.getLocationGroupConfigurationByLocationCode( locationCode);
	 * </code></pre></p>
	 * @param locationCode 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration getLocationGroupConfigurationByLocationCode(String locationCode) throws Exception
	{
		return getLocationGroupConfigurationByLocationCode( locationCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.getLocationGroupConfigurationByLocationCode( locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration getLocationGroupConfigurationByLocationCode(String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroupConfiguration> client = com.mozu.api.clients.commerce.admin.LocationGroupConfigurationClient.getLocationGroupConfigurationByLocationCodeClient( locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.setLocationGroupConfiguration( configuration,  locationGroupCode);
	 * </code></pre></p>
	 * @param locationGroupCode 
	 * @param configuration 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration setLocationGroupConfiguration(com.mozu.api.contracts.location.LocationGroupConfiguration configuration, String locationGroupCode) throws Exception
	{
		return setLocationGroupConfiguration( configuration,  locationGroupCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationGroupConfiguration locationgroupconfiguration = new LocationGroupConfiguration();
	 *	LocationGroupConfiguration locationGroupConfiguration = locationgroupconfiguration.setLocationGroupConfiguration( configuration,  locationGroupCode,  responseFields);
	 * </code></pre></p>
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @param configuration 
	 * @return com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 * @see com.mozu.api.contracts.location.LocationGroupConfiguration
	 */
	public com.mozu.api.contracts.location.LocationGroupConfiguration setLocationGroupConfiguration(com.mozu.api.contracts.location.LocationGroupConfiguration configuration, String locationGroupCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationGroupConfiguration> client = com.mozu.api.clients.commerce.admin.LocationGroupConfigurationClient.setLocationGroupConfigurationClient( configuration,  locationGroupCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


