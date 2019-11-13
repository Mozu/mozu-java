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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the document tree subresource to retrieve documents and manage content within the document hierarchy.
 * </summary>
 */
public class DocumentTreeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentTreeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentTreeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.getTreeDocumentContent( documentListName,  documentName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getTreeDocumentContent(String documentListName, String documentName) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentContentClient(_dataViewMode,  documentListName,  documentName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.getTreeDocumentContent( documentListName,  documentName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch getTreeDocumentContentAsync(String documentListName, String documentName, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentContentClient(_dataViewMode,  documentListName,  documentName);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.transformTreeDocumentContent( documentListName,  documentName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformTreeDocumentContent(String documentListName, String documentName) throws Exception
	{
		return transformTreeDocumentContent( documentListName,  documentName,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.transformTreeDocumentContent( documentListName,  documentName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch transformTreeDocumentContentAsync(String documentListName, String documentName, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		return transformTreeDocumentContentAsync( documentListName,  documentName,  null,  null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.transformTreeDocumentContent( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * </code></pre></p>
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformTreeDocumentContent(String documentListName, String documentName, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.transformTreeDocumentContentClient( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.transformTreeDocumentContent( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch transformTreeDocumentContentAsync(String documentListName, String documentName, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.transformTreeDocumentContentClient( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Document document = documenttree.getTreeDocument( documentListName,  documentName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getTreeDocument(String documentListName, String documentName) throws Exception
	{
		return getTreeDocument( documentListName,  documentName,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.getTreeDocument( documentListName,  documentName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public CountDownLatch getTreeDocumentAsync(String documentListName, String documentName, AsyncCallback<com.mozu.api.contracts.content.Document> callback) throws Exception
	{
		return getTreeDocumentAsync( documentListName,  documentName,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Document document = documenttree.getTreeDocument( documentListName,  documentName,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param includeInactive Include inactive content.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getTreeDocument(String documentListName, String documentName, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentClient(_dataViewMode,  documentListName,  documentName,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.getTreeDocument( documentListName,  documentName,  includeInactive,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param includeInactive Include inactive content.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public CountDownLatch getTreeDocumentAsync(String documentListName, String documentName, Boolean includeInactive, String responseFields, AsyncCallback<com.mozu.api.contracts.content.Document> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentClient(_dataViewMode,  documentListName,  documentName,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.updateTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Stream
	 * @see Stream
	 * @see Stream
	 */
	public java.io.InputStream updateTreeDocumentContent(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.updateTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.updateTreeDocumentContent( stream,  documentListName,  documentName,  contentType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param  callback callback handler for asynchronous operations
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Stream
	 * @see Stream
	 * @see Stream
	 */
	public CountDownLatch updateTreeDocumentContentAsync(java.io.InputStream stream, String documentListName, String documentName, String  contentType, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.updateTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.deleteTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Stream
	 * @see Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteTreeDocumentContent(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.deleteTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	CountDownLatch latch = documenttree.deleteTreeDocumentContent( stream,  documentListName,  documentName,  contentType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param  callback callback handler for asynchronous operations
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Stream
	 * @see Stream
	 * @see Stream
	 */
	public CountDownLatch deleteTreeDocumentContentAsync(java.io.InputStream stream, String documentListName, String documentName, String  contentType, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.deleteTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



