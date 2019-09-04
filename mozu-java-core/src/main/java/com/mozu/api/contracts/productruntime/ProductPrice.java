/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.AppliedDiscount;

/**
 *	The price of the product in the specified currency code (USD). This price can either be the sale price or the price for which the merchant intends to sell the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The list price of the product in the catalog.
	 */
	protected  Double catalogListPrice;

	public Double getCatalogListPrice() {
		return this.catalogListPrice;
	}

	public void setCatalogListPrice(Double catalogListPrice) {
		this.catalogListPrice = catalogListPrice;
	}

	/**
	 * The sale price defined for the product in the catalog.
	 */
	protected  Double catalogSalePrice;

	public Double getCatalogSalePrice() {
		return this.catalogSalePrice;
	}

	public void setCatalogSalePrice(Double catalogSalePrice) {
		this.catalogSalePrice = catalogSalePrice;
	}

	protected  Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	protected  String effectivePricelistCode;

	public String getEffectivePricelistCode() {
		return this.effectivePricelistCode;
	}

	public void setEffectivePricelistCode(String effectivePricelistCode) {
		this.effectivePricelistCode = effectivePricelistCode;
	}

	/**
	 * The manufacturer's suggested retail price for the product.
	 */
	protected  Double msrp;

	public Double getMsrp() {
		return this.msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	protected  Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	protected  String priceListEntryCode;

	public String getPriceListEntryCode() {
		return this.priceListEntryCode;
	}

	public void setPriceListEntryCode(String priceListEntryCode) {
		this.priceListEntryCode = priceListEntryCode;
	}

	protected  String priceListEntryMode;

	public String getPriceListEntryMode() {
		return this.priceListEntryMode;
	}

	public void setPriceListEntryMode(String priceListEntryMode) {
		this.priceListEntryMode = priceListEntryMode;
	}

	/**
	 * The price type that displays on the storefront website for the Price field, which is List, MAP, or CatalogSalePrice
	 */
	protected  String priceType;

	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	protected  Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * The price type that displays on the storefront website for the Sale Price field, which is CatalogSalePrice, DiscountedList, or DiscountedCatalogSalePrice
	 */
	protected  String salePriceType;

	public String getSalePriceType() {
		return this.salePriceType;
	}

	public void setSalePriceType(String salePriceType) {
		this.salePriceType = salePriceType;
	}

	protected  AppliedDiscount discount;

	public AppliedDiscount getDiscount() {
		return this.discount;
	}

	public void setDiscount(AppliedDiscount discount) {
		this.discount = discount;
	}


}
