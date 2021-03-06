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

public class TenantUrl
{

	/**
	 * Get Resource Url for GetTenant
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTenantUrl(String responseFields, Integer tenantId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenants/{tenantId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("tenantId", tenantId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

