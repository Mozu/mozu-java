/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.shipping.admin.profiles;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * 
 * </summary>
 */
public class ProductHandlingFeeRulesClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=GetProductHandlingFeeRuleClient(dataViewMode,  profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> getProductHandlingFeeRuleClient(com.mozu.api.DataViewMode dataViewMode, String profilecode, String id) throws Exception
	{
		return getProductHandlingFeeRuleClient(dataViewMode,  profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=GetProductHandlingFeeRuleClient(dataViewMode,  profilecode,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> getProductHandlingFeeRuleClient(com.mozu.api.DataViewMode dataViewMode, String profilecode, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ProductHandlingFeeRulesUrl.getProductHandlingFeeRuleUrl(id, profilecode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> mozuClient=GetProductHandlingFeeRulesClient(dataViewMode,  profilecode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRuleCollection handlingFeeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> getProductHandlingFeeRulesClient(com.mozu.api.DataViewMode dataViewMode, String profilecode) throws Exception
	{
		return getProductHandlingFeeRulesClient(dataViewMode,  profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> mozuClient=GetProductHandlingFeeRulesClient(dataViewMode,  profilecode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRuleCollection handlingFeeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> getProductHandlingFeeRulesClient(com.mozu.api.DataViewMode dataViewMode, String profilecode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ProductHandlingFeeRulesUrl.getProductHandlingFeeRulesUrl(profilecode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=CreateProductHandlingFeeRuleClient( rule,  profilecode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> createProductHandlingFeeRuleClient(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode) throws Exception
	{
		return createProductHandlingFeeRuleClient( rule,  profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=CreateProductHandlingFeeRuleClient( rule,  profilecode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> createProductHandlingFeeRuleClient(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ProductHandlingFeeRulesUrl.createProductHandlingFeeRuleUrl(profilecode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rule);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=UpdateProductHandlingFeeRuleClient(dataViewMode,  rule,  profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> updateProductHandlingFeeRuleClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id) throws Exception
	{
		return updateProductHandlingFeeRuleClient(dataViewMode,  rule,  profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient=UpdateProductHandlingFeeRuleClient(dataViewMode,  rule,  profilecode,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * HandlingFeeRule handlingFeeRule = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> updateProductHandlingFeeRuleClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ProductHandlingFeeRulesUrl.updateProductHandlingFeeRuleUrl(id, profilecode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rule);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteProductHandlingFeeRuleClient(dataViewMode,  profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteProductHandlingFeeRuleClient(com.mozu.api.DataViewMode dataViewMode, String profilecode, String id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ProductHandlingFeeRulesUrl.deleteProductHandlingFeeRuleUrl(id, profilecode);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



