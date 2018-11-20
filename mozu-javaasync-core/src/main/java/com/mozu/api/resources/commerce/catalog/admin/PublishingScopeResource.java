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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Publishing resource to publish or discard pending changes to product definitions in the master catalog.
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
	 * @param publishSetCode 
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
	 *	CountDownLatch latch = publishingscope.getPublishSet( publishSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param publishSetCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch getPublishSetAsync(String publishSetCode, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		return getPublishSetAsync( publishSetCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.getPublishSet( publishSetCode,  responseFields);
	 * </code></pre></p>
	 * @param publishSetCode 
	 * @param responseFields 
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
	 *	CountDownLatch latch = publishingscope.getPublishSet( publishSetCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param publishSetCode 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch getPublishSetAsync(String publishSetCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetClient( publishSetCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

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
	 *	CountDownLatch latch = publishingscope.getPublishSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public CountDownLatch getPublishSetsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.PublishSetCollection> callback) throws Exception
	{
		return getPublishSetsAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSetCollection publishSetCollection = publishingscope.getPublishSets( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
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
	 *	CountDownLatch latch = publishingscope.getPublishSets( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public CountDownLatch getPublishSetsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSetCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.discardDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Properties of the pending product changes to include in this operation.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public void discardDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.discardDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.publishDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Properties of the pending product changes to include in this operation.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public void publishDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.publishDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishSet 
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
	 *	CountDownLatch latch = publishingscope.assignProductsToPublishSet( publishSet, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param publishSet 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch assignProductsToPublishSetAsync(com.mozu.api.contracts.productadmin.PublishSet publishSet, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		return assignProductsToPublishSetAsync( publishSet,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param publishSet 
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
	 *	CountDownLatch latch = publishingscope.assignProductsToPublishSet( publishSet,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param publishSet 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch assignProductsToPublishSetAsync(com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.assignProductsToPublishSetClient( publishSet,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.deletePublishSet( publishSetCode);
	 * </code></pre></p>
	 * @param publishSetCode 
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deletePublishSet(String publishSetCode) throws Exception
	{
		deletePublishSet( publishSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.deletePublishSet( publishSetCode,  discardDrafts);
	 * </code></pre></p>
	 * @param discardDrafts 
	 * @param publishSetCode 
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deletePublishSet(String publishSetCode, Boolean discardDrafts) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.deletePublishSetClient( publishSetCode,  discardDrafts);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



