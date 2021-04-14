/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.fulfillment.CanceledItem;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.fulfillment.Destination;
import com.mozu.api.contracts.commerceruntime.fulfillment.ShipmentItem;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.fulfillment.ShipmentStatusReason;
import com.mozu.api.contracts.commerceruntime.fulfillment.WorkflowState;

/**
 *	Properties of a shipment used to ship order items to a shopper. A shipment can include any number of packages.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer backorderCreatedDate;

	public Integer getBackorderCreatedDate() {
		return this.backorderCreatedDate;
	}

	public void setBackorderCreatedDate(Integer backorderCreatedDate) {
		this.backorderCreatedDate = backorderCreatedDate;
	}

	protected  Double cost;

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected  Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	protected  String customerTaxId;

	public String getCustomerTaxId() {
		return this.customerTaxId;
	}

	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	protected  Double dutyAdjustment;

	public Double getDutyAdjustment() {
		return this.dutyAdjustment;
	}

	public void setDutyAdjustment(Double dutyAdjustment) {
		this.dutyAdjustment = dutyAdjustment;
	}

	protected  Double dutyTotal;

	public Double getDutyTotal() {
		return this.dutyTotal;
	}

	public void setDutyTotal(Double dutyTotal) {
		this.dutyTotal = dutyTotal;
	}

	protected  String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	protected  String externalOrderId;

	public String getExternalOrderId() {
		return this.externalOrderId;
	}

	public void setExternalOrderId(String externalOrderId) {
		this.externalOrderId = externalOrderId;
	}

	protected  String externalShipmentId;

	public String getExternalShipmentId() {
		return this.externalShipmentId;
	}

	public void setExternalShipmentId(String externalShipmentId) {
		this.externalShipmentId = externalShipmentId;
	}

	protected  DateTime fulfillmentDate;

	public DateTime getFulfillmentDate() {
		return this.fulfillmentDate;
	}

	public void setFulfillmentDate(DateTime fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

	protected  String fulfillmentLocationCode;

	public String getFulfillmentLocationCode() {
		return this.fulfillmentLocationCode;
	}

	public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
		this.fulfillmentLocationCode = fulfillmentLocationCode;
	}

	protected  String fulfillmentStatus;

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	protected  Double handlingAdjustment;

	public Double getHandlingAdjustment() {
		return this.handlingAdjustment;
	}

	public void setHandlingAdjustment(Double handlingAdjustment) {
		this.handlingAdjustment = handlingAdjustment;
	}

	protected  Double handlingSubtotal;

	public Double getHandlingSubtotal() {
		return this.handlingSubtotal;
	}

	public void setHandlingSubtotal(Double handlingSubtotal) {
		this.handlingSubtotal = handlingSubtotal;
	}

	protected  Double handlingTaxAdjustment;

	public Double getHandlingTaxAdjustment() {
		return this.handlingTaxAdjustment;
	}

	public void setHandlingTaxAdjustment(Double handlingTaxAdjustment) {
		this.handlingTaxAdjustment = handlingTaxAdjustment;
	}

	protected  Double handlingTaxTotal;

	public Double getHandlingTaxTotal() {
		return this.handlingTaxTotal;
	}

	public void setHandlingTaxTotal(Double handlingTaxTotal) {
		this.handlingTaxTotal = handlingTaxTotal;
	}

	protected  Double handlingTotal;

	public Double getHandlingTotal() {
		return this.handlingTotal;
	}

	public void setHandlingTotal(Double handlingTotal) {
		this.handlingTotal = handlingTotal;
	}

	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  Boolean isExpress;

	public Boolean getIsExpress() {
		return this.isExpress;
	}

	public void setIsExpress(Boolean isExpress) {
		this.isExpress = isExpress;
	}

	protected  Boolean isTransfer;

	public Boolean getIsTransfer() {
		return this.isTransfer;
	}

	public void setIsTransfer(Boolean isTransfer) {
		this.isTransfer = isTransfer;
	}

	protected  Double lineItemSubtotal;

	public Double getLineItemSubtotal() {
		return this.lineItemSubtotal;
	}

	public void setLineItemSubtotal(Double lineItemSubtotal) {
		this.lineItemSubtotal = lineItemSubtotal;
	}

	protected  Double lineItemTaxAdjustment;

	public Double getLineItemTaxAdjustment() {
		return this.lineItemTaxAdjustment;
	}

	public void setLineItemTaxAdjustment(Double lineItemTaxAdjustment) {
		this.lineItemTaxAdjustment = lineItemTaxAdjustment;
	}

	protected  Double lineItemTaxTotal;

	public Double getLineItemTaxTotal() {
		return this.lineItemTaxTotal;
	}

	public void setLineItemTaxTotal(Double lineItemTaxTotal) {
		this.lineItemTaxTotal = lineItemTaxTotal;
	}

	protected  Double lineItemTotal;

	public Double getLineItemTotal() {
		return this.lineItemTotal;
	}

	public void setLineItemTotal(Double lineItemTotal) {
		this.lineItemTotal = lineItemTotal;
	}

	protected  Integer number;

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	protected  String orderId;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	protected  Integer orderNumber;

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	protected  DateTime orderSubmitDate;

	public DateTime getOrderSubmitDate() {
		return this.orderSubmitDate;
	}

	public void setOrderSubmitDate(DateTime orderSubmitDate) {
		this.orderSubmitDate = orderSubmitDate;
	}

	protected  Integer originalShipmentNumber;

	public Integer getOriginalShipmentNumber() {
		return this.originalShipmentNumber;
	}

	public void setOriginalShipmentNumber(Integer originalShipmentNumber) {
		this.originalShipmentNumber = originalShipmentNumber;
	}

	protected  Integer parentShipmentNumber;

	public Integer getParentShipmentNumber() {
		return this.parentShipmentNumber;
	}

	public void setParentShipmentNumber(Integer parentShipmentNumber) {
		this.parentShipmentNumber = parentShipmentNumber;
	}

	protected  String pickStatus;

	public String getPickStatus() {
		return this.pickStatus;
	}

	public void setPickStatus(String pickStatus) {
		this.pickStatus = pickStatus;
	}

	protected  String pickType;

	public String getPickType() {
		return this.pickType;
	}

	public void setPickType(String pickType) {
		this.pickType = pickType;
	}

	protected  Boolean readyToCapture;

	public Boolean getReadyToCapture() {
		return this.readyToCapture;
	}

	public void setReadyToCapture(Boolean readyToCapture) {
		this.readyToCapture = readyToCapture;
	}

	protected  Double shipmentAdjustment;

	public Double getShipmentAdjustment() {
		return this.shipmentAdjustment;
	}

	public void setShipmentAdjustment(Double shipmentAdjustment) {
		this.shipmentAdjustment = shipmentAdjustment;
	}

	protected  String shipmentStatus;

	public String getShipmentStatus() {
		return this.shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	protected  String shipmentType;

	public String getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	protected  Double shippingAdjustment;

	public Double getShippingAdjustment() {
		return this.shippingAdjustment;
	}

	public void setShippingAdjustment(Double shippingAdjustment) {
		this.shippingAdjustment = shippingAdjustment;
	}

	protected  String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	protected  String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	protected  Double shippingSubtotal;

	public Double getShippingSubtotal() {
		return this.shippingSubtotal;
	}

	public void setShippingSubtotal(Double shippingSubtotal) {
		this.shippingSubtotal = shippingSubtotal;
	}

	protected  Double shippingTaxAdjustment;

	public Double getShippingTaxAdjustment() {
		return this.shippingTaxAdjustment;
	}

	public void setShippingTaxAdjustment(Double shippingTaxAdjustment) {
		this.shippingTaxAdjustment = shippingTaxAdjustment;
	}

	protected  Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	protected  Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	protected  Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	protected List<Integer> transferShipmentNumbers;
	public List<Integer> getTransferShipmentNumbers() {
		return this.transferShipmentNumbers;
	}
	public void setTransferShipmentNumbers(List<Integer> transferShipmentNumbers) {
		this.transferShipmentNumbers = transferShipmentNumbers;
	}

	protected  String workflowProcessContainerId;

	public String getWorkflowProcessContainerId() {
		return this.workflowProcessContainerId;
	}

	public void setWorkflowProcessContainerId(String workflowProcessContainerId) {
		this.workflowProcessContainerId = workflowProcessContainerId;
	}

	protected  String workflowProcessId;

	public String getWorkflowProcessId() {
		return this.workflowProcessId;
	}

	public void setWorkflowProcessId(String workflowProcessId) {
		this.workflowProcessId = workflowProcessId;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<CanceledItem> canceledItems;
	public List<CanceledItem> getCanceledItems() {
		return this.canceledItems;
	}
	public void setCanceledItems(List<CanceledItem> canceledItems) {
		this.canceledItems = canceledItems;
	}

	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected  Destination destination;

	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	protected List<ShipmentItem> items;
	public List<ShipmentItem> getItems() {
		return this.items;
	}
	public void setItems(List<ShipmentItem> items) {
		this.items = items;
	}

	protected  Contact origin;

	public Contact getOrigin() {
		return this.origin;
	}

	public void setOrigin(Contact origin) {
		this.origin = origin;
	}

	protected List<Package> packages;
	public List<Package> getPackages() {
		return this.packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode pickupInfo;

	public com.fasterxml.jackson.databind.JsonNode getPickupInfo() {
		return this.pickupInfo;
	}

	public void setPickupInfo(com.fasterxml.jackson.databind.JsonNode pickupInfo) {
		this.pickupInfo = pickupInfo;
	}

	protected  ShipmentStatusReason shipmentStatusReason;

	public ShipmentStatusReason getShipmentStatusReason() {
		return this.shipmentStatusReason;
	}

	public void setShipmentStatusReason(ShipmentStatusReason shipmentStatusReason) {
		this.shipmentStatusReason = shipmentStatusReason;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode taxData;

	public com.fasterxml.jackson.databind.JsonNode getTaxData() {
		return this.taxData;
	}

	public void setTaxData(com.fasterxml.jackson.databind.JsonNode taxData) {
		this.taxData = taxData;
	}

	protected  WorkflowState workflowState;

	public WorkflowState getWorkflowState() {
		return this.workflowState;
	}

	public void setWorkflowState(WorkflowState workflowState) {
		this.workflowState = workflowState;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
