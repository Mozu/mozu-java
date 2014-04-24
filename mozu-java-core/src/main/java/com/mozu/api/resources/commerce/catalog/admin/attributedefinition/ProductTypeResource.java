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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public ProductTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.GetProductTypes(dataViewMode);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductTypes(dataViewMode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.GetProductTypes(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product type search results by any of its properties. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Name+cont+shoes"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.GetProductType(dataViewMode,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType getProductType(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypeClient(dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.AddProductType(dataViewMode,  productType);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productType Properties of the product type to create.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType addProductType(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.addProductTypeClient(dataViewMode,  productType);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.UpdateProductType(dataViewMode,  productType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to update.
	 * @param dataViewMode DataViewMode
	 * @param productType The details of the product type to update.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType updateProductType(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.updateProductTypeClient(dataViewMode,  productType,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the product type by providing the product type ID.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	producttype.DeleteProductType(dataViewMode,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to delete.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProductType(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.deleteProductTypeClient(dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



