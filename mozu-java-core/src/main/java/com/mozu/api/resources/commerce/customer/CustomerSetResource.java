/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

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
 * Use the Customer Sets resource to manage your customer sets. You can use customer sets to control the specific sites your customers can access using the same login credentials, as well as what customer My Account information is shared between sites.Refer to [Customer Sets](../../../guides/settings/customer-sets.htm) in the Guides section for more information.
 * </summary>
 */
public class CustomerSetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerSetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSetCollection customerSetCollection = customerset.getCustomerSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSetCollection getCustomerSets() throws Exception
	{
		return getCustomerSets( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSetCollection customerSetCollection = customerset.getCustomerSets( startIndex,  pageSize,  sortBy,  responseFields);
	 * </code></pre></p>
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.CustomerSetCollection
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSetCollection getCustomerSets(Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetsClient( startIndex,  pageSize,  sortBy,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSet customerSet = customerset.getCustomerSet( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public com.mozu.api.contracts.customer.CustomerSet getCustomerSet(String code) throws Exception
	{
		return getCustomerSet( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSet customerset = new CustomerSet();
	 *	CustomerSet customerSet = customerset.getCustomerSet( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerSet
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public com.mozu.api.contracts.customer.CustomerSet getCustomerSet(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSet> client = com.mozu.api.clients.commerce.customer.CustomerSetClient.getCustomerSetClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



