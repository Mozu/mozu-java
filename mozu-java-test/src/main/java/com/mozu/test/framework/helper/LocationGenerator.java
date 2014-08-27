package com.mozu.test.framework.helper;

import java.util.ArrayList;
import java.util.List;

import com.mozu.api.contracts.location.FulfillmentType;
import com.mozu.api.contracts.location.Hours;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationType;
import com.mozu.api.contracts.location.RegularHours;
import com.mozu.api.contracts.location.ShippingOriginContact;

public class LocationGenerator {
	public static Location generate(List<LocationType> types)
	{
		Location lc = new Location();
		lc.setLocationTypes(types);
		lc.setCode(Generator.randomString(5,  Generator.AlphaChars));
		lc.setAddress(CustomerGenerator.generateAddress("tx"));
		lc.setName(Generator.randomString(5, Generator.AlphaChars));
		List<FulfillmentType> ftypes = new ArrayList<FulfillmentType>();
		ftypes.add(generateFulfillmentType("SP", "Store Pickup"));
		lc.setFulfillmentTypes(ftypes);
		lc.setPhone(Generator.randomPhoneNumber());
		lc.setGeo(Generator.randomGeo());
		lc.setShippingOriginContact(generateShippingOriginContact());
		lc.setDescription(Generator.randomString(10, Generator.AlphaChars));
		lc.setRegularHours(generateRegularHours());
		lc.setSupportsInventory(true);
		lc.setFax(Generator.randomPhoneNumber());
		return lc;
	}
	
    public static LocationType  generateLocationType()
    {
    	LocationType type = new LocationType();
    	type.setCode(Generator.randomString(5,  Generator.AlphaChars));
    	type.setName(Generator.randomString(6, Generator.AlphaChars));
    	return type;
    }
    
    public static LocationType  generateLocationType(String code, String name)
    {
    	LocationType type = new LocationType();
    	type.setCode(code);
    	type.setName(name);
    	return type;
    }

    public static FulfillmentType  generateFulfillmentType(String code, String name)
    {
    	FulfillmentType type = new FulfillmentType();
    	type.setCode(code);
    	type.setName(name);
    	return type;
    }
    
    public static ShippingOriginContact  generateShippingOriginContact()
    {
    	ShippingOriginContact contact = new ShippingOriginContact();
    	contact.setFirstName(Generator.randomString(5, Generator.AlphaChars));
    	contact.setLastNameOrSurname(Generator.randomString(6,  Generator.AlphaChars));
    	contact.setEmail(Generator.randomEmailAddress());
    	contact.setPhoneNumber(Generator.randomPhoneNumber());
    	contact.setCompanyOrOrganization(Generator.randomString(10, Generator.AlphaChars));
    	return contact;
    }
    
    public static RegularHours  generateRegularHours()
    {
    	RegularHours hours = new RegularHours();
    	hours.setMonday(generateHours());
    	hours.setTuesday(generateHours());
    	return hours;
    }
    
    public static Hours generateHours()
    {
    	Hours hrs = new Hours();
    	hrs.setLabel("8am -- 6pm");
    	return hrs;
    }
}
