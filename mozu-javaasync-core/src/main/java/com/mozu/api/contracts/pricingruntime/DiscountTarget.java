/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountTarget implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The operator to use on the excludedCategories field. Valid values are: "All" and "Any".
	 */
	protected  String excludedCategoriesOperator;

	public String getExcludedCategoriesOperator() {
		return this.excludedCategoriesOperator;
	}

	public void setExcludedCategoriesOperator(String excludedCategoriesOperator) {
		this.excludedCategoriesOperator = excludedCategoriesOperator;
	}

	/**
	 * A list of categories to be excluded from the discount.
	 */
	protected List<Integer> excludedCategoryIds;
	public List<Integer> getExcludedCategoryIds() {
		return this.excludedCategoryIds;
	}
	public void setExcludedCategoryIds(List<Integer> excludedCategoryIds) {
		this.excludedCategoryIds = excludedCategoryIds;
	}

	/**
	 * A list of product codes to be excluded from the discount.
	 */
	protected List<String> excludedProductCodes;
	public List<String> getExcludedProductCodes() {
		return this.excludedProductCodes;
	}
	public void setExcludedProductCodes(List<String> excludedProductCodes) {
		this.excludedProductCodes = excludedProductCodes;
	}

	/**
	 * If true, the target discount applies to all products sold on the site, regardless of product category.
	 */
	protected  Boolean includeAllProducts;

	public Boolean getIncludeAllProducts() {
		return this.includeAllProducts;
	}

	public void setIncludeAllProducts(Boolean includeAllProducts) {
		this.includeAllProducts = includeAllProducts;
	}

	/**
	 * The operator of the includedCategories field.Valid values are: "All" and "Any".
	 */
	protected  String includedCategoriesOperator;

	public String getIncludedCategoriesOperator() {
		return this.includedCategoriesOperator;
	}

	public void setIncludedCategoriesOperator(String includedCategoriesOperator) {
		this.includedCategoriesOperator = includedCategoriesOperator;
	}

	/**
	 * A list of categories to be included with the discount.
	 */
	protected List<Integer> includedCategoryIds;
	public List<Integer> getIncludedCategoryIds() {
		return this.includedCategoryIds;
	}
	public void setIncludedCategoryIds(List<Integer> includedCategoryIds) {
		this.includedCategoryIds = includedCategoryIds;
	}

	/**
	 * A list of product codes to be included in the discount.
	 */
	protected List<String> includedProductCodes;
	public List<String> getIncludedProductCodes() {
		return this.includedProductCodes;
	}
	public void setIncludedProductCodes(List<String> includedProductCodes) {
		this.includedProductCodes = includedProductCodes;
	}

	/**
	 * The list of shipping method codes that represents the shipping service types to which the discount can apply.
	 */
	protected List<String> shippingMethods;
	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

	/**
	 * The list of shipping zones that are applicable for this discount.
	 */
	protected List<String> shippingZones;
	public List<String> getShippingZones() {
		return this.shippingZones;
	}
	public void setShippingZones(List<String> shippingZones) {
		this.shippingZones = shippingZones;
	}

	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
