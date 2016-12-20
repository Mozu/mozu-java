/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.CustomerSegment;
import com.mozu.api.contracts.productadmin.CategoryDiscountCondition;
import com.mozu.api.contracts.productadmin.ProductDiscountCondition;

/**
 *	Properties of the conditions that must be met for a discount to apply to an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountCondition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Code of a discount coupon. This code can be used by a shopper when a coupon code is required to earn the associated discount on a purchase.
	 */
	protected  String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * Date and time in UTC format when a discount, credit, wish list, or cart expires. An expired discount no longer can be redeemed. An expired wish list is no longer available. An expired credit can no longer be redeemed for a purchase. Acart becomes inactive and expired based on a system-calculated interval. For example, if an anonymous shopper has 14 days of inactivity, the cart is considered abandoned after that period of inactivity. System-supplied and read-only.
	 */
	protected  DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * List of payment types that trigger this discount to be valid.
	 */
	protected List<String> includedPaymentWorkflows;
	public List<String> getIncludedPaymentWorkflows() {
		return this.includedPaymentWorkflows;
	}
	public void setIncludedPaymentWorkflows(List<String> includedPaymentWorkflows) {
		this.includedPaymentWorkflows = includedPaymentWorkflows;
	}

	/**
	 * The maximum number of times the discount can be redeemed.
	 */
	protected  Integer maxRedemptionCount;

	public Integer getMaxRedemptionCount() {
		return this.maxRedemptionCount;
	}

	public void setMaxRedemptionCount(Integer maxRedemptionCount) {
		this.maxRedemptionCount = maxRedemptionCount;
	}

	/**
	 * This pecifies the minimum amount that must be purchased in the combined categories defined in IncludedCategories. This amount is calculated before discounting and it is not used if IncludedCategories is empty.
	 */
	protected  Double minimumCategorySubtotalBeforeDiscounts;

	public Double getMinimumCategorySubtotalBeforeDiscounts() {
		return this.minimumCategorySubtotalBeforeDiscounts;
	}

	public void setMinimumCategorySubtotalBeforeDiscounts(Double minimumCategorySubtotalBeforeDiscounts) {
		this.minimumCategorySubtotalBeforeDiscounts = minimumCategorySubtotalBeforeDiscounts;
	}

	/**
	 * The minimum customer lifetime value amount required to redeem this discount.
	 */
	protected  Double minimumLifetimeValueAmount;

	public Double getMinimumLifetimeValueAmount() {
		return this.minimumLifetimeValueAmount;
	}

	public void setMinimumLifetimeValueAmount(Double minimumLifetimeValueAmount) {
		this.minimumLifetimeValueAmount = minimumLifetimeValueAmount;
	}

	/**
	 * The minimum order amount required to redeem this discount.
	 */
	protected  Double minimumOrderAmount;

	public Double getMinimumOrderAmount() {
		return this.minimumOrderAmount;
	}

	public void setMinimumOrderAmount(Double minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}

	/**
	 * This specifies the minimum quantity of products in the categories specified in IncludedCategories, which must be purchased to qualify for the associated discount. This defaults to 1 if  null, and IncludedCategories has values.
	 */
	protected  Integer minimumQuantityProductsRequiredInCategories;

	public Integer getMinimumQuantityProductsRequiredInCategories() {
		return this.minimumQuantityProductsRequiredInCategories;
	}

	public void setMinimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
		this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
	}

	/**
	 * This specifies the minimum quantity of products in the specified IncludedProducts that must be purchased to qualify for the associated discount. This defaults to 1 if  null, and IncludedProducts has values.
	 */
	protected  Integer minimumQuantityRequiredProducts;

	public Integer getMinimumQuantityRequiredProducts() {
		return this.minimumQuantityRequiredProducts;
	}

	public void setMinimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
		this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
	}

	/**
	 * If true, only authenticated users can redeem the discount. If false, anonymous users can redeem the discount.
	 */
	protected  Boolean requiresAuthenticatedUser;

	public Boolean getRequiresAuthenticatedUser() {
		return this.requiresAuthenticatedUser;
	}

	public void setRequiresAuthenticatedUser(Boolean requiresAuthenticatedUser) {
		this.requiresAuthenticatedUser = requiresAuthenticatedUser;
	}

	/**
	 * If true, redemption of this discount requires entry of a coupon code.
	 */
	protected  Boolean requiresCoupon;

	public Boolean getRequiresCoupon() {
		return this.requiresCoupon;
	}

	public void setRequiresCoupon(Boolean requiresCoupon) {
		this.requiresCoupon = requiresCoupon;
	}

	/**
	 * The earliest date and time this discount can be redeemed.
	 */
	protected  DateTime startDate;

	public DateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * List of customer segments associated with the discount. Shoppers who are members of an associated customer segment can redeem this discount.
	 */
	protected List<CustomerSegment> customerSegments;
	public List<CustomerSegment> getCustomerSegments() {
		return this.customerSegments;
	}
	public void setCustomerSegments(List<CustomerSegment> customerSegments) {
		this.customerSegments = customerSegments;
	}

	/**
	 * List of the product categories that are not eligible for the discount.
	 */
	protected List<CategoryDiscountCondition> excludedCategories;
	public List<CategoryDiscountCondition> getExcludedCategories() {
		return this.excludedCategories;
	}
	public void setExcludedCategories(List<CategoryDiscountCondition> excludedCategories) {
		this.excludedCategories = excludedCategories;
	}

	/**
	 * List of products that are not eligible for the discount.
	 */
	protected List<ProductDiscountCondition> excludedProducts;
	public List<ProductDiscountCondition> getExcludedProducts() {
		return this.excludedProducts;
	}
	public void setExcludedProducts(List<ProductDiscountCondition> excludedProducts) {
		this.excludedProducts = excludedProducts;
	}

	/**
	 * List of product categories that are eligible for the discount.
	 */
	protected List<CategoryDiscountCondition> includedCategories;
	public List<CategoryDiscountCondition> getIncludedCategories() {
		return this.includedCategories;
	}
	public void setIncludedCategories(List<CategoryDiscountCondition> includedCategories) {
		this.includedCategories = includedCategories;
	}

	/**
	 * List of products that are eligible for the discount.
	 */
	protected List<ProductDiscountCondition> includedProducts;
	public List<ProductDiscountCondition> getIncludedProducts() {
		return this.includedProducts;
	}
	public void setIncludedProducts(List<ProductDiscountCondition> includedProducts) {
		this.includedProducts = includedProducts;
	}


}
