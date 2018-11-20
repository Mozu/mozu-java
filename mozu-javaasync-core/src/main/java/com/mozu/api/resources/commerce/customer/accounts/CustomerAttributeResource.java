/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

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
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		return getAccountAttribute( accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.getAccountAttribute( accountId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch getAccountAttributeAsync(Integer accountId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		return getAccountAttributeAsync( accountId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributeClient( accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.getAccountAttribute( accountId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch getAccountAttributeAsync(Integer accountId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributeClient( accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId) throws Exception
	{
		return getAccountAttributes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.getAccountAttributes( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public CountDownLatch getAccountAttributesAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttributeCollection> callback) throws Exception
	{
		return getAccountAttributesAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.getAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public CountDownLatch getAccountAttributesAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttributeCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute The attribute to add to the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addAccountAttribute( attribute,  accountId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.addAccountAttribute( attribute,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute The attribute to add to the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch addAccountAttributeAsync(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		return addAccountAttributeAsync( attribute,  accountId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param attribute The attribute to add to the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.addAccountAttributeClient( attribute,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.addAccountAttribute( attribute,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute The attribute to add to the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch addAccountAttributeAsync(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.addAccountAttributeClient( attribute,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param attribute Properties of the customer account attribute to update.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateAccountAttribute( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute Properties of the customer account attribute to update.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch updateAccountAttributeAsync(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		return updateAccountAttributeAsync( attribute,  accountId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param attribute Properties of the customer account attribute to update.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CountDownLatch latch = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param attribute Properties of the customer account attribute to update.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public CountDownLatch updateAccountAttributeAsync(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerAttribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	customerattribute.deleteAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN 
	 * @return 
	 */
	public void deleteAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.deleteAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



