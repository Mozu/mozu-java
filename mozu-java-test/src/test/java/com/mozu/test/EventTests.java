package com.mozu.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.productadmin.CategoryPagedCollection;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.events.EventManager;
import com.mozu.api.security.CustomerAuthenticationProfile;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.AdminProductFactory;
import com.mozu.test.framework.datafactory.CategoryFactory;
import com.mozu.test.framework.datafactory.CustomerAccountFactory;
import com.mozu.test.framework.datafactory.ProductTypeFactory;
import com.mozu.test.framework.handlers.ProductEventHandlerImpl;
import com.mozu.test.framework.helper.CustomerGenerator;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductGenerator;
import com.mozu.test.framework.helper.ProductTypeGenerator;

public class EventTests extends MozuApiTestBase {

	private static ApiContext shopperApiContext;
	private static CustomerAuthenticationProfile shopperAuth;
	private static ApiContext apiContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		apiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);
		shopperApiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);		
//		shopperMsgHandler = ServiceClientMessageFactory.getTestClientMessage(tenantId, masterCatalogId, catalogId, siteId);
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo(true, "98-02565-0000");
    	CustomerAccountFactory.addAccountAndLogin(apiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), customerAccountAndAuthInfo.getPassword());
        //shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
        apiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
        EventManager.getInstance().registerHandler(new ProductEventHandlerImpl());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void productEventTests() throws Exception {
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
		Product myProduct = ProductGenerator.generate(createdPT);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        CategoryPagedCollection cates = CategoryFactory.getCategories(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
        List<ProductCategory> listCat = new ArrayList<ProductCategory>(); 
        listCat.add(ProductGenerator.generateProductCategory(cates.getItems().get(0).getId()));
        
        ProductInCatalogInfo proInfo = ProductGenerator.generateProductInCatalogInfo(catalogId, listCat,
                Generator.randomString(6, Generator.AlphaChars), Generator.randomDecimal(20., 1000.), true, true, false,true);
        AdminProductFactory.addProductInCatalog(apiContext, DataViewMode.Live, proInfo, createdProduct.getProductCode(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        while(true) {}
        //Thread.sleep(5000);
	}

}
