package hooks;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DsAlgoHooks {

	WebDriver driver;

	@Before("@H1 or @A1 or @A2")
	public void setUp() {
		driver = DriverFactory.initDriver();
//		driver.get("https://dsportalapp.herokuapp.com/");

	}

	@After("@H1 or @A1 or @A2")
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}