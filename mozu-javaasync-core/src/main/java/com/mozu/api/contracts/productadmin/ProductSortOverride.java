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
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.ProductAdmin.Contracts.ProductSortOverride ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSortOverride implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Flag to indicate that the product is pinned at the specified position. Not applicable to buried products.
	 */
	protected  Boolean isPinned;

	public Boolean getIsPinned() {
		return this.isPinned;
	}

	public void setIsPinned(Boolean isPinned) {
		this.isPinned = isPinned;
	}

	/**
	 * Indicates the relative position of the product to other overridden products. Position is absolute if IsPinned is true. Not applicable to buried products. Buried products will be given a default of -1.
	 */
	protected  Integer position;

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
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

	protected  String sliceValue;

	public String getSliceValue() {
		return this.sliceValue;
	}

	public void setSliceValue(String sliceValue) {
		this.sliceValue = sliceValue;
	}


}
