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
import com.mozu.api.resources.commerce.catalog.admin.products.ProductVariationResource;

/** <summary>
 * Use the product variations sub-resource to manage the variations of a product based on its attributes. For example, a t-shirt product could be offered in six variations: Small Black, Medium Black, Large Black, Small White, Medium White, and Large White.
 * </summary>
 */
public class ProductVariationFactory
{

	public static List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPrices(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariationLocalizedDeltaPrices( productCode,  variationKey);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		return getProductVariationLocalizedDeltaPrice(apiContext, dataViewMode,  productCode,  variationKey,  currencyCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice> getProductVariationLocalizedPrices(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice>();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariationLocalizedPrices( productCode,  variationKey);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice getProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		return getProductVariationLocalizedPrice(apiContext, dataViewMode,  productCode,  variationKey,  currencyCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice getProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationFixedPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationFixedPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariationLocalizedPrice( productCode,  variationKey,  currencyCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariation getProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode) throws Exception
	{
		return getProductVariation(apiContext, dataViewMode,  productCode,  variationKey,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariation getProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariation returnObj = new com.mozu.api.contracts.productadmin.ProductVariation();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariation( productCode,  variationKey,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode) throws Exception
	{
		return getProductVariations(apiContext, dataViewMode,  productCode,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationPagedCollection returnObj = new com.mozu.api.contracts.productadmin.ProductVariationPagedCollection();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProductVariations( productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, int expectedCode) throws Exception
	{
		return addProductVariationLocalizedDeltaPrice(apiContext, dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice addProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationFixedPrice localizedPrice, String productCode, String variationKey, int expectedCode) throws Exception
	{
		return addProductVariationLocalizedPrice(apiContext, dataViewMode,  localizedPrice,  productCode,  variationKey,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice addProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationFixedPrice localizedPrice, String productCode, String variationKey, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationFixedPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationFixedPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProductVariationLocalizedPrice( localizedPrice,  productCode,  variationKey,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPrices(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> localizedDeltaPrice, String productCode, String variationKey, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariationLocalizedDeltaPrices( localizedDeltaPrice,  productCode,  variationKey);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		return updateProductVariationLocalizedDeltaPrice(apiContext, dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice> updateProductVariationLocalizedPrices(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice> localizedPrice, String productCode, String variationKey, int expectedCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationFixedPrice>();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariationLocalizedPrices( localizedPrice,  productCode,  variationKey);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice updateProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationFixedPrice localizedPrice, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		return updateProductVariationLocalizedPrice(apiContext, dataViewMode,  localizedPrice,  productCode,  variationKey,  currencyCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationFixedPrice updateProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationFixedPrice localizedPrice, String productCode, String variationKey, String currencyCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationFixedPrice returnObj = new com.mozu.api.contracts.productadmin.ProductVariationFixedPrice();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariationLocalizedPrice( localizedPrice,  productCode,  variationKey,  currencyCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariation updateProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey, int expectedCode) throws Exception
	{
		return updateProductVariation(apiContext, dataViewMode,  productVariation,  productCode,  variationKey,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariation updateProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariation returnObj = new com.mozu.api.contracts.productadmin.ProductVariation();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariation( productVariation,  productCode,  variationKey,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductVariationCollection updateProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode, int expectedCode) throws Exception
	{
		return updateProductVariations(apiContext, dataViewMode,  productVariations,  productCode,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationCollection updateProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationCollection returnObj = new com.mozu.api.contracts.productadmin.ProductVariationCollection();
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProductVariations( productVariations,  productCode,  responseFields);
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

	public static void deleteProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode) throws Exception
	{
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductVariation( productCode,  variationKey);
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

	public static void deleteProductVariationLocalizedDeltaPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode);
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

	public static void deleteProductVariationLocalizedPrice(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, int expectedCode) throws Exception
	{
		ProductVariationResource resource = new ProductVariationResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProductVariationLocalizedPrice( productCode,  variationKey,  currencyCode);
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



