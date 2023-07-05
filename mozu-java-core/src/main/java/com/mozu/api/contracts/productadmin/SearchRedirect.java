/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchRedirect implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String redirectId;

	public String getRedirectId() {
		return this.redirectId;
	}

	public void setRedirectId(String redirectId) {
		this.redirectId = redirectId;
	}

	protected List<String> searchTermList;
	public List<String> getSearchTermList() {
		return this.searchTermList;
	}
	public void setSearchTermList(List<String> searchTermList) {
		this.searchTermList = searchTermList;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  Integer statusId;

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected  String url;

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}