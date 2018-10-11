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

/** <summary>
 * Properties and content for views within a site/tenant. Views provide the schema, formatting, and associated content and entities for displaying content within a site/tenant.
 * </summary>
 */
public class ViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName) throws Exception
	{
		return getViewDocuments( documentListName,  viewName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeInactive Include inactive content.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param viewName The name for a view. Views are used to render data in , such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.ViewClient.getViewDocumentsClient( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



