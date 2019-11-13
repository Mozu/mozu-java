/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.quotes;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.quotes.OrderItemResource;

/** <summary>
 * Quote Items are the individual products that are added to a particular quote, which serves as the wishlists of the B2B feature.Like the quotes themselves, the quote items APIs are a work-in-progress that will be enhanced with future releases. Use caution when interacting with these APIs, as their current models may change and break backwards compatibility as functionality is added.
 * </summary>
 */
public class OrderItemFactory
{

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItem getQuoteItem(ApiContext apiContext, String quoteId, String quoteItemId, int expectedCode) throws Exception
	{
		return getQuoteItem(apiContext,  quoteId,  quoteItemId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.orders.OrderItem getQuoteItem(ApiContext apiContext, String quoteId, String quoteItemId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.orders.OrderItem returnObj = new com.mozu.api.contracts.commerceruntime.orders.OrderItem();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.getQuoteItem( quoteId,  quoteItemId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItems(ApiContext apiContext, String quoteId, int expectedCode) throws Exception
	{
		return getQuoteItems(apiContext,  quoteId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItems(ApiContext apiContext, String quoteId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection returnObj = new com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.getQuoteItems( quoteId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItemsByQuoteName(ApiContext apiContext, Integer customerAccountId, String quoteName, int expectedCode) throws Exception
	{
		return getQuoteItemsByQuoteName(apiContext,  customerAccountId,  quoteName,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection getQuoteItemsByQuoteName(ApiContext apiContext, Integer customerAccountId, String quoteName, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection returnObj = new com.mozu.api.contracts.commerceruntime.quotes.QuoteItemCollection();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.getQuoteItemsByQuoteName( customerAccountId,  quoteName,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote addItemToQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, int expectedCode) throws Exception
	{
		return addItemToQuote(apiContext,  quoteItem,  quoteId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote addItemToQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.addItemToQuote( quoteItem,  quoteId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuoteItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, int expectedCode) throws Exception
	{
		return updateQuoteItem(apiContext,  quoteItem,  quoteId,  quoteItemId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuoteItem(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.orders.OrderItem quoteItem, String quoteId, String quoteItemId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.updateQuoteItem( quoteItem,  quoteId,  quoteItemId,  responseFields);
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

	public static java.io.InputStream deleteQuoteItem(ApiContext apiContext, String quoteId, String quoteItemId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		OrderItemResource resource = new OrderItemResource(apiContext);
		try
		{
			returnObj = resource.deleteQuoteItem( quoteId,  quoteItemId);
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

}



