/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.QuoteResource;

/** <summary>
 * Quotes support the eCommerce B2B feature by providing functionality similar to that of standard wishlists. However, comments can be added to quotes to provide clearer information to other users accessing the quote through the shared B2B account. These basic APIs provide the ability to create new quotes, update them, and retrieve their information.These APIs are currently a work-in-progress and will be enhanced in the future as more functionality such as setting fixed prices, setting expiration, etc. is released. The current models may change and break backwards compatibility, so use caution if interacting with these APIs for now.
 * </summary>
 */
public class QuoteFactory
{

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteCollection getQuotes(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getQuotes(apiContext,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.QuoteCollection getQuotes(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.QuoteCollection returnObj = new com.mozu.api.contracts.commerceruntime.quotes.QuoteCollection();
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.getQuotes( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote getQuote(ApiContext apiContext, String quoteId, int expectedCode) throws Exception
	{
		return getQuote(apiContext,  quoteId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote getQuote(ApiContext apiContext, String quoteId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.getQuote( quoteId,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote getQuoteByName(ApiContext apiContext, Integer customerAccountId, String quoteName, int expectedCode) throws Exception
	{
		return getQuoteByName(apiContext,  customerAccountId,  quoteName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote getQuoteByName(ApiContext apiContext, Integer customerAccountId, String quoteName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.getQuoteByName( customerAccountId,  quoteName,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote createQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.quotes.Quote quote, int expectedCode) throws Exception
	{
		return createQuote(apiContext,  quote,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote createQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.quotes.Quote quote, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.createQuote( quote,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.quotes.Quote quote, String quoteId, int expectedCode) throws Exception
	{
		return updateQuote(apiContext,  quote,  quoteId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.quotes.Quote updateQuote(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.quotes.Quote quote, String quoteId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.quotes.Quote returnObj = new com.mozu.api.contracts.commerceruntime.quotes.Quote();
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.updateQuote( quote,  quoteId,  responseFields);
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

	public static java.io.InputStream deleteQuote(ApiContext apiContext, String quoteId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		QuoteResource resource = new QuoteResource(apiContext);
		try
		{
			returnObj = resource.deleteQuote( quoteId);
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


