/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory.commerce.catalog.admin;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.ProductReservationResource;

/** <summary>
 * Temporarily hold a product from inventory while a shopper is filling out payment information. Create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class ProductReservationFactory
{

	public static com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getProductReservations(apiContext, dataViewMode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductReservationCollection getProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductReservationCollection returnObj = new com.mozu.api.contracts.productadmin.ProductReservationCollection();
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductReservations( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productReservationId, int expectedCode) throws Exception
	{
		return getProductReservation(apiContext, dataViewMode,  productReservationId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductReservation getProductReservation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productReservationId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductReservation returnObj = new com.mozu.api.contracts.productadmin.ProductReservation();
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductReservation( productReservationId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, int expectedCode) throws Exception
	{
		return addProductReservations(apiContext, dataViewMode,  productReservations,  null, expectedCode);
	}

	public static List<com.mozu.api.contracts.productadmin.ProductReservation> addProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductReservation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>();
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProductReservations( productReservations,  skipInventoryCheck);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void commitReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, int expectedCode) throws Exception
	{
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			resource.commitReservations( productReservations);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, int expectedCode) throws Exception
	{
		return updateProductReservations(apiContext, dataViewMode,  productReservations,  null, expectedCode);
	}

	public static List<com.mozu.api.contracts.productadmin.ProductReservation> updateProductReservations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductReservation> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>();
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductReservations( productReservations,  skipInventoryCheck);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteProductReservation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productReservationId, int expectedCode) throws Exception
	{
		ProductReservationResource resource = new ProductReservationResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductReservation( productReservationId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



