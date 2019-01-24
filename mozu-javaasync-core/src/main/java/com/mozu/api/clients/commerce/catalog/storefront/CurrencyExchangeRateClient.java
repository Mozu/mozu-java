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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/catalog/storefront/currencies related resources. DOCUMENT_HERE 
 * </summary>
 */
public class CurrencyExchangeRateClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>> mozuClient=GetCurrencyExchangeRatesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyExchangeRate currencyExchangeRate = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>>
	 * @see com.mozu.api.contracts.productruntime.CurrencyExchangeRate
	 */
	public static MozuClient<List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>> getCurrencyExchangeRatesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CurrencyExchangeRateUrl.getCurrencyExchangeRatesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productruntime.CurrencyExchangeRate>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



