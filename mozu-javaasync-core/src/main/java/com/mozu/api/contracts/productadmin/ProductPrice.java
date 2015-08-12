/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The price of the product in the specified currency code (USD). This price can either be the sale price or the price for which the merchang intends to sell the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The credit value of the product or bundled product. When the `goodsType `is `DigitalCredit`, this value is populated to indicate the value of the credit. This is used to create store credit in the fulfillment of gift cards.
	 */
	protected Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String isoCurrencyCode;

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	/**
	 * The minimum advertised price a client can charge for the associated product, as determined by the supplier. Client administrators can override the minimum advertised price at the catalog level.
	 */
	protected Double map;

	public Double getMap() {
		return this.map;
	}

	public void setMap(Double map) {
		this.map = map;
	}

	/**
	 * If the product has a supplier-defined minimum advertised price, the date and time after which the client can sell the product for less than the minimum advertised price.
	 */
	protected DateTime mapEndDate;

	public DateTime getMapEndDate() {
		return this.mapEndDate;
	}

	public void setMapEndDate(DateTime mapEndDate) {
		this.mapEndDate = mapEndDate;
	}

	/**
	 * If the product has a supplier-defined minimum advertised price, the date and time after which the client cannot sell the product for less than the minimum advertised price.
	 */
	protected DateTime mapStartDate;

	public DateTime getMapStartDate() {
		return this.mapStartDate;
	}

	public void setMapStartDate(DateTime mapStartDate) {
		this.mapStartDate = mapStartDate;
	}

	/**
	 * The manufacturer's suggested retail price for the product. This content may be defined by the supplier.
	 */
	protected Double msrp;

	public Double getMsrp() {
		return this.msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	/**
	 * Price that the merchant intends to sell the product which is not necessarily the list price. This is the price the merchant intends to sell the product if no sale price is present.
	 */
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * The set sale price for a product consisting of a price with a discount already applied.
	 */
	protected Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

}