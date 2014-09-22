package com.mozu.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationCollection;
import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.Category;
import com.mozu.api.contracts.productadmin.CategoryPagedCollection;
import com.mozu.api.contracts.productadmin.MasterCatalog;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductPropertyValue;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.ProductTypeCollection;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.AdminProductFactory;
import com.mozu.test.framework.datafactory.AttributeFactory;
import com.mozu.test.framework.datafactory.AttributedefinitionAttributeFactory;
import com.mozu.test.framework.datafactory.CategoryFactory;
import com.mozu.test.framework.datafactory.CommerceLocationFactory;
import com.mozu.test.framework.datafactory.LocationFactory;
import com.mozu.test.framework.datafactory.MasterCatalogFactory;
import com.mozu.test.framework.datafactory.ProductTypeFactory;
import com.mozu.test.framework.datafactory.PublishingScopeFactory;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductAttributeGenerator;
import com.mozu.test.framework.helper.ProductGenerator;
import com.mozu.test.framework.helper.ProductTypeGenerator;

public class ProductTests extends MozuApiTestBase {

	private static List<String> attrs = new ArrayList<String>(); 
	private static List<Integer> productTypes = new ArrayList<Integer>(); 
	private static List<String> products = new ArrayList<String>(); 
	private static ApiContext apiContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		for (int i = 0; i < products.size(); i++)
		{
			AdminProductFactory.deleteProduct(apiContext, DataViewMode.Live, products.get(i), HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
		for (int i = 0; i < productTypes.size(); i++)
		{
			ProductTypeFactory.deleteProductType(apiContext, DataViewMode.Live, productTypes.get(i), HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
		for (int i = 0; i < attrs.size(); i++)
		{
		    AttributedefinitionAttributeFactory.deleteAttribute(apiContext, attrs.get(i), HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createProductTest1() throws Exception  {
		//Create attribute
        Attribute attr1 = ProductAttributeGenerator.generate(Generator.randomString(6, Generator.AlphaChars), "List", "Predefined", "String", false,  false, true);
        Attribute createdAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, attr1, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        attrs.add(createdAttr.getAttributeFQN());
        
        //Create product type
        ProductType myPT = ProductTypeGenerator.generate(createdAttr, Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());
        
        //Create product
        Product myProduct = ProductGenerator.generate(createdPT);       
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        products.add(createdProduct.getProductCode());
        
        //Get product
        Product getProduct = AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        assertEquals(createdProduct.getContent().getProductName(), getProduct.getContent().getProductName());
        assertEquals(createdProduct.getPrice().getPrice(), getProduct.getPrice().getPrice());
	}

	@Test
	public void updateProductTest1() throws Exception  {
	    //Create product type
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());

        Product myProduct = ProductGenerator.generate(createdPT);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(apiContext, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Pending");
		MasterCatalogFactory.updateMasterCatalog(apiContext, mc, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        AdminProductFactory.getProduct(apiContext, DataViewMode.Pending, createdProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        PublishingScopeFactory.publishDrafts(apiContext, DataViewMode.Live, ProductGenerator.generatePublishingScope(true, null), HttpStatus.SC_OK, HttpStatus.SC_OK);
        products.add(createdProduct.getProductCode());
        AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Live");
		MasterCatalogFactory.updateMasterCatalog(apiContext, mc, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void updateProductTest2() throws Exception  {
		// Add a new attribute
        Attribute attr1 = ProductAttributeGenerator.generate(Generator.randomString(6, Generator.AlphaChars), "Date", "AdminEntered", "Datetime", false,  false, true);
        Attribute createdAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, attr1, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
 
		
	    //update product type
        ProductType myPT = ProductTypeGenerator.generate(createdAttr, Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
 
        Product myProduct = ProductGenerator.generate(createdPT);
        List<ProductPropertyValue> salePriceDateValue = new ArrayList<ProductPropertyValue>();
        ProductPropertyValue salePriceValue = new ProductPropertyValue();
        DateTime date = DateTime.now();
        salePriceValue.setValue(date);
        salePriceDateValue.add(salePriceValue);
        myProduct.getProperties().get(myProduct.getProperties().size()-1).setValues(salePriceDateValue);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
	}
	
	@Test
	public void getProductTest1() throws Exception  {
	    //Create product type
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());
        
        //Create product
        Product myProduct = ProductGenerator.generate(createdPT);       
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        products.add(createdProduct.getProductCode());

	    AdminProductFactory.getProducts(apiContext, DataViewMode.Live, null, null, null, "ProductSequence eq "+ createdProduct.getProductSequence(), null, null, null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}	
}
