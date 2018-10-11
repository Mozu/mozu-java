/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.general;

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
 * Use the taxable territories subresource to manage the regional territories for this site that are subejct to sales tax.
 * </summary>
 */
public class TaxableTerritoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TaxableTerritoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.getTaxableTerritories();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> getTaxableTerritories() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.getTaxableTerritoriesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.addTaxableTerritory( taxableTerritory);
	 * </code></pre></p>
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory) throws Exception
	{
		return addTaxableTerritory( taxableTerritory,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.addTaxableTerritory( taxableTerritory,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.addTaxableTerritoryClient( taxableTerritory,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TaxableTerritory taxableterritory = new TaxableTerritory();
	 *	TaxableTerritory taxableTerritory = taxableterritory.updateTaxableTerritories( taxableterritories);
	 * </code></pre></p>
	 * @param taxableterritories Properties of the territory which is subject to sales tax.
	 * @return List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> updateTaxableTerritories(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> client = com.mozu.api.clients.commerce.settings.general.TaxableTerritoryClient.updateTaxableTerritoriesClient( taxableterritories);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



