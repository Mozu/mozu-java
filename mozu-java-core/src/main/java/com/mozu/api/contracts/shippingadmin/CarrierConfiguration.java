/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.shippingadmin.CustomTableRate;
import com.mozu.api.contracts.shippingadmin.Setting;

/**
 *	Properties of a carrier configured in the shipping admin.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarrierConfiguration implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean areCredentialsSet;

	public Boolean getAreCredentialsSet() {
		return this.areCredentialsSet;
	}

	public void setAreCredentialsSet(Boolean areCredentialsSet) {
		this.areCredentialsSet = areCredentialsSet;
	}

	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected  Boolean enabledForReturns;

	public Boolean getEnabledForReturns() {
		return this.enabledForReturns;
	}

	public void setEnabledForReturns(Boolean enabledForReturns) {
		this.enabledForReturns = enabledForReturns;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<CustomTableRate> customTableRates;
	public List<CustomTableRate> getCustomTableRates() {
		return this.customTableRates;
	}
	public void setCustomTableRates(List<CustomTableRate> customTableRates) {
		this.customTableRates = customTableRates;
	}

	protected List<Setting> settings;
	public List<Setting> getSettings() {
		return this.settings;
	}
	public void setSettings(List<Setting> settings) {
		this.settings = settings;
	}


}
