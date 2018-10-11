/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes;

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
 * Type rules are subresources of product attributes which could be specifications that can be shared across products in a store or assigned to specific products. Attribute type rules provide definitions of how attribute types will appear on the user interface.
 * </summary>
 */
public class AttributeTypeRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AttributeTypeRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	AttributeTypeRule attributetyperule = new AttributeTypeRule();
	 *	AttributeTypeRuleCollection attributeTypeRuleCollection = attributetyperule.getAttributeTypeRules();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules() throws Exception
	{
		return getAttributeTypeRules( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	AttributeTypeRule attributetyperule = new AttributeTypeRule();
	 *	AttributeTypeRuleCollection attributeTypeRuleCollection = attributetyperule.getAttributeTypeRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes.AttributeTypeRuleClient.getAttributeTypeRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



