/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactorycommerce.customer.accounts;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.accounts.CustomerSegmentResource;

/** <summary>
 * Use the Customer Account Segments subresource to view the customer segments associated with a customer account.
 * </summary>
 */
public class CustomerSegmentFactory
{

	public static com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getAccountSegments(apiContext,  accountId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(ApiContext apiContext, Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerSegmentCollection returnObj = new com.mozu.api.contracts.customer.CustomerSegmentCollection();
		CustomerSegmentResource resource = new CustomerSegmentResource(apiContext);
		try
		{
			returnObj = resource.getAccountSegments( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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



