/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

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
 * Use the Customer Credits resource to manage the store credit associated with a customer account. Store credit can represent a static amount the customer can redeem at any of the tenant's sites, or a gift card registered for a customer account. At this time, gift card functionality is reserved for future use.
 * </summary>
 */
public class CreditClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient=GetCreditsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditCollection creditCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> getCreditsClient() throws Exception
	{
		return getCreditsClient( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient=GetCreditsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditCollection creditCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> getCreditsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.getCreditsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditCollection.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=GetCreditClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> getCreditClient(String code) throws Exception
	{
		return getCreditClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=GetCreditClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> getCreditClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.getCreditUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AddCreditClient( credit);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param credit Properties of the store credit to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> addCreditClient(com.mozu.api.contracts.customer.credit.Credit credit) throws Exception
	{
		return addCreditClient( credit,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AddCreditClient( credit,  userId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param userId 
	 * @param credit Properties of the store credit to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> addCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String userId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.addCreditUrl(responseFields, userId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(credit);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AssociateCreditToShopperClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> associateCreditToShopperClient(String code) throws Exception
	{
		return associateCreditToShopperClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AssociateCreditToShopperClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> associateCreditToShopperClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.associateCreditToShopperUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ResendCreditCreatedEmailClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> resendCreditCreatedEmailClient(String code) throws Exception
	{
		return resendCreditCreatedEmailClient( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=ResendCreditCreatedEmailClient( code,  userId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param userId 
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> resendCreditCreatedEmailClient(String code, String userId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.resendCreditCreatedEmailUrl(code, userId);
		String verb = "PUT";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=UpdateCreditClient( credit,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param credit Properties of the store credit to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> updateCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String code) throws Exception
	{
		return updateCreditClient( credit,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=UpdateCreditClient( credit,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to update.
	 * @param responseFields 
	 * @param credit Properties of the store credit to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> updateCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.updateCreditUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(credit);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteCreditClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code of the store credit to delete.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteCreditClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.deleteCreditUrl(code);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



