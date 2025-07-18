package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	FileInputStream fis;

	public ConfigReader() throws IOException {
		prop = new Properties();
		this.fis = new FileInputStream("src/test/resources/config/config.properties"); // Use relative path
																						// if possible
		prop.load(fis);

	}

	public String get_prop_value(String key) {
		String prop_value = prop.getProperty(key);
		return prop_value;
	}
}

//******************MY ORIGINAL CODE******************************
//package utils;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//
//	private static Properties prop;
//
//	static {
//		try {
//			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
//			prop = new Properties();
//			prop.load(fis);
//		} catch (IOException e) {
//			e.printStackTrace();
//			throw new RuntimeException("Could not load config.properties");
//		}
//	}
//
//	public static String get(String key) {
//		return prop.getProperty(key);
//	}
//}
