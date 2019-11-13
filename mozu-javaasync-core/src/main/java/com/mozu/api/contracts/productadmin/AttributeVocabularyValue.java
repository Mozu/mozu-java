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
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent;

/**
 *	Properties of a vocabulary value defined for an extensible attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The order in which the attribute value displays. If you omit a value for this property,  infers the display order from the attribute value's position the list.
	 */
	protected  Integer displayOrder;

	public Integer getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
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

	protected  Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	protected  Integer valueSequence;

	public Integer getValueSequence() {
		return this.valueSequence;
	}

	public void setValueSequence(Integer valueSequence) {
		this.valueSequence = valueSequence;
	}

	protected  AttributeVocabularyValueLocalizedContent content;

	public AttributeVocabularyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeVocabularyValueLocalizedContent content) {
		this.content = content;
	}

	/**
	 * The localized content associated with the object.
	 */
	protected List<AttributeVocabularyValueLocalizedContent> localizedContent;
	public List<AttributeVocabularyValueLocalizedContent> getLocalizedContent() {
		return this.localizedContent;
	}
	public void setLocalizedContent(List<AttributeVocabularyValueLocalizedContent> localizedContent) {
		this.localizedContent = localizedContent;
	}


}
