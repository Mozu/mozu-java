/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.couponsets;

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
 * Use the AssignedDiscounts resource to manage the discounts assigned to coupon sets.
 * </summary>
 */
public class AssignedDiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AssignedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	AssignedDiscount assigneddiscount = new AssignedDiscount();
	 *	AssignedDiscount assignedDiscount = assigneddiscount.getAssignedDiscounts( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return List<com.mozu.api.contracts.productadmin.AssignedDiscount>
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public List<com.mozu.api.contracts.productadmin.AssignedDiscount> getAssignedDiscounts(String couponSetCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.AssignedDiscountClient.getAssignedDiscountsClient( couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AssignedDiscount assigneddiscount = new AssignedDiscount();
	 *	CountDownLatch latch = assigneddiscount.getAssignedDiscounts( couponSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.productadmin.AssignedDiscount>
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public CountDownLatch getAssignedDiscountsAsync(String couponSetCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.AssignedDiscountClient.getAssignedDiscountsClient( couponSetCode);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AssignedDiscount assigneddiscount = new AssignedDiscount();
	 *	assigneddiscount.assignDiscount( assignedDiscount,  couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param assignedDiscount The details of the discount assigned to the coupon set.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public void assignDiscount(com.mozu.api.contracts.productadmin.AssignedDiscount assignedDiscount, String couponSetCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.couponsets.AssignedDiscountClient.assignDiscountClient( assignedDiscount,  couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AssignedDiscount assigneddiscount = new AssignedDiscount();
	 *	assigneddiscount.unAssignDiscount( couponSetCode,  discountId);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return 
	 */
	public void unAssignDiscount(String couponSetCode, Integer discountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.couponsets.AssignedDiscountClient.unAssignDiscountClient( couponSetCode,  discountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



