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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
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
	 * @param subscriptionId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummary>
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> getDeliveryAttemptSummaryClient(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummaryClient( subscriptionId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> mozuClient=GetDeliveryAttemptSummaryClient( subscriptionId,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummary eventDeliverySummary = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param subscriptionId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummary>
	 * @see com.mozu.api.contracts.event.EventDeliverySummary
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> getDeliveryAttemptSummaryClient(String subscriptionId, Integer id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.subscriptions.EventDeliverySummaryUrl.getDeliveryAttemptSummaryUrl(id, subscriptionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.EventDeliverySummary.class;
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummary> mozuClient = new MozuClient(clz);
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
	 * @param subscriptionId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummaryCollection>
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> getDeliveryAttemptSummariesClient(String subscriptionId) throws Exception
	{
		return getDeliveryAttemptSummariesClient( subscriptionId,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> mozuClient=GetDeliveryAttemptSummariesClient( subscriptionId,  startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EventDeliverySummaryCollection eventDeliverySummaryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param subscriptionId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.event.EventDeliverySummaryCollection>
	 * @see com.mozu.api.contracts.event.EventDeliverySummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> getDeliveryAttemptSummariesClient(String subscriptionId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.event.push.subscriptions.EventDeliverySummaryUrl.getDeliveryAttemptSummariesUrl(filter, pageSize, sortBy, startIndex, subscriptionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.event.EventDeliverySummaryCollection.class;
		MozuClient<com.mozu.api.contracts.event.EventDeliverySummaryCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



