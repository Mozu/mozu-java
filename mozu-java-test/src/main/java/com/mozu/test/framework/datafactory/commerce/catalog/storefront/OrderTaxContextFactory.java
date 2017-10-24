/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.storefront;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.OrderTaxContextResource;

/** <summary>
 * 
 * </summary>
 */
public class OrderTaxContextFactory
{

	public static com.mozu.api.contracts.pricingruntime.OrderTaxContext estimateTaxes(ApiContext apiContext, com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder, int expectedCode) throws Exception
	{
		return estimateTaxes(apiContext,  taxableOrder,  null, expectedCode);
	}

	public static com.mozu.api.contracts.pricingruntime.OrderTaxContext estimateTaxes(ApiContext apiContext, com.mozu.api.contracts.pricingruntime.TaxableOrder taxableOrder, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.pricingruntime.OrderTaxContext returnObj = new com.mozu.api.contracts.pricingruntime.OrderTaxContext();
		OrderTaxContextResource resource = new OrderTaxContextResource(apiContext);
		try
		{
			returnObj = resource.estimateTaxes( taxableOrder,  responseFields);
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



