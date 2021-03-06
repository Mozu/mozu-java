/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

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
 * Use the Storefront Products resource to manage the shopper product selection process during a visit to the web storefront. You can update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductsClient(dataViewMode,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient(dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseOptions,  cursorMark,  defaultSort,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @param cursorMark In your first deep paged request, set this parameter to . Then, in all subsequent requests, set this parameter to the subsequent values of  that's returned in each response to continue paging through the results. Continue this pattern until  is null, which signifies the end of the paged results.
	 * @param defaultSort Sets the default sorting for content. Sort does not use AND in determining the order
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions Options you can specify for the response. This parameter is null by default.You can primarily use this parameter to return volume price band information in product details, which you can then display on category pages and search results depanding on your theme configuration. To return volume price band information, set this parameter to .
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient(com.mozu.api.DataViewMode dataViewMode, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseOptions, String cursorMark, String defaultSort, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductsUrl(cursorMark, defaultSort, filter, pageSize, responseFields, responseOptions, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductInventoryClient(dataViewMode,  productCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient(dataViewMode,  productCode,  locationCodes,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCodes, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoryUrl(locationCodes, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductClient(dataViewMode,  productCode,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient(dataViewMode,  productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  supressOutOfStock404,  quantity,  acceptVariantProductCode,  purchaseLocation,  variationProductCodeFilter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param acceptVariantProductCode Specifies whether to accept a product variant's code as the .When you set this parameter to , you can pass in a product variant's code in the GetProduct call to retrieve the product variant details that are associated with the base product.
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation The location where the order item(s) was purchased.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param supressOutOfStock404 Specifies whether to supress the 404 error when the product is out of stock.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @param variationProductCodeFilter Provides support for [Variant Discounts](https://www.mozu.com/docs/guides/marketing/variant-discounts.htm) by indicating single and multiple variant codes. When this data is provided then only the option values for the specified product variants will display under the â€œOptionsâ€ list for the product. If a product has multiple options, then each option and the specified value for that variant will be displayed.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, Boolean supressOutOfStock404, Integer quantity, Boolean acceptVariantProductCode, String purchaseLocation, String variationProductCodeFilter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductUrl(acceptVariantProductCode, allowInactive, productCode, purchaseLocation, quantity, responseFields, skipInventoryCheck, supressOutOfStock404, variationProductCode, variationProductCodeFilter);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Product.class;
		MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductForIndexingClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductForIndexingClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductForIndexingClient(dataViewMode,  productCode,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductForIndexingClient(dataViewMode,  productCode,  productVersion,  lastModifiedDate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param lastModifiedDate The date when the product was last updated.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productVersion The product version.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductForIndexingClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Long productVersion, DateTime lastModifiedDate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductForIndexingUrl(lastModifiedDate, productCode, productVersion, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Product.class;
		MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Product>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return configuredProductClient( productOptionSelections,  productCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  quantity,  purchaseLocation,  variationProductCodeFilter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation The location where the order item(s) was purchased.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCodeFilter Provides support for [Variant Discounts](https://www.mozu.com/docs/guides/marketing/variant-discounts.htm) by indicating single and multiple variant codes. When this data is provided then only the option values for the specified product variants will display under the â€œOptionsâ€ list for the product. If a product has multiple options, then each option and the specified value for that variant will be displayed.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, Integer quantity, String purchaseLocation, String variationProductCodeFilter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.configuredProductUrl(includeOptionDetails, productCode, purchaseLocation, quantity, responseFields, skipInventoryCheck, variationProductCodeFilter);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ConfiguredProduct.class;
		MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return validateProductClient( productOptionSelections,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode,  skipInventoryCheck,  quantity,  skipDefaults,  purchaseLocation,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param purchaseLocation The location where the order item(s) was purchased.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipDefaults Normally, product validation applies default extras to products that do not have options specified. If , product validation does not apply default extras to products.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, Integer quantity, Boolean skipDefaults, String purchaseLocation, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateProductUrl(productCode, purchaseLocation, quantity, responseFields, skipDefaults, skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode) throws Exception
	{
		return validateDiscountsClient( discountSelections,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateDiscountsUrl(allowInactive, customerAccountId, productCode, responseFields, skipInventoryCheck, variationProductCode);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.DiscountValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountSelections);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection> mozuClient=GetProductCostsClient(dataViewMode,  query);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCostCollection productCostCollection = client.Result();
	 * </code></pre></p>
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCostCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCostCollection
	 * @see com.mozu.api.contracts.productruntime.ProductCostQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection> getProductCostsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.ProductCostQuery query) throws Exception
	{
		return getProductCostsClient(dataViewMode,  query,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection> mozuClient=GetProductCostsClient(dataViewMode,  query,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCostCollection productCostCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCostCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCostCollection
	 * @see com.mozu.api.contracts.productruntime.ProductCostQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection> getProductCostsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.ProductCostQuery query, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductCostsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductCostCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductCostCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(query);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient(dataViewMode,  query);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query) throws Exception
	{
		return getProductInventoriesClient(dataViewMode,  query,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient(dataViewMode,  query,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoriesUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(query);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



