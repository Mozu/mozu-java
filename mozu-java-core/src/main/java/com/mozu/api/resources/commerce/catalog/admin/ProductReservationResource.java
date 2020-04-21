package com.mozu.api.resources.commerce.catalog.admin;

import java.util.List;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuClient;

/**
 * <summary> Use the Product Reservations resource to temporarily hold a product
 * from inventory while a shopper is filling out payment information. You can
 * create a product reservation when a shopper proceeds to check out and then
 * release the reservation when the order process is complete. </summary>
 */
public class ProductReservationResource {

	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductReservationResource(ApiContext apiContext) {
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductReservationResource(ApiContext apiContext, DataViewMode dataViewMode) {
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservationCollection productReservationCollection = productreservation.getProductReservations();
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations() throws Exception {
		return getProductReservations(null, null, null, null, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservationCollection productReservationCollection = productreservation.getProductReservations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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
	 * @return com.mozu.api.contracts.productadmin.ProductReservationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations(Integer startIndex,
			Integer pageSize, String sortBy, String filter, String responseFields) throws Exception {
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.getProductReservationsClient(_dataViewMode, startIndex, pageSize, sortBy, filter, responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.getProductReservation( productReservationId);
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode         DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(Integer productReservationId)
			throws Exception {
		return getProductReservation(productReservationId, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.getProductReservation( productReservationId,  responseFields);
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
	 * @return com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(Integer productReservationId,
			String responseFields) throws Exception {
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.getProductReservationClient(_dataViewMode, productReservationId, responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.addProductReservations( productReservations);
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception {
		return addProductReservations(productReservations, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.addProductReservations( productReservations,  skipInventoryCheck);
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
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations,
			Boolean skipInventoryCheck) throws Exception {
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.addProductReservationsClient(_dataViewMode, productReservations, skipInventoryCheck);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	productreservation.commitReservations( productReservations);
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public void commitReservations(List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations)
			throws Exception {
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.commitReservationsClient(_dataViewMode, productReservations);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.updateProductReservations( productReservations);
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param dataViewMode        DataViewMode
	 * @param productReservations A hold placed on product inventory for a
	 *                            particular product so that the quantity specified
	 *                            is set aside and available for purchase during the
	 *                            ordering process.
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception {
		return updateProductReservations(productReservations, null);
	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	ProductReservation productReservation = productreservation.updateProductReservations( productReservations,  skipInventoryCheck);
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
	 * @return List<com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(
			List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations,
			Boolean skipInventoryCheck) throws Exception {
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.updateProductReservationsClient(_dataViewMode, productReservations, skipInventoryCheck);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 *	ProductReservation productreservation = new ProductReservation();
	 *	productreservation.deleteProductReservation( productReservationId);
	 * </code>
	 * </pre>
	 * </p>
	 * 
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode         DataViewMode
	 * @return
	 */
	public void deleteProductReservation(Integer productReservationId) throws Exception {
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductReservationClient
				.deleteProductReservationClient(_dataViewMode, productReservationId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}
