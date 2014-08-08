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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class DigitalPackageClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableDigitalPackageFulfillmentActionsClient( orderId,  digitalPackageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableDigitalPackageFulfillmentActionsClient(String orderId, String digitalPackageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.DigitalPackageUrl.getAvailableDigitalPackageFulfillmentActionsUrl(digitalPackageId, orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=GetDigitalPackageClient( orderId,  digitalPackageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> getDigitalPackageClient(String orderId, String digitalPackageId) throws Exception
	{
		return getDigitalPackageClient( orderId,  digitalPackageId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=GetDigitalPackageClient( orderId,  digitalPackageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> getDigitalPackageClient(String orderId, String digitalPackageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.DigitalPackageUrl.getDigitalPackageUrl(digitalPackageId, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=CreateDigitalPackageClient( digitalPackage,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param digitalPackage 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> createDigitalPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId) throws Exception
	{
		return createDigitalPackageClient( digitalPackage,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=CreateDigitalPackageClient( digitalPackage,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param responseFields 
	 * @param digitalPackage 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> createDigitalPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.DigitalPackageUrl.createDigitalPackageUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(digitalPackage);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=UpdateDigitalPackageClient( digitalPackage,  orderId,  digitalPackageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @param digitalPackage 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> updateDigitalPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId) throws Exception
	{
		return updateDigitalPackageClient( digitalPackage,  orderId,  digitalPackageId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient=UpdateDigitalPackageClient( digitalPackage,  orderId,  digitalPackageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DigitalPackage digitalPackage = client.Result();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @param responseFields 
	 * @param digitalPackage 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> updateDigitalPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage digitalPackage, String orderId, String digitalPackageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.DigitalPackageUrl.updateDigitalPackageUrl(digitalPackageId, orderId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(digitalPackage);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDigitalPackageClient( orderId,  digitalPackageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param digitalPackageId 
	 * @param orderId 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDigitalPackageClient(String orderId, String digitalPackageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.DigitalPackageUrl.deleteDigitalPackageUrl(digitalPackageId, orderId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


