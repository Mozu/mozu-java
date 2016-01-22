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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
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
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoriesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of subcategories within a category.
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
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getChildCategories( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Retrieves the details of a single category.
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
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoryClient( categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
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
		return addCategory( category,  null,  null);
	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.addCategory( category,  incrementSequence,  responseFields);
	 * </code></pre></p>
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addCategoryClient( category,  incrementSequence,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Validates the precomputed dynamic category expression.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateDynamicExpression( dynamicExpressionIn);
	 * </code></pre></p>
	 * @param dynamicExpressionIn Mozu.ProductAdmin.Contracts.DynamicExpression ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateDynamicExpression( dynamicExpressionIn,  null);
	}

	/**
	 * Validates the precomputed dynamic category expression.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateDynamicExpression( dynamicExpressionIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param dynamicExpressionIn Mozu.ProductAdmin.Contracts.DynamicExpression ApiType DOCUMENT_HERE 
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
	 * Validates the realtime dynamic expression.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateRealTimeDynamicExpression( dynamicExpressionIn);
	 * </code></pre></p>
	 * @param dynamicExpressionIn Mozu.ProductAdmin.Contracts.DynamicExpression ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public com.mozu.api.contracts.productadmin.DynamicExpression validateRealTimeDynamicExpression(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateRealTimeDynamicExpression( dynamicExpressionIn,  null);
	}

	/**
	 * Validates the realtime dynamic expression.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	DynamicExpression dynamicExpression = category.validateRealTimeDynamicExpression( dynamicExpressionIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param dynamicExpressionIn Mozu.ProductAdmin.Contracts.DynamicExpression ApiType DOCUMENT_HERE 
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
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
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
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.updateCategory( category,  categoryId,  cascadeVisibility,  responseFields);
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * Deletes the category specified by its category ID.
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
	 * Deletes the category specified by its category ID.
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



