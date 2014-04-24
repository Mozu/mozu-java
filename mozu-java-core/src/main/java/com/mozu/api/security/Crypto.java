package com.mozu.api.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.ApiContext;
import com.mozu.api.MozuApiContext;

public class Crypto {
    private static final Logger logger = LoggerFactory.getLogger(Crypto.class);
    private static final String ENCODER_ALGORITHM = "SHA-256";
    private static final String CHARSET = "UTF-8";
    private static final String CONFIG_PROPERTIES_FILENAME = "security.properties";
    private static final int DEFAULT_REQUEST_TIMEOUT = 180;
    private static final String REQUEST_VALID_TIME = "request_valid_time";
    
    private static PropertiesConfiguration configuration = null;
            
    public static String getHash(String secretKey, String date, String body) {
        String hash = null;
        try {
            MessageDigest digest = MessageDigest.getInstance(ENCODER_ALGORITHM);
            String doubleSecretKey = secretKey.concat(secretKey);
            String hashedSecret = Base64.encodeBase64String(digest.digest(doubleSecretKey.getBytes(CHARSET)));
            
            String payload = hashedSecret.concat(date).concat(body);
            hash = Base64.encodeBase64String(digest.digest(payload.getBytes(CHARSET)));
        } catch (NoSuchAlgorithmException nae) {
            logger.error("Bad encoding algorithm " + ENCODER_ALGORITHM + ": " + nae.getMessage() );
        } catch (UnsupportedEncodingException uee) {
            logger.error("Unsupported character set: " + CHARSET + ": " + uee.getMessage() );
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
            StringBuilder msg = new StringBuilder ("Order is not authorized.");
            logger.warn(msg.toString());
        }
        
        // Check if date has expired
        int requestValidTimeSeconds = DEFAULT_REQUEST_TIMEOUT;
        if (configuration==null) {
            try {
                configuration = new PropertiesConfiguration(CONFIG_PROPERTIES_FILENAME);
                requestValidTimeSeconds = configuration.getInt(REQUEST_VALID_TIME);
            } catch (ConfigurationException e) {
                logger.warn("Security properties not found, using default request timeout");
            }
        }
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
