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
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ProductSearchResultResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchRandomAccessCursor productSearchRandomAccessCursor = productsearchresult.getRandomAccessCursor();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor getRandomAccessCursor() throws Exception
	{
		return getRandomAccessCursor( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchRandomAccessCursor productSearchRandomAccessCursor = productsearchresult.getRandomAccessCursor( query,  filter,  pageSize,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 * @see com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor getRandomAccessCursor(String query, String filter, Integer pageSize, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchRandomAccessCursor> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.getRandomAccessCursorClient( query,  filter,  pageSize,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.search();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search() throws Exception
	{
		return search( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.search( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  facetValueSort,  responseFields);
	 * </code></pre></p>
	 * @param cursorMark In your first deep paged request, set this parameter to . Then, in all subsequent requests, set this parameter to the subsequent values of  that's returned in each response to continue paging through the results. Continue this pattern until  is null, which signifies the end of the paged results.
	 * @param enableSearchTuningRules Enables search tuning rules on your site.
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetPrefix Use this parameter to filter facet values that are returned by an associated search result by a prefix.For example, to filter on colors that start with b, such as blue, black, or brown you can specify the following:
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateExclude A comma-separated list of the facets to exclude from the facetTemplate.

	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param facetValueSort Use this parameter to specify facet sorting outside the predefined facet definitions (which require a category). The most common options are:
*  (default)â€”Sorts by product count (highest count first).

* â€”Sorts by lexicographic order. In most cases, this means alphabetical order.
The following code demonstrates an example of  sort:
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions Options you can specify for the response. This parameter is null by default.You can primarily use this parameter to return volume price band information in product details, which you can then display on category pages and search results depanding on your theme configuration. To return volume price band information, set this parameter to .
	 * @param searchSettings The settings to control product search and indexing behavior.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleContext The category ID that the search tuning rule applies to.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String facetTemplateExclude, String facetPrefix, String responseOptions, String cursorMark, String facetValueSort, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.searchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  facetValueSort,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestionResult searchSuggestionResult = productsearchresult.suggest();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest() throws Exception
	{
		return suggest( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestionResult searchSuggestionResult = productsearchresult.suggest( query,  groups,  pageSize,  responseFields);
	 * </code></pre></p>
	 * @param groups Specifies the group that you want this operation to return in the response. This parameter accepts one or more values, separated by comma.For example, if you set this parameter to , then this operation returns a  object that contains suggestions for products that match the user entered characters in the search field.The valid values for this parameter are the following:
*  â€” Indicates that products should be matched against and returned in the response. The search  value is compared against product name
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest(String query, String groups, Integer pageSize, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.suggestClient( query,  groups,  pageSize,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



