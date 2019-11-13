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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Storefront Categories resource to view the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getCategoriesClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoriesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return getCategoryClient(dataViewMode,  categoryId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId,  allowInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, Boolean allowInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryUrl(allowInactive, categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Category.class;
		MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient=GetCategoryTreeClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> getCategoryTreeClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getCategoryTreeClient(dataViewMode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient=GetCategoryTreeClient(dataViewMode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> getCategoryTreeClient(com.mozu.api.DataViewMode dataViewMode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryTreeUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



