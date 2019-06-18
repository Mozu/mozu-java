/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
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
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoriesClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getChildCategories( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.CategoryCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(Integer categoryId) throws Exception
	{
		return getChildCategories( categoryId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getChildCategories( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productadmin.CategoryCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getChildCategoriesClient( categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId) throws Exception
	{
		return getCategory( categoryId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoryClient(_dataViewMode,  categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.addCategory( category);
	 * </code></pre></p>
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategory( category,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.addCategory( category,  incrementSequence,  useProvidedId,  responseFields);
	 * </code></pre></p>
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero. Note that this sequence number is NOT the same as the category code - the sequence number orders the categories and so may be related to the category code when the code is initially generated, but this parameter can adjust it.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param useProvidedId Optional. If ,  uses the  you specify in the request as the category's id. If ,  generates an  for the category regardless if you specify an id in the request.If you specify an id already in use and set this parameter to ,  returns an error.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, Boolean useProvidedId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addCategoryClient( category,  incrementSequence,  useProvidedId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.addProductsToCategory( productCodes,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param productCodes A list of product codes to be added to the category.
	 * @return 
	 * @see string
	 */
	public void addProductsToCategory(List<String> productCodes, Integer categoryId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addProductsToCategoryClient(_dataViewMode,  productCodes,  categoryId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.removeProductsFromCategory( productCodes,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param productCodes A list of product codes to be removed from the category.
	 * @return 
	 * @see string
	 */
	public void removeProductsFromCategory(List<String> productCodes, Integer categoryId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.removeProductsFromCategoryClient( productCodes,  categoryId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateDynamicExpression( dynamicExpressionIn);
	 * </code></pre></p>
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateDynamicExpression( dynamicExpressionIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateDynamicExpression( dynamicExpressionIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.validateDynamicExpressionClient( dynamicExpressionIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateRealTimeDynamicExpression( dynamicExpressionIn);
	 * </code></pre></p>
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateRealTimeDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateRealTimeDynamicExpression( dynamicExpressionIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateRealTimeDynamicExpression( dynamicExpressionIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateRealTimeDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.validateRealTimeDynamicExpressionClient( dynamicExpressionIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.updateCategory( category,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategory( category,  categoryId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.updateCategory( category,  categoryId,  cascadeVisibility,  responseFields);
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.updateCategoryClient( category,  categoryId,  cascadeVisibility,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.deleteCategoryById( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return 
	 */
	public void deleteCategoryById(Integer categoryId) throws Exception
	{
		deleteCategoryById( categoryId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.deleteCategoryById( categoryId,  cascadeDelete,  forceDelete,  reassignToParent);
	 * </code></pre></p>
	 * @param cascadeDelete Specifies whether to also delete all subcategories associated with the specified category.If you set this value is false, only the specified category is deleted.The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param forceDelete Specifies whether the category, and any associated subcategories, are deleted even if there are products that reference them. The default value is false.
	 * @param reassignToParent Specifies whether any subcategories of the specified category are reassigned to the parent of the specified category.This field only applies if the cascadeDelete parameter is false.The default value is false.
	 * @return 
	 */
	public void deleteCategoryById(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.deleteCategoryByIdClient( categoryId,  cascadeDelete,  forceDelete,  reassignToParent);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



