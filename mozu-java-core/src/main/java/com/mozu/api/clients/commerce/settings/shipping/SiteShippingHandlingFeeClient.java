/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.shipping;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Order Handling Fee subresource to configure any shipping and handling fees to apply to orders for this site.
 * </summary>
 */
public class SiteShippingHandlingFeeClient {
	
	/**
	 * Retrieves the details of the order handling fee configured for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=GetOrderHandlingFeeClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> getOrderHandlingFeeClient() throws Exception
	{
		return getOrderHandlingFeeClient( null);
	}

	/**
	 * Retrieves the details of the order handling fee configured for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=GetOrderHandlingFeeClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> getOrderHandlingFeeClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.shipping.SiteShippingHandlingFeeUrl.getOrderHandlingFeeUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee.class;
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new order handling fee for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=CreateOrderHandlingFeeClient( orderHandlingFee);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @param orderHandlingFee Properties of the order handling fee to assess for order shipment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> createOrderHandlingFeeClient(com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee) throws Exception
	{
		return createOrderHandlingFeeClient( orderHandlingFee,  null);
	}

	/**
	 * Creates a new order handling fee for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=CreateOrderHandlingFeeClient( orderHandlingFee,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderHandlingFee Properties of the order handling fee to assess for order shipment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> createOrderHandlingFeeClient(com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.shipping.SiteShippingHandlingFeeUrl.createOrderHandlingFeeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee.class;
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderHandlingFee);
		return mozuClient;

	}

	/**
	 * Updates the order handling fee amount for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=UpdateOrderHandlingFeeClient( orderHandlingFee);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @param orderHandlingFee The combined price for all items in the order, including all selected options but excluding any discounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> updateOrderHandlingFeeClient(com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee) throws Exception
	{
		return updateOrderHandlingFeeClient( orderHandlingFee,  null);
	}

	/**
	 * Updates the order handling fee amount for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient=UpdateOrderHandlingFeeClient( orderHandlingFee,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SiteShippingHandlingFee siteShippingHandlingFee = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderHandlingFee The combined price for all items in the order, including all selected options but excluding any discounts.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee>
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> updateOrderHandlingFeeClient(com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee orderHandlingFee, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.shipping.SiteShippingHandlingFeeUrl.updateOrderHandlingFeeUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee.class;
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingHandlingFee> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderHandlingFee);
		return mozuClient;

	}

}



