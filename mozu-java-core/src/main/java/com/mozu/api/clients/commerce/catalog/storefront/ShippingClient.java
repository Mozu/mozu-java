/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

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
 * Use the Storefront Shipping resource to retrieve shipping rate information from the website.
 * </summary>
 */
public class ShippingClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>> mozuClient=GetMultiRatesClient( rateRequestGroupList);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponseGroup ratesResponseGroup = client.Result();
	 * </code></pre></p>
	 * @param rateRequestGroupList The shipping rates available for the grouping.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponseGroup
	 * @see com.mozu.api.contracts.shippingruntime.RateRequestGroup
	 */
	public static MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>> getMultiRatesClient(List<com.mozu.api.contracts.shippingruntime.RateRequestGroup> rateRequestGroupList) throws Exception
	{
		return getMultiRatesClient( rateRequestGroupList,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>> mozuClient=GetMultiRatesClient( rateRequestGroupList,  includeRawResponse);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponseGroup ratesResponseGroup = client.Result();
	 * </code></pre></p>
	 * @param includeRawResponse Set this parameter to  to retrieve the full raw JSON response from a shipping carrier (instead of just the shipping rate).
	 * @param rateRequestGroupList The shipping rates available for the grouping.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponseGroup
	 * @see com.mozu.api.contracts.shippingruntime.RateRequestGroup
	 */
	public static MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>> getMultiRatesClient(List<com.mozu.api.contracts.shippingruntime.RateRequestGroup> rateRequestGroupList, Boolean includeRawResponse) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ShippingUrl.getMultiRatesUrl(includeRawResponse);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>> mozuClient = (MozuClient<List<com.mozu.api.contracts.shippingruntime.RatesResponseGroup>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rateRequestGroupList);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient=GetRatesClient( rateRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponse ratesResponse = client.Result();
	 * </code></pre></p>
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingruntime.RatesResponse>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public static MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> getRatesClient(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest) throws Exception
	{
		return getRatesClient( rateRequest,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient=GetRatesClient( rateRequest,  includeRawResponse,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponse ratesResponse = client.Result();
	 * </code></pre></p>
	 * @param includeRawResponse Set this parameter to  to retrieve the full raw JSON response from a shipping carrier (instead of just the shipping rate).
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingruntime.RatesResponse>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public static MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> getRatesClient(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, Boolean includeRawResponse, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ShippingUrl.getRatesUrl(includeRawResponse, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingruntime.RatesResponse.class;
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient = (MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rateRequest);
		return mozuClient;

	}

}



