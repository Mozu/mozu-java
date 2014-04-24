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
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent;

/**
 *	Properties of an individual vocabulary value for an attribute. For example, a "color" attribute might have the following vocabulary values: Red, Blue, Green.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The actual vocabulary value.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * The number that denotes the order of the entity value within a list of entity values.
	 */
	protected Integer valueSequence;

	public Integer getValueSequence() {
		return this.valueSequence;
	}

	public void setValueSequence(Integer valueSequence) {
		this.valueSequence = valueSequence;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected AttributeVocabularyValueLocalizedContent content;

	public AttributeVocabularyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeVocabularyValueLocalizedContent content) {
		this.content = content;
	}

}
