/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.returns.ReturnBundle;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.returns.ReturnReason;

/**
 *	Properties of a previously fulfilled item associated with a return.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean excludeProductExtras;

	public Boolean getExcludeProductExtras() {
		return this.excludeProductExtras;
	}

	public void setExcludeProductExtras(Boolean excludeProductExtras) {
		this.excludeProductExtras = excludeProductExtras;
	}

	/**
	 * Unique identifier of the return whose items you want to get.
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected  String orderItemId;

	public String getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	protected  String orderItemOptionAttributeFQN;

	public String getOrderItemOptionAttributeFQN() {
		return this.orderItemOptionAttributeFQN;
	}

	public void setOrderItemOptionAttributeFQN(String orderItemOptionAttributeFQN) {
		this.orderItemOptionAttributeFQN = orderItemOptionAttributeFQN;
	}

	protected  Integer orderLineId;

	public Integer getOrderLineId() {
		return this.orderLineId;
	}

	public void setOrderLineId(Integer orderLineId) {
		this.orderLineId = orderLineId;
	}

	protected  Double productLossAmount;

	public Double getProductLossAmount() {
		return this.productLossAmount;
	}

	public void setProductLossAmount(Double productLossAmount) {
		this.productLossAmount = productLossAmount;
	}

	protected  Double productLossTaxAmount;

	public Double getProductLossTaxAmount() {
		return this.productLossTaxAmount;
	}

	public void setProductLossTaxAmount(Double productLossTaxAmount) {
		this.productLossTaxAmount = productLossTaxAmount;
	}

	protected  Integer quantityReceived;

	public Integer getQuantityReceived() {
		return this.quantityReceived;
	}

	public void setQuantityReceived(Integer quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	protected  Integer quantityReplaced;

	public Integer getQuantityReplaced() {
		return this.quantityReplaced;
	}

	public void setQuantityReplaced(Integer quantityReplaced) {
		this.quantityReplaced = quantityReplaced;
	}

	protected  Integer quantityRestockable;

	public Integer getQuantityRestockable() {
		return this.quantityRestockable;
	}

	public void setQuantityRestockable(Integer quantityRestockable) {
		this.quantityRestockable = quantityRestockable;
	}

	protected  Integer quantityRestocked;

	public Integer getQuantityRestocked() {
		return this.quantityRestocked;
	}

	public void setQuantityRestocked(Integer quantityRestocked) {
		this.quantityRestocked = quantityRestocked;
	}

	protected  Integer quantityShipped;

	public Integer getQuantityShipped() {
		return this.quantityShipped;
	}

	public void setQuantityShipped(Integer quantityShipped) {
		this.quantityShipped = quantityShipped;
	}

	protected  String receiveStatus;

	public String getReceiveStatus() {
		return this.receiveStatus;
	}

	public void setReceiveStatus(String receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	protected  Double refundAmount;

	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	protected  String refundStatus;

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	protected  String replaceStatus;

	public String getReplaceStatus() {
		return this.replaceStatus;
	}

	public void setReplaceStatus(String replaceStatus) {
		this.replaceStatus = replaceStatus;
	}

	protected  Boolean returnNotRequired;

	public Boolean getReturnNotRequired() {
		return this.returnNotRequired;
	}

	public void setReturnNotRequired(Boolean returnNotRequired) {
		this.returnNotRequired = returnNotRequired;
	}

	protected  String returnType;

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	protected  Integer shipmentItemId;

	public Integer getShipmentItemId() {
		return this.shipmentItemId;
	}

	public void setShipmentItemId(Integer shipmentItemId) {
		this.shipmentItemId = shipmentItemId;
	}

	protected  Integer shipmentNumber;

	public Integer getShipmentNumber() {
		return this.shipmentNumber;
	}

	public void setShipmentNumber(Integer shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	protected  Double shippingLossAmount;

	public Double getShippingLossAmount() {
		return this.shippingLossAmount;
	}

	public void setShippingLossAmount(Double shippingLossAmount) {
		this.shippingLossAmount = shippingLossAmount;
	}

	protected  Double shippingLossTaxAmount;

	public Double getShippingLossTaxAmount() {
		return this.shippingLossTaxAmount;
	}

	public void setShippingLossTaxAmount(Double shippingLossTaxAmount) {
		this.shippingLossTaxAmount = shippingLossTaxAmount;
	}

	protected  Double totalWithoutWeightedShippingAndHandling;

	public Double getTotalWithoutWeightedShippingAndHandling() {
		return this.totalWithoutWeightedShippingAndHandling;
	}

	public void setTotalWithoutWeightedShippingAndHandling(Double totalWithoutWeightedShippingAndHandling) {
		this.totalWithoutWeightedShippingAndHandling = totalWithoutWeightedShippingAndHandling;
	}

	protected  Double totalWithWeightedShippingAndHandling;

	public Double getTotalWithWeightedShippingAndHandling() {
		return this.totalWithWeightedShippingAndHandling;
	}

	public void setTotalWithWeightedShippingAndHandling(Double totalWithWeightedShippingAndHandling) {
		this.totalWithWeightedShippingAndHandling = totalWithWeightedShippingAndHandling;
	}

	/**
	 * Properties of a collection of component products that make up a single returned product bundle with its own product code.
	 */
	protected List<ReturnBundle> bundledProducts;
	public List<ReturnBundle> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<ReturnBundle> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
	}

	protected  Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	protected List<ReturnReason> reasons;
	public List<ReturnReason> getReasons() {
		return this.reasons;
	}
	public void setReasons(List<ReturnReason> reasons) {
		this.reasons = reasons;
	}


}
