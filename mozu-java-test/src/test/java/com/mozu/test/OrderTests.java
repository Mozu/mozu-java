package com.mozu.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.fulfillment.Pickup;
import com.mozu.api.contracts.commerceruntime.fulfillment.ShippingRate;
import com.mozu.api.contracts.commerceruntime.orders.Order;
import com.mozu.api.contracts.commerceruntime.orders.OrderAction;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;
import com.mozu.api.contracts.commerceruntime.payments.PaymentAction;
import com.mozu.api.contracts.commerceruntime.returns.Return;
import com.mozu.api.contracts.commerceruntime.returns.ReturnCollection;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationCollection;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.productadmin.LocationInventoryAdjustment;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productruntime.ProductCollection;
import com.mozu.api.security.CustomerAuthenticationProfile;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.test.framework.datafactory.commerce.CartFactory;
import com.mozu.test.framework.datafactory.commerce.OrderFactory;
import com.mozu.test.framework.datafactory.commerce.ReturnFactory;
import com.mozu.test.framework.datafactory.commerce.admin.LocationFactory;
import com.mozu.test.framework.datafactory.commerce.carts.CartItemFactory;
import com.mozu.test.framework.datafactory.commerce.catalog.admin.LocationInventoryFactory;
import com.mozu.test.framework.datafactory.commerce.catalog.storefront.ProductFactory;
import com.mozu.test.framework.datafactory.commerce.customer.CustomerAccountFactory;
import com.mozu.test.framework.datafactory.commerce.orders.BillingInfoFactory;
import com.mozu.test.framework.datafactory.commerce.orders.FulfillmentActionFactory;
import com.mozu.test.framework.datafactory.commerce.orders.FulfillmentInfoFactory;
import com.mozu.test.framework.datafactory.commerce.orders.OrderItemFactory;
import com.mozu.test.framework.datafactory.commerce.orders.PackageFactory;
import com.mozu.test.framework.datafactory.commerce.orders.PaymentFactory;
import com.mozu.test.framework.datafactory.commerce.orders.PickupFactory;
import com.mozu.test.framework.datafactory.commerce.orders.ShipmentFactory;
import com.mozu.test.framework.helper.Constants;
import com.mozu.test.framework.helper.CustomerGenerator;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductGenerator;

public class OrderTests extends MozuApiTestBase {
	private static List<String> products = new ArrayList<String>(); 
	private static List<Integer> productTypes = new ArrayList<Integer>(); 
	private static List<ProductCategory> categories = new ArrayList<ProductCategory>(); 
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
		for (int i = 0; i < products.size(); i++)
		{
//			AdminProductFactory.deleteProduct(apiMsgHandler, DataViewMode.Live, products.get(i), null, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
		for (int i = 0; i < productTypes.size(); i++)
		{
//			ProductTypeFactory.deleteProductType(apiMsgHandler, DataViewMode.Live, productTypes.get(i), null, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
//        ServiceClientMessageHandler handler = ServiceClientMessageFactory.getTestClientMessage(tenantId, masterCatalogId, catalogId, null);
		for (int i = 0; i < categories.size(); i++)
		{
//			CategoryFactory.deleteCategoryById(handler,  DataViewMode.Live, categories.get(i).getCategoryId(), true, null, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);			
		}
	}

	// Log in shopper
	@Test
	public void Order_LoginShopper_Test() throws Exception {
		//get shopper api context
		ApiContext siteApiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo();
        CustomerAuthTicket ticket = CustomerAccountFactory.addAccountAndLogin(siteApiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED);        
        CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), Constants.Password);
        CustomerAuthenticationProfile shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
        siteApiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
				
		//get product
		com.mozu.api.contracts.productruntime.Product testProduct = ProductFactory.getProduct(siteApiContext, DataViewMode.Live, Constants.TESTPRODUCTCODE_STANDARD, HttpStatus.SC_OK);
		
		//add to cart
		Cart testCart = CartFactory.getOrCreateCart(siteApiContext, HttpStatus.SC_OK);
		CartItem cartItem = new CartItem();
		com.mozu.api.contracts.commerceruntime.products.Product productInCart = new com.mozu.api.contracts.commerceruntime.products.Product();
		productInCart.setProductCode(testProduct.getProductCode());
		cartItem.setProduct(productInCart);
		cartItem.setQuantity(1);
		cartItem.setFulfillmentMethod("ship");
		CartItemFactory.addItemToCart(siteApiContext, cartItem, HttpStatus.SC_OK);
		testCart = CartFactory.getOrCreateCart(siteApiContext, HttpStatus.SC_OK);
		
