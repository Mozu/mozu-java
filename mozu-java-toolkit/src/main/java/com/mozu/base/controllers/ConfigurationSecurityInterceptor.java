package com.mozu.base.controllers;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ConfigurationSecurityInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationSecurityInterceptor.class);

    @Value("${SharedSecret}")
    String sharedSecret;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        logger.debug("Security interceptor for URI: " + request.getRequestURI());
        String securityToken = null;
        boolean isValid = false;

        Cookie[] cookies = request.getCookies();
        for (int i=0;i<cookies.length;i++) {
            if (cookies[i].getName().equals(AdminControllerHelper.SECURITY_COOKIE)) {
                securityToken = cookies[i].getValue();
                try {
                    String decryptedValue = decrypt(securityToken, sharedSecret);
                    DateTime dt = new DateTime(decryptedValue);
                    
                    // Validate date
                    if (dt.isAfter(DateTime.now().minusDays(1))) {
                        isValid=true;
                    }
                    break;
                } catch (Exception e) {
                    logger.error("Decryption exception: " + e.getMessage());
                    break;
                }
            }
        }
        
        if (!isValid) {
            String msg = "Security exception, unauthorized request"; 
            logger.warn(msg);
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }

        return isValid;
    }
    
    public static String encrypt(String data, String sharedSecret) throws Exception {
        int keyLength = Cipher.getMaxAllowedKeyLength("Blowfish")/8;
        
        String keyString = sharedSecret.substring(sharedSecret.length()-keyLength);
        
        SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.encodeBase64String(encrypted);
    }

    protected static String decrypt(String encryptedString, String sharedSecret) throws Exception {
        int keyLength = Cipher.getMaxAllowedKeyLength("Blowfish")/8;
        
        String keyString = sharedSecret.substring(sharedSecret.length()-keyLength);
        
        SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] encrypted = Base64.decodeBase64(encryptedString.getBytes());
        byte[] decrypted = cipher.doFinal(encrypted);
        return new String(decrypted);
    }

}
