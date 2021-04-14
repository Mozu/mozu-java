/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Behavior;
import com.mozu.api.contracts.core.roles.Owner;
import com.mozu.api.contracts.core.roles.Resource;
import com.mozu.api.contracts.core.UserScope;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Role implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected  Boolean isSystemRole;

	public Boolean getIsSystemRole() {
		return this.isSystemRole;
	}

	public void setIsSystemRole(Boolean isSystemRole) {
		this.isSystemRole = isSystemRole;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected List<String> tags;
	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<Behavior> behaviors;
	public List<Behavior> getBehaviors() {
		return this.behaviors;
	}
	public void setBehaviors(List<Behavior> behaviors) {
		this.behaviors = behaviors;
	}

	protected List<Owner> owners;
	public List<Owner> getOwners() {
		return this.owners;
	}
	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}

	protected List<Resource> resources;
	public List<Resource> getResources() {
		return this.resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	protected  UserScope userScope;

	public UserScope getUserScope() {
		return this.userScope;
	}

	public void setUserScope(UserScope userScope) {
		this.userScope = userScope;
	}


}
