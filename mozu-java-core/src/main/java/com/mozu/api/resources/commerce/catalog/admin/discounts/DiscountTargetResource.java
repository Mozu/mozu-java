/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.discounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public DiscountTargetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.GetDiscountTarget(dataViewMode,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget getDiscountTarget(com.mozu.api.DataViewMode dataViewMode, Integer discountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.getDiscountTargetClient(dataViewMode,  discountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 *	DiscountTarget discounttarget = new DiscountTarget();
	 *	DiscountTarget discountTarget = discounttarget.UpdateDiscountTarget(dataViewMode,  discountTarget,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param discountTarget Properties of the discount target to modify. Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false.
	 * @return com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public com.mozu.api.contracts.productadmin.DiscountTarget updateDiscountTarget(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> client = com.mozu.api.clients.commerce.catalog.admin.discounts.DiscountTargetClient.updateDiscountTargetClient(dataViewMode,  discountTarget,  discountId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



