/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

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
 * Use this subresource to manage documents in a document list.
 * </summary>
 */
public class DocumentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.getDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentContentClient(_dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId 
	 * @param documentListName 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId) throws Exception
	{
		return transformDocumentContent( documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * </code></pre></p>
	 * @param crop 
	 * @param documentId 
	 * @param documentListName 
	 * @param height 
	 * @param max 
	 * @param maxHeight 
	 * @param maxWidth 
	 * @param quality 
	 * @param width 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.transformDocumentContentClient( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Identifier of the document being retrieved.
	 * @param documentListName The name of the document list associated with the document to retrieve.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId) throws Exception
	{
		return getDocument( documentListName,  documentId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentId Identifier of the document being retrieved.
	 * @param documentListName The name of the document list associated with the document to retrieve.
	 * @param includeInactive 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentClient(_dataViewMode,  documentListName,  documentId,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName);
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName) throws Exception
	{
		return getDocuments( documentListName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter a document's search results by any of its properties, including its name or folder path. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Name+sw+Events"
	 * @param includeInactive 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentsClient(_dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName);
	 * </code></pre></p>
	 * @param documentListName The descriptive alphanumeric document list name being created.
	 * @param document The descriptive name of the newly created document.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		return createDocument( document,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName The descriptive alphanumeric document list name being created.
	 * @param responseFields 
	 * @param document The descriptive name of the newly created document.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.createDocumentClient(_dataViewMode,  document,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.updateDocumentContent( stream,  documentListName,  documentId,  contentType);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @param stream Input output stream that delivers information.
	 * @return Stream
	 * @see Stream
	 * @see Stream
	 */
	public java.io.InputStream updateDocumentContent(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document to update.
	 * @param documentListName Name of the document list associated with the document.
	 * @param document Properties of the document to update.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		return updateDocument( document,  documentListName,  documentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId,  responseFields);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document to update.
	 * @param documentListName Name of the document list associated with the document.
	 * @param responseFields 
	 * @param document Properties of the document to update.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentClient( document,  documentListName,  documentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.deleteDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Identifier of the document being deleted.
	 * @param documentListName The name of the document list associated with the document list being deleted.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteDocument(String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.deleteDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentContentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



