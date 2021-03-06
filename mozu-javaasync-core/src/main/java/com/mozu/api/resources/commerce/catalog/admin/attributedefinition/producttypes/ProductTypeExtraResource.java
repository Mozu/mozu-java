/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Extras subresource to define how a product attribute classified as an "extra" is used for a specific product type. Product attribute defintions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeExtraResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductTypeExtraResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductTypeExtraResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.getExtras( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeInProductType> getExtras(Integer productTypeId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.getExtrasClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.getExtras( productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getExtrasAsync(Integer productTypeId, AsyncCallback<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.getExtrasClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.getExtra( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getExtra(Integer productTypeId, String attributeFQN) throws Exception
	{
		return getExtra( productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.getExtra( productTypeId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getExtraAsync(Integer productTypeId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return getExtraAsync( productTypeId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.getExtra( productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getExtra(Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.getExtraClient(_dataViewMode,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.getExtra( productTypeId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getExtraAsync(Integer productTypeId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.getExtraClient(_dataViewMode,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.addExtra( attributeInProductType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addExtra(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		return addExtra( attributeInProductType,  productTypeId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.addExtra( attributeInProductType,  productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch addExtraAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return addExtraAsync( attributeInProductType,  productTypeId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.addExtra( attributeInProductType,  productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addExtra(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.addExtraClient(_dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.addExtra( attributeInProductType,  productTypeId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch addExtraAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.addExtraClient(_dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.updateExtra( attributeInProductType,  productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateExtra(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		return updateExtra( attributeInProductType,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.updateExtra( attributeInProductType,  productTypeId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch updateExtraAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return updateExtraAsync( attributeInProductType,  productTypeId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	AttributeInProductType attributeInProductType = producttypeextra.updateExtra( attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateExtra(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.updateExtraClient(_dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	CountDownLatch latch = producttypeextra.updateExtra( attributeInProductType,  productTypeId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of an attribute definition associated with a specific product type. When an attribute is applied to a product type, each product of that type maintains the same set of attributes.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch updateExtraAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.updateExtraClient(_dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeExtra producttypeextra = new ProductTypeExtra();
	 *	producttypeextra.deleteExtra( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteExtra(Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraClient.deleteExtraClient(_dataViewMode,  productTypeId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



