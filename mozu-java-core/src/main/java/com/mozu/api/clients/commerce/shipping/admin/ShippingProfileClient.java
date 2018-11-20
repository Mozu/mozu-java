/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.shipping.admin;

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
public class ShippingProfileClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> mozuClient=GetProfilesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingProfileCollection shippingProfileCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> getProfilesClient() throws Exception
	{
		return getProfilesClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> mozuClient=GetProfilesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingProfileCollection shippingProfileCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> getProfilesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.ShippingProfileUrl.getProfilesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



