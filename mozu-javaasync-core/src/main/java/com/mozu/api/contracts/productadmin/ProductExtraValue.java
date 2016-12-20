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
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice;

/**
 *	Properties of a defined value for a product extra attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductExtraValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The difference between the weight associated with this product, variation option, or extra and the base product. For example, if a product with a monogram weighs an extra 1/4 lb, the DeltaWeight value is "0.25". The amount of the delta is set by the weight type for the storefront.
	 */
	protected  Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	/**
	 * If true, the value for the product extra is selected by default. Shopper entered extras cannot be defaulted.
	 */
	protected  Boolean isDefaulted;

	public Boolean getIsDefaulted() {
		return this.isDefaulted;
	}

	public void setIsDefaulted(Boolean isDefaulted) {
		this.isDefaulted = isDefaulted;
	}

	/**
	 * The specified quantity of objects and items. This property is used for numerous object types including products, options, components within a product bundle, cart and order items, returned items, shipping line items, items in a digital product. and items associated with types and reservations.
	 */
	protected  Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected  Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * Properties of an individual vocabulary value for an attribute. For example, a "color" attribute might have the following vocabulary values: Red, Blue, Green.
	 */
	protected  AttributeVocabularyValue attributeVocabularyValueDetail;

	public AttributeVocabularyValue getAttributeVocabularyValueDetail() {
		return this.attributeVocabularyValueDetail;
	}

	public void setAttributeVocabularyValueDetail(AttributeVocabularyValue attributeVocabularyValueDetail) {
		this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
	}

	/**
	 * The difference between associated prices for a product, variation option, or extra. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. For example, if a product with a defined monogram extra costs an additional $10, the `deltaPrice `value is "10". Between options, a price for a medium may be $10 and a large $12 giving a `deltaPrice `value of "2".
	 */
	protected  ProductExtraValueDeltaPrice deltaPrice;

	public ProductExtraValueDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductExtraValueDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	 * The difference between associated prices for a product, variation option, or extra that is localized per the `localeCode`. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. Depending on the localeCode, the price may be converted such as from USD (US Dollar) to EUR (euro).
	 */
	protected List<ProductExtraValueDeltaPrice> localizedDeltaPrice;
	public List<ProductExtraValueDeltaPrice> getLocalizedDeltaPrice() {
		return this.localizedDeltaPrice;
	}
	public void setLocalizedDeltaPrice(List<ProductExtraValueDeltaPrice> localizedDeltaPrice) {
		this.localizedDeltaPrice = localizedDeltaPrice;
	}


}
