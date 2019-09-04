/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

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
 * 
 * </summary>
 */
public class ApplicationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ApplicationResource() 
		{
			_apiContext = null;
	}
public ApplicationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	PackageNamesCollection packageNamesCollection = application.getAppPackageNames( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return com.mozu.api.contracts.appdev.PackageNamesCollection
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public com.mozu.api.contracts.appdev.PackageNamesCollection getAppPackageNames(String applicationKey) throws Exception
	{
		return getAppPackageNames( applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	PackageNamesCollection packageNamesCollection = application.getAppPackageNames( applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.appdev.PackageNamesCollection
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public com.mozu.api.contracts.appdev.PackageNamesCollection getAppPackageNames(String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> client = com.mozu.api.clients.platform.ApplicationClient.getAppPackageNamesClient( applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	ApplicationVersionsCollection applicationVersionsCollection = application.getAppVersions( nsAndAppId);
	 * </code></pre></p>
	 * @param nsAndAppId 
	 * @return com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationVersionsCollection getAppVersions(String nsAndAppId) throws Exception
	{
		return getAppVersions( nsAndAppId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	ApplicationVersionsCollection applicationVersionsCollection = application.getAppVersions( nsAndAppId,  responseFields);
	 * </code></pre></p>
	 * @param nsAndAppId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public com.mozu.api.contracts.appdev.ApplicationVersionsCollection getAppVersions(String nsAndAppId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> client = com.mozu.api.clients.platform.ApplicationClient.getAppVersionsClient( nsAndAppId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.getPackageFileMetadata( applicationKey,  filepath);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata getPackageFileMetadata(String applicationKey, String filepath) throws Exception
	{
		return getPackageFileMetadata( applicationKey,  filepath,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.getPackageFileMetadata( applicationKey,  filepath,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata getPackageFileMetadata(String applicationKey, String filepath, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.getPackageFileMetadataClient( applicationKey,  filepath,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FolderMetadata folderMetadata = application.getPackageMetadata( applicationKey);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @return com.mozu.api.contracts.appdev.FolderMetadata
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public com.mozu.api.contracts.appdev.FolderMetadata getPackageMetadata(String applicationKey) throws Exception
	{
		return getPackageMetadata( applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FolderMetadata folderMetadata = application.getPackageMetadata( applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.appdev.FolderMetadata
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public com.mozu.api.contracts.appdev.FolderMetadata getPackageMetadata(String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> client = com.mozu.api.clients.platform.ApplicationClient.getPackageMetadataClient( applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.upsertPackageFile( applicationKey,  filepath);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata upsertPackageFile(String applicationKey, String filepath) throws Exception
	{
		return upsertPackageFile( applicationKey,  filepath,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.upsertPackageFile( applicationKey,  filepath,  lastModifiedTime,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @param lastModifiedTime 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public com.mozu.api.contracts.appdev.FileMetadata upsertPackageFile(String applicationKey, String filepath, String lastModifiedTime, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.upsertPackageFileClient( applicationKey,  filepath,  lastModifiedTime,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.renamePackageFile( renameInfo,  applicationKey);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param renameInfo 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public com.mozu.api.contracts.appdev.FileMetadata renamePackageFile(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey) throws Exception
	{
		return renamePackageFile( renameInfo,  applicationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	FileMetadata fileMetadata = application.renamePackageFile( renameInfo,  applicationKey,  responseFields);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param responseFields 
	 * @param renameInfo 
	 * @return com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public com.mozu.api.contracts.appdev.FileMetadata renamePackageFile(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> client = com.mozu.api.clients.platform.ApplicationClient.renamePackageFileClient( renameInfo,  applicationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Stream stream = application.deletePackageFile( applicationKey,  filepath);
	 * </code></pre></p>
	 * @param applicationKey 
	 * @param filepath 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deletePackageFile(String applicationKey, String filepath) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.ApplicationClient.deletePackageFileClient( applicationKey,  filepath);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



