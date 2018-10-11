/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.attributedefinition;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class AttributeUrl
{

	/**
	 * Get Resource Url for GetAttributes
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValues
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttribute
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateAttribute
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createAttributeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttribute
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

