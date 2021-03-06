/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition;

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
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductTypeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.getProductTypes();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes() throws Exception
	{
		return getProductTypes( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.getProductTypes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypesClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.getProductType( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType getProductType(Integer productTypeId) throws Exception
	{
		return getProductType( productTypeId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.getProductType( productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType getProductType(Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypeClient(_dataViewMode,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.addProductType( productType);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType addProductType(com.mozu.api.contracts.productadmin.ProductType productType) throws Exception
	{
		return addProductType( productType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.addProductType( productType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType addProductType(com.mozu.api.contracts.productadmin.ProductType productType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.addProductTypeClient(_dataViewMode,  productType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.updateProductType( productType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType updateProductType(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId) throws Exception
	{
		return updateProductType( productType,  productTypeId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.updateProductType( productType,  productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType updateProductType(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.updateProductTypeClient(_dataViewMode,  productType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	producttype.deleteProductType( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProductType(Integer productTypeId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.deleteProductTypeClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



