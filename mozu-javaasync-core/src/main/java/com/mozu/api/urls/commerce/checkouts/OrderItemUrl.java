/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.checkouts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class OrderItemUrl
{

	/**
	 * Get Resource Url for SplitItem
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl splitItemUrl(String checkoutId, String itemId, Integer quantity, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/items/{itemId}/split?quantity={quantity}&responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("itemId", itemId);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for BulkUpdateItemDestinations
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl bulkUpdateItemDestinationsUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/items/destinations?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCheckoutItem
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl addCheckoutItemUrl(String checkoutId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/items?skipInventoryCheck={skipInventoryCheck}&responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemDestination
	 * @param checkoutId The unique identifier of the checkout.
	 * @param destinationId The unique identifier of the destination.
	 * @param itemId The unique identifier of the item.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemDestinationUrl(String checkoutId, String destinationId, String itemId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/items/{itemId}/destination/{destinationId}?responseFields={responseFields}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("destinationId", destinationId);
		formatter.formatUrl("itemId", itemId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCheckoutItem
	 * @param checkoutId The unique identifier of the checkout.
	 * @param itemId The unique identifier of the item.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCheckoutItemUrl(String checkoutId, String itemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/checkouts/{checkoutId}/items/{itemId}");
		formatter.formatUrl("checkoutId", checkoutId);
		formatter.formatUrl("itemId", itemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

