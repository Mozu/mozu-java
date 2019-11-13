/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Properties of localized content for attributes, based on a `localeCode` at a site/tenant level. This content supports translated text for product, product options, and additional objects. 
 * </summary>
 */
public class AttributeLocalizedContentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient=GetAttributeLocalizedContentsClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> getAttributeLocalizedContentsClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.getAttributeLocalizedContentsUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=GetAttributeLocalizedContentClient( attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContentClient(String attributeFQN, String localeCode) throws Exception
	{
		return getAttributeLocalizedContentClient( attributeFQN,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=GetAttributeLocalizedContentClient( attributeFQN,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContentClient(String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.getAttributeLocalizedContentUrl(attributeFQN, localeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=AddLocalizedContentClient( localizedContent,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> addLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN) throws Exception
	{
		return addLocalizedContentClient( localizedContent,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=AddLocalizedContentClient( localizedContent,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> addLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.addLocalizedContentUrl(attributeFQN, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient=UpdateLocalizedContentsClient( localizedContent,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> updateLocalizedContentsClient(List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> localizedContent, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.updateLocalizedContentsUrl(attributeFQN);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=UpdateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode) throws Exception
	{
		return updateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient=UpdateLocalizedContentClient( localizedContent,  attributeFQN,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeLocalizedContent attributeLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized name and description of the attribute, displayed in the locale defined for the master catalog.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.updateLocalizedContentUrl(attributeFQN, localeCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteLocalizedContentClient( attributeFQN,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteLocalizedContentClient(String attributeFQN, String localeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentUrl.deleteLocalizedContentUrl(attributeFQN, localeCode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



