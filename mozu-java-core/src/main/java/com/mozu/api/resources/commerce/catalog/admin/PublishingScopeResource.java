/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
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
 * Use the Product Publishing resource to publish or discard pending changes to products in a master catalog, or to add or remove pending changes to and from product publish sets.You can use product publish sets to group pending product changes together and publish them all at the same time.
 * </summary>
 */
public class PublishingScopeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public PublishingScopeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public PublishingScopeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.getPublishSet( publishSetCode);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet getPublishSet(String publishSetCode) throws Exception
	{
		return getPublishSet( publishSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.getPublishSet( publishSetCode,  responseFields);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet getPublishSet(String publishSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetClient( publishSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSetCollection publishSetCollection = publishingscope.getPublishSets();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets() throws Exception
	{
		return getPublishSets( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSetCollection publishSetCollection = publishingscope.getPublishSets( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	Stream stream = publishingscope.discardDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return Stream
	 * @see Stream
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public java.io.InputStream discardDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.discardDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	Stream stream = publishingscope.publishDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return Stream
	 * @see Stream
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public java.io.InputStream publishDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.publishDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishSet The details of the publish to which you want to assign products.
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(com.mozu.api.contracts.productadmin.PublishSet publishSet) throws Exception
	{
		return assignProductsToPublishSet( publishSet,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param publishSet The details of the publish to which you want to assign products.
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.assignProductsToPublishSetClient( publishSet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	Stream stream = publishingscope.deletePublishSet( publishSetCode);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deletePublishSet(String publishSetCode) throws Exception
	{
		return deletePublishSet( publishSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	Stream stream = publishingscope.deletePublishSet( publishSetCode,  discardDrafts);
	 * </code></pre></p>
	 * @param discardDrafts Specifies whether to discard all the drafts assigned to the publish set when the publish set is deleted.
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deletePublishSet(String publishSetCode, Boolean discardDrafts) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.deletePublishSetClient( publishSetCode,  discardDrafts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



