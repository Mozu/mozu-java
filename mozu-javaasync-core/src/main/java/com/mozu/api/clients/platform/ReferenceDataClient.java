/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
 * The Reference resource retrieves collections of standards the  system currently supports. This includes content locales, top-level domains, units of measure, countries, currencies, time zones, and shipping or billing address schemas.
 * </summary>
 */
public class ReferenceDataClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.AddressSchema> mozuClient=GetAddressSchemaClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressSchema addressSchema = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.AddressSchema>
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public static MozuClient<com.mozu.api.contracts.reference.AddressSchema> getAddressSchemaClient() throws Exception
	{
		return getAddressSchemaClient( null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.AddressSchema> mozuClient=GetAddressSchemaClient( countryCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressSchema addressSchema = client.Result();
	 * </code></pre></p>
	 * @param countryCode The 2-letter country code used to retrieve a specified address schema.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.AddressSchema>
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public static MozuClient<com.mozu.api.contracts.reference.AddressSchema> getAddressSchemaClient(String countryCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getAddressSchemaUrl(countryCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.AddressSchema.class;
		MozuClient<com.mozu.api.contracts.reference.AddressSchema> mozuClient = (MozuClient<com.mozu.api.contracts.reference.AddressSchema>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> mozuClient=GetAddressSchemasClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressSchemaCollection addressSchemaCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.AddressSchemaCollection>
	 * @see com.mozu.api.contracts.reference.AddressSchemaCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> getAddressSchemasClient() throws Exception
	{
		return getAddressSchemasClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> mozuClient=GetAddressSchemasClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AddressSchemaCollection addressSchemaCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.AddressSchemaCollection>
	 * @see com.mozu.api.contracts.reference.AddressSchemaCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> getAddressSchemasClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getAddressSchemasUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.AddressSchemaCollection.class;
		MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.Behavior> mozuClient=GetBehaviorClient( behaviorId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Behavior behavior = client.Result();
	 * </code></pre></p>
	 * @param behaviorId Unique identifier of the behavior.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.Behavior>
	 * @see com.mozu.api.contracts.core.Behavior
	 */
	public static MozuClient<com.mozu.api.contracts.core.Behavior> getBehaviorClient(Integer behaviorId) throws Exception
	{
		return getBehaviorClient( behaviorId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.Behavior> mozuClient=GetBehaviorClient( behaviorId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Behavior behavior = client.Result();
	 * </code></pre></p>
	 * @param behaviorId Unique identifier of the behavior.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.Behavior>
	 * @see com.mozu.api.contracts.core.Behavior
	 */
	public static MozuClient<com.mozu.api.contracts.core.Behavior> getBehaviorClient(Integer behaviorId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getBehaviorUrl(behaviorId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.Behavior.class;
		MozuClient<com.mozu.api.contracts.core.Behavior> mozuClient = (MozuClient<com.mozu.api.contracts.core.Behavior>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCategory> mozuClient=GetBehaviorCategoryClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCategory behaviorCategory = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCategory>
	 * @see com.mozu.api.contracts.core.BehaviorCategory
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCategory> getBehaviorCategoryClient(Integer categoryId) throws Exception
	{
		return getBehaviorCategoryClient( categoryId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCategory> mozuClient=GetBehaviorCategoryClient( categoryId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCategory behaviorCategory = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCategory>
	 * @see com.mozu.api.contracts.core.BehaviorCategory
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCategory> getBehaviorCategoryClient(Integer categoryId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getBehaviorCategoryUrl(categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.BehaviorCategory.class;
		MozuClient<com.mozu.api.contracts.core.BehaviorCategory> mozuClient = (MozuClient<com.mozu.api.contracts.core.BehaviorCategory>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> mozuClient=GetBehaviorCategoriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCategoryCollection behaviorCategoryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCategoryCollection>
	 * @see com.mozu.api.contracts.core.BehaviorCategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> getBehaviorCategoriesClient() throws Exception
	{
		return getBehaviorCategoriesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> mozuClient=GetBehaviorCategoriesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCategoryCollection behaviorCategoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCategoryCollection>
	 * @see com.mozu.api.contracts.core.BehaviorCategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> getBehaviorCategoriesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getBehaviorCategoriesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.BehaviorCategoryCollection.class;
		MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCollection> mozuClient=GetBehaviorsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCollection behaviorCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCollection>
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCollection> getBehaviorsClient() throws Exception
	{
		return getBehaviorsClient( null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.BehaviorCollection> mozuClient=GetBehaviorsClient( userType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * BehaviorCollection behaviorCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userType The user type associated with the behaviors to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.BehaviorCollection>
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.BehaviorCollection> getBehaviorsClient(String userType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getBehaviorsUrl(responseFields, userType);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.BehaviorCollection.class;
		MozuClient<com.mozu.api.contracts.core.BehaviorCollection> mozuClient = (MozuClient<com.mozu.api.contracts.core.BehaviorCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> mozuClient=GetContentLocalesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ContentLocaleCollection contentLocaleCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.ContentLocaleCollection>
	 * @see com.mozu.api.contracts.reference.ContentLocaleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> getContentLocalesClient() throws Exception
	{
		return getContentLocalesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> mozuClient=GetContentLocalesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ContentLocaleCollection contentLocaleCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.ContentLocaleCollection>
	 * @see com.mozu.api.contracts.reference.ContentLocaleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> getContentLocalesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getContentLocalesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.ContentLocaleCollection.class;
		MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CountryCollection> mozuClient=GetCountriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CountryCollection countryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CountryCollection>
	 * @see com.mozu.api.contracts.reference.CountryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CountryCollection> getCountriesClient() throws Exception
	{
		return getCountriesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CountryCollection> mozuClient=GetCountriesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CountryCollection countryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CountryCollection>
	 * @see com.mozu.api.contracts.reference.CountryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CountryCollection> getCountriesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getCountriesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.CountryCollection.class;
		MozuClient<com.mozu.api.contracts.reference.CountryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.CountryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> mozuClient=GetCountriesWithStatesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CountryWithStatesCollection countryWithStatesCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CountryWithStatesCollection>
	 * @see com.mozu.api.contracts.reference.CountryWithStatesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> getCountriesWithStatesClient() throws Exception
	{
		return getCountriesWithStatesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> mozuClient=GetCountriesWithStatesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CountryWithStatesCollection countryWithStatesCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CountryWithStatesCollection>
	 * @see com.mozu.api.contracts.reference.CountryWithStatesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> getCountriesWithStatesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getCountriesWithStatesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.CountryWithStatesCollection.class;
		MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> mozuClient=GetCurrenciesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyCollection currencyCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CurrencyCollection>
	 * @see com.mozu.api.contracts.reference.CurrencyCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> getCurrenciesClient() throws Exception
	{
		return getCurrenciesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> mozuClient=GetCurrenciesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CurrencyCollection currencyCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.CurrencyCollection>
	 * @see com.mozu.api.contracts.reference.CurrencyCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> getCurrenciesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getCurrenciesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.CurrencyCollection.class;
		MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.CurrencyCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> mozuClient=GetTimeZonesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TimeZoneCollection timeZoneCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.TimeZoneCollection>
	 * @see com.mozu.api.contracts.reference.TimeZoneCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> getTimeZonesClient() throws Exception
	{
		return getTimeZonesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> mozuClient=GetTimeZonesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TimeZoneCollection timeZoneCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.TimeZoneCollection>
	 * @see com.mozu.api.contracts.reference.TimeZoneCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> getTimeZonesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getTimeZonesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.TimeZoneCollection.class;
		MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> mozuClient=GetTopLevelDomainsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TopLevelDomainCollection topLevelDomainCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.TopLevelDomainCollection>
	 * @see com.mozu.api.contracts.reference.TopLevelDomainCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> getTopLevelDomainsClient() throws Exception
	{
		return getTopLevelDomainsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> mozuClient=GetTopLevelDomainsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TopLevelDomainCollection topLevelDomainCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.TopLevelDomainCollection>
	 * @see com.mozu.api.contracts.reference.TopLevelDomainCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> getTopLevelDomainsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getTopLevelDomainsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.TopLevelDomainCollection.class;
		MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> mozuClient=GetUnitsOfMeasureClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UnitOfMeasureCollection unitOfMeasureCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.UnitOfMeasureCollection>
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> getUnitsOfMeasureClient() throws Exception
	{
		return getUnitsOfMeasureClient( null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> mozuClient=GetUnitsOfMeasureClient( filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UnitOfMeasureCollection unitOfMeasureCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.reference.UnitOfMeasureCollection>
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public static MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> getUnitsOfMeasureClient(String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ReferenceDataUrl.getUnitsOfMeasureUrl(filter, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.reference.UnitOfMeasureCollection.class;
		MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> mozuClient = (MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



