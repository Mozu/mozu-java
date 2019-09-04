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
 * Use the Options subresource to define how an option attribute is used for a specific product type. Product attribute definitions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeOptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductTypeOptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductTypeOptionResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.getOptions( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public List<com.mozu.api.contracts.productadmin.AttributeInProductType> getOptions(Integer productTypeId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.getOptionsClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.getOptions( productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return List<com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getOptionsAsync(Integer productTypeId, AsyncCallback<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.getOptionsClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.getOption( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getOption(Integer productTypeId, String attributeFQN) throws Exception
	{
		return getOption( productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.getOption( productTypeId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getOptionAsync(Integer productTypeId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return getOptionAsync( productTypeId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.getOption( productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType getOption(Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.getOptionClient(_dataViewMode,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.getOption( productTypeId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId The identifier of the product type.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch getOptionAsync(Integer productTypeId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.getOptionClient(_dataViewMode,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.addOption( attributeInProductType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addOption(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		return addOption( attributeInProductType,  productTypeId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.addOption( attributeInProductType,  productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch addOptionAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return addOptionAsync( attributeInProductType,  productTypeId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.addOption( attributeInProductType,  productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType addOption(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.addOptionClient(_dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.addOption( attributeInProductType,  productTypeId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch addOptionAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.addOptionClient(_dataViewMode,  attributeInProductType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.updateOption( attributeInProductType,  productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateOption(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		return updateOption( attributeInProductType,  productTypeId,  attributeFQN,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.updateOption( attributeInProductType,  productTypeId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch updateOptionAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		return updateOptionAsync( attributeInProductType,  productTypeId,  attributeFQN,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	AttributeInProductType attributeInProductType = producttypeoption.updateOption( attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public com.mozu.api.contracts.productadmin.AttributeInProductType updateOption(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.updateOptionClient(_dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.updateOption( attributeInProductType,  productTypeId,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	 * @return com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public CountDownLatch updateOptionAsync(com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.AttributeInProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.updateOptionClient(_dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	Stream stream = producttypeoption.deleteOption( productTypeId,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteOption(Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.deleteOptionClient(_dataViewMode,  productTypeId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductTypeOption producttypeoption = new ProductTypeOption();
	 *	CountDownLatch latch = producttypeoption.deleteOption( productTypeId,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch deleteOptionAsync(Integer productTypeId, String attributeFQN, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionClient.deleteOptionClient(_dataViewMode,  productTypeId,  attributeFQN);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



