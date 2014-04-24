package com.mozu.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.DataViewMode;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.content.Document;
import com.mozu.api.contracts.content.DocumentCollection;
import com.mozu.api.resources.content.documentlists.DocumentResource;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.SecurityTestBase;

public class MozuClientTest extends SecurityTestBase {
    @Test
    public void MozuClientInputStreamTest () throws Exception {
        authenticateUser(AuthenticationScope.Tenant, USER_TENANT);
        ApiContext apiContext = new MozuApiContext(TENANT_ID, null, 1, 1);
        
        DocumentResource resource = new DocumentResource(apiContext);
        
        DocumentCollection docs = resource.getDocuments(DataViewMode.Live, "files");
        Document document = null;
        
        if (docs.getTotalCount() > 0) {
            document = docs.getItems().get(0);
        } else {
            fail("You must add files to the file manager in Site Builder to get this test to pass.");
        }

        InputStream inputStream = resource.getDocumentContent(DataViewMode.Live, "files", document.getId());

        assertNotNull(inputStream);
        
        
    }
   
}
