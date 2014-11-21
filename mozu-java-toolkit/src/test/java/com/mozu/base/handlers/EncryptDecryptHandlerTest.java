package com.mozu.base.handlers;

import static org.junit.Assert.*;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.security.AppAuthenticator;

public class EncryptDecryptHandlerTest {

    private static final String TEST_STRING = "Test String";
    private static final Object SHARED_SECRET = "f6bb572fb46449f2a004a37301466a0b";
    private static final String TEST_KEY = "Test Key";
    
    @Mocked AppAuthenticator mockAppAuthenticator;
    @Mocked AppAuthInfo mockAppAuthInfo;
    

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void encryptDecryptTest() {
        
        new Expectations() {
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
        };
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        String encryptedString = handler.encrypt(TEST_STRING);
        
        String decryptedString = handler.decrypt(encryptedString);
        
        assertEquals(TEST_STRING, decryptedString);
    }

    @Test
    public void encryptNoSecretTest() {
        
        new Expectations() {
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=null;}
        };
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        
        try {
            handler.encrypt(TEST_STRING);
            fail("Illegal argument exception expected");
        } catch (IllegalArgumentException iae) {
            // expected
        }
    }

    @Test
    public void encryptNullStringTest() {
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        
        try {
            handler.encrypt(null);
            fail("Illegal argument exception expected");
        } catch (IllegalArgumentException iae) {
            // expected
        }
    }

    @Test
    public void encryptDecryptWithKeyTest() {
        
        new Expectations() {
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
        };
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        String encryptedString = handler.encrypt(TEST_KEY, TEST_STRING);
        
        String decryptedString = handler.decrypt(TEST_KEY, encryptedString);
        
        assertEquals(TEST_STRING, decryptedString);
    }

    @Test
    public void encryptDecryptWithKeyNoSecretTest() {
        
        new Expectations() {
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=null;}
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=null;}
        };
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        String encryptedString = handler.encrypt(TEST_KEY, TEST_STRING);
        String decryptedString = handler.decrypt(TEST_KEY, encryptedString);
            
        assertEquals(TEST_STRING, decryptedString);
    }

    @Test
    public void encryptDecryptKeyNullStringTest() {
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();

        try {
            String encryptedString = handler.encrypt(TEST_KEY, null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException iae) {
            // expected
        }
    }

    @Test
    public void encryptDecryptKeyNullKeyTest() {
        
        new Expectations() {
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
            {AppAuthenticator.getInstance(); result=mockAppAuthenticator;}
            {mockAppAuthenticator.getAppAuthInfo(); result=mockAppAuthInfo;}
            {mockAppAuthInfo.getSharedSecret(); result=SHARED_SECRET;}
        };
        
        EncryptDecryptHandler handler = new EncryptDecryptHandler();
        
        String encryptedString = handler.encrypt(null, TEST_STRING);
        String decryptedString = handler.decrypt(null, encryptedString);
        
        assertEquals(TEST_STRING, decryptedString);
    }
}
