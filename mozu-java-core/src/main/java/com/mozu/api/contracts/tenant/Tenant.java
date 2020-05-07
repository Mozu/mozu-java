/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.tenant;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.tenant.TenantAttribute;
import com.mozu.api.contracts.tenant.MasterCatalog;
import com.mozu.api.contracts.tenant.Site;

/**
 *	Properties of a tenant, which the logical grouping of all a company's sites and catalogs.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tenant implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String domain;

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected  Boolean isDevTenant;

	public Boolean getIsDevTenant() {
		return this.isDevTenant;
	}

	public void setIsDevTenant(Boolean isDevTenant) {
		this.isDevTenant = isDevTenant;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  Integer omsMerchantId;

	public Integer getOmsMerchantId() {
		return this.omsMerchantId;
	}

	public void setOmsMerchantId(Integer omsMerchantId) {
		this.omsMerchantId = omsMerchantId;
	}

	protected List<TenantAttribute> attributes;
	public List<TenantAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<TenantAttribute> attributes) {
		this.attributes = attributes;
	}

	protected List<MasterCatalog> masterCatalogs;
	public List<MasterCatalog> getMasterCatalogs() {
		return this.masterCatalogs;
	}
	public void setMasterCatalogs(List<MasterCatalog> masterCatalogs) {
		this.masterCatalogs = masterCatalogs;
	}

	protected List<Site> sites;
	public List<Site> getSites() {
		return this.sites;
	}
	public void setSites(List<Site> sites) {
		this.sites = sites;
	}


}
