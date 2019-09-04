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

public class QuoteUrl
{

	/**
	 * Get Resource Url for GetQuotes
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuotesUrl(String filter, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&responseFields={responseFields}");
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
	 * Get Resource Url for GetQuote
	 * @param quoteId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuoteUrl(String quoteId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}?responseFields={responseFields}");
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetQuoteByName
	 * @param customerAccountId 
	 * @param quoteName 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getQuoteByNameUrl(Integer customerAccountId, String quoteName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/customers/{customerAccountId}/{quoteName}?responseFields={responseFields}");
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("quoteName", quoteName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateQuote
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createQuoteUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateQuote
	 * @param quoteId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateQuoteUrl(String quoteId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}?responseFields={responseFields}");
		formatter.formatUrl("quoteId", quoteId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteQuote
	 * @param quoteId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteQuoteUrl(String quoteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/quotes/{quoteId}");
		formatter.formatUrl("quoteId", quoteId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

