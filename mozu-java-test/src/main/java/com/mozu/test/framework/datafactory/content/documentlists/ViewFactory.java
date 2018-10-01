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
import com.mozu.api.resources.content.documentlists.ViewResource;

/** <summary>
 * 
 * </summary>
 */
public class ViewFactory
{

	public static com.mozu.api.contracts.content.DocumentCollection getViewDocuments(ApiContext apiContext, String documentListName, String viewName, int expectedCode) throws Exception
	{
		return getViewDocuments(apiContext,  documentListName,  viewName,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.DocumentCollection getViewDocuments(ApiContext apiContext, String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentCollection returnObj = new com.mozu.api.contracts.content.DocumentCollection();
		ViewResource resource = new ViewResource(apiContext);
		try
		{
			returnObj = resource.getViewDocuments( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
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



