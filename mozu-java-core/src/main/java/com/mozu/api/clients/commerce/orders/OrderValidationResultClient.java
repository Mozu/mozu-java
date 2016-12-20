/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Manage the results of order validation.
 * </summary>
 */
public class OrderValidationResultClient {
	
	/**
	 * Retrieves a list of the validation results associated with the order.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>> mozuClient=GetValidationResultsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderValidationResult orderValidationResult = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>> getValidationResultsClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderValidationResultUrl.getValidationResultsUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Add a new order validation result to a submitted order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> mozuClient=AddValidationResultClient( validationResult,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderValidationResult orderValidationResult = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param validationResult Properties of the resulting order validation performed by an order validation capability.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> addValidationResultClient(com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult validationResult, String orderId) throws Exception
	{
		return addValidationResultClient( validationResult,  orderId,  null);
	}

	/**
	 * Add a new order validation result to a submitted order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> mozuClient=AddValidationResultClient( validationResult,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderValidationResult orderValidationResult = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param validationResult Properties of the resulting order validation performed by an order validation capability.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> addValidationResultClient(com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult validationResult, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderValidationResultUrl.addValidationResultUrl(orderId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(validationResult);
		return mozuClient;

	}

}



