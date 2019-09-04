/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class CustomerAttributeUrl
{

	/**
	 * Get Resource Url for GetAccountAttribute
	 * @param accountId Identifier of the customer account associated with the attribute to retrieve.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountAttributeUrl(Integer accountId, String attributeFQN, String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/attributes/{attributeFQN}?userId={userId}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAccountAttributes
	 * @param accountId Identifier of the customer account associated with the attributes to retrieve.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountAttributesUrl(Integer accountId, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/attributes?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&userId={userId}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccountAttribute
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountAttributeUrl(Integer accountId, String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/attributes?userId={userId}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAccountAttribute
	 * @param accountId Identifier of the customer account associated with the attribute.
	 * @param attributeFQN 
	 * @param responseFields 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAccountAttributeUrl(Integer accountId, String attributeFQN, String responseFields, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/attributes/{attributeFQN}?userId={userId}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAccountAttribute
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN 
	 * @param userId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAccountAttributeUrl(Integer accountId, String attributeFQN, String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/attributes/{attributeFQN}?userId={userId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

