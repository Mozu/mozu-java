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
 * Use the site data resource to store site-level information required for a third-party application in the  database.
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
	 * @param dbEntryQuery The database entry string to create.
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
	 * @param dbEntryQuery The database entry string to create.
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
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 * @param dbEntryQuery The database entry string to create.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
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
	 *	sitedata.createDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return 
	 * @see string
	 */
	public void createDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.createDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	sitedata.updateDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return 
	 * @see string
	 */
	public void updateDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.updateDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	sitedata.deleteDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @return 
	 */
	public void deleteDBValue(String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.deleteDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



