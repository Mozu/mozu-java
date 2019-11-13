/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicCard implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The card holder full name.
	 */
	protected  String cardHolderName;

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * The month the credit card was issued; used by some cards.
	 */
	protected  Integer cardIssueMonth;

	public Integer getCardIssueMonth() {
		return this.cardIssueMonth;
	}

	public void setCardIssueMonth(Integer cardIssueMonth) {
		this.cardIssueMonth = cardIssueMonth;
	}

	/**
	 * For Amex Cards, this is an additional field for verification that is used in conjunction with a CVV
	 */
	protected  String cardIssueNumber;

	public String getCardIssueNumber() {
		return this.cardIssueNumber;
	}

	public void setCardIssueNumber(String cardIssueNumber) {
		this.cardIssueNumber = cardIssueNumber;
	}

	/**
	 * The issue year; used by some cards.
	 */
	protected  Integer cardIssueYear;

	public Integer getCardIssueYear() {
		return this.cardIssueYear;
	}

	public void setCardIssueYear(Integer cardIssueYear) {
		this.cardIssueYear = cardIssueYear;
	}

	/**
	 * This is the full number of the card.
	 */
	protected  String cardNumber;

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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
	 * The CVV code for the credit card.
	 */
	protected  String cvv;

	public String getCvv() {
		return this.cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	/**
	 * The two-digit month a credit card expires for a payment method.
	 */
	protected  Integer expireMonth;

	public Integer getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	/**
	 * The four-digit year the credit card expires for a payment method.
	 */
	protected  Integer expireYear;

	public Integer getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}

	protected  Boolean isTokenized;

	public Boolean getIsTokenized() {
		return this.isTokenized;
	}

	public void setIsTokenized(Boolean isTokenized) {
		this.isTokenized = isTokenized;
	}


}
