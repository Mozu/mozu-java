/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.ProductResource;

/** <summary>
 * Use the Storefront Products  resource to manage the shopper product selection process during a visit to the web storefront. You can update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductFactory
{

	public static com.mozu.api.contracts.productruntime.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getProducts(apiContext, dataViewMode,  null,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ProductCollection getProducts(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String filter, Integer startIndex, Integer pageSize, String sortBy, String responseOptions, String cursorMark, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductCollection returnObj = new com.mozu.api.contracts.productruntime.ProductCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProducts( filter,  startIndex,  pageSize,  sortBy,  responseOptions,  cursorMark,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode) throws Exception
	{
		return getProductInventory(apiContext, dataViewMode,  productCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCodes, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productruntime.LocationInventoryCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInventory( productCode,  locationCodes,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode) throws Exception
	{
		return getProduct(apiContext, dataViewMode,  productCode,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.Product getProduct(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, Boolean supressOutOfStock404, Integer quantity, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.Product returnObj = new com.mozu.api.contracts.productruntime.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProduct( productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  supressOutOfStock404,  quantity,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.Product getProductForIndexing(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode) throws Exception
	{
		return getProductForIndexing(apiContext, dataViewMode,  productCode,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.Product getProductForIndexing(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Long productVersion, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.Product returnObj = new com.mozu.api.contracts.productruntime.Product();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductForIndexing( productCode,  productVersion,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, int expectedCode) throws Exception
	{
		return configuredProduct(apiContext,  productOptionSelections,  productCode,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, Integer quantity, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ConfiguredProduct returnObj = new com.mozu.api.contracts.productruntime.ConfiguredProduct();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.configuredProduct( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  quantity,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, int expectedCode) throws Exception
	{
		return validateProduct(apiContext,  productOptionSelections,  productCode,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(ApiContext apiContext, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, Integer quantity, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.ProductValidationSummary returnObj = new com.mozu.api.contracts.productruntime.ProductValidationSummary();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.validateProduct( productOptionSelections,  productCode,  skipInventoryCheck,  quantity,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(ApiContext apiContext, com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, int expectedCode) throws Exception
	{
		return validateDiscounts(apiContext,  discountSelections,  productCode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.DiscountValidationSummary validateDiscounts(ApiContext apiContext, com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.DiscountValidationSummary returnObj = new com.mozu.api.contracts.productruntime.DiscountValidationSummary();
		ProductResource resource = new ProductResource(apiContext);
		try
		{
			returnObj = resource.validateDiscounts( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
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

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, int expectedCode) throws Exception
	{
		return getProductInventories(apiContext, dataViewMode,  query,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productruntime.LocationInventoryCollection getProductInventories(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productruntime.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productruntime.LocationInventoryCollection();
		ProductResource resource = new ProductResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductInventories( query,  responseFields);
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

}



