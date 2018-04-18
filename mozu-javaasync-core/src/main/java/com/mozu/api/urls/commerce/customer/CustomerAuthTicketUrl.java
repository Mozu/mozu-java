/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CustomerAuthTicketUrl
{

	/**
	 * Get Resource Url for CreateAnonymousShopperAuthTicket
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createAnonymousShopperAuthTicketUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/anonymousshopper?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateUserAuthTicket
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createUserAuthTicketUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RefreshUserAuthTicket
	 * @param refreshToken The refresh token string required to refresh a user's authentication ticket.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshUserAuthTicketUrl(String refreshToken, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/refresh?refreshToken={refreshToken}&responseFields={responseFields}");
		formatter.formatUrl("refreshToken", refreshToken);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

