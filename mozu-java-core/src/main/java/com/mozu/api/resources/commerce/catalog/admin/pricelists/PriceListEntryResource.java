/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.pricelists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Entries sub-resource to interact with price list entries. Price list entries enable you to override product pricing as well as control what products shoppers can view and purchase when the price list is exclusive. Refer to the [Price Lists](../../../guides/catalog/price-lists.htm) guides topic for more information.
 * </summary>
 */
public class PriceListEntryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PriceListEntryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return getPriceListEntry( priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * Retrieves the details of a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of price list entries associated with the specified price list according to any specified facets, filter criteria, and sort options.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntryCollection priceListEntryCollection = pricelistentry.getPriceListEntries( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(String priceListCode) throws Exception
	{
		return getPriceListEntries( priceListCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of price list entries associated with the specified price list according to any specified facets, filter criteria, and sort options.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntryCollection priceListEntryCollection = pricelistentry.getPriceListEntries( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntriesClient( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new price list entry to the specified price list.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The specified price list to which you want to add the price list entry.
	 * @param priceListEntryIn Mozu.ProductAdmin.Contracts.PriceListEntry ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode) throws Exception
	{
		return addPriceListEntry( priceListEntryIn,  priceListCode,  null);
	}

	/**
	 * Adds a new price list entry to the specified price list.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode The specified price list to which you want to add the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceListEntryIn Mozu.ProductAdmin.Contracts.PriceListEntry ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.addPriceListEntryClient( priceListEntryIn,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param priceListEntryIn Mozu.ProductAdmin.Contracts.PriceListEntry ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * Updates the details of a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @param priceListEntryIn Mozu.ProductAdmin.Contracts.PriceListEntry ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.updatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	pricelistentry.deletePriceListEntry( priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The code of the specified price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return 
	 */
	public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		deletePriceListEntry( priceListCode,  productCode,  currencyCode,  null);
	}

	/**
	 * Deletes a price list entry.
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	pricelistentry.deletePriceListEntry( priceListCode,  productCode,  currencyCode,  startDate);
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The code of the specified price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param startDate The start date of the price list entry.
	 * @return 
	 */
	public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode, DateTime startDate) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.deletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



