package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static {// static block works before everything

        String filePath= "configuration.properties";
        try {

            FileInputStream fis= new FileInputStream(filePath);
            properties= new Properties();
            properties.load(fis);


        } catch (IOException e) {
            System.out.println("properties act could not read");
        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key);

    }


}

