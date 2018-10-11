/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class TenantDataUrl
{

	/**
	 * Get Resource Url for GetDBValue
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDBValueUrl(String dbEntryQuery, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{dbEntryQuery}?responseFields={responseFields}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDBValue
	 * @param dbEntryQuery The database entry string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDBValue
	 * @param dbEntryQuery The database entry string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDBValue
	 * @param dbEntryQuery The database entry string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

