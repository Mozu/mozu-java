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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.core.Phone;
import com.mozu.api.resources.platform.entitylists.EntityResource;
import com.mozu.api.utils.JsonUtils;
import com.mozu.base.models.AppInfo;
import com.mozu.base.models.EntityCollection;
import com.mozu.base.utils.ApplicationUtils;

public class EntityHandlerTest {

    private static final Integer TENANT_ID = 123;
    private static final String ENTITY_NAME = "EntityName";
    private static final String ENTITY_ID = "EntityId";
    private static final String ENTITY_NAMESPACE = "EntityNamespace";

    private ObjectMapper mapper = JsonUtils.initObjectMapper();

    @Mocked AppInfo mockAppInfo;
    @Mocked com.mozu.api.contracts.mzdb.EntityCollection mockEntityCollection;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getEntityTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
        };
        
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };
        
        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        
        Contact rtnContact = handler.getEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID);
        assertNotNull(rtnContact);
        
        isEqualContacts(createContact(), rtnContact);
    }
    
    @Test
    public void getEntityExceptionTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                throw new ApiException("Test message");
            }
        };
        
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };
        
        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        
        try {
            handler.getEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID);
            fail("ApiException expected");
        } catch (ApiException ae) {
            // expected
        }
    }
    
    @Test
    public void getEntityNotFoundTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                ApiError apiError = new ApiError();
                apiError.setErrorCode("ITEM_NOT_FOUND");
                throw new ApiException("Test message", apiError);
            }
        };
        
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };
        
        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        
        Contact rtnContact = handler.getEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID);
        assertNull(rtnContact);
    }
    
    @Test
    public void upsertEntityInsertTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                ApiError apiError = new ApiError();
                apiError.setErrorCode("ITEM_NOT_FOUND");
                throw new ApiException("Test message", apiError);
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                return null;
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                throw new ApiException("Invalid call");
            }

        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        Contact contact = createContact();
        handler.upsertEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID, contact);

    }
    
    @Test
    public void upsertEntityUpdateTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                throw new ApiException("Invalid call");
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                return null;
            }

        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        Contact contact = createContact();
        handler.upsertEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID, contact);

    }
    
    @Test
    public void upsertEntityExceptionTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                throw new ApiException("Test Exception");
            }

        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        Contact contact = createContact();
        try {
            handler.upsertEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID, contact);
            fail("Exception expected");
        } catch (Exception e) {
            // expected
        }

    }
    
    @Test
    public void getEntityCollectionTest() throws Exception {
        final List<JsonNode> jNodeList = new ArrayList<JsonNode>();
        String contactString = mapper.writeValueAsString(createContact());
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName, Integer pageSize, 
                    Integer startIndex, String filter, String sortBy, String responseFields) throws Exception {
                return mockEntityCollection;
            }
        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
            {mockEntityCollection.getPageCount(); result=1;}
            {mockEntityCollection.getPageSize(); result=100;}
            {mockEntityCollection.getStartIndex(); result=0;}
            {mockEntityCollection.getTotalCount(); result=3;}
            {mockEntityCollection.getItems(); result=jNodeList;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        EntityCollection<Contact> entities = handler.getEntityCollection(TENANT_ID, ENTITY_NAME);
        assertNotNull(entities);
        assertEquals(new Integer(3), entities.getTotalCount());
        for (Contact contact: entities.getItems()) {
            isEqualContacts(createContact(), contact);
        }
        
    }
    
    @Test
    public void getEntityCollectionNotFoundTest() throws Exception {
        final List<JsonNode> jNodeList = new ArrayList<JsonNode>();
        String contactString = mapper.writeValueAsString(createContact());
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName, Integer pageSize, 
                    Integer startIndex, String filter, String sortBy, String responseFields) throws Exception {
                ApiError apiError = new ApiError();
                apiError.setErrorCode("ITEM_NOT_FOUND");
                throw new ApiException("Test message", apiError);
            }
        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);

        EntityCollection<Contact> entities = handler.getEntityCollection(TENANT_ID, ENTITY_NAME);
        assertNull(entities);
    }
    
    @Test
    public void getEntityCollectionExceptionTest() throws Exception {
        final List<JsonNode> jNodeList = new ArrayList<JsonNode>();
        String contactString = mapper.writeValueAsString(createContact());
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        jNodeList.add(mapper.readTree(contactString));
        
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock JsonNode getEntity(String entityListFullName, String id) throws Exception {
                String contactString = mapper.writeValueAsString(createContact());
                JsonNode jNode = mapper.readTree(contactString);
                return jNode;
            }
            @Mock JsonNode insertEntity(JsonNode item, String entityListFullName) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock JsonNode updateEntity(JsonNode item, String entityListFullName, String id) throws Exception {
                throw new ApiException("Test Exception");
            }
            @Mock com.mozu.api.contracts.mzdb.EntityCollection getEntities(String entityListFullName, Integer pageSize, 
                    Integer startIndex, String filter, String sortBy, String responseFields) throws Exception {
                throw new ApiException("Test Exception");
            }
        };
         
        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);

        try {
            EntityCollection<Contact> entities = handler.getEntityCollection(TENANT_ID, ENTITY_NAME);
            fail("Exception expected");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void deleteEntityTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock void deleteEntity(String entityListFullName, String id) throws Exception {}
        };

        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        handler.deleteEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID);
    }

    @Test
    public void deleteEntityExceptionTest() throws Exception {
        new MockUp<ApplicationUtils>() {
            @Mock AppInfo getAppInfo() {
                return mockAppInfo;
            }
        };
        
        new MockUp<EntityResource>() {
            @Mock void $init(ApiContext apiContext) {}
            @Mock void deleteEntity(String entityListFullName, String id) throws Exception {
                ApiError apiError = new ApiError();
                apiError.setErrorCode("ITEM_NOT_FOUND");
                throw new ApiException("Test message", apiError);
            }
        };

        new Expectations() {
            {mockAppInfo.getNameSpace(); result=ENTITY_NAMESPACE;}
        };

        EntityHandler<Contact> handler = new EntityHandler<Contact>(Contact.class);
        try {
            handler.deleteEntity(TENANT_ID, ENTITY_NAME, ENTITY_ID);
            fail("Exception expected");
        } catch (Exception e) {
            // expected
        }
    }
    
    private void isEqualContacts(Contact expected, Contact actual) {
        assertEquals(expected.getAddress().getAddress1(), actual.getAddress().getAddress1());
        assertEquals(expected.getAddress().getAddress2(), actual.getAddress().getAddress2());
        assertEquals(expected.getAddress().getAddress3(), actual.getAddress().getAddress3());
        assertEquals(expected.getAddress().getAddress4(), actual.getAddress().getAddress4());
        assertEquals(expected.getCompanyOrOrganization(), actual.getCompanyOrOrganization());
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getLastNameOrSurname(), actual.getLastNameOrSurname());
        assertEquals(expected.getPhoneNumbers().getHome(), actual.getPhoneNumbers().getHome());
        assertEquals(expected.getPhoneNumbers().getMobile(), actual.getPhoneNumbers().getMobile());
        assertEquals(expected.getPhoneNumbers().getWork(), actual.getPhoneNumbers().getWork());
    }

    private Contact createContact() {
        Contact contact = new Contact();
        
        contact.setAddress(createAddress());
        contact.setCompanyOrOrganization("Mozu");
        contact.setEmail("integrations@mozu.com");
        contact.setFirstName("Chief");
        contact.setId(1234);
        contact.setLastNameOrSurname("Developer");
        contact.setPhoneNumbers(createPhoneNumbers());
        return contact;
    }

    private Phone createPhoneNumbers() {
        Phone phone = new Phone();
        phone.setHome("512555HOME");
        phone.setMobile("512555MBLE");
        phone.setWork("512555WORK");
        return phone;
    }

    private Address createAddress() {
        Address address = new Address();
        address.setAddress1("1835 Kramer Ln");
        address.setAddress2("Suite 100");
        address.setAddress3("Hallway 4");
        address.setAddress4("Desk 2");
        address.setAddressType("Commercial");
        address.setCityOrTown("Austin");
        address.setCountryCode("US");
        address.setPostalOrZipCode("78758");
        address.setStateOrProvince("Tx");
        return address;
    }

}
