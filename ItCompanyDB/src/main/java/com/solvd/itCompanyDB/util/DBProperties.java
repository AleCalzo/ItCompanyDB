package com.solvd.itCompanyDB.util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

  public class DBProperties {

    private final static Logger LOG = LogManager.getLogger(DBProperties.class);

    private static Properties properties = new Properties();
    private static DBProperties dbPropertiesUtil = new DBProperties();


    private DBProperties() {
        try {
            properties.load(new FileReader("src/main/resources/db.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getString(String key) {
        return properties.getProperty(key);
    }


    public static int getInt(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }


}


