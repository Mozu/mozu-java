/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.developer;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Applications resource to manage the applications associated with a developer account.
 * </summary>
 */
public class ApplicationVersionClient {
	
	/**
	 * Retrieves the list of applications associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> mozuClient=GetAllApplicationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationCollection applicationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> getAllApplicationsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getAllApplicationsUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the application specified in the request. The application specified in the request must be associated with the developer account scoped to the user claim specified in the request header, otherwise the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient=GetApplicationClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Application>
	 * @see com.mozu.api.contracts.appdev.Application
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Application> getApplicationClient() throws Exception
	{
		return getApplicationClient( null);
	}

	/**
	 * Retrieves the details of the application specified in the request. The application specified in the request must be associated with the developer account scoped to the user claim specified in the request header, otherwise the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient=GetApplicationClient( applicationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param applicationId Unique identifier of the application.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Application>
	 * @see com.mozu.api.contracts.appdev.Application
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Application> getApplicationClient(Integer applicationId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getApplicationUrl(applicationId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.Application.class;
		MozuClient<com.mozu.api.contracts.appdev.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a specific version of an application associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationVersion> mozuClient=GetApplicationVersionClient( applicationVersionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationVersion applicationVersion = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationVersion>
	 * @see com.mozu.api.contracts.appdev.ApplicationVersion
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationVersion> getApplicationVersionClient(Integer applicationVersionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getApplicationVersionUrl(applicationVersionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationVersion.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationVersion> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the package definitions created for an application version, including all development packages and release packages. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient=GetPackagesClient( applicationVersionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageCollection packageCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageCollection>
	 * @see com.mozu.api.contracts.appdev.PackageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageCollection> getPackagesClient(Integer applicationVersionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getPackagesUrl(applicationVersionId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a package definition associated with an application version. The application ust be associated with the developer account scoped to the user claim specified in the request. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=GetPackageClient( applicationVersionId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version associated with the package. Application version IDs are unique across all applications associated with the developer account.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> getPackageClient(Integer applicationVersionId, Integer packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getPackageUrl(applicationVersionId, packageId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the metadata for items in a package associated with an application version, including a list of all files and subfolders. The application must be associated with the developer account acoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageItemsMetadataClient( applicationVersionId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageItemsMetadataClient(Integer applicationVersionId, Integer packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getPackageItemsMetadataUrl(applicationVersionId, packageId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FolderMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the metadata of a file in a package for an application version. The application must be associated with the developer account scoped to the user claim specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageItemMetadataClient( applicationVersionId,  packageId,  itempath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @param itempath Complete file directory location and name of the item in the package to retrieve metadata.
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageItemMetadataClient(Integer applicationVersionId, Integer packageId, String itempath) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getPackageItemMetadataUrl(applicationVersionId, itempath, packageId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageFilesZipClient( applicationVersionId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId 
	 * @param packageId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageFilesZipClient(Integer applicationVersionId, Integer packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.getPackageFilesZipUrl(applicationVersionId, packageId);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new development or release package for the application version specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient=AddPackageClient( pkg,  applicationVersionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with the developer account.
	 * @param package Properties of the development or release package to define.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.Package>
	 * @see com.mozu.api.contracts.appdev.Package
	 * @see com.mozu.api.contracts.appdev.Package
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.Package> addPackageClient(com.mozu.api.contracts.appdev.Package pkg, Integer applicationVersionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.addPackageUrl(applicationVersionId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.Package.class;
		MozuClient<com.mozu.api.contracts.appdev.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=ChangePackageFileNameOrPathClient( renameInfo,  applicationVersionId,  packageId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId 
	 * @param packageId 
	 * @param renameInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> changePackageFileNameOrPathClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, Integer applicationVersionId, Integer packageId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.changePackageFileNameOrPathUrl(applicationVersionId, packageId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(renameInfo);
		return mozuClient;

	}

	/**
	 * Uploads a file to a defined package for an application version in the file location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=AddPackageFileClient( stream,  applicationVersionId,  packageId,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @param filepath The file location to which to add the package file.
	 * @param packageId Unique identifier of the package.
	 * @param stream The contents of the package file to upload, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> addPackageFileClient(java.io.InputStream stream, Integer applicationVersionId, Integer packageId, String filepath, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.addPackageFileUrl(applicationVersionId, filepath, packageId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a file in a package associated with an application version.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpdatePackageFileClient( stream,  applicationVersionId,  packageId,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version. Application version IDs are unique across all applications associated with a developer account.
	 * @param filepath The location path and name that identifies the package file to update.
	 * @param packageId The unique identifier of the package.
	 * @param stream The contents of the package file to update, which requires a content-type value of "application/octet-stream" in the request header.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> updatePackageFileClient(java.io.InputStream stream, Integer applicationVersionId, Integer packageId, String filepath, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.updatePackageFileUrl(applicationVersionId, filepath, packageId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * Deletes the specified file from a package associated with an application version.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageFileClient( applicationVersionId,  packageId,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param applicationVersionId Unique identifier of the application version.
	 * @param filepath The file path and name of the file location to delete from the package.
	 * @param packageId Unique identifier of the package.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageFileClient(Integer applicationVersionId, Integer packageId, String filepath) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.developer.ApplicationVersionUrl.deletePackageFileUrl(applicationVersionId, filepath, packageId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



