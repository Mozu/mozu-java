/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

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
 * Use the Customer Sets resource to manage your customer sets. You can use customer sets to control the specific sites your customers can access using the same login credentials, as well as what customer My Account information is shared between sites.Refer to [Customer Sets](../../../guides/settings/customer-sets.htm) in the Guides section for more information.
 * </summary>
 */
public class CustomerSetClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> mozuClient=GetCustomerSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSetCollection customerSetCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSetCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> getCustomerSetsClient() throws Exception
	{
		return getCustomerSetsClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> mozuClient=GetCustomerSetsClient( startIndex,  pageSize,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSetCollection customerSetCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSetCollection>
	 * @see com.mozu.api.contracts.customer.CustomerSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> getCustomerSetsClient(Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSetUrl.getCustomerSetsUrl(pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSetCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSetCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSet> mozuClient=GetCustomerSetClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSet customerSet = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSet>
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSet> getCustomerSetClient(String code) throws Exception
	{
		return getCustomerSetClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerSet> mozuClient=GetCustomerSetClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerSet customerSet = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerSet>
	 * @see com.mozu.api.contracts.customer.CustomerSet
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerSet> getCustomerSetClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CustomerSetUrl.getCustomerSetUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerSet.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerSet> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



