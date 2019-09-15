/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.adminuser;

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
 * 
 * </summary>
 */
public class RoleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public RoleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Role role = new Role();
	 *	RoleCollection roleCollection = role.getRoles();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.RoleCollection
	 * @see com.mozu.api.contracts.core.RoleCollection
	 */
	public com.mozu.api.contracts.core.RoleCollection getRoles() throws Exception
	{
		return getRoles( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Role role = new Role();
	 *	RoleCollection roleCollection = role.getRoles( startIndex,  pageSize,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.core.RoleCollection
	 * @see com.mozu.api.contracts.core.RoleCollection
	 */
	public com.mozu.api.contracts.core.RoleCollection getRoles(Integer startIndex, Integer pageSize, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.RoleCollection> client = com.mozu.api.clients.platform.adminuser.RoleClient.getRolesClient( startIndex,  pageSize,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