		//create order
		Order testOrder = OrderFactory.createOrderFromCart(siteApiContext, testCart.getId(), HttpStatus.SC_OK);
		
		configureAndSubmitOrder(siteApiContext, customerAccountAndAuthInfo.getAccount(), testOrder);
/*	    ApiContext siteApiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);	
	    String directShipLocationCode = CommerceLocationFactory.getDirectShipLocation(siteApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK).getCode();
        
        LocationCollection PickupLocationCodes = CommerceLocationFactory.getInStorePickupLocations(siteApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        String pickupLocationCode = PickupLocationCodes.getItems().get(0).getCode();

	    //Create product type
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(apiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        productTypes.add(createdPT.getId());

		Product myProduct = ProductGenerator.generate(createdPT);
        Product createdProduct = AdminProductFactory.addProduct(apiContext, DataViewMode.Live, myProduct, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        products.add(createdProduct.getProductCode());
        
        //add a category        
        Category cat = ProductCategoryGenerator.generate(Generator.randomString(4,  Generator.AlphaChars), true, null);
        
	    ApiContext cataApiContext = new MozuApiContext(tenantId, null, masterCatalogId, catalogId);	
        Category createdCat = CategoryFactory.addCategory(cataApiContext, cat, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        categories.add(ProductGenerator.generateProductCategory(createdCat.getId()));
        
        ProductInCatalogInfo proInfo = ProductGenerator.generateProductInCatalogInfo(catalogId, categories,
                Generator.randomString(6, Generator.AlphaChars), Generator.randomDecimal(20., 1000.), true, true, false,true);
        AdminProductFactory.addProductInCatalog(cataApiContext, DataViewMode.Live, proInfo, createdProduct.getProductCode(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        com.mozu.api.contracts.productruntime.Product product = ProductFactory.getProduct(siteApiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo();
        CustomerAuthTicket ticket = CustomerAccountFactory.addAccountAndLogin(siteApiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);        
        CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), Constants.Password);
        CustomerAuthenticationProfile shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
        siteApiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
        
        Cart createdCart = CartFactory.getOrCreateCart(siteApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        com.mozu.api.contracts.productruntime.Product storeFrontProduct = ProductFactory.getProduct(siteApiContext, DataViewMode.Live, createdProduct.getProductCode(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        Integer itemQty = 2;
        //This is for bug 22230
        //CartItemFactory.addItemToCart(shopperMsgHandler, CustomerGenerator.generateCartItem(storeFrontProduct, itemQty), shopperAuth.getAuthTicket(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        CartItemFactory.addItemToCart(siteApiContext, CustomerGenerator.generateCartItem(storeFrontProduct, itemQty, pickupLocationCode, "PickUp"), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        Order order = OrderFactory.createOrderFromCart(siteApiContext, createdCart.getId(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        assertEquals(order.getItems().get(0).getQuantity(), itemQty);
*/	}

	// offline order
	@Test
	public void Order_Offline_Test() throws Exception {
		//get shopper api context
		ApiContext siteApiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);
		Order testOrder = new Order();
	    CustomerAccount testCustomer = CustomerAccountFactory.getAccount(siteApiContext, 1005,  HttpStatus.SC_OK);
		testOrder.setType("Offline");
	    testOrder.setCustomerAccountId(testCustomer.getId());
	    testOrder.setIpAddress(Generator.randomIp());
		testOrder = OrderFactory.createOrder(siteApiContext, testOrder, HttpStatus.SC_OK);
	    
		OrderItem orderItem = new OrderItem();
		com.mozu.api.contracts.commerceruntime.products.Product testProduct = new com.mozu.api.contracts.commerceruntime.products.Product();
		com.mozu.api.contracts.productruntime.Product testProduct1 = ProductFactory.getProduct(siteApiContext, DataViewMode.Live, Constants.TESTPRODUCTCODE_STANDARD, HttpStatus.SC_OK);
		List<com.mozu.api.contracts.commerceruntime.products.Category> cates = new ArrayList<com.mozu.api.contracts.commerceruntime.products.Category>();
		for( com.mozu.api.contracts.productruntime.Category cat : testProduct1.getCategories())
		{
			com.mozu.api.contracts.commerceruntime.products.Category cate = new com.mozu.api.contracts.commerceruntime.products.Category();
			cate.setId(cat.getCategoryId());
			cates.add(cate);			
		}
		testProduct.setCategories(cates);
		testProduct.setDescription(testProduct1.getContent().getProductShortDescription());
		testProduct.setFulfillmentTypesSupported(testProduct1.getFulfillmentTypesSupported());
		testProduct.setGoodsType(testProduct1.getGoodsType());
		testProduct.setIsPackagedStandAlone(testProduct1.getIsPackagedStandAlone());
		testProduct.setIsTaxable(testProduct1.getIsTaxable());
		com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements measure = new com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements();
		measure.setHeight(testProduct1.getMeasurements().getPackageHeight());
		measure.setLength(testProduct1.getMeasurements().getPackageLength());
		measure.setWeight(testProduct1.getMeasurements().getPackageWeight());
		measure.setWidth(testProduct1.getMeasurements().getPackageWidth());
		testProduct.setMeasurements(measure);
		testProduct.setName(testProduct1.getContent().getProductName());
		com.mozu.api.contracts.commerceruntime.products.ProductPrice price = new com.mozu.api.contracts.commerceruntime.products.ProductPrice();
		price.setPrice(testProduct1.getPrice().getPrice());
		testProduct.setPrice(price);
		testProduct.setProductCode(testProduct1.getProductCode());
		testProduct.setProductType(testProduct1.getGoodsType());
		testProduct.setProductUsage(testProduct1.getProductUsage());
		orderItem.setProduct(testProduct);
		orderItem.setFulfillmentMethod("ship");
		orderItem.setQuantity(1);
		OrderItemFactory.createOrderItem(siteApiContext, orderItem, testOrder.getId(), HttpStatus.SC_OK);
		testOrder = OrderFactory.getOrder(siteApiContext, testOrder.getId(), HttpStatus.SC_OK);
		
		configureAndSubmitOrder(siteApiContext, testCustomer, testOrder);

	}
	
	//Anonymous shopper
