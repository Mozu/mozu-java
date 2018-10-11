/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.event.push.subscriptions;

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
 * Provides details for each attempted delivery of the event to the endpoint.
 * </summary>
 */
public class EventDeliverySummaryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> mozuClient=GetDeliveryAttemptSummaryClient( subscriptionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummary eventDeliverySummary = client.Result();
	 * </code></pre></p>
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummary>
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> getDeliveryAttemptSummaryClient(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummaryClient( subscriptionId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> mozuClient=GetDeliveryAttemptSummaryClient( subscriptionId,  processId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummary eventDeliverySummary = client.Result();
	 * </code></pre></p>
	 * @param processId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummary>
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> getDeliveryAttemptSummaryClient(String subscriptionId, Integer processId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.subscriptions.EventDeliverySummaryUrl.getDeliveryAttemptSummaryUrl(processId, responseFields, subscriptionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.EventDeliverySummary.class;
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> mozuClient = (MozuClient<com.mozu.api.contracts.event.EventDeliverySummary>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> mozuClient=GetDeliveryAttemptSummariesClient( subscriptionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummaryCollection eventDeliverySummaryCollection = client.Result();
	 * </code></pre></p>
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummaryCollection>
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> getDeliveryAttemptSummariesClient(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummariesClient( subscriptionId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> mozuClient=GetDeliveryAttemptSummariesClient( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummaryCollection eventDeliverySummaryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummaryCollection>
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> getDeliveryAttemptSummariesClient(String subscriptionId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.subscriptions.EventDeliverySummaryUrl.getDeliveryAttemptSummariesUrl(filter, pageSize, responseFields, sortBy, startIndex, subscriptionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.EventDeliverySummaryCollection.class;
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



