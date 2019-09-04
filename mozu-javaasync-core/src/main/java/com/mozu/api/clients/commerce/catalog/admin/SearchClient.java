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
public class SearchClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=GetSearchTuningRuleClient( searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> getSearchTuningRuleClient(String searchTuningRuleCode) throws Exception
	{
		return getSearchTuningRuleClient( searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=GetSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> getSearchTuningRuleClient(String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRuleUrl(responseFields, searchTuningRuleCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient=GetSearchTuningRulesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleCollection searchTuningRuleCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> getSearchTuningRulesClient() throws Exception
	{
		return getSearchTuningRulesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient=GetSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleCollection searchTuningRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> getSearchTuningRulesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRulesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=GetSearchTuningRuleSortFieldsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> getSearchTuningRuleSortFieldsClient() throws Exception
	{
		return getSearchTuningRuleSortFieldsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=GetSearchTuningRuleSortFieldsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> getSearchTuningRuleSortFieldsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSearchTuningRuleSortFieldsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient() throws Exception
	{
		return getSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=GetSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> getSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=GetSynonymDefinitionCollectionClient( localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> getSynonymDefinitionCollectionClient(String localeCode) throws Exception
	{
		return getSynonymDefinitionCollectionClient( localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=GetSynonymDefinitionCollectionClient( localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> getSynonymDefinitionCollectionClient(String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSynonymDefinitionCollectionUrl(localeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> mozuClient=GetSynonymDefinitionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionPagedCollection synonymDefinitionPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> getSynonymDefinitionsClient() throws Exception
	{
		return getSynonymDefinitionsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> mozuClient=GetSynonymDefinitionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionPagedCollection synonymDefinitionPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> getSynonymDefinitionsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSynonymDefinitionsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=GetSynonymDefinitionClient( synonymId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param synonymId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> getSynonymDefinitionClient(Integer synonymId) throws Exception
	{
		return getSynonymDefinitionClient( synonymId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=GetSynonymDefinitionClient( synonymId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> getSynonymDefinitionClient(Integer synonymId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.getSynonymDefinitionUrl(responseFields, synonymId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=AddSearchTuningRuleClient( searchTuningRuleIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> addSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn) throws Exception
	{
		return addSearchTuningRuleClient( searchTuningRuleIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=AddSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> addSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.addSearchTuningRuleUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=UpdateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleSortFieldsIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> updateSearchTuningRuleSortFieldsClient(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn) throws Exception
	{
		return updateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient=UpdateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRuleSortFields searchTuningRuleSortFields = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleSortFieldsIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> updateSearchTuningRuleSortFieldsClient(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSearchTuningRuleSortFieldsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleSortFieldsIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=UpdateSynonymDefinitionCollectionClient( collection,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode 
	 * @param collection 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> updateSynonymDefinitionCollectionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode) throws Exception
	{
		return updateSynonymDefinitionCollectionClient( collection,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient=UpdateSynonymDefinitionCollectionClient( collection,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinitionCollection synonymDefinitionCollection = client.Result();
	 * </code></pre></p>
	 * @param localeCode 
	 * @param responseFields 
	 * @param collection 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> updateSynonymDefinitionCollectionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSynonymDefinitionCollectionUrl(localeCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(collection);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=AddSynonymDefinitionClient( synonymDefinition);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param synonymDefinition 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> addSynonymDefinitionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition) throws Exception
	{
		return addSynonymDefinitionClient( synonymDefinition,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=AddSynonymDefinitionClient( synonymDefinition,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymDefinition 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> addSynonymDefinitionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.addSynonymDefinitionUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(synonymDefinition);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=UpdateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> updateSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode) throws Exception
	{
		return updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient=UpdateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchTuningRule searchTuningRule = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SearchTuningRule>
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> updateSearchTuningRuleClient(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSearchTuningRuleUrl(responseFields, searchTuningRuleCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SearchTuningRule.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(searchTuningRuleIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient=UpdateSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSettings searchSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.SearchSettings>
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> updateSettingsClient(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.SearchSettings.class;
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.SearchSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=UpdateSynonymDefinitionClient( synonymDefinition,  synonymId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param synonymId 
	 * @param synonymDefinition 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> updateSynonymDefinitionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId) throws Exception
	{
		return updateSynonymDefinitionClient( synonymDefinition,  synonymId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient=UpdateSynonymDefinitionClient( synonymDefinition,  synonymId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SynonymDefinition synonymDefinition = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param synonymId 
	 * @param synonymDefinition 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.search.SynonymDefinition>
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 * @see com.mozu.api.contracts.productadmin.search.SynonymDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> updateSynonymDefinitionClient(com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.updateSynonymDefinitionUrl(responseFields, synonymId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.search.SynonymDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.search.SynonymDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(synonymDefinition);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteSearchTuningRuleClient( searchTuningRuleCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteSearchTuningRuleClient(String searchTuningRuleCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.deleteSearchTuningRuleUrl(searchTuningRuleCode);
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
	 * MozuClient<java.io.InputStream> mozuClient=DeleteSynonymDefinitionClient( synonymId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param synonymId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteSynonymDefinitionClient(Integer synonymId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.SearchUrl.deleteSynonymDefinitionUrl(synonymId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



