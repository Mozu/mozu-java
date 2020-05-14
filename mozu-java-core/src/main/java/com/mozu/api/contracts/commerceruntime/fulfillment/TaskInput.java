/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskInput implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String helpMessage;

	public String getHelpMessage() {
		return this.helpMessage;
	}

	public void setHelpMessage(String helpMessage) {
		this.helpMessage = helpMessage;
	}

	protected  String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	protected  Double maximum;

	public Double getMaximum() {
		return this.maximum;
	}

	public void setMaximum(Double maximum) {
		this.maximum = maximum;
	}

	protected  Integer maxLength;

	public Integer getMaxLength() {
		return this.maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	protected  Double minimum;

	public Double getMinimum() {
		return this.minimum;
	}

	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}

	protected  Integer minLength;

	public Integer getMinLength() {
		return this.minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected List<Object> options;
	public List<Object> getOptions() {
		return this.options;
	}
	public void setOptions(List<Object> options) {
		this.options = options;
	}

	protected  String pattern;

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	protected  Boolean required;

	public Boolean getRequired() {
		return this.required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}