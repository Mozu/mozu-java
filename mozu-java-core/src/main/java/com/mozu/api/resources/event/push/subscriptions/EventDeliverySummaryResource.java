/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.event.push.subscriptions;

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
 * Provides details for each attempted delivery of the event to the endpoint.
 * </summary>
 */
public class EventDeliverySummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public EventDeliverySummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummary eventDeliverySummary = eventdeliverysummary.getDeliveryAttemptSummary( subscriptionId);
	 * </code></pre></p>
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return com.mozu.api.contracts.event.EventDeliverySummary
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummary( subscriptionId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummary eventDeliverySummary = eventdeliverysummary.getDeliveryAttemptSummary( subscriptionId,  processId,  responseFields);
	 * </code></pre></p>
	 * @param processId 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return com.mozu.api.contracts.event.EventDeliverySummary
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public com.mozu.api.contracts.event.EventDeliverySummary getDeliveryAttemptSummary(String subscriptionId, Integer processId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> client = com.mozu.api.clients.event.push.subscriptions.EventDeliverySummaryClient.getDeliveryAttemptSummaryClient( subscriptionId,  processId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummaryCollection eventDeliverySummaryCollection = eventdeliverysummary.getDeliveryAttemptSummaries( subscriptionId);
	 * </code></pre></p>
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummaries( subscriptionId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	EventDeliverySummary eventdeliverysummary = new EventDeliverySummary();
	 *	EventDeliverySummaryCollection eventDeliverySummaryCollection = eventdeliverysummary.getDeliveryAttemptSummaries( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param subscriptionId Unique identifier for a subscription, such as subscribing tenants for an event or to receive a notification.
	 * @return com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public com.mozu.api.contracts.event.EventDeliverySummaryCollection getDeliveryAttemptSummaries(String subscriptionId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> client = com.mozu.api.clients.event.push.subscriptions.EventDeliverySummaryClient.getDeliveryAttemptSummariesClient( subscriptionId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



