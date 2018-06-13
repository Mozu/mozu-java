/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.pricingruntime.ItemTaxContext;

/**
 *	Properties of the tax context applicable for the order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Double handlingFeeTax;

	public Double getHandlingFeeTax() {
		return this.handlingFeeTax;
	}

	public void setHandlingFeeTax(Double handlingFeeTax) {
		this.handlingFeeTax = handlingFeeTax;
	}

	protected  Double orderTax;

	public Double getOrderTax() {
		return this.orderTax;
	}

	public void setOrderTax(Double orderTax) {
		this.orderTax = orderTax;
	}

	protected  Double shippingTax;

	public Double getShippingTax() {
		return this.shippingTax;
	}

	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	protected List<ItemTaxContext> itemTaxContexts;
	public List<ItemTaxContext> getItemTaxContexts() {
		return this.itemTaxContexts;
	}
	public void setItemTaxContexts(List<ItemTaxContext> itemTaxContexts) {
		this.itemTaxContexts = itemTaxContexts;
	}

	/**
	 * Leverage this property within a [tax Arc.js action](https://www.mozu.com/docs/arcjs/commerce-catalog-storefront-tax/commerce-catalog-storefront-tax.htm) to supplement the tax information for this item or object with custom JSON data.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode taxData;

	public com.fasterxml.jackson.databind.JsonNode getTaxData() {
		return this.taxData;
	}

	public void setTaxData(com.fasterxml.jackson.databind.JsonNode taxData) {
		this.taxData = taxData;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(taxData == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, taxData);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.taxData = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}