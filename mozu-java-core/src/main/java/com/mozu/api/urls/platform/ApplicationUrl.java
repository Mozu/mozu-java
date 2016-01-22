/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ApplicationUrl
{

	/**
	 * Get Resource Url for GetAppPackageNames
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAppPackageNamesUrl(String applicationKey, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationKey}/packagenames?responseFields={responseFields}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetAppVersions
	 * @param nsAndAppId The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAppVersionsUrl(String nsAndAppId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/versions/{nsAndAppId}?responseFields={responseFields}");
		formatter.formatUrl("nsAndAppId", nsAndAppId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackageFileMetadata
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageFileMetadataUrl(String applicationKey, String filepath, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/packages/{applicationKey}/filemetadata/{*filepath}?responseFields={responseFields}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("filepath", filepath);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackageMetadata
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageMetadataUrl(String applicationKey, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/packages/{applicationKey}/metadata?responseFields={responseFields}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for UpsertPackageFile
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param lastModifiedTime The date and time of the last file insert or update. This parameter is optional.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl upsertPackageFileUrl(String applicationKey, String filepath, String lastModifiedTime, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/packages/{applicationKey}/files/{*filepath}?lastModifiedTime={lastModifiedTime}&responseFields={responseFields}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("filepath", filepath);
		formatter.formatUrl("lastModifiedTime", lastModifiedTime);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for RenamePackageFile
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return   String Resource Url
	 */
	public static MozuUrl renamePackageFileUrl(String applicationKey, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/packages/{applicationKey}/files_rename?responseFields={responseFields}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeletePackageFile
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePackageFileUrl(String applicationKey, String filepath)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/packages/{applicationKey}/files/{*filepath}");
		formatter.formatUrl("applicationKey", applicationKey);
		formatter.formatUrl("filepath", filepath);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

