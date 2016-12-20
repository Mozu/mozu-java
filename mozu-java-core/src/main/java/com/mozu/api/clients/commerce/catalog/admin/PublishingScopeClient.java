/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * Use the Product Publishing resource to publish or discard pending changes to product definitions in the master catalog.
 * </summary>
 */
public class PublishingScopeClient {
	
	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient=GetPublishSetClient( publishSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSet publishSet = client.Result();
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSet>
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSet> getPublishSetClient(String publishSetCode) throws Exception
	{
		return getPublishSetClient( publishSetCode,  null);
	}

	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient=GetPublishSetClient( publishSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSet publishSet = client.Result();
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSet>
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSet> getPublishSetClient(String publishSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.getPublishSetUrl(publishSetCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PublishSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PublishSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> mozuClient=GetPublishSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetCollection publishSetCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSetCollection>
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> getPublishSetsClient() throws Exception
	{
		return getPublishSetsClient( null);
	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> mozuClient=GetPublishSetsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetCollection publishSetCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSetCollection>
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> getPublishSetsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.getPublishSetsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PublishSetCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the draft version of product changes for each product code specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DiscardDraftsClient(dataViewMode,  publishScope);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public static MozuClient discardDraftsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.discardDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Publishes the draft version of product changes for each product code specified in the request, and changes the product publish state to "live".
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDraftsClient(dataViewMode,  publishScope);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public static MozuClient publishDraftsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.publishDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient=AssignProductsToPublishSetClient( publishSet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSet publishSet = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSet>
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSet> assignProductsToPublishSetClient(com.mozu.api.contracts.productadmin.PublishSet publishSet) throws Exception
	{
		return assignProductsToPublishSetClient( publishSet,  null);
	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient=AssignProductsToPublishSetClient( publishSet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSet publishSet = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PublishSet>
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PublishSet> assignProductsToPublishSetClient(com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.assignProductsToPublishSetUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.PublishSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PublishSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishSet);
		return mozuClient;

	}

	/**
	 * Removes all details about a PublishSet from the product service. If the discardDrafts param is true, it also deletes the product drafts.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePublishSetClient( publishSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePublishSetClient(String publishSetCode) throws Exception
	{
		return deletePublishSetClient( publishSetCode,  null);
	}

	/**
	 * Removes all details about a PublishSet from the product service. If the discardDrafts param is true, it also deletes the product drafts.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePublishSetClient( publishSetCode,  discardDrafts);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discardDrafts Specifies whether to discard all the drafts assigned to the publish set when the publish set is deleted.
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePublishSetClient(String publishSetCode, Boolean discardDrafts) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.deletePublishSetUrl(discardDrafts, publishSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



