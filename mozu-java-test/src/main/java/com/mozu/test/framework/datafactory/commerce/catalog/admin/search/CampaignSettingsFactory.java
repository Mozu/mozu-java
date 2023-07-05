/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin.search;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.search.CampaignSettingsResource;

/** <summary>
 * 
 * </summary>
 */
public class CampaignSettingsFactory
{

	public static com.mozu.api.contracts.productadmin.CampaignSettings getCampaignSetting(ApiContext apiContext, String campaignId, int expectedCode) throws Exception
	{
		return getCampaignSetting(apiContext,  campaignId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CampaignSettings getCampaignSetting(ApiContext apiContext, String campaignId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CampaignSettings returnObj = new com.mozu.api.contracts.productadmin.CampaignSettings();
		CampaignSettingsResource resource = new CampaignSettingsResource(apiContext);
		try
		{
			returnObj = resource.getCampaignSetting( campaignId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CampaignSettingsCollection getCampaignSettings(ApiContext apiContext, String pagesize, String startindex, int expectedCode) throws Exception
	{
		return getCampaignSettings(apiContext,  pagesize,  startindex,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CampaignSettingsCollection getCampaignSettings(ApiContext apiContext, String pagesize, String startindex, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CampaignSettingsCollection returnObj = new com.mozu.api.contracts.productadmin.CampaignSettingsCollection();
		CampaignSettingsResource resource = new CampaignSettingsResource(apiContext);
		try
		{
			returnObj = resource.getCampaignSettings( pagesize,  startindex,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CampaignSettings addCampaignSetting(ApiContext apiContext, com.mozu.api.contracts.productadmin.CampaignSettings settings, int expectedCode) throws Exception
	{
		return addCampaignSetting(apiContext,  settings,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CampaignSettings addCampaignSetting(ApiContext apiContext, com.mozu.api.contracts.productadmin.CampaignSettings settings, Boolean fromSystemDefault, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CampaignSettings returnObj = new com.mozu.api.contracts.productadmin.CampaignSettings();
		CampaignSettingsResource resource = new CampaignSettingsResource(apiContext);
		try
		{
			returnObj = resource.addCampaignSetting( settings,  fromSystemDefault,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CampaignSettings updateCampaignSetting(ApiContext apiContext, com.mozu.api.contracts.productadmin.CampaignSettings settings, String campaignId, int expectedCode) throws Exception
	{
		return updateCampaignSetting(apiContext,  settings,  campaignId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.CampaignSettings updateCampaignSetting(ApiContext apiContext, com.mozu.api.contracts.productadmin.CampaignSettings settings, String campaignId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CampaignSettings returnObj = new com.mozu.api.contracts.productadmin.CampaignSettings();
		CampaignSettingsResource resource = new CampaignSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateCampaignSetting( settings,  campaignId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.CampaignSettings deleteCampaignSetting(ApiContext apiContext, String campaignId, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.CampaignSettings returnObj = new com.mozu.api.contracts.productadmin.CampaignSettings();
		CampaignSettingsResource resource = new CampaignSettingsResource(apiContext);
		try
		{
			returnObj = resource.deleteCampaignSetting( campaignId);
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


