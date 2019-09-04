/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.location.LocationAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.location.FulfillmentType;
import com.mozu.api.contracts.location.Coordinates;
import com.mozu.api.contracts.location.LocationType;
import com.mozu.api.contracts.location.RegularHours;
import com.mozu.api.contracts.location.ShippingOriginContact;

/**
 *	Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean allowFulfillmentWithNoStock;

	public Boolean getAllowFulfillmentWithNoStock() {
		return this.allowFulfillmentWithNoStock;
	}

	public void setAllowFulfillmentWithNoStock(Boolean allowFulfillmentWithNoStock) {
		this.allowFulfillmentWithNoStock = allowFulfillmentWithNoStock;
	}

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

	protected  Boolean express;

	public Boolean getExpress() {
		return this.express;
	}

	public void setExpress(Boolean express) {
		this.express = express;
	}

	protected  String fax;

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	protected  Boolean includeInInventoryAggregrate;

	public Boolean getIncludeInInventoryAggregrate() {
		return this.includeInInventoryAggregrate;
	}

	public void setIncludeInInventoryAggregrate(Boolean includeInInventoryAggregrate) {
		this.includeInInventoryAggregrate = includeInInventoryAggregrate;
	}

	protected  Boolean includeInLocationExport;

	public Boolean getIncludeInLocationExport() {
		return this.includeInLocationExport;
	}

	public void setIncludeInLocationExport(Boolean includeInLocationExport) {
		this.includeInLocationExport = includeInLocationExport;
	}

	protected  Boolean isDisabled;

	public Boolean getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String note;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	protected  String phone;

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	protected  Boolean supportsInventory;

	public Boolean getSupportsInventory() {
		return this.supportsInventory;
	}

	public void setSupportsInventory(Boolean supportsInventory) {
		this.supportsInventory = supportsInventory;
	}

	protected List<String> tags;
	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	protected  Boolean transferEnabled;

	public Boolean getTransferEnabled() {
		return this.transferEnabled;
	}

	public void setTransferEnabled(Boolean transferEnabled) {
		this.transferEnabled = transferEnabled;
	}

	protected  Boolean warehouseEnabled;

	public Boolean getWarehouseEnabled() {
		return this.warehouseEnabled;
	}

	public void setWarehouseEnabled(Boolean warehouseEnabled) {
		this.warehouseEnabled = warehouseEnabled;
	}

	protected  Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected List<LocationAttribute> attributes;
	public List<LocationAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<LocationAttribute> attributes) {
		this.attributes = attributes;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<FulfillmentType> fulfillmentTypes;
	public List<FulfillmentType> getFulfillmentTypes() {
		return this.fulfillmentTypes;
	}
	public void setFulfillmentTypes(List<FulfillmentType> fulfillmentTypes) {
		this.fulfillmentTypes = fulfillmentTypes;
	}

	protected  Coordinates geo;

	public Coordinates getGeo() {
		return this.geo;
	}

	public void setGeo(Coordinates geo) {
		this.geo = geo;
	}

	protected List<LocationType> locationTypes;
	public List<LocationType> getLocationTypes() {
		return this.locationTypes;
	}
	public void setLocationTypes(List<LocationType> locationTypes) {
		this.locationTypes = locationTypes;
	}

	protected  RegularHours regularHours;

	public RegularHours getRegularHours() {
		return this.regularHours;
	}

	public void setRegularHours(RegularHours regularHours) {
		this.regularHours = regularHours;
	}

	/**
	 * Properties of a fulfillment contact for the shipping origin address associated with a location.
	 */
	protected  ShippingOriginContact shippingOriginContact;

	public ShippingOriginContact getShippingOriginContact() {
		return this.shippingOriginContact;
	}

	public void setShippingOriginContact(ShippingOriginContact shippingOriginContact) {
		this.shippingOriginContact = shippingOriginContact;
	}


}
