/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.quotes;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class OrderItemUrl
{

	/**
	 * Get Resource Url for GetQuoteItem
	 * @param draft 
	 * @param quoteId A unique identifier for the quote that the item is included within.
	 * @param quoteItemId A unique identifier for the item included within a quote.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuoteItemUrl(Boolean draft, String quoteId, String quoteItemId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items/{quoteItemId}?draft={draft}&responseFields={responseFields}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("quoteItemId", quoteItemId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetQuoteItems
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteId A unique identifier for the quote that the items are included within.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuoteItemsUrl(String filter, Integer pageSize, String quoteId, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetQuoteItemsByQuoteName
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param quoteName The unique name of the quote that items are being retrieved for.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuoteItemsByQuoteNameUrl(Integer customerAccountId, String filter, Integer pageSize, String quoteName, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/customers/{customerAccountId}/{quoteName}/items?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("quoteName", quoteName);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddItemToQuote
	 * @param quoteId The unique identifier for the quote that an item is being added to.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode 
	 * @return   String Resource Url
	 */
	public static MozuUrl addItemToQuoteUrl(String quoteId, String responseFields, String updateMode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items?updatemode={updateMode}&responseFields={responseFields}");
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemFulfillment
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param responseFields 
	 * @param updateMode 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemFulfillmentUrl(String quoteId, String quoteItemId, String responseFields, String updateMode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items/{quoteItemId}/fulfillment?updatemode={updateMode}&responseFields={responseFields}");
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("quoteItemId", quoteItemId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemProductPrice
	 * @param price 
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param responseFields 
	 * @param updateMode 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemProductPriceUrl(Double price, String quoteId, String quoteItemId, String responseFields, String updateMode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items/{quoteItemId}/price/{price}?updatemode={updateMode}&responseFields={responseFields}");
		formatter.formatUrl("price", price);
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("quoteItemId", quoteItemId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemQuantity
	 * @param quantity 
	 * @param quoteId 
	 * @param quoteItemId 
	 * @param responseFields 
	 * @param updateMode 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemQuantityUrl(Integer quantity, String quoteId, String quoteItemId, String responseFields, String updateMode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items/{quoteItemId}/quantity/{quantity}?updatemode={updateMode}&responseFields={responseFields}");
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("quoteItemId", quoteItemId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteQuoteItem
	 * @param quoteId A unique identifier for the quote tha the item being deleted belongs to.
	 * @param quoteItemId A unique identifier for an item included in the quote.
	 * @param updateMode 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteQuoteItemUrl(String quoteId, String quoteItemId, String updateMode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}/items/{quoteItemId}?updatemode={updateMode}");
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("quoteItemId", quoteItemId);
		formatter.formatUrl("updateMode", updateMode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

