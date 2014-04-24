/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the tenant data resource to store tenant-level information required for a third-party application in the Mozu database.
 * </summary>
 */
public class TenantDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public TenantDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the value of a record in the Mozu database.
	 * <p><pre><code>
	 *	TenantData tenantdata = new TenantData();
	 *	string string = tenantdata.GetDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.platform.TenantDataClient.getDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	TenantData tenantdata = new TenantData();
	 *	tenantdata.CreateDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return 
	 * @see string
	 */
	public void createDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.TenantDataClient.createDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Updates a record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	TenantData tenantdata = new TenantData();
	 *	tenantdata.UpdateDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param value The database value to update.
	 * @return 
	 * @see string
	 */
	public void updateDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.TenantDataClient.updateDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Removes a previously defined record in the Mozu database.
	 * <p><pre><code>
	 *	TenantData tenantdata = new TenantData();
	 *	tenantdata.DeleteDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @return 
	 */
	public void deleteDBValue(String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.TenantDataClient.deleteDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



