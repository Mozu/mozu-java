package com.mozu.base.handlers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;
import com.mozu.api.resources.platform.EntityListResource;
import com.mozu.api.resources.platform.entitylists.EntityResource;
import com.mozu.base.models.AppInfo;
import com.mozu.base.models.EntityDataTypes;
import com.mozu.base.models.EntityScope;
import com.mozu.base.utils.ApplicationUtils;

public class EntitySchemaHandlerTest {
    private static final String ENTITY_NAME = "EntityName";
    private static final String ENTITY_NAMESPACE = "EntityNamespace";
    
    @Mocked AppInfo mockAppInfo;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void getEntityTest() throws Exception {
        new MockUp<EntityListResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock EntityList getEntityList(String entityListFullName) throws Exception {
                return new EntityList();
            }
        };

        ApiContext apiContext = new MozuApiContext();
        EntitySchemaHandler handler = new EntitySchemaHandler();
        EntityList entities = handler.getEntityList(apiContext, ENTITY_NAME, ENTITY_NAMESPACE);
        assertNotNull(entities);
    }

    @Test
    public void installSchemaNewTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityListResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock EntityList getEntityList(String entityListFullName) throws Exception {
                return null;
            }
            @Mock EntityList createEntityList(EntityList entities) {
                return new EntityList();
            }
        };

        new Expectations() {
            {mockAppInfo.getNameSpace(); result="TestNamespace";}
            {mockAppInfo.getNameSpace(); result="TestNamespace";}
        };
        
        ApiContext apiContext = new MozuApiContext();
        EntityList entityList = new EntityList();
        entityList.setName("TestSchema");
        entityList.setIsVisibleInStorefront(Boolean.FALSE);
        entityList.setIsLocaleSpecific(false);
        entityList.setIsSandboxDataCloningSupported(Boolean.TRUE);
        entityList.setIsShopperSpecific(false);

        List<IndexedProperty> indexedProperties = new ArrayList<IndexedProperty>();
        indexedProperties.add(createIndexProperty("id", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 1", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 2", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 3", EntityDataTypes.Integer));

        EntitySchemaHandler handler = new EntitySchemaHandler();
        handler.installSchema(apiContext, entityList, EntityScope.Tenant, indexedProperties);
    }

    @Test
    public void installSchemaUpdateTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityListResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock EntityList getEntityList(String entityListFullName) throws Exception {
                return new EntityList();
            }
            @Mock EntityList updateEntityList(EntityList entities, String name) {
                return new EntityList();
            }
        };

        new Expectations() {
            {mockAppInfo.getNameSpace(); result="TestNamespace";}
            {mockAppInfo.getNameSpace(); result="TestNamespace";}
        };
        
        ApiContext apiContext = new MozuApiContext();
        EntityList entityList = new EntityList();
        entityList.setName("TestSchema");
        entityList.setIsVisibleInStorefront(Boolean.FALSE);
        entityList.setIsLocaleSpecific(false);
        entityList.setIsSandboxDataCloningSupported(Boolean.TRUE);
        entityList.setIsShopperSpecific(false);

        List<IndexedProperty> indexedProperties = new ArrayList<IndexedProperty>();
        indexedProperties.add(createIndexProperty("id", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 1", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 2", EntityDataTypes.Integer));
        indexedProperties.add(createIndexProperty("prop 3", EntityDataTypes.Integer));

        EntitySchemaHandler handler = new EntitySchemaHandler();
        handler.installSchema(apiContext, entityList, EntityScope.Tenant, indexedProperties);
    }

    private IndexedProperty createIndexProperty(String propertyName, EntityDataTypes type) {
        IndexedProperty property = new IndexedProperty();
        property.setDataType(type.toString());
        property.setPropertyName(propertyName);
        return property;
    }

}
