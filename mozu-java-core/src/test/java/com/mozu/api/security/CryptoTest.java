package com.mozu.api.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.logger.MozuLogger;

public class CryptoTest {
	private static final String TEST_SHARED_SECRET = "1152aeac1a9f4e1998bfab9b5e3bab76";
	
	@Mocked AppAuthenticator mockAppAuthenticator;
	
	@BeforeClass
    public static void registerHandler() {
        new MockUp<MozuLogger>() {

			@Mock
			public void info(String msg) {
				return;
			}
			
			@Mock
			public void warn(String msg) {
				return;
			}
			
			@Mock
			public void debug(String msg) {
				return;
			}
			
			@SuppressWarnings("rawtypes")
			@Mock
			private void initLogger(Class cls) {
				return;
			};
		};
    }
	
    @Test
    public void testCryptoHash () throws Exception {
        String body = "x-vol-tenant-domain=t419.sandbox.mozu-qa.com&x-vol-return-url=https://t419.sandbox.mozu-qa.com/Admin/s-1223/capability/edit/7d7fadf25e9f454eb6cc87df888395ea/#configure";
        String secretKey = "b2dc973d5dec4bd6aa325fa906a64aee";
        String dateString = "Mon, 18 Aug 2014 21:07:21 GMT";
        // Test that values going through the crypto work...
        String hash1 = Crypto.getHash(secretKey, dateString, body);
        String hash2 = Crypto.getHash(secretKey, dateString, body);
        
        assertEquals(hash1, hash2);
    
        assertEquals("yJ+gMQm3FZzKfgySi+1jGYcUcSADVjr3x19BwKyFj9w=", hash1);
    }
    
    @Mocked AppAuthInfo mockAppAuthInfo;

    @Test
    public void validRequestTest() {
        
        new Expectations() {
            {
                AppAuthenticator.initialize(mockAppAuthInfo);
                AppAuthenticator.getInstance(); returns(mockAppAuthenticator);
                mockAppAuthenticator.getAppAuthInfo(); returns(mockAppAuthInfo);
            }
            { mockAppAuthInfo.getSharedSecret(); returns(TEST_SHARED_SECRET); }
        }; 
        
        String body = "This is a test of the crypto validation";
        AppAuthenticator.initialize(mockAppAuthInfo);
        
        ApiContext apiContext = new MozuApiContext();

        DateTime dTime = new DateTime();
        
        DateTimeFormatter dtf = DateTimeFormat.forPattern("E, dd MMM yyyy HH:mm:ss zzz");
        String dateString = dtf.print(dTime);

        apiContext.setHeaderDate(dateString);
        String hmacSha256 = Crypto.getHash(TEST_SHARED_SECRET, dateString, body);
        apiContext.setHmacSha256(hmacSha256);
        
        assertTrue(Crypto.isRequestValid(apiContext, body));
        
    }
    
    @Test
    public void oldRequestTest() {
        new Expectations() {
            {
                AppAuthenticator.initialize(mockAppAuthInfo);
                AppAuthenticator.getInstance(); returns(mockAppAuthenticator);
                mockAppAuthenticator.getAppAuthInfo(); returns(mockAppAuthInfo);
            }
            { mockAppAuthInfo.getSharedSecret(); returns(TEST_SHARED_SECRET); }
        }; 
        
        String body = "This is a test of the crypto validation";
        AppAuthenticator.initialize(mockAppAuthInfo);
        
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
