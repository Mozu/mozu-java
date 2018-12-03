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
 * 
 * </summary>
 */
public class CurrencyExchangeRateResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CurrencyExchangeRateResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CurrencyExchangeRate currencyexchangerate = new CurrencyExchangeRate();
	 *	CurrencyExchangeRate currencyExchangeRate = currencyexchangerate.getCurrencyExchangeRates();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>
	 * @see com.mozu.api.contracts.productruntime.CurrencyExchangeRate
	 */
	public List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate> getCurrencyExchangeRates() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>> client = com.mozu.api.clients.commerce.catalog.storefront.CurrencyExchangeRateClient.getCurrencyExchangeRatesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


