package com.mozu.apptest;


import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

import com.mozu.api.security.AppAuthenticator;

@Configurable
public class MozuServletListener implements ServletContextListener  {
    private static final Logger logger = LoggerFactory.getLogger(MozuServletListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        // do nothing
    }

    public void contextDestroyed(ServletContextEvent sce) {
        AppAuthenticator.invalidateAuth();
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            try {
                logger.debug("Deregister driver: " + driver.getClass().getName());
                DriverManager.deregisterDriver(driver);
            } catch (SQLException e) {
                logger.warn("Error deregistering driver: " + e.getMessage());
            }
        }
    }
}
