package com.website.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * reads the properties file test.properties
 */
public class ConfigurationReader {

    private static Properties properties;

    public static final String BROWSER;
    public static final String URL;
    public static final String USERNAME;
    public static final String PASSWORD;
    public static final String EXPECTED_PORTFOLIO_VALUE;

    static {

        try {
            String path = "test.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

        BROWSER = properties.getProperty("browser");
        URL = properties.getProperty("url");
        USERNAME = properties.getProperty("username");
        PASSWORD = properties.getProperty("password");
        EXPECTED_PORTFOLIO_VALUE = properties.getProperty("expected_portfolio_value");
    }


    public static String getProperty(String keyName) {
        return properties.getProperty(keyName);
    }

}
