/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.Discount;
import com.mozu.api.contracts.productruntime.BundledProduct;
import com.mozu.api.contracts.productruntime.Category;
import com.mozu.api.contracts.productruntime.ProductContent;
import com.mozu.api.contracts.productruntime.ProductInventoryInfo;
import com.mozu.api.contracts.productruntime.PackageMeasurements;
import com.mozu.api.contracts.productruntime.ProductOption;
import com.mozu.api.contracts.productruntime.ProductPrice;
import com.mozu.api.contracts.productruntime.ProductPriceRange;
import com.mozu.api.contracts.productruntime.ProductPricingBehaviorInfo;
import com.mozu.api.contracts.productruntime.ProductProperty;
import com.mozu.api.contracts.productruntime.ProductPurchasableState;
import com.mozu.api.contracts.productruntime.VariationSummary;
import com.mozu.api.contracts.productruntime.ProductVolumePrice;

/**
 *	The properties of a product, referenced and used by carts, orders, wish lists, and returns.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The date and time in UTC when the product is no longer active in the catalog.
	 */
	protected  DateTime catalogEndDate;

	public DateTime getCatalogEndDate() {
		return this.catalogEndDate;
	}

	public void setCatalogEndDate(DateTime catalogEndDate) {
		this.catalogEndDate = catalogEndDate;
	}

	/**
	 * The date and time in UTC format when the product is active in the catalog.
	 */
	protected  DateTime catalogStartDate;

	public DateTime getCatalogStartDate() {
		return this.catalogStartDate;
	}

	public void setCatalogStartDate(DateTime catalogStartDate) {
		this.catalogStartDate = catalogStartDate;
	}

	protected  DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * The date and time in UTC format when the product first became available in the catalog. This field is used to calculate the number of days the product has been available in the catalog for a dynamic expression.
	 */
	protected  DateTime dateFirstAvailableInCatalog;

	public DateTime getDateFirstAvailableInCatalog() {
		return this.dateFirstAvailableInCatalog;
	}

	public void setDateFirstAvailableInCatalog(DateTime dateFirstAvailableInCatalog) {
		this.dateFirstAvailableInCatalog = dateFirstAvailableInCatalog;
	}

	/**
	 * The total number of days the product has been available in the catalog. This field is related to the DaysAvailableInCatalog field in a dynamic expression.
	 */
	protected  Integer daysAvailableInCatalog;

	public Integer getDaysAvailableInCatalog() {
		return this.daysAvailableInCatalog;
	}

	public void setDaysAvailableInCatalog(Integer daysAvailableInCatalog) {
		this.daysAvailableInCatalog = daysAvailableInCatalog;
	}

	/**
	 * List of supported types of fulfillment for the product or variation. The types include direct ship, in-store pickup, or both.
	 */
	protected List<String> fulfillmentTypesSupported;
	public List<String> getFulfillmentTypesSupported() {
		return this.fulfillmentTypesSupported;
	}
	public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
		this.fulfillmentTypesSupported = fulfillmentTypesSupported;
	}

	/**
	 * The type of goods in a bundled product. A bundled product is composed of products associated to sell together. Possible values include Physical and DigitalCredit. This comes from the `productType `of the product. Products are defaulted to a Physical `goodsType`. Gift cards have a `goodsType `of DigitalCredit.
	 */
	protected  String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * Indicates if the product must be shipped alone in a container. This is used for products and products within a bundle. If true, this product cannot be shipped in a package with other items and must ship in a package by itself.
	 */
	protected  Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	protected  Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	protected  Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	protected List<String> locationsInStock;
	public List<String> getLocationsInStock() {
		return this.locationsInStock;
	}
	public void setLocationsInStock(List<String> locationsInStock) {
		this.locationsInStock = locationsInStock;
	}

	/**
	 * The manufacturer's part number for the product.
	 */
	protected  String mfgPartNumber;

	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * The list of manufacturer part numbers defined for the product.
	 */
	protected List<String> mfgPartNumbers;
	public List<String> getMfgPartNumbers() {
		return this.mfgPartNumbers;
	}
	public void setMfgPartNumbers(List<String> mfgPartNumbers) {
		this.mfgPartNumbers = mfgPartNumbers;
	}

	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected  Integer productSequence;

	public Integer getProductSequence() {
		return this.productSequence;
	}

	public void setProductSequence(Integer productSequence) {
		this.productSequence = productSequence;
	}

	protected  String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * The unique identifier of the product type of the product.
	 */
	protected  Integer productTypeId;

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	/**
	 * The usage type that applies to this product, which is Standard (a single product without configurable options), Configurable (a product that includes configurable option attributes), Bundle (a collection of products sold as a single entity), or Component (an invididual product that represents a component in a bundle).
	 */
	protected  String productUsage;

	public String getProductUsage() {
		return this.productUsage;
	}

	public void setProductUsage(String productUsage) {
		this.productUsage = productUsage;
	}

	protected  String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	/**
	 * The location where the order item(s) was purchased.
	 */
	protected  String purchaseLocation;

	public String getPurchaseLocation() {
		return this.purchaseLocation;
	}

	public void setPurchaseLocation(String purchaseLocation) {
		this.purchaseLocation = purchaseLocation;
	}

	protected  String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * The list of universal product codes defined for the product.
	 */
	protected List<String> upCs;
	public List<String> getUpCs() {
		return this.upCs;
	}
	public void setUpCs(List<String> upCs) {
		this.upCs = upCs;
	}

	/**
	 * The date and time in UTC format the object was updated most recently.
	 */
	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * A list of price lists for which the product is valid.
	 */
	protected List<String> validPriceLists;
	public List<String> getValidPriceLists() {
		return this.validPriceLists;
	}
	public void setValidPriceLists(List<String> validPriceLists) {
		this.validPriceLists = validPriceLists;
	}

	protected  String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	protected List<Discount> availableShippingDiscounts;
	public List<Discount> getAvailableShippingDiscounts() {
		return this.availableShippingDiscounts;
	}
	public void setAvailableShippingDiscounts(List<Discount> availableShippingDiscounts) {
		this.availableShippingDiscounts = availableShippingDiscounts;
	}

	/**
	 * Properties of a collection of component products that make up a single product bundle with its own product code. Tenants can define product bundles for any product type that supports the Bundle product usage.
	 */
	protected List<BundledProduct> bundledProducts;
	public List<BundledProduct> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<BundledProduct> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	protected List<Category> categories;
	public List<Category> getCategories() {
		return this.categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	protected  ProductContent content;

	public ProductContent getContent() {
		return this.content;
	}

	public void setContent(ProductContent content) {
		this.content = content;
	}

	protected  ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	protected  PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	protected  ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	protected  ProductPriceRange priceRange;

	public ProductPriceRange getPriceRange() {
		return this.priceRange;
	}

	public void setPriceRange(ProductPriceRange priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * Properties that describe the behavior the system uses when determining the price of products.
	 */
	protected  ProductPricingBehaviorInfo pricingBehavior;

	public ProductPricingBehaviorInfo getPricingBehavior() {
		return this.pricingBehavior;
	}

	public void setPricingBehavior(ProductPricingBehaviorInfo pricingBehavior) {
		this.pricingBehavior = pricingBehavior;
	}

	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	protected  ProductPurchasableState purchasableState;

	public ProductPurchasableState getPurchasableState() {
		return this.purchasableState;
	}

	public void setPurchasableState(ProductPurchasableState purchasableState) {
		this.purchasableState = purchasableState;
	}

	/**
	 * A summary of all variations that exist for the product.
	 */
	protected List<VariationSummary> variations;
	public List<VariationSummary> getVariations() {
		return this.variations;
	}
	public void setVariations(List<VariationSummary> variations) {
		this.variations = variations;
	}

	/**
	 * The details of any volume price bands associated with the product.Refer to [Volume Pricing](https://www.mozu.com/docs/guides/catalog/price-lists.htm#volume_pricing) for more information.
	 */
	protected List<ProductVolumePrice> volumePriceBands;
	public List<ProductVolumePrice> getVolumePriceBands() {
		return this.volumePriceBands;
	}
	public void setVolumePriceBands(List<ProductVolumePrice> volumePriceBands) {
		this.volumePriceBands = volumePriceBands;
	}

	/**
	 * The details of the volume price range associated with the product. Volume price ranges consist of a lower price and an upper price, and either lower or upper prices can be affected by discounts.You can display the volume price range on product listing pages, such as category and search result pages, and product detail pages.Refer to [Volume Pricing Storefront Behavior](https://www.mozu.com/docs/guides/catalog/price-lists.htm#volume_pricing_storefront_behavior) for more information.
	 */
	protected  ProductPriceRange volumePriceRange;

	public ProductPriceRange getVolumePriceRange() {
		return this.volumePriceRange;
	}

	public void setVolumePriceRange(ProductPriceRange volumePriceRange) {
		this.volumePriceRange = volumePriceRange;
	}


}
