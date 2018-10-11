/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.payments;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.payments.PublicTokenResource;

/** <summary>
 * commerce/payments/tokens related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublicTokenFactory
{

	public static com.mozu.api.contracts.paymentservice.response.TokenResponse create(ApiContext apiContext, com.mozu.api.contracts.paymentservice.PublicToken request, int expectedCode) throws Exception
	{
		return create(apiContext,  request,  null, expectedCode);
	}

	public static com.mozu.api.contracts.paymentservice.response.TokenResponse create(ApiContext apiContext, com.mozu.api.contracts.paymentservice.PublicToken request, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.paymentservice.response.TokenResponse returnObj = new com.mozu.api.contracts.paymentservice.response.TokenResponse();
		PublicTokenResource resource = new PublicTokenResource(apiContext);
		try
		{
			returnObj = resource.create( request,  responseFields);
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

	public static com.fasterxml.jackson.databind.JsonNode execute(ApiContext apiContext, com.mozu.api.contracts.paymentservice.request.ExecuteRequest request, String cardType, int expectedCode) throws Exception
	{
		return execute(apiContext,  request,  cardType,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode execute(ApiContext apiContext, com.mozu.api.contracts.paymentservice.request.ExecuteRequest request, String cardType, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		PublicTokenResource resource = new PublicTokenResource(apiContext);
		try
		{
			returnObj = resource.execute( request,  cardType,  responseFields);
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



