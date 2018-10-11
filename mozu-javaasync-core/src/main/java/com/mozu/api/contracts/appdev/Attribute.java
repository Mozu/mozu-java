/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of an attribute used to describe customers or orders.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrator name associated with the object/data.
	 */
	protected  String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute applicationAttributeId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer applicationAttributeId;

	public Integer getApplicationAttributeId() {
		return this.applicationAttributeId;
	}

	public void setApplicationAttributeId(Integer applicationAttributeId) {
		this.applicationAttributeId = applicationAttributeId;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute attributeId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer attributeId;

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute code ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute fqn ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String fqn;

	public String getFqn() {
		return this.fqn;
	}

	public void setFqn(String fqn) {
		this.fqn = fqn;
	}

	/**
	 * The type of input selection used to define a value for the attribute, including Yes/No, Date, DateTime, List, TextBox, or TextArea.
	 */
	protected  String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected  Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute type ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Mozu.AppDev.Contracts.Attribute vocabularyJson ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String vocabularyJson;

	public String getVocabularyJson() {
		return this.vocabularyJson;
	}

	public void setVocabularyJson(String vocabularyJson) {
		this.vocabularyJson = vocabularyJson;
	}

	/**
	 * List of valid vocabulary values defined for an attribute.
	 */
	protected  String vocabularyValues;

	public String getVocabularyValues() {
		return this.vocabularyValues;
	}

	public void setVocabularyValues(String vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}


}
