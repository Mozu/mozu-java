/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin.attributedefinition.attributes;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes.AttributeLocalizedContentResource;

/** <summary>
 * 
 * </summary>
 */
public class AttributeLocalizedContentFactory
{

	public static List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> getAttributeLocalizedContents(ApiContext apiContext, String attributeFQN, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>();
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.getAttributeLocalizedContents( attributeFQN);
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

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent getAttributeLocalizedContent(ApiContext apiContext, String attributeFQN, String localeCode, int expectedCode) throws Exception
	{
		return getAttributeLocalizedContent(apiContext,  attributeFQN,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent getAttributeLocalizedContent(ApiContext apiContext, String attributeFQN, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeLocalizedContent();
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.getAttributeLocalizedContent( attributeFQN,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent addLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, int expectedCode) throws Exception
	{
		return addLocalizedContent(apiContext,  localizedContent,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent addLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeLocalizedContent();
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.addLocalizedContent( localizedContent,  attributeFQN,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> updateLocalizedContents(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> localizedContent, String attributeFQN, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeLocalizedContent>();
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.updateLocalizedContents( localizedContent,  attributeFQN);
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

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent updateLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode, int expectedCode) throws Exception
	{
		return updateLocalizedContent(apiContext,  localizedContent,  attributeFQN,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeLocalizedContent updateLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeLocalizedContent localizedContent, String attributeFQN, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeLocalizedContent();
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.updateLocalizedContent( localizedContent,  attributeFQN,  localeCode,  responseFields);
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

	public static java.io.InputStream deleteLocalizedContent(ApiContext apiContext, String attributeFQN, String localeCode, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AttributeLocalizedContentResource resource = new AttributeLocalizedContentResource(apiContext);
		try
		{
			returnObj = resource.deleteLocalizedContent( attributeFQN,  localeCode);
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



