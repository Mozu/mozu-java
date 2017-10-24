/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content.documentlists;

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
public class DocumentClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetDocumentContentClient(dataViewMode,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentContentUrl(documentId, documentListName);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=TransformDocumentContentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId 
	 * @param documentListName 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformDocumentContentClient(String documentListName, String documentId) throws Exception
	{
		return transformDocumentContentClient( documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=TransformDocumentContentClient( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
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
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformDocumentContentClient(String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.transformDocumentContentUrl(crop, documentId, documentListName, height, max, maxHeight, maxWidth, quality, width);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetDocumentClient(dataViewMode,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Identifier of the document being retrieved.
	 * @param documentListName The name of the document list associated with the document to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		return getDocumentClient(dataViewMode,  documentListName,  documentId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetDocumentClient(dataViewMode,  documentListName,  documentId,  includeInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Identifier of the document being retrieved.
	 * @param documentListName The name of the document list associated with the document to retrieve.
	 * @param includeInactive 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentUrl(documentId, documentListName, includeInactive, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetDocumentsClient(dataViewMode,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		return getDocumentsClient(dataViewMode,  documentListName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetDocumentsClient(dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter a document's search results by any of its properties, including its name or folder path. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Name+sw+Events"
	 * @param includeInactive 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentsUrl(documentListName, filter, includeInactive, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=CreateDocumentClient(dataViewMode,  document,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The descriptive alphanumeric document list name being created.
	 * @param document The descriptive name of the newly created document.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> createDocumentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		return createDocumentClient(dataViewMode,  document,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=CreateDocumentClient(dataViewMode,  document,  documentListName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The descriptive alphanumeric document list name being created.
	 * @param responseFields 
	 * @param document The descriptive name of the newly created document.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> createDocumentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.createDocumentUrl(documentListName, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(document);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @param stream Input output stream that delivers information.
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient updateDocumentContentClient(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.updateDocumentContentUrl(documentId, documentListName);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=UpdateDocumentClient( document,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document to update.
	 * @param documentListName Name of the document list associated with the document.
	 * @param document Properties of the document to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> updateDocumentClient(com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		return updateDocumentClient( document,  documentListName,  documentId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=UpdateDocumentClient( document,  documentListName,  documentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document to update.
	 * @param documentListName Name of the document list associated with the document.
	 * @param responseFields 
	 * @param document Properties of the document to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> updateDocumentClient(com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.updateDocumentUrl(documentId, documentListName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(document);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Identifier of the document being deleted.
	 * @param documentListName The name of the document list associated with the document list being deleted.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDocumentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentUrl(documentId, documentListName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentContentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Unique identifier of the document.
	 * @param documentListName The name of the document list associated with the document.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDocumentContentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentContentUrl(documentId, documentListName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



