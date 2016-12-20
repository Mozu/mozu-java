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
 * Use the shipping subresource to manage settings for the site shipping information, such as origin address information, carrier shipping methods, shipping rate providers, and regions available for shipping.
 * </summary>
 */
public class SiteShippingSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SiteShippingSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the shipping settings configured for a site.
	 * <p><pre><code>
	 *	SiteShippingSettings siteshippingsettings = new SiteShippingSettings();
	 *	SiteShippingSettings siteShippingSettings = siteshippingsettings.getSiteShippingSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 */
	public com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings() throws Exception
	{
		return getSiteShippingSettings( null);
	}

	/**
	 * Retrieves a list of the shipping settings configured for a site.
	 * <p><pre><code>
	 *	SiteShippingSettings siteshippingsettings = new SiteShippingSettings();
	 *	SiteShippingSettings siteShippingSettings = siteshippingsettings.getSiteShippingSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 */
	public com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> client = com.mozu.api.clients.commerce.settings.SiteShippingSettingsClient.getSiteShippingSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



