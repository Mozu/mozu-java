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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeVariationResource;

/** <summary>
 * Use the variations resource to preview possible product variations for a specific product type based on the option attributes defined for the product type, such as size or color.
 * </summary>
 */
public class ProductTypeVariationFactory
{

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection generateProductVariations(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId, int expectedCode) throws Exception
	{
		return generateProductVariations(apiContext,  productOptionsIn,  productTypeId,  null,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection generateProductVariations(ApiContext apiContext, List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationPagedCollection returnObj = new com.mozu.api.contracts.productadmin.ProductVariationPagedCollection();
		ProductTypeVariationResource resource = new ProductTypeVariationResource(apiContext);
		try
		{
			returnObj = resource.generateProductVariations( productOptionsIn,  productTypeId,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
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



