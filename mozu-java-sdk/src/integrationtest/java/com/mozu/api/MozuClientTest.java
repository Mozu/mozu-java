package com.mozu.api;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import org.junit.After;
import org.junit.Test; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.contracts.content.Document;
import com.mozu.api.resources.content.documentlists.DocumentResource;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.SecurityTestBase;

public class MozuClientTest extends SecurityTestBase {
    private static final Logger logger = LoggerFactory.getLogger(MozuClientTest.class);

    private static final String MOZU_DOCUMENT_LIST_NAME = "files@mozu";
    private static final String MOZU_DOCUMENT_TYPE_FQN = "image@mozu";
    private static final String UPLOAD_FILE_NAME = "/snippet.png";
    
    private static final String CONTENT_TYPE = "image/png";
    
    private String docId;
    
    @After
    public void cleanUp() {
        if (docId != null) {
            ApiContext apiContext = new MozuApiContext(configProps.getInt(TENANT_ID), null, 1, 1);
            DocumentResource docResource = new DocumentResource(apiContext);
            try {
                docResource.deleteDocument(MOZU_DOCUMENT_LIST_NAME, docId);
            } catch (Exception e) {
                logger.info ("Unable to delete document in cleanup with docId: " + docId);
            }
        }
    }
    
    @Test
    public void uploadAndGetDocumentTest () throws Exception {
        docId=null;
        authenticateUser(AuthenticationScope.Tenant, configProps.getString(TENANT_USERNAME));
        ApiContext apiContext = new MozuApiContext(configProps.getInt(TENANT_ID), null, 1, 1);

        URL fileUrl = MozuClientTest.class.getResource(UPLOAD_FILE_NAME);
        File file = new File(fileUrl.getFile());
        Long length = Long.valueOf(0);
        if (file.exists()) {
            length = Long.valueOf(file.length());
            logger.info("Content length is "+length);
        }

        DocumentResource docResource = new DocumentResource(apiContext);
        Document doc = new Document();
        String fileName = file.getName();
        doc.setContentMimeType(CONTENT_TYPE);
        doc.setExtension("png");
        doc.setName(fileName);
        doc.setDocumentTypeFQN(MOZU_DOCUMENT_TYPE_FQN);

        Document newDoc = docResource.createDocument(doc, MOZU_DOCUMENT_LIST_NAME);
        docId = newDoc.getId();

        FileInputStream inputStream = new FileInputStream(file);
        logger.info("Channel Size: " + inputStream.getChannel().size());
        docResource.updateDocumentContent(inputStream, MOZU_DOCUMENT_LIST_NAME, docId,
                CONTENT_TYPE);

        Document docResponse = docResource.getDocument(MOZU_DOCUMENT_LIST_NAME, docId);
        System.out.println("Extension: " + docResponse.getExtension());
        assertNotNull(docResponse);
        assertEquals(length, docResponse.getContentLength());
        InputStream getInputStream = docResource.getDocumentContent(MOZU_DOCUMENT_LIST_NAME, docId);

        assertNotNull(getInputStream);
        
    }
    
}
