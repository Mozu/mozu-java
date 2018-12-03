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
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient=GetRandomAccessCursorClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchRandomAccessCursor productSearchRandomAccessCursor = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> getRandomAccessCursorClient() throws Exception
	{
		return getRandomAccessCursorClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient=GetRandomAccessCursorClient( query,  filter,  pageSize,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchRandomAccessCursor productSearchRandomAccessCursor = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param query 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> getRandomAccessCursorClient(String query, String filter, Integer pageSize, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.getRandomAccessCursorUrl(filter, pageSize, query, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient() throws Exception
	{
		return searchClient( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  facetValueSort,  defaultSort,  sortDefinitionName,  defaultSortDefinitionName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @param cursorMark 
	 * @param defaultSort 
	 * @param defaultSortDefinitionName 
	 * @param enableSearchTuningRules 
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetPrefix 
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateExclude 
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param facetValueSort 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product search results by any of its properties, including product code, type, category, and name. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=categoryId+eq+12"
	 * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. Default value: 12. Max value is 200.
	 * @param query The terms to search on.
	 * @param responseFields 
	 * @param responseOptions 
	 * @param searchSettings 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleContext 
	 * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts 'asc' or 'asc' or descending order (z-a) which accepts 'desc' or 'desc'. The sortBy parameter follows an available property.
	 * @param sortDefinitionName 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String facetTemplateExclude, String facetPrefix, String responseOptions, String cursorMark, String facetValueSort, String defaultSort, String sortDefinitionName, String defaultSortDefinitionName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.searchUrl(cursorMark, defaultSort, defaultSortDefinitionName, enableSearchTuningRules, facet, facetFieldRangeQuery, facetHierDepth, facetHierPrefix, facetHierValue, facetPageSize, facetPrefix, facetSettings, facetStartIndex, facetTemplate, facetTemplateExclude, facetTemplateSubset, facetValueFilter, facetValueSort, filter, pageSize, query, responseFields, responseOptions, searchSettings, searchTuningRuleCode, searchTuningRuleContext, sortBy, sortDefinitionName, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient() throws Exception
	{
		return suggestClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient( query,  groups,  pageSize,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @param groups 
	 * @param pageSize Indicates the maximum number of entities to return from a query. Default value: 10. Max value: 200.
	 * @param query 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient(String query, String groups, Integer pageSize, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.suggestUrl(groups, pageSize, query, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.SearchSuggestionResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



