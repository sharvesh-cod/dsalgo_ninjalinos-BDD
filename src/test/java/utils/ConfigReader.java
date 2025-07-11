package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties initProp() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties"); // Use relative path
																									// if possible
		prop.load(fis);
		return prop;
	}

}