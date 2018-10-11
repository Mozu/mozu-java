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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Storefront Categories resource to view the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class CategoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public CategoryResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategories( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public CountDownLatch getCategoriesAsync( AsyncCallback<com.mozu.api.contracts.productruntime.CategoryPagedCollection> callback) throws Exception
	{
		return getCategoriesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories( filter,  startIndex,  pageSize,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoriesClient(_dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategories( filter,  startIndex,  pageSize,  sortBy,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public CountDownLatch getCategoriesAsync(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields, AsyncCallback<com.mozu.api.contracts.productruntime.CategoryPagedCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoriesClient(_dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public com.mozu.api.contracts.productruntime.Category getCategory(Integer categoryId) throws Exception
	{
		return getCategory( categoryId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategory( categoryId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public CountDownLatch getCategoryAsync(Integer categoryId, AsyncCallback<com.mozu.api.contracts.productruntime.Category> callback) throws Exception
	{
		return getCategoryAsync( categoryId,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId,  allowInactive,  responseFields);
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public com.mozu.api.contracts.productruntime.Category getCategory(Integer categoryId, Boolean allowInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Category> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryClient(_dataViewMode,  categoryId,  allowInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategory( categoryId,  allowInactive,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.Category
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public CountDownLatch getCategoryAsync(Integer categoryId, Boolean allowInactive, String responseFields, AsyncCallback<com.mozu.api.contracts.productruntime.Category> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Category> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryClient(_dataViewMode,  categoryId,  allowInactive,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getCategoryTree();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree() throws Exception
	{
		return getCategoryTree( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategoryTree( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public CountDownLatch getCategoryTreeAsync( AsyncCallback<com.mozu.api.contracts.productruntime.CategoryCollection> callback) throws Exception
	{
		return getCategoryTreeAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getCategoryTree( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryTreeClient(_dataViewMode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CountDownLatch latch = category.getCategoryTree( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.CategoryCollection
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public CountDownLatch getCategoryTreeAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.productruntime.CategoryCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryTreeClient(_dataViewMode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



