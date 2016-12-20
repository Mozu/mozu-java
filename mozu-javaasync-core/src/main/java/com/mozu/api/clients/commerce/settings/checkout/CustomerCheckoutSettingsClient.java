/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.checkout;

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
 * Use the Customer Checkout Settings resource to define login settings that apply when shoppers proceed to checkout.
 * </summary>
 */
public class CustomerCheckoutSettingsClient {
	
	/**
	 * Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials, supported credit cards, and more; Customer Checkout settings, such as whether login is required, and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=GetCustomerCheckoutSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> getCustomerCheckoutSettingsClient() throws Exception
	{
		return getCustomerCheckoutSettingsClient( null);
	}

	/**
	 * Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials, supported credit cards, and more; Customer Checkout settings, such as whether login is required, and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=GetCustomerCheckoutSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> getCustomerCheckoutSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.CustomerCheckoutSettingsUrl.getCustomerCheckoutSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Modifies existing site checkout settings. Modify Payment, Customer Checkout, and Order Processing settings in one PUT.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=UpdateCustomerCheckoutSettingsClient( customerCheckoutSettings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> updateCustomerCheckoutSettingsClient(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings) throws Exception
	{
		return updateCustomerCheckoutSettingsClient( customerCheckoutSettings,  null);
	}

	/**
	 * Modifies existing site checkout settings. Modify Payment, Customer Checkout, and Order Processing settings in one PUT.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient=UpdateCustomerCheckoutSettingsClient( customerCheckoutSettings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerCheckoutSettings customerCheckoutSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> updateCustomerCheckoutSettingsClient(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.checkout.CustomerCheckoutSettingsUrl.updateCustomerCheckoutSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerCheckoutSettings);
		return mozuClient;

	}

}



