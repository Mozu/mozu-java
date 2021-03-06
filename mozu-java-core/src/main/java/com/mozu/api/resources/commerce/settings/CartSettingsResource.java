/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

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
 * Use the cart subresource to manage settings for the cart, such as whether to include handling fees in the cost calculations.
 * </summary>
 */
public class CartSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CartSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.getCartSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings getCartSettings() throws Exception
	{
		return getCartSettings( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.getCartSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings getCartSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> client = com.mozu.api.clients.commerce.settings.CartSettingsClient.getCartSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.createCartSettings( cartSettings);
	 * </code></pre></p>
	 * @param cartSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings createCartSettings(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings) throws Exception
	{
		return createCartSettings( cartSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.createCartSettings( cartSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings createCartSettings(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> client = com.mozu.api.clients.commerce.settings.CartSettingsClient.createCartSettingsClient( cartSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.updateCartSettings( cartSettings);
	 * </code></pre></p>
	 * @param cartSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings updateCartSettings(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings) throws Exception
	{
		return updateCartSettings( cartSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CartSettings cartsettings = new CartSettings();
	 *	CartSettings cartSettings = cartsettings.updateCartSettings( cartSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param cartSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CartSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CartSettings updateCartSettings(com.mozu.api.contracts.sitesettings.order.CartSettings cartSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CartSettings> client = com.mozu.api.clients.commerce.settings.CartSettingsClient.updateCartSettingsClient( cartSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



