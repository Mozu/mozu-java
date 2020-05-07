/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

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
 * Retrieves the details of a price list. The details may contain a hierarchy of ancestor and/or descendant price lists dependening on your configuration.
 * </summary>
 */
public class PriceListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PriceListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The unique code of the price list for which you want to retrieve the details.
	 * @return com.mozu.api.contracts.productruntime.PriceList
	 * @see com.mozu.api.contracts.productruntime.PriceList
	 */
	public com.mozu.api.contracts.productruntime.PriceList getPriceList(String priceListCode) throws Exception
	{
		return getPriceList( priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode The unique code of the price list for which you want to retrieve the details.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.PriceList
	 * @see com.mozu.api.contracts.productruntime.PriceList
	 */
	public com.mozu.api.contracts.productruntime.PriceList getPriceList(String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.PriceList> client = com.mozu.api.clients.commerce.catalog.storefront.PriceListClient.getPriceListClient( priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	ResolvedPriceList resolvedPriceList = pricelist.getResolvedPriceList();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 */
	public com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList() throws Exception
	{
		return getResolvedPriceList( null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	ResolvedPriceList resolvedPriceList = pricelist.getResolvedPriceList( customerAccountId,  responseFields);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 */
	public com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList(Integer customerAccountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> client = com.mozu.api.clients.commerce.catalog.storefront.PriceListClient.getResolvedPriceListClient( customerAccountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	ResolvedPriceList resolvedPriceList = pricelist.getResolvedPriceList2( customerAccountObject);
	 * </code></pre></p>
	 * @param customerAccountObject 
	 * @return com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see JObject
	 */
	public com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList2(com.fasterxml.jackson.databind.JsonNode customerAccountObject) throws Exception
	{
		return getResolvedPriceList2( customerAccountObject,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	ResolvedPriceList resolvedPriceList = pricelist.getResolvedPriceList2( customerAccountObject,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param customerAccountObject 
	 * @return com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see com.mozu.api.contracts.productruntime.ResolvedPriceList
	 * @see JObject
	 */
	public com.mozu.api.contracts.productruntime.ResolvedPriceList getResolvedPriceList2(com.fasterxml.jackson.databind.JsonNode customerAccountObject, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ResolvedPriceList> client = com.mozu.api.clients.commerce.catalog.storefront.PriceListClient.getResolvedPriceList2Client( customerAccountObject,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



