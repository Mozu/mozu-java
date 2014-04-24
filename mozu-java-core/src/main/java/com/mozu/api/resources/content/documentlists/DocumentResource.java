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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this subresource to manage documents in a document list.
 * </summary>
 */
public class DocumentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public DocumentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a specific document within the specified document list by providing the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.GetDocument(dataViewMode,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Identifier of the document being retrieved.
	 * @param documentListName The name of the document list associated with the document to retrieve.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentClient(dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.GetDocumentContent(dataViewMode,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getDocumentContent(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentContentClient(dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.GetDocuments(dataViewMode,  documentListName);
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		return getDocuments(dataViewMode,  documentListName,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.GetDocuments(dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex);
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter a document's search results by any of its properties, including its name or folder path. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Name+sw+Events"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(com.mozu.api.DataViewMode dataViewMode, String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentsClient(dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new document in an existing list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.CreateDocument(dataViewMode,  document,  documentListName);
	 * </code></pre></p>
	 * @param documentListName The descriptive alphanumeric document list name being created.
	 * @param document The descriptive name of the newly created document.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.createDocumentClient(dataViewMode,  document,  documentListName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a document in a document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.UpdateDocument(dataViewMode,  document,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document to update.
	 * @param documentListName Name of the document list associated with the document.
	 * @param document Properties of the document to update.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentClient(dataViewMode,  document,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.UpdateDocumentContent(dataViewMode,  stream,  documentListName,  documentId,  contentType);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @param stream 
	 * @return 
	 * @see Stream
	 */
	public void updateDocumentContent(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentContentClient(dataViewMode,  stream,  documentListName,  documentId,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Deletes a specific document based on the specified document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.DeleteDocument(dataViewMode,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Identifier of the document being deleted.
	 * @param documentListName The name of the document list associated with the document list being deleted.
	 * @return 
	 */
	public void deleteDocument(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentClient(dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specification, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.DeleteDocumentContent(dataViewMode,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return 
	 */
	public void deleteDocumentContent(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentContentClient(dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



