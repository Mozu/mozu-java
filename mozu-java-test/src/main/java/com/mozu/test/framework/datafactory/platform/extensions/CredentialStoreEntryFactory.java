/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.platform.extensions;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.extensions.CredentialStoreEntryResource;

/** <summary>
 * 
 * </summary>
 */
public class CredentialStoreEntryFactory
{

	public static java.io.InputStream storeCredentials(ApiContext apiContext, com.mozu.api.contracts.installedapplications.CredentialStoreEntry credentials, int expectedCode) throws Exception
	{
		java.io.InputStream returnObj;
		CredentialStoreEntryResource resource = new CredentialStoreEntryResource(apiContext);
		try
		{
			returnObj = resource.storeCredentials( credentials);
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



