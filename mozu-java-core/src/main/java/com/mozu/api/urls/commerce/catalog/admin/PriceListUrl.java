/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class PriceListUrl
{

	/**
	 * Get Resource Url for GetPriceLists
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPriceListsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPriceList
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPriceListUrl(String priceListCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}?responseFields={responseFields}");
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddPriceList
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl addPriceListUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for BulkAddPriceListEntries
	 * @param invalidateCache Disable this property if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries. Otherwise, leave this property enabled.
	 * @param publishEvents Disable this property to prevent publishing the event related to adding price list entries to the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event.
	 * @return   String Resource Url
	 */
	public static MozuUrl bulkAddPriceListEntriesUrl(Boolean invalidateCache, Boolean publishEvents)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/bulkaddentries?publishEvents={publishEvents}&invalidateCache={invalidateCache}");
		formatter.formatUrl("invalidateCache", invalidateCache);
		formatter.formatUrl("publishEvents", publishEvents);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for BulkDeletePriceListEntries
	 * @param invalidateCache Disable this property if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries. Otherwise, leave this property enabled.
	 * @param publishEvents Disable this property to prevent publishing the event related to deleting price list entries from the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event.
	 * @return   String Resource Url
	 */
	public static MozuUrl bulkDeletePriceListEntriesUrl(Boolean invalidateCache, Boolean publishEvents)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/bulkdeleteentries?publishEvents={publishEvents}&invalidateCache={invalidateCache}");
		formatter.formatUrl("invalidateCache", invalidateCache);
		formatter.formatUrl("publishEvents", publishEvents);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for BulkUpdatePriceListEntries
	 * @param invalidateCache Disable this property if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries. Otherwise, leave this property enabled.
	 * @param publishEvents Disable this property to prevent publishing the event related to updating price list entries in the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event.
	 * @return   String Resource Url
	 */
	public static MozuUrl bulkUpdatePriceListEntriesUrl(Boolean invalidateCache, Boolean publishEvents)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/bulkupdateentries?publishEvents={publishEvents}&invalidateCache={invalidateCache}");
		formatter.formatUrl("invalidateCache", invalidateCache);
		formatter.formatUrl("publishEvents", publishEvents);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePriceList
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePriceListUrl(String priceListCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}?responseFields={responseFields}");
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePriceList
	 * @param cascadeDeleteEntries Specifies whether to deletes all price list entries associated with the price list.
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePriceListUrl(Boolean cascadeDeleteEntries, String priceListCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}?cascadeDeleteEntries={cascadeDeleteEntries}");
		formatter.formatUrl("cascadeDeleteEntries", cascadeDeleteEntries);
		formatter.formatUrl("priceListCode", priceListCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

