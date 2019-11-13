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

/** <summary>
 * Use the Facets resource to manage the facets shoppers use to filter product display results on a storefront. Facets can include categories, product attributes, or prices, and use either a range of values or discrete values.
 * </summary>
 */
public class FacetClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient( facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(Integer facetId) throws Exception
	{
		return getFacetClient( facetId,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient( facetId,  validate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(Integer facetId, Boolean validate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetUrl(facetId, responseFields, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Facet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(Integer categoryId) throws Exception
	{
		return getFacetCategoryListClient( categoryId,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient( categoryId,  includeAvailable,  validate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param includeAvailable If true, returns a list of the attributes and categories associated with a product type that have not been defined as a facet for the category.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetCategoryListUrl(categoryId, includeAvailable, responseFields, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.FacetSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.FacetSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=AddFacetClient( facet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facet Properties of the facet used to retrieve documents.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> addFacetClient(com.mozu.api.contracts.productadmin.Facet facet) throws Exception
	{
		return addFacetClient( facet,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=AddFacetClient( facet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param facet Properties of the facet used to retrieve documents.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> addFacetClient(com.mozu.api.contracts.productadmin.Facet facet, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.addFacetUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Facet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=UpdateFacetClient( facet,  facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param facet Properties of the facet used to retrieve documents.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> updateFacetClient(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId) throws Exception
	{
		return updateFacetClient( facet,  facetId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=UpdateFacetClient( facet,  facetId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param facet Properties of the facet used to retrieve documents.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> updateFacetClient(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.updateFacetUrl(facetId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Facet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=DeleteFacetByIdClient( facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> deleteFacetByIdClient(Integer facetId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.deleteFacetByIdUrl(facetId);
		String verb = "DELETE";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



