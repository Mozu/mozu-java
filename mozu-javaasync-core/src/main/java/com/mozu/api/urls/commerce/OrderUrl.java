/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class OrderUrl
{

	/**
	 * Get Resource Url for GetOrders
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter an order's search results by any of its properties, including status, contact information, or total. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Status+eq+Submitted"
	 * @param includeBin 
	 * @param mode 
	 * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. Default value: 20. Max value: 200.
	 * @param q A list of order search terms to use in the query when searching across order number and the name or email of the billing contact. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields 
	 * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts 'asc' or 'asc' or descending order (z-a) which accepts 'desc' or 'desc'. The sortBy parameter follows an available property. For examp
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrdersUrl(String filter, Boolean includeBin, String mode, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&includeBin={includeBin}&mode={mode}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("includeBin", includeBin);
		formatter.formatUrl("mode", mode);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableActions
	 * @param orderId Unique identifier of the available order actions to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableActionsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/actions");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetTaxableOrders
	 * @param orderId Unique identifier of the order to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTaxableOrdersUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/taxableorders");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetOrder
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param includeBin 
	 * @param mode 
	 * @param orderId Unique identifier of the order details to get.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderUrl(Boolean draft, Boolean includeBin, String mode, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}?draft={draft}&includeBin={includeBin}&mode={mode}&responseFields={responseFields}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("includeBin", includeBin);
		formatter.formatUrl("mode", mode);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrderFromCart
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderFromCartUrl(String cartId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/?cartId={cartId}&responseFields={responseFields}");
		formatter.formatUrl("cartId", cartId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrder
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformOrderAction
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl performOrderActionUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/actions?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PriceOrder
	 * @param refreshShipping 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl priceOrderUrl(Boolean refreshShipping, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/price?refreshShipping={refreshShipping}&responseFields={responseFields}");
		formatter.formatUrl("refreshShipping", refreshShipping);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ProcessDigitalWallet
	 * @param digitalWalletType 
	 * @param orderId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl processDigitalWalletUrl(String digitalWalletType, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/digitalWallet/{digitalWalletType}?responseFields={responseFields}");
		formatter.formatUrl("digitalWalletType", digitalWalletType);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderDiscount
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param responseFields 
	 * @param updateMode Specifies whether to modify the discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderDiscountUrl(Integer discountId, String orderId, String responseFields, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/discounts/{discountId}?updatemode={updateMode}&version={version}&responseFields={responseFields}");
		formatter.formatUrl("discountId", discountId);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteOrderDraft
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param version If applicable, the version of the order draft to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteOrderDraftUrl(String orderId, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/draft?version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResendOrderConfirmationEmail
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl resendOrderConfirmationEmailUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/email/resend");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ChangeOrderPriceList
	 * @param orderId 
	 * @param responseFields 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl changeOrderPriceListUrl(String orderId, String responseFields, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/priceList?updatemode={updateMode}&version={version}&responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ChangeOrderUserId
	 * @param orderId Unique identifier of the order.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl changeOrderUserIdUrl(String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/users?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrder
	 * @param orderId Unique identifier of the order to update.
	 * @param responseFields 
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderUrl(String orderId, String responseFields, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}?updatemode={updateMode}&version={version}&responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

