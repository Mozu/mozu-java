package com.mozu.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.channels.Channel;
import com.mozu.api.contracts.commerceruntime.channels.ChannelGroup;
import com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult;
import com.mozu.api.contracts.commerceruntime.returns.Return;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;
import com.mozu.api.contracts.content.Document;
import com.mozu.api.contracts.content.DocumentListType;
import com.mozu.api.contracts.content.PropertyType;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.customer.AddressValidationRequest;
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerAttribute;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CustomerSegment;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.customer.InStockNotificationSubscription;
import com.mozu.api.contracts.customer.credit.Credit;
import com.mozu.api.contracts.customer.credit.CreditTransaction;
import com.mozu.api.contracts.location.LocationUsage;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.ListView;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.Category;
import com.mozu.api.contracts.productadmin.DiscountTarget;
import com.mozu.api.contracts.productadmin.Facet;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.productadmin.LocationInventoryAdjustment;
import com.mozu.api.contracts.productadmin.MasterCatalog;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductExtra;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.PublishingScope;
import com.mozu.api.contracts.productadmin.SearchSettings;
import com.mozu.api.contracts.shippingruntime.RateRequest;
import com.mozu.api.contracts.sitesettings.application.Application;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.contracts.tenant.TenantCollection;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.CustomerAuthenticationProfile;
import com.mozu.api.security.CustomerAuthenticator;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.test.framework.core.Environment;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.test.framework.datafactory.*;
import com.mozu.test.framework.helper.CustomerGenerator;
import com.mozu.test.framework.helper.Generator;
import com.mozu.test.framework.helper.ProductCategoryGenerator;
import com.mozu.test.framework.helper.ProductGenerator;
import com.mozu.test.framework.helper.ProductTypeGenerator;

