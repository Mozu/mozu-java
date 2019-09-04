/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

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
public class AutoAddDiscountTargetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AutoAddDiscountTargetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	AutoAddDiscountTarget autoadddiscounttarget = new AutoAddDiscountTarget();
	 *	AutoAddDiscountTarget autoAddDiscountTarget = autoadddiscounttarget.getAutoAddTarget( discountId);
	 * </code></pre></p>
	 * @param discountId 
	 * @return com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget
	 * @see com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget
	 */
	public com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget getAutoAddTarget(Integer discountId) throws Exception
	{
		return getAutoAddTarget( discountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AutoAddDiscountTarget autoadddiscounttarget = new AutoAddDiscountTarget();
	 *	AutoAddDiscountTarget autoAddDiscountTarget = autoadddiscounttarget.getAutoAddTarget( discountId,  responseFields);
	 * </code></pre></p>
	 * @param discountId 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget
	 * @see com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget
	 */
	public com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget getAutoAddTarget(Integer discountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.pricingruntime.AutoAddDiscountTarget> client = com.mozu.api.clients.commerce.catalog.storefront.AutoAddDiscountTargetClient.getAutoAddTargetClient( discountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



