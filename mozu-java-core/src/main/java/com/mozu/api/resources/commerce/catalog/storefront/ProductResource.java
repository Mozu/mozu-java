/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

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
 * Use the Storefront Products  resource to manage the shopper product selection process during a visit to the web storefront. You can update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of products that appear on the web storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductCollection productCollection = product.getProducts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ProductCollection
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public com.mozu.api.contracts.productruntime.ProductCollection getProducts() throws Exception
	{
		return getProducts( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of products that appear on the web storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductCollection productCollection = product.getProducts( filter,  startIndex,  pageSize,  sortBy,  responseOptions,  cursorMark,  responseFields);
	 * </code></pre></p>
	 * @param cursorMark 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param responseOptions 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productruntime.ProductCollection
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public com.mozu.api.contracts.productruntime.ProductCollection getProducts(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseOptions, String cursorMark, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductsClient(_dataViewMode,  filter,  startIndex,  pageSize,  sortBy,  responseOptions,  cursorMark,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	LocationInventoryCollection locationInventoryCollection = product.getProductInventory( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(String productCode) throws Exception
	{
		return getProductInventory( productCode,  null,  null);
	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	LocationInventoryCollection locationInventoryCollection = product.getProductInventory( productCode,  locationCodes,  responseFields);
	 * </code></pre></p>
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(String productCode, String locationCodes, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductInventoryClient(_dataViewMode,  productCode,  locationCodes,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProduct( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productruntime.Product
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public com.mozu.api.contracts.productruntime.Product getProduct(String productCode) throws Exception
	{
		return getProduct( productCode,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProduct( productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  supressOutOfStock404,  quantity,  acceptVariantProductCode,  responseFields);
	 * </code></pre></p>
	 * @param acceptVariantProductCode 
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param supressOutOfStock404 Specifies whether to supress the 404 error when the product is out of stock.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return com.mozu.api.contracts.productruntime.Product
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public com.mozu.api.contracts.productruntime.Product getProduct(String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, Boolean supressOutOfStock404, Integer quantity, Boolean acceptVariantProductCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Product> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductClient(_dataViewMode,  productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  supressOutOfStock404,  quantity,  acceptVariantProductCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves information about a single product given its product code for Mozu to index in the search engine
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProductForIndexing( productCode);
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return com.mozu.api.contracts.productruntime.Product
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public com.mozu.api.contracts.productruntime.Product getProductForIndexing(String productCode) throws Exception
	{
		return getProductForIndexing( productCode,  null,  null);
	}

	/**
	 * Retrieves information about a single product given its product code for Mozu to index in the search engine
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProductForIndexing( productCode,  productVersion,  responseFields);
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param productVersion 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productruntime.Product
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public com.mozu.api.contracts.productruntime.Product getProductForIndexing(String productCode, Long productVersion, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Product> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductForIndexingClient(_dataViewMode,  productCode,  productVersion,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ConfiguredProduct configuredProduct = product.configuredProduct( productOptionSelections,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return configuredProduct( productOptionSelections,  productCode,  null,  null,  null,  null);
	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ConfiguredProduct configuredProduct = product.configuredProduct( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.configuredProductClient( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductValidationSummary productValidationSummary = product.validateProduct( productOptionSelections,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return validateProduct( productOptionSelections,  productCode,  null,  null,  null);
	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductValidationSummary productValidationSummary = product.validateProduct( productOptionSelections,  productCode,  skipInventoryCheck,  quantity,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, Integer quantity, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.validateProductClient( productOptionSelections,  productCode,  skipInventoryCheck,  quantity,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Evaluates whether a collection of discounts specified in the request can be redeemed for the supplied product code.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	DiscountValidationSummary discountValidationSummary = product.validateDiscounts( discountSelections,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode) throws Exception
	{
		return validateDiscounts( discountSelections,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Evaluates whether a collection of discounts specified in the request can be redeemed for the supplied product code.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	DiscountValidationSummary discountValidationSummary = product.validateDiscounts( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @param discountSelections The discounts to evaluate for a specified product code at the time of purchase.
	 * @return com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.validateDiscountsClient( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves product inventories for the storefront displayed products.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	LocationInventoryCollection locationInventoryCollection = product.getProductInventories( query);
	 * </code></pre></p>
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(com.mozu.api.contracts.productruntime.LocationInventoryQuery query) throws Exception
	{
		return getProductInventories( query,  null);
	}

	/**
	 * Retrieves product inventories for the storefront displayed products.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	LocationInventoryCollection locationInventoryCollection = product.getProductInventories( query,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @return com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductInventoriesClient(_dataViewMode,  query,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



