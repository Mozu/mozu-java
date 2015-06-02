package com.mozu.test.framework.helper;

import java.util.Random;

import com.mozu.api.contracts.core.Phone;
import com.mozu.api.contracts.location.Coordinates;

public class Generator {
	
    public static final String AlphaChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static final String NumericChars = "0123456789";

    public static final String AlphaNumericChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static final String AllValidChars =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789,./?;:'*&^%$#@!~` ";

    private static Random rand = new Random(); 
    
    public static String randomString(int maxLength, String characterSet)
    {
        char[] buffer = new char[maxLength];

        for (int i = 0; i < maxLength; i++)
        {
            buffer[i] = characterSet.toCharArray()[rand.nextInt(characterSet.length())];
        }

        return new String(buffer);
    }

    public static String randomIp()
    {
    	return(randomInt(10, 100).toString() + "." + randomInt(10, 100).toString() + "." + randomInt(10, 100).toString() + "." + randomInt(10, 100).toString());
    }

    public static Double randomDecimal(Double min, Double max)
    {
    	return rand.nextDouble() * (max - min) + min;
    }
    
    public static Integer randomInt(Integer min, Integer max)
    {
    	return rand.nextInt(max-min) + min;
    }

    public static String randomURL()
    {
        return "www." + randomString(4, AlphaChars) + ".com";
    }

    public static String randomEmailAddress()
    {
        return String.format("%s@%s.%s", randomString(7, AlphaChars), randomString(10, AlphaChars), "com");
    }

    public static Phone randomPhone()
    {
        Phone ph = new Phone();
        ph.setHome(String.format("%s-%s-%s", Generator.randomString(3, NumericChars),
                             Generator.randomString(3, NumericChars),
                             Generator.randomString(4, NumericChars)));
        ph.setMobile(String.format("%s-%s-%s", Generator.randomString(3, NumericChars),
                Generator.randomString(3, NumericChars),
                Generator.randomString(4, NumericChars)));
        ph.setWork(String.format("%s-%s-%s", Generator.randomString(3, NumericChars),
                             Generator.randomString(3, NumericChars),
                             Generator.randomString(4, NumericChars)));
        return ph;
     }
    
     public static String randomPhoneNumber()
     {
    	 return String.format("%s-%s-%s", Generator.randomString(3, NumericChars),
                 Generator.randomString(3, NumericChars),
                 Generator.randomString(4, NumericChars));
     }
     
     public static Coordinates randomGeo()
     {
    	 Coordinates co = new Coordinates();
    	 co.setLat(randomDecimal(0., 300.));
    	 co.setLng(randomDecimal(0., 300.));
    	 return co;
     }
    
}
