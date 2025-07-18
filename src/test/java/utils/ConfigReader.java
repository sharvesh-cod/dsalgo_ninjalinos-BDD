package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

	static {
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not load config.properties");
		}
	}

	public static String get(String key) {
		return prop.getProperty(key);
	}
}

//VIDHYA'S CODE (ORIGINAL)
//package utils;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//	private Properties prop;
//
//	public Properties initProp() throws IOException {
//		prop = new Properties();
//		FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
//		// if possible
//		prop.load(fis);
//		return prop;
//	}
//
//}
