/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Returns resource to manage returned items that were previously fufilled. Returns can include any number of items associated with an original Mozu order. Each return must either be associated with an original order or a product definition to represent each returned item.
 * </summary>
 */
public class ReturnClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=GetReturnsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> getReturnsClient() throws Exception
	{
		return getReturnsClient( null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=GetReturnsClient( startIndex,  pageSize,  sortBy,  filter,  q,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> getReturnsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnsUrl(filter, pageSize, q, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableReturnActionsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to retrieve available actions.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableReturnActionsClient(String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getAvailableReturnActionsUrl(returnId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient=GetReturnItemClient( returnId,  returnItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItem returnItem = client.Result();
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItemId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItem>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> getReturnItemClient(String returnId, String returnItemId) throws Exception
	{
		return getReturnItemClient( returnId,  returnItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient=GetReturnItemClient( returnId,  returnItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItem returnItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId 
	 * @param returnItemId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItem>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> getReturnItemClient(String returnId, String returnItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnItemUrl(responseFields, returnId, returnItemId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient=GetReturnItemsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItemCollection returnItemCollection = client.Result();
	 * </code></pre></p>
	 * @param returnId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> getReturnItemsClient(String returnId) throws Exception
	{
		return getReturnItemsClient( returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient=GetReturnItemsClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItemCollection returnItemCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> getReturnItemsClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnItemsUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePaymentActionsForReturnClient( returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePaymentActionsForReturnClient(String returnId, String paymentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getAvailablePaymentActionsForReturnUrl(paymentId, returnId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String returnId, String paymentId) throws Exception
	{
		return getPaymentClient( returnId,  paymentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( returnId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getPaymentUrl(paymentId, responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.Payment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String returnId) throws Exception
	{
		return getPaymentsClient( returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getPaymentsUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.PaymentCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=GetReturnClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> getReturnClient(String returnId) throws Exception
	{
		return getReturnClient( returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=GetReturnClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> getReturnClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient=GetReasonsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReasonCollection reasonCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> getReasonsClient() throws Exception
	{
		return getReasonsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient=GetReasonsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReasonCollection reasonCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> getReasonsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReasonsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReasonCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnClient( ret);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param ret Wrapper for the properties of the return to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret) throws Exception
	{
		return createReturnClient( ret,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnClient( ret,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param ret Wrapper for the properties of the return to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createReturnUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(ret);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnItemClient( returnItem,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnItemClient(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId) throws Exception
	{
		return createReturnItemClient( returnItem,  returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnItemClient( returnItem,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId 
	 * @param returnItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnItemClient(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createReturnItemUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(returnItem);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=PerformPaymentActionForReturnClient( action,  returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @param action The payment action to perform for the refund payment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> performPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId) throws Exception
	{
		return performPaymentActionForReturnClient( action,  returnId,  paymentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=PerformPaymentActionForReturnClient( action,  returnId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @param action The payment action to perform for the refund payment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> performPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.performPaymentActionForReturnUrl(paymentId, responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreatePaymentActionForReturnClient( action,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @param action The payment action to perform for the customer return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId) throws Exception
	{
		return createPaymentActionForReturnClient( action,  returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreatePaymentActionForReturnClient( action,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @param action The payment action to perform for the customer return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createPaymentActionForReturnUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateReturnShippingOrderClient( itemQuantities,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param returnId 
	 * @param itemQuantities 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemSpecifier
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createReturnShippingOrderClient(List<com.mozu.api.contracts.commerceruntime.returns.ReturnItemSpecifier> itemQuantities, String returnId) throws Exception
	{
		return createReturnShippingOrderClient( itemQuantities,  returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateReturnShippingOrderClient( itemQuantities,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId 
	 * @param itemQuantities 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemSpecifier
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createReturnShippingOrderClient(List<com.mozu.api.contracts.commerceruntime.returns.ReturnItemSpecifier> itemQuantities, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createReturnShippingOrderUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(itemQuantities);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=PerformReturnActionsClient( action);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param action The name of the return action to perform, such as "Reject" or "Authorize".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> performReturnActionsClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		return performReturnActionsClient( action,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=PerformReturnActionsClient( action,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param action The name of the return action to perform, such as "Reject" or "Authorize".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> performReturnActionsClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.performReturnActionsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=UpdateReturnClient( ret,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return.
	 * @param ret Wrapper for the array of properties to update for the return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> updateReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId) throws Exception
	{
		return updateReturnClient( ret,  returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=UpdateReturnClient( ret,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnId Unique identifier of the return.
	 * @param ret Wrapper for the array of properties to update for the return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> updateReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.updateReturnUrl(responseFields, returnId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(ret);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ResendReturnEmailClient( action);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param action 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient<java.io.InputStream> resendReturnEmailClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.resendReturnEmailUrl();
		String verb = "PUT";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=DeleteOrderItemClient( returnId,  returnItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItemId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> deleteOrderItemClient(String returnId, String returnItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.deleteOrderItemUrl(returnId, returnItemId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteReturnClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return to delete.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteReturnClient(String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.deleteReturnUrl(returnId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



