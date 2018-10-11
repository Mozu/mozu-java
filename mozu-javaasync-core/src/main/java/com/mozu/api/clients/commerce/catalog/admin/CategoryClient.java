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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getCategoriesClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoriesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(Integer categoryId) throws Exception
	{
		return getChildCategoriesClient( categoryId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient( categoryId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(Integer categoryId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getChildCategoriesUrl(categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return getCategoryClient(dataViewMode,  categoryId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoryUrl(categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient( category);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategoryClient( category,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient( category,  incrementSequence,  useProvidedId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param useProvidedId Optional. If ,  uses the  you specify in the request as the category's id. If ,  generates an  for the category regardless if you specify an id in the request.If you specify an id already in use and set this parameter to ,  returns an error.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, Boolean useProvidedId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.addCategoryUrl(incrementSequence, responseFields, useProvidedId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AddProductsToCategoryClient(dataViewMode,  productCodes,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param productCodes 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient addProductsToCategoryClient(com.mozu.api.DataViewMode dataViewMode, List<String> productCodes, Integer categoryId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.addProductsToCategoryUrl(categoryId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productCodes);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveProductsFromCategoryClient( productCodes,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param productCodes 
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient removeProductsFromCategoryClient(List<String> productCodes, Integer categoryId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.removeProductsFromCategoryUrl(categoryId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productCodes);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient=ValidateDynamicExpressionClient( dynamicExpressionIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DynamicExpression dynamicExpression = client.Result();
	 * </code></pre></p>
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DynamicExpression>
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> validateDynamicExpressionClient(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateDynamicExpressionClient( dynamicExpressionIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient=ValidateDynamicExpressionClient( dynamicExpressionIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DynamicExpression dynamicExpression = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DynamicExpression>
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> validateDynamicExpressionClient(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.validateDynamicExpressionUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.DynamicExpression.class;
		MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(dynamicExpressionIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient=ValidateRealTimeDynamicExpressionClient( dynamicExpressionIn);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DynamicExpression dynamicExpression = client.Result();
	 * </code></pre></p>
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DynamicExpression>
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> validateRealTimeDynamicExpressionClient(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn) throws Exception
	{
		return validateRealTimeDynamicExpressionClient( dynamicExpressionIn,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient=ValidateRealTimeDynamicExpressionClient( dynamicExpressionIn,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DynamicExpression dynamicExpression = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dynamicExpressionIn The details of the dynamic expression that you want to validate.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DynamicExpression>
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 * @see com.mozu.api.contracts.productadmin.DynamicExpression
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> validateRealTimeDynamicExpressionClient(com.mozu.api.contracts.productadmin.DynamicExpression dynamicExpressionIn, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.validateRealTimeDynamicExpressionUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.DynamicExpression.class;
		MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DynamicExpression>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(dynamicExpressionIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient( category,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategoryClient( category,  categoryId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient( category,  categoryId,  cascadeVisibility,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.updateCategoryUrl(cascadeVisibility, categoryId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(Integer categoryId) throws Exception
	{
		return deleteCategoryByIdClient( categoryId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient( categoryId,  cascadeDelete,  forceDelete,  reassignToParent);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cascadeDelete Specifies whether to also delete all subcategories associated with the specified category.If you set this value is false, only the specified category is deleted.The default value is false.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param forceDelete Specifies whether the category, and any associated subcategories, are deleted even if there are products that reference them. The default value is false.
	 * @param reassignToParent Specifies whether any subcategories of the specified category are reassigned to the parent of the specified category.This field only applies if the cascadeDelete parameter is false.The default value is false.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.deleteCategoryByIdUrl(cascadeDelete, categoryId, forceDelete, reassignToParent);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