//	@Test
//	public void anonymousShopperOrderTest2() throws Exception {
//	}

	void configureAndSubmitOrder(ApiContext siteApiContext, CustomerAccount testAccount, Order testOrder) throws Exception
	{
		//set billing info
		Contact billingContact = new Contact();
		billingContact.setFirstName(testAccount.getFirstName());
		billingContact.setLastNameOrSurname(testAccount.getLastName());
		billingContact.setEmail(testAccount.getEmailAddress());
		billingContact.setAddress(testAccount.getContacts().get(0).getAddress());
		billingContact.setPhoneNumbers(testAccount.getContacts().get(0).getPhoneNumbers());
		
		BillingInfo billingInfo = new BillingInfo();
		billingInfo.setPaymentType("Check");
		billingInfo.setIsSameBillingShippingAddress(false);
		billingInfo.setBillingContact(billingContact);

		BillingInfoFactory.setBillingInfo(siteApiContext, billingInfo, testOrder.getId(), HttpStatus.SC_OK);

		// set fulfillment info
		FulfillmentInfo fulfillmentInfo = new FulfillmentInfo();
		fulfillmentInfo.setIsDestinationCommercial(false);
		Contact shippingContact = new Contact();
		shippingContact.setFirstName(Generator.randomString(5, Generator.AlphaChars));
		shippingContact.setLastNameOrSurname(Generator.randomString(5, Generator.AlphaChars));
		shippingContact.setEmail(Generator.randomEmailAddress());
		shippingContact.setAddress(testAccount.getContacts().get(0).getAddress());
		shippingContact.setPhoneNumbers(testAccount.getContacts().get(0).getPhoneNumbers());
		fulfillmentInfo.setFulfillmentContact(shippingContact);
		FulfillmentInfoFactory.setFulFillmentInfo(siteApiContext, fulfillmentInfo, testOrder.getId(), HttpStatus.SC_OK);
		
		List<ShippingRate> availableShippingMethods = ShipmentFactory.getAvailableShipmentMethods(siteApiContext, testOrder.getId(), HttpStatus.SC_OK);
		fulfillmentInfo.setShippingMethodCode(availableShippingMethods.get(0).getShippingMethodCode());
		fulfillmentInfo.setShippingMethodCode(availableShippingMethods.get(0).getShippingMethodName());
		FulfillmentInfoFactory.setFulFillmentInfo(siteApiContext, fulfillmentInfo, testOrder.getId(), HttpStatus.SC_OK);
		
		//submit order
		OrderAction orderAction = new OrderAction();
		orderAction.setActionName("SubmitOrder");
		testOrder = OrderFactory.getOrder(siteApiContext, testOrder.getId(), HttpStatus.SC_OK);
//		testOrder.getBillingInfo().getBillingContact().setEmail(null);
//		testOrder.setEmail(null);
//		testOrder.getFulfillmentInfo().getFulfillmentContact().setEmail(null);
		OrderFactory.updateOrder(siteApiContext, testOrder, testOrder.getId(), HttpStatus.SC_OK);
		OrderFactory.performOrderAction(siteApiContext, orderAction, testOrder.getId(), HttpStatus.SC_OK);
	}
	
	@Test
	public void smokeOrderTest3() throws Exception {		
	    ApiContext siteApiContext = new MozuApiContext(tenantId, siteId, masterCatalogId, catalogId);	
	    ApiContext cataApiContext = new MozuApiContext(tenantId, null, masterCatalogId, catalogId);	
        for (int i = 0; i < 3; i++)
        {
            CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo(true, "98-02565-0000");
//            CustomerAccountCollection checkCustomerIdentDuplication = CustomerAccountFactory.getAccounts(shopperMsgHandler, 100, null, null, "firstname eq '" +
//                                                                       customerAccountAndAuthInfo.getAccount().getFirstName() + "' and lastname eq '" +
//                                                                       customerAccountAndAuthInfo.getAccount().getLastName() + "'", null, null, null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
//            if (checkCustomerIdentDuplication.getTotalCount() == 0)
//            {
            	CustomerAuthTicket createdCustomerAccount = CustomerAccountFactory.addAccountAndLogin(siteApiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED);
//            }
//            else
//            {
//                continue;
//            }
        
            CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), customerAccountAndAuthInfo.getPassword());
            CustomerAuthenticationProfile shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
            siteApiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
            
            Cart createdCart = CartFactory.getOrCreateCart(siteApiContext, HttpStatus.SC_OK);

            Location directShipLocation = com.mozu.test.framework.datafactory.commerce.LocationFactory.getDirectShipLocation(siteApiContext, HttpStatus.SC_OK);
            if(!directShipLocation.getSupportsInventory())
            {
            	directShipLocation.setSupportsInventory(true);
            	LocationFactory.updateLocation(apiContext, directShipLocation, directShipLocation.getCode(), HttpStatus.SC_OK);
            }
            LocationCollection PickupLocationCodes = com.mozu.test.framework.datafactory.commerce.LocationFactory.getInStorePickupLocations(siteApiContext, HttpStatus.SC_OK);
            Location pickupLocation = PickupLocationCodes.getItems().get(0);
            if(!pickupLocation.getSupportsInventory())
            {
            	pickupLocation.setSupportsInventory(true);
            	LocationFactory.updateLocation(apiContext, pickupLocation, pickupLocation.getCode(), HttpStatus.SC_OK);
            }
            ProductCollection productCollection = ProductFactory.getProducts(siteApiContext, DataViewMode.Live, HttpStatus.SC_OK);
