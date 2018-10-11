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
import com.mozu.api.contracts.installedapplications.Capability;

/**
 *	Properties of an app installed in a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of an app available in your  tenant or within  Dev Center. This ID is unique across all apps installed, initialized, and enabled in the  and those in development through the Dev Center Console.
	 */
	protected  String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * Unique identifier of an app or theme available in your  tenant or within  Dev Center. An appKey is composed of Developer Account namespace, app/theme ID, version, and package (e.g., devAccount.helloWorld.1.0.0.Release). 
	 */
	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Indicates if a capability, function tied to an Arc.js action, application, or price list is enabled for the tenant/site. If true, the capability/application/function/price list is enabled for the tenant. System-supplied and read-only with the exception of functions tied to an Arc.js action and price lists.
	 */
	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Indicates if an app is initialized and capable of being enabled in the tenant and site. Apps will need to be installed and configured to become initialized, such as validating credentials and/or API keys with a third-party service. If true, the app is initialized and can be enabled for usage.
	 */
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
	 * Indicates if an Arc.js application is certified to run on tenants that lack a full installation of the Arc.js framework.
	 */
	protected  Boolean isExtensionCertified;

	public Boolean getIsExtensionCertified() {
		return this.isExtensionCertified;
	}

	public void setIsExtensionCertified(Boolean isExtensionCertified) {
		this.isExtensionCertified = isExtensionCertified;
	}

	/**
	 * The URL defined for the application that represents the configuration website for the capability. This value is used by installed applications or the site.
	 */
	protected  String uiConfigurationUrl;

	public String getUiConfigurationUrl() {
		return this.uiConfigurationUrl;
	}

	public void setUiConfigurationUrl(String uiConfigurationUrl) {
		this.uiConfigurationUrl = uiConfigurationUrl;
	}

	/**
	 * List of capabilities installed in a tenant.
	 */
	protected List<Capability> capabilities;
	public List<Capability> getCapabilities() {
		return this.capabilities;
	}
	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}


}
