/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.returns;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class OrderNoteUrl
{

	/**
	 * Get Resource Url for GetReturnNotes
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnNotesUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/notes");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturnNote
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnNoteUrl(String noteId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/notes/{noteId}?responseFields={responseFields}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturnNote
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnNoteUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/notes?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateReturnNote
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateReturnNoteUrl(String noteId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/notes/{noteId}?responseFields={responseFields}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteReturnNote
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteReturnNoteUrl(String noteId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/notes/{noteId}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

