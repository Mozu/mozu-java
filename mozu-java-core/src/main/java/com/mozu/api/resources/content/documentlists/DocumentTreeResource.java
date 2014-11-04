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
import org.apache.commons.lang3.StringUtils;
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
	 * Retrieve the content associated with the document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.getTreeDocumentContent( documentListName,  documentName);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
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
	 * Retrieves a document based on its document list and folder path in the document hierarchy.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Document document = documenttree.getTreeDocument( documentListName,  documentName);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getTreeDocument(String documentListName, String documentName) throws Exception
	{
		return getTreeDocument( documentListName,  documentName,  null);
	}

	/**
	 * Retrieves a document based on its document list and folder path in the document hierarchy.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Document document = documenttree.getTreeDocument( documentListName,  documentName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getTreeDocument(String documentListName, String documentName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentClient(_dataViewMode,  documentListName,  documentName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, based on the document's position in the document hierarchy.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	documenttree.updateTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param stream Input output stream that delivers information.
	 * @return 
	 * @see Stream
	 */
	public void updateTreeDocumentContent(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.updateTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	documenttree.deleteTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param stream Input output stream that delivers information.
	 * @return 
	 * @see Stream
	 */
	public void deleteTreeDocumentContent(java.io.InputStream stream, String documentListName, String documentName, String  contentType) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.deleteTreeDocumentContentClient( stream,  documentListName,  documentName,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



