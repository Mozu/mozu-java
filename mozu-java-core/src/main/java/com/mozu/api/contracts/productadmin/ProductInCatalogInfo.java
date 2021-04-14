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
import com.mozu.api.contracts.productadmin.ActiveDateRange;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductLocalizedSEOContent;

/**
 *	Properties of a product associated with a specific catalog.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInCatalogInfo implements Serializable
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
	 * Date this product was first Available for sale in the catalog. This is utilized in expressions that refrence DaysInCatloag.
	 */
	protected  DateTime dateFirstAvailableInCatalog;

	public DateTime getDateFirstAvailableInCatalog() {
		return this.dateFirstAvailableInCatalog;
	}

	public void setDateFirstAvailableInCatalog(DateTime dateFirstAvailableInCatalog) {
		this.dateFirstAvailableInCatalog = dateFirstAvailableInCatalog;
	}

	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	protected  Boolean isContentOverridden;

	public Boolean getIsContentOverridden() {
		return this.isContentOverridden;
	}

	public void setIsContentOverridden(Boolean isContentOverridden) {
		this.isContentOverridden = isContentOverridden;
	}

	protected  Boolean isPriceOverridden;

	public Boolean getIsPriceOverridden() {
		return this.isPriceOverridden;
	}

	public void setIsPriceOverridden(Boolean isPriceOverridden) {
		this.isPriceOverridden = isPriceOverridden;
	}

	protected  Boolean isSeoContentOverridden;

	public Boolean getIsSeoContentOverridden() {
		return this.isSeoContentOverridden;
	}

	public void setIsSeoContentOverridden(Boolean isSeoContentOverridden) {
		this.isSeoContentOverridden = isSeoContentOverridden;
	}

	/**
	 * If true, the product is marked as available for sale in the catalog. Setting a product to IsActive = false will prevent it from being shown on the customer facing storefront.
	 */
	protected  ActiveDateRange activeDateRange;

	public ActiveDateRange getActiveDateRange() {
		return this.activeDateRange;
	}

	public void setActiveDateRange(ActiveDateRange activeDateRange) {
		this.activeDateRange = activeDateRange;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected  ProductLocalizedContent content;

	public ProductLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductLocalizedContent content) {
		this.content = content;
	}

	protected  ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * Specifies which static category to use in the navigation breadcrumb, regardless of how shoppers navigate to the product. If not set, or if the product belongs only to dynamic categories, the default is to use the category with the smallest ID.
	 */
	protected  ProductCategory primaryProductCategory;

	public ProductCategory getPrimaryProductCategory() {
		return this.primaryProductCategory;
	}

	public void setPrimaryProductCategory(ProductCategory primaryProductCategory) {
		this.primaryProductCategory = primaryProductCategory;
	}

	protected List<ProductCategory> productCategories;
	public List<ProductCategory> getProductCategories() {
		return this.productCategories;
	}
	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	protected  ProductLocalizedSEOContent seoContent;

	public ProductLocalizedSEOContent getSeoContent() {
		return this.seoContent;
	}

	public void setSeoContent(ProductLocalizedSEOContent seoContent) {
		this.seoContent = seoContent;
	}


}
