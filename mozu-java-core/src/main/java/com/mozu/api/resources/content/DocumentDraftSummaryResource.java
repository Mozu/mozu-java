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
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = documentdraftsummary.listDocumentDraftSummaries( pageSize,  startIndex,  documentLists,  responseFields);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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
	 *	Stream stream = documentdraftsummary.deleteDocumentDrafts( documentIds);
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream deleteDocumentDrafts(List<String> documentIds) throws Exception
	{
		return deleteDocumentDrafts( documentIds,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	Stream stream = documentdraftsummary.deleteDocumentDrafts( documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream deleteDocumentDrafts(List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.DocumentDraftSummaryClient.deleteDocumentDraftsClient( documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	Stream stream = documentdraftsummary.publishDocuments( documentIds);
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream publishDocuments(List<String> documentIds) throws Exception
	{
		return publishDocuments( documentIds,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	Stream stream = documentdraftsummary.publishDocuments( documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream publishDocuments(List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.DocumentDraftSummaryClient.publishDocumentsClient( documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



