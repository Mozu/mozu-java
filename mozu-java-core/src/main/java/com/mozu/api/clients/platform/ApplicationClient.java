/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
public class ApplicationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient=GetAppPackageNamesClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageNamesCollection packageNamesCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageNamesCollection>
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> getAppPackageNamesClient(String applicationKey) throws Exception
	{
		return getAppPackageNamesClient( applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient=GetAppPackageNamesClient( applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageNamesCollection packageNamesCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageNamesCollection>
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> getAppPackageNamesClient(String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getAppPackageNamesUrl(applicationKey, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageNamesCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient=GetAppVersionsClient( nsAndAppId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationVersionsCollection applicationVersionsCollection = client.Result();
	 * </code></pre></p>
	 * @param nsAndAppId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationVersionsCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> getAppVersionsClient(String nsAndAppId) throws Exception
	{
		return getAppVersionsClient( nsAndAppId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient=GetAppVersionsClient( nsAndAppId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationVersionsCollection applicationVersionsCollection = client.Result();
	 * </code></pre></p>
	 * @param nsAndAppId 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationVersionsCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> getAppVersionsClient(String nsAndAppId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getAppVersionsUrl(nsAndAppId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationVersionsCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageFileMetadataClient( applicationKey,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageFileMetadataClient(String applicationKey, String filepath) throws Exception
	{
		return getPackageFileMetadataClient( applicationKey,  filepath,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageFileMetadataClient( applicationKey,  filepath,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageFileMetadataClient(String applicationKey, String filepath, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getPackageFileMetadataUrl(applicationKey, filepath, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageMetadataClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageMetadataClient(String applicationKey) throws Exception
	{
		return getPackageMetadataClient( applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageMetadataClient( applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageMetadataClient(String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getPackageMetadataUrl(applicationKey, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FolderMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FolderMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpsertPackageFileClient( stream,  applicationKey,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @param stream 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> upsertPackageFileClient(java.io.InputStream stream, String applicationKey, String filepath, String  contentType) throws Exception
	{
		return upsertPackageFileClient( stream,  applicationKey,  filepath,  null,  null,  contentType);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpsertPackageFileClient( stream,  applicationKey,  filepath,  lastModifiedTime,  responseFields,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @param lastModifiedTime 
	 * @param responseFields 
	 * @param stream 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> upsertPackageFileClient(java.io.InputStream stream, String applicationKey, String filepath, String lastModifiedTime, String responseFields, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.upsertPackageFileUrl(applicationKey, filepath, lastModifiedTime, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=RenamePackageFileClient( renameInfo,  applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param renameInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> renamePackageFileClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey) throws Exception
	{
		return renamePackageFileClient( renameInfo,  applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=RenamePackageFileClient( renameInfo,  applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @param renameInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> renamePackageFileClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.renamePackageFileUrl(applicationKey, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(renameInfo);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageFileClient( applicationKey,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageFileClient(String applicationKey, String filepath) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.deletePackageFileUrl(applicationKey, filepath);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



