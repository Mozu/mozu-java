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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this resource to track a shopper's order items and their intended destinations on sites that have the multiple shipment feature enabled. The Checkouts resource is active until the shopper submits the order, at which point one or many orders are created based on the data contained in the Checkouts resource.To learn more about this resource and the ability to ship items to multiple addresses, refer to the [Multiple Shipments API Overview](https://www.mozu.com/docs/Developer/api-guides/multi-ship.htm) topic.
 * </summary>
 */
public class CheckoutClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> mozuClient=GetCheckoutsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CheckoutCollection checkoutCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> getCheckoutsClient() throws Exception
	{
		return getCheckoutsClient( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> mozuClient=GetCheckoutsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CheckoutCollection checkoutCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> getCheckoutsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.getCheckoutsUrl(filter, pageSize, q, qLimit, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableActionsClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableActionsClient(String checkoutId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.getAvailableActionsUrl(checkoutId);
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
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> mozuClient=GetAvailableShippingMethodsClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CheckoutGroupRates checkoutGroupRates = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> getAvailableShippingMethodsClient(String checkoutId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.getAvailableShippingMethodsUrl(checkoutId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>> mozuClient = (MozuClient<List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupRates>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=GetCheckoutClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> getCheckoutClient(String checkoutId) throws Exception
	{
		return getCheckoutClient( checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=GetCheckoutClient( checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> getCheckoutClient(String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.getCheckoutUrl(checkoutId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=CreateCheckoutFromCartClient( cartId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> createCheckoutFromCartClient(String cartId) throws Exception
	{
		return createCheckoutFromCartClient( cartId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=CreateCheckoutFromCartClient( cartId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> createCheckoutFromCartClient(String cartId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.createCheckoutFromCartUrl(cartId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=PerformCheckoutActionClient( action,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param action The name of the action to perform.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> performCheckoutActionClient(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId) throws Exception
	{
		return performCheckoutActionClient( action,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=PerformCheckoutActionClient( action,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action The name of the action to perform.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> performCheckoutActionClient(com.mozu.api.contracts.commerceruntime.checkouts.CheckoutAction action, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.performCheckoutActionUrl(checkoutId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendCheckoutConfirmationEmailClient( checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient resendCheckoutConfirmationEmailClient(String checkoutId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.resendCheckoutConfirmationEmailUrl(checkoutId);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=SetShippingMethodsClient( groupShippingMethods,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param groupShippingMethods The shipping methods for the grouping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> setShippingMethodsClient(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId) throws Exception
	{
		return setShippingMethodsClient( groupShippingMethods,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=SetShippingMethodsClient( groupShippingMethods,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param groupShippingMethods The shipping methods for the grouping.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> setShippingMethodsClient(List<com.mozu.api.contracts.commerceruntime.checkouts.CheckoutGroupShippingMethod> groupShippingMethods, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.setShippingMethodsUrl(checkoutId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(groupShippingMethods);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=UpdateCheckoutClient( checkout,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param checkout The checkout object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> updateCheckoutClient(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId) throws Exception
	{
		return updateCheckoutClient( checkout,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=UpdateCheckoutClient( checkout,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param checkout The checkout object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> updateCheckoutClient(com.mozu.api.contracts.commerceruntime.checkouts.Checkout checkout, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.updateCheckoutUrl(checkoutId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(checkout);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ProcessDigitalWalletClient( digitalWallet,  checkoutId,  digitalWalletType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param digitalWalletType The type of digital wallet.
	 * @param digitalWallet The digital wallet object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> processDigitalWalletClient(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType) throws Exception
	{
		return processDigitalWalletClient( digitalWallet,  checkoutId,  digitalWalletType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ProcessDigitalWalletClient( digitalWallet,  checkoutId,  digitalWalletType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param digitalWalletType The type of digital wallet.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param digitalWallet The digital wallet object.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see com.mozu.api.contracts.commerceruntime.orders.DigitalWallet
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> processDigitalWalletClient(com.mozu.api.contracts.commerceruntime.orders.DigitalWallet digitalWallet, String checkoutId, String digitalWalletType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.processDigitalWalletUrl(checkoutId, digitalWalletType, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(digitalWallet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ChangeCheckoutPriceListClient( priceListCode,  checkoutId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param priceListCode The unique identifier of the price list that applies to the checkout, if applicable.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> changeCheckoutPriceListClient(String priceListCode, String checkoutId) throws Exception
	{
		return changeCheckoutPriceListClient( priceListCode,  checkoutId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient=ChangeCheckoutPriceListClient( priceListCode,  checkoutId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Checkout checkout = client.Result();
	 * </code></pre></p>
	 * @param checkoutId The unique identifier of the checkout.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceListCode The unique identifier of the price list that applies to the checkout, if applicable.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.checkouts.Checkout>
	 * @see com.mozu.api.contracts.commerceruntime.checkouts.Checkout
	 * @see string
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> changeCheckoutPriceListClient(String priceListCode, String checkoutId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.CheckoutUrl.changeCheckoutPriceListUrl(checkoutId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.checkouts.Checkout.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.checkouts.Checkout>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListCode);
		return mozuClient;

	}

}


