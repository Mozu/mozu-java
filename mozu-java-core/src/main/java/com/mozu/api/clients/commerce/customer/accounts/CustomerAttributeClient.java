/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=GetAccountAttributeClient( accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> getAccountAttributeClient(Integer accountId, String attributeFQN) throws Exception
	{
		return getAccountAttributeClient( accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=GetAccountAttributeClient( accountId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> getAccountAttributeClient(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.getAccountAttributeUrl(accountId, attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient=GetAccountAttributesClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttributeCollection customerAttributeCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttributeCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> getAccountAttributesClient(Integer accountId) throws Exception
	{
		return getAccountAttributesClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient=GetAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttributeCollection customerAttributeCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttributeCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> getAccountAttributesClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.getAccountAttributesUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttributeCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=AddAccountAttributeClient( attribute,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute The attribute to add to the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> addAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addAccountAttributeClient( attribute,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=AddAccountAttributeClient( attribute,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param attribute The attribute to add to the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> addAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.addAccountAttributeUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=UpdateAccountAttributeClient( attribute,  accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param attribute Properties of the customer account attribute to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> updateAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=UpdateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param attribute Properties of the customer account attribute to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> updateAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.updateAccountAttributeUrl(accountId, attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountAttributeClient( accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountAttributeClient(Integer accountId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.deleteAccountAttributeUrl(accountId, attributeFQN);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



