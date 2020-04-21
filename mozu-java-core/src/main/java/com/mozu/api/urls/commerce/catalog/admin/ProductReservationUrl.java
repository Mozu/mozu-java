package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;

public class ProductReservationUrl {

	/**
	 * Get Resource Url for GetProductReservations
	 * 
	 * @param filter         A set of filter expressions representing the search
	 *                       parameters for a query. This parameter is optional.
	 *                       Refer to [Sorting and
	 *                       Filtering](../../../../Developer/api-guides/sorting-filtering.htm)
	 *                       for a list of supported filters.
	 * @param pageSize       When creating paged results from a query, this value
	 *                       indicates the zero-based offset in the complete result
	 *                       set where the returned entities begin. For example,
	 *                       with this parameter set to 25, to get the 51st through
	 *                       the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or
	 *                       decrease the amount of data returned inside a JSON
	 *                       object. This parameter should only be used to retrieve
	 *                       data. Attempting to update data using this parameter
	 *                       may cause data loss.
	 * @param sortBy         The element to sort the results by and the channel in
	 *                       which the results appear. Either ascending (a-z) or
	 *                       descending (z-a) channel. Optional. Refer to [Sorting
	 *                       and
	 *                       Filtering](../../../../Developer/api-guides/sorting-filtering.htm)
	 *                       for more information.
	 * @param startIndex     When creating paged results from a query, this value
	 *                       indicates the zero-based offset in the complete result
	 *                       set where the returned entities begin. For example,
	 *                       with pageSize set to 25, to get the 51st through the
	 *                       75th items, set this parameter to 50.
	 * @return String Resource Url
	 */
	public static MozuUrl getProductReservationsUrl(String filter, Integer pageSize, String responseFields,
			String sortBy, Integer startIndex) {
		UrlFormatter formatter = new UrlFormatter(
				"/api/commerce/catalog/admin/productreservations/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

	/**
	 * Get Resource Url for GetProductReservation
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param responseFields       Filtering syntax appended to an API call to
	 *                             increase or decrease the amount of data returned
	 *                             inside a JSON object. This parameter should only
	 *                             be used to retrieve data. Attempting to update
	 *                             data using this parameter may cause data loss.
	 * @return String Resource Url
	 */
	public static MozuUrl getProductReservationUrl(Integer productReservationId, String responseFields) {
		UrlFormatter formatter = new UrlFormatter(
				"/api/commerce/catalog/admin/productreservations/{productReservationId}?responseFields={responseFields}");
		formatter.formatUrl("productReservationId", productReservationId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

	/**
	 * Get Resource Url for AddProductReservations
	 * 
	 * @param skipInventoryCheck If true, skip the process to validate inventory
	 *                           when creating this product reservation.
	 * @return String Resource Url
	 */
	public static MozuUrl addProductReservationsUrl(Boolean skipInventoryCheck) {
		UrlFormatter formatter = new UrlFormatter(
				"/api/commerce/catalog/admin/productreservations/?skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

	/**
	 * Get Resource Url for CommitReservations
	 * 
	 * @return String Resource Url
	 */
	public static MozuUrl commitReservationsUrl() {
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/productreservations/commit");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

	/**
	 * Get Resource Url for UpdateProductReservations
	 * 
	 * @param skipInventoryCheck If true, skip the process to validate inventory
	 *                           when creating this product reservation.
	 * @return String Resource Url
	 */
	public static MozuUrl updateProductReservationsUrl(Boolean skipInventoryCheck) {
		UrlFormatter formatter = new UrlFormatter(
				"/api/commerce/catalog/admin/productreservations/?skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

	/**
	 * Get Resource Url for DeleteProductReservation
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @return String Resource Url
	 */
	public static MozuUrl deleteProductReservationUrl(Integer productReservationId) {
		UrlFormatter formatter = new UrlFormatter(
				"/api/commerce/catalog/admin/productreservations/{productReservationId}");
		formatter.formatUrl("productReservationId", productReservationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD);
	}

}
