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
	 * @param checkoutId 
	 * @param itemId 
	 * @param quantity 
	 * @param responseFields 
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
	 * @param checkoutId 
	 * @param responseFields 
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
	 * Get Resource Url for UpdateItemDestination
	 * @param checkoutId 
	 * @param destinationId 
	 * @param itemId 
	 * @param responseFields 
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

}
