/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.checkouts;

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
 * 
 * </summary>
 */
public class OrderAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.getCheckoutAttributes( checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> getCheckoutAttributes(String checkoutId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.checkouts.OrderAttributeClient.getCheckoutAttributesClient( checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.createCheckoutAttributes( checkoutAttributes,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param checkoutAttributes 
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> createCheckoutAttributes(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> checkoutAttributes, String checkoutId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.checkouts.OrderAttributeClient.createCheckoutAttributesClient( checkoutAttributes,  checkoutId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.updateCheckoutAttribute( checkoutAttributes,  checkoutId);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param checkoutAttributes 
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> updateCheckoutAttribute(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> checkoutAttributes, String checkoutId) throws Exception
	{
		return updateCheckoutAttribute( checkoutAttributes,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	OrderAttribute orderattribute = new OrderAttribute();
	 *	OrderAttribute orderAttribute = orderattribute.updateCheckoutAttribute( checkoutAttributes,  checkoutId,  removeMissing);
	 * </code></pre></p>
	 * @param checkoutId 
	 * @param removeMissing 
	 * @param checkoutAttributes 
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAttribute
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> updateCheckoutAttribute(List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute> checkoutAttributes, String checkoutId, Boolean removeMissing) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderAttribute>> client = com.mozu.api.clients.commerce.checkouts.OrderAttributeClient.updateCheckoutAttributeClient( checkoutAttributes,  checkoutId,  removeMissing);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



