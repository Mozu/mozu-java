/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class LocationGroupUrl
{

	/**
	 * Get Resource Url for GetLocationGroups
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationGroupsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationGroups/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationGroup
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationGroupUrl(String locationGroupCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationGroups/{locationGroupCode}?responseFields={responseFields}");
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddLocationGroup
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addLocationGroupUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationGroups/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocationGroup
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocationGroupUrl(String locationGroupCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationGroups/{locationGroupCode}?responseFields={responseFields}");
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteLocationGroup
	 * @param locationGroupCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteLocationGroupUrl(String locationGroupCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/admin/locationGroups/{locationGroupCode}");
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

