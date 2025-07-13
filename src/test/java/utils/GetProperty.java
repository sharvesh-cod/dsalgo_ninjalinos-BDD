package utils;

import java.io.IOException;
import java.util.Properties;

public class GetProperty {

	Properties prop;

	public GetProperty(ConfigReader configreader) throws IOException {
		this.prop = configreader.getProperties();

	}

	public String browserName() {

		String browser = prop.getProperty("browser");
		return browser;

	}

	public String testUrl() {

		String testurl = prop.getProperty("testurl");
		return testurl;

	}

	public String userName() {

		String username = prop.getProperty("username");
		return username;

	}

	public String pwd() {

		String password = prop.getProperty("password");
		return password;

	}

}
