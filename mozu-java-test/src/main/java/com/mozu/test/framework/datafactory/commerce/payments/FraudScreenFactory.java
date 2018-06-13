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
import com.mozu.api.resources.commerce.payments.FraudScreenResource;

/** <summary>
 * commerce/payments/fraudscreen related resources. DOCUMENT_HERE 
 * </summary>
 */
public class FraudScreenFactory
{

	public static com.mozu.api.contracts.paymentservice.response.FraudScreen screen(ApiContext apiContext, com.mozu.api.contracts.paymentservice.request.FraudScreenRequest request, int expectedCode) throws Exception
	{
		return screen(apiContext,  request,  null, expectedCode);
	}

	public static com.mozu.api.contracts.paymentservice.response.FraudScreen screen(ApiContext apiContext, com.mozu.api.contracts.paymentservice.request.FraudScreenRequest request, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.paymentservice.response.FraudScreen returnObj = new com.mozu.api.contracts.paymentservice.response.FraudScreen();
		FraudScreenResource resource = new FraudScreenResource(apiContext);
		try
		{
			returnObj = resource.screen( request,  responseFields);
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


