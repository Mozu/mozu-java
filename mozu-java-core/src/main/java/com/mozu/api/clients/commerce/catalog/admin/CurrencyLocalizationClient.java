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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Manage the currency localization rules and exchange rates for any of the currencies that are supported for placing orders in.
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
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param toCurrencyCode The code of the new currency that the original currency's equivalent is being calculated to.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param toCurrencyCode The code of the new currency that the original currency's equivalent is being calculated to.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param currencyLocalization The currency localization strategies being added to the currency data.
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
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param currencyLocalization The currency localization strategies being added to the currency data.
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
	 * MozuClient mozuClient=AddCurrencyExchangeRatesClient( currencyExchangeRates,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param currencyExchangeRates All of the exchange rates being provided.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient addCurrencyExchangeRatesClient(List<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> currencyExchangeRates, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.addCurrencyExchangeRatesUrl(currencyCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(currencyExchangeRates);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateCurrencyExchangeRatesClient( currencyExchangeRates,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param currencyExchangeRates 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.CurrencyExchangeRate
	 */
	public static MozuClient updateCurrencyExchangeRatesClient(List<com.mozu.api.contracts.productadmin.CurrencyExchangeRate> currencyExchangeRates, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.updateCurrencyExchangeRatesUrl(currencyCode);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param currencyLocalization The currency localization information being updated.
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
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param currencyLocalization The currency localization information being updated.
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
	 * MozuClient mozuClient=DeleteCurrencyLocalizationClient( currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCurrencyLocalizationClient(String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.deleteCurrencyLocalizationUrl(currencyCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCurrencyExchangeRateClient( currencyCode,  toCurrencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param toCurrencyCode The code of the new currency that the original currency's equivalent is being calculated to.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCurrencyExchangeRateClient(String currencyCode, String toCurrencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CurrencyLocalizationUrl.deleteCurrencyExchangeRateUrl(currencyCode, toCurrencyCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



