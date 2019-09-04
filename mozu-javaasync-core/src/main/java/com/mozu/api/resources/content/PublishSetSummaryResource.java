/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

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

/** <summary>
 * 
 * </summary>
 */
public class PublishSetSummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublishSetSummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = publishsetsummary.getPublishSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets() throws Exception
	{
		return getPublishSets( null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.getPublishSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public CountDownLatch getPublishSetsAsync( AsyncCallback<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> callback) throws Exception
	{
		return getPublishSetsAsync( null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = publishsetsummary.getPublishSets( pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetsClient( pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.getPublishSets( pageSize,  startIndex,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public CountDownLatch getPublishSetsAsync(Integer pageSize, Integer startIndex, String responseFields, AsyncCallback<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetsClient( pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = publishsetsummary.getPublishSetItems( code);
	 * </code></pre></p>
	 * @param code 
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(String code) throws Exception
	{
		return getPublishSetItems( code,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.getPublishSetItems( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public CountDownLatch getPublishSetItemsAsync(String code, AsyncCallback<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> callback) throws Exception
	{
		return getPublishSetItemsAsync( code,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = publishsetsummary.getPublishSetItems( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(String code, Integer pageSize, Integer startIndex, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetItemsClient( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.getPublishSetItems( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public CountDownLatch getPublishSetItemsAsync(String code, Integer pageSize, Integer startIndex, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetItemsClient( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.deletePublishSet( code);
	 * </code></pre></p>
	 * @param code 
	 * @return object
	 * @see object
	 */
	public Object deletePublishSet(String code) throws Exception
	{
		return deletePublishSet( code,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.deletePublishSet( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param  callback callback handler for asynchronous operations
	 * @return object
	 * @see object
	 */
	public CountDownLatch deletePublishSetAsync(String code, AsyncCallback<Object> callback) throws Exception
	{
		return deletePublishSetAsync( code,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.deletePublishSet( code,  shouldDiscard,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param shouldDiscard 
	 * @return object
	 * @see object
	 */
	public Object deletePublishSet(String code, Boolean shouldDiscard, String responseFields) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.deletePublishSetClient( code,  shouldDiscard,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.deletePublishSet( code,  shouldDiscard,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param shouldDiscard 
	 * @param  callback callback handler for asynchronous operations
	 * @return object
	 * @see object
	 */
	public CountDownLatch deletePublishSetAsync(String code, Boolean shouldDiscard, String responseFields, AsyncCallback<Object> callback) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.deletePublishSetClient( code,  shouldDiscard,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.addPublishSetItems( itemsToPublish,  code);
	 * </code></pre></p>
	 * @param code 
	 * @param itemsToPublish 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public Object addPublishSetItems(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code) throws Exception
	{
		return addPublishSetItems( itemsToPublish,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.addPublishSetItems( itemsToPublish,  code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param  callback callback handler for asynchronous operations
	 * @param itemsToPublish 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public CountDownLatch addPublishSetItemsAsync(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, AsyncCallback<Object> callback) throws Exception
	{
		return addPublishSetItemsAsync( itemsToPublish,  code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.addPublishSetItems( itemsToPublish,  code,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param itemsToPublish 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public Object addPublishSetItems(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, String responseFields) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.addPublishSetItemsClient( itemsToPublish,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	CountDownLatch latch = publishsetsummary.addPublishSetItems( itemsToPublish,  code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param itemsToPublish 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public CountDownLatch addPublishSetItemsAsync(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, String responseFields, AsyncCallback<Object> callback) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.addPublishSetItemsClient( itemsToPublish,  code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



