/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AttributeLocalizedContentUrl
{

	/**
	 * Get Resource Url for GetAttributeLocalizedContents
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeLocalizedContentsUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeLocalizedContentUrl(String attributeFQN, String localeCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl addLocalizedContentUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocalizedContents
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocalizedContentsUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocalizedContentUrl(String attributeFQN, String localeCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteLocalizedContentUrl(String attributeFQN, String localeCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

