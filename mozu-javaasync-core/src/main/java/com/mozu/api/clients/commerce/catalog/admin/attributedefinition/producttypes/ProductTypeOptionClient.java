/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Options subresource to define how an option attribute is used for a specific product type. Product attribute definitions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeOptionClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetOptionsClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> getOptionsClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.getOptionsUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetOptionClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getOptionClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		return getOptionClient(dataViewMode,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetOptionClient(dataViewMode,  productTypeId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getOptionClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.getOptionUrl(attributeFQN, productTypeId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddOptionClient(dataViewMode,  attributeInProductType,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		return addOptionClient(dataViewMode,  attributeInProductType,  productTypeId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddOptionClient(dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.addOptionUrl(productTypeId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateOptionClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		return updateOptionClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateOptionClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.updateOptionUrl(attributeFQN, productTypeId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOptionClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOptionClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.deleteOptionUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



