package com.mozu.api.clients.commerce.catalog.admin;

import java.util.ArrayList;
import java.util.List;

import com.mozu.api.Headers;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;

/**
 * <summary> Use the Product Reservations resource to temporarily hold a product
 * from inventory while a shopper is filling out payment information. You can
 * create a product reservation when a shopper proceeds to check out and then
 * release the reservation when the order process is complete. </summary>
 */
public class ProductReservationClient {

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient=GetProductReservationsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservationCollection productReservationCollection = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient
	 *         <com.mozu.api.contracts.productadmin.ProductReservationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> getProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode) throws Exception {
		return getProductReservationsClient(dataViewMode, null, null, null, null, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient=GetProductReservationsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservationCollection productReservationCollection = client.Result();
	 * </code>
	 * </pre>
	 * </p>
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
	 * @param dataViewMode   DataViewMode
	 * @return Mozu.Api.MozuClient
	 *         <com.mozu.api.contracts.productadmin.ProductReservationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> getProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter,
			String responseFields) throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.getProductReservationsUrl(filter,
				pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductReservationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection>) MozuClientFactory
				.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient=GetProductReservationClient(dataViewMode,  productReservationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode         DataViewMode
	 * @return Mozu.Api.MozuClient
	 *         <com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> getProductReservationClient(
			com.mozu.api.DataViewMode dataViewMode, Integer productReservationId) throws Exception {
		return getProductReservationClient(dataViewMode, productReservationId, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient=GetProductReservationClient(dataViewMode,  productReservationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param responseFields       Filtering syntax appended to an API call to
	 *                             increase or decrease the amount of data returned
	 *                             inside a JSON object. This parameter should only
	 *                             be used to retrieve data. Attempting to update
	 *                             data using this parameter may cause data loss.
	 * @param dataViewMode         DataViewMode
	 * @return Mozu.Api.MozuClient
	 *         <com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> getProductReservationClient(
			com.mozu.api.DataViewMode dataViewMode, Integer productReservationId, String responseFields)
			throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl
				.getProductReservationUrl(productReservationId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductReservation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductReservation>) MozuClientFactory
				.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=AddProductReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return Mozu.Api.MozuClient
	 *         <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> addProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode,
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception {
		return addProductReservationsClient(dataViewMode, productReservations, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=AddProductReservationsClient(dataViewMode,  productReservations,  skipInventoryCheck);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param skipInventoryCheck  If true, skip the process to validate inventory
	 *                            when creating this product reservation.
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return Mozu.Api.MozuClient
	 *         <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> addProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode,
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations,
			Boolean skipInventoryCheck) throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl
				.addProductReservationsUrl(skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>() {
		}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>>) MozuClientFactory
				.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient mozuClient=CommitReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return Mozu.Api.MozuClient
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient commitReservationsClient(com.mozu.api.DataViewMode dataViewMode,
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.commitReservationsUrl();
		String verb = "POST";
		MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=UpdateProductReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return Mozu.Api.MozuClient
	 *         <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> updateProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode,
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception {
		return updateProductReservationsClient(dataViewMode, productReservations, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=UpdateProductReservationsClient(dataViewMode,  productReservations,  skipInventoryCheck);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param skipInventoryCheck  If true, skip the process to validate inventory
	 *                            when creating this product reservation.
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return Mozu.Api.MozuClient
	 *         <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> updateProductReservationsClient(
			com.mozu.api.DataViewMode dataViewMode,
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations,
			Boolean skipInventoryCheck) throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl
				.updateProductReservationsUrl(skipInventoryCheck);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>() {
		}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>>) MozuClientFactory
				.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * MozuClient mozuClient=DeleteProductReservationClient(dataViewMode,  productReservationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode         DataViewMode
	 * @return Mozu.Api.MozuClient
	 */
	public static MozuClient deleteProductReservationClient(com.mozu.api.DataViewMode dataViewMode,
			Integer productReservationId) throws Exception {
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl
				.deleteProductReservationUrl(productReservationId);
		String verb = "DELETE";
		MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE, dataViewMode.toString());
		return mozuClient;

	}

}
