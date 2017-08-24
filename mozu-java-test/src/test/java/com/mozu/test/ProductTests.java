package com.mozu.test;

import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
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
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationCollection;
import com.mozu.api.contracts.productadmin.Attribute;
import com.mozu.api.contracts.productadmin.AttributeInProductType;
import com.mozu.api.contracts.productadmin.Category;
import com.mozu.api.contracts.productadmin.CategoryPagedCollection;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.productadmin.MasterCatalog;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductInventoryInfo;
import com.mozu.api.contracts.productadmin.ProductProperty;
import com.mozu.api.contracts.productadmin.ProductPropertyValue;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.ProductTypeCollection;
import com.mozu.api.contracts.productadmin.ProductVariation;
import com.mozu.api.contracts.productadmin.ProductVariationPagedCollection;
import com.mozu.api.contracts.productruntime.ProductCollection;
import com.mozu.api.security.CustomerAuthenticationProfile;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.test.framework.datafactory.AdminProductFactory;
import com.mozu.test.framework.datafactory.AttributeFactory;
import com.mozu.test.framework.datafactory.AttributedefinitionAttributeFactory;
import com.mozu.test.framework.datafactory.CategoryFactory;
import com.mozu.test.framework.datafactory.CommerceLocationFactory;
import com.mozu.test.framework.datafactory.CustomerAccountFactory;
import com.mozu.test.framework.datafactory.LocationFactory;
import com.mozu.test.framework.datafactory.LocationInventoryFactory;
import com.mozu.test.framework.datafactory.MasterCatalogFactory;
import com.mozu.test.framework.datafactory.ProductFactory;
import com.mozu.test.framework.datafactory.ProductTypeFactory;
import com.mozu.test.framework.datafactory.ProductVariationFactory;
import com.mozu.test.framework.datafactory.PublishingScopeFactory;
import com.mozu.test.framework.helper.CustomerGenerator;
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
			AdminProductFactory.deleteProduct(apiContext, DataViewMode.Live, products.get(i), HttpStatus.SC_NO_CONTENT);			
		}
		for (int i = 0; i < productTypes.size(); i++)
		{
			ProductTypeFactory.deleteProductType(apiContext, DataViewMode.Live, productTypes.get(i), HttpStatus.SC_NO_CONTENT);			
		}
		for (int i = 0; i < attrs.size(); i++)
		{
		    AttributedefinitionAttributeFactory.deleteAttribute(apiContext, attrs.get(i), HttpStatus.SC_NO_CONTENT);			
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
        Attribute createdAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, attr1, HttpStatus.SC_CREATED);
        attrs.add(createdAttr.getAttributeFQN());
        
        //Create product type
        ProductType myPT = ProductTypeGenerator.generate(createdAttr, Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());
        
        //Create product
        Product myProduct = ProductGenerator.generate(createdPT);       
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED);
        products.add(createdProduct.getProductCode());
        
        //Get product
        Product getProduct = AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK);
        assertEquals(createdProduct.getContent().getProductName(), getProduct.getContent().getProductName());
        assertEquals(createdProduct.getPrice().getPrice(), getProduct.getPrice().getPrice());
	}

	@Test
	public void updateProductTest1() throws Exception  {
	    //Create product type
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());

        Product myProduct = ProductGenerator.generate(createdPT);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(apiContext, masterCatalogId, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Pending");
		MasterCatalogFactory.updateMasterCatalog(apiContext, mc, masterCatalogId, HttpStatus.SC_OK);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED);
        AdminProductFactory.getProduct(apiContext, DataViewMode.Pending, createdProduct.getProductCode(), HttpStatus.SC_OK);
        AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_NOT_FOUND);
        PublishingScopeFactory.publishDrafts(apiContext, DataViewMode.Live, ProductGenerator.generatePublishingScope(true, null), HttpStatus.SC_OK);
        products.add(createdProduct.getProductCode());
        AdminProductFactory.getProduct(apiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK);
		mc.setProductPublishingMode("Live");
		MasterCatalogFactory.updateMasterCatalog(apiContext, mc, masterCatalogId, HttpStatus.SC_OK);
	}
	
	@Test
	public void updateProductTest2() throws Exception  {
		// Add a new attribute
        Attribute attr1 = ProductAttributeGenerator.generate(Generator.randomString(6, Generator.AlphaChars), "Date", "AdminEntered", "Datetime", false,  false, true);
        Attribute createdAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, attr1, HttpStatus.SC_CREATED);
 
		
	    //update product type
        ProductType myPT = ProductTypeGenerator.generate(createdAttr, Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED);
 
        Product myProduct = ProductGenerator.generate(createdPT);
        List<ProductPropertyValue> salePriceDateValue = new ArrayList<ProductPropertyValue>();
        ProductPropertyValue salePriceValue = new ProductPropertyValue();
        DateTime date = DateTime.now();
        salePriceValue.setValue(date);
        salePriceDateValue.add(salePriceValue);
        myProduct.getProperties().get(myProduct.getProperties().size()-1).setValues(salePriceDateValue);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED);
	}
	
	@Test
	public void getProductTest1() throws Exception  {
	    //Create product type
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());
        
        //Create product
        Product myProduct = ProductGenerator.generate(createdPT);       
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED);
        products.add(createdProduct.getProductCode());

	    AdminProductFactory.getProducts(apiContext, DataViewMode.Live, null, null, null, "ProductSequence eq "+ createdProduct.getProductSequence(), null, null, null, null, HttpStatus.SC_OK);
	}
	
	@Test
	public void getProductsTest1() throws Exception {
		ApiContext localapiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);
		ProductCollection products = ProductFactory.getProducts(localapiContext, DataViewMode.Live, HttpStatus.SC_OK);
		System.out.println("Total products expected is: " + products.getTotalCount());
		int pagesize = 10;
		int page;
		ProductCollection productPerPage;
		for (page=0; page<=products.getPageCount(); page++)
		{
		    productPerPage = ProductFactory.getProducts(localapiContext, DataViewMode.Live, null, page*pagesize, pagesize, null, null,null,null, HttpStatus.SC_OK);
/*			if (productPerPage.getItems().size() < 10)
			{
				System.out.println("Wrong Page" + page + " :" + products.getItems().size());
				break;
			}
*/			System.out.println("Page" + page + " :" + productPerPage.getItems().size());
		}	
		    
		
	//	int count = products.getTotalCount();
	//	int variationCount = 0;