//            if (productCollection.getTotalCount() == 0)
//            {
//                productCollection = ProductFactory.getProducts(shopperMsgHandler, null, 0, 13, null, shopperAuth.getAuthTicket(), HttpStatus.SC_OK, HttpStatus.SC_OK);
//            }
            com.mozu.api.contracts.productruntime.Product product = productCollection.getItems().get(0);
            Product adminProduct = com.mozu.test.framework.datafactory.commerce.catalog.admin.ProductFactory.getProduct(apiContext, DataViewMode.Live, product.getProductCode(), HttpStatus.SC_OK);
            adminProduct.getSeoContent().setSeoFriendlyUrl(Generator.randomURL());
            if(!adminProduct.getInventoryInfo().getManageStock())
            {
            	adminProduct.getInventoryInfo().setManageStock(true);
            	com.mozu.test.framework.datafactory.commerce.catalog.admin.ProductFactory.updateProduct(apiContext, DataViewMode.Live, adminProduct, product.getProductCode(), HttpStatus.SC_OK);
            }
            updateInventory(siteApiContext, directShipLocation.getCode(), product.getProductCode(), 100);            
            updateInventory(siteApiContext, pickupLocation.getCode(), product.getProductCode(), 50);
            CartItemFactory.addItemToCart(siteApiContext, CustomerGenerator.generateCartItem(product, 3, pickupLocation.getCode(), "PickUp"), HttpStatus.SC_CREATED);
            CartItemFactory.addItemToCart(siteApiContext, CustomerGenerator.generateCartItem(product, 2), HttpStatus.SC_CREATED);
            createdCart = CartFactory.getOrCreateCart(siteApiContext, HttpStatus.SC_OK);
            Order order = OrderFactory.createOrderFromCart(siteApiContext, createdCart.getId(), HttpStatus.SC_CREATED);            
            Contact shippingContact = CustomerGenerator.generateContact(customerAccountAndAuthInfo.getAccount().getEmailAddress(), customerAccountAndAuthInfo.getAccount().getFirstName(), customerAccountAndAuthInfo.getAccount().getLastName());
            BillingInfo billingInfo = BillingInfoFactory.setBillingInfo(siteApiContext, CustomerGenerator.generateBillingInfo(shippingContact, "Check", true), order.getId(), HttpStatus.SC_OK);
