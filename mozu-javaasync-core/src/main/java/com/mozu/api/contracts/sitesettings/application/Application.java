/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.application;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.sitesettings.application.Capability;

/**
 *	Properties of an application installed in a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * denotes the Application Key for the app.
	 */
	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected  Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	/**
	 * Indicates if the installed application is of type extension. An extension is an application that extends upon the  infrastructure. Examples of extensions include Arc.js applications and applications that integrate third-party services.
	 */
	protected  Boolean isExtension;

	public Boolean getIsExtension() {
		return this.isExtension;
	}

	public void setIsExtension(Boolean isExtension) {
		this.isExtension = isExtension;
	}

	/**
	 * Indicates if the installed application is a  certified application.
	 */
	protected  Boolean isExtensionCertified;

	public Boolean getIsExtensionCertified() {
		return this.isExtensionCertified;
	}

	public void setIsExtensionCertified(Boolean isExtensionCertified) {
		this.isExtensionCertified = isExtensionCertified;
	}

	protected  String uiConfigurationUrl;

	public String getUiConfigurationUrl() {
		return this.uiConfigurationUrl;
	}

	public void setUiConfigurationUrl(String uiConfigurationUrl) {
		this.uiConfigurationUrl = uiConfigurationUrl;
	}

	protected List<Capability> capabilities;
	public List<Capability> getCapabilities() {
		return this.capabilities;
	}
	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}


}
