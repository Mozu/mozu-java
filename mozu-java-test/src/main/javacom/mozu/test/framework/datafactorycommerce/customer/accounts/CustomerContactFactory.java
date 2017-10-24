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
import com.mozu.api.resources.commerce.customer.accounts.CustomerContactResource;

/** <summary>
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactFactory
{

	public static com.mozu.api.contracts.customer.CustomerContact getAccountContact(ApiContext apiContext, Integer accountId, Integer contactId, int expectedCode) throws Exception
	{
		return getAccountContact(apiContext,  accountId,  contactId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerContact getAccountContact(ApiContext apiContext, Integer accountId, Integer contactId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerContact returnObj = new com.mozu.api.contracts.customer.CustomerContact();
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			returnObj = resource.getAccountContact( accountId,  contactId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(ApiContext apiContext, Integer accountId, int expectedCode) throws Exception
	{
		return getAccountContacts(apiContext,  accountId,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(ApiContext apiContext, Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerContactCollection returnObj = new com.mozu.api.contracts.customer.CustomerContactCollection();
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			returnObj = resource.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerContact addAccountContact(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, int expectedCode) throws Exception
	{
		return addAccountContact(apiContext,  contact,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerContact addAccountContact(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerContact returnObj = new com.mozu.api.contracts.customer.CustomerContact();
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			returnObj = resource.addAccountContact( contact,  accountId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerContact updateAccountContact(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, int expectedCode) throws Exception
	{
		return updateAccountContact(apiContext,  contact,  accountId,  contactId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerContact updateAccountContact(ApiContext apiContext, com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerContact returnObj = new com.mozu.api.contracts.customer.CustomerContact();
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			returnObj = resource.updateAccountContact( contact,  accountId,  contactId,  responseFields);
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

	public static com.mozu.api.contracts.customer.CustomerContactCollection addAccountContactList(ApiContext apiContext, List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, int expectedCode) throws Exception
	{
		return addAccountContactList(apiContext,  contactList,  accountId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.CustomerContactCollection addAccountContactList(ApiContext apiContext, List<com.mozu.api.contracts.customer.CustomerContact> contactList, Integer accountId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.CustomerContactCollection returnObj = new com.mozu.api.contracts.customer.CustomerContactCollection();
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			returnObj = resource.addAccountContactList( contactList,  accountId,  responseFields);
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

	public static void deleteAccountContact(ApiContext apiContext, Integer accountId, Integer contactId, int expectedCode) throws Exception
	{
		CustomerContactResource resource = new CustomerContactResource(apiContext);
		try
		{
			resource.deleteAccountContact( accountId,  contactId);
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


