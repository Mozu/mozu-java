/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.extensions;

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
public class CredentialStoreEntryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CredentialStoreEntryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	CredentialStoreEntry credentialstoreentry = new CredentialStoreEntry();
	 *	Stream stream = credentialstoreentry.storeCredentials( credentials);
	 * </code></pre></p>
	 * @param credentials 
	 * @return Stream
	 * @see Stream
	 * @see com.mozu.api.contracts.installedapplications.CredentialStoreEntry
	 */
	public java.io.InputStream storeCredentials(com.mozu.api.contracts.installedapplications.CredentialStoreEntry credentials) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.extensions.CredentialStoreEntryClient.storeCredentialsClient( credentials);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	CredentialStoreEntry credentialstoreentry = new CredentialStoreEntry();
	 *	CountDownLatch latch = credentialstoreentry.storeCredentials( credentials, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param credentials 
	 * @return Stream
	 * @see Stream
	 * @see com.mozu.api.contracts.installedapplications.CredentialStoreEntry
	 */
	public CountDownLatch storeCredentialsAsync(com.mozu.api.contracts.installedapplications.CredentialStoreEntry credentials, AsyncCallback<java.io.InputStream> callback) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.platform.extensions.CredentialStoreEntryClient.storeCredentialsClient( credentials);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



