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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Applications resource to update site-specific settings for installed applications.
 * </summary>
 */
public class ApplicationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ApplicationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Stream stream = application.thirdPartyGetApplication();
	 * </code></pre></p>
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream thirdPartyGetApplication() throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyGetApplicationClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Stream stream = application.thirdPartyUpdateApplication( application);
	 * </code></pre></p>
	 * @param application Properties of the application to update.
	 * @return Stream
	 * @see Stream
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public java.io.InputStream thirdPartyUpdateApplication(com.mozu.api.contracts.sitesettings.application.Application application) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyUpdateApplicationClient( application);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



