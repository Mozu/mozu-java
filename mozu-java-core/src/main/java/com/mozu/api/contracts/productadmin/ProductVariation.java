/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductVariationFixedPrice;
import com.mozu.api.contracts.productadmin.ProductVariationOption;
import com.mozu.api.contracts.productadmin.ProductSupplierInfo;

/**
 *	Properties of a specific product variation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	/**
	 * If the product is in explicit pricing mode, this is the fixed weight of the variation.
	 */
	protected  Double fixedWeight;

	public Double getFixedWeight() {
		return this.fixedWeight;
	}

	public void setFixedWeight(Double fixedWeight) {
		this.fixedWeight = fixedWeight;
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

	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	protected  Boolean isOrphan;

	public Boolean getIsOrphan() {
		return this.isOrphan;
	}

	public void setIsOrphan(Boolean isOrphan) {
		this.isOrphan = isOrphan;
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

	protected  Boolean variationExists;

	public Boolean getVariationExists() {
		return this.variationExists;
	}

	public void setVariationExists(Boolean variationExists) {
		this.variationExists = variationExists;
	}

	protected  String variationkey;

	public String getVariationkey() {
		return this.variationkey;
	}

	public void setVariationkey(String variationkey) {
		this.variationkey = variationkey;
	}

	protected  String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	protected  ProductVariationDeltaPrice deltaPrice;

	public ProductVariationDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductVariationDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	 * If the product is in Explicit pricing mode, this is the price of the variation.Refer to [Product Variant Pricing and Weight](../../../guides/catalog/products.htm#product_variant_pricing_and_weight) in the Products guides topic for more information.
	 */
	protected  ProductVariationFixedPrice fixedPrice;

	public ProductVariationFixedPrice getFixedPrice() {
		return this.fixedPrice;
	}

	public void setFixedPrice(ProductVariationFixedPrice fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	/**
	 * The difference between associated prices for a product, variation option, or extra that is localized per the `localeCode`. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. Depending on the localeCode, the price may be converted such as from USD (USÂ Dollar) to EUR (euro).
	 */
	protected List<ProductVariationDeltaPrice> localizedDeltaPrice;
	public List<ProductVariationDeltaPrice> getLocalizedDeltaPrice() {
		return this.localizedDeltaPrice;
	}
	public void setLocalizedDeltaPrice(List<ProductVariationDeltaPrice> localizedDeltaPrice) {
		this.localizedDeltaPrice = localizedDeltaPrice;
	}

	/**
	 * Price of the variation using fixed per currency This collection allows for multiple currencies.
	 */
	protected List<ProductVariationFixedPrice> localizedFixedPrice;
	public List<ProductVariationFixedPrice> getLocalizedFixedPrice() {
		return this.localizedFixedPrice;
	}
	public void setLocalizedFixedPrice(List<ProductVariationFixedPrice> localizedFixedPrice) {
		this.localizedFixedPrice = localizedFixedPrice;
	}

	protected List<ProductVariationOption> options;
	public List<ProductVariationOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductVariationOption> options) {
		this.options = options;
	}

	/**
	 * Supplier-defined properties assigned for the product.
	 */
	protected  ProductSupplierInfo supplierInfo;

	public ProductSupplierInfo getSupplierInfo() {
		return this.supplierInfo;
	}

	public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
		this.supplierInfo = supplierInfo;
	}


}
