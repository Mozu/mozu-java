/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.location.FulfillmentType;
import com.mozu.api.contracts.location.Coordinates;
import com.mozu.api.contracts.location.LocationType;
import com.mozu.api.contracts.location.RegularHours;
import com.mozu.api.contracts.location.ShippingOriginContact;

/**
 *	Properties of a physical location a tenant uses to manage inventory and fulfills orders, provide store finder functionality, or both..
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * User-defined code to assign to this location.
	 */
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * User-defined description of this location.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The fax number associated with this location.
	 */
	protected String fax;

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * The user-defined name of the location.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Any tenant-defined notes associated with this location.
	 */
	protected String note;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * The phone number associated with this location.
	 */
	protected String phone;

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * If true, this location maintains its own product inventory. If the location uses the direct ship fulfillment type, it must also support inventory.
	 */
	protected Boolean supportsInventory;

	public Boolean getSupportsInventory() {
		return this.supportsInventory;
	}

	public void setSupportsInventory(Boolean supportsInventory) {
		this.supportsInventory = supportsInventory;
	}

	/**
	 * List of tenant-defined tags associated with this location.
	 */
	protected List<String> tags;
	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * The physical address properties of the location.
	 */
	protected Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * List of order fulfillment types associated with this location. The location can have fulfillment types of direct ship (DS), in-store pickup (SP), or both.
	 */
	protected List<FulfillmentType> fulfillmentTypes;
	public List<FulfillmentType> getFulfillmentTypes() {
		return this.fulfillmentTypes;
	}
	public void setFulfillmentTypes(List<FulfillmentType> fulfillmentTypes) {
		this.fulfillmentTypes = fulfillmentTypes;
	}

	/**
	 * The geographical coordinates associated with this location.
	 */
	protected Coordinates geo;

	public Coordinates getGeo() {
		return this.geo;
	}

	public void setGeo(Coordinates geo) {
		this.geo = geo;
	}

	/**
	 * List of location types associated with this location. You can associate individual locations with any number of location types.
	 */
	protected List<LocationType> locationTypes;
	public List<LocationType> getLocationTypes() {
		return this.locationTypes;
	}
	public void setLocationTypes(List<LocationType> locationTypes) {
		this.locationTypes = locationTypes;
	}

	/**
	 * List of standard operating hours for each day of the week this location is open for shopper business.
	 */
	protected RegularHours regularHours;

	public RegularHours getRegularHours() {
		return this.regularHours;
	}

	public void setRegularHours(RegularHours regularHours) {
		this.regularHours = regularHours;
	}

	protected ShippingOriginContact shippingOriginContact;

	public ShippingOriginContact getShippingOriginContact() {
		return this.shippingOriginContact;
	}

	public void setShippingOriginContact(ShippingOriginContact shippingOriginContact) {
		this.shippingOriginContact = shippingOriginContact;
	}

}
