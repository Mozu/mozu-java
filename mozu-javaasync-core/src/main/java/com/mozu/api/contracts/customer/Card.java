/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of a credit card used to submit payment for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The masked credit card number part returned from the payment gateway.
	 */
	protected  String cardNumberPart;

	public String getCardNumberPart() {
		return this.cardNumberPart;
	}

	public void setCardNumberPart(String cardNumberPart) {
		this.cardNumberPart = cardNumberPart;
	}

	/**
	 * The type of credit card, such as Visa or Amex.
	 */
	protected  String cardType;

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * Unique identifier of the customer account contact associated with the credit card.
	 */
	protected  Integer contactId;

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	/**
	 * The two-digit month a credit card expires for a payment method.
	 */
	protected  short expireMonth;

	public short getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(short expireMonth) {
		this.expireMonth = expireMonth;
	}

	/**
	 * The four-digit year the credit card expires for a payment method.
	 */
	protected  short expireYear;

	public short getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(short expireYear) {
		this.expireYear = expireYear;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Mozu.Customer.Contracts.Card isDefaultPayMethod ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Boolean isDefaultPayMethod;

	public Boolean getIsDefaultPayMethod() {
		return this.isDefaultPayMethod;
	}

	public void setIsDefaultPayMethod(Boolean isDefaultPayMethod) {
		this.isDefaultPayMethod = isDefaultPayMethod;
	}

	/**
	 * The full name printed on a credit card. The name should match what is printed on the card exactly, used in validation during a payment.
	 */
	protected  String nameOnCard;

	public String getNameOnCard() {
		return this.nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


}
