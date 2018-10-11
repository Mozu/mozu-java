/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactorycommerce.catalog.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.PriceListResource;

/** <summary>
 * Use the Price Lists resource to view and create price lists. You can use price lists to override the catalog pricing of products for specific customer segments and/or sites. You can override products' list price, sale price, advanced pricing information such as MSRP, cost, MAP, and the catalog price of any extras associated with the product in a price list. You can also restrict discounts from applying to the overridden product pricing in a price list. Refer to [Price Lists](../../../guides/catalog/price-lists.htm) in the Guides section for more information about price lists.
 * </summary>
 */
public class PriceListFactory
{

	public static com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getPriceLists(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceListCollection returnObj = new com.mozu.api.contracts.productadmin.PriceListCollection();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.getPriceLists( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.PriceList getPriceList(ApiContext apiContext, String priceListCode, int expectedCode) throws Exception
	{
		return getPriceList(apiContext,  priceListCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceList getPriceList(ApiContext apiContext, String priceListCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceList returnObj = new com.mozu.api.contracts.productadmin.PriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.getPriceList( priceListCode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.PriceList addPriceList(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceList priceList, int expectedCode) throws Exception
	{
		return addPriceList(apiContext,  priceList,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceList addPriceList(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceList returnObj = new com.mozu.api.contracts.productadmin.PriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.addPriceList( priceList,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void bulkAddPriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, int expectedCode) throws Exception
	{
		bulkAddPriceListEntries(apiContext,  priceListEntriesIn,  null,  null, expectedCode);
	}

	public static void bulkAddPriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, Boolean publishEvents, Boolean invalidateCache, int expectedCode) throws Exception
	{
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			resource.bulkAddPriceListEntries( priceListEntriesIn,  publishEvents,  invalidateCache);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void bulkDeletePriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, int expectedCode) throws Exception
	{
		bulkDeletePriceListEntries(apiContext,  priceListEntriesIn,  null,  null, expectedCode);
	}

	public static void bulkDeletePriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, Boolean publishEvents, Boolean invalidateCache, int expectedCode) throws Exception
	{
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			resource.bulkDeletePriceListEntries( priceListEntriesIn,  publishEvents,  invalidateCache);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void bulkUpdatePriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, int expectedCode) throws Exception
	{
		bulkUpdatePriceListEntries(apiContext,  priceListEntriesIn,  null,  null, expectedCode);
	}

	public static void bulkUpdatePriceListEntries(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.PriceListEntry> priceListEntriesIn, Boolean publishEvents, Boolean invalidateCache, int expectedCode) throws Exception
	{
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			resource.bulkUpdatePriceListEntries( priceListEntriesIn,  publishEvents,  invalidateCache);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static com.mozu.api.contracts.productadmin.PriceList updatePriceList(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, int expectedCode) throws Exception
	{
		return updatePriceList(apiContext,  priceList,  priceListCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PriceList updatePriceList(ApiContext apiContext, com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PriceList returnObj = new com.mozu.api.contracts.productadmin.PriceList();
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			returnObj = resource.updatePriceList( priceList,  priceListCode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deletePriceList(ApiContext apiContext, String priceListCode, int expectedCode) throws Exception
	{
		deletePriceList(apiContext,  priceListCode,  null, expectedCode);
	}

	public static void deletePriceList(ApiContext apiContext, String priceListCode, Boolean cascadeDeleteEntries, int expectedCode) throws Exception
	{
		PriceListResource resource = new PriceListResource(apiContext);
		try
		{
			resource.deletePriceList( priceListCode,  cascadeDeleteEntries);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



