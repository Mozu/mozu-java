package com.mozu.api.security;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import mockit.Expectations;
import mockit.Mocked;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.appdev.AppAuthInfo;

public class CryptoTest {
	private static final String TEST_SHARED_SECRET = "bc0aa4944cc74341b59ba2fc01666571";
	
    @Test
    public void testCryptoHash () {
        String body = "This is the body...blah, blah, blah";
        String secretKey = "b832b3a6127741be8dd4a26c010941b1";
        String dateString = "Mon, 17 Feb 2014 21:18:57 GMT";
        // Test that values going through the crypto work...
        String hash1 = Crypto.getHash(secretKey, dateString, body);
        String hash2 = Crypto.getHash(secretKey, dateString, body);
        
        assertEquals(hash1, hash2);
    
        assertEquals("57mAocXhERgKyC32XJgkYvBJJ6IDzt1b0QxWkfxfMJY=", hash1);
    }
    
    @Mocked AppAuthInfo mockAppAuthInfo;

    @Test
    public void validRequestTest() {
        
        new Expectations() {
            AppAuthenticator appAuth;
            {
                AppAuthenticator.initialize();
                AppAuthenticator.getInstance(); returns(appAuth);
                appAuth.getAppAuthInfo(); returns(mockAppAuthInfo);
            }
            { mockAppAuthInfo.getSharedSecret(); returns(TEST_SHARED_SECRET); }
        }; 
        
        String body = "This is a test of the crypto validation";
        AppAuthenticator.initialize();
        
        ApiContext apiContext = new MozuApiContext();

        DateTime dTime = new DateTime();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("E, dd MMM yyyy HH:mm:ss zzz");
        
        String dateString = dtf.print(dTime);
        System.out.println(dateString);

        apiContext.setHeaderDate(dateString);
        String hmacSha256 = Crypto.getHash(TEST_SHARED_SECRET, dateString, body);
        apiContext.setHmacSha256(hmacSha256);
        
        assertTrue(Crypto.isRequestValid(apiContext, body));
        
    }
    
    @Test
    public void oldRequestTest() {
        new Expectations() {
            AppAuthenticator appAuth;
            {
                AppAuthenticator.initialize();
                AppAuthenticator.getInstance(); returns(appAuth);
                appAuth.getAppAuthInfo(); returns(mockAppAuthInfo);
            }
            { mockAppAuthInfo.getSharedSecret(); returns(TEST_SHARED_SECRET); }
        }; 
        
        String body = "This is a test of the crypto validation";
        AppAuthenticator.initialize();
        
        ApiContext apiContext = new MozuApiContext();

        SimpleDateFormat sdf  = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss zzz");
        long cur = new Date().getTime();
        cur = cur - (181*1000);
        String dateString = sdf.format(new Date(cur));

        apiContext.setHeaderDate(dateString);
        String hmacSha256 = Crypto.getHash(TEST_SHARED_SECRET, dateString, body);
        apiContext.setHmacSha256(hmacSha256);
        
        assertFalse(Crypto.isRequestValid(apiContext, body));
        
    }
}
