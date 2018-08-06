/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.payments;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class PublicCardUrl
{

	/**
	 * Get Resource Url for Create
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/payments/commerce/payments/cards/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.PCI_POD) ;
	}

	/**
	 * Get Resource Url for GetGiftCardBalance
	 * @param cardId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getGiftCardBalanceUrl(String cardId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/payments/commerce/payments/cards/{cardId}/balance?responseFields={responseFields}");
		formatter.formatUrl("cardId", cardId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.PCI_POD) ;
	}

	/**
	 * Get Resource Url for GetUnregisteredGiftCardBalance
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getUnregisteredGiftCardBalanceUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/payments/commerce/payments/cards/balance?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.PCI_POD) ;
	}

	/**
	 * Get Resource Url for Update
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateUrl(String cardId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/payments/commerce/payments/cards/{cardId}?responseFields={responseFields}");
		formatter.formatUrl("cardId", cardId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.PCI_POD) ;
	}

	/**
	 * Get Resource Url for Delete
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteUrl(String cardId)
	{
		UrlFormatter formatter = new UrlFormatter("/payments/commerce/payments/cards/{cardId}");
		formatter.formatUrl("cardId", cardId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.PCI_POD) ;
	}

}

