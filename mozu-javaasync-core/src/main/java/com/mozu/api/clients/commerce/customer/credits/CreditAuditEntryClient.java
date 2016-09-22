/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.credits;

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
 * Use the Customer Credit Audit Entries subresource to retrieve entries logged in the audit report of a store credit or gift card applied to a customer account. The system creates a new audit entry when the credit is created, deleted, activated, or deactivated. The system then creates a new audit entry each time the credit is updated or redeemed in a transaction.
 * </summary>
 */
public class CreditAuditEntryClient {
	
	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient=GetAuditEntriesClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditAuditEntryCollection creditAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> getAuditEntriesClient(String code) throws Exception
	{
		return getAuditEntriesClient( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient=GetAuditEntriesClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditAuditEntryCollection creditAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> getAuditEntriesClient(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.credits.CreditAuditEntryUrl.getAuditEntriesUrl(code, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



