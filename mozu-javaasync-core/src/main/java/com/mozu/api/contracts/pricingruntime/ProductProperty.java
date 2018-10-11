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
import com.mozu.api.contracts.pricingruntime.ProductAttribute;
import com.mozu.api.contracts.pricingruntime.ProductPropertyValue;

/**
 *	Details of a property defined for a product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProperty implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	protected  Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	protected  Boolean isMultiValue;

	public Boolean getIsMultiValue() {
		return this.isMultiValue;
	}

	public void setIsMultiValue(Boolean isMultiValue) {
		this.isMultiValue = isMultiValue;
	}

	protected  ProductAttribute attributeDetail;

	public ProductAttribute getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(ProductAttribute attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	protected List<ProductPropertyValue> values;
	public List<ProductPropertyValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductPropertyValue> values) {
		this.values = values;
	}


}
