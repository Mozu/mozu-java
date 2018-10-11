/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.content;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.content.PropertyTypeResource;

/** <summary>
 * Use the property types subresource to manage content properties.
 * </summary>
 */
public class PropertyTypeFactory
{

	public static com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getPropertyTypes(apiContext, dataViewMode,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.PropertyTypeCollection getPropertyTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyTypeCollection returnObj = new com.mozu.api.contracts.content.PropertyTypeCollection();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getPropertyTypes( pageSize,  startIndex,  responseFields);
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

	public static com.mozu.api.contracts.content.PropertyType getPropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String propertyTypeName, int expectedCode) throws Exception
	{
		return getPropertyType(apiContext, dataViewMode,  propertyTypeName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.PropertyType getPropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String propertyTypeName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyType returnObj = new com.mozu.api.contracts.content.PropertyType();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getPropertyType( propertyTypeName,  responseFields);
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

	public static com.mozu.api.contracts.content.PropertyType createPropertyType(ApiContext apiContext, com.mozu.api.contracts.content.PropertyType propertyType, int expectedCode) throws Exception
	{
		return createPropertyType(apiContext,  propertyType,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.PropertyType createPropertyType(ApiContext apiContext, com.mozu.api.contracts.content.PropertyType propertyType, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyType returnObj = new com.mozu.api.contracts.content.PropertyType();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext);
		try
		{
			returnObj = resource.createPropertyType( propertyType,  responseFields);
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

	public static com.mozu.api.contracts.content.PropertyType updatePropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.PropertyType propertyType, String propertyTypeName, int expectedCode) throws Exception
	{
		return updatePropertyType(apiContext, dataViewMode,  propertyType,  propertyTypeName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.content.PropertyType updatePropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.PropertyType propertyType, String propertyTypeName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.content.PropertyType returnObj = new com.mozu.api.contracts.content.PropertyType();
		PropertyTypeResource resource = new PropertyTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updatePropertyType( propertyType,  propertyTypeName,  responseFields);
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

	public static void deletePropertyType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String propertyTypeName, int expectedCode) throws Exception
	{
		PropertyTypeResource resource = new PropertyTypeResource(apiContext, dataViewMode);
		try
		{
			resource.deletePropertyType( propertyTypeName);
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



