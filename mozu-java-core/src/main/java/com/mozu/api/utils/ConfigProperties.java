package com.mozu.api.utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConversionException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Loads the configuration properties file, mozu_config.properties, into memory for use by the application
 * @author bob_hewett
 *
 */
public class ConfigProperties {
	protected final static String CONFIG_PROPERTIES_FILENAME = "mozu_config.properties";
	protected static PropertiesConfiguration configProps = null;
	
	// the following are defined properties for the SDK
	public final static String MOZU_BASE_URL = "base.url";
	public final static String SHARED_SECRET = "shared.secret";
	public final static String APP_ID = "app.id";
	public final static String PROXY_HOST = "proxy.host";
	public final static String PROXY_PORT = "proxy.port";
	public final static String REFRESH_INTERVAL = "auth.refresh.interval";

	/**
	 * Loads a properties file from the following order:
	 *  - current directory
	 *  - user.home directory
	 *  - class path
	 * @return
	 */
	static protected PropertiesConfiguration loadProperties() throws ConfigurationException {
		PropertiesConfiguration configProps = null;
		configProps = new PropertiesConfiguration(CONFIG_PROPERTIES_FILENAME);
		return configProps;
	}

	static public String getStringProperty (String key) {
		try {
			if (configProps == null) {
				configProps = loadProperties();
			}
			return configProps.getString(key);
	    } catch (ConfigurationException ce) {
	    	ce.printStackTrace();
	    	return null;
	    }
	}

	static public int getIntProperty (String key) {
        try {
			if (configProps == null) {
				configProps = loadProperties();
			}
			return configProps.getInt(key);
        } catch (ConfigurationException ce) {
	    	ce.printStackTrace();
        	return -1;
        } catch (ConversionException cve) {
        	cve.printStackTrace();
        	return -1;
        }
	}
        
}
