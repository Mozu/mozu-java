/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.credits;

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
 * Use the Customer Credit Audit Entries subresource to retrieve entries logged in the audit report of a store credit or gift card applied to a customer account. The system creates a new audit entry when the credit is created, deleted, activated, or deactivated. The system then creates a new audit entry each time the credit is updated or redeemed in a transaction.
 * </summary>
 */
public class CreditAuditEntryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CreditAuditEntryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CreditAuditEntryCollection creditAuditEntryCollection = creditauditentry.getAuditEntries( code);
	 * </code></pre></p>
	 * @param code User-defined code of the credit for which to retrieve audit entries.
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(String code) throws Exception
	{
		return getAuditEntries( code,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CreditAuditEntryCollection creditAuditEntryCollection = creditauditentry.getAuditEntries( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code of the credit for which to retrieve audit entries.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> client = com.mozu.api.clients.commerce.customer.credits.CreditAuditEntryClient.getAuditEntriesClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



