/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

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
 * 
 * </summary>
 */
public class ReturnSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ReturnSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.getReturnSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings getReturnSettings() throws Exception
	{
		return getReturnSettings( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.getReturnSettings( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch getReturnSettingsAsync( AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		return getReturnSettingsAsync( null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.getReturnSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings getReturnSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.getReturnSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.getReturnSettings( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch getReturnSettingsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.getReturnSettingsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.createReturnSettings( returnSettings);
	 * </code></pre></p>
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings createReturnSettings(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings) throws Exception
	{
		return createReturnSettings( returnSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.createReturnSettings( returnSettings, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch createReturnSettingsAsync(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		return createReturnSettingsAsync( returnSettings,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.createReturnSettings( returnSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings createReturnSettings(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.createReturnSettingsClient( returnSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.createReturnSettings( returnSettings,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch createReturnSettingsAsync(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.createReturnSettingsClient( returnSettings,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.updateReturnSettings( returnSettings);
	 * </code></pre></p>
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings updateReturnSettings(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings) throws Exception
	{
		return updateReturnSettings( returnSettings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.updateReturnSettings( returnSettings, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch updateReturnSettingsAsync(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		return updateReturnSettingsAsync( returnSettings,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	ReturnSettings returnSettings = returnsettings.updateReturnSettings( returnSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings updateReturnSettings(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.updateReturnSettingsClient( returnSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ReturnSettings returnsettings = new ReturnSettings();
	 *	CountDownLatch latch = returnsettings.updateReturnSettings( returnSettings,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param returnSettings 
	 * @return com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 * @see com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings
	 */
	public CountDownLatch updateReturnSettingsAsync(com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings returnSettings, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.returns.ReturnSettings> client = com.mozu.api.clients.commerce.settings.ReturnSettingsClient.updateReturnSettingsClient( returnSettings,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}


