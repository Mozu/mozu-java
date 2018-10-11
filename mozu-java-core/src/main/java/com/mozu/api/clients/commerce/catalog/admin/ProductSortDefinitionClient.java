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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Sort Definition resource to create, update, and delete sort order definitions used in visual merchandising.You can use these definitions to apply organization rules to a category defined by a product property or custom attribute. The sort order determines the order that products are displayed in, such as newest to oldest, so that they can be rearranged.
 * </summary>
 */
public class ProductSortDefinitionClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> mozuClient=GetProductSortDefinitionsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinitionPagedCollection productSortDefinitionPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> getProductSortDefinitionsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductSortDefinitionsClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> mozuClient=GetProductSortDefinitionsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinitionPagedCollection productSortDefinitionPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> getProductSortDefinitionsClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductSortDefinitionUrl.getProductSortDefinitionsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=GetProductSortDefinitionClient(dataViewMode,  productSortDefinitionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param productSortDefinitionId Unique identifier of the product sort definition.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> getProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, Integer productSortDefinitionId) throws Exception
	{
		return getProductSortDefinitionClient(dataViewMode,  productSortDefinitionId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=GetProductSortDefinitionClient(dataViewMode,  productSortDefinitionId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param productSortDefinitionId Unique identifier of the product sort definition.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> getProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, Integer productSortDefinitionId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductSortDefinitionUrl.getProductSortDefinitionUrl(productSortDefinitionId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductSortDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=AddProductSortDefinitionClient(dataViewMode,  definition);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param definition Properties of the new product sort definition. Required properties of StartDate and Name.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> addProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSortDefinition definition) throws Exception
	{
		return addProductSortDefinitionClient(dataViewMode,  definition,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=AddProductSortDefinitionClient(dataViewMode,  definition,  useProvidedId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param useProvidedId If true, the provided Id value will be used as the ProductSortDefinitionId. If omitted or false, the system will generate a ProductSortDefinitionId
	 * @param definition Properties of the new product sort definition. Required properties of StartDate and Name.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> addProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Boolean useProvidedId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductSortDefinitionUrl.addProductSortDefinitionUrl(responseFields, useProvidedId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductSortDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(definition);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=UpdateProductSortDefinitionClient(dataViewMode,  definition,  productSortDefinitionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param productSortDefinitionId Unique identifier of the product sort definition.
	 * @param definition The details of the product sort definition to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> updateProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Integer productSortDefinitionId) throws Exception
	{
		return updateProductSortDefinitionClient(dataViewMode,  definition,  productSortDefinitionId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient=UpdateProductSortDefinitionClient(dataViewMode,  definition,  productSortDefinitionId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSortDefinition productSortDefinition = client.Result();
	 * </code></pre></p>
	 * @param productSortDefinitionId Unique identifier of the product sort definition.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param definition The details of the product sort definition to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductSortDefinition>
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> updateProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Integer productSortDefinitionId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductSortDefinitionUrl.updateProductSortDefinitionUrl(productSortDefinitionId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductSortDefinition.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(definition);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductSortDefinitionClient(dataViewMode,  productSortDefinitionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productSortDefinitionId Unique identifier of the product sort definition.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductSortDefinitionClient(com.mozu.api.DataViewMode dataViewMode, Integer productSortDefinitionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductSortDefinitionUrl.deleteProductSortDefinitionUrl(productSortDefinitionId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



