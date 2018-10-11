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

public class WishlistUrl
{

	/**
	 * Get Resource Url for GetWishlists
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistsUrl(String filter, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlist
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistUrl(String responseFields, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetWishlistByName
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getWishlistByNameUrl(Integer customerAccountId, String responseFields, String wishlistName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/customers/{customerAccountId}/{wishlistName}?responseFields={responseFields}");
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistName", wishlistName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateWishlist
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createWishlistUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateWishlist
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateWishlistUrl(String responseFields, String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteWishlist
	 * @param wishlistId Unique identifier of the wish list.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteWishlistUrl(String wishlistId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/wishlists/{wishlistId}");
		formatter.formatUrl("wishlistId", wishlistId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

