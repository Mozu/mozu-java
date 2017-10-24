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
 * Use the document publishing subresource to manage and publish document drafts in the Content service.
 * </summary>
 */
public class DocumentDraftSummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public DocumentDraftSummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = documentdraftsummary.listDocumentDraftSummaries();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries() throws Exception
	{
		return listDocumentDraftSummaries( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	CountDownLatch latch = documentdraftsummary.listDocumentDraftSummaries( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public CountDownLatch listDocumentDraftSummariesAsync( AsyncCallback<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> callback) throws Exception
	{
		return listDocumentDraftSummariesAsync( null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = documentdraftsummary.listDocumentDraftSummaries( pageSize,  startIndex,  documentLists,  responseFields);
	 * </code></pre></p>
	 * @param documentLists Lists that contain the document drafts.
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(Integer pageSize, Integer startIndex, String documentLists, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.DocumentDraftSummaryClient.listDocumentDraftSummariesClient( pageSize,  startIndex,  documentLists,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	CountDownLatch latch = documentdraftsummary.listDocumentDraftSummaries( pageSize,  startIndex,  documentLists,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentLists Lists that contain the document drafts.
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public CountDownLatch listDocumentDraftSummariesAsync(Integer pageSize, Integer startIndex, String documentLists, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.DocumentDraftSummaryClient.listDocumentDraftSummariesClient( pageSize,  startIndex,  documentLists,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.deleteDocumentDrafts( documentIds);
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return 
	 * @see string
	 */
	public void deleteDocumentDrafts(List<String> documentIds) throws Exception
	{
		deleteDocumentDrafts( documentIds,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.deleteDocumentDrafts( documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return 
	 * @see string
	 */
	public void deleteDocumentDrafts(List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.DocumentDraftSummaryClient.deleteDocumentDraftsClient( documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.publishDocuments( documentIds);
	 * </code></pre></p>
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return 
	 * @see string
	 */
	public void publishDocuments(List<String> documentIds) throws Exception
	{
		publishDocuments( documentIds,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.publishDocuments( documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to publish.
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return 
	 * @see string
	 */
	public void publishDocuments(List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.DocumentDraftSummaryClient.publishDocumentsClient( documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



