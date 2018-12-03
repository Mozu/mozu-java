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
 * 
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
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
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
	 * @param productSortDefinitionId 
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
	 * @param productSortDefinitionId 
	 * @param responseFields 
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
	 * @param definition 
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
	 * @param responseFields 
	 * @param useProvidedId 
	 * @param definition 
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
	 * @param productSortDefinitionId 
	 * @param definition 
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
	 * @param productSortDefinitionId 
	 * @param responseFields 
	 * @param definition 
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
	 * @param productSortDefinitionId 
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


