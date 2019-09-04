/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin.profiles;

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
public class ShippingInclusionRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingInclusionRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.getShippingInclusionRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule getShippingInclusionRule(String profilecode, String id) throws Exception
	{
		return getShippingInclusionRule( profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.getShippingInclusionRule( profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule getShippingInclusionRule(String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRuleClient( profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRuleCollection shippingInclusionRuleCollection = shippinginclusionrule.getShippingInclusionRules( profilecode);
	 * </code></pre></p>
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection getShippingInclusionRules(String profilecode) throws Exception
	{
		return getShippingInclusionRules( profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRuleCollection shippingInclusionRuleCollection = shippinginclusionrule.getShippingInclusionRules( profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection getShippingInclusionRules(String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.getShippingInclusionRulesClient( profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode);
	 * </code></pre></p>
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule createShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode) throws Exception
	{
		return createShippingInclusionRule( rule,  profilecode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.createShippingInclusionRule( rule,  profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule createShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.createShippingInclusionRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id);
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule updateShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id) throws Exception
	{
		return updateShippingInclusionRule( rule,  profilecode,  id,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	ShippingInclusionRule shippingInclusionRule = shippinginclusionrule.updateShippingInclusionRule( rule,  profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param rule 
	 * @return com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule updateShippingInclusionRule(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.updateShippingInclusionRuleClient( rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ShippingInclusionRule shippinginclusionrule = new ShippingInclusionRule();
	 *	Stream stream = shippinginclusionrule.deleteShippingInclusionRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id 
	 * @param profilecode 
	 * @param dataViewMode DataViewMode
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteShippingInclusionRule(String profilecode, String id) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.shipping.admin.profiles.ShippingInclusionRuleClient.deleteShippingInclusionRuleClient( profilecode,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



