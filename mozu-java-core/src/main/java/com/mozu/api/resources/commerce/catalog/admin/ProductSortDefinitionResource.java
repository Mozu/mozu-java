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
 * 
 * </summary>
 */
public class ProductSortDefinitionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductSortDefinitionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductSortDefinitionResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinitionPagedCollection productSortDefinitionPagedCollection = productsortdefinition.getProductSortDefinitions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection getProductSortDefinitions() throws Exception
	{
		return getProductSortDefinitions( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinitionPagedCollection productSortDefinitionPagedCollection = productsortdefinition.getProductSortDefinitions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection getProductSortDefinitions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinitionPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.ProductSortDefinitionClient.getProductSortDefinitionsClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.getProductSortDefinition( productSortDefinitionId);
	 * </code></pre></p>
	 * @param productSortDefinitionId 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition getProductSortDefinition(Integer productSortDefinitionId) throws Exception
	{
		return getProductSortDefinition( productSortDefinitionId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.getProductSortDefinition( productSortDefinitionId,  responseFields);
	 * </code></pre></p>
	 * @param productSortDefinitionId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition getProductSortDefinition(Integer productSortDefinitionId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> client = com.mozu.api.clients.commerce.catalog.admin.ProductSortDefinitionClient.getProductSortDefinitionClient(_dataViewMode,  productSortDefinitionId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.addProductSortDefinition( definition);
	 * </code></pre></p>
	 * @param definition 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition addProductSortDefinition(com.mozu.api.contracts.productadmin.ProductSortDefinition definition) throws Exception
	{
		return addProductSortDefinition( definition,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.addProductSortDefinition( definition,  useProvidedId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param useProvidedId 
	 * @param definition 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition addProductSortDefinition(com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Boolean useProvidedId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> client = com.mozu.api.clients.commerce.catalog.admin.ProductSortDefinitionClient.addProductSortDefinitionClient(_dataViewMode,  definition,  useProvidedId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.updateProductSortDefinition( definition,  productSortDefinitionId);
	 * </code></pre></p>
	 * @param productSortDefinitionId 
	 * @param definition 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition updateProductSortDefinition(com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Integer productSortDefinitionId) throws Exception
	{
		return updateProductSortDefinition( definition,  productSortDefinitionId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	ProductSortDefinition productSortDefinition = productsortdefinition.updateProductSortDefinition( definition,  productSortDefinitionId,  responseFields);
	 * </code></pre></p>
	 * @param productSortDefinitionId 
	 * @param responseFields 
	 * @param definition 
	 * @return com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 * @see com.mozu.api.contracts.productadmin.ProductSortDefinition
	 */
	public com.mozu.api.contracts.productadmin.ProductSortDefinition updateProductSortDefinition(com.mozu.api.contracts.productadmin.ProductSortDefinition definition, Integer productSortDefinitionId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductSortDefinition> client = com.mozu.api.clients.commerce.catalog.admin.ProductSortDefinitionClient.updateProductSortDefinitionClient(_dataViewMode,  definition,  productSortDefinitionId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductSortDefinition productsortdefinition = new ProductSortDefinition();
	 *	Stream stream = productsortdefinition.deleteProductSortDefinition( productSortDefinitionId);
	 * </code></pre></p>
	 * @param productSortDefinitionId 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteProductSortDefinition(Integer productSortDefinitionId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.ProductSortDefinitionClient.deleteProductSortDefinitionClient(_dataViewMode,  productSortDefinitionId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