public class GeneralTests extends MozuApiTestBase {

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
        CustomerAccountAndAuthInfo customerAccountAndAuthInfo =  CustomerGenerator.generateCustomerAccountAndAuthInfo(true, "98-02565-0000");
    	CustomerAccountFactory.addAccountAndLogin(apiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), customerAccountAndAuthInfo.getPassword());
        shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
        shopperApiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(localApiContext, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
		if(mc.getProductPublishingMode().equalsIgnoreCase("pending"))
		{
	        PublishingScope scope = ProductGenerator.generatePublishingScope(true, null);
	        PublishingScopeFactory.publishDrafts(localApiContext, DataViewMode.Pending, scope, HttpStatus.SC_OK, HttpStatus.SC_OK);
			mc.setProductPublishingMode("Live");
			MasterCatalogFactory.updateMasterCatalog(localApiContext, mc, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);			
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AdjustmentTests() throws Exception {
        AdjustmentFactory.applyAdjustment(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        AdjustmentFactory.applyShippingAdjustment(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        AdjustmentFactory.removeAdjustment(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        AdjustmentFactory.removeShippingAdjustment(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);       
	}

	@Test
	public void AddressValidationRequestTests() throws Exception {
        AddressValidationRequest request = new AddressValidationRequest();
        request.setAddress(CustomerGenerator.generateAddress("tx"));
        AddressValidationRequestFactory.validateAddress(apiContext,  request, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void AdminFacetTests() throws Exception {
        AdminFacetFactory.getFacet(apiContext, Generator.randomInt(500, 600), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        Facet facet = new Facet();
        AdminFacetFactory.deleteFacetById(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        AdminFacetFactory.getFacetCategoryList(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_OK, HttpStatus.SC_OK);
/*bug 27015*/        AdminFacetFactory.addFacet(apiContext, facet, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        AdminFacetFactory.updateFacet(apiContext, facet, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void AdminLocationInventoryTests() throws Exception {
        List<LocationInventory> list = new ArrayList<LocationInventory>();
        list.add(new LocationInventory());
/*bug 35021*/   AdminLocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        AdminLocationInventoryFactory.deleteLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        AdminLocationInventoryFactory.getLocationInventory(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        AdminLocationInventoryFactory.getLocationInventories(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
        List<LocationInventoryAdjustment> list1 = new ArrayList<LocationInventoryAdjustment>();
        LocationInventoryAdjustment adjust = new LocationInventoryAdjustment();
        adjust.setProductCode(Generator.randomString(5, Generator.AlphaChars));
        list1.add(adjust);
        AdminLocationInventoryFactory.updateLocationInventory(apiContext, DataViewMode.Live, list1, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void AdminUserTests() throws Exception {
        TenantCollection tenants = AdminUserFactory.getTenantScopesForUser(apiContext, Generator.randomString(20, Generator.AlphaNumericChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
        assertEquals(tenants.getTotalCount(), new Integer(0));
        AdminUserFactory.getUser(apiContext, Generator.randomString(20, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ApplicationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        Application app = ApplicationFactory.thirdPartyGetApplication(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ApplicationFactory.thirdPartyUpdateApplication(localApiContext, app, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test	public void AppliedDiscountTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        AppliedDiscountFactory.removeCoupon(localApiContext, Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        AppliedDiscountFactory.applyCoupon(localApiContext, Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        AppliedDiscountFactory.removeCoupons(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void AttributedefinitionAttributeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributedefinitionAttributeFactory.addAttribute(localApiContext, new com.mozu.api.contracts.productadmin.Attribute(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        AttributedefinitionAttributeFactory.deleteAttribute(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        AttributedefinitionAttributeFactory.getAttribute(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        AttributedefinitionAttributeFactory.getAttributes(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        AttributedefinitionAttributeFactory.updateAttribute(localApiContext, new com.mozu.api.contracts.productadmin.Attribute(), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void AttributeTypeRuleTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributeTypeRuleFactory.getAttributeTypeRules(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void AttributeVocabularyValueTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributeVocabularyValueFactory.getAttributeVocabularyValues(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        AttributeVocabularyValueFactory.addAttributeVocabularyValue(localApiContext, new AttributeVocabularyValue(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        AttributeVocabularyValueFactory.deleteAttributeVocabularyValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        AttributeVocabularyValueFactory.updateAttributeVocabularyValue(localApiContext, new AttributeVocabularyValue(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void BillingInfoTests() throws Exception {
        BillingInfoFactory.getBillingInfo(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        BillingInfoFactory.setBillingInfo(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void CardTests() throws Exception {
        CardFactory.getAccountCards(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CardFactory.addAccountCard(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        CardFactory.deleteAccountCard(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        CardFactory.updateAccountCard(apiContext, null, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void CartItemTests() throws Exception {
        CartItemFactory.getCartItems(shopperApiContext,  HttpStatus.SC_OK, HttpStatus.SC_OK);
        CartItemFactory.addItemToCart(shopperApiContext, new CartItem(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        CartItemFactory.removeAllCartItems(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        CartItemFactory.updateCartItem(shopperApiContext, new CartItem(), Generator.randomString(6,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        CartItemFactory.updateCartItemQuantity(shopperApiContext, Generator.randomString(6,  Generator.AlphaChars), 2,  HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        CartItemFactory.deleteCartItem(shopperApiContext, Generator.randomString(6,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
 	}

	@Test
	public void CartTests() throws Exception {
		Cart cart = CartFactory.getOrCreateCart(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		CartFactory.deleteCart(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		CartFactory.getOrCreateCart(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		CartFactory.getCartSummary(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		CartFactory.getUserCart(apiContext, shopperAuth.getCustomerAccount().getUserId(), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		CartFactory.getUserCartSummary(apiContext, shopperAuth.getCustomerAccount().getUserId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
		CartFactory.updateCart(shopperApiContext, new Cart(), HttpStatus.SC_OK, HttpStatus.SC_OK);
		CartFactory.deleteCurrentCart(shopperApiContext, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);
	}
	
	@Test
	public void CartAppliedDiscountTests() throws Exception {
		CartsAppliedDiscountFactory.applyCoupon(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		CartsAppliedDiscountFactory.removeCoupon(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		CartsAppliedDiscountFactory.removeCoupons(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void ChangeMessageTests() throws Exception {
		ChangeMessageFactory.getMessages(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ChangeMessageFactory.removeMessage(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
		ChangeMessageFactory.removeAllMessages(shopperApiContext, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void ChannelTests() throws Exception {
		Channel ch = new Channel();
		ch.setTenantId(tenantId);
        ChannelFactory.getChannels(apiContext, null, null, null, null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ChannelFactory.createChannel(apiContext, ch, HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        ChannelFactory.deleteChannel(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        ChannelFactory.getChannel(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        ChannelFactory.updateChannel(apiContext, ch, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ChannelGroupTests() throws Exception {
        ChannelGroupFactory.getChannelGroups(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ChannelGroupFactory.createChannelGroup(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        ChannelGroupFactory.deleteChannelGroup(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        ChannelGroupFactory.getChannelGroups(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ChannelGroupFactory.updateChannelGroup(apiContext, new ChannelGroup(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void CheckoutSettingsTests() throws Exception {
        CheckoutSettingsFactory.getCheckoutSettings(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void CreditAuditEntryTests() throws Exception {
        CreditAuditEntryFactory.getAuditEntries(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void CreditTests() throws Exception {
		/*bug 35020*/CreditFactory.addCredit(apiContext, new Credit(), HttpStatus.SC_INTERNAL_SERVER_ERROR, HttpStatus.SC_OK);
        CreditFactory.getCredits(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        CreditFactory.associateCreditToShopper(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        CreditFactory.getCredit(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        CreditFactory.updateCredit(apiContext, null, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        CreditFactory.deleteCredit(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void CreditTransactionTests() throws Exception {
        CreditTransactionFactory.getTransactions(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CreditTransactionFactory.addTransaction(apiContext, new CreditTransaction(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_CREATED);
	}

	@Test
	public void CommerceLocationTests() throws Exception {
		CommerceLocationFactory.getDirectShipLocation(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void CustomerAttributeTests() throws Exception {
        CustomerAttributeFactory.getAccountAttributes(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerAttribute attr = new CustomerAttribute();
        CustomerAttributeFactory.addAccountAttribute(apiContext, new CustomerAttribute(), shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        CustomerAttributeFactory.updateAccountAttribute(apiContext, new CustomerAttribute(), shopperAuth.getCustomerAccount().getId(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void CustomerCheckoutSettingsTests() throws Exception {
        CustomerCheckoutSettingsFactory.getCustomerCheckoutSettings(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerCheckoutSettingsFactory.updateCustomerCheckoutSettings(apiContext, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void CustomerContactTests() throws Exception {
        CustomerContactFactory.getAccountContacts(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerContactFactory.addAccountContact(apiContext, new CustomerContact(), shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        CustomerContactFactory.updateAccountContact(apiContext, new CustomerContact(), shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        CustomerContactFactory.deleteAccountContact(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void CustomerNoteTests() throws Exception {
        CustomerNoteFactory.getAccountNotes(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        CustomerNoteFactory.addAccountNote(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        CustomerNoteFactory.updateAccountNote(apiContext, null, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        /*bug 34991*/        CustomerNoteFactory.deleteAccountNote(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void CustomerCustomerSegmentTests() throws Exception {
		CustomerCustomerSegmentFactory.addSegment(apiContext, new CustomerSegment(), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
		CustomerCustomerSegmentFactory.getSegment(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		CustomerCustomerSegmentFactory.getSegments(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		CustomerCustomerSegmentFactory.updateSegment(apiContext, new CustomerSegment(), Generator.randomInt(100, 200), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
		CustomerCustomerSegmentFactory.deleteSegment(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		CustomerCustomerSegmentFactory.deleteSegmentAccounts(apiContext, new ArrayList<Integer>(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
		CustomerCustomerSegmentFactory.addSegmentAccounts(apiContext, new ArrayList<Integer>(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_CREATED);
	}
	
	@Test
	public void CustomerSegmentTests() throws Exception {
		CustomerSegmentFactory.getAccountSegments(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void DigitalPackageTests() throws Exception {
		DigitalPackageFactory.createDigitalPackage(apiContext, new DigitalPackage(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		DigitalPackageFactory.deleteDigitalPackage(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
		DigitalPackageFactory.getAvailableDigitalPackageFulfillmentActions(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		DigitalPackageFactory.updateDigitalPackage(apiContext, new DigitalPackage(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void DiscountTests() throws Exception {
        DiscountFactory.getDiscounts(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DiscountFactory.createDiscount(apiContext, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_CREATED);
        DiscountFactory.deleteDiscount(apiContext, Generator.randomInt(2000, 3000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_NO_CONTENT);
        DiscountFactory.generateRandomCoupon(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DiscountFactory.getDiscount(apiContext, DataViewMode.Live, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        DiscountFactory.updateDiscount(apiContext, null, Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        DiscountFactory.updateDiscountContent(apiContext, null, Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        DiscountFactory.getDiscountContent(apiContext, DataViewMode.Live, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void DiscountTargetTests() throws Exception {
		DiscountTargetFactory.getDiscountTarget(apiContext, DataViewMode.Live, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		DiscountTargetFactory.updateDiscountTarget(apiContext, new DiscountTarget(), Generator.randomInt(1000, 2000), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void DocumentDraftSummaryTests() throws Exception {
        DocumentDraftSummaryFactory.listDocumentDraftSummaries(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DocumentDraftSummaryFactory.deleteDocumentDrafts(apiContext, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DocumentDraftSummaryFactory.publishDocuments(apiContext, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void DocumentTests() throws Exception {
        DocumentFactory.getDocuments(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        DocumentFactory.createDocument(apiContext, DataViewMode.Live, new Document(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        DocumentFactory.deleteDocument(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        DocumentFactory.deleteDocumentContent(apiContext,  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        DocumentFactory.getDocument(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        DocumentFactory.getDocumentContent(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        /*bug 35041*/        DocumentFactory.updateDocument(apiContext, new Document(), Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        DocumentFactory.updateDocumentContent(apiContext, null, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void DocumentListTests() throws Exception {
        DocumentListFactory.getDocumentLists(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DocumentListFactory.getDocumentList(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void DocumentListTypeTests() throws Exception {
		DocumentListTypeFactory.createDocumentListType(apiContext, DataViewMode.Live, new DocumentListType(), HttpStatus.SC_OK, HttpStatus.SC_OK);
		DocumentListTypeFactory.updateDocumentListType(apiContext, new DocumentListType(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void DocumentTypeTests() throws Exception {
        DocumentTypeFactory.getDocumentTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
        DocumentTypeFactory.getDocumentType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void DocumentTreeTests() throws Exception {
		DocumentTreeFactory.getTreeDocument(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		DocumentTreeFactory.getTreeDocumentContent(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		/*bug 35018*/DocumentTreeFactory.updateTreeDocumentContent(apiContext, new ByteArrayInputStream( Generator.randomString(15, Generator.AlphaChars).getBytes( Charset.defaultCharset() )), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
		
	@Test
	public void EntityContainerTests() throws Exception {
		EntityContainerFactory.getEntityContainer(apiContext, Generator.randomString(15, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityContainerFactory.getEntityContainers(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void EntityFactoryTests() throws Exception {
		EntityFactory.deleteEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityFactory.getEntities(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityFactory.getEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityFactory.insertEntity(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityFactory.updateEntity(apiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void EntityListTests() throws Exception {
		EntityListFactory.createEntityList(apiContext, new EntityList(), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		EntityListFactory.deleteEntityList(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityListFactory.getEntityList(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityListFactory.getEntityLists(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		EntityListFactory.updateEntityList(apiContext, new EntityList(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void EventDeliverySummaryTests() throws Exception {
		EventDeliverySummaryFactory.getDeliveryAttemptSummaries(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		EventDeliverySummaryFactory.getDeliveryAttemptSummary(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void EventNotificationTests() throws Exception {
        EventNotificationFactory.getEvents(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        EventNotificationFactory.getEvent(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void FacetTests() throws Exception {
        FacetFactory.getFacets(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void FulfillmentInfoTests() throws Exception {
		FulfillmentInfoFactory.getFulfillmentInfo(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
		FulfillmentInfoFactory.setFulFillmentInfo(apiContext, new FulfillmentInfo(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void FulfillmentActionTests() throws Exception {
        FulfillmentAction action = new FulfillmentAction();
        action.setActionName("SP");
        FulfillmentActionFactory.performFulfillmentAction(apiContext, action, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void GeneralSettingsTests() throws Exception {
        GeneralSettingsFactory.getGeneralSettings(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        GeneralSettingsFactory.updateGeneralSettings(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void InStockNotificationSubscriptionTests() throws Exception {
        InStockNotificationSubscriptionFactory.getInStockNotificationSubscriptions(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        InStockNotificationSubscriptionFactory.addInStockNotificationSubscription(apiContext, new InStockNotificationSubscription(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        InStockNotificationSubscriptionFactory.getInStockNotificationSubscription(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        InStockNotificationSubscriptionFactory.deleteInStockNotificationSubscription(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ListViewTests() throws Exception {
		ListViewFactory.createEntityListView(apiContext, new ListView(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		ListViewFactory.getEntityListView(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		ListViewFactory.getViewEntities(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		ListViewFactory.getViewEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		ListViewFactory.getViewEntityContainer(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		ListViewFactory.getViewEntityContainers(apiContext,  Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
		ListViewFactory.updateEntityListView(apiContext, new ListView(),  Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void LocationInventoryTests() throws Exception {
        LocationInventoryFactory.getLocationInventories(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK, HttpStatus.SC_OK);
        List<LocationInventory> list = new ArrayList<LocationInventory>();
        list.add(new LocationInventory());
        /*bug 35021*/LocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_INTERNAL_SERVER_ERROR, HttpStatus.SC_OK);
        LocationInventoryFactory.deleteLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        LocationInventoryFactory.getLocationInventory(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        LocationInventoryFactory.updateLocationInventory(apiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void LocationUsageTests() throws Exception {
        LocationUsageFactory.getLocationUsages(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        LocationUsageFactory.getLocationUsage(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        LocationUsageFactory.updateLocationUsage(apiContext, new LocationUsage(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void OrderAttributeTests() throws Exception {
        OrderAttributeFactory.getOrderAttributes(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderAttributeFactory.createOrderAttributes(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderAttributeFactory.updateOrderAttributes(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void OrderItemTests() throws Exception {
        OrderItemFactory.getOrderItems(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderItemFactory.createOrderItem(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        OrderItemFactory.deleteOrderItem(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderItemFactory.getOrderItem(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderItemFactory.updateItemFulfillment(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        OrderItemFactory.updateItemProductPrice(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomDecimal(50., 100.), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderItemFactory.updateItemQuantity(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderItemFactory.updateOrderItemDiscount(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void OrderNoteTests() throws Exception {
        OrderNoteFactory.getOrderNotes(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderNoteFactory.createOrderNote(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderNoteFactory.deleteOrderNote(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderNoteFactory.getOrderNote(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrderNoteFactory.updateOrderNote(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void OrdersPackageTests() throws Exception {
        OrdersPackageFactory.getPackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersPackageFactory.createPackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        OrdersPackageFactory.deletePackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersPackageFactory.getAvailablePackageFulfillmentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersPackageFactory.getPackageLabel(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersPackageFactory.updatePackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void OrdersShipmentTests() throws Exception {
        OrdersShipmentFactory.getAvailableShipmentMethods(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersShipmentFactory.createPackageShipments(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        OrdersShipmentFactory.deleteShipment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        OrdersShipmentFactory.getShipment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void OrderValidationResultTests() throws Exception {
		OrderValidationResultFactory.addValidationResult(apiContext, new OrderValidationResult(), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
		OrderValidationResultFactory.getValidationResults(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void PackageTests() throws Exception {
        PackageFactory.getPackage(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PackageFactory.createPackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        PackageFactory.deletePackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PackageFactory.getPackageLabel(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PackageFactory.updatePackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void PaymentTests() throws Exception {
        PaymentFactory.getPayments(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PaymentFactory.createPaymentAction(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        PaymentFactory.getAvailablePaymentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PaymentFactory.getPayment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PaymentFactory.performPaymentAction(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void PaymentSettingsTests() throws Exception {
        PaymentSettingsFactory.getThirdPartyPaymentWorkflows(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void PlatformApplicationTests() throws Exception {
		PlatformApplicationFactory.getApplication(apiContext, Environment.getConfigValue("AppId"), HttpStatus.SC_OK, HttpStatus.SC_OK);
		PlatformApplicationFactory.getApplication(apiContext, Generator.randomString(12, Generator.AlphaChars), HttpStatus.SC_UNAUTHORIZED, HttpStatus.SC_OK);
		PlatformApplicationFactory.updateApplication(apiContext, null, Generator.randomString(12, Generator.AlphaChars), HttpStatus.SC_UNAUTHORIZED, HttpStatus.SC_OK);
			
	}
	
	@Test
	public void PickupTests() throws Exception {
        PickupFactory.getPickup(apiContext,  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PickupFactory.getAvailablePickupFulfillmentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PickupFactory.createPickup(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        PickupFactory.deletePickup(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        PickupFactory.updatePickup(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void ProductExtraTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductExtraFactory.getExtras(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        ProductExtraFactory.addExtra(localApiContext, DataViewMode.Pending, new ProductExtra(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void ProductOptionTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductOptionFactory.getOptions(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ProductPropertyTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductPropertyFactory.getProperties(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ProductReservationTests() throws Exception {
        ProductReservationFactory.getProductReservations(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ProductReservationFactory.addProductReservations(apiContext, DataViewMode.Pending, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void ProductSearchResultTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductType myPT = ProductTypeGenerator.generate(Generator.randomString(5, Generator.AlphaChars));
        ProductType createdPT = ProductTypeFactory.addProductType(localApiContext, DataViewMode.Live, myPT, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);

		Product myProduct1 = ProductGenerator.generate("ab"+Generator.randomString(5, Generator.AlphaChars), createdPT);
		Product myProduct2 = ProductGenerator.generate("ab"+Generator.randomString(5, Generator.AlphaChars), createdPT);		
        Product createdProduct1 = AdminProductFactory.addProduct(localApiContext, DataViewMode.Live, myProduct1, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        Product createdProduct2 = AdminProductFactory.addProduct(localApiContext, DataViewMode.Live, myProduct2, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        
        //add a category        
        Category cat = ProductCategoryGenerator.generate(Generator.randomString(4,  Generator.AlphaChars), true, null);
        Category createdCat = CategoryFactory.addCategory(apiContext, cat, HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        List<ProductCategory> categories = new ArrayList<ProductCategory>();
        categories.add(ProductGenerator.generateProductCategory(createdCat.getId()));
        
        ProductInCatalogInfo proInfo = ProductGenerator.generateProductInCatalogInfo(catalogId, categories,
                Generator.randomString(6, Generator.AlphaChars), Generator.randomDecimal(20., 1000.), true, true, false,true);
        AdminProductFactory.addProductInCatalog(apiContext, DataViewMode.Live, proInfo, createdProduct1.getProductCode(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        AdminProductFactory.addProductInCatalog(apiContext, DataViewMode.Live, proInfo, createdProduct2.getProductCode(), HttpStatus.SC_CREATED, HttpStatus.SC_CREATED);
        
        ProductSearchResultFactory.suggest(apiContext, "ab", "cd", null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ProductSearchResultFactory.search(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void ProductTypeExtraTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductTypeExtraFactory.getExtras(localApiContext, DataViewMode.Live, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ProductTypeOptionTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductTypeOptionFactory.getOptions(localApiContext, DataViewMode.Live, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void ProductTypePropertyTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductTypePropertyFactory.getProperties(localApiContext, DataViewMode.Live, Generator.randomInt(600, 700), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ProductTypeVariationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductTypeVariationFactory.generateProductVariations(localApiContext, null, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void ProductVariationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductVariationFactory.getProductVariations(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        ProductVariationFactory.deleteProductVariation(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        ProductVariationFactory.addProductVariationLocalizedDeltaPrice(localApiContext,  DataViewMode.Live, new ProductVariationDeltaPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void PropertyTypeTests() throws Exception {
		PropertyTypeFactory.createPropertyType(apiContext, new PropertyType(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
		PropertyTypeFactory.getPropertyType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		PropertyTypeFactory.getPropertyTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK, HttpStatus.SC_OK);
/*bug 35033*/		PropertyTypeFactory.updatePropertyType(apiContext, DataViewMode.Live, new PropertyType(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
		PropertyTypeFactory.deletePropertyType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void PublishingScopeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(localApiContext, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Pending");
		MasterCatalogFactory.updateMasterCatalog(localApiContext, mc, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
        List<String> list = new ArrayList<String>();
        list.add(Generator.randomString(5, Generator.AlphaChars));
        PublishingScope scope = ProductGenerator.generatePublishingScope(false, list);
        PublishingScopeFactory.publishDrafts(localApiContext, DataViewMode.Pending, scope, HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        PublishingScopeFactory.discardDrafts(localApiContext, DataViewMode.Pending, scope, HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Live");
		MasterCatalogFactory.updateMasterCatalog(localApiContext, mc, masterCatalogId, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}

	@Test
	public void ReferenceDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ReferenceDataFactory.getBehaviors(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getAddressSchema(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getAddressSchemas(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getBehaviorCategories(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getBehaviorCategory(localApiContext, Generator.randomInt(10, 20), HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getContentLocales(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getCountries(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getCurrencies(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getTimeZones(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getTopLevelDomains(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReferenceDataFactory.getUnitsOfMeasure(localApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	

	@Test
	public void ReturnTests() throws Exception {
        ReturnFactory.getReturns(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        ReturnFactory.createPaymentActionForReturn(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        ReturnFactory.createReturn(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        ReturnFactory.deleteReturn(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.getAvailablePaymentActionsForReturn(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.getAvailableReturnActions(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.getPayment(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.getPayments(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.performPaymentActionForReturn(apiContext, null, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        ReturnFactory.performReturnActions(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        ReturnFactory.getReturnItem(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.getReturnItems(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.createReturnItem(apiContext, new ReturnItem(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ReturnFactory.updateReturn(apiContext, new Return(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
/*bug 35032*/        ReturnFactory.deleteOrderItem(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void SearchTests() throws Exception {
		SearchFactory.getSettings(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		SearchFactory.updateSettings(apiContext, new SearchSettings(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void ShipmentTests() throws Exception {
        ShipmentFactory.getShipment(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        ShipmentFactory.createPackageShipments(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        ShipmentFactory.deleteShipment(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}

	@Test
	public void ShippingTests() throws Exception {
		ShippingFactory.getRates(apiContext, new RateRequest(), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}
	
	@Test
	public void SiteDataTests() throws Exception {
        SiteDataFactory.getDBValue(apiContext, "ProductCode", HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        SiteDataFactory.createDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        SiteDataFactory.deleteDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);
        SiteDataFactory.updateDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void SiteShippingHandlingFeeTests() throws Exception {
        SiteShippingHandlingFeeFactory.getOrderHandlingFee(apiContext, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        SiteShippingHandlingFeeFactory.createOrderHandlingFee(apiContext, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        SiteShippingHandlingFeeFactory.updateOrderHandlingFee(apiContext, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);        
	}
	
	@Test
	public void SiteShippingSettingsTests() throws Exception {
        SiteShippingSettingsFactory.getSiteShippingSettings(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void StoreFrontCategoryTests() throws Exception {
        StorefrontCategoryFactory.getCategories(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        StorefrontCategoryFactory.getCategoryTree(shopperApiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        StorefrontCategoryFactory.getCategory(shopperApiContext, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void SubscriptionTests() throws Exception {
		SubscriptionFactory.getSubscriptions(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void TaxableTerritoryTests() throws Exception {
		try
		{
	        TaxableTerritoryFactory.getTaxableTerritories(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
		}
		catch (TestFailException te)
	    {
	    	if (te.actualReturnCode == HttpStatus.SC_NOT_FOUND)
	    	{
	    	}
			
		}
        TaxableTerritoryFactory.addTaxableTerritory(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        TaxableTerritoryFactory.updateTaxableTerritories(apiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void TenantAdminUserAuthTicketTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		UserAuthInfo info = new UserAuthInfo();
		info.setEmailAddress(email);
		info.setPassword(password);
		TenantAdminUserAuthTicket ticket = TenantAdminUserAuthTicketFactory.createUserAuthTicket(localApiContext, info, HttpStatus.SC_OK, HttpStatus.SC_OK);
		TenantAdminUserAuthTicket refreshTicket = TenantAdminUserAuthTicketFactory.refreshAuthTicket(localApiContext, ticket, HttpStatus.SC_OK, HttpStatus.SC_OK);
		TenantAdminUserAuthTicketFactory.deleteUserAuthTicket(localApiContext, refreshTicket.getRefreshToken(), HttpStatus.SC_OK, HttpStatus.SC_OK);
	}
	
	@Test
	public void TenantDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        TenantDataFactory.getDBValue(localApiContext, "CreatedDate", HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        TenantDataFactory.createDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        TenantDataFactory.deleteDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);
        TenantDataFactory.updateDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void TenantTests() throws Exception {
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = tenantId - 10; i< tenantId + 10; i++)
		{
			ApiContext localApiContext = new MozuApiContext();
			try
			{
				Tenant tn = TenantFactory.getTenant(localApiContext, i, HttpStatus.SC_OK, HttpStatus.SC_OK);
				list.add(tn.getId());				
			}
			catch (TestFailException te)
		    {
		    	if (te.actualReturnCode == HttpStatus.SC_NOT_FOUND | te.actualReturnCode == HttpStatus.SC_UNAUTHORIZED)
		    	{
		    		continue;
		    	}
				
			}
			j++;
		}
		String rtnMessage = "These tenants have SDKTest installed: ";
		for (int i = 0; i<list.size(); i++)
		{
			rtnMessage += list.get(i) + ",";
		}
		System.out.print(rtnMessage);
    }

	@Test
	public void TransactionTests() throws Exception {
        TransactionFactory.getTransactions(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK, HttpStatus.SC_OK);
        TransactionFactory.addTransaction(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        TransactionFactory.removeTransaction(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}

	@Test
	public void UserDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		UserDataFactory.createDBValue(localApiContext, "'"+DateTime.now().toString()+"'", "CreatedDate", HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        UserDataFactory.getDBValue(localApiContext, "CreatedDate", HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        UserDataFactory.deleteDBValue(localApiContext, "CreatedDate", HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        UserDataFactory.updateDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), "CreatedDate", HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void ViewTests() throws Exception {
		ViewFactory.getViewDocuments(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
	
	@Test
	public void VisitTests() throws Exception {
        VisitFactory.getVisits(apiContext, HttpStatus.SC_OK, HttpStatus.SC_OK);
        VisitFactory.addVisit(apiContext, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        VisitFactory.getVisit(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        VisitFactory.updateVisit(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
	}
	
	@Test
	public void WishlistTests() throws Exception {
        WishlistFactory.createWishlist(shopperApiContext, null, HttpStatus.SC_CONFLICT, HttpStatus.SC_CREATED);
        WishlistFactory.getWishlists(shopperApiContext, null,  null,  null,  null,  null,  null, null, HttpStatus.SC_OK, HttpStatus.SC_OK);
        WishlistFactory.deleteWishlist(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_NO_CONTENT);
        WishlistFactory.getWishlist(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistFactory.getWishlistByName(shopperApiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
        WishlistFactory.updateWishlist(shopperApiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
	}

	@Test
	public void WishlistItemTests() throws Exception {
		
        WishlistItemFactory.addItemToWishlist(shopperApiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_OK);
        WishlistItemFactory.getWishlistItems(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), null, null, null, null, null, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistItemFactory.removeAllWishlistItems(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistItemFactory.deleteWishlistItem(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistItemFactory.getWishlistItem(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistItemFactory.updateWishlistItem(shopperApiContext, null, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_CONFLICT, HttpStatus.SC_CONFLICT);
        WishlistItemFactory.updateWishlistItemQuantity(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), 5, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_OK);
        WishlistItemFactory.getWishlistItemsByWishlistName(shopperApiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), null, null, null, null, null, HttpStatus.SC_NOT_FOUND, HttpStatus.SC_OK);
	}
}
