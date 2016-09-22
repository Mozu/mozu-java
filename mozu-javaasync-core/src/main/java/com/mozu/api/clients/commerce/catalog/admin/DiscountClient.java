/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Define and manage discounts to apply to products, product categories, or orders. The discounts can be a specified amount off the price, percentage off the price, or for free shipping. Create a coupon code that shoppers can use to redeem the discount.
 * </summary>
 */
public class DiscountClient {
	
	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient=GetDiscountsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountCollection discountCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountCollection>
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> getDiscountsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getDiscountsClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient=GetDiscountsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountCollection discountCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountCollection>
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> getDiscountsClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the localized content specified for the specified discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=GetDiscountContentClient(dataViewMode,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> getDiscountContentClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId) throws Exception
	{
		return getDiscountContentClient(dataViewMode,  discountId,  null);
	}

	/**
	 * Retrieves the localized content specified for the specified discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=GetDiscountContentClient(dataViewMode,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> getDiscountContentClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountContentUrl(discountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=GetDiscountClient(dataViewMode,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> getDiscountClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId) throws Exception
	{
		return getDiscountClient(dataViewMode,  discountId,  null);
	}

	/**
	 * Retrieves the details of a single discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=GetDiscountClient(dataViewMode,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> getDiscountClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountUrl(discountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Discount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Generates a random code for a coupon.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GenerateRandomCouponClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> generateRandomCouponClient() throws Exception
	{
		return generateRandomCouponClient( null);
	}

	/**
	 * Generates a random code for a coupon.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GenerateRandomCouponClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> generateRandomCouponClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.generateRandomCouponUrl(responseFields);
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = (MozuClient<String>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new discount or coupon to apply to a product, category, order, or shipping.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=CreateDiscountClient( discount);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discount Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> createDiscountClient(com.mozu.api.contracts.productadmin.Discount discount) throws Exception
	{
		return createDiscountClient( discount,  null);
	}

	/**
	 * Creates a new discount or coupon to apply to a product, category, order, or shipping.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=CreateDiscountClient( discount,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param discount Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> createDiscountClient(com.mozu.api.contracts.productadmin.Discount discount, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.createDiscountUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Discount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		return mozuClient;

	}

	/**
	 * Updates the localizable content for the specified discount or rename the discount without modifying its other properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=UpdateDiscountContentClient( content,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param content The container for the language-specific name of the discount. A container exists for each supported language (LocaleCode). This parameter enables you to display the discount name in multiple languages yet manage it as a single discount internally.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> updateDiscountContentClient(com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId) throws Exception
	{
		return updateDiscountContentClient( content,  discountId,  null);
	}

	/**
	 * Updates the localizable content for the specified discount or rename the discount without modifying its other properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=UpdateDiscountContentClient( content,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param content The container for the language-specific name of the discount. A container exists for each supported language (LocaleCode). This parameter enables you to display the discount name in multiple languages yet manage it as a single discount internally.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> updateDiscountContentClient(com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.updateDiscountContentUrl(discountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(content);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a defined discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=UpdateDiscountClient( discount,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param discount Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> updateDiscountClient(com.mozu.api.contracts.productadmin.Discount discount, Integer discountId) throws Exception
	{
		return updateDiscountClient( discount,  discountId,  null);
	}

	/**
	 * Updates one or more properties of a defined discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=UpdateDiscountClient( discount,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param discount Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> updateDiscountClient(com.mozu.api.contracts.productadmin.Discount discount, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.updateDiscountUrl(discountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Discount>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		return mozuClient;

	}

	/**
	 * Deletes a discount specified by its discount ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDiscountClient( discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDiscountClient(Integer discountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.deleteDiscountUrl(discountId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



