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
 * Use the document tree subresource to retrieve documents and manage content within the document hierarchy.
 * </summary>
 */
public class DocumentTreeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetTreeDocumentContentClient(dataViewMode,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.getTreeDocumentContentUrl(documentListName, documentName);
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
	 * MozuClient<java.io.InputStream> mozuClient=TransformTreeDocumentContentClient( documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param documentName 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformTreeDocumentContentClient(String documentListName, String documentName) throws Exception
	{
		return transformTreeDocumentContentClient( documentListName,  documentName,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=TransformTreeDocumentContentClient( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param crop 
	 * @param documentListName 
	 * @param documentName 
	 * @param height 
	 * @param max 
	 * @param maxHeight 
	 * @param maxWidth 
	 * @param quality 
	 * @param width 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformTreeDocumentContentClient(String documentListName, String documentName, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.transformTreeDocumentContentUrl(crop, documentListName, documentName, height, max, maxHeight, maxWidth, quality, width);
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
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetTreeDocumentClient(dataViewMode,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getTreeDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName) throws Exception
	{
		return getTreeDocumentClient(dataViewMode,  documentListName,  documentName,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetTreeDocumentClient(dataViewMode,  documentListName,  documentName,  includeInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param includeInactive 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getTreeDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.getTreeDocumentUrl(documentListName, documentName, includeInactive, responseFields);
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
	 * MozuClient mozuClient=UpdateTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param stream Input output stream that delivers information.
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient updateTreeDocumentContentClient(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.updateTreeDocumentContentUrl(documentListName, documentName);
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
	 * MozuClient mozuClient=DeleteTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param stream Input output stream that delivers information.
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient deleteTreeDocumentContentClient(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.deleteTreeDocumentContentUrl(documentListName, documentName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

}



