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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.ProductTypeResource;

/** <summary>
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeFactory
{

	public static com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode) throws Exception
	{
		return getProductTypes(apiContext, dataViewMode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductTypeCollection returnObj = new com.mozu.api.contracts.productadmin.ProductTypeCollection();
		ProductTypeResource resource = new ProductTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductTypes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductType getProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, int expectedCode) throws Exception
	{
		return getProductType(apiContext, dataViewMode,  productTypeId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductType getProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductType returnObj = new com.mozu.api.contracts.productadmin.ProductType();
		ProductTypeResource resource = new ProductTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductType( productTypeId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductType addProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, int expectedCode) throws Exception
	{
		return addProductType(apiContext, dataViewMode,  productType,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductType addProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductType returnObj = new com.mozu.api.contracts.productadmin.ProductType();
		ProductTypeResource resource = new ProductTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProductType( productType,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductType updateProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, int expectedCode) throws Exception
	{
		return updateProductType(apiContext, dataViewMode,  productType,  productTypeId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductType updateProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductType returnObj = new com.mozu.api.contracts.productadmin.ProductType();
		ProductTypeResource resource = new ProductTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductType( productType,  productTypeId,  responseFields);
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

	public static void deleteProductType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, int expectedCode) throws Exception
	{
		ProductTypeResource resource = new ProductTypeResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductType( productTypeId);
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



