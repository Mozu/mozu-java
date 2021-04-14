/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.shipping.admin.carriers;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CarrierCredentialUrl
{

	/**
	 * Get Resource Url for GetCarrierCredentials
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCarrierCredentialsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/credentials/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCarrierCredential
	 * @param carrierId 
	 * @param locationCode 
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @param siteId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCarrierCredentialUrl(String carrierId, String locationCode, String locationGroupCode, String responseFields, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/credentials/{carrierId}?siteId={siteId}&locationGroupCode={locationGroupCode}&locationCode={locationCode}&responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("locationCode", locationCode);
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("siteId", siteId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateCarrierCredential
	 * @param carrierId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createCarrierCredentialUrl(String carrierId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/credentials/{carrierId}?responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCarrierCredential
	 * @param carrierId 
	 * @param locationCode 
	 * @param locationGroupCode 
	 * @param responseFields 
	 * @param siteId 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCarrierCredentialUrl(String carrierId, String locationCode, String locationGroupCode, String responseFields, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/credentials/{carrierId}?siteId={siteId}&locationGroupCode={locationGroupCode}&locationCode={locationCode}&responseFields={responseFields}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("locationCode", locationCode);
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("siteId", siteId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCarrierCredential
	 * @param carrierId 
	 * @param locationCode 
	 * @param locationGroupCode 
	 * @param siteId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCarrierCredentialUrl(String carrierId, String locationCode, String locationGroupCode, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/carriers/credentials/{carrierId}?siteId={siteId}&locationGroupCode={locationGroupCode}&locationCode={locationCode}");
		formatter.formatUrl("carrierId", carrierId);
		formatter.formatUrl("locationCode", locationCode);
		formatter.formatUrl("locationGroupCode", locationGroupCode);
		formatter.formatUrl("siteId", siteId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

