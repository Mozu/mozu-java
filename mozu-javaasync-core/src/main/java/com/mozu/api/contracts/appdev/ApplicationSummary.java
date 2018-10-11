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
import com.mozu.api.contracts.appdev.AppVersion;

/**
 *	This property is not exposed in documentation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationSummary implements Serializable
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
	 * The AppKey is a runtime type.
	 */
	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer applicationId;

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationNamespace ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String applicationNamespace;

	public String getApplicationNamespace() {
		return this.applicationNamespace;
	}

	public void setApplicationNamespace(String applicationNamespace) {
		this.applicationNamespace = applicationNamespace;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationStatusId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer applicationStatusId;

	public Integer getApplicationStatusId() {
		return this.applicationStatusId;
	}

	public void setApplicationStatusId(Integer applicationStatusId) {
		this.applicationStatusId = applicationStatusId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationStatusName ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String applicationStatusName;

	public String getApplicationStatusName() {
		return this.applicationStatusName;
	}

	public void setApplicationStatusName(String applicationStatusName) {
		this.applicationStatusName = applicationStatusName;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationTypeId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer applicationTypeId;

	public Integer getApplicationTypeId() {
		return this.applicationTypeId;
	}

	public void setApplicationTypeId(Integer applicationTypeId) {
		this.applicationTypeId = applicationTypeId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary appSchemeVersion ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Byte appSchemeVersion;

	public Byte getAppSchemeVersion() {
		return this.appSchemeVersion;
	}

	public void setAppSchemeVersion(Byte appSchemeVersion) {
		this.appSchemeVersion = appSchemeVersion;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary hasVersions ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Boolean hasVersions;

	public Boolean getHasVersions() {
		return this.hasVersions;
	}

	public void setHasVersions(Boolean hasVersions) {
		this.hasVersions = hasVersions;
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
	 * The AppKey is a runtime type. This only applies for themes that inherit from another theme.
	 */
	protected  String parentAppKey;

	public String getParentAppKey() {
		return this.parentAppKey;
	}

	public void setParentAppKey(String parentAppKey) {
		this.parentAppKey = parentAppKey;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary parentName ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String parentName;

	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary releasePackageId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer releasePackageId;

	public Integer getReleasePackageId() {
		return this.releasePackageId;
	}

	public void setReleasePackageId(Integer releasePackageId) {
		this.releasePackageId = releasePackageId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary releasePackageName ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String releasePackageName;

	public String getReleasePackageName() {
		return this.releasePackageName;
	}

	public void setReleasePackageName(String releasePackageName) {
		this.releasePackageName = releasePackageName;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary updateAvailable ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Boolean updateAvailable;

	public Boolean getUpdateAvailable() {
		return this.updateAvailable;
	}

	public void setUpdateAvailable(Boolean updateAvailable) {
		this.updateAvailable = updateAvailable;
	}

	/**
	 * The AppKey is a runtime type. This only applies for themes that inherit from another theme. It shows the most current update available.
	 */
	protected  String updateParentAppKey;

	public String getUpdateParentAppKey() {
		return this.updateParentAppKey;
	}

	public void setUpdateParentAppKey(String updateParentAppKey) {
		this.updateParentAppKey = updateParentAppKey;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationSummary applicationVersion ApiTypeMember DOCUMENT_HERE 
	 */
	protected  AppVersion applicationVersion;

	public AppVersion getApplicationVersion() {
		return this.applicationVersion;
	}

	public void setApplicationVersion(AppVersion applicationVersion) {
		this.applicationVersion = applicationVersion;
	}


}
