package com.mozu.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.location.Location;
import com.mozu.api.contracts.location.LocationType;
import com.mozu.test.framework.core.MozuApiTestBase;
import com.mozu.test.framework.datafactory.LocationFactory;
import com.mozu.test.framework.datafactory.LocationTypeFactory;
import com.mozu.test.framework.helper.LocationGenerator;

public class LocationTests extends MozuApiTestBase  {

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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void locationTypeTest1() throws Exception{
		LocationType typeObj = LocationGenerator.generateLocationType();
		LocationTypeFactory.addLocationType(apiContext, typeObj, HttpStatus.SC_CREATED);
		LocationType type = LocationTypeFactory.getLocationType(apiContext, typeObj.getCode(), HttpStatus.SC_OK);
		assertEquals(type.getName(), typeObj.getName());
        LocationTypeFactory.deleteLocationType(apiContext, typeObj.getCode(), HttpStatus.SC_NO_CONTENT);
        LocationTypeFactory.getLocationType(apiContext, typeObj.getCode(), HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void locationTest1() throws Exception{
		LocationType typeObj = LocationGenerator.generateLocationType();
		LocationType addLocationType = LocationTypeFactory.addLocationType(apiContext, typeObj, HttpStatus.SC_CREATED);
		List<LocationType> types = new ArrayList<LocationType>();
		types.add(addLocationType);
/*bug 35404*/		Location addLocation = LocationFactory.addLocation(apiContext, LocationGenerator.generate(types), HttpStatus.SC_CREATED);
		Location getLocation = LocationFactory.getLocation(apiContext, addLocation.getCode(), HttpStatus.SC_OK);
		LocationFactory.deleteLocation(apiContext, getLocation.getCode(), HttpStatus.SC_NO_CONTENT);
        LocationFactory.getLocation(apiContext, getLocation.getCode(), HttpStatus.SC_NOT_FOUND);
        LocationTypeFactory.deleteLocationType(apiContext, addLocationType.getCode(), HttpStatus.SC_NO_CONTENT);
	}
}
