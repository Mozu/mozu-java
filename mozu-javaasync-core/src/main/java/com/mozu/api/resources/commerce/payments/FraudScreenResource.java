/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.payments;

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
 * commerce/payments/fraudscreen related resources. DOCUMENT_HERE 
 * </summary>
 */
public class FraudScreenResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FraudScreenResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * payments-fraudscreen Post Screen description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	FraudScreen fraudscreen = new FraudScreen();
	 *	FraudScreen fraudScreen = fraudscreen.screen( request);
	 * </code></pre></p>
	 * @param request Mozu.PaymentService.Contracts.Request.FraudScreenRequest ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.FraudScreen
	 * @see com.mozu.api.contracts.paymentservice.response.FraudScreen
	 * @see com.mozu.api.contracts.paymentservice.request.FraudScreenRequest
	 */
	public com.mozu.api.contracts.paymentservice.response.FraudScreen screen(com.mozu.api.contracts.paymentservice.request.FraudScreenRequest request) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.FraudScreen> client = com.mozu.api.clients.commerce.payments.FraudScreenClient.screenClient( request);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * payments-fraudscreen Post Screen description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	FraudScreen fraudscreen = new FraudScreen();
	 *	CountDownLatch latch = fraudscreen.screen( request, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param request Mozu.PaymentService.Contracts.Request.FraudScreenRequest ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.paymentservice.response.FraudScreen
	 * @see com.mozu.api.contracts.paymentservice.response.FraudScreen
	 * @see com.mozu.api.contracts.paymentservice.request.FraudScreenRequest
	 */
	public CountDownLatch screenAsync(com.mozu.api.contracts.paymentservice.request.FraudScreenRequest request, AsyncCallback<com.mozu.api.contracts.paymentservice.response.FraudScreen> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.FraudScreen> client = com.mozu.api.clients.commerce.payments.FraudScreenClient.screenClient( request);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



