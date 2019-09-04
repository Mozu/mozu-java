/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.appdev;

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
 * 
 * </summary>
 */
public class AppPackageClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> mozuClient=GetAllPackagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageSummaryCollection packageSummaryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageSummaryCollection>
	 * @see com.mozu.api.contracts.appdev.PackageSummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> getAllPackagesClient() throws Exception
	{
		return getAllPackagesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> mozuClient=GetAllPackagesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageSummaryCollection packageSummaryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageSummaryCollection>
	 * @see com.mozu.api.contracts.appdev.PackageSummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> getAllPackagesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.getAllPackagesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageSummaryCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.PackageSummaryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=GetPackageClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> getPackageClient(String applicationKey) throws Exception
	{
		return getPackageClient( applicationKey,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=GetPackageClient( applicationKey,  includeChildren,  skipDevAccountCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param includeChildren 
	 * @param responseFields 
	 * @param skipDevAccountCheck 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> getPackageClient(String applicationKey, Boolean includeChildren, Boolean skipDevAccountCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.getPackageUrl(applicationKey, includeChildren, responseFields, skipDevAccountCheck);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient=GetPackagesClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageCollection packageCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageCollection>
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageCollection> getPackagesClient(String applicationKey) throws Exception
	{
		return getPackagesClient( applicationKey,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient=GetPackagesClient( applicationKey,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageCollection packageCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageCollection>
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageCollection> getPackagesClient(String applicationKey, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.getPackagesUrl(applicationKey, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.PackageCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.appdev.ApplicationSummary>> mozuClient=GetApplicationSummaryChildrenClient( appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationSummary applicationSummary = client.Result();
	 * </code></pre></p>
	 * @param appId 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.appdev.ApplicationSummary>>
	 * @see com.mozu.api.contracts.appdev.ApplicationSummary
	 */
	public static MozuClient<List<com.mozu.api.contracts.appdev.ApplicationSummary>> getApplicationSummaryChildrenClient(String appId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.getApplicationSummaryChildrenUrl(appId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.appdev.ApplicationSummary>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.appdev.ApplicationSummary>> mozuClient = (MozuClient<List<com.mozu.api.contracts.appdev.ApplicationSummary>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> mozuClient=GetApplicationSummaryParentsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationSummaryCollection applicationSummaryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationSummaryCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> getApplicationSummaryParentsClient() throws Exception
	{
		return getApplicationSummaryParentsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> mozuClient=GetApplicationSummaryParentsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationSummaryCollection applicationSummaryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationSummaryCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationSummaryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> getApplicationSummaryParentsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.getApplicationSummaryParentsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationSummaryCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.ApplicationSummaryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=ClonePackageClient( applicationKey,  packageName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param packageName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> clonePackageClient(String applicationKey, String packageName) throws Exception
	{
		return clonePackageClient( applicationKey,  packageName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=ClonePackageClient( applicationKey,  packageName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param packageName 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> clonePackageClient(String applicationKey, String packageName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.clonePackageUrl(applicationKey, packageName, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=CreateNewCorePackageClient( packageRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageRequest 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.PackageRequest
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> createNewCorePackageClient(com.mozu.api.contracts.appdev.PackageRequest packageRequest) throws Exception
	{
		return createNewCorePackageClient( packageRequest,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=CreateNewCorePackageClient( packageRequest,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param packageRequest 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.PackageRequest
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> createNewCorePackageClient(com.mozu.api.contracts.appdev.PackageRequest packageRequest, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.createNewCorePackageUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(packageRequest);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=CreatePackageClient( pkg);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param package 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> createPackageClient(com.mozu.api.contracts.appdev.Package pkg) throws Exception
	{
		return createPackageClient( pkg,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=CreatePackageClient( pkg,  projectId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param projectId 
	 * @param responseFields 
	 * @param package 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> createPackageClient(com.mozu.api.contracts.appdev.Package pkg, Integer projectId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.createPackageUrl(projectId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=UpdatePackageClient( pkg,  applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param package 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> updatePackageClient(com.mozu.api.contracts.appdev.Package pkg, String applicationKey) throws Exception
	{
		return updatePackageClient( pkg,  applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=UpdatePackageClient( pkg,  applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @param package 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> updatePackageClient(com.mozu.api.contracts.appdev.Package pkg, String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.updatePackageUrl(applicationKey, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.Package>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeletePackageClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deletePackageClient(String applicationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.appdev.AppPackageUrl.deletePackageUrl(applicationKey);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



