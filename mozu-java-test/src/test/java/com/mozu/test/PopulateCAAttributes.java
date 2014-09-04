package com.mozu.test;

import java.util.List;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.cache.impl.CacheManagerImpl;
import com.mozu.api.contracts.core.extensible.Attribute;
import com.mozu.api.contracts.productadmin.AttributeInProductType;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.ProductTypeCollection;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.test.framework.datafactory.AttributeFactory;
import com.mozu.test.framework.datafactory.AttributedefinitionAttributeFactory;
import com.mozu.test.framework.datafactory.ProductTypeFactory;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductAttributeGenerator;

public class PopulateCAAttributes extends MozuApiTestBase {

	private static ApiContext apiContext;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void populateGeneral() throws Exception {
	//Title, sale price,short description, product SKU, brand, manufacturer, manufacturer id
		populateAnAttribute("Brand", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Subtitle", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Warranty", "TextBox", "AdminEntered", "String");	
		populateAnAttribute("Manufacturer", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Condition", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Condition Note", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Handling Time", "TextBox", "AdminEntered", "Number");
		populateAnAttribute("Product Id Type", "TextBox", "AdminEntered", "Number");		
		populateAnAttribute("Starting Price", "TextBox", "AdminEntered", "Number");
		populateAnAttribute("Buy it Now Price", "TextBox", "AdminEntered", "Number");
		populateAnAttribute("Reserve Price", "TextBox", "AdminEntered", "Number");
	}
	
	@Test
	public void populateAmazon() throws Exception {
    // Required: Title, Category, Retail Price
	// Conditionally Required Fields: Product ID, Product ID Type, Brand, Item Type, Manufacturer,  Mfr Part Number
	// Highly Recommended Fields: Tax Code, Description, Condition, Condition Note, Feature Bullet1, Feature Bullet2, 
	// Feature Bullet3, Feature Bullet4, Feature Bullet5, Main Image, Search Terms, Used For, Target Audience, 
	//	Subject Content, Other Attributes, Lead Time to Ship
		populateAnAttribute("ASIN", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Amazon Condition", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Classification", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Amazon Category", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Amazon Item Type", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Tax Code", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Feature Bullet1", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Feature Bullet2", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Feature Bullet3", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Feature Bullet4", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Feature Bullet5", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Search Terms", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Used For", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Target Audience", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Subject Content", "TextBox", "AdminEntered", "String");		
		populateAnAttribute("Amazon Other Attributes", "TextBox", "AdminEntered", "String");		
	}

	@Test
	public void populateEbayFix() throws Exception {
		//Required: Sale Price, condition, handling time, title, description, image, product id, product id type
		//Other: Condition Notes, catalog Search term, 
		//picture URLs, Buyer Quantity Limit
		populateAnAttribute("Ebay Condition", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Ebay Catalog Search Term", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Ebay Buyer Quantity Limit", "TextBox", "AdminEntered", "Number");		
	}

	@Test
	public void populateEbayAuction() throws Exception {
		//Required: Minimum Bid, Reserve Price, Buy it Now Price, 
		populateAnAttribute("Ebay Minimum Bid", "TextBox", "AdminEntered", "Number");
	}
	
	@Test
	public void populateRakutenAuction() throws Exception {
		//Required: Product ID, Product ID Type, SKU, Price, Offer Expedited Shipping
		//Conditionally Required: Seller Identifier, General Category, Category ID, ASIN, Title, Description, 
		// Manufacturer, MPN, MSRP, Main Image, Additional Images, Weight, Features, Keywords		
		populateAnAttribute("Rakuten Offer Expedited Shipping", "YesNo", "AdminEntered", "Bool");
		populateAnAttribute("Rakuten General Category", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Rakuten Category ID", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Rakuten ASIN", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Rakuten Features", "TextBox", "AdminEntered", "String");
		populateAnAttribute("Rakuten Keywords", "TextBox", "AdminEntered", "String");
	}

	private void populateAnAttribute(String name, String inputType, String valueType, String dataType) throws Exception
	{
		Attribute createdAttr = null;
		com.mozu.api.contracts.productadmin.Attribute attr = ProductAttributeGenerator.generate(name, inputType, valueType, dataType, false,  false, true);
        com.mozu.api.contracts.productadmin.Attribute updatedAttr = null;
		try
	    {
			createdAttr = AttributeFactory.getAttribute(apiContext, name.replaceAll("\\s+",""), HttpStatus.SC_OK, HttpStatus.SC_OK);
			attr.setAttributeFQN(createdAttr.getAttributeFQN());
			updatedAttr = AttributedefinitionAttributeFactory.updateAttribute(apiContext, DataViewMode.Live, attr, createdAttr.getAttributeFQN(), HttpStatus.SC_OK, HttpStatus.SC_OK);
	    }
	    catch (TestFailException te)
	    {
	    	if (te.actualReturnCode == HttpStatus.SC_NOT_FOUND)
	    	{
	    		updatedAttr = AttributedefinitionAttributeFactory.addAttribute(apiContext, DataViewMode.Live, attr, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
	    	}
	    }
		
		ProductTypeCollection productTypes = ProductTypeFactory.getProductTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
		ProductType baseProductType = productTypes.getItems().get(0);
		Boolean found = false;
		for (AttributeInProductType attrTy : baseProductType.getProperties())
		{
			if (attrTy.getAttributeFQN().equalsIgnoreCase(createdAttr.getAttributeFQN()))
			{
				found = true;
				break;
			}
		}
		
		if (!found)
		{
			AttributeInProductType attrInType = new AttributeInProductType();			
			attrInType.setAttributeFQN(createdAttr.getAttributeFQN());
			attrInType.setAttributeDetail(updatedAttr);
			attrInType.setOrder(Generator.randomInt(10, 20));
			List<AttributeInProductType> list = baseProductType.getProperties();
			list.add(attrInType);
			baseProductType.setProperties(list);
			ProductTypeFactory.updateProductType(apiContext, DataViewMode.Live, baseProductType, baseProductType.getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
		}
	}
}