//            FulfillmentActionFactory.setFulFillmentInfo(shopperMsgHandler, CustomerGenerator.generateFulfillmentInfo(false, shippingContact, null, null), order.getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
			Thread.sleep(1000);
            List<ShippingRate> availableShippingMethods = ShipmentFactory.getAvailableShipmentMethods(siteApiContext, order.getId(), HttpStatus.SC_OK);
//            FulfillmentActionFactory.setFulFillmentInfo(shopperMsgHandler, CustomerGenerator.generateFulfillmentInfo(false, shippingContact, availableShippingMethods.get(0).getShippingMethodCode(), availableShippingMethods.get(0).getShippingMethodName()), order.getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);

            PaymentAction paymentAction = CustomerGenerator.generatePaymentAction("CreatePayment", order.getTotal(), Generator.randomString(10, Generator.NumericChars), null);
            paymentAction.setNewBillingInfo(billingInfo);
            PaymentFactory.createPaymentAction(siteApiContext, paymentAction, order.getId(), HttpStatus.SC_OK);

            List<String> getOrderActions = OrderFactory.getAvailableActions(siteApiContext, order.getId(), HttpStatus.SC_OK);
            assertEquals(getOrderActions.size(), 1);
            assertEquals("SubmitOrder", getOrderActions.get(0));

            Order getOrder = OrderFactory.performOrderAction(siteApiContext, CustomerGenerator.generateOrderAction("SubmitOrder"), order.getId(), HttpStatus.SC_OK);
            assertEquals("Accepted", getOrder.getStatus());
            assertEquals("Pending", getOrder.getPaymentStatus());
            assertEquals("NotFulfilled", getOrder.getFulfillmentStatus());
            assertEquals("None", getOrder.getReturnStatus());
            assertEquals(DateTime.now(DateTimeZone.UTC).dayOfMonth(), getOrder.getSubmittedDate().dayOfMonth());
            assertEquals(0.0, getOrder.getTotalCollected(), 0.0001);
            assertEquals(1, getOrder.getPayments().size());
            assertEquals("Check", getOrder.getPayments().get(0).getPaymentType());
            assertEquals("Pending", getOrder.getPayments().get(0).getStatus());
            assertEquals(1, getOrder.getPayments().get(0).getInteractions().size());
            assertEquals("RequestCheck", getOrder.getPayments().get(0).getInteractions().get(0).getInteractionType());
            assertEquals("CheckRequested", getOrder.getPayments().get(0).getInteractions().get(0).getStatus());
            
            List<String> getPaymentActions = PaymentFactory.getAvailablePaymentActions(siteApiContext, order.getId(),
                                                                              getOrder.getPayments().get(0).getId(), HttpStatus.SC_OK);
            assertEquals(3, getPaymentActions.size());
            assertTrue(null, getPaymentActions.get(0).equals("CapturePayment") ||
                          getPaymentActions.get(0).equals("VoidPayment") ||
                          getPaymentActions.get(0).equals("DeclinePayment"));
            assertTrue(null, getPaymentActions.get(1).equals("CapturePayment") ||
                          getPaymentActions.get(1).equals("VoidPayment") ||
                          getPaymentActions.get(1).equals("DeclinePayment"));
            assertTrue(null, getPaymentActions.get(2).equals("CapturePayment") ||
                          getPaymentActions.get(2).equals("VoidPayment") ||
                          getPaymentActions.get(2).equals("DeclinePayment"));
            PaymentAction newPaymentAction = CustomerGenerator.generatePaymentAction("CapturePayment", getOrder.getTotal(), null, null);
            Order orderPayment1 = PaymentFactory.performPaymentAction(siteApiContext, newPaymentAction, order.getId(), getOrder.getPayments().get(0).getId(), HttpStatus.SC_OK);
            assertEquals("Paid", orderPayment1.getPaymentStatus());
            assertEquals("Collected", orderPayment1.getPayments().get(0).getStatus());
            assertEquals(getOrder.getTotal(), orderPayment1.getPayments().get(0).getAmountCollected());
            assertEquals(2, orderPayment1.getPayments().get(0).getInteractions().size());
            assertEquals("Captured", orderPayment1.getPayments().get(0).getInteractions().get(1).getStatus());
            assertEquals("Capture", orderPayment1.getPayments().get(0).getInteractions().get(1).getInteractionType());
            assertEquals(newPaymentAction.getCheckNumber(), orderPayment1.getPayments().get(0).getInteractions().get(1).getCheckNumber());
            assertEquals(getOrder.getTotal(), orderPayment1.getPayments().get(0).getInteractions().get(1).getAmount());

            Order unFulfilledPickupOrder = OrderFactory.getOrder(siteApiContext, getOrder.getId(), HttpStatus.SC_OK);
            String status = unFulfilledPickupOrder.getStatus();
            if(!status.equalsIgnoreCase("accept"))
            {
            	assertEquals("Processing", status);
            }
            else
            {
            	fail();
            }
            assertEquals(pickupLocation.getCode(), unFulfilledPickupOrder.getItems().get(0).getFulfillmentLocationCode());
            assertEquals("Pickup", unFulfilledPickupOrder.getItems().get(0).getFulfillmentMethod());

            // perform pickup
            Pickup createdPickup = PickupFactory.createPickup(siteApiContext, 
        		CustomerGenerator.generatePickup(CustomerGenerator.generatePickupItem(unFulfilledPickupOrder.getItems().get(0).getProduct().getProductCode(), unFulfilledPickupOrder.getItems().get(0).getQuantity()), pickupLocation.getCode()), order.getId(), HttpStatus.SC_CREATED);
            Order performFulfillmentAction = FulfillmentActionFactory.performFulfillmentAction(siteApiContext, CustomerGenerator.generateFulfillmentAction("Pickup", null, createdPickup.getId()), order.getId(), HttpStatus.SC_OK);

            assertEquals("PartiallyFulfilled", performFulfillmentAction.getFulfillmentStatus());

            com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg = CustomerGenerator.generatePackage(availableShippingMethods.get(0).getShippingMethodCode(), 
            		availableShippingMethods.get(0).getShippingMethodName(), order.getItems().get(1).getProduct().getProductCode(), order.getItems().get(1).getQuantity());

            com.mozu.api.contracts.commerceruntime.fulfillment.Package createdPkg = PackageFactory.createPackage(siteApiContext, pkg, order.getId(), HttpStatus.SC_CREATED);
            if (!createdPkg.getShippingMethodName().equals("Flat Rate"))
            {
            	InputStream getLabel = PackageFactory.getPackageLabel(siteApiContext, order.getId(), createdPkg.getId(), HttpStatus.SC_OK);
            }
            
            Order orderShipment = FulfillmentActionFactory.performFulfillmentAction(siteApiContext, CustomerGenerator.generateFulfillmentAction("Ship", createdPkg.getId(), null), order.getId(), HttpStatus.SC_OK);
            assertEquals("Fulfilled", orderShipment.getFulfillmentStatus());
            Return createdReturn = ReturnFactory.createReturn(siteApiContext, CustomerGenerator.generateReturn("Refund", order.getId(), CustomerGenerator.generateReturnItem(orderShipment.getItems().get(0).getId(), orderShipment.getItems().get(0).getProduct(), orderShipment.getItems().get(0).getQuantity())), HttpStatus.SC_CREATED);


            ReturnCollection authReturn = ReturnFactory.performReturnActions(siteApiContext, CustomerGenerator.generateReturnAction("Authorize", createdReturn.getId()), HttpStatus.SC_OK);
            ReturnFactory.performReturnActions(siteApiContext, CustomerGenerator.generateReturnAction("Await", createdReturn.getId()), HttpStatus.SC_OK);
            Return getReturn = ReturnFactory.getReturn(siteApiContext, createdReturn.getId(), HttpStatus.SC_OK);
            getReturn.getItems().get(0).setQuantityReceived(orderShipment.getItems().get(0).getQuantity());
            getReturn = ReturnFactory.updateReturn(siteApiContext, getReturn, getReturn.getId(), HttpStatus.SC_OK);
            ReturnFactory.performReturnActions(siteApiContext, CustomerGenerator.generateReturnAction("Receive", createdReturn.getId()), HttpStatus.SC_OK);
            PaymentAction action = CustomerGenerator.generatePaymentAction("CreditPayment", getReturn.getRefundAmount(), null, getOrder.getPayments().get(0).getId());
            action.setNewBillingInfo(CustomerGenerator.generateBillingInfo(shippingContact, "check", true));
