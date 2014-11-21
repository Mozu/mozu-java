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
import com.mozu.api.contracts.productruntime.ProductContent;
import com.mozu.api.contracts.productruntime.ProductInventoryInfo;
import com.mozu.api.contracts.productruntime.PackageMeasurements;

/**
 *	Properties of a component product in a product bundle. A product bundle can represent either a collection of multiple products sold as a single entity, or a collection of the same product sold as a package. For example, a 10-pack of socks.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BundledProduct implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * When the goodsType is DigitalCredit this value is populated to indicate the value of the credit. This is used to create store credit in the fulfillment of gift cards.
	 */
	protected Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	/**
	 * This is the goods type of the product. Possible values are Physical,and DigitalCredit. This comes from the productType of the product. Products are defaulted to a Physical goodsType. Gift cards have a goodsType of DigitalCredit.
	 */
	protected String goodsType;

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * If true, the component product of the bundle should not ship in a package with the rest of the product bundle, and should ship in a package by itself. System-supplied and read only.
	 */
	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * BundledProducts result from a static bundle or are dynamically added as a result of the shopper selecting products as extras. When the bundled item is dynamic, it includes the attribute's fully qualified name of the extra that it came from. When optionAttributeFQN is null, the bundled item was statically defined, when not null, the item came from an extra selection.
	 */
	protected String optionAttributeFQN;

	public String getOptionAttributeFQN() {
		return this.optionAttributeFQN;
	}

	public void setOptionAttributeFQN(String optionAttributeFQN) {
		this.optionAttributeFQN = optionAttributeFQN;
	}

	/**
	 * Properties of a value associated with a product option attribute.
	 */
	protected Object optionValue;

	public Object getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(Object optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * The quantity of the component product in the product bundle. System-supplied and read only.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Localizable product content defined for the product bundle. System-supplied and read only.
	 */
	protected ProductContent content;

	public ProductContent getContent() {
		return this.content;
	}

	public void setContent(ProductContent content) {
		this.content = content;
	}

	/**
	 * This contains the inventory information about bundled products. If it manages stock, it specifies what the out of stock behavior is.
	 */
	protected ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

}
