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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the document lists resource to organize your site's documents into a hierarchy. Document lists can contain documents, folders, and complete hierarchies of folders, which contain documents with unique names.
 * </summary>
 */
public class DocumentListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentListResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.getDocumentLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists() throws Exception
	{
		return getDocumentLists( null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.getDocumentLists( pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentListCollection> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListsClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.getDocumentList( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList getDocumentList(String documentListName) throws Exception
	{
		return getDocumentList( documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.getDocumentList( documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList getDocumentList(String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListClient(_dataViewMode,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.createDocumentList( list);
	 * </code></pre></p>
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList createDocumentList(com.mozu.api.contracts.content.DocumentList list) throws Exception
	{
		return createDocumentList( list,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.createDocumentList( list,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList createDocumentList(com.mozu.api.contracts.content.DocumentList list, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.createDocumentListClient(_dataViewMode,  list,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.updateDocumentList( list,  documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList updateDocumentList(com.mozu.api.contracts.content.DocumentList list, String documentListName) throws Exception
	{
		return updateDocumentList( list,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.updateDocumentList( list,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList updateDocumentList(com.mozu.api.contracts.content.DocumentList list, String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.updateDocumentListClient( list,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	Stream stream = documentlist.deleteDocumentList( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteDocumentList(String documentListName) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.DocumentListClient.deleteDocumentListClient( documentListName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



