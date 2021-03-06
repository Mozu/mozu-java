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
import com.mozu.api.contracts.productadmin.CategoryDiscountCondition;
import com.mozu.api.contracts.productadmin.CustomerSegment;
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
	 * The coupon code that a shopper uses to redeem an associated discount  on a purchase. This is also the unique identifier of the coupon itself.
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
	 * This allows you to set a maximum order total as a condition of a discount, so the discount only applies when the shopper has an order totaling less than that value. This allows you to have more control over when discounts should or should not apply in order to control costs, especially when combined with a minimum order value to create a range of order values that are eligible for the discount. This can be used in addition to other discount conditions as well.
	 */
	protected  Double maximumOrderAmount;

	public Double getMaximumOrderAmount() {
		return this.maximumOrderAmount;
	}

	public void setMaximumOrderAmount(Double maximumOrderAmount) {
		this.maximumOrderAmount = maximumOrderAmount;
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
	 * This specifies the minimum amount that must be purchased in the combined categories defined in IncludedCategories. This amount is calculated before discounting and it is not used if IncludedCategories is empty.
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
	 * This specifies the minimum quantity of products in the categories specified in IncludedCategories, which must be purchased to qualify for the associated discount. This defaults to 1 if null, and IncludedCategories has values.
	 */
	protected  Integer minimumQuantityProductsRequiredInCategories;

	public Integer getMinimumQuantityProductsRequiredInCategories() {
		return this.minimumQuantityProductsRequiredInCategories;
	}

	public void setMinimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
		this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
	}

	/**
	 * This specifies the minimum quantity of products in the specified IncludedProducts that must be purchased to qualify for the associated discount. This defaults to 1 if null, and IncludedProducts has values.
	 */
	protected  Integer minimumQuantityRequiredProducts;

	public Integer getMinimumQuantityRequiredProducts() {
		return this.minimumQuantityRequiredProducts;
	}

	public void setMinimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
		this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
	}

	/**
	 * minimumRequiredQuantityPerRedemption ApiType DOCUMENT_HERE 
	 */
	protected  Integer minimumRequiredQuantityPerRedemption;

	public Integer getMinimumRequiredQuantityPerRedemption() {
		return this.minimumRequiredQuantityPerRedemption;
	}

	public void setMinimumRequiredQuantityPerRedemption(Integer minimumRequiredQuantityPerRedemption) {
		this.minimumRequiredQuantityPerRedemption = minimumRequiredQuantityPerRedemption;
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

	protected List<CategoryDiscountCondition> categoriesToExcludeFromMinOrderTotal;
	public List<CategoryDiscountCondition> getCategoriesToExcludeFromMinOrderTotal() {
		return this.categoriesToExcludeFromMinOrderTotal;
	}
	public void setCategoriesToExcludeFromMinOrderTotal(List<CategoryDiscountCondition> categoriesToExcludeFromMinOrderTotal) {
		this.categoriesToExcludeFromMinOrderTotal = categoriesToExcludeFromMinOrderTotal;
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

	protected List<ProductDiscountCondition> productsToExcludeFromMinOrderTotal;
	public List<ProductDiscountCondition> getProductsToExcludeFromMinOrderTotal() {
		return this.productsToExcludeFromMinOrderTotal;
	}
	public void setProductsToExcludeFromMinOrderTotal(List<ProductDiscountCondition> productsToExcludeFromMinOrderTotal) {
		this.productsToExcludeFromMinOrderTotal = productsToExcludeFromMinOrderTotal;
	}


}
