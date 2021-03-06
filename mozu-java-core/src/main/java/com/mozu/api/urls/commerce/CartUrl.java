/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CartUrl
{

	/**
	 * Get Resource Url for GetCart
	 * @param cartId Identifier of the cart to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartUrl(String cartId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}?responseFields={responseFields}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetOrCreateCart
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrCreateCartUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCartSummary
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartSummaryUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/summary?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetUserCartSummary
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserCartSummaryUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/user/{userId}/summary?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetUserCart
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserCartUrl(String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/user/{userId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RejectSuggestedDiscount
	 * @param cartId Identifier of the cart to delete.
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl rejectSuggestedDiscountUrl(String cartId, Integer discountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}/rejectautodiscount/{discountId}?responseFields={responseFields}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("discountId", discountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCart
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCartUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCart
	 * @param cartId Identifier of the cart to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCartUrl(String cartId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}");
		formatter.formatUrl("cartId", cartId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCurrentCart
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCurrentCartUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

