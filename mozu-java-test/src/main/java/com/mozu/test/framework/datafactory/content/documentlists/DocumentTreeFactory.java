/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.content.documentlists;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.documentlists.DocumentTreeResource;

/** <summary>
 * Use the document tree subresource to retrieve documents and manage content within the document hierarchy.
 * </summary>
 */
public class DocumentTreeFactory
{

	public static java.io.InputStream getTreeDocumentContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentTreeResource resource = new DocumentTreeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getTreeDocumentContent( documentListName,  documentName);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static java.io.InputStream transformTreeDocumentContent(ApiContext apiContext, String documentListName, String documentName, int expectedCode) throws Exception
	{
		return transformTreeDocumentContent(apiContext,  documentListName,  documentName,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static java.io.InputStream transformTreeDocumentContent(ApiContext apiContext, String documentListName, String documentName, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentTreeResource resource = new DocumentTreeResource(apiContext);
		try
		{
			returnObj = resource.transformTreeDocumentContent( documentListName,  documentName,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.content.Document getTreeDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, int expectedCode) throws Exception
	{
		return getTreeDocument(apiContext, dataViewMode,  documentListName,  documentName,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.Document getTreeDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, Boolean includeInactive, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.Document returnObj = new com.mozu.api.contracts.content.Document();
		DocumentTreeResource resource = new DocumentTreeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getTreeDocument( documentListName,  documentName,  includeInactive,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static java.io.InputStream updateTreeDocumentContent(ApiContext apiContext, java.io.InputStream stream, String documentListName, String documentName, String  contentType, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentTreeResource resource = new DocumentTreeResource(apiContext);
		try
		{
			returnObj = resource.updateTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static java.io.InputStream deleteTreeDocumentContent(ApiContext apiContext, java.io.InputStream stream, String documentListName, String documentName, String  contentType, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentTreeResource resource = new DocumentTreeResource(apiContext);
		try
		{
			returnObj = resource.deleteTreeDocumentContent( stream,  documentListName,  documentName,  contentType);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



