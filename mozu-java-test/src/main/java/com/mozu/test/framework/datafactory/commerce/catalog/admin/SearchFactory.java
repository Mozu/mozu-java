/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.SearchResource;

/** <summary>
 * 
 * </summary>
 */
public class SearchFactory
{

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(ApiContext apiContext, String searchTuningRuleCode, int expectedCode) throws Exception
	{
		return getSearchTuningRule(apiContext,  searchTuningRuleCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(ApiContext apiContext, String searchTuningRuleCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRule returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRule();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSearchTuningRule( searchTuningRuleCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSearchTuningRules(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSearchTuningRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields getSearchTuningRuleSortFields(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSearchTuningRuleSortFields(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields getSearchTuningRuleSortFields(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSearchTuningRuleSortFields( responseFields);
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

	public static com.mozu.api.contracts.productadmin.SearchSettings getSettings(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSettings(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.SearchSettings getSettings(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SearchSettings returnObj = new com.mozu.api.contracts.productadmin.SearchSettings();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSettings( responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection getSynonymDefinitionCollection(ApiContext apiContext, String localeCode, int expectedCode) throws Exception
	{
		return getSynonymDefinitionCollection(apiContext,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection getSynonymDefinitionCollection(ApiContext apiContext, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSynonymDefinitionCollection( localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection getSynonymDefinitions(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getSynonymDefinitions(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection getSynonymDefinitions(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinitionPagedCollection();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSynonymDefinitions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition getSynonymDefinition(ApiContext apiContext, Integer synonymId, int expectedCode) throws Exception
	{
		return getSynonymDefinition(apiContext,  synonymId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition getSynonymDefinition(ApiContext apiContext, Integer synonymId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinition returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinition();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.getSynonymDefinition( synonymId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, int expectedCode) throws Exception
	{
		return addSearchTuningRule(apiContext,  searchTuningRuleIn,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRule returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRule();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.addSearchTuningRule( searchTuningRuleIn,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields updateSearchTuningRuleSortFields(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn, int expectedCode) throws Exception
	{
		return updateSearchTuningRuleSortFields(apiContext,  searchTuningRuleSortFieldsIn,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields updateSearchTuningRuleSortFields(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSearchTuningRuleSortFields( searchTuningRuleSortFieldsIn,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection updateSynonymDefinitionCollection(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode, int expectedCode) throws Exception
	{
		return updateSynonymDefinitionCollection(apiContext,  collection,  localeCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection updateSynonymDefinitionCollection(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection collection, String localeCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinitionCollection();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSynonymDefinitionCollection( collection,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition addSynonymDefinition(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, int expectedCode) throws Exception
	{
		return addSynonymDefinition(apiContext,  synonymDefinition,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition addSynonymDefinition(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinition returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinition();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.addSynonymDefinition( synonymDefinition,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, int expectedCode) throws Exception
	{
		return updateSearchTuningRule(apiContext,  searchTuningRuleIn,  searchTuningRuleCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SearchTuningRule returnObj = new com.mozu.api.contracts.productadmin.search.SearchTuningRule();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.SearchSettings updateSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.SearchSettings settings, int expectedCode) throws Exception
	{
		return updateSettings(apiContext,  settings,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.SearchSettings updateSettings(ApiContext apiContext, com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.SearchSettings returnObj = new com.mozu.api.contracts.productadmin.SearchSettings();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSettings( settings,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition updateSynonymDefinition(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId, int expectedCode) throws Exception
	{
		return updateSynonymDefinition(apiContext,  synonymDefinition,  synonymId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.search.SynonymDefinition updateSynonymDefinition(ApiContext apiContext, com.mozu.api.contracts.productadmin.search.SynonymDefinition synonymDefinition, Integer synonymId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.search.SynonymDefinition returnObj = new com.mozu.api.contracts.productadmin.search.SynonymDefinition();
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.updateSynonymDefinition( synonymDefinition,  synonymId,  responseFields);
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

	public static java.io.InputStream deleteSearchTuningRule(ApiContext apiContext, String searchTuningRuleCode, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.deleteSearchTuningRule( searchTuningRuleCode);
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

	public static java.io.InputStream deleteSynonymDefinition(ApiContext apiContext, Integer synonymId, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		SearchResource resource = new SearchResource(apiContext);
		try
		{
			returnObj = resource.deleteSynonymDefinition( synonymId);
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



