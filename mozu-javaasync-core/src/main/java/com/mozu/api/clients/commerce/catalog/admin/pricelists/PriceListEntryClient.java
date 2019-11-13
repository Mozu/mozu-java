/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.pricelists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Entries sub-resource to interact with price list entries. Price list entries enable you to override product pricing as well as control what products shoppers can view and purchase when the price list is exclusive. Refer to the [Price Lists](../../../guides/catalog/price-lists.htm) guides topic for more information.
 * </summary>
 */
public class PriceListEntryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=GetPriceListEntryClient( priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> getPriceListEntryClient(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return getPriceListEntryClient( priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=GetPriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> getPriceListEntryClient(String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.getPriceListEntryUrl(currencyCode, priceListCode, productCode, responseFields, startDate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient=GetPriceListEntriesClient( priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntryCollection priceListEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntryCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> getPriceListEntriesClient(String priceListCode) throws Exception
	{
		return getPriceListEntriesClient( priceListCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient=GetPriceListEntriesClient( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntryCollection priceListEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntryCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> getPriceListEntriesClient(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.getPriceListEntriesUrl(filter, pageSize, priceListCode, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=AddPriceListEntryClient( priceListEntryIn,  priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The specified price list to which you want to add the price list entry.
	 * @param priceListEntryIn The details of the new price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> addPriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode) throws Exception
	{
		return addPriceListEntryClient( priceListEntryIn,  priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=AddPriceListEntryClient( priceListEntryIn,  priceListCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The specified price list to which you want to add the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceListEntryIn The details of the new price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> addPriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.addPriceListEntryUrl(priceListCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListEntryIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=UpdatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param priceListEntryIn The updated details of the price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> updatePriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return updatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=UpdatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @param priceListEntryIn The updated details of the price list entry.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> updatePriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.updatePriceListEntryUrl(currencyCode, priceListCode, productCode, responseFields, startDate);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListEntryIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeletePriceListEntryClient( priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The code of the specified price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deletePriceListEntryClient(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return deletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISOÂ currency code, such as USDÂ for US Dollars.
	 * @param priceListCode The code of the specified price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout  to reference and associate to a product.
	 * @param startDate The start date of the price list entry.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deletePriceListEntryClient(String priceListCode, String productCode, String currencyCode, DateTime startDate) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.deletePriceListEntryUrl(currencyCode, priceListCode, productCode, startDate);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



