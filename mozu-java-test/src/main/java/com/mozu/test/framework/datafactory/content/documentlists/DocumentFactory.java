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
import com.mozu.api.resources.content.documentlists.DocumentResource;

/** <summary>
 * Use this subresource to manage documents in a document list.
 * </summary>
 */
public class DocumentFactory
{

	public static java.io.InputStream getDocumentContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentResource resource = new DocumentResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocumentContent( documentListName,  documentId);
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

	public static java.io.InputStream transformDocumentContent(ApiContext apiContext, String documentListName, String documentId, int expectedCode) throws Exception
	{
		return transformDocumentContent(apiContext,  documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static java.io.InputStream transformDocumentContent(ApiContext apiContext, String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		DocumentResource resource = new DocumentResource(apiContext);
		try
		{
			returnObj = resource.transformDocumentContent( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
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

	public static com.mozu.api.contracts.content.Document getDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId, int expectedCode) throws Exception
	{
		return getDocument(apiContext, dataViewMode,  documentListName,  documentId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.Document getDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId, Boolean includeInactive, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.Document returnObj = new com.mozu.api.contracts.content.Document();
		DocumentResource resource = new DocumentResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocument( documentListName,  documentId,  includeInactive,  responseFields);
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

	public static com.mozu.api.contracts.content.DocumentCollection getDocuments(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, int expectedCode) throws Exception
	{
		return getDocuments(apiContext, dataViewMode,  documentListName,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentCollection getDocuments(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentCollection returnObj = new com.mozu.api.contracts.content.DocumentCollection();
		DocumentResource resource = new DocumentResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocuments( documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
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

	public static com.mozu.api.contracts.content.Document createDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName, int expectedCode) throws Exception
	{
		return createDocument(apiContext, dataViewMode,  document,  documentListName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.Document createDocument(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.Document returnObj = new com.mozu.api.contracts.content.Document();
		DocumentResource resource = new DocumentResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.createDocument( document,  documentListName,  responseFields);
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

	public static void updateDocumentContent(ApiContext apiContext, java.io.InputStream stream, String documentListName, String documentId, String  contentType, int expectedCode) throws Exception
	{
		DocumentResource resource = new DocumentResource(apiContext);
		try
		{
			resource.updateDocumentContent( stream,  documentListName,  documentId,  contentType);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static com.mozu.api.contracts.content.Document updateDocument(ApiContext apiContext, com.mozu.api.contracts.content.Document document, String documentListName, String documentId, int expectedCode) throws Exception
	{
		return updateDocument(apiContext,  document,  documentListName,  documentId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.Document updateDocument(ApiContext apiContext, com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.Document returnObj = new com.mozu.api.contracts.content.Document();
		DocumentResource resource = new DocumentResource(apiContext);
		try
		{
			returnObj = resource.updateDocument( document,  documentListName,  documentId,  responseFields);
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

	public static void deleteDocument(ApiContext apiContext, String documentListName, String documentId, int expectedCode) throws Exception
	{
		DocumentResource resource = new DocumentResource(apiContext);
		try
		{
			resource.deleteDocument( documentListName,  documentId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static void deleteDocumentContent(ApiContext apiContext, String documentListName, String documentId, int expectedCode) throws Exception
	{
		DocumentResource resource = new DocumentResource(apiContext);
		try
		{
			resource.deleteDocumentContent( documentListName,  documentId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



