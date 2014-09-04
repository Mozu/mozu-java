package com.mozu.test.framework.helper;

import java.util.ArrayList;
import java.util.List;

import com.mozu.api.contracts.commerceruntime.carts.CartItem;
import com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction;
import com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo;
import com.mozu.api.contracts.commerceruntime.fulfillment.PackageItem;
import com.mozu.api.contracts.commerceruntime.fulfillment.Pickup;
import com.mozu.api.contracts.commerceruntime.fulfillment.PickupItem;
import com.mozu.api.contracts.commerceruntime.orders.OrderAction;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;
import com.mozu.api.contracts.commerceruntime.payments.PaymentAction;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.returns.Return;
import com.mozu.api.contracts.commerceruntime.returns.ReturnAction;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;
import com.mozu.api.contracts.commerceruntime.returns.ReturnReason;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.core.User;
import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerAccountAndAuthInfo;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;

public class CustomerGenerator {
	
    public static User generate(Boolean isActive, String password)
    {
        User user = new User();
        user.setEmailAddress(Generator.randomEmailAddress());
        user.setFirstName(Generator.randomString(5, Generator.AlphaChars));
        user.setLastName(Generator.randomString(5, Generator.AlphaChars));
        user.setIsActive(isActive);
        user.setLocaleCode(Constants.LocaleCode);
        user.setPassword(password);
        return user;
    }
    
//    public static CustomerAccount generateCustomerAccount(String userId)
//    {
//    	CustomerAccount account = new CustomerAccount();
//    	account.setUserId(userId);
//    	return account;
//    }
//    
    public static Address generateAddress(String state)
    {
    	Address addr = new Address();
    	if (state.equalsIgnoreCase("tx"))
    	{
        	addr.setAddress1("9801 Parmer Ln");
        	addr.setCityOrTown("Austin");
        	addr.setStateOrProvince("TX");
        	addr.setPostalOrZipCode("78717");
    	}
    	else if(state.equalsIgnoreCase("ca"))
    	{
        	addr.setAddress1("1156 High Street");
        	addr.setCityOrTown("Santa Cruz");
        	addr.setStateOrProvince("CA");
        	addr.setPostalOrZipCode("95064");
    	}
    	addr.setCountryCode(Constants.CountryCode);
    	addr.setAddressType("Residential");
    	return addr;
    }

    public static Address generateInvalidAddress()
    {
    	Address addr = new Address();
    	addr.setAddress1("9801 Pamer Ln");
    	addr.setCityOrTown("Austin");
    	addr.setStateOrProvince("TX");
    	addr.setPostalOrZipCode("78717");
    	addr.setCountryCode(Constants.CountryCode);
    	return addr;
    }

    public static CustomerContact generateCustomerContact(Integer accountId, String email, String firstName,
            String lastNameOrSurname)
    {
    	CustomerContact contact = new CustomerContact();
    	contact.setAccountId(accountId);
    	contact.setEmail(email);
    	contact.setFirstName(firstName);
    	contact.setLastNameOrSurname(lastNameOrSurname);
    	contact.setAddress(generateAddress("tx"));
    	contact.setPhoneNumbers(Generator.randomPhone());
    	return contact; 	
    }
    
    public static Contact generateContact(String email, String firstName,
            String lastNameOrSurname)
    {
    	Contact contact = new Contact();
    	contact.setAddress(generateAddress("ca"));
    	contact.setEmail(email);
    	contact.setFirstName(firstName);
    	contact.setLastNameOrSurname(lastNameOrSurname);
    	contact.setPhoneNumbers(Generator.randomPhone());
    	return contact;
    }
    
    public static CustomerUserAuthInfo generateUserAuthInfo(String username, String passwd)
    {
    	CustomerUserAuthInfo info = new CustomerUserAuthInfo();
    	info.setUsername(username);
    	info.setPassword(passwd);
    	return info;
     }

    public static CartItem generateCartItem(com.mozu.api.contracts.productruntime.Product product, Integer count)
    {
    	CartItem item = new CartItem();
    	Product pr = new Product();
    	pr.setProductCode(product.getProductCode());
    	item.setProduct(pr);
    	item.setQuantity(count);
    	return item;
     }

    public static CartItem generateCartItem(com.mozu.api.contracts.productruntime.Product product, Integer count, String fulfillmentLocationCode, String fulfillmentMethod)
    {
    	CartItem item = generateCartItem(product, count);
    	item.setFulfillmentLocationCode(fulfillmentLocationCode);
    	item.setFulfillmentMethod(fulfillmentMethod);
    	return item;
     }

    public static CustomerAccountAndAuthInfo  generateCustomerAccountAndAuthInfo()
    {
    	CustomerAccount customer = new CustomerAccount();
    	customer.setAcceptsMarketing(false);
    	customer.setCompanyOrOrganization(Generator.randomString(8, Generator.AlphaChars));
    	ArrayList<CustomerContact> contacts = new ArrayList<CustomerContact>();
    	contacts.add(generateCustomerContact(null, Generator.randomEmailAddress(), Generator.randomString(5,  Generator.AlphaChars), Generator.randomString(6,  Generator.AlphaChars)));
    	customer.setContacts(contacts);
    	customer.setEmailAddress(Generator.randomEmailAddress());
    	customer.setFirstName(Generator.randomString(5,  Generator.AlphaChars));
    	customer.setLastName(Generator.randomString(6,  Generator.AlphaChars));
    	customer.setLocaleCode(Constants.LocaleCode);
    	customer.setUserName(Generator.randomString(6, Generator.AlphaChars));
    	CustomerAccountAndAuthInfo customerAccountAndAuthInfo = new CustomerAccountAndAuthInfo();
        customerAccountAndAuthInfo.setAccount(customer);
        customerAccountAndAuthInfo.setPassword(Constants.Password);
        return customerAccountAndAuthInfo;    	
    }
    
