/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

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
 * 
 * </summary>
 */
public class DiscountSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DiscountSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DiscountSettingsResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	DiscountSettings discountSettings = discountsettings.getDiscountSettings( catalogId);
	 * </code></pre></p>
	 * @param catalogId 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public com.mozu.api.contracts.productadmin.DiscountSettings getDiscountSettings(Integer catalogId) throws Exception
	{
		return getDiscountSettings( catalogId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	CountDownLatch latch = discountsettings.getDiscountSettings( catalogId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param catalogId 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public CountDownLatch getDiscountSettingsAsync(Integer catalogId, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountSettings> callback) throws Exception
	{
		return getDiscountSettingsAsync( catalogId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	DiscountSettings discountSettings = discountsettings.getDiscountSettings( catalogId,  responseFields);
	 * </code></pre></p>
	 * @param catalogId 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public com.mozu.api.contracts.productadmin.DiscountSettings getDiscountSettings(Integer catalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountSettings> client = com.mozu.api.clients.commerce.catalog.admin.DiscountSettingsClient.getDiscountSettingsClient(_dataViewMode,  catalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	CountDownLatch latch = discountsettings.getDiscountSettings( catalogId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param catalogId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public CountDownLatch getDiscountSettingsAsync(Integer catalogId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountSettings> client = com.mozu.api.clients.commerce.catalog.admin.DiscountSettingsClient.getDiscountSettingsClient(_dataViewMode,  catalogId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	DiscountSettings discountSettings = discountsettings.updateDiscountSettings( discountSettings,  catalogId);
	 * </code></pre></p>
	 * @param catalogId 
	 * @param dataViewMode DataViewMode
	 * @param discountSettings 
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public com.mozu.api.contracts.productadmin.DiscountSettings updateDiscountSettings(com.mozu.api.contracts.productadmin.DiscountSettings discountSettings, Integer catalogId) throws Exception
	{
		return updateDiscountSettings( discountSettings,  catalogId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	CountDownLatch latch = discountsettings.updateDiscountSettings( discountSettings,  catalogId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param catalogId 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param discountSettings 
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public CountDownLatch updateDiscountSettingsAsync(com.mozu.api.contracts.productadmin.DiscountSettings discountSettings, Integer catalogId, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountSettings> callback) throws Exception
	{
		return updateDiscountSettingsAsync( discountSettings,  catalogId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	DiscountSettings discountSettings = discountsettings.updateDiscountSettings( discountSettings,  catalogId,  responseFields);
	 * </code></pre></p>
	 * @param catalogId 
	 * @param responseFields 
	 * @param dataViewMode DataViewMode
	 * @param discountSettings 
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public com.mozu.api.contracts.productadmin.DiscountSettings updateDiscountSettings(com.mozu.api.contracts.productadmin.DiscountSettings discountSettings, Integer catalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountSettings> client = com.mozu.api.clients.commerce.catalog.admin.DiscountSettingsClient.updateDiscountSettingsClient( discountSettings,  catalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DiscountSettings discountsettings = new DiscountSettings();
	 *	CountDownLatch latch = discountsettings.updateDiscountSettings( discountSettings,  catalogId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param catalogId 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param discountSettings 
	 * @return com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 * @see com.mozu.api.contracts.productadmin.DiscountSettings
	 */
	public CountDownLatch updateDiscountSettingsAsync(com.mozu.api.contracts.productadmin.DiscountSettings discountSettings, Integer catalogId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.DiscountSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountSettings> client = com.mozu.api.clients.commerce.catalog.admin.DiscountSettingsClient.updateDiscountSettingsClient( discountSettings,  catalogId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



