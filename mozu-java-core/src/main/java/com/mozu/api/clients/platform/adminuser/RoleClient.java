/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.adminuser;

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
public class RoleClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.RoleCollection> mozuClient=GetRolesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RoleCollection roleCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.RoleCollection>
	 * @see com.mozu.api.contracts.core.RoleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.RoleCollection> getRolesClient() throws Exception
	{
		return getRolesClient( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.RoleCollection> mozuClient=GetRolesClient( startIndex,  pageSize,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RoleCollection roleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.RoleCollection>
	 * @see com.mozu.api.contracts.core.RoleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.RoleCollection> getRolesClient(Integer startIndex, Integer pageSize, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.RoleUrl.getRolesUrl(filter, pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.RoleCollection.class;
		MozuClient<com.mozu.api.contracts.core.RoleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.core.RoleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



