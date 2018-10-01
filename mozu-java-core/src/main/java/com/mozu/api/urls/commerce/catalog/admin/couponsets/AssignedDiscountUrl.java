/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.couponsets;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AssignedDiscountUrl
{

	/**
	 * Get Resource Url for GetAssignedDiscounts
	 * @param couponSetCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAssignedDiscountsUrl(String couponSetCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts");
		formatter.formatUrl("couponSetCode", couponSetCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AssignDiscount
	 * @param couponSetCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl assignDiscountUrl(String couponSetCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts");
		formatter.formatUrl("couponSetCode", couponSetCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UnAssignDiscount
	 * @param couponSetCode 
	 * @param discountId 
	 * @return   String Resource Url
	 */
	public static MozuUrl unAssignDiscountUrl(String couponSetCode, Integer discountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts/{discountId}");
		formatter.formatUrl("couponSetCode", couponSetCode);
		formatter.formatUrl("discountId", discountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

