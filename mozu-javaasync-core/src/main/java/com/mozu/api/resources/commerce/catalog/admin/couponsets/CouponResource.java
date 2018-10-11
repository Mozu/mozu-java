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
 * Use the Coupons subresource to manage coupons within manual coupon sets.
 * </summary>
 */
public class CouponResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CouponResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	Coupon coupon = coupon.getCoupon( couponSetCode,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return com.mozu.api.contracts.productadmin.Coupon
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public com.mozu.api.contracts.productadmin.Coupon getCoupon(String couponSetCode, String couponCode) throws Exception
	{
		return getCoupon( couponSetCode,  couponCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CountDownLatch latch = coupon.getCoupon( couponSetCode,  couponCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.Coupon
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public CountDownLatch getCouponAsync(String couponSetCode, String couponCode, AsyncCallback<com.mozu.api.contracts.productadmin.Coupon> callback) throws Exception
	{
		return getCouponAsync( couponSetCode,  couponCode,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	Coupon coupon = coupon.getCoupon( couponSetCode,  couponCode,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param includeCounts Specifies whether to return the redemptionCount property in the response body object.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productadmin.Coupon
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public com.mozu.api.contracts.productadmin.Coupon getCoupon(String couponSetCode, String couponCode, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Coupon> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.getCouponClient( couponSetCode,  couponCode,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CountDownLatch latch = coupon.getCoupon( couponSetCode,  couponCode,  includeCounts,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param includeCounts Specifies whether to return the redemptionCount property in the response body object.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.Coupon
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public CountDownLatch getCouponAsync(String couponSetCode, String couponCode, Boolean includeCounts, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.Coupon> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Coupon> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.getCouponClient( couponSetCode,  couponCode,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CouponCollection couponCollection = coupon.getCoupons( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @return com.mozu.api.contracts.productadmin.CouponCollection
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponCollection getCoupons(String couponSetCode) throws Exception
	{
		return getCoupons( couponSetCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CountDownLatch latch = coupon.getCoupons( couponSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponCollection
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public CountDownLatch getCouponsAsync(String couponSetCode, AsyncCallback<com.mozu.api.contracts.productadmin.CouponCollection> callback) throws Exception
	{
		return getCouponsAsync( couponSetCode,  null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CouponCollection couponCollection = coupon.getCoupons( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the redemptionCount property in the response body object.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productadmin.CouponCollection
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponCollection getCoupons(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.getCouponsClient( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	CountDownLatch latch = coupon.getCoupons( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the redemptionCount property in the response body object.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponCollection
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public CountDownLatch getCouponsAsync(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.getCouponsClient( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	coupon.addCoupons( coupons,  couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param coupons The details necessary to assign the discount to a coupon set, including .
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public void addCoupons(List<com.mozu.api.contracts.productadmin.Coupon> coupons, String couponSetCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.addCouponsClient( coupons,  couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	coupon.deleteCoupons( couponCodes,  couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param couponCodes The unique identifiers of the coupons to delete.
	 * @return 
	 * @see string
	 */
	public void deleteCoupons(List<String> couponCodes, String couponSetCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.deleteCouponsClient( couponCodes,  couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Coupon coupon = new Coupon();
	 *	coupon.deleteCoupon( couponSetCode,  couponCode);
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return 
	 */
	public void deleteCoupon(String couponSetCode, String couponCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.couponsets.CouponClient.deleteCouponClient( couponSetCode,  couponCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



