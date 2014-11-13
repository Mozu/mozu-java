package com.mozu.base.handlers;


import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

import com.mozu.api.security.AppAuthenticator;

@Component
/**
 * This class is used to encrypt and decrypt sensitive data in data stores used by mozu applications. 
 * @author bob_hewett
 *
 */
public class EncryptDecryptHandler {
	
    /**
     * Encrypts value.  
     * @param value the value to encrypt
     * @return an encrypted String
     */
	public String encrypt( String value)  {
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret());
		
		return textEncryptor.encrypt(value);
	}
	
	/**
	 * Encrypts the value by using 'key' as salt value for the password.
	 * @param key salt value used to encrypt the value
	 * @param value the string to encrypt
	 * @return an encrypted string.
	 */
	public String encrypt(String key, String value)  {
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret()+key);
		
		return textEncryptor.encrypt(value);
	}
	
	/**
	 * Decrypts the give string  
	 * @param encryptedStr an encrypted string to decrypt.
	 * @return the decrypted 
	 */
	public String decrypt( String encryptedStr)  {
	
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret());
		
		return textEncryptor.decrypt(encryptedStr);
	}
	
	/**
	 * Decrypt the encrypted string with the salt key that was used to encrypt it.  
	 * @param key the salt to add to encryption password.
	 * @param encryptedStr the string to decrypt
	 * @return a string in clear text.
	 */
	public String decrypt(String key, String encryptedStr)  {
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(AppAuthenticator.getInstance().getAppAuthInfo().getSharedSecret()+key);
		
		return textEncryptor.decrypt(encryptedStr);
	}
	
}
