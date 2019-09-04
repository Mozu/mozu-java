/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * 
 * </summary>
 */
public class CurrencyLocalizationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection> mozuClient=GetCurrencyLocalizationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalizationCollection currencyLocalizationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection> getCurrencyLocalizationsClient() throws Exception
	{
		return getCurrencyLocalizationsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection> mozuClient=GetCurrencyLocalizationsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalizationCollection currencyLocalizationCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection> getCurrencyLocalizationsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.getCurrencyLocalizationsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalizationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> mozuClient=GetCurrencyExchangeRateClient( currencyCode,  toCurrencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyExchangeRate currencyExchangeRate = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param toCurrencyCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyExchangeRate>
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> getCurrencyExchangeRateClient(String currencyCode, String toCurrencyCode) throws Exception
	{
		return getCurrencyExchangeRateClient( currencyCode,  toCurrencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> mozuClient=GetCurrencyExchangeRateClient( currencyCode,  toCurrencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyExchangeRate currencyExchangeRate = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param responseFields 
	 * @param toCurrencyCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyExchangeRate>
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> getCurrencyExchangeRateClient(String currencyCode, String toCurrencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.getCurrencyExchangeRateUrl(currencyCode, responseFields, toCurrencyCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyExchangeRate.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRate>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection> mozuClient=GetCurrencyExchangeRatesClient( currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyExchangeRateCollection currencyExchangeRateCollection = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection>
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection> getCurrencyExchangeRatesClient(String currencyCode) throws Exception
	{
		return getCurrencyExchangeRatesClient( currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection> mozuClient=GetCurrencyExchangeRatesClient( currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyExchangeRateCollection currencyExchangeRateCollection = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection>
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection> getCurrencyExchangeRatesClient(String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.getCurrencyExchangeRatesUrl(currencyCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyExchangeRateCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=GetCurrencyLocalizationClient( currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> getCurrencyLocalizationClient(String currencyCode) throws Exception
	{
		return getCurrencyLocalizationClient( currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=GetCurrencyLocalizationClient( currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> getCurrencyLocalizationClient(String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.getCurrencyLocalizationUrl(currencyCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyLocalization.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=AddCurrencyLocalizationClient( currencyLocalization);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param currencyLocalization 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> addCurrencyLocalizationClient(com.mozu.api.contracts.productadmin.CurrencyLocalization currencyLocalization) throws Exception
	{
		return addCurrencyLocalizationClient( currencyLocalization,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=AddCurrencyLocalizationClient( currencyLocalization,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param currencyLocalization 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> addCurrencyLocalizationClient(com.mozu.api.contracts.productadmin.CurrencyLocalization currencyLocalization, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.addCurrencyLocalizationUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyLocalization.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(currencyLocalization);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=AddCurrencyExchangeRatesClient( currencyExchangeRates,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param currencyExchangeRates 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient<java.io.InputStream> addCurrencyExchangeRatesClient(List<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> currencyExchangeRates, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.addCurrencyExchangeRatesUrl(currencyCode);
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(currencyExchangeRates);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=UpdateCurrencyExchangeRatesClient( currencyExchangeRates,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param currencyExchangeRates 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient<java.io.InputStream> updateCurrencyExchangeRatesClient(List<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> currencyExchangeRates, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.updateCurrencyExchangeRatesUrl(currencyCode);
		String verb = "PUT";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(currencyExchangeRates);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=UpdateCurrencyLocalizationClient( currencyLocalization,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param currencyLocalization 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> updateCurrencyLocalizationClient(com.mozu.api.contracts.productadmin.CurrencyLocalization currencyLocalization, String currencyCode) throws Exception
	{
		return updateCurrencyLocalizationClient( currencyLocalization,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient=UpdateCurrencyLocalizationClient( currencyLocalization,  currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyLocalization currencyLocalization = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param responseFields 
	 * @param currencyLocalization 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CurrencyLocalization>
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 * @see com.mozu.api.contracts.productadmin.CurrencyLocalization
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> updateCurrencyLocalizationClient(com.mozu.api.contracts.productadmin.CurrencyLocalization currencyLocalization, String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.updateCurrencyLocalizationUrl(currencyCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.CurrencyLocalization.class;
		MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CurrencyLocalization>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(currencyLocalization);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCurrencyLocalizationClient( currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCurrencyLocalizationClient(String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.deleteCurrencyLocalizationUrl(currencyCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCurrencyExchangeRateClient( currencyCode,  toCurrencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param toCurrencyCode 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCurrencyExchangeRateClient(String currencyCode, String toCurrencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.deleteCurrencyExchangeRateUrl(currencyCode, toCurrencyCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



