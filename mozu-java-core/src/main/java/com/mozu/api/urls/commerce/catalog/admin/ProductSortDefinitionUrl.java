/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ProductSortDefinitionUrl
{

	/**
	 * Get Resource Url for GetProductSortDefinitions
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductSortDefinitionsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productsortdefinitions/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductSortDefinition
	 * @param productSortDefinitionId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductSortDefinitionUrl(Integer productSortDefinitionId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId}?responseFields={responseFields}");
		formatter.formatUrl("productSortDefinitionId", productSortDefinitionId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProductSortDefinition
	 * @param responseFields 
	 * @param useProvidedId 
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductSortDefinitionUrl(String responseFields, Boolean useProvidedId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productsortdefinitions/?useProvidedId={useProvidedId}&responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("useProvidedId", useProvidedId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductSortDefinition
	 * @param productSortDefinitionId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductSortDefinitionUrl(Integer productSortDefinitionId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId}?responseFields={responseFields}");
		formatter.formatUrl("productSortDefinitionId", productSortDefinitionId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductSortDefinition
	 * @param productSortDefinitionId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductSortDefinitionUrl(Integer productSortDefinitionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productsortdefinitions/{productSortDefinitionId}");
		formatter.formatUrl("productSortDefinitionId", productSortDefinitionId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
