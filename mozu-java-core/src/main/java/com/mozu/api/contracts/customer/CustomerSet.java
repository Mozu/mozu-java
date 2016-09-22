/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.customer.CustomerSetAggregateInfo;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.customer.CustomerSetSite;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerSet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected  Boolean isDefault;

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  CustomerSetAggregateInfo aggregateInfo;

	public CustomerSetAggregateInfo getAggregateInfo() {
		return this.aggregateInfo;
	}

	public void setAggregateInfo(CustomerSetAggregateInfo aggregateInfo) {
		this.aggregateInfo = aggregateInfo;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<CustomerSetSite> sites;
	public List<CustomerSetSite> getSites() {
		return this.sites;
	}
	public void setSites(List<CustomerSetSite> sites) {
		this.sites = sites;
	}


}
