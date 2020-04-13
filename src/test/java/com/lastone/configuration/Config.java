package com.lastone.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static String getValue(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }
}
