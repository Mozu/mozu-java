/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use this subresource to manage ad-hoc order level price adjustments.
 * </summary>
 */
public class AdjustmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AdjustmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyHandlingAdjustment( adjustment,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param adjustment 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyHandlingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyHandlingAdjustment( adjustment,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyHandlingAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param adjustment 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyHandlingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.applyHandlingAdjustmentClient( adjustment,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyShippingAdjustment( adjustment,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyShippingAdjustment( adjustment,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyShippingAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyShippingAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.applyShippingAdjustmentClient( adjustment,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyAdjustment( adjustment,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId) throws Exception
	{
		return applyAdjustment( adjustment,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.applyAdjustment( adjustment,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param adjustment Properties of an ad-hoc price adjustment for an order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.commerce.Adjustment
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order applyAdjustment(com.mozu.api.contracts.commerceruntime.commerce.Adjustment adjustment, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.applyAdjustmentClient( adjustment,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeHandlingAdjustment( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeHandlingAdjustment(String orderId) throws Exception
	{
		return removeHandlingAdjustment( orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeHandlingAdjustment( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeHandlingAdjustment(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.removeHandlingAdjustmentClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeShippingAdjustment( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(String orderId) throws Exception
	{
		return removeShippingAdjustment( orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeShippingAdjustment( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeShippingAdjustment(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.removeShippingAdjustmentClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeAdjustment( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(String orderId) throws Exception
	{
		return removeAdjustment( orderId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Adjustment adjustment = new Adjustment();
	 *	Order order = adjustment.removeAdjustment( orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order removeAdjustment(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AdjustmentClient.removeAdjustmentClient( orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



