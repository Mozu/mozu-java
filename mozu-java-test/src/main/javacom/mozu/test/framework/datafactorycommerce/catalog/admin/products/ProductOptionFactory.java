/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactorycommerce.catalog.admin.products;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.products.ProductOptionResource;

/** <summary>
 * Use the Options resource to configure the option attributes and vocabulary values for an individual product associated with the product type that uses the option attribute. Options are used to generate variations of a product.
 * </summary>
 */
public class ProductOptionFactory
{

	public static List<com.mozu.api.contracts.productadmin.ProductOption> getOptions(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductOption> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductOption>();
		ProductOptionResource resource = new ProductOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getOptions( productCode);
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

	public static com.mozu.api.contracts.productadmin.ProductOption getOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode) throws Exception
	{
		return getOption(apiContext, dataViewMode,  productCode,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductOption getOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getOption( productCode,  attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductOption addOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, int expectedCode) throws Exception
	{
		return addOption(apiContext, dataViewMode,  productOption,  productCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductOption addOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addOption( productOption,  productCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductOption updateOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, int expectedCode) throws Exception
	{
		return updateOption(apiContext, dataViewMode,  productOption,  productCode,  attributeFQN,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductOption updateOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductOption returnObj = new com.mozu.api.contracts.productadmin.ProductOption();
		ProductOptionResource resource = new ProductOptionResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateOption( productOption,  productCode,  attributeFQN,  responseFields);
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

	public static void deleteOption(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode) throws Exception
	{
		ProductOptionResource resource = new ProductOptionResource(apiContext, dataViewMode);
		try
		{
			resource.deleteOption( productCode,  attributeFQN);
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



