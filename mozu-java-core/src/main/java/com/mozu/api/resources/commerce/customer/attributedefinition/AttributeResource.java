/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.attributedefinition;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class AttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public AttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.GetAttributes();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.GetAttributes( startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.customer.attributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.GetAttribute( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.attributedefinition.AttributeClient.getAttributeClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeVocabularyValue attributeVocabularyValue = attribute.GetAttributeVocabularyValues( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @return List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> getAttributeVocabularyValues(String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.customer.attributedefinition.AttributeClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



