package com.mozu.test.framework.core;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Environment {
	public static String CONFIG_PROPERTIES_FILENAME = "mozu_config.properties";
	static Logger LOGGER = LoggerFactory.getLogger(Environment.class);
	
	private static PropertiesConfiguration configProps = null;
	
    public enum Environments
	{
    	Dev,
	    CI,
	    QA,
	    Prod,
	    SI,
	    Demo
	}

    public enum ScaleUnitId
    {
        None,
        HP1,
        TP1,
        TP2,
        SB,
        PC1,
        PCI,
        Su1
    }
    
	/**
	 * Loads a properties file from the following order:
	 *  - current directory
	 *  - user.home directory
	 *  - class path
	 * @return
	 */
	static protected PropertiesConfiguration getProperties() throws ConfigurationException {
		if (configProps == null) {
			configProps = new PropertiesConfiguration(CONFIG_PROPERTIES_FILENAME);
		}
		return configProps;
	}
    
	static public Environments getConfigEnvironment()
    {
	    String envir = null;
	    try { 
	        envir = Environment.getProperties().getString("Environment");
	    } catch (ConfigurationException ce) {
	        LOGGER.error("Unable to get 'Environment' property from file, " + CONFIG_PROPERTIES_FILENAME);
	        return null;
	    }
	    
        if (StringUtils.isBlank(envir))
        {
            envir = "SI";
        }
        
        if (envir.toUpperCase().equals("CI"))
        	return Environments.CI;
        else if(envir.toUpperCase().equals("SI"))
        	return Environments.SI;
        else if(envir.toUpperCase().equals("QA"))
        	return Environments.QA;
        else if(envir.toUpperCase().equals("PROD"))
        	return Environments.Prod;
        else
        	return Environments.SI;
    }
	
    public static String getConfigValue(String keyPart)
    {
        Environments environment = getConfigEnvironment();
        String property = keyPart + "_" + environment.toString();
        try
        {
            return configProps.getString(property);
        }
        catch (Exception e)
        {
            LOGGER.error("Unable to get property  " + property + " due to error: " + e.getMessage() );
            return null;
        }

    }
}
