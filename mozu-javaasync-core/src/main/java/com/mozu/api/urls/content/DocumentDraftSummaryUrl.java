/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class DocumentDraftSummaryUrl
{

	/**
	 * Get Resource Url for ListDocumentDraftSummaries
	 * @param documentLists Lists that contain the document drafts.
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl listDocumentDraftSummariesUrl(String documentLists, Integer pageSize, String responseFields, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/draft?pageSize={pageSize}&startIndex={startIndex}&documentLists={documentLists}&responseFields={responseFields}");
		formatter.formatUrl("documentLists", documentLists);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentDrafts
	 * @param documentLists List of document lists that contain documents to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentDraftsUrl(String documentLists)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/draft?documentLists={documentLists}");
		formatter.formatUrl("documentLists", documentLists);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PublishDocuments
	 * @param documentLists List of document lists that contain documents to publish.
	 * @return   String Resource Url
	 */
	public static MozuUrl publishDocumentsUrl(String documentLists)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/active?documentLists={documentLists}");
		formatter.formatUrl("documentLists", documentLists);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

