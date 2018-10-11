/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.CategoryLocalizedContent;
import com.mozu.api.contracts.productadmin.DynamicExpression;

/**
 *	A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer catalogId;

	public Integer getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	/**
	 * External unique identifier of the category.
	 */
	protected  String categoryCode;

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * Specifies the type of category. The following are the valid values:* * * 
	 */
	protected  String categoryType;

	public String getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	protected  Integer childCount;

	public Integer getChildCount() {
		return this.childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object or feature is active.
	 */
	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	protected  Boolean isDisplayed;

	public Boolean getIsDisplayed() {
		return this.isDisplayed;
	}

	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	/**
	 * The code of the current category's parent category.
	 */
	protected  String parentCategoryCode;

	public String getParentCategoryCode() {
		return this.parentCategoryCode;
	}

	public void setParentCategoryCode(String parentCategoryCode) {
		this.parentCategoryCode = parentCategoryCode;
	}

	protected  Integer parentCategoryId;

	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * If the current category has a parent, the name of the category's parent category.
	 */
	protected  String parentCategoryName;

	public String getParentCategoryName() {
		return this.parentCategoryName;
	}

	public void setParentCategoryName(String parentCategoryName) {
		this.parentCategoryName = parentCategoryName;
	}

	/**
	 * Indicates whether the parent category is active.
	 */
	protected  Boolean parentIsActive;

	public Boolean getParentIsActive() {
		return this.parentIsActive;
	}

	public void setParentIsActive(Boolean parentIsActive) {
		this.parentIsActive = parentIsActive;
	}

	protected  Integer productCount;

	public Integer getProductCount() {
		return this.productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	protected  Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  CategoryLocalizedContent content;

	public CategoryLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(CategoryLocalizedContent content) {
		this.content = content;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Category dynamicExpression ApiTypeMember DOCUMENT_HERE 
	 */
	protected  DynamicExpression dynamicExpression;

	public DynamicExpression getDynamicExpression() {
		return this.dynamicExpression;
	}

	public void setDynamicExpression(DynamicExpression dynamicExpression) {
		this.dynamicExpression = dynamicExpression;
	}


}
