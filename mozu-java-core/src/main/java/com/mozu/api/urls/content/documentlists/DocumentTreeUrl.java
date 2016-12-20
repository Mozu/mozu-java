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
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
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
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
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
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
	 * @param includeInactive Include inactive content.
	 * @param responseFields Use this field to include those fields which are not included by default.
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
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
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
	 * @param documentListName Name of content documentListName to delete
	 * @param documentName The name of the document in the site.
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

