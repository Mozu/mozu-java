/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.application;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.thirdparty.ActiveShippingCountry;
import com.mozu.api.contracts.core.thirdparty.OperationUrl;
import com.mozu.api.contracts.core.thirdparty.InitializablePropertyValue;
import com.mozu.api.contracts.core.thirdparty.InitializableShippingCountryPropertyValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Capability implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<String> activeCreditTypes;
	public List<String> getActiveCreditTypes() {
		return this.activeCreditTypes;
	}
	public void setActiveCreditTypes(List<String> activeCreditTypes) {
		this.activeCreditTypes = activeCreditTypes;
	}

	protected List<String> activeShoppingCountries;
	public List<String> getActiveShoppingCountries() {
		return this.activeShoppingCountries;
	}
	public void setActiveShoppingCountries(List<String> activeShoppingCountries) {
		this.activeShoppingCountries = activeShoppingCountries;
	}

	protected String capabilityMode;

	public String getCapabilityMode() {
		return this.capabilityMode;
	}

	public void setCapabilityMode(String capabilityMode) {
		this.capabilityMode = capabilityMode;
	}

	protected String capabilityType;

	public String getCapabilityType() {
		return this.capabilityType;
	}

	public void setCapabilityType(String capabilityType) {
		this.capabilityType = capabilityType;
	}

	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	protected Integer scopeId;

	public Integer getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(Integer scopeId) {
		this.scopeId = scopeId;
	}

	protected String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	protected List<ActiveShippingCountry> activeShippingCountries;
	public List<ActiveShippingCountry> getActiveShippingCountries() {
		return this.activeShippingCountries;
	}
	public void setActiveShippingCountries(List<ActiveShippingCountry> activeShippingCountries) {
		this.activeShippingCountries = activeShippingCountries;
	}

	protected List<OperationUrl> operationUrls;
	public List<OperationUrl> getOperationUrls() {
		return this.operationUrls;
	}
	public void setOperationUrls(List<OperationUrl> operationUrls) {
		this.operationUrls = operationUrls;
	}

	protected List<InitializablePropertyValue> supportedCreditTypes;
	public List<InitializablePropertyValue> getSupportedCreditTypes() {
		return this.supportedCreditTypes;
	}
	public void setSupportedCreditTypes(List<InitializablePropertyValue> supportedCreditTypes) {
		this.supportedCreditTypes = supportedCreditTypes;
	}

	protected List<InitializableShippingCountryPropertyValue> supportedShippingCountries;
	public List<InitializableShippingCountryPropertyValue> getSupportedShippingCountries() {
		return this.supportedShippingCountries;
	}
	public void setSupportedShippingCountries(List<InitializableShippingCountryPropertyValue> supportedShippingCountries) {
		this.supportedShippingCountries = supportedShippingCountries;
	}

	protected List<InitializablePropertyValue> supportedShoppingCountries;
	public List<InitializablePropertyValue> getSupportedShoppingCountries() {
		return this.supportedShoppingCountries;
	}
	public void setSupportedShoppingCountries(List<InitializablePropertyValue> supportedShoppingCountries) {
		this.supportedShoppingCountries = supportedShoppingCountries;
	}

}
