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

//	public String browserName() {
//
//		String browser = prop.getProperty("browser");
//		return browser;
//
//	}
//
//	public String testUrl() {
//
//		String testurl = prop.getProperty("testurl");
//		return testurl;
//
//	}
//
//	public String userName() {
//
//		String username = prop.getProperty("username");
//		return username;
//
//	}
//
//	public String pwd() {
//
//		String password = prop.getProperty("password");
//		return password;
//
//	}

}