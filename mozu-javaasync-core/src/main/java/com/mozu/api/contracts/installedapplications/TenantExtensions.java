/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.installedapplications;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.installedapplications.CustomFunctionsForAction;
import com.mozu.api.contracts.installedapplications.ExtensionConfiguration;

/**
 *	Mozu.InstalledApplications.Contracts.TenantExtensions ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantExtensions implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.InstalledApplications.Contracts.TenantExtensions defaultLogLevel ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String defaultLogLevel;

	public String getDefaultLogLevel() {
		return this.defaultLogLevel;
	}

	public void setDefaultLogLevel(String defaultLogLevel) {
		this.defaultLogLevel = defaultLogLevel;
	}

	/**
	 * Mozu.InstalledApplications.Contracts.TenantExtensions actions ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<CustomFunctionsForAction> actions;
	public List<CustomFunctionsForAction> getActions() {
		return this.actions;
	}
	public void setActions(List<CustomFunctionsForAction> actions) {
		this.actions = actions;
	}

	/**
	 * Mozu.InstalledApplications.Contracts.TenantExtensions configurations ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<ExtensionConfiguration> configurations;
	public List<ExtensionConfiguration> getConfigurations() {
		return this.configurations;
	}
	public void setConfigurations(List<ExtensionConfiguration> configurations) {
		this.configurations = configurations;
	}


}
