/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.products.BundledProduct;
import com.mozu.api.contracts.commerceruntime.products.Category;
import com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements;
import com.mozu.api.contracts.commerceruntime.products.ProductOption;
import com.mozu.api.contracts.commerceruntime.products.ProductPrice;
import com.mozu.api.contracts.commerceruntime.products.ProductProperty;
import com.mozu.api.contracts.commerceruntime.products.ProductStock;

/**
 *	Properties of a product set up in admin and added as an item in a cart or order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Allocation ID associated with this product on this order.
	 */
	protected  DateTime allocationExpiration;

	public DateTime getAllocationExpiration() {
		return this.allocationExpiration;
	}

	public void setAllocationExpiration(DateTime allocationExpiration) {
		this.allocationExpiration = allocationExpiration;
	}

	/**
	 * Allocation ID associated with this product on this order.
	 */
	protected  Integer allocationId;

	public Integer getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(Integer allocationId) {
		this.allocationId = allocationId;
	}

	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Indicates if the discount is restricted. If true, the system cannot apply any discounts to this product. Discount restrictions are defined at the master catalog level. Client administrators cannot override discount restrictions at the catalog level, but they can limit the restriction to a defined time interval.For price list entries, specifies whether discounts are restricted for the specific entry if  is set to .Refer to [Discount Restriction](../../../guides/catalog/price-lists.htm#discountrestriction) in the Price Lists guides topic for more information.
	 */
	protected  Boolean discountsRestricted;

	public Boolean getDiscountsRestricted() {
		return this.discountsRestricted;
	}

	public void setDiscountsRestricted(Boolean discountsRestricted) {
		this.discountsRestricted = discountsRestricted;
	}

	/**
	 * The date and time on which the discount restriction period ends.
	 */
	protected  DateTime discountsRestrictedEndDate;

	public DateTime getDiscountsRestrictedEndDate() {
		return this.discountsRestrictedEndDate;
	}

	public void setDiscountsRestrictedEndDate(DateTime discountsRestrictedEndDate) {
		this.discountsRestrictedEndDate = discountsRestrictedEndDate;
	}

	/**
	 * The date and time on which the discount restriction period starts.
	 */
	protected  DateTime discountsRestrictedStartDate;

	public DateTime getDiscountsRestrictedStartDate() {
		return this.discountsRestrictedStartDate;
	}

	public void setDiscountsRestrictedStartDate(DateTime discountsRestrictedStartDate) {
		this.discountsRestrictedStartDate = discountsRestrictedStartDate;
	}

	/**
	 * Fulfillment status of the product.
	 */
	protected  String fulfillmentStatus;

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
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
	 * The type of goods in a bundled product. A bundled product is composed of products associated to sell together. Possible values include â€œPhysicalâ€ and â€œDigitalCreditâ€. This comes from the `productType `of the product. Products are defaulted to a Physical `goodsType`. Gift cards have a `goodsType `of DigitalCredit.
	 */
	protected  String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	protected  String imageAlternateText;

	public String getImageAlternateText() {
		return this.imageAlternateText;
	}

	public void setImageAlternateText(String imageAlternateText) {
		this.imageAlternateText = imageAlternateText;
	}

	/**
	 * The URL link for the image file associated with a product or category.
	 */
	protected  String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Unique identifier of the product reservation associated with the component product in a product bundle or item in a cart/order. System-supplied and read only.
	 */
	protected  Integer productReservationId;

	public Integer getProductReservationId() {
		return this.productReservationId;
	}

	public void setProductReservationId(Integer productReservationId) {
		this.productReservationId = productReservationId;
	}

	protected  String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
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

	/**
	 * The universal product code (UPC) is the barcode defined for the product. The UPC is unique across all sales channels. 
	 */
	protected  String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	protected  String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
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

	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	protected  ProductStock stock;

	public ProductStock getStock() {
		return this.stock;
	}

	public void setStock(ProductStock stock) {
		this.stock = stock;
	}


}
