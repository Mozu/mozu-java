/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.shipping.admin.profiles;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ShippingInclusionRuleUrl
{

	/**
	 * Get Resource Url for GetShippingInclusionRule
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getShippingInclusionRuleUrl(String id, String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetShippingInclusionRules
	 * @param profilecode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getShippingInclusionRulesUrl(String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions?responseFields={responseFields}");
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateShippingInclusionRule
	 * @param profilecode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl createShippingInclusionRuleUrl(String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions?responseFields={responseFields}");
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateShippingInclusionRule
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateShippingInclusionRuleUrl(String id, String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteShippingInclusionRule
	 * @param id 
	 * @param profilecode 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteShippingInclusionRuleUrl(String id, String profilecode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

