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
	 * @param filter 
	 * @param noCount If true, the operation does not return the TotalCount number of results.
	 * @param pageSize 
	 * @param q A list of product search terms to use in the query when searching across product code and product name. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
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
	 * @param productCode 
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
	 * @param catalogId 
	 * @param productCode 
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
	 * @param catalogId 
	 * @param productCode 
	 * @param responseFields 
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
	 * @param productCode 
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
	 * @param productCode 
	 * @param responseFields 
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
	 * @param product Properties of the new product. You must supply values for the product code, product name, and price.
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
	 * @param responseFields 
	 * @param product Properties of the new product. You must supply values for the product code, product name, and price.
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
	 * @param productCode 
	 * @param productInCatalogInfoIn Properties of the product to define for the specific catalog association.
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
	 * @param productCode 
	 * @param responseFields 
	 * @param productInCatalogInfoIn Properties of the product to define for the specific catalog association.
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
	 * MozuClient<java.io.InputStream> mozuClient=RenameProductCodesClient( productCodeRenames);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param productCodeRenames 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.productadmin.ProductCodeRename
	 */
	public static MozuClient<java.io.InputStream> renameProductCodesClient(List<com.mozu.api.contracts.productadmin.ProductCodeRename> productCodeRenames) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.renameProductCodesUrl();
		String verb = "POST";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
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
	 * @param productCode 
	 * @param productInCatalogsIn Properties of the product to update for each associated catalog.
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
	 * @param catalogId 
	 * @param productCode 
	 * @param productInCatalogInfoIn Properties of the product associated with the catalog specified in the request.
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
	 * @param catalogId 
	 * @param productCode 
	 * @param responseFields 
	 * @param productInCatalogInfoIn Properties of the product associated with the catalog specified in the request.
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
	 * @param productCode 
	 * @param product Properties of the product definition to update in the master catalog.
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
	 * @param productCode 
	 * @param responseFields 
	 * @param product Properties of the product definition to update in the master catalog.
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
	 * MozuClient<java.io.InputStream> mozuClient=DeleteProductClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductUrl(productCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteProductInCatalogClient(dataViewMode,  productCode,  catalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param catalogId 
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteProductInCatalogClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer catalogId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductInCatalogUrl(catalogId, productCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



