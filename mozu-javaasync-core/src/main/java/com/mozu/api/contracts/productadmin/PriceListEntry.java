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
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.PriceListEntryExtra;
import com.mozu.api.contracts.productadmin.ProductOption;
import com.mozu.api.contracts.productadmin.PriceListEntryPrice;

/**
 *	The details of the price list entry.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListEntry implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.ProductAdmin.Contracts.PriceListEntry cost ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Double cost;

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * Specifies whether the product's cost is the default catalog cost or is overridden. If this property is set to ,  cannot not be null.This property has the following valid values:* * 
	 */
	protected  String costMode;

	public String getCostMode() {
		return this.costMode;
	}

	public void setCostMode(String costMode) {
		this.costMode = costMode;
	}

	/**
	 * The localized currency code for the monetary amount. 
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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
	 * Specifies whether to use the default catalog setting for discount restriction, or to override the default catalog setting.Refer to [Discount Restriction](https://www.mozu.com/docs/guides/catalog/price-lists.htm#discountrestriction) in the Price Lists guides topic for more information.This property has the following valid values:* * 
	 */
	protected  String discountsRestrictedMode;

	public String getDiscountsRestrictedMode() {
		return this.discountsRestrictedMode;
	}

	public void setDiscountsRestrictedMode(String discountsRestrictedMode) {
		this.discountsRestrictedMode = discountsRestrictedMode;
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
	 * Specifies the date in UTC format when the price list entry is no longer in effect. This property is optional.
	 */
	protected  DateTime endDate;

	public DateTime getEndDate() {
		return this.endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 * Specifies whether the product in the price list entry is a product variant.Refer to [Configurable Products with Options](https://www.mozu.com/docs/guides/catalog/price-lists.htm#product_variants) in the Price Lists guides topic for more information.
	 */
	protected  Boolean isVariation;

	public Boolean getIsVariation() {
		return this.isVariation;
	}

	public void setIsVariation(Boolean isVariation) {
		this.isVariation = isVariation;
	}

	/**
	 * The minimum advertised price (MAP) of the product, if  is set to .
	 */
	protected  Double map;

	public Double getMap() {
		return this.map;
	}

	public void setMap(Double map) {
		this.map = map;
	}

	/**
	 * The date the price list entry's map is no longer in effect.
	 */
	protected  DateTime mapEndDate;

	public DateTime getMapEndDate() {
		return this.mapEndDate;
	}

	public void setMapEndDate(DateTime mapEndDate) {
		this.mapEndDate = mapEndDate;
	}

	/**
	 * Specifies whether to use the product's default catalog map, or to override the product's default catalog map.This property has the following valid values:* * 
	 */
	protected  String mapMode;

	public String getMapMode() {
		return this.mapMode;
	}

	public void setMapMode(String mapMode) {
		this.mapMode = mapMode;
	}

	/**
	 * The date the price list entry's map takes effect.
	 */
	protected  DateTime mapStartDate;

	public DateTime getMapStartDate() {
		return this.mapStartDate;
	}

	public void setMapStartDate(DateTime mapStartDate) {
		this.mapStartDate = mapStartDate;
	}

	/**
	 * The manufacturer's suggested retail price (MSRP) for the product. This content may be defined by the supplier.
	 */
	protected  Double msrp;

	public Double getMsrp() {
		return this.msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	/**
	 * Specifies whether to use the product's default catalog msrp, or to override the product's default catalog msrp.
	 */
	protected  String msrpMode;

	public String getMsrpMode() {
		return this.msrpMode;
	}

	public void setMsrpMode(String msrpMode) {
		this.msrpMode = msrpMode;
	}

	/**
	 * External unique identifier of the Price List. Must be unique an only contain url sanitized characters. The max length is 50.
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * This property is for future price list functionality and currently should always be .
	 */
	protected  String priceListEntryMode;

	public String getPriceListEntryMode() {
		return this.priceListEntryMode;
	}

	public void setPriceListEntryMode(String priceListEntryMode) {
		this.priceListEntryMode = priceListEntryMode;
	}

	/**
	 * This property is used for referencing the price list entry. Read-only.
	 */
	protected  Integer priceListEntrySequence;

	public Integer getPriceListEntrySequence() {
		return this.priceListEntrySequence;
	}

	public void setPriceListEntrySequence(Integer priceListEntrySequence) {
		this.priceListEntrySequence = priceListEntrySequence;
	}

	/**
	 * The unique identifier of the price list entry type.
	 */
	protected  String priceListEntryTypeCode;

	public String getPriceListEntryTypeCode() {
		return this.priceListEntryTypeCode;
	}

	public void setPriceListEntryTypeCode(String priceListEntryTypeCode) {
		this.priceListEntryTypeCode = priceListEntryTypeCode;
	}

	/**
	 * The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The name of the product that represents a line item in a taxable order or product bundle.
	 */
	protected  String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Specifies the date and time in UTC format when the price list entry is in effect.
	 */
	protected  DateTime startDate;

	public DateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * A list of product extras associated with the price list entry.Refer to [Extras](https://www.mozu.com/docs/guides/catalog/price-lists.htm#extras) in the Price Lists guides topic for more information.
	 */
	protected List<PriceListEntryExtra> extraEntries;
	public List<PriceListEntryExtra> getExtraEntries() {
		return this.extraEntries;
	}
	public void setExtraEntries(List<PriceListEntryExtra> extraEntries) {
		this.extraEntries = extraEntries;
	}

	/**
	 * List of option attributes configured for an object. These values are associated and used by products, product bundles, and product types.
	 */
	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	/**
	 * A list of product pricing information associated with the price list entry.
	 */
	protected List<PriceListEntryPrice> priceEntries;
	public List<PriceListEntryPrice> getPriceEntries() {
		return this.priceEntries;
	}
	public void setPriceEntries(List<PriceListEntryPrice> priceEntries) {
		this.priceEntries = priceEntries;
	}


}
