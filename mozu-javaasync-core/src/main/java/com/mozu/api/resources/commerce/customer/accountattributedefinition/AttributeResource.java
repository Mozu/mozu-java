/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accountattributedefinition;

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
 * commerce/customer/accountattributedefinition/attributes related resources. DOCUMENT_HERE 
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
	 *	AttributeCollection attributeCollection = attribute.getAttributes();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributes( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public CountDownLatch getAttributesAsync( AsyncCallback<com.mozu.api.contracts.core.extensible.AttributeCollection> callback) throws Exception
	{
		return getAttributesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public CountDownLatch getAttributesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.AttributeCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeVocabularyValue attributeVocabularyValue = attribute.getAttributeVocabularyValues( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> getAttributeVocabularyValues(String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributeVocabularyValues( attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public CountDownLatch getAttributeVocabularyValuesAsync(String attributeFQN, AsyncCallback<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(String attributeFQN) throws Exception
	{
		return getAttribute( attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttribute( attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch getAttributeAsync(String attributeFQN, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		return getAttributeAsync( attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributeClient( attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttribute( attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch getAttributeAsync(String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.getAttributeClient( attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.createAttribute( attribute);
	 * </code></pre></p>
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute createAttribute(com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		return createAttribute( attribute,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.createAttribute( attribute, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch createAttributeAsync(com.mozu.api.contracts.core.extensible.Attribute attribute, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		return createAttributeAsync( attribute,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.createAttribute( attribute,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute createAttribute(com.mozu.api.contracts.core.extensible.Attribute attribute, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.createAttributeClient( attribute,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.createAttribute( attribute,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch createAttributeAsync(com.mozu.api.contracts.core.extensible.Attribute attribute, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.createAttributeClient( attribute,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.updateAttribute( attribute,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute updateAttribute(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttribute( attribute,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.updateAttribute( attribute,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch updateAttributeAsync(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		return updateAttributeAsync( attribute,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.updateAttribute( attribute,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute updateAttribute(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.updateAttributeClient( attribute,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.updateAttribute( attribute,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute 
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch updateAttributeAsync(com.mozu.api.contracts.core.extensible.Attribute attribute, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.customer.accountattributedefinition.AttributeClient.updateAttributeClient( attribute,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