/*		int startIndex = 0;
		int pageSize = 200;
		int file_number =  Generator.randomInt(1,  1000);
		PrintWriter writer1 = new PrintWriter("C:\\Users\\eileen_zhuang\\Documents\\tmp\\file" + file_number +".txt", "UTF-8");
		PrintWriter writer2 = new PrintWriter("C:\\Users\\eileen_zhuang\\Documents\\tmp\\variationfile" + file_number +".txt", "UTF-8");
        while (true)
        {            
        	ProductCollection prods = ProductFactory.getProducts(localapiContext, DataViewMode.Live, null, startIndex, pageSize, "productCode", null, HttpStatus.SC_OK, HttpStatus.SC_OK);
            for (com.mozu.api.contracts.productruntime.Product pro : prods.getItems())
            {
            	writer1.println(pro.getProductCode());
            	if (pro.getOptions() == null)
            	{
            		continue;
            	}
            	try
            	{
            		ProductVariationPagedCollection varies = ProductVariationFactory.getProductVariations(apiContext, DataViewMode.Live, pro.getProductCode(), 0, pageSize, "variationProductCode", null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
            		for (ProductVariation vari: varies.getItems())
            		{
            			if (vari.getIsActive() && vari.getVariationExists())
            			{
            				writer2.println(vari.getVariationProductCode());
            				variationCount ++;
            			}
            		}
            	}
            	catch(TestFailException e)
            	{
            		continue;
            	}
            }
            startIndex += pageSize;            	
            if (prods.getItems().size() < pageSize)
            {
                break;
            }
        }
//        writer1.close();
//        writer2.close();
        System.out.println("Total products expected in xml is: " + count);
        System.out.println("Total variations expected in xml is: " + variationCount);
*/    }
	@Test
	public void populateProductTest1() throws Exception  {
	    //Create product type
        ProductType myPT = ProductTypeFactory.getProductType(apiContext, DataViewMode.Live, 2, HttpStatus.SC_OK);
        for (int i = 0; i<300; i++)
        {
 /*           Product myProduct = ProductGenerator.generate(myPT);
            myProduct.setProductCode("shoes" + i);
            myProduct.getContent().setProductName("shoes " + i);
            Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
*/
        	Product myProduct = AdminProductFactory.getProduct(apiContext, DataViewMode.Live, "shoes" + i, HttpStatus.SC_OK);
/*        	List<ProductInCatalogInfo> productInCatalogs = new ArrayList<ProductInCatalogInfo>();
        	ProductInCatalogInfo info = new ProductInCatalogInfo();
        	info.setCatalogId(1);
        	productInCatalogs.add(info);
			myProduct.setProductInCatalogs(productInCatalogs );
			List<ProductProperty> properties = new ArrayList<ProductProperty>();
			ProductProperty pp = new ProductProperty();
			pp.setAttributeFQN("com.mozu.bvconversations~bazaarvoice-category");
			List<ProductPropertyValue> values = new ArrayList<ProductPropertyValue>();
			ProductPropertyValue value = new ProductPropertyValue();
			value.setValue("1-Cate1");
			values.add(value);
			pp.setValues(values );
			properties.add(pp);
			myProduct.setProperties(properties);
*/			myProduct.getProductInCatalogs().get(0).setIsActive(true);
			AdminProductFactory.updateProduct(apiContext, DataViewMode.Live, myProduct, myProduct.getProductCode(), HttpStatus.SC_OK);
        
/*        	Product myProduct = AdminProductFactory.getProduct(apiContext, DataViewMode.Live, "shoes" + i, HttpStatus.SC_OK, HttpStatus.SC_OK);
    
        	
            ProductInventoryInfo inventoryInfo = new ProductInventoryInfo();
            inventoryInfo.setManageStock(true);
            inventoryInfo.setOutOfStockBehavior("HideProduct");
			myProduct.setInventoryInfo(inventoryInfo);	
        	AdminProductFactory.updateProduct(apiContext, DataViewMode.Live, myProduct, myProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        
            List<LocationInventory> locationInventoryList = new ArrayList<LocationInventory>();
            LocationInventory li = new LocationInventory();
            li.setLocationCode("andersonmillwarehouse");
            li.setProductCode(myProduct.getProductCode());
            li.setStockOnHand(Generator.randomInt(50, 500));
            locationInventoryList.add(li);
        	LocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, locationInventoryList, myProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
*/        }
	}
}
