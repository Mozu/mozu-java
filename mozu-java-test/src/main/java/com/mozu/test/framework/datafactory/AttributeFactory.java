/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.attributedefinition.AttributeResource;

/** <summary>
 * Use the Customer Attribute Definition resource to manage the attributes to define for your shoppers.
 * </summary>
 */
public class AttributeFactory
{

	public static com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getAttributes(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.AttributeCollection returnObj = new com.mozu.api.contracts.core.extensible.AttributeCollection();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> getAttributeVocabularyValues(ApiContext apiContext, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValues( attributeFQN);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.core.extensible.Attribute getAttribute(ApiContext apiContext, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return getAttribute(apiContext,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.core.extensible.Attribute getAttribute(ApiContext apiContext, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.core.extensible.Attribute returnObj = new com.mozu.api.contracts.core.extensible.Attribute();
		AttributeResource resource = new AttributeResource(apiContext);
		try
		{
			returnObj = resource.getAttribute( attributeFQN,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}



