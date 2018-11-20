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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Packages subresource to manage the physical packages to ship for an order.
 * </summary>
 */
public class PackageClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePackageFulfillmentActionsClient( orderId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package fulfillment.
	 * @param packageId Unique identifier of the package associated with the fulfillment actions to retrieve.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePackageFulfillmentActionsClient(String orderId, String packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getAvailablePackageFulfillmentActionsUrl(orderId, packageId);
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
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageLabelClient( orderId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package label to retrieve.
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageLabelClient(String orderId, String packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getPackageLabelUrl(orderId, packageId);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( orderId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String orderId, String packageId) throws Exception
	{
		return getPackageClient( orderId,  packageId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( orderId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String orderId, String packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getPackageUrl(orderId, packageId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param package Properties of the physical package of order items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId) throws Exception
	{
		return createPackageClient( pkg,  orderId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param responseFields 
	 * @param package Properties of the physical package of order items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.createPackageUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  orderId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId) throws Exception
	{
		return updatePackageClient( pkg,  orderId,  packageId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  orderId,  packageId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param responseFields 
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.updatePackageUrl(orderId, packageId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageClient( orderId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to delete.
	 * @param packageId Unique identifier of the package to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageClient(String orderId, String packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.deletePackageUrl(orderId, packageId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



