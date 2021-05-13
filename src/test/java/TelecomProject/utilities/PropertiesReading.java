package TelecomProject.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {

    private static Properties properties = new Properties();

    static {
        String pathForProperties = "configuration.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathForProperties);
            properties.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found! Current file is = " + pathForProperties);
        }
    }

    public static String getProperties(String keyWord) {
        return properties.getProperty(keyWord);
    }
}
