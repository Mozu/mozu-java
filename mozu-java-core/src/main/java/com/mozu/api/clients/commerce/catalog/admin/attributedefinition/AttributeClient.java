/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition;

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
 * Use the Attribute Definition resource to manage the properties, options, and extras that uniquely describe products of a specific type. Attributes can be associated with a product type, assigned values by a client or shopper, and added as faceted search filters for a product category. Options are product attributes that describe unique configurations made by the shopper, such as size or color, and generate a new product variation (or unique SKU). Properties are product attributes that describe aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand. Extras are product attributes that describe add-on configurations made by the shopper that do not represent a product variation, such as a monogram.
 * </summary>
 */
public class AttributeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN) throws Exception
	{
		return getAttributeClient( attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributeUrl(attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of the new product attribute to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		return addAttributeClient( attribute,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of the new product attribute to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.addAttributeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @param attribute Any properties of the attribute that to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttributeClient( attribute,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attribute Any properties of the attribute that to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.updateAttributeUrl(attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteAttributeClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.deleteAttributeUrl(attributeFQN);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



