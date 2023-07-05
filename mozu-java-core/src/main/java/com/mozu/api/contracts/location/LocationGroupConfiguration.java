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
import com.mozu.api.contracts.location.LocationAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.location.BoxType;
import com.mozu.api.contracts.location.BpmConfiguration;
import com.mozu.api.contracts.location.Carrier;
import com.mozu.api.contracts.location.PackageSettings;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationGroupConfiguration implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean allowReturns;

	public Boolean getAllowReturns() {
		return this.allowReturns;
	}

	public void setAllowReturns(Boolean allowReturns) {
		this.allowReturns = allowReturns;
	}

	protected  Boolean autoPackingListPopup;

	public Boolean getAutoPackingListPopup() {
		return this.autoPackingListPopup;
	}

	public void setAutoPackingListPopup(Boolean autoPackingListPopup) {
		this.autoPackingListPopup = autoPackingListPopup;
	}

	protected  Boolean blockPartialCancel;

	public Boolean getBlockPartialCancel() {
		return this.blockPartialCancel;
	}

	public void setBlockPartialCancel(Boolean blockPartialCancel) {
		this.blockPartialCancel = blockPartialCancel;
	}

	protected  Boolean blockPartialStock;

	public Boolean getBlockPartialStock() {
		return this.blockPartialStock;
	}

	public void setBlockPartialStock(Boolean blockPartialStock) {
		this.blockPartialStock = blockPartialStock;
	}

	protected List<String> closePickWavePermissions;
	public List<String> getClosePickWavePermissions() {
		return this.closePickWavePermissions;
	}
	public void setClosePickWavePermissions(List<String> closePickWavePermissions) {
		this.closePickWavePermissions = closePickWavePermissions;
	}

	protected  String customerFailedToPickupAfterAction;

	public String getCustomerFailedToPickupAfterAction() {
		return this.customerFailedToPickupAfterAction;
	}

	public void setCustomerFailedToPickupAfterAction(String customerFailedToPickupAfterAction) {
		this.customerFailedToPickupAfterAction = customerFailedToPickupAfterAction;
	}

	protected  Integer customerFailedToPickupDeadline;

	public Integer getCustomerFailedToPickupDeadline() {
		return this.customerFailedToPickupDeadline;
	}

	public void setCustomerFailedToPickupDeadline(Integer customerFailedToPickupDeadline) {
		this.customerFailedToPickupDeadline = customerFailedToPickupDeadline;
	}

	protected  String defaultCarrier;

	public String getDefaultCarrier() {
		return this.defaultCarrier;
	}

	public void setDefaultCarrier(String defaultCarrier) {
		this.defaultCarrier = defaultCarrier;
	}

	protected  Integer defaultMaxNumberOfShipmentsInPickWave;

	public Integer getDefaultMaxNumberOfShipmentsInPickWave() {
		return this.defaultMaxNumberOfShipmentsInPickWave;
	}

	public void setDefaultMaxNumberOfShipmentsInPickWave(Integer defaultMaxNumberOfShipmentsInPickWave) {
		this.defaultMaxNumberOfShipmentsInPickWave = defaultMaxNumberOfShipmentsInPickWave;
	}

	protected  Integer defaultNumberOfOrdersInPickWave;

	public Integer getDefaultNumberOfOrdersInPickWave() {
		return this.defaultNumberOfOrdersInPickWave;
	}

	public void setDefaultNumberOfOrdersInPickWave(Integer defaultNumberOfOrdersInPickWave) {
		this.defaultNumberOfOrdersInPickWave = defaultNumberOfOrdersInPickWave;
	}

	protected  String defaultPrinterType;

	public String getDefaultPrinterType() {
		return this.defaultPrinterType;
	}

	public void setDefaultPrinterType(String defaultPrinterType) {
		this.defaultPrinterType = defaultPrinterType;
	}

	protected  Integer defaultReturnRefundReductionAmount;

	public Integer getDefaultReturnRefundReductionAmount() {
		return this.defaultReturnRefundReductionAmount;
	}

	public void setDefaultReturnRefundReductionAmount(Integer defaultReturnRefundReductionAmount) {
		this.defaultReturnRefundReductionAmount = defaultReturnRefundReductionAmount;
	}

	protected  Boolean displayProductImagesInPickWaveDetails;

	public Boolean getDisplayProductImagesInPickWaveDetails() {
		return this.displayProductImagesInPickWaveDetails;
	}

	public void setDisplayProductImagesInPickWaveDetails(Boolean displayProductImagesInPickWaveDetails) {
		this.displayProductImagesInPickWaveDetails = displayProductImagesInPickWaveDetails;
	}

	protected  Boolean enableAdvancedOptionForPickWaveCreation;

	public Boolean getEnableAdvancedOptionForPickWaveCreation() {
		return this.enableAdvancedOptionForPickWaveCreation;
	}

	public void setEnableAdvancedOptionForPickWaveCreation(Boolean enableAdvancedOptionForPickWaveCreation) {
		this.enableAdvancedOptionForPickWaveCreation = enableAdvancedOptionForPickWaveCreation;
	}

	protected  Boolean enableForISPU;

	public Boolean getEnableForISPU() {
		return this.enableForISPU;
	}

	public void setEnableForISPU(Boolean enableForISPU) {
		this.enableForISPU = enableForISPU;
	}

	protected  Boolean enableForSTH;

	public Boolean getEnableForSTH() {
		return this.enableForSTH;
	}

	public void setEnableForSTH(Boolean enableForSTH) {
		this.enableForSTH = enableForSTH;
	}

	protected  Boolean enablePnpForBOPIS;

	public Boolean getEnablePnpForBOPIS() {
		return this.enablePnpForBOPIS;
	}

	public void setEnablePnpForBOPIS(Boolean enablePnpForBOPIS) {
		this.enablePnpForBOPIS = enablePnpForBOPIS;
	}

	protected  Boolean enablePnpForSTH;

	public Boolean getEnablePnpForSTH() {
		return this.enablePnpForSTH;
	}

	public void setEnablePnpForSTH(Boolean enablePnpForSTH) {
		this.enablePnpForSTH = enablePnpForSTH;
	}

	protected  Boolean enableScanningOfUpcForShipToHome;

	public Boolean getEnableScanningOfUpcForShipToHome() {
		return this.enableScanningOfUpcForShipToHome;
	}

	public void setEnableScanningOfUpcForShipToHome(Boolean enableScanningOfUpcForShipToHome) {
		this.enableScanningOfUpcForShipToHome = enableScanningOfUpcForShipToHome;
	}

	protected  String locationGroupCode;

	public String getLocationGroupCode() {
		return this.locationGroupCode;
	}

	public void setLocationGroupCode(String locationGroupCode) {
		this.locationGroupCode = locationGroupCode;
	}

	protected  Integer locationGroupId;

	public Integer getLocationGroupId() {
		return this.locationGroupId;
	}

	public void setLocationGroupId(Integer locationGroupId) {
		this.locationGroupId = locationGroupId;
	}

	protected  Integer maximumNumberOfOrdersInPickWave;

	public Integer getMaximumNumberOfOrdersInPickWave() {
		return this.maximumNumberOfOrdersInPickWave;
	}

	public void setMaximumNumberOfOrdersInPickWave(Integer maximumNumberOfOrdersInPickWave) {
		this.maximumNumberOfOrdersInPickWave = maximumNumberOfOrdersInPickWave;
	}

	protected  Integer maximumReturnRefundReductionAmount;

	public Integer getMaximumReturnRefundReductionAmount() {
		return this.maximumReturnRefundReductionAmount;
	}

	public void setMaximumReturnRefundReductionAmount(Integer maximumReturnRefundReductionAmount) {
		this.maximumReturnRefundReductionAmount = maximumReturnRefundReductionAmount;
	}

	protected  String pickWavePrintFormat;

	public String getPickWavePrintFormat() {
		return this.pickWavePrintFormat;
	}

	public void setPickWavePrintFormat(String pickWavePrintFormat) {
		this.pickWavePrintFormat = pickWavePrintFormat;
	}

	protected  Boolean printReturnLabel;

	public Boolean getPrintReturnLabel() {
		return this.printReturnLabel;
	}

	public void setPrintReturnLabel(Boolean printReturnLabel) {
		this.printReturnLabel = printReturnLabel;
	}

	protected  Boolean returnRefundReduction;

	public Boolean getReturnRefundReduction() {
		return this.returnRefundReduction;
	}

	public void setReturnRefundReduction(Boolean returnRefundReduction) {
		this.returnRefundReduction = returnRefundReduction;
	}

	protected  Integer sendCustomerPickupReminder;

	public Integer getSendCustomerPickupReminder() {
		return this.sendCustomerPickupReminder;
	}

	public void setSendCustomerPickupReminder(Integer sendCustomerPickupReminder) {
		this.sendCustomerPickupReminder = sendCustomerPickupReminder;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected  Boolean wmsEnabled;

	public Boolean getWmsEnabled() {
		return this.wmsEnabled;
	}

	public void setWmsEnabled(Boolean wmsEnabled) {
		this.wmsEnabled = wmsEnabled;
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

	protected List<BoxType> boxTypes;
	public List<BoxType> getBoxTypes() {
		return this.boxTypes;
	}
	public void setBoxTypes(List<BoxType> boxTypes) {
		this.boxTypes = boxTypes;
	}

	protected List<BpmConfiguration> bpmConfigurations;
	public List<BpmConfiguration> getBpmConfigurations() {
		return this.bpmConfigurations;
	}
	public void setBpmConfigurations(List<BpmConfiguration> bpmConfigurations) {
		this.bpmConfigurations = bpmConfigurations;
	}

	protected List<Carrier> carriers;
	public List<Carrier> getCarriers() {
		return this.carriers;
	}
	public void setCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}

	protected  PackageSettings packageSettings;

	public PackageSettings getPackageSettings() {
		return this.packageSettings;
	}

	public void setPackageSettings(PackageSettings packageSettings) {
		this.packageSettings = packageSettings;
	}


}