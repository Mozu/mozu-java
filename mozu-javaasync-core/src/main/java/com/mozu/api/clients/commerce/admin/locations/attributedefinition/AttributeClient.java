/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.admin.locations.attributedefinition;

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

/** <summary>
 * 
 * </summary>
 */
public class AttributeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.locations.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> mozuClient=GetAttributeVocabularyValuesClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> getAttributeVocabularyValuesClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.locations.attributedefinition.AttributeUrl.getAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> mozuClient = (MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeClient(String attributeFQN) throws Exception
	{
		return getAttributeClient( attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeClient( attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeClient(String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.locations.attributedefinition.AttributeUrl.getAttributeUrl(attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=CreateAttributeClient( attribute);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attribute 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> createAttributeClient(com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		return createAttributeClient( attribute,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=CreateAttributeClient( attribute,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param attribute 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> createAttributeClient(com.mozu.api.contracts.core.extensible.Attribute attribute, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.locations.attributedefinition.AttributeUrl.createAttributeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param attribute 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> updateAttributeClient(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttributeClient( attribute,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param attribute 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> updateAttributeClient(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.locations.attributedefinition.AttributeUrl.updateAttributeUrl(attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

}



