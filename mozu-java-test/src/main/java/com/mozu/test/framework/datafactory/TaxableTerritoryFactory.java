/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.settings.general.TaxableTerritoryResource;

/** <summary>
 * Use the taxable territories subresource to manage the regional territories for this site that are subejct to sales tax.
 * </summary>
 */
public class TaxableTerritoryFactory
{

	public static List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> getTaxableTerritories(ApiContext apiContext, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> returnObj = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>();
		TaxableTerritoryResource resource = new TaxableTerritoryResource(apiContext);
		try
		{
			returnObj = resource.getTaxableTerritories();
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

	public static com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, int expectedCode) throws Exception
	{
		return addTaxableTerritory(apiContext,  taxableTerritory,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.general.TaxableTerritory addTaxableTerritory(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.TaxableTerritory returnObj = new com.mozu.api.contracts.sitesettings.general.TaxableTerritory();
		TaxableTerritoryResource resource = new TaxableTerritoryResource(apiContext);
		try
		{
			returnObj = resource.addTaxableTerritory( taxableTerritory,  responseFields);
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

	public static List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> updateTaxableTerritories(ApiContext apiContext, List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> returnObj = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>();
		TaxableTerritoryResource resource = new TaxableTerritoryResource(apiContext);
		try
		{
			returnObj = resource.updateTaxableTerritories( taxableterritories);
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



