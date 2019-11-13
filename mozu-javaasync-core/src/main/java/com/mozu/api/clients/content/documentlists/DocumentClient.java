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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
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
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param includeInactive Include inactive content.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param documentListName Name of content documentListName to delete
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
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeInactive Include inactive content.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
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
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
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
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param document The document properties that define the content used by the content management system (CMS).
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
	 * MozuClient<java.io.InputStream> mozuClient=UpdateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> updateDocumentContentClient(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.updateDocumentContentUrl(documentId, documentListName);
		String verb = "PUT";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
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
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param document The document properties that define the content used by the content management system (CMS).
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
	 * MozuClient<java.io.InputStream> mozuClient=DeleteDocumentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteDocumentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentUrl(documentId, documentListName);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteDocumentContentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteDocumentContentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentContentUrl(documentId, documentListName);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



