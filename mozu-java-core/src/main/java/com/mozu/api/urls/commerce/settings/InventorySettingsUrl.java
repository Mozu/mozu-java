/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class InventorySettingsUrl
{

	/**
	 * Get Resource Url for GetInventorySettings
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getInventorySettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/inventory/inventorySettings?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatetInventorySettings
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createtInventorySettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/inventory/inventorySettings?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatetInventorySettings
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updatetInventorySettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/inventory/inventorySettings?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