    public static CustomerAccountAndAuthInfo generateCustomerAccountAndAuthInfo(Boolean taxExempt, String taxId)
    {
    	CustomerAccountAndAuthInfo info = generateCustomerAccountAndAuthInfo();
    	CustomerAccount customer = info.getAccount();
    	customer.setTaxExempt(taxExempt);
    	customer.setTaxId(taxId);
    	info.setAccount(customer);
    	return info;
    }
    
    public static FulfillmentInfo generateFulfillmentInfo(Boolean isDestinationCommercial, Contact fulfillmentContact, String shippingMethodCode, String shippingMethodName)
    {
    	FulfillmentInfo info = new FulfillmentInfo();
    	info.setIsDestinationCommercial(isDestinationCommercial);
    	info.setFulfillmentContact(fulfillmentContact);
    	info.setShippingMethodCode(shippingMethodCode);
    	info.setShippingMethodName(shippingMethodName);
    	return info;
    }

    public static FulfillmentAction generateFulfillmentAction(String actionName, String packageId, String pickupId)
    {
    	FulfillmentAction action = new FulfillmentAction();
    	action.setActionName(actionName);
    	List<String> list = new ArrayList<String>();
    	if(packageId != null)
    	{
        	list.add(packageId);
        	action.setPackageIds(list);    		
    	}
    	if(pickupId != null)
    	{
        	list.clear();
        	list.add(pickupId);    		
        	action.setPickupIds(list);
    	}
    	return action;
    }

    public static BillingInfo generateBillingInfo(Contact billingContact, String paymentType, Boolean isSameBillingShippingAddress)
    {
    	BillingInfo info = new BillingInfo();
    	info.setBillingContact(billingContact);
    	info.setPaymentType(paymentType);
    	info.setIsSameBillingShippingAddress(isSameBillingShippingAddress);
    	return info;
    }
    
    public static PaymentAction generatePaymentAction(String actionName, Double amount, String checkNumber, String referenceSourcePaymentId)
    {
    	PaymentAction action = new PaymentAction();
    	action.setActionName(actionName);
    	action.setAmount(amount);
    	action.setCheckNumber(checkNumber);
    	action.setReferenceSourcePaymentId(referenceSourcePaymentId);
    	action.setCurrencyCode(Constants.Currency);
    	return action;    	
    }

    public static OrderAction generateOrderAction(String actionName)
    {
    	OrderAction action = new OrderAction();
    	action.setActionName(actionName);
    	return action;    	
    }
    
    public static Pickup generatePickup(PickupItem item, String fulfillmentLocationCode)
    {
    	Pickup pickup = new Pickup();
    	List<PickupItem> list = new ArrayList<PickupItem>();
    	list.add(item);
    	pickup.setItems(list);
    	pickup.setFulfillmentLocationCode(fulfillmentLocationCode);
    	return pickup;    	
    }

    public static PickupItem generatePickupItem(String productCode, Integer quantity)
    {
    	PickupItem item = new PickupItem();
    	item.setProductCode(productCode);
    	item.setQuantity(quantity);
    	return item;    	
    }
    
    public static com.mozu.api.contracts.commerceruntime.fulfillment.Package generatePackage(String shippingMethodCode, String shippingMethodName, String productCode, Integer quantity)
    {
    	com.mozu.api.contracts.commerceruntime.fulfillment.Package pk = new com.mozu.api.contracts.commerceruntime.fulfillment.Package();
    	pk.setShippingMethodCode(shippingMethodCode);
    	pk.setShippingMethodName(shippingMethodName);
    	List<PackageItem> list = new ArrayList<PackageItem>();
    	list.add(generateItem(productCode, quantity));
    	pk.setItems(list);
    	return pk;    	
    }
    
    public static PackageItem generateItem(String productCode, Integer quantity)
    {
    	PackageItem item = new PackageItem();
    	item.setProductCode(productCode);
    	item.setQuantity(quantity);
    	return item;
    }

    public static Return generateReturn(String returnType, String returnOrderId, ReturnItem item)
    {
    	Return rt = new Return();
    	rt.setReturnType(returnType);
    	rt.setReturnOrderId(returnOrderId);
    	List<ReturnItem> list = new ArrayList<ReturnItem>();
    	list.add(item);
    	rt.setItems(list);
    	rt.setRefundAmount(200.);
    	return rt;    	
    }

    public static ReturnItem generateReturnItem(String orderItemId, Product product, Integer quantity)
    {
    	ReturnItem item = new ReturnItem();
    	item.setOrderItemId(orderItemId);
    	item.setProduct(product);
    	List<ReturnReason> reasons = new ArrayList<ReturnReason>();
    	reasons.add(generateReturnReason(quantity, "Damaged"));
    	item.setReasons(reasons);
    	return item;    	
    }
    
    public static ReturnReason generateReturnReason(Integer quantity, String reason)
    {
    	ReturnReason rreason = new ReturnReason();
    	rreason.setQuantity(quantity);
    	rreason.setReason(reason);
    	return rreason;
    }    

    public static ReturnAction generateReturnAction(String actionName, String returnId)
    {
    	ReturnAction action = new ReturnAction();
    	action.setActionName(actionName);
        List<String> returnIds = new ArrayList<String>();
        returnIds.add(returnId);
    	action.setReturnIds(returnIds);
    	return action;
    }    
}