//            ReturnFactory.getPayments(shopperMsgHandler, createdReturn.getId(), null, HttpStatus.SC_OK, HttpStatus.SC_OK);
            Return createdReturnPaymentAction = ReturnFactory.createPaymentActionForReturn(siteApiContext, action, createdReturn.getId(), HttpStatus.SC_OK);
//            ReturnFactory.createPaymentActionForReturn(handler, action, returnId, authTicket, expectedCode, successCode)
            ReturnCollection refundReturn = ReturnFactory.performReturnActions(siteApiContext, CustomerGenerator.generateReturnAction("Refund", createdReturn.getId()), HttpStatus.SC_OK);
            assertEquals(refundReturn.getItems().get(0).getStatus(), "Refunded");
            List<String> returnActions = ReturnFactory.getAvailableReturnActions(siteApiContext, createdReturn.getId(), HttpStatus.SC_OK);
            assertEquals(1, returnActions.size());
            assertTrue(returnActions.get(0).contains("Close"));
            refundReturn.getItems().get(0).getItems().get(0).setQuantityReceived(1);

            Return updatedReturn = ReturnFactory.updateReturn(siteApiContext, refundReturn.getItems().get(0), refundReturn.getItems().get(0).getId(), HttpStatus.SC_OK);
            returnActions = ReturnFactory.getAvailableReturnActions(siteApiContext, createdReturn.getId(), HttpStatus.SC_OK);
            assertEquals(1, returnActions.size());
            assertTrue(returnActions.get(0).contains("Close"));
            ReturnCollection closeReturn = ReturnFactory.performReturnActions(siteApiContext, CustomerGenerator.generateReturnAction("Close", createdReturn.getId()), HttpStatus.SC_OK);
            assertEquals("Closed", closeReturn.getItems().get(0).getStatus());
    	}
	}
	
	protected static void updateInventory(ApiContext apiContext, String locationCode, String productCode, Integer absoluteQuantity) throws Exception
	{
		try
	    {
	    	LocationInventoryFactory.getLocationInventory(apiContext, DataViewMode.Live, locationCode, productCode, HttpStatus.SC_OK);
	    }
	    catch (TestFailException te)
	    {
	    	if (te.getActualReturnCode().equals("" + HttpStatus.SC_NOT_FOUND))
	    	{
	    		List<LocationInventory> list = new ArrayList<LocationInventory>();
	    		LocationInventory inv = ProductGenerator.generateLocationInventory(locationCode, productCode, absoluteQuantity);
	    		list.add(inv);
	            LocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, list, locationCode, HttpStatus.SC_CREATED);            		
	    	}
	    }
	    LocationInventoryAdjustment adjustment = ProductGenerator.generateLocationInventoryAdjustment(locationCode, productCode, "Absolute", absoluteQuantity);
	    List<LocationInventoryAdjustment> adjustments = new ArrayList<LocationInventoryAdjustment>();
	    adjustments.add(adjustment);
	    LocationInventoryFactory.updateLocationInventory(apiContext, DataViewMode.Live, adjustments, locationCode, HttpStatus.SC_OK);
	}
	
}
