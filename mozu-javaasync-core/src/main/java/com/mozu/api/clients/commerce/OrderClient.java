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
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient=GetOrdersClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderCollection orderCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> getOrdersClient() throws Exception
	{
		return getOrdersClient( null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient=GetOrdersClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  includeBin,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderCollection orderCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter an order's search results by any of its properties, including status, contact information, or total. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Status+eq+Submitted"
	 * @param includeBin 
	 * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. Default value: 20. Max value: 200.
	 * @param q A list of order search terms to use in the query when searching across order number and the name or email of the billing contact. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts 'asc' or 'asc' or descending order (z-a) which accepts 'desc' or 'desc'. The sortBy parameter follows an available property. For examp
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> getOrdersClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean includeBin, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getOrdersUrl(filter, includeBin, pageSize, q, qLimit, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableActionsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the available order actions to get.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableActionsClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getAvailableActionsUrl(orderId);
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
	 * MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> mozuClient=GetTaxableOrdersClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableOrder taxableOrder = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to retrieve.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.pricingruntime.TaxableOrder>>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public static MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> getTaxableOrdersClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getTaxableOrdersUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.pricingruntime.TaxableOrder>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> mozuClient = (MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=GetOrderClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order details to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> getOrderClient(String orderId) throws Exception
	{
		return getOrderClient( orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=GetOrderClient( orderId,  draft,  includeBin,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param includeBin 
	 * @param orderId Unique identifier of the order details to get.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> getOrderClient(String orderId, Boolean draft, Boolean includeBin, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getOrderUrl(draft, includeBin, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderFromCartClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderFromCartClient(String cartId) throws Exception
	{
		return createOrderFromCartClient( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderFromCartClient( cartId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderFromCartClient(String cartId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.createOrderFromCartUrl(cartId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderClient( order);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param order Properties of the order to create and submit.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order) throws Exception
	{
		return createOrderClient( order,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderClient( order,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param order Properties of the order to create and submit.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.createOrderUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(order);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformOrderActionClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action The action to perform for the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performOrderActionClient(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		return performOrderActionClient( action,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformOrderActionClient( action,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @param action The action to perform for the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performOrderActionClient(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.performOrderActionUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PriceOrderClient( order,  refreshShipping);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param refreshShipping 
	 * @param order 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> priceOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, Boolean refreshShipping) throws Exception
	{
		return priceOrderClient( order,  refreshShipping,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PriceOrderClient( order,  refreshShipping,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param refreshShipping 
	 * @param responseFields 
	 * @param order 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> priceOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, Boolean refreshShipping, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.priceOrderUrl(refreshShipping, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(order);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ProcessDigitalWalletClient( digitalWallet,  orderId,  digitalWalletType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param digitalWalletType 
	 * @param orderId 
	 * @param digitalWallet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> processDigitalWalletClient(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType) throws Exception
	{
		return processDigitalWalletClient( digitalWallet,  orderId,  digitalWalletType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ProcessDigitalWalletClient( digitalWallet,  orderId,  digitalWalletType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param digitalWalletType 
	 * @param orderId 
	 * @param responseFields 
	 * @param digitalWallet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> processDigitalWalletClient(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.processDigitalWalletUrl(digitalWalletType, orderId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(digitalWallet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderDiscountClient( discount,  orderId,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param discount Properties of the order discount to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId) throws Exception
	{
		return updateOrderDiscountClient( discount,  orderId,  discountId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderDiscountClient( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param responseFields 
	 * @param updateMode Specifies whether to modify the discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @param discount Properties of the order discount to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.updateOrderDiscountUrl(discountId, orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOrderDraftClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOrderDraftClient(String orderId) throws Exception
	{
		return deleteOrderDraftClient( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOrderDraftClient( orderId,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param version If applicable, the version of the order draft to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOrderDraftClient(String orderId, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.deleteOrderDraftUrl(orderId, version);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendOrderConfirmationEmailClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId 
	 * @param action 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public static MozuClient resendOrderConfirmationEmailClient(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.resendOrderConfirmationEmailUrl(orderId);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ChangeOrderPriceListClient( priceListCode,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param priceListCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> changeOrderPriceListClient(String priceListCode, String orderId) throws Exception
	{
		return changeOrderPriceListClient( priceListCode,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ChangeOrderPriceListClient( priceListCode,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param version 
	 * @param priceListCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> changeOrderPriceListClient(String priceListCode, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.changeOrderPriceListUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListCode);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ChangeOrderUserIdClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> changeOrderUserIdClient(String orderId) throws Exception
	{
		return changeOrderUserIdClient( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ChangeOrderUserIdClient( orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> changeOrderUserIdClient(String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.changeOrderUserIdUrl(orderId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderClient( order,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param order The properties of the order to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrderClient( order,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderClient( order,  orderId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param responseFields 
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @param order The properties of the order to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.updateOrderUrl(orderId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(order);
		return mozuClient;

	}

}



