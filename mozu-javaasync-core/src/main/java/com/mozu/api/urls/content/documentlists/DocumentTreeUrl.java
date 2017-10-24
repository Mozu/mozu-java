/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class DocumentTreeUrl
{

	/**
	 * Get Resource Url for GetTreeDocumentContent
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return   String Resource Url
	 */
	public static MozuUrl getTreeDocumentContentUrl(String documentListName, String documentName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for TransformTreeDocumentContent
	 * @param crop 
	 * @param documentListName 
	 * @param documentName 
	 * @param height 
	 * @param max 
	 * @param maxHeight 
	 * @param maxWidth 
	 * @param quality 
	 * @param width 
	 * @return   String Resource Url
	 */
	public static MozuUrl transformTreeDocumentContentUrl(String crop, String documentListName, String documentName, Integer height, Integer max, Integer maxHeight, Integer maxWidth, Integer quality, Integer width)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/transform?width={width}&height={height}&maxWidth={maxWidth}&maxHeight={maxHeight}&crop={crop}&quality={quality}");
		formatter.formatUrl("crop", crop);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("height", height);
		formatter.formatUrl("max", max);
		formatter.formatUrl("maxHeight", maxHeight);
		formatter.formatUrl("maxWidth", maxWidth);
		formatter.formatUrl("quality", quality);
		formatter.formatUrl("width", width);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetTreeDocument
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param includeInactive 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getTreeDocumentUrl(String documentListName, String documentName, Boolean includeInactive, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}?includeInactive={includeInactive}&responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("includeInactive", includeInactive);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateTreeDocumentContent
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateTreeDocumentContentUrl(String documentListName, String documentName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content?folderPath={folderPath}&folderId={folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteTreeDocumentContent
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteTreeDocumentContentUrl(String documentListName, String documentName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content?folderPath={folderPath}&folderId={folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

