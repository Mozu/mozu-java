/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.applications;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AuthTicketUrl
{

	/**
	 * Get Resource Url for AuthenticateApp
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl authenticateAppUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/applications/authtickets/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for RefreshAppAuthTicket
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshAppAuthTicketUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/applications/authtickets/refresh-ticket?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAppAuthTicket
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAppAuthTicketUrl(String refreshToken)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/applications/authtickets/{refreshToken}");
		formatter.formatUrl("refreshToken", refreshToken);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

