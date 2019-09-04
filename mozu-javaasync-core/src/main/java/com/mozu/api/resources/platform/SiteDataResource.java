/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

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
 * Use the site data resource to store site-level information required for a third-party application in the Mozu database.
 * </summary>
 */
public class SiteDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SiteDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	string string = sitedata.getDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery) throws Exception
	{
		return getDBValue( dbEntryQuery,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	CountDownLatch latch = sitedata.getDBValue( dbEntryQuery, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getDBValueAsync(String dbEntryQuery, AsyncCallback<String> callback) throws Exception
	{
		return getDBValueAsync( dbEntryQuery,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	string string = sitedata.getDBValue( dbEntryQuery,  responseFields);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param responseFields 
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery, String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.platform.SiteDataClient.getDBValueClient( dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	CountDownLatch latch = sitedata.getDBValue( dbEntryQuery,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getDBValueAsync(String dbEntryQuery, String responseFields, AsyncCallback<String> callback) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.platform.SiteDataClient.getDBValueClient( dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	Stream stream = sitedata.createDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream createDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.createDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	CountDownLatch latch = sitedata.createDBValue( value,  dbEntryQuery, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param  callback callback handler for asynchronous operations
	 * @param value The value string to create.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public CountDownLatch createDBValueAsync(String value, String dbEntryQuery, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.createDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	Stream stream = sitedata.updateDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param value The database value to update.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public java.io.InputStream updateDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.updateDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	CountDownLatch latch = sitedata.updateDBValue( value,  dbEntryQuery, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param  callback callback handler for asynchronous operations
	 * @param value The database value to update.
	 * @return Stream
	 * @see Stream
	 * @see string
	 */
	public CountDownLatch updateDBValueAsync(String value, String dbEntryQuery, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.updateDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	Stream stream = sitedata.deleteDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream deleteDBValue(String dbEntryQuery) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.deleteDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	CountDownLatch latch = sitedata.deleteDBValue( dbEntryQuery, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @param  callback callback handler for asynchronous operations
	 * @return Stream
	 * @see Stream
	 */
	public CountDownLatch deleteDBValueAsync(String dbEntryQuery, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.SiteDataClient.deleteDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



