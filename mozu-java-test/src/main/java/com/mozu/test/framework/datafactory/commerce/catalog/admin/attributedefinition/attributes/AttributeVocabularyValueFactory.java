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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueResource;

/** <summary>
 * Vocabulary values are predefined for an attribute.
 * </summary>
 */
public class AttributeVocabularyValueFactory
{

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValues(ApiContext apiContext, String attributeFQN, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValues( attributeFQN);
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

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContents(ApiContext apiContext, String attributeFQN, String value, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValueLocalizedContents( attributeFQN,  value);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(ApiContext apiContext, String attributeFQN, String value, String localeCode, int expectedCode) throws Exception
	{
		return getAttributeVocabularyValueLocalizedContent(apiContext,  attributeFQN,  value,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(ApiContext apiContext, String attributeFQN, String value, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue getAttributeVocabularyValue(ApiContext apiContext, String attributeFQN, String value, int expectedCode) throws Exception
	{
		return getAttributeVocabularyValue(apiContext,  attributeFQN,  value,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue getAttributeVocabularyValue(ApiContext apiContext, String attributeFQN, String value, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.getAttributeVocabularyValue( attributeFQN,  value,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, int expectedCode) throws Exception
	{
		return addAttributeVocabularyValueLocalizedContent(apiContext,  localizedContent,  attributeFQN,  value,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.addAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue addAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, int expectedCode) throws Exception
	{
		return addAttributeVocabularyValue(apiContext,  attributeVocabularyValue,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue addAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.addAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValues(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> vocabularyValues, String attributeFQN, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValues( vocabularyValues,  attributeFQN);
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

	public static List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContents(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> localizedContent, String attributeFQN, String value, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValueLocalizedContents( localizedContent,  attributeFQN,  value);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode, int expectedCode) throws Exception
	{
		return updateAttributeVocabularyValueLocalizedContent(apiContext,  localizedContent,  attributeFQN,  value,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValueLocalizedContent( localizedContent,  attributeFQN,  value,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue updateAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value, int expectedCode) throws Exception
	{
		return updateAttributeVocabularyValue(apiContext,  attributeVocabularyValue,  attributeFQN,  value,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.AttributeVocabularyValue updateAttributeVocabularyValue(ApiContext apiContext, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeVocabularyValue returnObj = new com.mozu.api.contracts.productadmin.AttributeVocabularyValue();
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.updateAttributeVocabularyValue( attributeVocabularyValue,  attributeFQN,  value,  responseFields);
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

	public static java.io.InputStream deleteAttributeVocabularyValue(ApiContext apiContext, String attributeFQN, String value, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.deleteAttributeVocabularyValue( attributeFQN,  value);
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

	public static java.io.InputStream deleteAttributeVocabularyValueLocalizedContent(ApiContext apiContext, String attributeFQN, String value, String localeCode, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		AttributeVocabularyValueResource resource = new AttributeVocabularyValueResource(apiContext);
		try
		{
			returnObj = resource.deleteAttributeVocabularyValueLocalizedContent( attributeFQN,  value,  localeCode);
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



