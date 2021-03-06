/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.PublishingScopeResource;

/** <summary>
 * Use the Product Publishing resource to publish or discard pending changes to products in a master catalog, or to add or remove pending changes to and from product publish sets.You can use product publish sets to group pending product changes together and publish them all at the same time.
 * </summary>
 */
public class PublishingScopeFactory
{

	public static com.mozu.api.contracts.productadmin.PublishSet getPublishSet(ApiContext apiContext, String publishSetCode, int expectedCode) throws Exception
	{
		return getPublishSet(apiContext,  publishSetCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PublishSet getPublishSet(ApiContext apiContext, String publishSetCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PublishSet returnObj = new com.mozu.api.contracts.productadmin.PublishSet();
		PublishingScopeResource resource = new PublishingScopeResource(apiContext);
		try
		{
			returnObj = resource.getPublishSet( publishSetCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getPublishSets(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PublishSetCollection returnObj = new com.mozu.api.contracts.productadmin.PublishSetCollection();
		PublishingScopeResource resource = new PublishingScopeResource(apiContext);
		try
		{
			returnObj = resource.getPublishSets( responseFields);
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

	public static void discardDrafts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope, int expectedCode) throws Exception
	{
		PublishingScopeResource resource = new PublishingScopeResource(apiContext, dataViewMode);
		try
		{
			resource.discardDrafts( publishScope);
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

	public static void publishDrafts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.PublishingScope publishScope, int expectedCode) throws Exception
	{
		PublishingScopeResource resource = new PublishingScopeResource(apiContext, dataViewMode);
		try
		{
			resource.publishDrafts( publishScope);
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

	public static com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(ApiContext apiContext, com.mozu.api.contracts.productadmin.PublishSet publishSet, int expectedCode) throws Exception
	{
		return assignProductsToPublishSet(apiContext,  publishSet,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(ApiContext apiContext, com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.PublishSet returnObj = new com.mozu.api.contracts.productadmin.PublishSet();
		PublishingScopeResource resource = new PublishingScopeResource(apiContext);
		try
		{
			returnObj = resource.assignProductsToPublishSet( publishSet,  responseFields);
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

	public static void deletePublishSet(ApiContext apiContext, String publishSetCode, int expectedCode) throws Exception
	{
		deletePublishSet(apiContext,  publishSetCode,  null, expectedCode);
	}

	public static void deletePublishSet(ApiContext apiContext, String publishSetCode, Boolean discardDrafts, int expectedCode) throws Exception
	{
		PublishingScopeResource resource = new PublishingScopeResource(apiContext);
		try
		{
			resource.deletePublishSet( publishSetCode,  discardDrafts);
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



