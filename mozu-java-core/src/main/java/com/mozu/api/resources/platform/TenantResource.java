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
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the tenants resource to manage information about a  tenant.
 * </summary>
 */
public class TenantResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TenantResource() 
		{
			_apiContext = null;
	}
public TenantResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Tenant tenant = new Tenant();
	 *	Tenant tenant = tenant.getTenant( tenantId);
	 * </code></pre></p>
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @return com.mozu.api.contracts.tenant.Tenant
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public com.mozu.api.contracts.tenant.Tenant getTenant(Integer tenantId) throws Exception
	{
		return getTenant( tenantId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Tenant tenant = new Tenant();
	 *	Tenant tenant = tenant.getTenant( tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @return com.mozu.api.contracts.tenant.Tenant
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public com.mozu.api.contracts.tenant.Tenant getTenant(Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.tenant.Tenant> client = com.mozu.api.clients.platform.TenantClient.getTenantClient( tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



