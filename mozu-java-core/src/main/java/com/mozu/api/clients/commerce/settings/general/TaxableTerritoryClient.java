/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.general;

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
public class TaxableTerritoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=GetTaxableTerritoriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> getTaxableTerritoriesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.getTaxableTerritoriesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient=AddTaxableTerritoryClient( taxableTerritory);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> addTaxableTerritoryClient(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory) throws Exception
	{
		return addTaxableTerritoryClient( taxableTerritory,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient=AddTaxableTerritoryClient( taxableTerritory,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param taxableTerritory Properties of the territory which is subject to sales tax.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> addTaxableTerritoryClient(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.addTaxableTerritoryUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.TaxableTerritory.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableTerritory);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=UpdateTaxableTerritoriesClient( taxableterritories);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param taxableterritories Properties of the territory which is subject to sales tax.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> updateTaxableTerritoriesClient(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.updateTaxableTerritoriesUrl();
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = (MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableterritories);
		return mozuClient;

	}

}



