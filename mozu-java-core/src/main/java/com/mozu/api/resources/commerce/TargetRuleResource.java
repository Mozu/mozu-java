/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
public class TargetRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TargetRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRuleCollection targetRuleCollection = targetrule.getTargetRules();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules() throws Exception
	{
		return getTargetRules( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRuleCollection targetRuleCollection = targetrule.getTargetRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.TargetRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRuleCollection> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.getTargetRule( code);
	 * </code></pre></p>
	 * @param code 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(String code) throws Exception
	{
		return getTargetRule( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.getTargetRule( code,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.getTargetRuleClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		return createTargetRule( targetRule,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.createTargetRule( targetRule,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param targetRule 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.createTargetRuleClient( targetRule,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	targetrule.validateTargetRule( targetRule);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param targetRule 
	 * @return 
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public void validateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.TargetRuleClient.validateTargetRuleClient( targetRule);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code);
	 * </code></pre></p>
	 * @param code 
	 * @param dataViewMode DataViewMode
	 * @param targetRule 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code) throws Exception
	{
		return updateTargetRule( targetRule,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	TargetRule targetRule = targetrule.updateTargetRule( targetRule,  code,  responseFields);
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param targetRule 
	 * @return com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 * @see com.mozu.api.contracts.shippingadmin.TargetRule
	 */
	public com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.TargetRule> client = com.mozu.api.clients.commerce.TargetRuleClient.updateTargetRuleClient( targetRule,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TargetRule targetrule = new TargetRule();
	 *	targetrule.deleteTargetRule( code);
	 * </code></pre></p>
	 * @param code 
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteTargetRule(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.TargetRuleClient.deleteTargetRuleClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



