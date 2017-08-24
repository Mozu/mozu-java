package com.mozu.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
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
import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.JsonNode;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket;
import com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicketRequest;
import com.mozu.api.contracts.commerceruntime.carts.Cart;
import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.channels.Channel;
import com.mozu.api.contracts.commerceruntime.channels.ChannelGroup;
import com.mozu.api.contracts.commerceruntime.fulfillment.DigitalPackage;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult;
import com.mozu.api.contracts.commerceruntime.refunds.Refund;
import com.mozu.api.contracts.commerceruntime.returns.Return;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;
import com.mozu.api.contracts.content.Document;
import com.mozu.api.contracts.content.DocumentList;
import com.mozu.api.contracts.content.DocumentListType;
import com.mozu.api.contracts.content.DocumentType;
import com.mozu.api.contracts.content.PropertyType;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.customer.AddressValidationRequest;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerAttribute;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CustomerLoginInfo;
import com.mozu.api.contracts.customer.CustomerSegment;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.customer.InStockNotificationSubscription;
import com.mozu.api.contracts.customer.PasswordInfo;
import com.mozu.api.contracts.customer.ResetPasswordInfo;
import com.mozu.api.contracts.customer.credit.Credit;
import com.mozu.api.contracts.customer.credit.CreditTransaction;
import com.mozu.api.contracts.installedapplications.TenantExtensions;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationUsage;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.ListView;
import com.mozu.api.contracts.paymentservice.PublicCard;
import com.mozu.api.contracts.paymentservice.response.SyncResponse;
import com.mozu.api.contracts.productadmin.AttributeInProductType;
import com.mozu.api.contracts.productadmin.AttributeLocalizedContent;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent;
import com.mozu.api.contracts.productadmin.Category;
import com.mozu.api.contracts.productadmin.DiscountTarget;
import com.mozu.api.contracts.productadmin.DynamicExpression;
import com.mozu.api.contracts.productadmin.Expression;
import com.mozu.api.contracts.productadmin.Facet;
import com.mozu.api.contracts.productadmin.LocationInventory;
import com.mozu.api.contracts.productadmin.LocationInventoryAdjustment;
import com.mozu.api.contracts.productadmin.MasterCatalog;
import com.mozu.api.contracts.productadmin.Product;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductCodeRename;
import com.mozu.api.contracts.productadmin.ProductExtra;
import com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductOption;
import com.mozu.api.contracts.productadmin.ProductProperty;
import com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductType;
import com.mozu.api.contracts.productadmin.ProductVariation;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductVariationFixedPrice;
import com.mozu.api.contracts.productadmin.PublishingScope;
import com.mozu.api.contracts.productadmin.SearchSettings;
import com.mozu.api.contracts.productadmin.search.SearchTuningRule;
import com.mozu.api.contracts.productruntime.DiscountSelections;
import com.mozu.api.contracts.productruntime.LocationInventoryQuery;
import com.mozu.api.contracts.productruntime.ProductOptionSelections;
import com.mozu.api.contracts.shippingadmin.CarrierConfiguration;
import com.mozu.api.contracts.shippingadmin.CarrierConfigurationCollection;
import com.mozu.api.contracts.shippingadmin.CustomTableRate;
import com.mozu.api.contracts.shippingadmin.CustomTableRateContent;
import com.mozu.api.contracts.shippingadmin.ServiceType;
import com.mozu.api.contracts.shippingadmin.ServiceTypeLocalizedContent;
import com.mozu.api.contracts.shippingadmin.TargetRule;
import com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule;
import com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection;
import com.mozu.api.contracts.shippingadmin.profile.ShippingProfile;
import com.mozu.api.contracts.shippingadmin.profile.ShippingProfileCollection;
import com.mozu.api.contracts.shippingadmin.profile.ShippingStates;
import com.mozu.api.contracts.shippingadmin.profile.State;
import com.mozu.api.contracts.shippingruntime.RateRequest;
import com.mozu.api.contracts.sitesettings.application.Application;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.contracts.tenant.TenantCollection;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
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
import com.mozu.test.framework.helper.DocumentGenerator;
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
    	CustomerAccountFactory.addAccountAndLogin(apiContext, customerAccountAndAuthInfo, HttpStatus.SC_CREATED);
        CustomerUserAuthInfo shopperUserAuthInfo = CustomerGenerator.generateUserAuthInfo(customerAccountAndAuthInfo.getAccount().getUserName(), customerAccountAndAuthInfo.getPassword());
        shopperAuth = CustomerAuthenticator.authenticate(shopperUserAuthInfo, tenantId, siteId);
        shopperApiContext.setUserAuthTicket(shopperAuth.getAuthTicket());
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(apiContext, masterCatalogId, HttpStatus.SC_OK);
		if(mc.getProductPublishingMode().equalsIgnoreCase("pending"))
		{
	        PublishingScope scope = ProductGenerator.generatePublishingScope(true, null);
	        PublishingScopeFactory.publishDrafts(apiContext, DataViewMode.Pending, scope, HttpStatus.SC_OK);
			mc.setProductPublishingMode("Live");
			MasterCatalogFactory.updateMasterCatalog(apiContext, mc, masterCatalogId, HttpStatus.SC_OK);			
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AdjustmentTests() throws Exception {
        AdjustmentFactory.applyAdjustment(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), null, HttpStatus.SC_BAD_REQUEST);
        AdjustmentFactory.applyShippingAdjustment(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        AdjustmentFactory.removeAdjustment(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        AdjustmentFactory.removeShippingAdjustment(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);       
	}

	@Test
	public void AddressValidationRequestTests() throws Exception {
        AddressValidationRequest request = new AddressValidationRequest();
        request.setAddress(CustomerGenerator.generateAddress("tx"));
        AddressValidationRequestFactory.validateAddress(apiContext,  request, HttpStatus.SC_OK);
	}

	@Test
	public void AdminFacetTests() throws Exception {
        AdminFacetFactory.getFacet(apiContext, Generator.randomInt(500, 600), HttpStatus.SC_NOT_FOUND);
        Facet facet = new Facet();
        AdminFacetFactory.deleteFacetById(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
        AdminFacetFactory.getFacetCategoryList(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_OK);
        AdminFacetFactory.addFacet(apiContext, facet, HttpStatus.SC_CONFLICT);
        AdminFacetFactory.updateFacet(apiContext, facet, Generator.randomInt(100, 200), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void AdminLocationInventoryTests() throws Exception {
        List<LocationInventory> list = new ArrayList<LocationInventory>();
        list.add(new LocationInventory());
        AdminLocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        AdminLocationInventoryFactory.deleteLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AdminLocationInventoryFactory.getLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AdminLocationInventoryFactory.getLocationInventories(apiContext, DataViewMode.Live, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_OK);
        List<LocationInventoryAdjustment> list1 = new ArrayList<LocationInventoryAdjustment>();
        LocationInventoryAdjustment adjust = new LocationInventoryAdjustment();
        adjust.setProductCode(Generator.randomString(5, Generator.AlphaChars));
        list1.add(adjust);
        AdminLocationInventoryFactory.updateLocationInventory(apiContext, DataViewMode.Live, list1, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void AdminPriceListTests() throws Exception {
		AdminPriceListFactory.addPriceList(apiContext, null, HttpStatus.SC_CONFLICT);
		AdminPriceListFactory.getPriceList(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AdminPriceListFactory.getPriceLists(apiContext, HttpStatus.SC_OK);
		AdminPriceListFactory.updatePriceList(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		AdminPriceListFactory.deletePriceList(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void AdminProductTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		AdminProductFactory.getProduct(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.getProductInCatalog(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.getProductInCatalogs(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.getProduct(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.updateProduct(localApiContext, DataViewMode.Live, new Product(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.updateProductInCatalogs(localApiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		AdminProductFactory.updateProductInCatalog(localApiContext, DataViewMode.Live, null,  Generator.randomString(5, Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_CONFLICT);
		AdminProductFactory.deleteProductInCatalog(localApiContext, DataViewMode.Live,  Generator.randomString(5, Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_NOT_FOUND);
		AdminProductFactory.getProducts(localApiContext, DataViewMode.Live, HttpStatus.SC_OK);
		AdminProductFactory.renameProductCodes(localApiContext, new ArrayList<ProductCodeRename>(), HttpStatus.SC_OK);
		AdminProductFactory.addProduct(apiContext, DataViewMode.Live, new Product(), HttpStatus.SC_CONFLICT);
		AdminProductFactory.addProductInCatalog(localApiContext, DataViewMode.Live, new ProductInCatalogInfo(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void AdminUserTests() throws Exception {
        TenantCollection tenants = AdminUserFactory.getTenantScopesForUser(apiContext, Generator.randomString(20, Generator.AlphaNumericChars), HttpStatus.SC_OK);
        assertEquals(tenants.getTotalCount(), new Integer(0));
        AdminUserFactory.getUser(apiContext, Generator.randomString(20, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND);
	}

    @Test
    public void AppdevPackageTests() throws Exception {
		UserAuthInfo info = new UserAuthInfo();
		info.setEmailAddress(email);
		info.setPassword(password);
		AuthenticationProfile profile = UserAuthenticator.authenticate(info, AuthenticationScope.Developer);
		ApiContext localApiContext = new MozuApiContext();
		localApiContext.setUserAuthTicket(profile.getAuthTicket());
        AppdevPackageFactory.getFile(localApiContext, Environment.getConfigValue("AppId"), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
    }

	@Test
	public void ApplicationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        Application app = ApplicationFactory.thirdPartyGetApplication(localApiContext, HttpStatus.SC_OK);
        ApplicationFactory.thirdPartyUpdateApplication(localApiContext, app, HttpStatus.SC_OK);
	}

	@Test	
	public void AppliedDiscountTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        AppliedDiscountFactory.removeCoupon(localApiContext, Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        AppliedDiscountFactory.applyCoupon(localApiContext, Generator.randomString(10,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        AppliedDiscountFactory.removeCoupons(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test	
	public void AssignedDiscountTests() throws Exception {
		AssignedDiscountFactory.assignDiscount(apiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		AssignedDiscountFactory.getAssignedDiscounts(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AssignedDiscountFactory.unAssignDiscount(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void AttributeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		AttributeFactory.getAttribute(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		AttributeFactory.getAttributes(localApiContext, HttpStatus.SC_OK);
		AttributeFactory.getAttributeVocabularyValues(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void AttributedefinitionAttributeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributedefinitionAttributeFactory.addAttribute(localApiContext, new com.mozu.api.contracts.productadmin.Attribute(), HttpStatus.SC_CONFLICT);
        AttributedefinitionAttributeFactory.deleteAttribute(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributedefinitionAttributeFactory.getAttribute(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributedefinitionAttributeFactory.getAttributes(localApiContext, HttpStatus.SC_OK);
        AttributedefinitionAttributeFactory.updateAttribute(localApiContext, new com.mozu.api.contracts.productadmin.Attribute(), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void AttributeLocalizedContentTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		AttributeLocalizedContentFactory.addLocalizedContent(localApiContext, new AttributeLocalizedContent(),  Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		AttributeLocalizedContentFactory.deleteLocalizedContent(localApiContext, Generator.randomString(5,  Generator.AlphaChars), com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_BAD_REQUEST);
		AttributeLocalizedContentFactory.getAttributeLocalizedContent(localApiContext, Generator.randomString(5,  Generator.AlphaChars), com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_BAD_REQUEST);
		AttributeLocalizedContentFactory.getAttributeLocalizedContents(localApiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		AttributeLocalizedContentFactory.updateLocalizedContent(localApiContext, new AttributeLocalizedContent(), Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_BAD_REQUEST);
		AttributeLocalizedContentFactory.updateLocalizedContents(localApiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void AttributeTypeRuleTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributeTypeRuleFactory.getAttributeTypeRules(localApiContext, HttpStatus.SC_OK);
	}
	
	@Test
	public void AttributeVocabularyValueTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        AttributeVocabularyValueFactory.getAttributeVocabularyValues(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.addAttributeVocabularyValue(localApiContext, new AttributeVocabularyValue(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        AttributeVocabularyValueFactory.deleteAttributeVocabularyValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.updateAttributeVocabularyValue(localApiContext, new AttributeVocabularyValue(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.getAttributeVocabularyValueLocalizedContent(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.getAttributeVocabularyValueLocalizedContents(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.updateAttributeVocabularyValues(localApiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        AttributeVocabularyValueFactory.updateAttributeVocabularyValueLocalizedContent(localApiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        AttributeVocabularyValueFactory.updateAttributeVocabularyValueLocalizedContents(localApiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        AttributeVocabularyValueFactory.deleteAttributeVocabularyValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.addAttributeVocabularyValue(localApiContext, null,  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        AttributeVocabularyValueFactory.deleteAttributeVocabularyValueLocalizedContent(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        AttributeVocabularyValueFactory.addAttributeVocabularyValueLocalizedContent(localApiContext, new AttributeVocabularyValueLocalizedContent(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void AuthTicketTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext();
		AppAuthInfo info = new AppAuthInfo();
		info.setApplicationId(Generator.randomString(10, Generator.AlphaChars));
		info.setSharedSecret(Generator.randomString(10, Generator.AlphaChars));
		AuthTicketFactory.authenticateApp(localApiContext, info, HttpStatus.SC_UNAUTHORIZED);
		AuthTicketFactory.refreshAppAuthTicket(localApiContext, new AuthTicketRequest(), HttpStatus.SC_UNAUTHORIZED);
/*bug 36445*/		AuthTicketFactory.deleteAppAuthTicket(localApiContext, Generator.randomString(10, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);		
	}
	
	@Test
	public void BillingInfoTests() throws Exception {
        BillingInfoFactory.getBillingInfo(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        BillingInfoFactory.setBillingInfo(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void CardTests() throws Exception {
        CardFactory.getAccountCards(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
        CardFactory.addAccountCard(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
        CardFactory.deleteAccountCard(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        CardFactory.updateAccountCard(apiContext, null, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void CarrierConfigurationTests() throws Exception {
		CarrierConfigurationCollection configurations = CarrierConfigurationFactory.getConfigurations(apiContext, HttpStatus.SC_OK);
		CarrierConfiguration configuration = CarrierConfigurationFactory.getConfiguration(apiContext, configurations.getItems().get(0).getId(), HttpStatus.SC_OK);
		configuration = new CarrierConfiguration();
		List<CustomTableRate> list = new ArrayList<CustomTableRate>();
		CustomTableRate rate = new CustomTableRate();
		rate.setRateType("CUSTOM_FLAT_RATE_PER_ITEM_EXACT_AMOUNT");
		rate.setValue(10.);
		CustomTableRateContent content = new CustomTableRateContent();
		content.setLocaleCode(com.mozu.test.framework.helper.Constants.LocaleCode);
		content.setName("New Flat Rate - $10");
		rate.setContent(content);
		list.add(rate);
		configuration.setCustomTableRates(list);
		CarrierConfiguration newConfig = CarrierConfigurationFactory.createConfiguration(apiContext, configuration, "custom", HttpStatus.SC_CREATED);
		content.setName("New Name");
		list.get(0).setContent(content);
		configuration.setCustomTableRates(list);
		newConfig = CarrierConfigurationFactory.updateConfiguration(apiContext, configuration, newConfig.getId(), HttpStatus.SC_OK);
		Assert.hasText("New Name", newConfig.getCustomTableRates().get(0).getContent().getName());
		CarrierConfigurationFactory.deleteConfiguration(apiContext,newConfig.getId(), HttpStatus.SC_NO_CONTENT);
	}
	
	@Test
	public void CartItemTests() throws Exception {
        CartItemFactory.getCartItems(shopperApiContext,  HttpStatus.SC_OK);
        CartItemFactory.addItemToCart(shopperApiContext, new CartItem(), HttpStatus.SC_CONFLICT);
        CartItemFactory.removeAllCartItems(shopperApiContext, HttpStatus.SC_OK);
        CartItemFactory.updateCartItem(shopperApiContext, new CartItem(), Generator.randomString(6,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        CartItemFactory.updateCartItemQuantity(shopperApiContext, Generator.randomString(6,  Generator.AlphaChars), 2,  HttpStatus.SC_NOT_FOUND);
        CartItemFactory.deleteCartItem(shopperApiContext, Generator.randomString(6,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
 	}

	@Test
	public void CartTests() throws Exception {
		Cart cart = CartFactory.getOrCreateCart(shopperApiContext, HttpStatus.SC_OK);
		CartFactory.deleteCart(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		CartFactory.getOrCreateCart(shopperApiContext, HttpStatus.SC_OK);
		CartFactory.getCartSummary(shopperApiContext, HttpStatus.SC_OK);
		CartFactory.getUserCart(apiContext, shopperAuth.getCustomerAccount().getUserId(), HttpStatus.SC_NOT_FOUND);
		CartFactory.getUserCartSummary(apiContext, shopperAuth.getCustomerAccount().getUserId(), HttpStatus.SC_OK);
		CartFactory.updateCart(shopperApiContext, new Cart(), HttpStatus.SC_OK);
		CartFactory.deleteCurrentCart(shopperApiContext, HttpStatus.SC_NO_CONTENT);
	}
	
	@Test
	public void CartAppliedDiscountTests() throws Exception {
		CartsAppliedDiscountFactory.applyCoupon(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		CartsAppliedDiscountFactory.removeCoupon(apiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		CartsAppliedDiscountFactory.removeCoupons(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void CartsExtendedPropertyTests() throws Exception {
		CartsExtendedPropertyFactory.addExtendedProperties(apiContext, null, HttpStatus.SC_CONFLICT);
		CartsExtendedPropertyFactory.deleteExtendedProperties(apiContext, null, HttpStatus.SC_CONFLICT);
		CartsExtendedPropertyFactory.deleteExtendedProperty(apiContext, null, HttpStatus.SC_CONFLICT);
		CartsExtendedPropertyFactory.getExtendedProperties(shopperApiContext, HttpStatus.SC_OK);
		CartsExtendedPropertyFactory.updateExtendedProperties(apiContext, null, HttpStatus.SC_CONFLICT);
		CartsExtendedPropertyFactory.updateExtendedProperty(apiContext, null, Generator.randomString(4, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void CategoryTests() throws Exception {
		CategoryFactory.addCategory(apiContext, null, HttpStatus.SC_CONFLICT);
		CategoryFactory.getChildCategories(apiContext, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CategoryFactory.updateCategory(apiContext, new Category(), Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CategoryFactory.deleteCategoryById(apiContext, Generator.randomInt(50, 100), HttpStatus.SC_NOT_FOUND);
		DynamicExpression express = new DynamicExpression();
		express.setText(Generator.randomString(5, Generator.AlphaChars));
		express.setTree(new Expression());
		CategoryFactory.validateDynamicExpression(apiContext, express, HttpStatus.SC_BAD_REQUEST);
		CategoryFactory.validateRealTimeDynamicExpression(apiContext, express, HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void ChangeMessageTests() throws Exception {
		ChangeMessageFactory.getMessages(shopperApiContext, HttpStatus.SC_OK);
        ChangeMessageFactory.removeMessage(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ChangeMessageFactory.removeAllMessages(shopperApiContext, HttpStatus.SC_NO_CONTENT);
	}

	@Test
	public void ChannelTests() throws Exception {
		Channel ch = new Channel();
		ch.setTenantId(tenantId);
        ChannelFactory.getChannels(apiContext, null, null, null, null, null, HttpStatus.SC_OK);
        ChannelFactory.createChannel(apiContext, ch, HttpStatus.SC_CONFLICT);
        ChannelFactory.deleteChannel(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ChannelFactory.getChannel(apiContext, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ChannelFactory.updateChannel(apiContext, ch, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ChannelGroupTests() throws Exception {
        ChannelGroupFactory.getChannelGroups(apiContext, HttpStatus.SC_OK);
        ChannelGroupFactory.createChannelGroup(apiContext, null, HttpStatus.SC_CONFLICT);
        ChannelGroupFactory.deleteChannelGroup(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ChannelGroupFactory.getChannelGroups(apiContext, HttpStatus.SC_OK);
        ChannelGroupFactory.updateChannelGroup(apiContext, new ChannelGroup(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void CheckoutSettingsTests() throws Exception {
        CheckoutSettingsFactory.getCheckoutSettings(apiContext, HttpStatus.SC_OK);
	}

	@Test
	public void CouponSetTests() throws Exception {
		CouponSetFactory.getCouponSets(apiContext, HttpStatus.SC_OK);
		CouponSetFactory.getUniqueCouponSetCode(apiContext, HttpStatus.SC_OK);
		CouponSetFactory.addCouponSet(apiContext, null, HttpStatus.SC_BAD_REQUEST);
		CouponSetFactory.validateUniqueCouponSetCode(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CouponSetFactory.updateCouponSet(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		CouponSetFactory.deleteCouponSet(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void CouponTests() throws Exception {
		CouponFactory.getCoupon(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CouponFactory.getCoupons(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CouponFactory.addCoupons(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CouponFactory.deleteCoupons(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CouponFactory.deleteCoupon(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void CreditAuditEntryTests() throws Exception {
        CreditAuditEntryFactory.getAuditEntries(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_OK);
	}

	@Test
	public void CreditTests() throws Exception {
		/*bug 35020*/CreditFactory.addCredit(apiContext, new Credit(), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        CreditFactory.getCredits(apiContext, HttpStatus.SC_OK);
        CreditFactory.associateCreditToShopper(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_BAD_REQUEST);
        CreditFactory.getCredit(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND);
        CreditFactory.updateCredit(apiContext, null, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_CONFLICT);
        CreditFactory.deleteCredit(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND);
        CreditFactory.resendCreditCreatedEmail(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void CreditTransactionTests() throws Exception {
        CreditTransactionFactory.getTransactions(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK);
        CreditTransactionFactory.addTransaction(apiContext, new CreditTransaction(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void CommerceLocationTests() throws Exception {
		CommerceLocationFactory.getDirectShipLocation(apiContext, HttpStatus.SC_OK);
		CommerceLocationFactory.getLocation(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CommerceLocationFactory.getLocationsInUsageType(apiContext, "direct ship", HttpStatus.SC_OK);
		CommerceLocationFactory.getLocationsInUsageType(apiContext, "direct ship", HttpStatus.SC_NOT_FOUND);
		CommerceLocationFactory.getInStorePickupLocation(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		CommerceLocationFactory.getInStorePickupLocations(apiContext, HttpStatus.SC_OK);
		
	}
	
	@Test
	public void CustomerAccountTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		CustomerAccountFactory.getAccounts(localApiContext, HttpStatus.SC_OK);
		CustomerAccountFactory.getLoginState(localApiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
		CustomerAccountFactory.getAccount(localApiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
		PasswordInfo pinfo = new PasswordInfo();
		pinfo.setOldPassword(Generator.randomString(5, Generator.AlphaChars));
		pinfo.setNewPassword(Generator.randomString(5, Generator.AlphaChars));		
		CustomerAccountFactory.changePassword(shopperApiContext, pinfo, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
		CustomerAccountFactory.changePasswords(apiContext, null, HttpStatus.SC_BAD_REQUEST);
		CustomerAccountFactory.addLoginToExistingCustomer(localApiContext, new CustomerLoginInfo(), shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
		CustomerAccountFactory.recomputeCustomerLifetimeValue(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_NO_CONTENT);
		CustomerAccountFactory.setLoginLocked(localApiContext, true, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CustomerAccountFactory.setPasswordChangeRequired(localApiContext, true, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CustomerAccountFactory.addAccounts(localApiContext, null, HttpStatus.SC_BAD_REQUEST);
		CustomerAccountFactory.resetPassword(localApiContext, new ResetPasswordInfo(), HttpStatus.SC_BAD_REQUEST);
		CustomerAccountFactory.updateAccount(localApiContext, new CustomerAccount(), Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CustomerAccountFactory.deleteAccount(localApiContext, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
		CustomerAccountFactory.getLoginStateByUserName(localApiContext, shopperAuth.getCustomerAccount().getUserName(), HttpStatus.SC_OK);
		CustomerAccountFactory.getLoginStateByEmailAddress(localApiContext, shopperAuth.getCustomerAccount().getEmailAddress(), HttpStatus.SC_OK);
	}
	
	@Test
	public void CustomerAttributeTests() throws Exception {
        CustomerAttributeFactory.getAccountAttributes(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
        CustomerAttribute attr = new CustomerAttribute();
        CustomerAttributeFactory.addAccountAttribute(apiContext, new CustomerAttribute(), shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_CONFLICT);
        CustomerAttributeFactory.updateAccountAttribute(apiContext, new CustomerAttribute(), shopperAuth.getCustomerAccount().getId(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        CustomerAttributeFactory.deleteAccountAttribute(apiContext, Generator.randomInt(10000, 20000), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void CustomerAuthTicketTests() throws Exception {
		CustomerAuthTicketFactory.createAnonymousShopperAuthTicket(apiContext, HttpStatus.SC_OK);
		CustomerAuthTicketFactory.createUserAuthTicket(apiContext, null, HttpStatus.SC_BAD_REQUEST);
		CustomerAuthTicketFactory.refreshUserAuthTicket(apiContext, Generator.randomString(10, Generator.AlphaNumericChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void CustomerCheckoutSettingsTests() throws Exception {
        CustomerCheckoutSettingsFactory.getCustomerCheckoutSettings(apiContext, HttpStatus.SC_OK);
        CustomerCheckoutSettingsFactory.updateCustomerCheckoutSettings(apiContext, null, HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void CustomerContactTests() throws Exception {
        CustomerContactFactory.getAccountContacts(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
        CustomerContactFactory.addAccountContact(apiContext, new CustomerContact(), shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
        CustomerContactFactory.updateAccountContact(apiContext, new CustomerContact(), shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST);
        CustomerContactFactory.deleteAccountContact(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void CustomerNoteTests() throws Exception {
        CustomerNoteFactory.getAccountNotes(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
        CustomerNoteFactory.addAccountNote(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
        CustomerNoteFactory.updateAccountNote(apiContext, null, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST);
        /*bug 34991*/        CustomerNoteFactory.deleteAccountNote(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void CustomerCustomerSegmentTests() throws Exception {
		CustomerCustomerSegmentFactory.addSegment(apiContext, new CustomerSegment(), HttpStatus.SC_CONFLICT);
		CustomerCustomerSegmentFactory.getSegment(apiContext, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
		CustomerCustomerSegmentFactory.getSegments(apiContext, HttpStatus.SC_OK);
		CustomerCustomerSegmentFactory.updateSegment(apiContext, new CustomerSegment(), Generator.randomInt(100, 200), HttpStatus.SC_CONFLICT);
		CustomerCustomerSegmentFactory.deleteSegment(apiContext, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
		CustomerCustomerSegmentFactory.removeSegmentAccount(apiContext, Generator.randomInt(1000, 2000), Generator.randomInt(100, 200), HttpStatus.SC_CONFLICT);
		CustomerCustomerSegmentFactory.addSegmentAccounts(apiContext, new ArrayList<Integer>(), Generator.randomInt(1000, 2000), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void CustomerSegmentTests() throws Exception {
		CustomerSegmentFactory.getAccountSegments(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_OK);
	}
	
	@Test
	public void CustomRouteSettingsTests() throws Exception {
		CustomRouteSettingsFactory.createCustomRouteSettings(apiContext, null, HttpStatus.SC_CONFLICT);
		CustomRouteSettingsFactory.deleteCustomRouteSettings(apiContext, HttpStatus.SC_NO_CONTENT);
		CustomRouteSettingsFactory.getCustomRouteSettings(apiContext, HttpStatus.SC_OK);
		CustomRouteSettingsFactory.updateCustomRouteSettings(apiContext, null, HttpStatus.SC_CONFLICT);
	}

	@Test
	public void DeveloperAdminUserAuthTicketTests() throws Exception {
		UserAuthInfo info = new UserAuthInfo();
		info.setEmailAddress(email);
		info.setPassword(password);
		AuthenticationProfile profile = UserAuthenticator.authenticate(info, AuthenticationScope.Developer);
		ApiContext localApiContext = new MozuApiContext();
		localApiContext.setUserAuthTicket(profile.getAuthTicket());
		DeveloperAdminUserAuthTicketFactory.createDeveloperUserAuthTicket(localApiContext, info, HttpStatus.SC_CREATED);
		DeveloperAdminUserAuthTicketFactory.refreshDeveloperAuthTicket(localApiContext, new DeveloperAdminUserAuthTicket(), HttpStatus.SC_BAD_REQUEST);
		DeveloperAdminUserAuthTicketFactory.deleteUserAuthTicket(localApiContext, Generator.randomString(10, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void DigitalPackageTests() throws Exception {
		DigitalPackageFactory.deleteDigitalPackage(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		DigitalPackageFactory.getAvailableDigitalPackageFulfillmentActions(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		DigitalPackageFactory.updateDigitalPackage(apiContext, new DigitalPackage(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		DigitalPackageFactory.createDigitalPackage(apiContext, new DigitalPackage(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		DigitalPackageFactory.getDigitalPackage(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void DiscountTests() throws Exception {
        DiscountFactory.getDiscounts(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
        DiscountFactory.createDiscount(apiContext, null, HttpStatus.SC_BAD_REQUEST);
        DiscountFactory.deleteDiscount(apiContext, Generator.randomInt(2000, 3000), HttpStatus.SC_NOT_FOUND);
        DiscountFactory.generateRandomCoupon(apiContext, HttpStatus.SC_OK);
        DiscountFactory.getDiscount(apiContext, DataViewMode.Live, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
        DiscountFactory.updateDiscount(apiContext, null, Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST);
        DiscountFactory.updateDiscountContent(apiContext, null, Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST);
        DiscountFactory.getDiscountContent(apiContext, DataViewMode.Live, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void DiscountTargetTests() throws Exception {
		//bug 73101
		DiscountTargetFactory.getDiscountTarget(apiContext, DataViewMode.Live, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
		DiscountTargetFactory.updateDiscountTarget(apiContext, new DiscountTarget(), Generator.randomInt(1000, 2000), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void DocumentDraftSummaryTests() throws Exception {
        DocumentDraftSummaryFactory.listDocumentDraftSummaries(apiContext, HttpStatus.SC_OK);
        DocumentDraftSummaryFactory.deleteDocumentDrafts(apiContext, null, HttpStatus.SC_OK);
        DocumentDraftSummaryFactory.publishDocuments(apiContext, null, HttpStatus.SC_OK);
	}

	@Test
	public void DocumentTests() throws Exception {
        DocumentFactory.getDocuments(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK);
        DocumentFactory.createDocument(apiContext, DataViewMode.Live, new Document(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        DocumentFactory.deleteDocument(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        DocumentFactory.deleteDocumentContent(apiContext,  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        DocumentFactory.getDocument(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        DocumentFactory.getDocumentContent(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        DocumentFactory.updateDocument(apiContext, new Document(), Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        DocumentFactory.updateDocumentContent(apiContext, null, Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), null, HttpStatus.SC_BAD_REQUEST);
        DocumentFactory.transformDocumentContent(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void DocumentListTests() throws Exception {
		DocumentListFactory.createDocumentList(apiContext, DataViewMode.Live, new DocumentList(), HttpStatus.SC_CONFLICT);
        DocumentListFactory.getDocumentLists(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
        DocumentListFactory.getDocumentList(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        DocumentListFactory.updateDocumentList(apiContext, new DocumentList(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        DocumentListFactory.deleteDocumentList(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void DocumentListTypeTests() throws Exception {
        String appId = AppAuthenticator.getInstance().getAppAuthInfo().getApplicationId();        
		String mozuNamespace = appId.substring(0, appId.indexOf('.'));
		DocumentListType type = new DocumentListType();
		type.setNamespace(mozuNamespace);
		DocumentListTypeFactory.getDocumentListTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
		DocumentListTypeFactory.getDocumentListType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars),HttpStatus.SC_NOT_FOUND);		
/*bug 35164*/		DocumentListTypeFactory.createDocumentListType(apiContext, DataViewMode.Live, type, HttpStatus.SC_BAD_REQUEST);
/*bug 47694*/		DocumentListTypeFactory.updateDocumentListType(apiContext, new DocumentListType(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void DocumentTypeTests() throws Exception {
		DocumentType type = DocumentGenerator.generateDocumentType(Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars));
		DocumentTypeFactory.createDocumentType(apiContext, DataViewMode.Live, type, HttpStatus.SC_FORBIDDEN);
        DocumentTypeFactory.getDocumentTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
        DocumentTypeFactory.getDocumentType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        DocumentTypeFactory.updateDocumentType(apiContext, new DocumentType(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void DocumentTreeTests() throws Exception {
		DocumentTreeFactory.getTreeDocumentContent(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		DocumentTreeFactory.updateTreeDocumentContent(apiContext, new FileInputStream("C:\\tmp\\NWCRq.txt"), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		DocumentTreeFactory.deleteTreeDocumentContent(apiContext, new ByteArrayInputStream( Generator.randomString(15, Generator.AlphaChars).getBytes( Charset.defaultCharset() )),  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		DocumentTreeFactory.transformTreeDocumentContent(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		/*bug 47696*/		DocumentTreeFactory.getTreeDocument(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
		
	@Test
	public void EntityContainerTests() throws Exception {
		EntityContainerFactory.getEntityContainer(apiContext, Generator.randomString(15, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityContainerFactory.getEntityContainers(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void EntityFactoryTests() throws Exception {
		EntityFactory.deleteEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityFactory.getEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityFactory.insertEntity(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityFactory.updateEntity(apiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityFactory.getEntities(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void EntityListTests() throws Exception {
		EntityListFactory.createEntityList(apiContext, new EntityList(), HttpStatus.SC_FORBIDDEN);
		EntityListFactory.deleteEntityList(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		EntityListFactory.getEntityList(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK);
		EntityListFactory.getEntityLists(apiContext, HttpStatus.SC_OK);
		EntityListFactory.updateEntityList(apiContext, new EntityList(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ExtendedPropertyTests() throws Exception {
		ExtendedPropertyFactory.addExtendedProperties(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		ExtendedPropertyFactory.getExtendedProperties(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		ExtendedPropertyFactory.updateExtendedProperties(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		ExtendedPropertyFactory.updateExtendedProperty(apiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		ExtendedPropertyFactory.deleteExtendedProperty(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		ExtendedPropertyFactory.deleteExtendedProperties(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void EventDeliverySummaryTests() throws Exception {
		EventDeliverySummaryFactory.getDeliveryAttemptSummaries(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		EventDeliverySummaryFactory.getDeliveryAttemptSummary(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void EventNotificationTests() throws Exception {
        EventNotificationFactory.getEvents(apiContext, HttpStatus.SC_OK);
        EventNotificationFactory.getEvent(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void FacetTests() throws Exception {
        FacetFactory.getFacets(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void FraudScreenTests() throws Exception {
        FraudScreenFactory.screen(apiContext, null, HttpStatus.SC_CONFLICT);
	}

	@Test
	public void FulfillmentInfoTests() throws Exception {
		FulfillmentInfoFactory.getFulfillmentInfo(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		FulfillmentInfoFactory.setFulFillmentInfo(apiContext, new FulfillmentInfo(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void FulfillmentActionTests() throws Exception {
        FulfillmentAction action = new FulfillmentAction();
        action.setActionName("SP");
        FulfillmentActionFactory.performFulfillmentAction(apiContext, action, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        FulfillmentActionFactory.resendPackageFulfillmentEmail(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void GeneralSettingsTests() throws Exception {
        GeneralSettingsFactory.getGeneralSettings(apiContext, HttpStatus.SC_OK);
        GeneralSettingsFactory.updateGeneralSettings(apiContext, null, HttpStatus.SC_CONFLICT);
	}
	
	/*@Test
	public void HandlingFeeRuleTests() throws Exception {
		HandlingFeeRuleFactory.createOrderHandlingFeeRule(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		HandlingFeeRuleFactory.getOrderHandlingFeeRules(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK);
		HandlingFeeRuleFactory.getOrderHandlingFeeRule(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		HandlingFeeRuleFactory.deleteOrderHandlingFeeRule(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}*/
	
	@Test
	public void InStockNotificationSubscriptionTests() throws Exception {
        InStockNotificationSubscriptionFactory.getInStockNotificationSubscriptions(apiContext, HttpStatus.SC_OK);
        InStockNotificationSubscriptionFactory.addInStockNotificationSubscription(apiContext, new InStockNotificationSubscription(), HttpStatus.SC_CONFLICT);
        InStockNotificationSubscriptionFactory.getInStockNotificationSubscription(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
        InStockNotificationSubscriptionFactory.deleteInStockNotificationSubscription(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ListViewTests() throws Exception {
		ListViewFactory.createEntityListView(apiContext, new ListView(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getEntityListView(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getViewEntities(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getViewEntity(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getViewEntityContainer(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getViewEntityContainers(apiContext,  Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.updateEntityListView(apiContext, new ListView(),  Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.getEntityListViews(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ListViewFactory.deleteEntityListView(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void LocationTests() throws Exception {
		LocationFactory.getLocation(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		LocationFactory.getLocations(apiContext, HttpStatus.SC_OK);
		LocationFactory.addLocation(apiContext, new Location(), HttpStatus.SC_CONFLICT);
		LocationFactory.updateLocation(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
/*bug 36475 */		LocationFactory.deleteLocation(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void LocationInventoryTests() throws Exception {
        LocationInventoryFactory.getLocationInventories(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_OK);
        List<LocationInventory> list = new ArrayList<LocationInventory>();
        list.add(new LocationInventory());
        /*bug 35021*/LocationInventoryFactory.addLocationInventory(apiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_INTERNAL_SERVER_ERROR);
        LocationInventoryFactory.deleteLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        LocationInventoryFactory.getLocationInventory(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        LocationInventoryFactory.updateLocationInventory(apiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void LocationTypeTests() throws Exception {
		LocationTypeFactory.addLocationType(apiContext, null, HttpStatus.SC_BAD_REQUEST);
		LocationTypeFactory.deleteLocationType(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		LocationTypeFactory.getLocationType(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		LocationTypeFactory.getLocationTypes(apiContext, HttpStatus.SC_OK);
		LocationTypeFactory.updateLocationType(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void LocationUsageTests() throws Exception {
        LocationUsageFactory.getLocationUsages(apiContext, HttpStatus.SC_OK);
        LocationUsageFactory.getLocationUsage(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        LocationUsageFactory.updateLocationUsage(apiContext, new LocationUsage(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void MasterCatalogTests() throws Exception {
		MasterCatalogFactory.getMasterCatalogs(apiContext, HttpStatus.SC_OK);
	}
	
	@Test
	public void OrderTests() throws Exception {
		OrderFactory.getOrders(apiContext, HttpStatus.SC_OK);
		OrderFactory.getAvailableActions(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderFactory.getOrder(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderFactory.getTaxableOrders(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderFactory.changeOrderUserId(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderFactory.createOrder(apiContext, null, HttpStatus.SC_CONFLICT);
		OrderFactory.updateOrder(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		OrderFactory.updateOrderDiscount(apiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomInt(100, 200), HttpStatus.SC_CONFLICT);
		OrderFactory.deleteOrderDraft(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderFactory.performOrderAction(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		OrderFactory.resendOrderConfirmationEmail(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		OrderFactory.createOrderFromCart(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		OrderFactory.processDigitalWallet(apiContext, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		OrderFactory.changeOrderPriceList(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void OrderAttributeTests() throws Exception {
        OrderAttributeFactory.getOrderAttributes(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderAttributeFactory.createOrderAttributes(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderAttributeFactory.updateOrderAttributes(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void OrderItemTests() throws Exception {
        OrderItemFactory.getOrderItems(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.createOrderItem(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        OrderItemFactory.deleteOrderItem(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.getOrderItem(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.updateItemFulfillment(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        OrderItemFactory.updateItemProductPrice(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomDecimal(50., 100.), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.updateItemQuantity(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.updateOrderItemDiscount(apiContext, null, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomInt(50, 100), HttpStatus.SC_CONFLICT);
        OrderItemFactory.getOrderItemViaLineId(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomInt(100, 200), HttpStatus.SC_BAD_REQUEST);
        OrderItemFactory.updateItemDuty(apiContext, Generator.randomString(8,  Generator.AlphaChars), Generator.randomString(8,  Generator.AlphaChars), Generator.randomDecimal(20., 50.), HttpStatus.SC_BAD_REQUEST);
        
	}

	/*@Test
	public void OrderNoteTests() throws Exception {
        OrderNoteFactory.getOrderNotes(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderNoteFactory.createOrderNote(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderNoteFactory.deleteOrderNote(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderNoteFactory.getOrderNote(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrderNoteFactory.updateOrderNote(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}*/

	@Test
	public void OrdersPackageTests() throws Exception {
        OrdersPackageFactory.getPackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersPackageFactory.createPackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        OrdersPackageFactory.deletePackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersPackageFactory.getAvailablePackageFulfillmentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersPackageFactory.getPackageLabel(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersPackageFactory.updatePackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void OrdersShipmentTests() throws Exception {
        OrdersShipmentFactory.getAvailableShipmentMethods(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersShipmentFactory.createPackageShipments(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        OrdersShipmentFactory.deleteShipment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        OrdersShipmentFactory.getShipment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void OrderValidationResultTests() throws Exception {
		OrderValidationResultFactory.addValidationResult(apiContext, new OrderValidationResult(), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
		OrderValidationResultFactory.getValidationResults(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void PackageTests() throws Exception {
        PackageFactory.getPackage(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PackageFactory.createPackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        PackageFactory.deletePackage(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PackageFactory.getPackageLabel(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PackageFactory.updatePackage(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void PaymentTests() throws Exception {
        PaymentFactory.getPayments(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PaymentFactory.createPaymentAction(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        PaymentFactory.getAvailablePaymentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PaymentFactory.getPayment(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PaymentFactory.performPaymentAction(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void PaymentSettingsTests() throws Exception {
        PaymentSettingsFactory.getThirdPartyPaymentWorkflows(apiContext, HttpStatus.SC_OK);
        PaymentSettingsFactory.addThirdPartyPaymentWorkflow(apiContext, null, HttpStatus.SC_CONFLICT);
        PaymentSettingsFactory.deleteThirdPartyPaymentWorkflow(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        PaymentSettingsFactory.getThirdPartyPaymentWorkflowWithValues(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	

	@Test
	public void PlatformApplicationTests() throws Exception {
		UserAuthInfo info = new UserAuthInfo();
		info.setEmailAddress(email);
		info.setPassword(password);
		AuthenticationProfile profile = UserAuthenticator.authenticate(info, AuthenticationScope.Developer);
		ApiContext localApiContext = new MozuApiContext();
		localApiContext.setUserAuthTicket(profile.getAuthTicket());
		PlatformApplicationFactory.getAppPackageNames(localApiContext, Environment.getConfigValue("AppId"), HttpStatus.SC_OK);
		PlatformApplicationFactory.getAppVersions(localApiContext, Environment.getConfigValue("AppId"), HttpStatus.SC_OK);
		PlatformApplicationFactory.getPackageMetadata(localApiContext, Environment.getConfigValue("AppId"), HttpStatus.SC_OK);
		PlatformApplicationFactory.getPackageFileMetadata(localApiContext, Environment.getConfigValue("AppId"), null, HttpStatus.SC_CONFLICT);
		PlatformApplicationFactory.upsertPackageFile(localApiContext, new FileInputStream("C:\\tmp\\NWCRq.txt"), Environment.getConfigValue("AppId"), null, "text", HttpStatus.SC_CONFLICT);
		PlatformApplicationFactory.renamePackageFile(localApiContext, null, Environment.getConfigValue("AppId"), HttpStatus.SC_CONFLICT);
		PlatformApplicationFactory.deletePackageFile(localApiContext, Environment.getConfigValue("AppId"), null, HttpStatus.SC_CONFLICT);			
	}
	
	@Test
	public void PickupTests() throws Exception {
        PickupFactory.getPickup(apiContext,  Generator.randomString(5, Generator.AlphaChars),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PickupFactory.getAvailablePickupFulfillmentActions(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PickupFactory.createPickup(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        PickupFactory.deletePickup(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        PickupFactory.updatePickup(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void PriceListEntryTests() throws Exception {
		PriceListEntryFactory.addPriceListEntry(apiContext, null, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		PriceListEntryFactory.getPriceListEntries(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		PriceListEntryFactory.getPriceListEntry(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.Currency, HttpStatus.SC_NOT_FOUND);
		PriceListEntryFactory.updatePriceListEntry(apiContext, null, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.Currency, HttpStatus.SC_CONFLICT);
		PriceListEntryFactory.deletePriceListEntry(apiContext, Generator.randomString(8, Generator.AlphaChars), Generator.randomString(8, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.Currency, HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void PriceListTests() throws Exception {
		PriceListFactory.getPriceList(apiContext, Generator.randomString(8, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		PriceListFactory.getResolvedPriceList(apiContext, HttpStatus.SC_OK);
	}
	
	@Test
	public void ProductExtraTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductExtraFactory.getExtras(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.addExtra(localApiContext, DataViewMode.Pending, new ProductExtra(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductExtraFactory.getExtraValueLocalizedDeltaPrice(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.CountryCode, HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.getExtraValueLocalizedDeltaPrices(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), com.mozu.test.framework.helper.Constants.CountryCode, HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.addExtra(localApiContext, DataViewMode.Live, new ProductExtra(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        List<ProductExtraValueDeltaPrice> list = new ArrayList<ProductExtraValueDeltaPrice>();
        ProductExtraFactory.updateExtraValueLocalizedDeltaPrices(localApiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.updateExtra(localApiContext, DataViewMode.Live, new ProductExtra(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductExtraFactory.deleteExtra(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.deleteExtraValueLocalizedDeltaPrice(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductExtraFactory.addExtraValueLocalizedDeltaPrice(localApiContext, DataViewMode.Live, new  ProductExtraValueDeltaPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductOptionTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null,  masterCatalogId, null);
        ProductOptionFactory.getOptions(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductOptionFactory.addOption(localApiContext, DataViewMode.Live, new ProductOption(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductOptionFactory.updateOption(localApiContext, DataViewMode.Live, new ProductOption(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductOptionFactory.deleteOption(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductPropertyTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductPropertyFactory.getProperties(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.getPropertyValueLocalizedContents(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.getPropertyValueLocalizedContent(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.getProperty(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.addPropertyValueLocalizedContent(localApiContext, DataViewMode.Live, new ProductPropertyValueLocalizedContent(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductPropertyFactory.addProperty(localApiContext, DataViewMode.Live, new ProductProperty(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        List<ProductPropertyValueLocalizedContent> list = new ArrayList<ProductPropertyValueLocalizedContent>();
        ProductPropertyFactory.updatePropertyValueLocalizedContents(localApiContext, DataViewMode.Live, list, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.updateProperty(localApiContext, DataViewMode.Live, new ProductProperty(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductPropertyFactory.deleteProperty(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductPropertyFactory.deletePropertyValueLocalizedContent(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        
	}

	@Test
	public void ProductReservationTests() throws Exception {
        ProductReservationFactory.getProductReservations(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
        ProductReservationFactory.addProductReservations(apiContext, DataViewMode.Pending, null, HttpStatus.SC_CONFLICT);
        ProductReservationFactory.commitReservations(apiContext, DataViewMode.Live, null, HttpStatus.SC_CONFLICT);
        ProductReservationFactory.updateProductReservations(apiContext, DataViewMode.Live, null, HttpStatus.SC_CONFLICT);
        ProductReservationFactory.deleteProductReservation(apiContext, DataViewMode.Live, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductSearchResultTests() throws Exception {
        ProductSearchResultFactory.suggest(apiContext, "ab", "cd", null, null, HttpStatus.SC_OK);
        ProductSearchResultFactory.search(apiContext, HttpStatus.SC_OK);
	}

	@Test
	public void ProductTests() throws Exception {
		ProductFactory.getProducts(shopperApiContext, DataViewMode.Live, HttpStatus.SC_OK);
		ProductFactory.configuredProduct(shopperApiContext, new ProductOptionSelections(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ProductFactory.validateProduct(shopperApiContext, new ProductOptionSelections(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		ProductFactory.validateDiscounts(shopperApiContext, new DiscountSelections(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		ProductFactory.getProductInventories(apiContext, DataViewMode.Live, new LocationInventoryQuery(), HttpStatus.SC_CONFLICT);
		ProductFactory.getProductForIndexing(shopperApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		/*bug 49432*/		ProductFactory.getProductInventory(shopperApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void ProductTypeExtraTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		//bug 73099
        ProductTypeExtraFactory.getExtras(localApiContext, DataViewMode.Live, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
        ProductTypeExtraFactory.updateExtra(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(100, 200), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductTypeExtraFactory.deleteExtra(localApiContext, DataViewMode.Live, Generator.randomInt(100, 200), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductTypeExtraFactory.addExtra(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductTypeOptionTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		//bug 73099
        ProductTypeOptionFactory.getOptions(localApiContext, DataViewMode.Live, Generator.randomInt(10000, 20000), HttpStatus.SC_NOT_FOUND);
        ProductTypeOptionFactory.addOption(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(100, 200),  HttpStatus.SC_NOT_FOUND);
        ProductTypeOptionFactory.updateOption(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(100, 200),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductTypeOptionFactory.deleteOption(localApiContext, DataViewMode.Live, Generator.randomInt(100, 200),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void ProductTypePropertyTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		//bug 73099
        ProductTypePropertyFactory.getProperties(localApiContext, DataViewMode.Live, Generator.randomInt(6000, 7000), HttpStatus.SC_NOT_FOUND);
        ProductTypePropertyFactory.getProperty(localApiContext, DataViewMode.Live,  Generator.randomInt(1000, 2000),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductTypePropertyFactory.addProperty(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(6000, 7000), HttpStatus.SC_NOT_FOUND);
        ProductTypePropertyFactory.updateProperty(localApiContext, DataViewMode.Live, new AttributeInProductType(), Generator.randomInt(6000, 7000),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductTypePropertyFactory.deleteProperty(localApiContext, DataViewMode.Live, Generator.randomInt(6000, 7000),  Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductTypeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		ProductTypeFactory.addProductType(localApiContext, DataViewMode.Live, null, HttpStatus.SC_CONFLICT);
		ProductTypeFactory.getProductTypes(localApiContext, DataViewMode.Live, HttpStatus.SC_OK);
		ProductTypeFactory.getProductType(localApiContext, DataViewMode.Live, Generator.randomInt(600, 700), HttpStatus.SC_NOT_FOUND);
		ProductTypeFactory.deleteProductType(localApiContext, DataViewMode.Live, Generator.randomInt(600, 700), HttpStatus.SC_NOT_FOUND);
		ProductTypeFactory.updateProductType(localApiContext, DataViewMode.Live, new ProductType(), Generator.randomInt(600, 700), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void ProductTypeVariationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		//bug 73099
        ProductTypeVariationFactory.generateProductVariations(localApiContext, null, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void ProductVariationTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ProductVariationFactory.getProductVariations(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.deleteProductVariation(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.addProductVariationLocalizedDeltaPrice(localApiContext,  DataViewMode.Live, new ProductVariationDeltaPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.getProductVariation(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.getProductVariationLocalizedDeltaPrices(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.updateProductVariation(localApiContext, DataViewMode.Live, new ProductVariation(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.updateProductVariations(localApiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductVariationFactory.updateProductVariationLocalizedDeltaPrice(localApiContext, DataViewMode.Live, new ProductVariationDeltaPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.updateProductVariationLocalizedDeltaPrices(localApiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductVariationFactory.deleteProductVariationLocalizedDeltaPrice(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.addProductVariationLocalizedPrice(localApiContext, DataViewMode.Live, new ProductVariationFixedPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.getProductVariationLocalizedPrice(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.getProductVariationLocalizedPrices(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.updateProductVariationLocalizedPrice(localApiContext, DataViewMode.Live, new ProductVariationFixedPrice(), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ProductVariationFactory.updateProductVariationLocalizedPrices(localApiContext, DataViewMode.Live, null, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ProductVariationFactory.deleteProductVariationLocalizedPrice(localApiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void PropertyTypeTests() throws Exception {
		PropertyTypeFactory.createPropertyType(apiContext, new PropertyType(), HttpStatus.SC_CONFLICT);
		PropertyTypeFactory.getPropertyType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		PropertyTypeFactory.getPropertyTypes(apiContext, DataViewMode.Live, HttpStatus.SC_OK);
		PropertyTypeFactory.updatePropertyType(apiContext, DataViewMode.Live, new PropertyType(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		/*bug 35064*/
		PropertyTypeFactory.deletePropertyType(apiContext, DataViewMode.Live, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void PublishSetSummaryTests() throws Exception {
		PublishSetSummaryFactory.getPublishSets(apiContext, HttpStatus.SC_OK);
		PublishSetSummaryFactory.deletePublishSet(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		/*bug 67289*/
		PublishSetSummaryFactory.getPublishSetItems(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		/*67290*/
		PublishSetSummaryFactory.addPublishSetItems(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void PublishingScopeTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
		MasterCatalog mc = MasterCatalogFactory.getMasterCatalog(localApiContext, masterCatalogId, HttpStatus.SC_OK);
		mc.setProductPublishingMode("Pending");
		MasterCatalogFactory.updateMasterCatalog(localApiContext, mc, masterCatalogId, HttpStatus.SC_OK);
		try
		{
	        List<String> list = new ArrayList<String>();
	        list.add(Generator.randomString(5, Generator.AlphaChars));
	        PublishingScope scope = ProductGenerator.generatePublishingScope(false, list);
	        PublishingScopeFactory.publishDrafts(localApiContext, DataViewMode.Pending, scope, HttpStatus.SC_NOT_FOUND);
	        PublishingScopeFactory.discardDrafts(localApiContext, DataViewMode.Pending, scope, HttpStatus.SC_NOT_FOUND);
	        PublishingScopeFactory.getPublishSets(localApiContext, HttpStatus.SC_OK);
	        PublishingScopeFactory.assignProductsToPublishSet(localApiContext, null, HttpStatus.SC_CONFLICT);
	        /*bug 67281*/
	        PublishingScopeFactory.getPublishSet(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	        /*bug 67283*/
	        PublishingScopeFactory.deletePublishSet(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		}catch (TestFailException e)
		{   //restore publish mode
			mc.setProductPublishingMode("Live");
			MasterCatalogFactory.updateMasterCatalog(localApiContext, mc, masterCatalogId, HttpStatus.SC_OK);
		throw(e);
		}
	}

	@Test
	public void PublicCardTests() throws Exception {
		PublicCard card = new PublicCard();
		card.setCardHolderName("crr wrr");
		card.setCardNumber("4111111111111111");
		card.setExpireMonth(1);
		card.setExpireYear(2020);
		card.setCardType("visa");
		card.setCvv("123");
		SyncResponse response = PublicCardFactory.create(apiContext, card, HttpStatus.SC_OK);
		assertTrue(response.getIsSuccessful());
		assertTrue(!response.getId().isEmpty());

		card.setCvv(Generator.randomString(3, Generator.NumericChars));
		PublicCardFactory.update(apiContext, card, response.getId(), HttpStatus.SC_OK);
		PublicCardFactory.delete(apiContext, response.getId(), HttpStatus.SC_OK);		
	}
	
	@Test
	public void ReferenceDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, masterCatalogId, null);
        ReferenceDataFactory.getBehaviors(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getAddressSchema(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getAddressSchemas(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getBehaviorCategories(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getBehaviorCategory(localApiContext, Generator.randomInt(10, 20), HttpStatus.SC_OK);
        ReferenceDataFactory.getContentLocales(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getCountries(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getCurrencies(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getTimeZones(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getTopLevelDomains(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getUnitsOfMeasure(localApiContext, HttpStatus.SC_OK);
        ReferenceDataFactory.getCountriesWithStates(localApiContext, HttpStatus.SC_OK);
	}
	

	@Test
	public void RefundTests() throws Exception {
		RefundFactory.createRefund(apiContext, new Refund(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		RefundFactory.resendRefundEmail(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);		
	}

	@Test
	public void ReturnTests() throws Exception {
        ReturnFactory.getReturns(apiContext, HttpStatus.SC_OK);
        ReturnFactory.createPaymentActionForReturn(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ReturnFactory.createReturn(apiContext, null, HttpStatus.SC_CONFLICT);
        ReturnFactory.deleteReturn(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.getAvailablePaymentActionsForReturn(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.getAvailableReturnActions(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.getPayment(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.getPayments(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.performPaymentActionForReturn(apiContext, null, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ReturnFactory.performReturnActions(apiContext, null, HttpStatus.SC_CONFLICT);
        ReturnFactory.getReturnItem(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.getReturnItems(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.createReturnItem(apiContext, new ReturnItem(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.updateReturn(apiContext, new Return(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ReturnFactory.deleteOrderItem(apiContext, Generator.randomString(6, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        ReturnFactory.getReasons(apiContext, HttpStatus.SC_OK);
        ReturnFactory.resendReturnEmail(apiContext, null, HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void SearchTests() throws Exception {
		SearchFactory.getSettings(apiContext, HttpStatus.SC_OK);
		SearchFactory.updateSettings(apiContext, new SearchSettings(), HttpStatus.SC_CONFLICT);
		SearchFactory.addSearchTuningRule(apiContext, null, HttpStatus.SC_CONFLICT);
		SearchFactory.updateSearchTuningRule(apiContext, new SearchTuningRule(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		SearchFactory.deleteSearchTuningRule(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		SearchFactory.getSearchTuningRule(apiContext, Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		SearchFactory.getSearchTuningRules(apiContext, HttpStatus.SC_OK);
		SearchFactory.getSearchTuningRuleSortFields(apiContext, HttpStatus.SC_OK);
		SearchFactory.updateSearchTuningRuleSortFields(apiContext, null, HttpStatus.SC_CONFLICT);
		SearchFactory.getSynonymDefinitionCollection(apiContext, com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_OK);
		SearchFactory.updateSynonymDefinitionCollection(apiContext, null, com.mozu.test.framework.helper.Constants.LocaleCode, HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void SecureAppDataTests() throws Exception {
		String AppId = Environment.getConfigValue("AppId");
		String AppKeyId = "qaAuto.181414b645cf42558b441a08fd1f5184";
		SecureAppDataFactory.createDBValue(apiContext, null, AppKeyId, null, HttpStatus.SC_CONFLICT);
		SecureAppDataFactory.deleteDBValue(apiContext, AppKeyId, null, HttpStatus.SC_CONFLICT);
		SecureAppDataFactory.getDBValue(apiContext, AppKeyId, null, HttpStatus.SC_CONFLICT);
		SecureAppDataFactory.updateDBValue(apiContext, null, AppKeyId, null, HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void ShipmentTests() throws Exception {
        ShipmentFactory.getShipment(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        ShipmentFactory.createPackageShipments(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        ShipmentFactory.deleteShipment(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}

	@Test
	public void ShippingInclusionRuleTests() throws Exception {
		ShippingProfile profile = ShippingProfileFactory.getProfiles(apiContext, HttpStatus.SC_OK).getItems().get(0);
		ShippingInclusionRuleCollection  rules = ShippingInclusionRuleFactory.getShippingInclusionRules(apiContext, profile.getCode(), HttpStatus.SC_OK);
		ShippingInclusionRule rule = ShippingInclusionRuleFactory.getShippingInclusionRule(apiContext, profile.getCode(), rules.getItems().get(0).getId(), HttpStatus.SC_OK);
		
		ServiceType stype = new ServiceType();
		stype.setCode(rule.getServiceTypes().get(1).getCode());
		ServiceTypeLocalizedContent content = new ServiceTypeLocalizedContent();
		content.setLocaleCode(com.mozu.test.framework.helper.Constants.LocaleCode);
		content.setName(rule.getServiceTypes().get(1).getContent().getName());
		stype.setContent(content);
		
		rule = new ShippingInclusionRule();
		List<String> list = new ArrayList<String>();
		list.add("United States");
		rule.setProductTargetRuleCodes(list);
		List<ServiceType> types = new ArrayList<ServiceType>();
		types.add(stype);
		rule.setServiceTypes(types);
		rule = ShippingInclusionRuleFactory.createShippingInclusionRule(apiContext, rule, profile.getCode(), HttpStatus.SC_OK);
	    list.add("HI and AK");
	    rule.setProductTargetRuleCodes(list);
	    rule = ShippingInclusionRuleFactory.updateShippingInclusionRule(apiContext, rule, profile.getCode(), rule.getId(), HttpStatus.SC_OK);
	    Assert.isTrue(rule.getShippingTargetRuleCodes().size()== 2);
	    ShippingInclusionRuleFactory.deleteShippingInclusionRule(apiContext, profile.getCode(), rule.getId(), HttpStatus.SC_OK);
	}

	@Test
	public void ShippingProfileTests() throws Exception {
		ShippingProfileCollection profiles = ShippingProfileFactory.getProfiles(apiContext, HttpStatus.SC_OK);
		Assert.isTrue(profiles.getTotalCount() != 0);
	}

	@Test
	public void ShippingStatesTests() throws Exception {
		ShippingProfile profile = ShippingProfileFactory.getProfiles(apiContext, HttpStatus.SC_OK).getItems().get(0);
		List<ShippingStates> list = ShippingStatesFactory.getStates(apiContext, profile.getCode(), HttpStatus.SC_OK);
		State state = list.get(0).getStates().get(0);
		int size = list.get(0).getStates().size();
		list.get(0).getStates().remove(0);
		list = ShippingStatesFactory.updateStates(apiContext, list, profile.getCode(), HttpStatus.SC_OK);
		Assert.isTrue(list.get(0).getStates().size() == size - 1);
		list.get(0).getStates().add(state);
		ShippingStatesFactory.updateStates(apiContext, list, profile.getCode(), HttpStatus.SC_OK);
	}

	@Test
	public void ShippingTests() throws Exception {
		ShippingFactory.getRates(apiContext, new RateRequest(), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void SiteDataTests() throws Exception {
        SiteDataFactory.getDBValue(apiContext, "ProductCode", HttpStatus.SC_NOT_FOUND);
        SiteDataFactory.createDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        SiteDataFactory.deleteDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NO_CONTENT);
        SiteDataFactory.updateDBValue(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void SiteShippingHandlingFeeTests() throws Exception {
        SiteShippingHandlingFeeFactory.getOrderHandlingFee(apiContext, HttpStatus.SC_BAD_REQUEST);
        SiteShippingHandlingFeeFactory.createOrderHandlingFee(apiContext, null, HttpStatus.SC_BAD_REQUEST);
        SiteShippingHandlingFeeFactory.updateOrderHandlingFee(apiContext, null, HttpStatus.SC_BAD_REQUEST);        
	}
	
	@Test
	public void SiteShippingSettingsTests() throws Exception {
        SiteShippingSettingsFactory.getSiteShippingSettings(apiContext, HttpStatus.SC_OK);
	}
	
	@Test
	public void SoftAllocationTests() throws Exception {
		SoftAllocationFactory.addSoftAllocations(apiContext, null, HttpStatus.SC_CONFLICT);
		SoftAllocationFactory.convertToProductReservation(apiContext, null, HttpStatus.SC_CONFLICT);
		SoftAllocationFactory.deleteSoftAllocation(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
		SoftAllocationFactory.getSoftAllocation(apiContext, Generator.randomInt(100, 200), HttpStatus.SC_NOT_FOUND);
		SoftAllocationFactory.getSoftAllocations(apiContext, HttpStatus.SC_OK);
		SoftAllocationFactory.renewSoftAllocations(apiContext, null, HttpStatus.SC_CONFLICT);
		SoftAllocationFactory.updateSoftAllocations(apiContext, null, HttpStatus.SC_CONFLICT);
	}

	@Test
	public void StoreFrontCategoryTests() throws Exception {
        StorefrontCategoryFactory.getCategories(shopperApiContext, null, HttpStatus.SC_OK);
        StorefrontCategoryFactory.getCategoryTree(shopperApiContext, null, HttpStatus.SC_OK);
        StorefrontCategoryFactory.getCategory(shopperApiContext, null, Generator.randomInt(1000, 2000), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void SubscriptionTests() throws Exception {
		SubscriptionFactory.getSubscriptions(apiContext, HttpStatus.SC_OK);
	}
	
	@Test
	public void TargetRuleTests() throws Exception {
		TargetRuleFactory.createTargetRule(apiContext, null, HttpStatus.SC_CONFLICT);
		TargetRuleFactory.deleteTargetRule(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
		TargetRuleFactory.getTargetRules(apiContext, HttpStatus.SC_OK);
		TargetRuleFactory.updateTargetRule(apiContext, new TargetRule(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
		TargetRuleFactory.validateTargetRule(apiContext, new TargetRule(), HttpStatus.SC_CONFLICT);
	}
	
	@Test
	public void TaxableTerritoryTests() throws Exception {
		try
		{
	        TaxableTerritoryFactory.getTaxableTerritories(apiContext, HttpStatus.SC_OK);
		}
		catch (TestFailException te)
	    {
	    	if (te.getActualReturnCode().equals(""+HttpStatus.SC_NOT_FOUND))
	    	{
	    	}
			
		}
        TaxableTerritoryFactory.addTaxableTerritory(apiContext, null, HttpStatus.SC_CONFLICT);
        TaxableTerritoryFactory.updateTaxableTerritories(apiContext, null, HttpStatus.SC_CONFLICT);
	}

	@Test
	public void TenantAdminUserAuthTicketTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		UserAuthInfo info = new UserAuthInfo();
		info.setEmailAddress(email);
		info.setPassword(password);
		TenantAdminUserAuthTicket ticket = TenantAdminUserAuthTicketFactory.createUserAuthTicket(localApiContext, info, HttpStatus.SC_OK);
		TenantAdminUserAuthTicket refreshTicket = TenantAdminUserAuthTicketFactory.refreshAuthTicket(localApiContext, ticket, HttpStatus.SC_OK);
		TenantAdminUserAuthTicketFactory.deleteUserAuthTicket(localApiContext, refreshTicket.getRefreshToken(), HttpStatus.SC_OK);
	}
	
	@Test
	public void TenantDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
        TenantDataFactory.getDBValue(localApiContext, "CreatedDate", HttpStatus.SC_NOT_FOUND);
        TenantDataFactory.createDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        TenantDataFactory.deleteDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NO_CONTENT);
        TenantDataFactory.updateDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
	}

	@Test
	public void TenantExtensionsTests() throws Exception {
		TenantExtensionsFactory.getExtensions(apiContext, HttpStatus.SC_OK);
		TenantExtensionsFactory.updateExtensions(apiContext, new TenantExtensions(), HttpStatus.SC_OK);
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
				Tenant tn = TenantFactory.getTenant(localApiContext, i, HttpStatus.SC_OK);
				list.add(tn.getId());				
			}
			catch (TestFailException te)
		    {
		    	if (te.getActualReturnCode().equals("" + HttpStatus.SC_NOT_FOUND) || te.getActualReturnCode() == String.format("{0}",HttpStatus.SC_UNAUTHORIZED))
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
        TransactionFactory.getTransactions(apiContext, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_OK);
        TransactionFactory.addTransaction(apiContext, null, shopperAuth.getCustomerAccount().getId(), HttpStatus.SC_BAD_REQUEST);
        TransactionFactory.removeTransaction(apiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(6, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void UserDataTests() throws Exception {
		ApiContext localApiContext = new MozuApiContext(tenantId, null, null, null);
		UserDataFactory.createDBValue(localApiContext, "'"+DateTime.now().toString()+"'", "CreatedDate", HttpStatus.SC_BAD_REQUEST);
        UserDataFactory.getDBValue(localApiContext, "CreatedDate", HttpStatus.SC_BAD_REQUEST);
        UserDataFactory.deleteDBValue(localApiContext, "CreatedDate", HttpStatus.SC_BAD_REQUEST);
        UserDataFactory.updateDBValue(localApiContext, Generator.randomString(5, Generator.AlphaChars), "CreatedDate", HttpStatus.SC_CONFLICT);
	}

	@Test
	public void ViewTests() throws Exception {
		ViewFactory.getViewDocuments(apiContext, Generator.randomString(5, Generator.AlphaChars), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}
	
	@Test
	public void VisitTests() throws Exception {
        VisitFactory.getVisits(apiContext, HttpStatus.SC_OK);
        VisitFactory.addVisit(apiContext, null, HttpStatus.SC_BAD_REQUEST);
        VisitFactory.getVisit(apiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        VisitFactory.updateVisit(apiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
	}
	
	@Test
	public void WishlistTests() throws Exception {
        WishlistFactory.createWishlist(shopperApiContext, null, HttpStatus.SC_CONFLICT);
        WishlistFactory.getWishlists(shopperApiContext, null,  null,  null,  null,  null,  null, null, HttpStatus.SC_OK);
        WishlistFactory.getWishlist(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        WishlistFactory.getWishlistByName(shopperApiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
        WishlistFactory.updateWishlist(shopperApiContext, null, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        /*bug 67285*/
        WishlistFactory.deleteWishlist(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void WishlistItemTests() throws Exception {
		
        WishlistItemFactory.addItemToWishlist(shopperApiContext, null, Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_CONFLICT);
        WishlistItemFactory.getWishlistItems(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), null, null, null, null, null, HttpStatus.SC_BAD_REQUEST);
        WishlistItemFactory.removeAllWishlistItems(shopperApiContext, Generator.randomString(5, Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        WishlistItemFactory.deleteWishlistItem(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        WishlistItemFactory.getWishlistItem(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), HttpStatus.SC_BAD_REQUEST);
        WishlistItemFactory.updateWishlistItemQuantity(shopperApiContext, Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(5,  Generator.AlphaChars), 5, HttpStatus.SC_BAD_REQUEST);
        WishlistItemFactory.getWishlistItemsByWishlistName(shopperApiContext, shopperAuth.getCustomerAccount().getId(), Generator.randomString(5, Generator.AlphaChars), null, null, null, null, null, HttpStatus.SC_NOT_FOUND);
	}
}
