package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static String getProperty(String key) {
        Properties prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e);

        }

        return prop.getProperty(key);
    }


}
