package hooks;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class DsAlgoHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;

	@Before
	public void setUp() {
		String browserName = ConfigReader.get("browser"); // Direct static access
		driverFactory = new DriverFactory();
		driver = driverFactory.initDriver(browserName);
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}

//VIDHYA 'S CODE ORIGINAL

//package hooks;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//
//import driverManager.DriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import utils.ConfigReader;
//
//public class DsAlgoHooks {
//
//	private DriverFactory driverFactory;
//	private WebDriver driver;
//	private ConfigReader configreader;
//	Properties prop;
//
//	// WebDriver driver;
//
//	@Before(order = 0)
//	public void getProperty() throws IOException {
//
//		configreader = new ConfigReader();
//		prop = configreader.initProp();
//
//	}
//
//	@Before(order = 1)
//
//	public void setUp() {
//
////		String browser = configreader.get("browser"); // fetch from config.properties
////		driverFactory = DriverFactory.initDriver(browser);
//////		driver.get("https://dsportalapp.herokuapp.com/");
/////
//		String browserName = prop.getProperty("browser");
//		driverFactory = new DriverFactory();
//		driver = driverFactory.initDriver(browserName);
//
//	}
//
//	@After()
//	public void tearDown() {
//		DriverFactory.quitDriver();
//	}
//}

//@A1 or @A2 or @A3 or @A4 or @A5 or @A6 or @A7 or @A8 or @A9 or @A10 or @A11 or @A12 or @A13 or @A14 or @A15 or @A16 or @A17 or @A18 or @A19 or @A20 or @A21"
