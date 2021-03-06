package com.mozu.api.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;
import com.mozu.api.MozuConfig;

public class Crypto {
    private static final Logger logger = LoggerFactory.getLogger(Crypto.class);
    
    public static String getHash(String secretKey, String date, String body) {
        String hash = null;
        try {
        	logger.info("Shared secret: {}, date: {}, body: {}", secretKey, date, body);
            MessageDigest digest = MessageDigest.getInstance(MozuConfig.getEncodeAlgorithm());
            String doubleSecretKey = secretKey.concat(secretKey);
            String hashedSecret = Base64.encodeBase64String(digest.digest(doubleSecretKey.getBytes(MozuConfig.getCharSet())));
            
            String payload = hashedSecret.concat(date).concat(body);
            hash = Base64.encodeBase64String(digest.digest(payload.getBytes(MozuConfig.getCharSet())));
            logger.info("Generated hash: {}", hash);
        } catch (NoSuchAlgorithmException nae) {
            logger.error("Bad encoding algorithm " + MozuConfig.getEncodeAlgorithm() + ": " + nae.getMessage() );
        } catch (UnsupportedEncodingException uee) {
            logger.error("Unsupported character set: " + MozuConfig.getCharSet() + ": " + uee.getMessage() );
        }
        return hash;
    }

    public static boolean isRequestValid(Map<String, String> reqHeaders, String body) {
        ApiContext apiContext = new MozuApiContext(reqHeaders);
        return isRequestValid(apiContext, body);
    }
    
    public static boolean isRequestValid(HttpServletRequest request, String body) {
        ApiContext apiContext = new MozuApiContext(request);
        return isRequestValid(apiContext, body);
    }

    public static final boolean isRequestValid(ApiContext apiContext, String body) {
    	logger.info("Validating request...");
    	
    	String generatedHash = Crypto.getHash(AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret(),
				apiContext.getHeaderDate(), body);
    	String requestHash = apiContext.getHMACSha256();
    	boolean isValid = generatedHash.equals(requestHash);
    	
    	logger.info("Generated Hash: {}", generatedHash);
    	logger.info("Request Hash: {}", requestHash);
    	logger.info("Request hash {} calculated hash", isValid ? "matches" : "does not match"); 
    	
    	if (isValid) {
    		logger.info("Checking for request timeout..");
            
    		int requestValidTimeSeconds = MozuConfig.getDefaultEventRequestTimeout();
            logger.info("Request timeout configured to {} seconds", requestValidTimeSeconds);
            
            String dateString = apiContext.getHeaderDate();
            DateTimeFormatter dtf = DateTimeFormat.forPattern("E, dd MMM yyyy HH:mm:ss zzz");
            DateTime requestDttm = dtf.parseDateTime(dateString);
            
            logger.info("Current system date is {}", DateTime.now(DateTimeZone.UTC));
            logger.info("Date in request header is {}", requestDttm);
            
            long deltaTime = (DateTime.now().getMillis() - requestDttm.getMillis())/1000;
            if (deltaTime > requestValidTimeSeconds) {
                logger.info("{} seconds is greater than configured time-out value", deltaTime);
                logger.info("Request timed out");
                isValid = false;
            }
    	}
    	
    	logger.info("Is request valid: {}", isValid);
        return isValid;
    }
}
