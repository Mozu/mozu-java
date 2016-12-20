/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.carts;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.products.Product;

/**
 *	Mozu.CommerceRuntime.Contracts.Carts.CartMessage ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The text of the change message, such as "This product is no longer available." System-supplied and read-only.
	 */
	protected  String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Mozu.CommerceRuntime.Contracts.Carts.CartMessage messageType ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String messageType;

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * Mozu.CommerceRuntime.Contracts.Carts.CartMessage productsRemoved ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<Product> productsRemoved;
	public List<Product> getProductsRemoved() {
		return this.productsRemoved;
	}
	public void setProductsRemoved(List<Product> productsRemoved) {
		this.productsRemoved = productsRemoved;
	}


}
