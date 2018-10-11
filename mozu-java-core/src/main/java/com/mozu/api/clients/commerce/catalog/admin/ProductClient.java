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
 * Use the Product Administration resource to create new product definitions in the master catalog and determine which catalogs will feature products. You can also assign attribute values for defined products, manage product-level location inventory, and configure the variations of a product.
 * </summary>
 */
public class ProductClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient=GetProductsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductsClient(dataViewMode,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient=GetProductsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  noCount,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param noCount If true, the operation does not return the TotalCount number of results.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductsUrl(filter, noCount, pageSize, q, qLimit, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> mozuClient=GetProductInCatalogsClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> getProductInCatalogsClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductInCatalogsUrl(productCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=GetProductInCatalogClient(dataViewMode,  productCode,  catalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param catalogId Unique identifier for a catalog.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> getProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId) throws Exception
	{
		return getProductInCatalogClient(dataViewMode,  productCode,  catalogId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=GetProductInCatalogClient(dataViewMode,  productCode,  catalogId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param catalogId Unique identifier for a catalog.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> getProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductInCatalogUrl(catalogId, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInCatalogInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=GetProductClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductClient(dataViewMode,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=GetProductClient(dataViewMode,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductUrl(productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=AddProductClient(dataViewMode,  product);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> addProductClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		return addProductClient(dataViewMode,  product,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=AddProductClient(dataViewMode,  product,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> addProductClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.addProductUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(product);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=AddProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> addProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode) throws Exception
	{
		return addProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=AddProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> addProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.addProductInCatalogUrl(productCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInCatalogInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInCatalogInfoIn);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=RenameProductCodesClient( productCodeRenames);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productCodeRenames Properties for a product code current and changed content.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.ProductCodeRename
	 */
	public static MozuClient renameProductCodesClient(List<com.mozu.api.contracts.productadmin.ProductCodeRename> productCodeRenames) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.renameProductCodesUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productCodeRenames);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> mozuClient=UpdateProductInCatalogsClient(dataViewMode,  productInCatalogsIn,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productInCatalogsIn Properties of a product associated with a specific catalog.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> updateProductInCatalogsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> productInCatalogsIn, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductInCatalogsUrl(productCode);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInCatalogsIn);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=UpdateProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param catalogId Unique identifier for a catalog.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> updateProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId) throws Exception
	{
		return updateProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient=UpdateProductInCatalogClient(dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductInCatalogInfo productInCatalogInfo = client.Result();
	 * </code></pre></p>
	 * @param catalogId Unique identifier for a catalog.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> updateProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductInCatalogUrl(catalogId, productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInCatalogInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInCatalogInfoIn);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=UpdateProductClient(dataViewMode,  product,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> updateProductClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String productCode) throws Exception
	{
		return updateProductClient(dataViewMode,  product,  productCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=UpdateProductClient(dataViewMode,  product,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> updateProductClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Product product, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductUrl(productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(product);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductUrl(productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductInCatalogClient(dataViewMode,  productCode,  catalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param catalogId Unique identifier for a catalog.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductInCatalogUrl(catalogId, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



