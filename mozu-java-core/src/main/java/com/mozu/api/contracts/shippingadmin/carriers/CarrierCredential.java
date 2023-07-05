/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.carriers;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.shippingadmin.carriers.CarrierCredentialSet;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarrierCredential implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String carrierId;

	public String getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	protected  String locationGroupCode;

	public String getLocationGroupCode() {
		return this.locationGroupCode;
	}

	public void setLocationGroupCode(String locationGroupCode) {
		this.locationGroupCode = locationGroupCode;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  CarrierCredentialSet credentialSet;

	public CarrierCredentialSet getCredentialSet() {
		return this.credentialSet;
	}

	public void setCredentialSet(CarrierCredentialSet credentialSet) {
		this.credentialSet = credentialSet;
	}


}