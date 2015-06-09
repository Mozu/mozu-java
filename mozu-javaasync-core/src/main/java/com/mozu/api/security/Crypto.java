package com.mozu.api.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.joda.time.DateTime;
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
            MessageDigest digest = MessageDigest.getInstance(MozuConfig.getEncodeAlgorithm());
            String doubleSecretKey = secretKey.concat(secretKey);
            String hashedSecret = Base64.encodeBase64String(digest.digest(doubleSecretKey.getBytes(MozuConfig.getCharSet())));
            
            String payload = hashedSecret.concat(date).concat(body);
            hash = Base64.encodeBase64String(digest.digest(payload.getBytes(MozuConfig.getCharSet())));
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
        boolean isValid = false;
        if (Crypto.getHash(
                AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret(),
                apiContext.getHeaderDate(),
                body).equals(apiContext.getHMACSha256())) {
            isValid = true;
        } else {
            StringBuilder msg = new StringBuilder ("Request is not authorized.");
            logger.warn(msg.toString());
        }
        
        // Check if date has expired
        int requestValidTimeSeconds = MozuConfig.getDefaultEventRequestTimeout();

        String dateString = apiContext.getHeaderDate();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("E, dd MMM yyyy HH:mm:ss zzz");
        DateTime dTime = dtf.parseDateTime(dateString);

        long deltaTime = (DateTime.now().getMillis() - dTime.getMillis())/1000;
        if (deltaTime > requestValidTimeSeconds) {
            isValid = false;
        }
        return isValid;
    }
}
