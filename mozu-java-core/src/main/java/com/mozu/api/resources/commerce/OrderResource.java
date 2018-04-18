/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.getOrders();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders() throws Exception
	{
		return getOrders( null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.getOrders( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  includeBin,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter an order's search results by any of its properties, including status, contact information, or total. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Status+eq+Submitted"
	 * @param includeBin 
	 * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. Default value: 20. Max value: 200.
	 * @param q A list of order search terms to use in the query when searching across order number and the name or email of the billing contact. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts 'asc' or 'asc' or descending order (z-a) which accepts 'desc' or 'desc'. The sortBy parameter follows an available property. For examp
	 * @param startIndex 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean includeBin, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> client = com.mozu.api.clients.commerce.OrderClient.getOrdersClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  includeBin,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	string string = order.getAvailableActions( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the available order actions to get.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableActions(String orderId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.OrderClient.getAvailableActionsClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	TaxableOrder taxableOrder = order.getTaxableOrders( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to retrieve.
	 * @return List<com.mozu.api.contracts.pricingruntime.TaxableOrder>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public List<com.mozu.api.contracts.pricingruntime.TaxableOrder> getTaxableOrders(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> client = com.mozu.api.clients.commerce.OrderClient.getTaxableOrdersClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.getOrder( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order details to get.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId) throws Exception
	{
		return getOrder( orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.getOrder( orderId,  draft,  includeBin,  responseFields);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param includeBin 
	 * @param orderId Unique identifier of the order details to get.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId, Boolean draft, Boolean includeBin, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.getOrderClient( orderId,  draft,  includeBin,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrderFromCart( cartId);
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId) throws Exception
	{
		return createOrderFromCart( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrderFromCart( cartId,  responseFields);
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderFromCartClient( cartId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrder( order);
	 * </code></pre></p>
	 * @param order Properties of the order to create and submit.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order) throws Exception
	{
		return createOrder( order,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.createOrder( order,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param order Properties of the order to create and submit.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderClient( order,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.performOrderAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action The action to perform for the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		return performOrderAction( action,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.performOrderAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @param action The action to perform for the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.performOrderActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.priceOrder( order,  refreshShipping);
	 * </code></pre></p>
	 * @param refreshShipping 
	 * @param order 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order priceOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, Boolean refreshShipping) throws Exception
	{
		return priceOrder( order,  refreshShipping,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.priceOrder( order,  refreshShipping,  couponCodeToApply,  responseFields);
	 * </code></pre></p>
	 * @param couponCodeToApply 
	 * @param refreshShipping 
	 * @param responseFields 
	 * @param order 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order priceOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, Boolean refreshShipping, String couponCodeToApply, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.priceOrderClient( order,  refreshShipping,  couponCodeToApply,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.processDigitalWallet( digitalWallet,  orderId,  digitalWalletType);
	 * </code></pre></p>
	 * @param digitalWalletType 
	 * @param orderId 
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType) throws Exception
	{
		return processDigitalWallet( digitalWallet,  orderId,  digitalWalletType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.processDigitalWallet( digitalWallet,  orderId,  digitalWalletType,  responseFields);
	 * </code></pre></p>
	 * @param digitalWalletType 
	 * @param orderId 
	 * @param responseFields 
	 * @param digitalWallet 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order processDigitalWallet(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String orderId, String digitalWalletType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.processDigitalWalletClient( digitalWallet,  orderId,  digitalWalletType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrderDiscount( discount,  orderId,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param discount Properties of the order discount to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId) throws Exception
	{
		return updateOrderDiscount( discount,  orderId,  discountId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrderDiscount( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param responseFields 
	 * @param updateMode Specifies whether to modify the discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @param discount Properties of the order discount to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderDiscountClient( discount,  orderId,  discountId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.deleteOrderDraft( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId) throws Exception
	{
		deleteOrderDraft( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.deleteOrderDraft( orderId,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param version If applicable, the version of the order draft to delete.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.deleteOrderDraftClient( orderId,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.resendOrderConfirmationEmail( action,  orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param action 
	 * @return 
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public void resendOrderConfirmationEmail(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.resendOrderConfirmationEmailClient( action,  orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderPriceList( priceListCode,  orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderPriceList(String priceListCode, String orderId) throws Exception
	{
		return changeOrderPriceList( priceListCode,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderPriceList( priceListCode,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param version 
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see string
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderPriceList(String priceListCode, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderPriceListClient( priceListCode,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderUserId( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId) throws Exception
	{
		return changeOrderUserId( orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.changeOrderUserId( orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderUserIdClient( orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrder( order,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param order The properties of the order to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrder( order,  orderId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.updateOrder( order,  orderId,  updateMode,  version,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param responseFields 
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @param order The properties of the order to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderClient( order,  orderId,  updateMode,  version,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



