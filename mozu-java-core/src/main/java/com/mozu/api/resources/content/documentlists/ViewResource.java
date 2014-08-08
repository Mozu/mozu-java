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
 * 
 * </summary>
 */
public class ViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ViewResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.GetViewDocuments(_dataViewMode,  documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName) throws Exception
	{
		return getViewDocuments( documentListName,  viewName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.GetViewDocuments(_dataViewMode,  documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.ViewClient.getViewDocumentsClient(_dataViewMode,  documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	View view = view.GetDocumentListView(_dataViewMode,  documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.View
	 * @see com.mozu.api.contracts.content.View
	 */
	public com.mozu.api.contracts.content.View getDocumentListView(String documentListName, String viewName) throws Exception
	{
		return getDocumentListView( documentListName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	View view = view.GetDocumentListView(_dataViewMode,  documentListName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.View
	 * @see com.mozu.api.contracts.content.View
	 */
	public com.mozu.api.contracts.content.View getDocumentListView(String documentListName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.View> client = com.mozu.api.clients.content.documentlists.ViewClient.getDocumentListViewClient(_dataViewMode,  documentListName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	ViewCollection viewCollection = view.GetDocumentListViews(_dataViewMode,  documentListName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @return com.mozu.api.contracts.content.ViewCollection
	 * @see com.mozu.api.contracts.content.ViewCollection
	 */
	public com.mozu.api.contracts.content.ViewCollection getDocumentListViews(String documentListName) throws Exception
	{
		return getDocumentListViews( documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	ViewCollection viewCollection = view.GetDocumentListViews(_dataViewMode,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.content.ViewCollection
	 * @see com.mozu.api.contracts.content.ViewCollection
	 */
	public com.mozu.api.contracts.content.ViewCollection getDocumentListViews(String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.ViewCollection> client = com.mozu.api.clients.content.documentlists.ViewClient.getDocumentListViewsClient(_dataViewMode,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	View view = view.UpdateDocumentListView( documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.View
	 * @see com.mozu.api.contracts.content.View
	 */
	public com.mozu.api.contracts.content.View updateDocumentListView(String documentListName, String viewName) throws Exception
	{
		return updateDocumentListView( documentListName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	View view = view.UpdateDocumentListView( documentListName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.View
	 * @see com.mozu.api.contracts.content.View
	 */
	public com.mozu.api.contracts.content.View updateDocumentListView(String documentListName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.View> client = com.mozu.api.clients.content.documentlists.ViewClient.updateDocumentListViewClient( documentListName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	View view = view.DeleteDocumentListView( documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.content.View
	 * @see com.mozu.api.contracts.content.View
	 */
	public com.mozu.api.contracts.content.View deleteDocumentListView(String documentListName, String viewName) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.View> client = com.mozu.api.clients.content.documentlists.ViewClient.deleteDocumentListViewClient( documentListName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


