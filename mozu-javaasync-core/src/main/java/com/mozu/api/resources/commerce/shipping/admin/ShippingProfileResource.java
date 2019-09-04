/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class ShippingProfileResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingProfileResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ShippingProfile shippingprofile = new ShippingProfile();
	 *	ShippingProfileCollection shippingProfileCollection = shippingprofile.getProfiles();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection getProfiles() throws Exception
	{
		return getProfiles( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingProfile shippingprofile = new ShippingProfile();
	 *	CountDownLatch latch = shippingprofile.getProfiles( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public CountDownLatch getProfilesAsync( AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> callback) throws Exception
	{
		return getProfilesAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingProfile shippingprofile = new ShippingProfile();
	 *	ShippingProfileCollection shippingProfileCollection = shippingprofile.getProfiles( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection getProfiles(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> client = com.mozu.api.clients.commerce.shipping.admin.ShippingProfileClient.getProfilesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingProfile shippingprofile = new ShippingProfile();
	 *	CountDownLatch latch = shippingprofile.getProfiles( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection
	 */
	public CountDownLatch getProfilesAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection> client = com.mozu.api.clients.commerce.shipping.admin.ShippingProfileClient.getProfilesClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



